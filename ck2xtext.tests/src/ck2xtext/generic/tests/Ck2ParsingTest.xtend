/*
 * generated by Xtext 2.9.1
 */
package ck2xtext.generic.tests

import static org.junit.jupiter.api.Assertions.*;

import ck2xtext.generic.ck2.Model
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper

import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.util.ResourceHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.resource.Resource
import ck2xtext.generic.tests.Ck2InjectorProvider
import org.eclipse.emf.common.util.URI
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.api.Disabled

import org.eclipse.xtext.testing.extensions.InjectionExtension

@ExtendWith(InjectionExtension)
@InjectWith(Ck2InjectorProvider)
class Ck2ParsingTest{
	
	private static final URI DEFAULT = URI.createFileURI("common/test.txt");

	@Inject
	ParseHelper<Model> parseHelper;
	
	@Inject
	ResourceHelper resourceHelper;
	
	@Inject
	ValidationTestHelper validationHelper;
	
	@Test
	def void floatValueShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''scale = 1.0''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void floatValueWithSuffixShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''scale = 1.0f''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void hexadecimalValueShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''color = 0xff0000''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Disabled("FIXME")
	@Test
	def void valueStartingWithZeroShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''properties = 0c0cbd000000''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void IntegerEqualityComparisonShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''rank == 3''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void IntegerSuperiorComparisonShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''rank >= 3''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}
	
	@Test
	def void IntegerInferiorComparisonShouldBeParsed(){
		val Resource resource = resourceHelper.resource('''rank <= 3''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}

	@Disabled
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
		''', DEFAULT);
		
		validationHelper.assertNoIssues(resource);
	}

	@Disabled
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
		''');

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
	
	@Disabled
	@Test 
	def void testSerilization(){
		//val Culture culture = new CultureImpl();
	}

}
