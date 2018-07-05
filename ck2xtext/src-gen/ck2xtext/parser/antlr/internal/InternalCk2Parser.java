package ck2xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ck2xtext.services.Ck2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCk2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_HEX", "RULE_INT", "RULE_DIGIT", "RULE_NON_ASCII_CAP", "RULE_NON_ASCII_LOW", "RULE_ID_PART", "RULE_SL_COMMENT", "RULE_WS", "'{'", "'}'", "'='", "'['", "']'", "'=='", "'>='", "'>'", "'<='", "'<'", "'.'", "'-'", "'+'", "'f'"
    };
    public static final int RULE_HEX=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID_PART=12;
    public static final int RULE_NON_ASCII_LOW=11;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=9;
    public static final int RULE_BOOL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NON_ASCII_CAP=10;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCk2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCk2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCk2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalCk2.g"; }



     	private Ck2GrammarAccess grammarAccess;

        public InternalCk2Parser(TokenStream input, Ck2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Ck2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCk2.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCk2.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCk2.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCk2.g:71:1: ruleModel returns [EObject current=null] : ( (lv_properties_0_0= ruleProperty ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:77:2: ( ( (lv_properties_0_0= ruleProperty ) )+ )
            // InternalCk2.g:78:2: ( (lv_properties_0_0= ruleProperty ) )+
            {
            // InternalCk2.g:78:2: ( (lv_properties_0_0= ruleProperty ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCk2.g:79:3: (lv_properties_0_0= ruleProperty )
            	    {
            	    // InternalCk2.g:79:3: (lv_properties_0_0= ruleProperty )
            	    // InternalCk2.g:80:4: lv_properties_0_0= ruleProperty
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getPropertiesPropertyParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_properties_0_0=ruleProperty();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"properties",
            	    					lv_properties_0_0,
            	    					"ck2xtext.Ck2.Property");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleListElem"
    // InternalCk2.g:100:1: entryRuleListElem returns [String current=null] : iv_ruleListElem= ruleListElem EOF ;
    public final String entryRuleListElem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListElem = null;


        try {
            // InternalCk2.g:100:48: (iv_ruleListElem= ruleListElem EOF )
            // InternalCk2.g:101:2: iv_ruleListElem= ruleListElem EOF
            {
             newCompositeNode(grammarAccess.getListElemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListElem=ruleListElem();

            state._fsp--;

             current =iv_ruleListElem.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListElem"


    // $ANTLR start "ruleListElem"
    // InternalCk2.g:107:1: ruleListElem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble ) ;
    public final AntlrDatatypeRuleToken ruleListElem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_Integer_2 = null;

        AntlrDatatypeRuleToken this_Double_3 = null;



        	enterRule();

        try {
            // InternalCk2.g:113:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble ) )
            // InternalCk2.g:114:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble )
            {
            // InternalCk2.g:114:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_INT) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_STRING)||LA2_5==RULE_INT||LA2_5==16||(LA2_5>=26 && LA2_5<=27)) ) {
                        alt2=3;
                    }
                    else if ( (LA2_5==25) ) {
                        alt2=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==RULE_INT) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_STRING)||LA2_5==RULE_INT||LA2_5==16||(LA2_5>=26 && LA2_5<=27)) ) {
                        alt2=3;
                    }
                    else if ( (LA2_5==25) ) {
                        alt2=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_STRING)||LA2_5==RULE_INT||LA2_5==16||(LA2_5>=26 && LA2_5<=27)) ) {
                    alt2=3;
                }
                else if ( (LA2_5==25) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCk2.g:115:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getListElemAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCk2.g:123:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCk2.g:131:3: this_Integer_2= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getListElemAccess().getIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_2=ruleInteger();

                    state._fsp--;


                    			current.merge(this_Integer_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCk2.g:142:3: this_Double_3= ruleDouble
                    {

                    			newCompositeNode(grammarAccess.getListElemAccess().getDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Double_3=ruleDouble();

                    state._fsp--;


                    			current.merge(this_Double_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListElem"


    // $ANTLR start "entryRuleList"
    // InternalCk2.g:156:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalCk2.g:156:45: (iv_ruleList= ruleList EOF )
            // InternalCk2.g:157:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalCk2.g:163:1: ruleList returns [EObject current=null] : (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_elems_1_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:169:2: ( (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' ) )
            // InternalCk2.g:170:2: (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' )
            {
            // InternalCk2.g:170:2: (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' )
            // InternalCk2.g:171:3: otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCk2.g:175:3: ( (lv_elems_1_0= ruleListElem ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==RULE_INT||(LA3_0>=26 && LA3_0<=27)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCk2.g:176:4: (lv_elems_1_0= ruleListElem )
            	    {
            	    // InternalCk2.g:176:4: (lv_elems_1_0= ruleListElem )
            	    // InternalCk2.g:177:5: lv_elems_1_0= ruleListElem
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getElemsListElemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elems_1_0=ruleListElem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elems",
            	    						lv_elems_1_0,
            	    						"ck2xtext.Ck2.ListElem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getListAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleProperty"
    // InternalCk2.g:202:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalCk2.g:202:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalCk2.g:203:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalCk2.g:209:1: ruleProperty returns [EObject current=null] : (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringProperty_0 = null;

        EObject this_IdProperty_1 = null;

        EObject this_CommandProperty_2 = null;

        EObject this_BoolProperty_3 = null;

        EObject this_DateProperty_4 = null;

        EObject this_IntegerProperty_5 = null;

        EObject this_DoubleProperty_6 = null;

        EObject this_HexadecimalProperty_7 = null;

        EObject this_ListProperty_8 = null;

        EObject this_Clause_9 = null;

        EObject this_ProbabilityProperty_10 = null;



        	enterRule();

        try {
            // InternalCk2.g:215:2: ( (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty ) )
            // InternalCk2.g:216:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty )
            {
            // InternalCk2.g:216:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty )
            int alt4=11;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCk2.g:217:3: this_StringProperty_0= ruleStringProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringProperty_0=ruleStringProperty();

                    state._fsp--;


                    			current = this_StringProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCk2.g:226:3: this_IdProperty_1= ruleIdProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIdPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdProperty_1=ruleIdProperty();

                    state._fsp--;


                    			current = this_IdProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCk2.g:235:3: this_CommandProperty_2= ruleCommandProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getCommandPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandProperty_2=ruleCommandProperty();

                    state._fsp--;


                    			current = this_CommandProperty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCk2.g:244:3: this_BoolProperty_3= ruleBoolProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolProperty_3=ruleBoolProperty();

                    state._fsp--;


                    			current = this_BoolProperty_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCk2.g:253:3: this_DateProperty_4= ruleDateProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getDatePropertyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateProperty_4=ruleDateProperty();

                    state._fsp--;


                    			current = this_DateProperty_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCk2.g:262:3: this_IntegerProperty_5= ruleIntegerProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerProperty_5=ruleIntegerProperty();

                    state._fsp--;


                    			current = this_IntegerProperty_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCk2.g:271:3: this_DoubleProperty_6= ruleDoubleProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getDoublePropertyParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleProperty_6=ruleDoubleProperty();

                    state._fsp--;


                    			current = this_DoubleProperty_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCk2.g:280:3: this_HexadecimalProperty_7= ruleHexadecimalProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getHexadecimalPropertyParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_HexadecimalProperty_7=ruleHexadecimalProperty();

                    state._fsp--;


                    			current = this_HexadecimalProperty_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCk2.g:289:3: this_ListProperty_8= ruleListProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListProperty_8=ruleListProperty();

                    state._fsp--;


                    			current = this_ListProperty_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCk2.g:298:3: this_Clause_9= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getClauseParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_9=ruleClause();

                    state._fsp--;


                    			current = this_Clause_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCk2.g:307:3: this_ProbabilityProperty_10= ruleProbabilityProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProbabilityProperty_10=ruleProbabilityProperty();

                    state._fsp--;


                    			current = this_ProbabilityProperty_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleClause"
    // InternalCk2.g:319:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalCk2.g:319:47: (iv_ruleClause= ruleClause EOF )
            // InternalCk2.g:320:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalCk2.g:326:1: ruleClause returns [EObject current=null] : (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject this_IdClauseProperty_0 = null;

        EObject this_IntClauseProperty_1 = null;

        EObject this_DateClauseProperty_2 = null;



        	enterRule();

        try {
            // InternalCk2.g:332:2: ( (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty ) )
            // InternalCk2.g:333:2: (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty )
            {
            // InternalCk2.g:333:2: (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==17) ) {
                    alt5=2;
                }
                else if ( (LA5_2==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCk2.g:334:3: this_IdClauseProperty_0= ruleIdClauseProperty
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getIdClausePropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdClauseProperty_0=ruleIdClauseProperty();

                    state._fsp--;


                    			current = this_IdClauseProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCk2.g:343:3: this_IntClauseProperty_1= ruleIntClauseProperty
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getIntClausePropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntClauseProperty_1=ruleIntClauseProperty();

                    state._fsp--;


                    			current = this_IntClauseProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCk2.g:352:3: this_DateClauseProperty_2= ruleDateClauseProperty
                    {

                    			newCompositeNode(grammarAccess.getClauseAccess().getDateClausePropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateClauseProperty_2=ruleDateClauseProperty();

                    state._fsp--;


                    			current = this_DateClauseProperty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleStringProperty"
    // InternalCk2.g:364:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalCk2.g:364:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalCk2.g:365:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
             newCompositeNode(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringProperty=ruleStringProperty();

            state._fsp--;

             current =iv_ruleStringProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // InternalCk2.g:371:1: ruleStringProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:377:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCk2.g:378:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCk2.g:378:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCk2.g:379:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCk2.g:379:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:380:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:380:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:381:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStringPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:401:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCk2.g:402:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCk2.g:402:4: (lv_value_2_0= RULE_STRING )
            // InternalCk2.g:403:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.common.Ck2Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleIdProperty"
    // InternalCk2.g:423:1: entryRuleIdProperty returns [EObject current=null] : iv_ruleIdProperty= ruleIdProperty EOF ;
    public final EObject entryRuleIdProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdProperty = null;


        try {
            // InternalCk2.g:423:51: (iv_ruleIdProperty= ruleIdProperty EOF )
            // InternalCk2.g:424:2: iv_ruleIdProperty= ruleIdProperty EOF
            {
             newCompositeNode(grammarAccess.getIdPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdProperty=ruleIdProperty();

            state._fsp--;

             current =iv_ruleIdProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdProperty"


    // $ANTLR start "ruleIdProperty"
    // InternalCk2.g:430:1: ruleIdProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIdProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:436:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) )
            // InternalCk2.g:437:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // InternalCk2.g:437:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            // InternalCk2.g:438:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
            {
            // InternalCk2.g:438:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:439:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:439:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:440:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getIdPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIdPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:460:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalCk2.g:461:4: (lv_value_2_0= RULE_ID )
            {
            // InternalCk2.g:461:4: (lv_value_2_0= RULE_ID )
            // InternalCk2.g:462:5: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIdPropertyAccess().getValueIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdProperty"


    // $ANTLR start "entryRuleCommandProperty"
    // InternalCk2.g:482:1: entryRuleCommandProperty returns [EObject current=null] : iv_ruleCommandProperty= ruleCommandProperty EOF ;
    public final EObject entryRuleCommandProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandProperty = null;


        try {
            // InternalCk2.g:482:56: (iv_ruleCommandProperty= ruleCommandProperty EOF )
            // InternalCk2.g:483:2: iv_ruleCommandProperty= ruleCommandProperty EOF
            {
             newCompositeNode(grammarAccess.getCommandPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandProperty=ruleCommandProperty();

            state._fsp--;

             current =iv_ruleCommandProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandProperty"


    // $ANTLR start "ruleCommandProperty"
    // InternalCk2.g:489:1: ruleCommandProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) ;
    public final EObject ruleCommandProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCk2.g:495:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) )
            // InternalCk2.g:496:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            {
            // InternalCk2.g:496:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            // InternalCk2.g:497:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']'
            {
            // InternalCk2.g:497:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:498:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:498:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:499:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getCommandPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandPropertyAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandPropertyAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalCk2.g:523:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalCk2.g:524:4: (lv_value_3_0= RULE_ID )
            {
            // InternalCk2.g:524:4: (lv_value_3_0= RULE_ID )
            // InternalCk2.g:525:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_value_3_0, grammarAccess.getCommandPropertyAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCommandPropertyAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandProperty"


    // $ANTLR start "entryRuleBoolProperty"
    // InternalCk2.g:549:1: entryRuleBoolProperty returns [EObject current=null] : iv_ruleBoolProperty= ruleBoolProperty EOF ;
    public final EObject entryRuleBoolProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolProperty = null;


        try {
            // InternalCk2.g:549:53: (iv_ruleBoolProperty= ruleBoolProperty EOF )
            // InternalCk2.g:550:2: iv_ruleBoolProperty= ruleBoolProperty EOF
            {
             newCompositeNode(grammarAccess.getBoolPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolProperty=ruleBoolProperty();

            state._fsp--;

             current =iv_ruleBoolProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolProperty"


    // $ANTLR start "ruleBoolProperty"
    // InternalCk2.g:556:1: ruleBoolProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:562:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) ) )
            // InternalCk2.g:563:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) )
            {
            // InternalCk2.g:563:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) )
            // InternalCk2.g:564:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) )
            {
            // InternalCk2.g:564:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:565:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:565:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:566:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getBoolPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:586:3: ( (lv_value_2_0= RULE_BOOL ) )
            // InternalCk2.g:587:4: (lv_value_2_0= RULE_BOOL )
            {
            // InternalCk2.g:587:4: (lv_value_2_0= RULE_BOOL )
            // InternalCk2.g:588:5: lv_value_2_0= RULE_BOOL
            {
            lv_value_2_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getBoolPropertyAccess().getValueBOOLTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.common.Ck2Terminals.BOOL");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolProperty"


    // $ANTLR start "entryRuleDateProperty"
    // InternalCk2.g:608:1: entryRuleDateProperty returns [EObject current=null] : iv_ruleDateProperty= ruleDateProperty EOF ;
    public final EObject entryRuleDateProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateProperty = null;


        try {
            // InternalCk2.g:608:53: (iv_ruleDateProperty= ruleDateProperty EOF )
            // InternalCk2.g:609:2: iv_ruleDateProperty= ruleDateProperty EOF
            {
             newCompositeNode(grammarAccess.getDatePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateProperty=ruleDateProperty();

            state._fsp--;

             current =iv_ruleDateProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateProperty"


    // $ANTLR start "ruleDateProperty"
    // InternalCk2.g:615:1: ruleDateProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) ) ;
    public final EObject ruleDateProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:621:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) ) )
            // InternalCk2.g:622:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) )
            {
            // InternalCk2.g:622:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) )
            // InternalCk2.g:623:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) )
            {
            // InternalCk2.g:623:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:624:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:624:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:625:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getDatePropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDatePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:645:3: ( (lv_value_2_0= ruleDate ) )
            // InternalCk2.g:646:4: (lv_value_2_0= ruleDate )
            {
            // InternalCk2.g:646:4: (lv_value_2_0= ruleDate )
            // InternalCk2.g:647:5: lv_value_2_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDatePropertyAccess().getValueDateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatePropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.common.Ck2Terminals.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateProperty"


    // $ANTLR start "entryRuleIntegerProperty"
    // InternalCk2.g:668:1: entryRuleIntegerProperty returns [EObject current=null] : iv_ruleIntegerProperty= ruleIntegerProperty EOF ;
    public final EObject entryRuleIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerProperty = null;


        try {
            // InternalCk2.g:668:56: (iv_ruleIntegerProperty= ruleIntegerProperty EOF )
            // InternalCk2.g:669:2: iv_ruleIntegerProperty= ruleIntegerProperty EOF
            {
             newCompositeNode(grammarAccess.getIntegerPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerProperty=ruleIntegerProperty();

            state._fsp--;

             current =iv_ruleIntegerProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerProperty"


    // $ANTLR start "ruleIntegerProperty"
    // InternalCk2.g:675:1: ruleIntegerProperty returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) ) ;
    public final EObject ruleIntegerProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_key_3_0=null;
        Token otherlv_4=null;
        Token lv_key_6_0=null;
        Token otherlv_7=null;
        Token lv_key_9_0=null;
        Token otherlv_10=null;
        Token lv_key_12_0=null;
        Token otherlv_13=null;
        Token lv_key_15_0=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        AntlrDatatypeRuleToken lv_value_14_0 = null;

        AntlrDatatypeRuleToken lv_value_17_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:681:2: ( ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) ) )
            // InternalCk2.g:682:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) )
            {
            // InternalCk2.g:682:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt6=6;
                    }
                    break;
                case 22:
                    {
                    alt6=4;
                    }
                    break;
                case 20:
                    {
                    alt6=2;
                    }
                    break;
                case 23:
                    {
                    alt6=5;
                    }
                    break;
                case 21:
                    {
                    alt6=3;
                    }
                    break;
                case 17:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCk2.g:683:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:683:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    // InternalCk2.g:684:4: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) )
                    {
                    // InternalCk2.g:684:4: ( (lv_key_0_0= RULE_ID ) )
                    // InternalCk2.g:685:5: (lv_key_0_0= RULE_ID )
                    {
                    // InternalCk2.g:685:5: (lv_key_0_0= RULE_ID )
                    // InternalCk2.g:686:6: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_0_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalCk2.g:706:4: ( (lv_value_2_0= ruleInteger ) )
                    // InternalCk2.g:707:5: (lv_value_2_0= ruleInteger )
                    {
                    // InternalCk2.g:707:5: (lv_value_2_0= ruleInteger )
                    // InternalCk2.g:708:6: lv_value_2_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"ck2xtext.common.Ck2Terminals.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:727:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:727:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) )
                    // InternalCk2.g:728:4: ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) )
                    {
                    // InternalCk2.g:728:4: ( (lv_key_3_0= RULE_ID ) )
                    // InternalCk2.g:729:5: (lv_key_3_0= RULE_ID )
                    {
                    // InternalCk2.g:729:5: (lv_key_3_0= RULE_ID )
                    // InternalCk2.g:730:6: lv_key_3_0= RULE_ID
                    {
                    lv_key_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_key_3_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_3_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntegerPropertyAccess().getEqualsSignEqualsSignKeyword_1_1());
                    			
                    // InternalCk2.g:750:4: ( (lv_value_5_0= ruleInteger ) )
                    // InternalCk2.g:751:5: (lv_value_5_0= ruleInteger )
                    {
                    // InternalCk2.g:751:5: (lv_value_5_0= ruleInteger )
                    // InternalCk2.g:752:6: lv_value_5_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"ck2xtext.common.Ck2Terminals.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:771:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:771:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) )
                    // InternalCk2.g:772:4: ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) )
                    {
                    // InternalCk2.g:772:4: ( (lv_key_6_0= RULE_ID ) )
                    // InternalCk2.g:773:5: (lv_key_6_0= RULE_ID )
                    {
                    // InternalCk2.g:773:5: (lv_key_6_0= RULE_ID )
                    // InternalCk2.g:774:6: lv_key_6_0= RULE_ID
                    {
                    lv_key_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_key_6_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_6_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getIntegerPropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1());
                    			
                    // InternalCk2.g:794:4: ( (lv_value_8_0= ruleInteger ) )
                    // InternalCk2.g:795:5: (lv_value_8_0= ruleInteger )
                    {
                    // InternalCk2.g:795:5: (lv_value_8_0= ruleInteger )
                    // InternalCk2.g:796:6: lv_value_8_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"ck2xtext.common.Ck2Terminals.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:815:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:815:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) )
                    // InternalCk2.g:816:4: ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) )
                    {
                    // InternalCk2.g:816:4: ( (lv_key_9_0= RULE_ID ) )
                    // InternalCk2.g:817:5: (lv_key_9_0= RULE_ID )
                    {
                    // InternalCk2.g:817:5: (lv_key_9_0= RULE_ID )
                    // InternalCk2.g:818:6: lv_key_9_0= RULE_ID
                    {
                    lv_key_9_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_key_9_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_9_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getIntegerPropertyAccess().getGreaterThanSignKeyword_3_1());
                    			
                    // InternalCk2.g:838:4: ( (lv_value_11_0= ruleInteger ) )
                    // InternalCk2.g:839:5: (lv_value_11_0= ruleInteger )
                    {
                    // InternalCk2.g:839:5: (lv_value_11_0= ruleInteger )
                    // InternalCk2.g:840:6: lv_value_11_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_11_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"ck2xtext.common.Ck2Terminals.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:859:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:859:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) )
                    // InternalCk2.g:860:4: ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) )
                    {
                    // InternalCk2.g:860:4: ( (lv_key_12_0= RULE_ID ) )
                    // InternalCk2.g:861:5: (lv_key_12_0= RULE_ID )
                    {
                    // InternalCk2.g:861:5: (lv_key_12_0= RULE_ID )
                    // InternalCk2.g:862:6: lv_key_12_0= RULE_ID
                    {
                    lv_key_12_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_key_12_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_12_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getIntegerPropertyAccess().getLessThanSignEqualsSignKeyword_4_1());
                    			
                    // InternalCk2.g:882:4: ( (lv_value_14_0= ruleInteger ) )
                    // InternalCk2.g:883:5: (lv_value_14_0= ruleInteger )
                    {
                    // InternalCk2.g:883:5: (lv_value_14_0= ruleInteger )
                    // InternalCk2.g:884:6: lv_value_14_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_14_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_14_0,
                    							"ck2xtext.common.Ck2Terminals.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:903:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:903:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) )
                    // InternalCk2.g:904:4: ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) )
                    {
                    // InternalCk2.g:904:4: ( (lv_key_15_0= RULE_ID ) )
                    // InternalCk2.g:905:5: (lv_key_15_0= RULE_ID )
                    {
                    // InternalCk2.g:905:5: (lv_key_15_0= RULE_ID )
                    // InternalCk2.g:906:6: lv_key_15_0= RULE_ID
                    {
                    lv_key_15_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_key_15_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_15_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getIntegerPropertyAccess().getLessThanSignKeyword_5_1());
                    			
                    // InternalCk2.g:926:4: ( (lv_value_17_0= ruleInteger ) )
                    // InternalCk2.g:927:5: (lv_value_17_0= ruleInteger )
                    {
                    // InternalCk2.g:927:5: (lv_value_17_0= ruleInteger )
                    // InternalCk2.g:928:6: lv_value_17_0= ruleInteger
                    {

                    						newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_17_0=ruleInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_17_0,
                    							"ck2xtext.common.Ck2Terminals.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerProperty"


    // $ANTLR start "entryRuleDoubleProperty"
    // InternalCk2.g:950:1: entryRuleDoubleProperty returns [EObject current=null] : iv_ruleDoubleProperty= ruleDoubleProperty EOF ;
    public final EObject entryRuleDoubleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleProperty = null;


        try {
            // InternalCk2.g:950:55: (iv_ruleDoubleProperty= ruleDoubleProperty EOF )
            // InternalCk2.g:951:2: iv_ruleDoubleProperty= ruleDoubleProperty EOF
            {
             newCompositeNode(grammarAccess.getDoublePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleProperty=ruleDoubleProperty();

            state._fsp--;

             current =iv_ruleDoubleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleProperty"


    // $ANTLR start "ruleDoubleProperty"
    // InternalCk2.g:957:1: ruleDoubleProperty returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) ) ;
    public final EObject ruleDoubleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_key_3_0=null;
        Token otherlv_4=null;
        Token lv_key_6_0=null;
        Token otherlv_7=null;
        Token lv_key_9_0=null;
        Token otherlv_10=null;
        Token lv_key_12_0=null;
        Token otherlv_13=null;
        Token lv_key_15_0=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        AntlrDatatypeRuleToken lv_value_14_0 = null;

        AntlrDatatypeRuleToken lv_value_17_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:963:2: ( ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) ) )
            // InternalCk2.g:964:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) )
            {
            // InternalCk2.g:964:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) )
            int alt7=6;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt7=5;
                    }
                    break;
                case 21:
                    {
                    alt7=3;
                    }
                    break;
                case 17:
                    {
                    alt7=1;
                    }
                    break;
                case 24:
                    {
                    alt7=6;
                    }
                    break;
                case 22:
                    {
                    alt7=4;
                    }
                    break;
                case 20:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCk2.g:965:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:965:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) )
                    // InternalCk2.g:966:4: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) )
                    {
                    // InternalCk2.g:966:4: ( (lv_key_0_0= RULE_ID ) )
                    // InternalCk2.g:967:5: (lv_key_0_0= RULE_ID )
                    {
                    // InternalCk2.g:967:5: (lv_key_0_0= RULE_ID )
                    // InternalCk2.g:968:6: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_0_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalCk2.g:988:4: ( (lv_value_2_0= ruleDouble ) )
                    // InternalCk2.g:989:5: (lv_value_2_0= ruleDouble )
                    {
                    // InternalCk2.g:989:5: (lv_value_2_0= ruleDouble )
                    // InternalCk2.g:990:6: lv_value_2_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoublePropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:1009:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1009:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) )
                    // InternalCk2.g:1010:4: ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1010:4: ( (lv_key_3_0= RULE_ID ) )
                    // InternalCk2.g:1011:5: (lv_key_3_0= RULE_ID )
                    {
                    // InternalCk2.g:1011:5: (lv_key_3_0= RULE_ID )
                    // InternalCk2.g:1012:6: lv_key_3_0= RULE_ID
                    {
                    lv_key_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_key_3_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_3_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoublePropertyAccess().getEqualsSignEqualsSignKeyword_1_1());
                    			
                    // InternalCk2.g:1032:4: ( (lv_value_5_0= ruleDouble ) )
                    // InternalCk2.g:1033:5: (lv_value_5_0= ruleDouble )
                    {
                    // InternalCk2.g:1033:5: (lv_value_5_0= ruleDouble )
                    // InternalCk2.g:1034:6: lv_value_5_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoublePropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:1053:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1053:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) )
                    // InternalCk2.g:1054:4: ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1054:4: ( (lv_key_6_0= RULE_ID ) )
                    // InternalCk2.g:1055:5: (lv_key_6_0= RULE_ID )
                    {
                    // InternalCk2.g:1055:5: (lv_key_6_0= RULE_ID )
                    // InternalCk2.g:1056:6: lv_key_6_0= RULE_ID
                    {
                    lv_key_6_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_key_6_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_6_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getDoublePropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1());
                    			
                    // InternalCk2.g:1076:4: ( (lv_value_8_0= ruleDouble ) )
                    // InternalCk2.g:1077:5: (lv_value_8_0= ruleDouble )
                    {
                    // InternalCk2.g:1077:5: (lv_value_8_0= ruleDouble )
                    // InternalCk2.g:1078:6: lv_value_8_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoublePropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:1097:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1097:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) )
                    // InternalCk2.g:1098:4: ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1098:4: ( (lv_key_9_0= RULE_ID ) )
                    // InternalCk2.g:1099:5: (lv_key_9_0= RULE_ID )
                    {
                    // InternalCk2.g:1099:5: (lv_key_9_0= RULE_ID )
                    // InternalCk2.g:1100:6: lv_key_9_0= RULE_ID
                    {
                    lv_key_9_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_key_9_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_9_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDoublePropertyAccess().getGreaterThanSignKeyword_3_1());
                    			
                    // InternalCk2.g:1120:4: ( (lv_value_11_0= ruleDouble ) )
                    // InternalCk2.g:1121:5: (lv_value_11_0= ruleDouble )
                    {
                    // InternalCk2.g:1121:5: (lv_value_11_0= ruleDouble )
                    // InternalCk2.g:1122:6: lv_value_11_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_11_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoublePropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:1141:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1141:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) )
                    // InternalCk2.g:1142:4: ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1142:4: ( (lv_key_12_0= RULE_ID ) )
                    // InternalCk2.g:1143:5: (lv_key_12_0= RULE_ID )
                    {
                    // InternalCk2.g:1143:5: (lv_key_12_0= RULE_ID )
                    // InternalCk2.g:1144:6: lv_key_12_0= RULE_ID
                    {
                    lv_key_12_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_key_12_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_12_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getDoublePropertyAccess().getLessThanSignEqualsSignKeyword_4_1());
                    			
                    // InternalCk2.g:1164:4: ( (lv_value_14_0= ruleDouble ) )
                    // InternalCk2.g:1165:5: (lv_value_14_0= ruleDouble )
                    {
                    // InternalCk2.g:1165:5: (lv_value_14_0= ruleDouble )
                    // InternalCk2.g:1166:6: lv_value_14_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_14_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoublePropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_14_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:1185:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1185:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) )
                    // InternalCk2.g:1186:4: ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1186:4: ( (lv_key_15_0= RULE_ID ) )
                    // InternalCk2.g:1187:5: (lv_key_15_0= RULE_ID )
                    {
                    // InternalCk2.g:1187:5: (lv_key_15_0= RULE_ID )
                    // InternalCk2.g:1188:6: lv_key_15_0= RULE_ID
                    {
                    lv_key_15_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_key_15_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_15_0,
                    							"ck2xtext.common.Ck2Terminals.ID");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getDoublePropertyAccess().getLessThanSignKeyword_5_1());
                    			
                    // InternalCk2.g:1208:4: ( (lv_value_17_0= ruleDouble ) )
                    // InternalCk2.g:1209:5: (lv_value_17_0= ruleDouble )
                    {
                    // InternalCk2.g:1209:5: (lv_value_17_0= ruleDouble )
                    // InternalCk2.g:1210:6: lv_value_17_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_17_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoublePropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_17_0,
                    							"ck2xtext.common.Ck2Terminals.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleProperty"


    // $ANTLR start "entryRuleHexadecimalProperty"
    // InternalCk2.g:1232:1: entryRuleHexadecimalProperty returns [EObject current=null] : iv_ruleHexadecimalProperty= ruleHexadecimalProperty EOF ;
    public final EObject entryRuleHexadecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexadecimalProperty = null;


        try {
            // InternalCk2.g:1232:60: (iv_ruleHexadecimalProperty= ruleHexadecimalProperty EOF )
            // InternalCk2.g:1233:2: iv_ruleHexadecimalProperty= ruleHexadecimalProperty EOF
            {
             newCompositeNode(grammarAccess.getHexadecimalPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHexadecimalProperty=ruleHexadecimalProperty();

            state._fsp--;

             current =iv_ruleHexadecimalProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexadecimalProperty"


    // $ANTLR start "ruleHexadecimalProperty"
    // InternalCk2.g:1239:1: ruleHexadecimalProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexadecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:1245:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) ) )
            // InternalCk2.g:1246:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) )
            {
            // InternalCk2.g:1246:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) )
            // InternalCk2.g:1247:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) )
            {
            // InternalCk2.g:1247:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:1248:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:1248:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:1249:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getHexadecimalPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHexadecimalPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getHexadecimalPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1269:3: ( (lv_value_2_0= RULE_HEX ) )
            // InternalCk2.g:1270:4: (lv_value_2_0= RULE_HEX )
            {
            // InternalCk2.g:1270:4: (lv_value_2_0= RULE_HEX )
            // InternalCk2.g:1271:5: lv_value_2_0= RULE_HEX
            {
            lv_value_2_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getHexadecimalPropertyAccess().getValueHEXTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHexadecimalPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.common.Ck2Terminals.HEX");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHexadecimalProperty"


    // $ANTLR start "entryRuleListProperty"
    // InternalCk2.g:1291:1: entryRuleListProperty returns [EObject current=null] : iv_ruleListProperty= ruleListProperty EOF ;
    public final EObject entryRuleListProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListProperty = null;


        try {
            // InternalCk2.g:1291:53: (iv_ruleListProperty= ruleListProperty EOF )
            // InternalCk2.g:1292:2: iv_ruleListProperty= ruleListProperty EOF
            {
             newCompositeNode(grammarAccess.getListPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListProperty=ruleListProperty();

            state._fsp--;

             current =iv_ruleListProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListProperty"


    // $ANTLR start "ruleListProperty"
    // InternalCk2.g:1298:1: ruleListProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) ) ;
    public final EObject ruleListProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1304:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) ) )
            // InternalCk2.g:1305:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) )
            {
            // InternalCk2.g:1305:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) )
            // InternalCk2.g:1306:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) )
            {
            // InternalCk2.g:1306:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:1307:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:1307:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:1308:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getListPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1328:3: ( (lv_value_2_0= ruleList ) )
            // InternalCk2.g:1329:4: (lv_value_2_0= ruleList )
            {
            // InternalCk2.g:1329:4: (lv_value_2_0= ruleList )
            // InternalCk2.g:1330:5: lv_value_2_0= ruleList
            {

            					newCompositeNode(grammarAccess.getListPropertyAccess().getValueListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.Ck2.List");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListProperty"


    // $ANTLR start "entryRuleIdClauseProperty"
    // InternalCk2.g:1351:1: entryRuleIdClauseProperty returns [EObject current=null] : iv_ruleIdClauseProperty= ruleIdClauseProperty EOF ;
    public final EObject entryRuleIdClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdClauseProperty = null;


        try {
            // InternalCk2.g:1351:57: (iv_ruleIdClauseProperty= ruleIdClauseProperty EOF )
            // InternalCk2.g:1352:2: iv_ruleIdClauseProperty= ruleIdClauseProperty EOF
            {
             newCompositeNode(grammarAccess.getIdClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdClauseProperty=ruleIdClauseProperty();

            state._fsp--;

             current =iv_ruleIdClauseProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdClauseProperty"


    // $ANTLR start "ruleIdClauseProperty"
    // InternalCk2.g:1358:1: ruleIdClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleIdClauseProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1364:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1365:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1365:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1366:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1366:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCk2.g:1367:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCk2.g:1367:4: (lv_name_0_0= RULE_ID )
            // InternalCk2.g:1368:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIdClausePropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdClausePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ck2xtext.common.Ck2Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getIdClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1388:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1389:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1389:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1390:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,15,FOLLOW_21); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1402:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCk2.g:1403:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1403:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1404:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIdClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIdClausePropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"ck2xtext.Ck2.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIdClausePropertyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdClauseProperty"


    // $ANTLR start "entryRuleIntClauseProperty"
    // InternalCk2.g:1429:1: entryRuleIntClauseProperty returns [EObject current=null] : iv_ruleIntClauseProperty= ruleIntClauseProperty EOF ;
    public final EObject entryRuleIntClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntClauseProperty = null;


        try {
            // InternalCk2.g:1429:58: (iv_ruleIntClauseProperty= ruleIntClauseProperty EOF )
            // InternalCk2.g:1430:2: iv_ruleIntClauseProperty= ruleIntClauseProperty EOF
            {
             newCompositeNode(grammarAccess.getIntClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntClauseProperty=ruleIntClauseProperty();

            state._fsp--;

             current =iv_ruleIntClauseProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntClauseProperty"


    // $ANTLR start "ruleIntClauseProperty"
    // InternalCk2.g:1436:1: ruleIntClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleIntClauseProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1442:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1443:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1443:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1444:3: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1444:3: ( (lv_name_0_0= RULE_INT ) )
            // InternalCk2.g:1445:4: (lv_name_0_0= RULE_INT )
            {
            // InternalCk2.g:1445:4: (lv_name_0_0= RULE_INT )
            // InternalCk2.g:1446:5: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIntClausePropertyAccess().getNameINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntClausePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getIntClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1466:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1467:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1467:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1468:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,15,FOLLOW_21); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1480:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:1481:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1481:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1482:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIntClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntClausePropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"ck2xtext.Ck2.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntClausePropertyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntClauseProperty"


    // $ANTLR start "entryRuleDateClauseProperty"
    // InternalCk2.g:1507:1: entryRuleDateClauseProperty returns [EObject current=null] : iv_ruleDateClauseProperty= ruleDateClauseProperty EOF ;
    public final EObject entryRuleDateClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateClauseProperty = null;


        try {
            // InternalCk2.g:1507:59: (iv_ruleDateClauseProperty= ruleDateClauseProperty EOF )
            // InternalCk2.g:1508:2: iv_ruleDateClauseProperty= ruleDateClauseProperty EOF
            {
             newCompositeNode(grammarAccess.getDateClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateClauseProperty=ruleDateClauseProperty();

            state._fsp--;

             current =iv_ruleDateClauseProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateClauseProperty"


    // $ANTLR start "ruleDateClauseProperty"
    // InternalCk2.g:1514:1: ruleDateClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDateClauseProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1520:2: ( ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1521:2: ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1521:2: ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1522:3: ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1522:3: ( (lv_name_0_0= ruleDate ) )
            // InternalCk2.g:1523:4: (lv_name_0_0= ruleDate )
            {
            // InternalCk2.g:1523:4: (lv_name_0_0= ruleDate )
            // InternalCk2.g:1524:5: lv_name_0_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDateClausePropertyAccess().getNameDateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateClausePropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ck2xtext.common.Ck2Terminals.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDateClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1545:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1546:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1546:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1547:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,15,FOLLOW_21); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1559:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCk2.g:1560:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1560:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1561:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDateClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDateClausePropertyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"ck2xtext.Ck2.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDateClausePropertyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateClauseProperty"


    // $ANTLR start "entryRuleProbabilityProperty"
    // InternalCk2.g:1586:1: entryRuleProbabilityProperty returns [EObject current=null] : iv_ruleProbabilityProperty= ruleProbabilityProperty EOF ;
    public final EObject entryRuleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityProperty = null;


        try {
            // InternalCk2.g:1586:60: (iv_ruleProbabilityProperty= ruleProbabilityProperty EOF )
            // InternalCk2.g:1587:2: iv_ruleProbabilityProperty= ruleProbabilityProperty EOF
            {
             newCompositeNode(grammarAccess.getProbabilityPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProbabilityProperty=ruleProbabilityProperty();

            state._fsp--;

             current =iv_ruleProbabilityProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbabilityProperty"


    // $ANTLR start "ruleProbabilityProperty"
    // InternalCk2.g:1593:1: ruleProbabilityProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) ) ;
    public final EObject ruleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1599:2: ( ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) ) )
            // InternalCk2.g:1600:2: ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) )
            {
            // InternalCk2.g:1600:2: ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) )
            // InternalCk2.g:1601:3: ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) )
            {
            // InternalCk2.g:1601:3: ( (lv_key_0_0= RULE_INT ) )
            // InternalCk2.g:1602:4: (lv_key_0_0= RULE_INT )
            {
            // InternalCk2.g:1602:4: (lv_key_0_0= RULE_INT )
            // InternalCk2.g:1603:5: lv_key_0_0= RULE_INT
            {
            lv_key_0_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getProbabilityPropertyAccess().getKeyINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProbabilityPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.common.Ck2Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProbabilityPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1623:3: ( (lv_value_2_0= ruleListElem ) )
            // InternalCk2.g:1624:4: (lv_value_2_0= ruleListElem )
            {
            // InternalCk2.g:1624:4: (lv_value_2_0= ruleListElem )
            // InternalCk2.g:1625:5: lv_value_2_0= ruleListElem
            {

            					newCompositeNode(grammarAccess.getProbabilityPropertyAccess().getValueListElemParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleListElem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProbabilityPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ck2xtext.Ck2.ListElem");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbabilityProperty"


    // $ANTLR start "entryRuleDate"
    // InternalCk2.g:1646:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalCk2.g:1646:44: (iv_ruleDate= ruleDate EOF )
            // InternalCk2.g:1647:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalCk2.g:1653:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCk2.g:1659:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalCk2.g:1660:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalCk2.g:1660:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalCk2.g:1661:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,25,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,25,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleInteger"
    // InternalCk2.g:1696:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalCk2.g:1696:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalCk2.g:1697:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalCk2.g:1703:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCk2.g:1709:2: ( ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT ) )
            // InternalCk2.g:1710:2: ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT )
            {
            // InternalCk2.g:1710:2: ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT )
            // InternalCk2.g:1711:3: (kw= '-' | kw= '+' )? this_INT_2= RULE_INT
            {
            // InternalCk2.g:1711:3: (kw= '-' | kw= '+' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalCk2.g:1712:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCk2.g:1718:4: kw= '+'
                    {
                    kw=(Token)match(input,27,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getPlusSignKeyword_0_1());
                    			

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // InternalCk2.g:1735:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalCk2.g:1735:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalCk2.g:1736:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalCk2.g:1742:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1748:2: ( (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? ) )
            // InternalCk2.g:1749:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? )
            {
            // InternalCk2.g:1749:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? )
            // InternalCk2.g:1750:3: this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )?
            {

            			newCompositeNode(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Integer_0=ruleInteger();

            state._fsp--;


            			current.merge(this_Integer_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,25,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_24); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalCk2.g:1772:3: (kw= 'f' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCk2.g:1773:4: kw= 'f'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getFKeyword_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\15\uffff\1\45\4\uffff\1\45\6\uffff\1\45\2\uffff\1\45\2\uffff\1\45\2\uffff\1\45\3\uffff\1\45\4\uffff\1\44\3\uffff";
    static final String dfa_3s = "\1\4\2\21\1\10\1\4\4\10\1\4\1\uffff\2\10\1\4\2\uffff\2\10\2\4\3\uffff\2\10\1\4\2\10\1\4\2\10\1\4\2\10\1\4\3\uffff\1\4\1\10\2\4\1\uffff\1\4\1\10\1\uffff\1\4";
    static final String dfa_4s = "\1\10\1\30\1\31\7\33\1\uffff\2\10\1\31\2\uffff\2\10\1\31\1\33\3\uffff\2\10\1\31\2\10\1\31\2\10\1\31\2\10\1\31\3\uffff\1\31\1\10\2\33\1\uffff\1\34\1\10\1\uffff\1\34";
    static final String dfa_5s = "\12\uffff\1\12\3\uffff\1\10\1\2\4\uffff\1\4\1\3\1\1\14\uffff\1\13\1\7\1\6\4\uffff\1\11\2\uffff\1\5\1\uffff";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\3\uffff\1\2",
            "\1\4\2\uffff\1\7\1\5\1\3\1\10\1\6",
            "\1\11\7\uffff\1\12",
            "\1\15\21\uffff\1\13\1\14",
            "\1\17\1\26\1\24\1\16\1\22\6\uffff\1\23\2\uffff\1\25\7\uffff\1\20\1\21",
            "\1\31\21\uffff\1\27\1\30",
            "\1\34\21\uffff\1\32\1\33",
            "\1\37\21\uffff\1\35\1\36",
            "\1\42\21\uffff\1\40\1\41",
            "\2\43\2\uffff\1\43\6\uffff\1\12\12\uffff\2\43",
            "",
            "\1\15",
            "\1\15",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\44",
            "",
            "",
            "\1\46",
            "\1\46",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\47",
            "\1\50\1\52\2\uffff\1\51\7\uffff\1\12\11\uffff\2\52",
            "",
            "",
            "",
            "\1\31",
            "\1\31",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\44",
            "\1\34",
            "\1\34",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\44",
            "\1\37",
            "\1\37",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\44",
            "\1\42",
            "\1\42",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\44",
            "",
            "",
            "",
            "\1\45\3\uffff\1\45\7\uffff\1\45\10\uffff\1\44",
            "\1\53",
            "\2\52\2\uffff\1\52\7\uffff\1\52\1\12\2\uffff\5\12\1\uffff\2\52",
            "\2\52\2\uffff\1\52\7\uffff\1\52\1\12\7\uffff\1\54\2\52",
            "",
            "\1\44\3\uffff\1\44\7\uffff\1\44\10\uffff\1\55\2\uffff\1\44",
            "\1\56",
            "",
            "\2\52\2\uffff\1\52\7\uffff\1\52\10\uffff\1\12\3\52"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "216:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000C000130L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000C010130L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010110L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});

}