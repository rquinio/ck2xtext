package ck2xtext.tests.conversion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.junit.jupiter.api.Test;

import ck2xtext.conversion.DateValueConverter;

public class DateValueConverterTest {

	IValueConverter<Date> converter = new DateValueConverter();

	@Test
	public void valid() {
		Date date = converter.toValue("1066.1.10", null);

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		assertEquals(1066, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(10, calendar.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void invalid() {
		assertThrows(ValueConverterException.class, () -> converter.toValue("1066.1", null));
	}

	@Test
	public void months() {
		Date date = converter.toValue("1066.12.1", null);

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		assertEquals(11, calendar.get(Calendar.MONTH));
	}

	@Test
	public void monthsShouldNotUseLeadingZeros() {
		Calendar calendar = new GregorianCalendar(1066, Calendar.JANUARY, 10);

		assertEquals("1066.1.10", converter.toString(calendar.getTime()));
	}

	@Test
	public void daysShouldNotUseLeadingZeros() {
		Calendar calendar = new GregorianCalendar(1066, Calendar.DECEMBER, 1);

		assertEquals("1066.12.1", converter.toString(calendar.getTime()));
	}

	@Test
	public void yearsShouldNotUseLeadingZeros() {
		Calendar calendar = new GregorianCalendar(769, Calendar.DECEMBER, 10);

		assertEquals("769.12.10", converter.toString(calendar.getTime()));
	}

	@Test
	public void yearsCloseToZeroShouldNotUseLeadingZeros() {
		Calendar calendar = new GregorianCalendar(1, Calendar.JANUARY, 20);

		assertEquals("1.1.20", converter.toString(calendar.getTime()));
	}
}
