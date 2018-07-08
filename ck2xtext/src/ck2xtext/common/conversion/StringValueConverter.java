package ck2xtext.common.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class StringValueConverter implements IValueConverter<String> {

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		if(string.length() >= 2 && string.startsWith("\"") && string.endsWith("\"")) {
			return string.substring(1, string.length()-1);
		}
		return string;
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		return "\""+value+"\"";
	}

}
