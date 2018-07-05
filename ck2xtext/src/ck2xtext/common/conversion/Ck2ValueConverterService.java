package ck2xtext.common.conversion;

import java.util.Date;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;

import com.google.inject.Singleton;

@Singleton
public class Ck2ValueConverterService extends AbstractDeclarativeValueConverterService {

	@ValueConverter(rule = "BOOL")
	public IValueConverter<Boolean> BOOL() {
		return new BooleanValueConverter();
	}

	@ValueConverter(rule = "Date")
	public IValueConverter<Date> Date() {
		return new DateValueConverter();
	}

	@ValueConverter(rule = "HEX")
	public IValueConverter<Integer> HEX() {
		return new HexadecimalValueConverter();
	}

}
