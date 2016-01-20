package ck2xtext.conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class DateValueConverter implements IValueConverter<Date> {

	@Override
	public Date toValue(String string, INode node) throws ValueConverterException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy.mm.dd");
		try {
			return dateFormat.parse(string);
		} catch (ParseException e) {
			throw new ValueConverterException(string, node, e);
		}
	}

	@Override
	public String toString(Date value) throws ValueConverterException {
		return value.toString();
	}

}
