package ck2xtext.common.tests.conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.xtext.conversion.IValueConverter;
import org.junit.jupiter.api.Test;

import ck2xtext.common.conversion.HexadecimalValueConverter;

public class HexadecimalValueConverterTest {

	IValueConverter<Integer> converter = new HexadecimalValueConverter();

	@Test
	public void valid() {
		Integer i = converter.toValue("0xff0000", null);

		assertEquals((int) 16711680, (int) i);
	}
	
	@Test
	public void extraDigitsShouldBeIgnored() {
		Integer i = converter.toValue("0xff000000", null);

		assertEquals((int) 16711680, (int) i);
	}

	@Test
	public void generate() {
		Integer i = converter.toValue("0xff0000", null);

		assertEquals("0xff0000", converter.toString(i));
	}

}
