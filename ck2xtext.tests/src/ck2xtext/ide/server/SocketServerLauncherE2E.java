package ck2xtext.ide.server;

import java.io.IOException;

import org.junit.jupiter.api.Test;

/**
 * Launches a standalone language server.
 */
public class SocketServerLauncherE2E {

	@Test
	public void launch() throws IOException {
		SocketServerLauncher.createAndStartServer("localhost", 5007);
	}
}
