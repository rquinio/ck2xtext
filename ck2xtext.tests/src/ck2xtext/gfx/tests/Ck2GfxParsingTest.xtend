/*
 * generated by Xtext 2.14.0
 */
package ck2xtext.gfx.tests

import static org.junit.jupiter.api.Assertions.*;

import ck2xtext.gfx.ck2gfx.SpriteTypes
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.emf.ecore.resource.Resource

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.util.ResourceHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.common.util.URI
import org.junit.jupiter.api.BeforeAll
import java.io.File
import ck2xtext.gfx.ck2gfx.SpriteType
import ck2xtext.gfx.ck2gfx.Ck2gfxPackage
import ck2xtext.gfx.validation.Ck2GfxValidator
import org.eclipse.core.resources.ResourcesPlugin

@ExtendWith(InjectionExtension)
@InjectWith(Ck2GfxInjectorProvider)
class Ck2GfxParsingTest {

	private static final URI DEFAULT = URI.createPlatformResourceURI("/vanilla/interface/test.gfx", true);

	@Inject
	ParseHelper<SpriteTypes> parseHelper

	@Inject
	ResourceHelper resourceHelper;

	@Inject
	ValidationTestHelper validationHelper;

	@BeforeAll
	def static void setupOnce() {
		System.setProperty(Ck2GfxValidator.CK2_BASE_DIR, new File("src/ck2xtext/tests/vanilla").absolutePath);
	}

	@Test
	def void minimalSpriteType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			spriteType = {
				name = "GFX_icon"
				texturefile = "gfx\\interface\\icon.tga"
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void spriteTypeWithInvalidPath() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			spriteType = {
				name = "GFX_icon"
				texturefile = "gfx\\interface\\unknown.tga"
			}
		}''', DEFAULT);

		validationHelper.assertWarning(resource, Ck2gfxPackage.Literals.SPRITE_TYPE, "");
	}

	@Test
	def void fileShouldFallbackFromDdsToTga() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			spriteType = {
				name = "GFX_icon"
				texturefile = "gfx\\interface\\icon.dds"
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void fileShouldFallbackFromTgaToDds() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			spriteType = {
				name = "GFX_icon"
				texturefile = "gfx\\interface\\sprite.tga"
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void textSpriteType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			textSpriteType = {
				name = "GFX_list_button"
				texturefile = "gfx\\interface\\icon.tga"
				noOfFrames = 1
				effectFile = "gfx/FX/buttonstate.lua"
				norefcount = yes
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void spriteTypeWithClickSound() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			spriteType = {
				name = "GFX_charbrowser_option_button_1"
				texturefile = "gfx\\interface\\sprite.dds"
				clicksound = generic_click_02
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalFrameAnimatedSpriteType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			frameAnimatedSpriteType = {
				name = "GFX_tech_level_progress_anim"
				texturefile = "gfx\\interface\\sprite.dds"
				noOfFrames = 8
				animation_rate_fps = 7.5
				looping = yes
				play_on_show = yes
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalCorneredTileSpriteType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			corneredTileSpriteType = {
				name = "GFX_messagelog_background"
				size= {x =320 y = 16 }
				texturefile = "gfx\\interface\\icon.tga"
				borderSize = { x=32 y=32 }
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalPortraitType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			portraitType = {
				name = "PORTRAIT_beargfx_male"
				effectFile = "gfx/FX/portrait.lua"
				layer = {
					"GFX_character_background:p0"
					"GFX_bear_male:d0"
					"GFX_character_imprisoned:p6"
					"GFX_player_overlay:p11"
				}
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalCoatOfArmsType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			CoatOfArmsType = {
				name = "coa_unitbanner"
				frame = "gfx\\coats_of_arms\\unit_banner_overlay_muslim.tga"
				mask = "gfx\\interface\\seal_mask_CoA.tga"
				seal_overlay = "gfx\\interface\\seal_overlay_CoA.dds"
				effect = "gfx/FX/coa_shield.lua"
						
				layer = {
					mask = "gfx\\coats_of_arms\\unit_banner_mask_muslim.tga"
					center = { x= 0 y = 0 }
					scale = 1
				}
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalProgressbarType() {
		val Resource resource = resourceHelper.resource('''
		spriteTypes = { 
			progressbartype = {
				name = "GFX_buildview_progress"
				color = { 0.0 0.5 0.0 }
				colortwo = { 1.0 0.0 0.0 }
				textureFile1 = "gfx\\interface\\sprite.dds"
				textureFile2 = "gfx\\interface\\sprite.dds"
				size = { x = 427 y = 32 }
				effectFile = "gfx/FX/progress.lua"
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalEMFXActorType() {
		val Resource resource = resourceHelper.resource('''
		objectTypes = { 
			EMFXActorType = {
				name = "westerngfx_port"
				actorfile = "gfx\models\Settlements\Western\Western_Port.xac"
				scale = 1.0f
				use_animation = no
				cull_distance = 300.0f
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	def void EMFXActorTypeWithUnordered() {
		val Resource resource = resourceHelper.resource('''
		objectTypes = { 
			EMFXActorType = {
				name = "westerngfx_tradepost_flag"
				actorfile = "gfx\models\Settlements\Western\Republic_flag.xac"
				scale = 0.8f
				use_animation = yes
				cull_distance = 300.0f
				
				idle   = "gfx\models\Settlements\Western\Flag_anim.xsm"
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalPdxmesh() {
		val Resource resource = resourceHelper.resource('''
		objectTypes = { 
			pdxmesh = {
				name = "tradepost_camp"
				file = "gfx\models\Settlements\Trade\tradepost.mesh"
				scale = 0.3f
				cull_distance = 500.0f
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void minimalArrowType() {
		val Resource resource = resourceHelper.resource('''
		objectTypes = { 
			arrowType = {
					name = "tradeArrowEnding"
					size = 4.0
					textureFile = "gfx\\mapitems\\trade_arrow_ending.dds"
					bodytexture = "gfx\\mapitems\\trade_arrow_ending.dds"
					color = { 0.0 1.0 0.0 }
					colortwo = { 1.0 0.0 0.0 }
					endAt = 1.0f
					height = 8.0
					type = 1
					heading = 1.0f
					effect = "gfx/FX/arrow.lua"
				}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void bitmapfont() {
		val Resource resource = resourceHelper.resource('''
		bitmapfonts = { 
			bitmapfont = {
				name = "ledger"
				fontname = "crap"
				color = 0xff000000
			}
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}

	@Test
	def void multipleRoots() {
		val Resource resource = resourceHelper.resource('''
		objectTypes = { 
		}
		spriteTypes = { 
		}''', DEFAULT);

		validationHelper.assertNoIssues(resource);
	}
}
