package ck2xtext.common.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class HexadecimalValueConverter implements IValueConverter<Integer> {

	@Override
	public Integer toValue(String string, INode node) throws ValueConverterException {
		return Integer.parseInt(string.substring(2), 16);
	}

	@Override
	public String toString(Integer value) throws ValueConverterException {
		return "0x" + Integer.toString(value, 16);
	}

}
