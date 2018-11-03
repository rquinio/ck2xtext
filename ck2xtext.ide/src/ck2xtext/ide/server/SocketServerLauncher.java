package ck2xtext.ide.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.Channels;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.jsonrpc.MessageConsumer;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.ide.server.ServerLauncher;
import org.eclipse.xtext.ide.server.ServerModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Note: {@link ServerLauncher} doesn't actually listen on a socket, but simply uses input/output stream
 *
 */
public class SocketServerLauncher {

	public static void main(String[] args) throws InterruptedException, IOException {
		Future<?> future = createAndStartServer("localhost", 5007);
		while (!future.isDone()) {
			Thread.sleep(10_000l);
		}
	}

	static Future<?> createAndStartServer(String hostname, int port) throws IOException {
		System.out.println("Starting server on " + hostname + ":" + port);
		Injector injector = Guice.createInjector(new ServerModule());
		LanguageServerImpl languageServer = injector.getInstance(LanguageServerImpl.class);
		Function<MessageConsumer, MessageConsumer> wrapper = consumer -> {
			MessageConsumer result = consumer;
			return result;
		};
		Launcher<LanguageClient> launcher = createSocketLauncher(languageServer, LanguageClient.class,
				new InetSocketAddress(hostname, port), Executors.newCachedThreadPool(), wrapper);
		languageServer.connect(launcher.getRemoteProxy());
		return launcher.startListening();
	}

	static <T> Launcher<T> createSocketLauncher(Object localService, Class<T> remoteInterface,
			SocketAddress socketAddress, ExecutorService executorService, Function<MessageConsumer, MessageConsumer> wrapper)
			throws IOException {
		AsynchronousServerSocketChannel serverSocket = AsynchronousServerSocketChannel.open().bind(socketAddress);
		AsynchronousSocketChannel socketChannel;
		try {
			socketChannel = serverSocket.accept().get();
			return Launcher.createIoLauncher(localService, remoteInterface, Channels.newInputStream(socketChannel),
					Channels.newOutputStream(socketChannel), executorService, wrapper);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
