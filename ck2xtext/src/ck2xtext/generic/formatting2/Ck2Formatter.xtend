package ck2xtext.generic.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

import ck2xtext.generic.ck2.Property;
import ck2xtext.generic.ck2.Clause


/**
 * Example: see DomainmodelFormatter.xtend on https://github.com/eclipse/xtext/blob/master/examples/org.eclipse.xtext.xtext.ui.examples
 * See {@link http://fr.slideshare.net/meysholdt/xtexts-new-formatter-api}
 */
public class Ck2Formatter extends AbstractFormatter2 {
	
	def dispatch format(Property property, extension IFormattableDocument document) {
		/*property.regionFor().keywordPairs("{", "}").forEach[
			interior[
				indent
				setNewLines(0,1,2);
				format
			]
		];*/
		
		property.regionFor.keyword("=").surround[oneSpace];
	}
	
	def dispatch format(Clause clause, extension IFormattableDocument document) {
		clause.prepend[noSpace;setNewLines(0, 1, 2)];
		clause.append[noSpace;setNewLines(0, 0, 2)];
		clause.interior[indent];
		val int size = clause.getProperties().size;
		for (Property property : clause.getProperties()) {
			if(size > 1){
				property.surround[noSpace;setNewLines(0, 1, 2)]
			}
			property.format;
		}
	}
}
