package ck2xtext.common.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class BooleanValueConverter implements IValueConverter<Boolean> {

	private static final String NO = "no";

	private static final String YES = "yes";

	@Override
	public Boolean toValue(String string, INode node) throws ValueConverterException {
		if (YES.equals(string)) {
			return Boolean.TRUE;
		} else if (NO.equals(string)) {
			return Boolean.FALSE;
		} else {
			throw new ValueConverterException(string, node, null);
		}
	}

	@Override
	public String toString(Boolean value) throws ValueConverterException {
		if (value) {
			return YES;
		}
		return NO;
	}
}