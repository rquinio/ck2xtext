package ck2xtext.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import ck2xtext.services.Ck2GrammarAccess;

/**
 * Light formatter for CK2 files.
 * 
 * See
 * {@linkplain https://github.com/mn-mikke/Model-driven-Pretty-Printer-for-Xtext-Framework/wiki/Standard-Way-of-Code-Formatting-in-Xtext-Framework}
 *
 */
public class Ck2Formatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig config) {
		Ck2GrammarAccess grammar = (Ck2GrammarAccess) getGrammarAccess();

		// TODO Make this configurable
		config.setAutoLinewrap(120);
		config.setWrappedLineIndentation(0);

		// Allow empty lines before or after comments
		config.setLinewrap(0, 1, 2).around(grammar.getSL_COMMENTRule());

		// Indent curly braces blocks
		for (Pair<Keyword, Keyword> pair : grammar.findKeywordPairs("{", "}")) {
			config.setIndentationIncrement().after(pair.getFirst());
			config.setIndentationDecrement().before(pair.getSecond());
			config.setLinewrap(0, 1, 2).after(pair.getFirst());
			config.setLinewrap(0, 1, 2).around(pair.getSecond());
		}

		// Wrap 1 property/line
		config.setLinewrap(0, 1, 2).around(grammar.getPropertyRule());

		// Above rule is not applied on first level - possibly a bug ?
		// Workaround
		// config.setLinewrap(0, 1, 2).before(grammar.getOPEN_CURLYRule());
		// config.setLinewrap(0, 1, 2).around(grammar.getCLOSE_CURLYRule());
		config.setLinewrap(0, 1, 2).after(grammar.getIdPropertyRule());

		// Wrap lists to max of characters per line
		config.setLinewrap(0, 1, 2).around(grammar.getListElemRule());

		// Indent curly brace blocks
		// config.setIndentationIncrement().after(grammar.getOPEN_CURLYRule());
		// config.setIndentationDecrement().before(grammar.getCLOSE_CURLYRule());
	}

}
