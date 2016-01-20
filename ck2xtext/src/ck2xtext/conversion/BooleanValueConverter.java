package ck2xtext.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class BooleanValueConverter implements IValueConverter<Boolean> {

	@Override
	public Boolean toValue(String string, INode node) throws ValueConverterException {
		if ("yes".equals(string)) {
			return Boolean.TRUE;
		} else if ("no".equals(string)) {
			return Boolean.FALSE;
		} else {
			throw new ValueConverterException(string, node, null);
		}
	}

	@Override
	public String toString(Boolean value) throws ValueConverterException {
		return value.toString();
	}

}
