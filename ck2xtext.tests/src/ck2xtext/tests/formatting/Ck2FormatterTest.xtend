package ck2xtext.tests.formatting;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ResourceHelper;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import ck2xtext.services.Ck2GrammarAccess;
import ck2xtext.tests.Ck2InjectorProvider;
import org.junit.Ignore

@RunWith(XtextRunner)
@InjectWith(Ck2InjectorProvider)
public class Ck2FormatterTest {

	@Inject
	ISerializer serializer;

	@Inject
	ResourceHelper resourceHelper;

	final static SaveOptions FORMAT = SaveOptions.newBuilder().format().getOptions();

	@Test
	def public void propertiesShouldBeOnSeparateIndentedLines() throws Exception {
		val String source = '''
		def = {
			property1 = value1
			property2 = value2
		}''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void badIdentationShouldBeCorrected() throws Exception {
		val String source = '''
		def = {
		 property1 = value1 
		         property2 = value2
		}  ''';
		
		val String expected = '''
		def = {
			property1 = value1
			property2 = value2
		}''';

		assertEquals(expected, format(source));
	}
	
	@Test
	def public void singlePropertiesShouldNotWrap() throws Exception {
		val String source = '''def = { property = value }''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void clauseShouldHaveNestedIndentation() throws Exception {
		val String source = '''
		def = {
			clause1 = {
				clause2 = { }
			}
		}''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void numericListsShouldNotWrap() throws Exception {
		val String source = '''color = { 0.3 0.55 0.8 }''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void idListsShouldNotWrap() throws Exception {
		val String source = '''graphical_cultures = { norsegfx }''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void longListsShouldWrap() throws Exception {
		val String source = '''
		male_names = {
			Yngvi Fjölnir Sveigder VVanlade Visburr Domalde Domarr Dyggve Dag Agne Erik Alrik Alf Hugleik Haki Jorund Aun Ale Alc
			Egil Ottar Onela Áli Östen Anund Ingjald Adils Ingvar Sölve
		}''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void rootElementsShouldAlwaysWrap() throws Exception {
		val String source = '''
		narrative_event = {
			option = {
				name = OK
			}
		}''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void extraSpacesShouldBeRemoved() throws Exception {
		val String source = '''a  =  b''';

		assertEquals("a = b", format(source));
	}
	
	@Test
	def public void numbersPrecisionShouldBeKept() throws Exception {
		val String source = '''
		def = {
			property1 = 250
			property2 = 2.5
		}''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void commentsShouldNotWrap() throws Exception {
		val String source = "def = { } # Some comment";

		assertEquals(source, format(source));
	}
	
	@Test
	def public void namespaceShouldBeWrapped() throws Exception {
		val String source = '''
		namespace = ck2
		
		character_event = {
			id = ck2.1
		}''';

		assertEquals(source, format(source));
	}
	
	@Test
	def public void rootElementsShouldWrap() throws Exception {
		val String source = '''
		def1 = { }
		
		def2 = { }''';

		assertEquals(source, format(source));
	}
	
	@Ignore("FIXME")
	@Test
	def public void emptylinesShouldBeIndented() throws Exception {
		val String source = '''
		def = {
			property1 = value1
			
			property2 = value2
		}''';

		assertEquals(source, format(source));
	}

	def private String format(String source) throws Exception {
		val Resource res = resourceHelper.resource(source);
		return serializer.serialize(res.getContents().get(0), FORMAT);
	}

}
