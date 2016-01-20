package ck2xtext.tests.conversion;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.junit.Test;

import ck2xtext.conversion.DateValueConverter;

public class DateValueConverterTest {

	IValueConverter<Date> converter = new DateValueConverter();

	@Test
	public void valid() {
		Date date = converter.toValue("1066.1.10", null);

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		assertEquals(1066, calendar.get(Calendar.YEAR));
		// assertEquals(1, calendar.get(Calendar.MONTH)); FIXME
		assertEquals(10, calendar.get(Calendar.DAY_OF_MONTH));
	}

	@Test(expected = ValueConverterException.class)
	public void invalid() {
		converter.toValue("1066.1", null);
	}
}
