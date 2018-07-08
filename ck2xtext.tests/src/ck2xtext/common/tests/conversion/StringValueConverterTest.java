package ck2xtext.common.tests.conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.xtext.conversion.IValueConverter;
import org.junit.jupiter.api.Test;

import ck2xtext.common.conversion.StringValueConverter;

public class StringValueConverterTest {
	
	private static final String STRING = "string";
	
	IValueConverter<String> converter = new StringValueConverter();

	@Test
	public void quotesShouldBeRemoved() {
		assertEquals(STRING,converter.toValue("\""+ STRING + "\"", null));
	}
	
	@Test
	public void emptyString() {
		assertEquals("",converter.toValue("\"\"", null));
	}
	
	@Test
	public void unchanged() {
		assertEquals(STRING,converter.toValue(STRING, null));
	}
}
