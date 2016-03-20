package ck2xtext.tests.conversion;

import static org.junit.Assert.*;

import org.eclipse.xtext.conversion.IValueConverter;
import org.junit.Test;

import ck2xtext.conversion.HexadecimalValueConverter;

public class HexadecimalValueConverterTest {

	IValueConverter<Integer> converter = new HexadecimalValueConverter();

	@Test
	public void valid() {
		Integer i = converter.toValue("0xff0000", null);

		assertEquals((int) 16711680, (int) i);
	}

	@Test
	public void generate() {
		Integer i = converter.toValue("0xff0000", null);

		assertEquals("0xff0000", converter.toString(i));
	}

}
