/*
 * generated by Xtext 2.9.1
 */
package ck2xtext.tests

import static org.junit.Assert.*

import ck2xtext.ck2.Model
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper

import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ResourceHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Ignore
import org.eclipse.emf.ecore.resource.Resource
import ck2xtext.tests.Ck2InjectorProvider

@RunWith(XtextRunner)
@InjectWith(Ck2InjectorProvider)
class Ck2ParsingTest{

	@Inject
	ParseHelper<Model> parseHelper;
	
	@Inject
	ResourceHelper resourceHelper;
	
	@Inject
	ValidationTestHelper validationHelper;
	
	@Test
	def void floatValueShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''scale = 1.0''');
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void floatValueWithSuffixShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''scale = 1.0f''');
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void hexadecimalValueShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''color = 0xff0000''');
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Ignore("FIXME")
	@Test
	def void valueStartingWithZeroShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''properties = 0c0cbd000000''');
		
		validationHelper.assertNoIssues(resource);
	}

	@Ignore
	@Test
	def void test2(){
		val Resource resource = resourceHelper.resource('''
			north_germanic = {
				graphical_cultures = { westerngfx }
				
				norse = {
					graphical_cultures = { norsegfx }
					
					color = { 0 0 0 }
					
					male_names = { ä â }
					female_names = { ä â }
					
					dukes_called_kings = yes
					
					seafarer = yes
				}
			}
		''');
		
		validationHelper.assertNoIssues(resource);
	}

	@Ignore
	@Test 
	def void loadModel() {
		val Model result = parseHelper.parse('''
			north_germanic = {
				graphical_cultures = { westerngfx }
				
				norse = {
					graphical_cultures = { norsegfx }
										
					color = { 0 0 0 }
					
					male_names = { ä â }
					female_names = { ä â }
					
					dukes_called_kings = yes
					
					seafarer = yes
				}
			}
		''')

		assertNotNull(result);
		validationHelper.assertNoIssues(result);
		
//		val CultureGroup cultureGroup =  result.cultureGroups.get(0);
//		assertEquals("north_germanic",cultureGroup.name);
//		val Culture culture = cultureGroup.cultures.get(0);
//		assertEquals("norse",culture.name);
//		assertTrue(culture.dukes_called_kings);
//		assertFalse(culture.baron_titles_hidden);
//		assertTrue(culture.seafarer);
	}
	
	@Ignore
	@Test 
	def void testSerilization(){
		//val Culture culture = new CultureImpl();
	}

}
