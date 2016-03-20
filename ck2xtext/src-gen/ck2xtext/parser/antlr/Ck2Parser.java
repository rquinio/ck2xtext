/*
 * generated by Xtext 2.9.2
 */
package ck2xtext.parser.antlr;

import ck2xtext.parser.antlr.internal.InternalCk2Parser;
import ck2xtext.services.Ck2GrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Ck2Parser extends AbstractAntlrParser {

	@Inject
	private Ck2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCk2Parser createParser(XtextTokenStream stream) {
		return new InternalCk2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Ck2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Ck2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
