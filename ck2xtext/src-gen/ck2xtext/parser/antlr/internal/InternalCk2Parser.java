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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_DIGIT", "RULE_NON_ASCII_CAP", "RULE_NON_ASCII_LOW", "RULE_ID_PART", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'-'", "'+'", "'{'", "'}'", "'='", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID_PART=11;
    public static final int RULE_NON_ASCII_LOW=10;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=8;
    public static final int RULE_BOOL=7;
    public static final int RULE_INT=4;
    public static final int RULE_NON_ASCII_CAP=9;
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

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)) ) {
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


    // $ANTLR start "entryRuleDate"
    // InternalCk2.g:100:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalCk2.g:100:44: (iv_ruleDate= ruleDate EOF )
            // InternalCk2.g:101:2: iv_ruleDate= ruleDate EOF
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
    // InternalCk2.g:107:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCk2.g:113:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalCk2.g:114:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalCk2.g:114:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalCk2.g:115:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,14,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,14,FOLLOW_5); 

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
    // InternalCk2.g:150:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalCk2.g:150:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalCk2.g:151:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalCk2.g:157:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCk2.g:163:2: ( ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT ) )
            // InternalCk2.g:164:2: ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT )
            {
            // InternalCk2.g:164:2: ( (kw= '-' | kw= '+' )? this_INT_2= RULE_INT )
            // InternalCk2.g:165:3: (kw= '-' | kw= '+' )? this_INT_2= RULE_INT
            {
            // InternalCk2.g:165:3: (kw= '-' | kw= '+' )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // InternalCk2.g:166:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCk2.g:172:4: kw= '+'
                    {
                    kw=(Token)match(input,16,FOLLOW_5); 

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
    // InternalCk2.g:189:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalCk2.g:189:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalCk2.g:190:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalCk2.g:196:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:202:2: ( (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT ) )
            // InternalCk2.g:203:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT )
            {
            // InternalCk2.g:203:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT )
            // InternalCk2.g:204:3: this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT
            {

            			newCompositeNode(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_Integer_0=ruleInteger();

            state._fsp--;


            			current.merge(this_Integer_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,14,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		

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


    // $ANTLR start "entryRuleList"
    // InternalCk2.g:230:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalCk2.g:230:45: (iv_ruleList= ruleList EOF )
            // InternalCk2.g:231:2: iv_ruleList= ruleList EOF
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
    // InternalCk2.g:237:1: ruleList returns [EObject current=null] : (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_elems_1_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:243:2: ( (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' ) )
            // InternalCk2.g:244:2: (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' )
            {
            // InternalCk2.g:244:2: (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' )
            // InternalCk2.g:245:3: otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCk2.g:249:3: ( (lv_elems_1_0= ruleListElem ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)||(LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCk2.g:250:4: (lv_elems_1_0= ruleListElem )
            	    {
            	    // InternalCk2.g:250:4: (lv_elems_1_0= ruleListElem )
            	    // InternalCk2.g:251:5: lv_elems_1_0= ruleListElem
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getElemsListElemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleListElem"
    // InternalCk2.g:276:1: entryRuleListElem returns [String current=null] : iv_ruleListElem= ruleListElem EOF ;
    public final String entryRuleListElem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListElem = null;


        try {
            // InternalCk2.g:276:48: (iv_ruleListElem= ruleListElem EOF )
            // InternalCk2.g:277:2: iv_ruleListElem= ruleListElem EOF
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
    // InternalCk2.g:283:1: ruleListElem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble ) ;
    public final AntlrDatatypeRuleToken ruleListElem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_Integer_2 = null;

        AntlrDatatypeRuleToken this_Double_3 = null;



        	enterRule();

        try {
            // InternalCk2.g:289:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble ) )
            // InternalCk2.g:290:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble )
            {
            // InternalCk2.g:290:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_INT) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==14) ) {
                        alt4=4;
                    }
                    else if ( (LA4_5==EOF||(LA4_5>=RULE_INT && LA4_5<=RULE_STRING)||(LA4_5>=15 && LA4_5<=16)||LA4_5==18) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==RULE_INT) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==14) ) {
                        alt4=4;
                    }
                    else if ( (LA4_5==EOF||(LA4_5>=RULE_INT && LA4_5<=RULE_STRING)||(LA4_5>=15 && LA4_5<=16)||LA4_5==18) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==14) ) {
                    alt4=4;
                }
                else if ( (LA4_5==EOF||(LA4_5>=RULE_INT && LA4_5<=RULE_STRING)||(LA4_5>=15 && LA4_5<=16)||LA4_5==18) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCk2.g:291:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getListElemAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCk2.g:299:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCk2.g:307:3: this_Integer_2= ruleInteger
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
                    // InternalCk2.g:318:3: this_Double_3= ruleDouble
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


    // $ANTLR start "entryRuleProperty"
    // InternalCk2.g:332:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalCk2.g:332:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalCk2.g:333:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalCk2.g:339:1: ruleProperty returns [EObject current=null] : (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_ListProperty_7= ruleListProperty | this_Clause_8= ruleClause | this_ProbabilityProperty_9= ruleProbabilityProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringProperty_0 = null;

        EObject this_IdProperty_1 = null;

        EObject this_CommandProperty_2 = null;

        EObject this_BoolProperty_3 = null;

        EObject this_DateProperty_4 = null;

        EObject this_IntegerProperty_5 = null;

        EObject this_DoubleProperty_6 = null;

        EObject this_ListProperty_7 = null;

        EObject this_Clause_8 = null;

        EObject this_ProbabilityProperty_9 = null;



        	enterRule();

        try {
            // InternalCk2.g:345:2: ( (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_ListProperty_7= ruleListProperty | this_Clause_8= ruleClause | this_ProbabilityProperty_9= ruleProbabilityProperty ) )
            // InternalCk2.g:346:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_ListProperty_7= ruleListProperty | this_Clause_8= ruleClause | this_ProbabilityProperty_9= ruleProbabilityProperty )
            {
            // InternalCk2.g:346:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_ListProperty_7= ruleListProperty | this_Clause_8= ruleClause | this_ProbabilityProperty_9= ruleProbabilityProperty )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalCk2.g:347:3: this_StringProperty_0= ruleStringProperty
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
                    // InternalCk2.g:356:3: this_IdProperty_1= ruleIdProperty
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
                    // InternalCk2.g:365:3: this_CommandProperty_2= ruleCommandProperty
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
                    // InternalCk2.g:374:3: this_BoolProperty_3= ruleBoolProperty
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
                    // InternalCk2.g:383:3: this_DateProperty_4= ruleDateProperty
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
                    // InternalCk2.g:392:3: this_IntegerProperty_5= ruleIntegerProperty
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
                    // InternalCk2.g:401:3: this_DoubleProperty_6= ruleDoubleProperty
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
                    // InternalCk2.g:410:3: this_ListProperty_7= ruleListProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListProperty_7=ruleListProperty();

                    state._fsp--;


                    			current = this_ListProperty_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCk2.g:419:3: this_Clause_8= ruleClause
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getClauseParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clause_8=ruleClause();

                    state._fsp--;


                    			current = this_Clause_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCk2.g:428:3: this_ProbabilityProperty_9= ruleProbabilityProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProbabilityProperty_9=ruleProbabilityProperty();

                    state._fsp--;


                    			current = this_ProbabilityProperty_9;
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
    // InternalCk2.g:440:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalCk2.g:440:47: (iv_ruleClause= ruleClause EOF )
            // InternalCk2.g:441:2: iv_ruleClause= ruleClause EOF
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
    // InternalCk2.g:447:1: ruleClause returns [EObject current=null] : (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject this_IdClauseProperty_0 = null;

        EObject this_IntClauseProperty_1 = null;

        EObject this_DateClauseProperty_2 = null;



        	enterRule();

        try {
            // InternalCk2.g:453:2: ( (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty ) )
            // InternalCk2.g:454:2: (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty )
            {
            // InternalCk2.g:454:2: (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==14) ) {
                    alt6=3;
                }
                else if ( (LA6_2==19) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

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
                    // InternalCk2.g:455:3: this_IdClauseProperty_0= ruleIdClauseProperty
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
                    // InternalCk2.g:464:3: this_IntClauseProperty_1= ruleIntClauseProperty
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
                    // InternalCk2.g:473:3: this_DateClauseProperty_2= ruleDateClauseProperty
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
    // InternalCk2.g:485:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalCk2.g:485:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalCk2.g:486:2: iv_ruleStringProperty= ruleStringProperty EOF
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
    // InternalCk2.g:492:1: ruleStringProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:498:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCk2.g:499:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCk2.g:499:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCk2.g:500:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCk2.g:500:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:501:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:501:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:502:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getStringPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:522:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCk2.g:523:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCk2.g:523:4: (lv_value_2_0= RULE_STRING )
            // InternalCk2.g:524:5: lv_value_2_0= RULE_STRING
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
            						"ck2xtext.Ck2.STRING");
            				

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
    // InternalCk2.g:544:1: entryRuleIdProperty returns [EObject current=null] : iv_ruleIdProperty= ruleIdProperty EOF ;
    public final EObject entryRuleIdProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdProperty = null;


        try {
            // InternalCk2.g:544:51: (iv_ruleIdProperty= ruleIdProperty EOF )
            // InternalCk2.g:545:2: iv_ruleIdProperty= ruleIdProperty EOF
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
    // InternalCk2.g:551:1: ruleIdProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIdProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:557:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) )
            // InternalCk2.g:558:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // InternalCk2.g:558:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            // InternalCk2.g:559:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
            {
            // InternalCk2.g:559:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:560:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:560:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:561:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getIdPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIdPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:581:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalCk2.g:582:4: (lv_value_2_0= RULE_ID )
            {
            // InternalCk2.g:582:4: (lv_value_2_0= RULE_ID )
            // InternalCk2.g:583:5: lv_value_2_0= RULE_ID
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
            						"ck2xtext.Ck2.ID");
            				

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
    // InternalCk2.g:603:1: entryRuleCommandProperty returns [EObject current=null] : iv_ruleCommandProperty= ruleCommandProperty EOF ;
    public final EObject entryRuleCommandProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandProperty = null;


        try {
            // InternalCk2.g:603:56: (iv_ruleCommandProperty= ruleCommandProperty EOF )
            // InternalCk2.g:604:2: iv_ruleCommandProperty= ruleCommandProperty EOF
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
    // InternalCk2.g:610:1: ruleCommandProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) ;
    public final EObject ruleCommandProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCk2.g:616:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) )
            // InternalCk2.g:617:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            {
            // InternalCk2.g:617:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            // InternalCk2.g:618:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']'
            {
            // InternalCk2.g:618:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:619:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:619:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:620:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getCommandPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandPropertyAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandPropertyAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalCk2.g:644:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalCk2.g:645:4: (lv_value_3_0= RULE_ID )
            {
            // InternalCk2.g:645:4: (lv_value_3_0= RULE_ID )
            // InternalCk2.g:646:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_value_3_0, grammarAccess.getCommandPropertyAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalCk2.g:670:1: entryRuleBoolProperty returns [EObject current=null] : iv_ruleBoolProperty= ruleBoolProperty EOF ;
    public final EObject entryRuleBoolProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolProperty = null;


        try {
            // InternalCk2.g:670:53: (iv_ruleBoolProperty= ruleBoolProperty EOF )
            // InternalCk2.g:671:2: iv_ruleBoolProperty= ruleBoolProperty EOF
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
    // InternalCk2.g:677:1: ruleBoolProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:683:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) ) )
            // InternalCk2.g:684:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) )
            {
            // InternalCk2.g:684:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) )
            // InternalCk2.g:685:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) )
            {
            // InternalCk2.g:685:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:686:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:686:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:687:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getBoolPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:707:3: ( (lv_value_2_0= RULE_BOOL ) )
            // InternalCk2.g:708:4: (lv_value_2_0= RULE_BOOL )
            {
            // InternalCk2.g:708:4: (lv_value_2_0= RULE_BOOL )
            // InternalCk2.g:709:5: lv_value_2_0= RULE_BOOL
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
            						"ck2xtext.Ck2.BOOL");
            				

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
    // InternalCk2.g:729:1: entryRuleDateProperty returns [EObject current=null] : iv_ruleDateProperty= ruleDateProperty EOF ;
    public final EObject entryRuleDateProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateProperty = null;


        try {
            // InternalCk2.g:729:53: (iv_ruleDateProperty= ruleDateProperty EOF )
            // InternalCk2.g:730:2: iv_ruleDateProperty= ruleDateProperty EOF
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
    // InternalCk2.g:736:1: ruleDateProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) ) ;
    public final EObject ruleDateProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:742:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) ) )
            // InternalCk2.g:743:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) )
            {
            // InternalCk2.g:743:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) )
            // InternalCk2.g:744:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) )
            {
            // InternalCk2.g:744:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:745:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:745:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:746:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getDatePropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDatePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:766:3: ( (lv_value_2_0= ruleDate ) )
            // InternalCk2.g:767:4: (lv_value_2_0= ruleDate )
            {
            // InternalCk2.g:767:4: (lv_value_2_0= ruleDate )
            // InternalCk2.g:768:5: lv_value_2_0= ruleDate
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
            						"ck2xtext.Ck2.Date");
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
    // InternalCk2.g:789:1: entryRuleIntegerProperty returns [EObject current=null] : iv_ruleIntegerProperty= ruleIntegerProperty EOF ;
    public final EObject entryRuleIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerProperty = null;


        try {
            // InternalCk2.g:789:56: (iv_ruleIntegerProperty= ruleIntegerProperty EOF )
            // InternalCk2.g:790:2: iv_ruleIntegerProperty= ruleIntegerProperty EOF
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
    // InternalCk2.g:796:1: ruleIntegerProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:802:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalCk2.g:803:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalCk2.g:803:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
            // InternalCk2.g:804:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalCk2.g:804:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:805:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:805:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:806:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:826:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalCk2.g:827:4: (lv_value_2_0= ruleInteger )
            {
            // InternalCk2.g:827:4: (lv_value_2_0= ruleInteger )
            // InternalCk2.g:828:5: lv_value_2_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_2_0());
            				
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
            						"ck2xtext.Ck2.Integer");
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
    // $ANTLR end "ruleIntegerProperty"


    // $ANTLR start "entryRuleDoubleProperty"
    // InternalCk2.g:849:1: entryRuleDoubleProperty returns [EObject current=null] : iv_ruleDoubleProperty= ruleDoubleProperty EOF ;
    public final EObject entryRuleDoubleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleProperty = null;


        try {
            // InternalCk2.g:849:55: (iv_ruleDoubleProperty= ruleDoubleProperty EOF )
            // InternalCk2.g:850:2: iv_ruleDoubleProperty= ruleDoubleProperty EOF
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
    // InternalCk2.g:856:1: ruleDoubleProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) ;
    public final EObject ruleDoubleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:862:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) )
            // InternalCk2.g:863:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) )
            {
            // InternalCk2.g:863:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) )
            // InternalCk2.g:864:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) )
            {
            // InternalCk2.g:864:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:865:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:865:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:866:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoublePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:886:3: ( (lv_value_2_0= ruleDouble ) )
            // InternalCk2.g:887:4: (lv_value_2_0= ruleDouble )
            {
            // InternalCk2.g:887:4: (lv_value_2_0= ruleDouble )
            // InternalCk2.g:888:5: lv_value_2_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_2_0());
            				
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
            						"ck2xtext.Ck2.Double");
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
    // $ANTLR end "ruleDoubleProperty"


    // $ANTLR start "entryRuleListProperty"
    // InternalCk2.g:909:1: entryRuleListProperty returns [EObject current=null] : iv_ruleListProperty= ruleListProperty EOF ;
    public final EObject entryRuleListProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListProperty = null;


        try {
            // InternalCk2.g:909:53: (iv_ruleListProperty= ruleListProperty EOF )
            // InternalCk2.g:910:2: iv_ruleListProperty= ruleListProperty EOF
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
    // InternalCk2.g:916:1: ruleListProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) ) ;
    public final EObject ruleListProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:922:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) ) )
            // InternalCk2.g:923:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) )
            {
            // InternalCk2.g:923:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) )
            // InternalCk2.g:924:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) )
            {
            // InternalCk2.g:924:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:925:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:925:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:926:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getListPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getListPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:946:3: ( (lv_value_2_0= ruleList ) )
            // InternalCk2.g:947:4: (lv_value_2_0= ruleList )
            {
            // InternalCk2.g:947:4: (lv_value_2_0= ruleList )
            // InternalCk2.g:948:5: lv_value_2_0= ruleList
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
    // InternalCk2.g:969:1: entryRuleIdClauseProperty returns [EObject current=null] : iv_ruleIdClauseProperty= ruleIdClauseProperty EOF ;
    public final EObject entryRuleIdClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdClauseProperty = null;


        try {
            // InternalCk2.g:969:57: (iv_ruleIdClauseProperty= ruleIdClauseProperty EOF )
            // InternalCk2.g:970:2: iv_ruleIdClauseProperty= ruleIdClauseProperty EOF
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
    // InternalCk2.g:976:1: ruleIdClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleIdClauseProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:982:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:983:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:983:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:984:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:984:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCk2.g:985:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCk2.g:985:4: (lv_name_0_0= RULE_ID )
            // InternalCk2.g:986:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIdClausePropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdClausePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIdClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1006:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1007:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1007:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1008:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,17,FOLLOW_17); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1020:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCk2.g:1021:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1021:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1022:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIdClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalCk2.g:1047:1: entryRuleIntClauseProperty returns [EObject current=null] : iv_ruleIntClauseProperty= ruleIntClauseProperty EOF ;
    public final EObject entryRuleIntClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntClauseProperty = null;


        try {
            // InternalCk2.g:1047:58: (iv_ruleIntClauseProperty= ruleIntClauseProperty EOF )
            // InternalCk2.g:1048:2: iv_ruleIntClauseProperty= ruleIntClauseProperty EOF
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
    // InternalCk2.g:1054:1: ruleIntClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleIntClauseProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1060:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1061:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1061:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1062:3: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1062:3: ( (lv_name_0_0= RULE_INT ) )
            // InternalCk2.g:1063:4: (lv_name_0_0= RULE_INT )
            {
            // InternalCk2.g:1063:4: (lv_name_0_0= RULE_INT )
            // InternalCk2.g:1064:5: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIntClausePropertyAccess().getNameINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntClausePropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"ck2xtext.Ck2.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIntClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1084:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1085:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1085:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1086:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,17,FOLLOW_17); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1098:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCk2.g:1099:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1099:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1100:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIntClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalCk2.g:1125:1: entryRuleDateClauseProperty returns [EObject current=null] : iv_ruleDateClauseProperty= ruleDateClauseProperty EOF ;
    public final EObject entryRuleDateClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateClauseProperty = null;


        try {
            // InternalCk2.g:1125:59: (iv_ruleDateClauseProperty= ruleDateClauseProperty EOF )
            // InternalCk2.g:1126:2: iv_ruleDateClauseProperty= ruleDateClauseProperty EOF
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
    // InternalCk2.g:1132:1: ruleDateClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDateClauseProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1138:2: ( ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1139:2: ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1139:2: ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1140:3: ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1140:3: ( (lv_name_0_0= ruleDate ) )
            // InternalCk2.g:1141:4: (lv_name_0_0= ruleDate )
            {
            // InternalCk2.g:1141:4: (lv_name_0_0= ruleDate )
            // InternalCk2.g:1142:5: lv_name_0_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDateClausePropertyAccess().getNameDateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateClausePropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ck2xtext.Ck2.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDateClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1163:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1164:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1164:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1165:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,17,FOLLOW_17); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1177:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:1178:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1178:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1179:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDateClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalCk2.g:1204:1: entryRuleProbabilityProperty returns [EObject current=null] : iv_ruleProbabilityProperty= ruleProbabilityProperty EOF ;
    public final EObject entryRuleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityProperty = null;


        try {
            // InternalCk2.g:1204:60: (iv_ruleProbabilityProperty= ruleProbabilityProperty EOF )
            // InternalCk2.g:1205:2: iv_ruleProbabilityProperty= ruleProbabilityProperty EOF
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
    // InternalCk2.g:1211:1: ruleProbabilityProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) ) ;
    public final EObject ruleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1217:2: ( ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) ) )
            // InternalCk2.g:1218:2: ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) )
            {
            // InternalCk2.g:1218:2: ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) )
            // InternalCk2.g:1219:3: ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) )
            {
            // InternalCk2.g:1219:3: ( (lv_key_0_0= RULE_INT ) )
            // InternalCk2.g:1220:4: (lv_key_0_0= RULE_INT )
            {
            // InternalCk2.g:1220:4: (lv_key_0_0= RULE_INT )
            // InternalCk2.g:1221:5: lv_key_0_0= RULE_INT
            {
            lv_key_0_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getProbabilityPropertyAccess().getKeyINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProbabilityPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getProbabilityPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1241:3: ( (lv_value_2_0= ruleListElem ) )
            // InternalCk2.g:1242:4: (lv_value_2_0= ruleListElem )
            {
            // InternalCk2.g:1242:4: (lv_value_2_0= ruleListElem )
            // InternalCk2.g:1243:5: lv_value_2_0= ruleListElem
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\10\uffff\1\23\13\uffff\1\23\1\uffff\1\27\3\uffff";
    static final String dfa_3s = "\1\4\1\23\1\16\1\4\1\uffff\1\4\1\uffff\4\4\4\uffff\2\4\1\uffff\1\4\1\uffff\3\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\5\2\23\1\24\1\uffff\1\21\1\uffff\2\22\2\4\4\uffff\2\23\1\uffff\1\4\1\uffff\1\22\1\4\1\22\1\uffff\1\22\1\uffff";
    static final String dfa_5s = "\4\uffff\1\11\1\uffff\1\1\4\uffff\1\2\1\4\1\3\1\12\2\uffff\1\10\1\uffff\1\6\3\uffff\1\7\1\uffff\1\5";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1",
            "\1\3",
            "\1\4\4\uffff\1\5",
            "\1\10\1\13\1\6\1\14\7\uffff\1\11\1\12\1\7\2\uffff\1\15",
            "",
            "\3\16\10\uffff\2\16\1\4",
            "",
            "\1\20\1\17\1\21\10\uffff\2\21\1\uffff\1\4",
            "\2\23\10\uffff\1\22\3\uffff\1\23",
            "\1\24",
            "\1\24",
            "",
            "",
            "",
            "",
            "\3\21\10\uffff\2\21\1\uffff\1\21\1\4",
            "\3\21\7\uffff\1\25\2\21\1\uffff\1\21\1\4",
            "",
            "\1\26",
            "",
            "\2\23\10\uffff\1\27\3\uffff\1\23",
            "\1\30",
            "\2\27\10\uffff\1\31\3\uffff\1\27",
            "",
            "\3\21\7\uffff\1\4\2\21\1\uffff\1\21",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "346:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_ListProperty_7= ruleListProperty | this_Clause_8= ruleClause | this_ProbabilityProperty_9= ruleProbabilityProperty )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000058070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040030L});

}