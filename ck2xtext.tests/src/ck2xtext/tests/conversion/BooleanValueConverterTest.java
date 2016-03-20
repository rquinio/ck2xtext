package ck2xtext.tests.conversion;

import static org.junit.Assert.*;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.junit.Test;

import ck2xtext.conversion.BooleanValueConverter;

/**
 * yes <=> true, no <=> false
 */
public class BooleanValueConverterTest {

	IValueConverter<Boolean> converter = new BooleanValueConverter();

	@Test
	public void yes() {
		assertTrue(converter.toValue("yes", null));
	}

	@Test
	public void no() {
		assertFalse(converter.toValue("no", null));
	}

	@Test(expected = ValueConverterException.class)
	public void invalid() {
		converter.toValue("false", null);
	}

	@Test
	public void trueShouldGenerateYes() {
		assertEquals("yes", converter.toString(Boolean.TRUE));
	}

	@Test
	public void falseSouldGenerateNo() {
		assertEquals("no", converter.toString(Boolean.FALSE));
	}
}
