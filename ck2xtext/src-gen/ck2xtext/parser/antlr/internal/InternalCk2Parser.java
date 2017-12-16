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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_BOOL", "RULE_HEX", "RULE_DIGIT", "RULE_NON_ASCII_CAP", "RULE_NON_ASCII_LOW", "RULE_ID_PART", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'-'", "'+'", "'f'", "'{'", "'}'", "'='", "'['", "']'", "'=='", "'>='", "'>'", "'<='", "'<'"
    };
    public static final int RULE_HEX=8;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID_PART=12;
    public static final int RULE_NON_ASCII_LOW=11;
    public static final int RULE_ID=5;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=9;
    public static final int RULE_BOOL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
            		
            kw=(Token)match(input,15,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,15,FOLLOW_5); 

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

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // InternalCk2.g:166:4: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCk2.g:172:4: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_5); 

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
    // InternalCk2.g:196:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:202:2: ( (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? ) )
            // InternalCk2.g:203:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? )
            {
            // InternalCk2.g:203:2: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )? )
            // InternalCk2.g:204:3: this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT (kw= 'f' )?
            {

            			newCompositeNode(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_Integer_0=ruleInteger();

            state._fsp--;


            			current.merge(this_Integer_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_6); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		
            // InternalCk2.g:226:3: (kw= 'f' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCk2.g:227:4: kw= 'f'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleList"
    // InternalCk2.g:237:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalCk2.g:237:45: (iv_ruleList= ruleList EOF )
            // InternalCk2.g:238:2: iv_ruleList= ruleList EOF
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
    // InternalCk2.g:244:1: ruleList returns [EObject current=null] : (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_elems_1_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:250:2: ( (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' ) )
            // InternalCk2.g:251:2: (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' )
            {
            // InternalCk2.g:251:2: (otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}' )
            // InternalCk2.g:252:3: otherlv_0= '{' ( (lv_elems_1_0= ruleListElem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCk2.g:256:3: ( (lv_elems_1_0= ruleListElem ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_STRING)||(LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCk2.g:257:4: (lv_elems_1_0= ruleListElem )
            	    {
            	    // InternalCk2.g:257:4: (lv_elems_1_0= ruleListElem )
            	    // InternalCk2.g:258:5: lv_elems_1_0= ruleListElem
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getElemsListElemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCk2.g:283:1: entryRuleListElem returns [String current=null] : iv_ruleListElem= ruleListElem EOF ;
    public final String entryRuleListElem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleListElem = null;


        try {
            // InternalCk2.g:283:48: (iv_ruleListElem= ruleListElem EOF )
            // InternalCk2.g:284:2: iv_ruleListElem= ruleListElem EOF
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
    // InternalCk2.g:290:1: ruleListElem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble ) ;
    public final AntlrDatatypeRuleToken ruleListElem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_Integer_2 = null;

        AntlrDatatypeRuleToken this_Double_3 = null;



        	enterRule();

        try {
            // InternalCk2.g:296:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble ) )
            // InternalCk2.g:297:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble )
            {
            // InternalCk2.g:297:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_Integer_2= ruleInteger | this_Double_3= ruleDouble )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==RULE_INT) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==15) ) {
                        alt5=4;
                    }
                    else if ( (LA5_5==EOF||(LA5_5>=RULE_INT && LA5_5<=RULE_STRING)||(LA5_5>=16 && LA5_5<=17)||LA5_5==20) ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==RULE_INT) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==15) ) {
                        alt5=4;
                    }
                    else if ( (LA5_5==EOF||(LA5_5>=RULE_INT && LA5_5<=RULE_STRING)||(LA5_5>=16 && LA5_5<=17)||LA5_5==20) ) {
                        alt5=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==15) ) {
                    alt5=4;
                }
                else if ( (LA5_5==EOF||(LA5_5>=RULE_INT && LA5_5<=RULE_STRING)||(LA5_5>=16 && LA5_5<=17)||LA5_5==20) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCk2.g:298:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getListElemAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCk2.g:306:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCk2.g:314:3: this_Integer_2= ruleInteger
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
                    // InternalCk2.g:325:3: this_Double_3= ruleDouble
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
    // InternalCk2.g:339:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalCk2.g:339:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalCk2.g:340:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalCk2.g:346:1: ruleProperty returns [EObject current=null] : (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty ) ;
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
            // InternalCk2.g:352:2: ( (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty ) )
            // InternalCk2.g:353:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty )
            {
            // InternalCk2.g:353:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty )
            int alt6=11;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalCk2.g:354:3: this_StringProperty_0= ruleStringProperty
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
                    // InternalCk2.g:363:3: this_IdProperty_1= ruleIdProperty
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
                    // InternalCk2.g:372:3: this_CommandProperty_2= ruleCommandProperty
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
                    // InternalCk2.g:381:3: this_BoolProperty_3= ruleBoolProperty
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
                    // InternalCk2.g:390:3: this_DateProperty_4= ruleDateProperty
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
                    // InternalCk2.g:399:3: this_IntegerProperty_5= ruleIntegerProperty
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
                    // InternalCk2.g:408:3: this_DoubleProperty_6= ruleDoubleProperty
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
                    // InternalCk2.g:417:3: this_HexadecimalProperty_7= ruleHexadecimalProperty
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
                    // InternalCk2.g:426:3: this_ListProperty_8= ruleListProperty
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
                    // InternalCk2.g:435:3: this_Clause_9= ruleClause
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
                    // InternalCk2.g:444:3: this_ProbabilityProperty_10= ruleProbabilityProperty
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
    // InternalCk2.g:456:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalCk2.g:456:47: (iv_ruleClause= ruleClause EOF )
            // InternalCk2.g:457:2: iv_ruleClause= ruleClause EOF
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
    // InternalCk2.g:463:1: ruleClause returns [EObject current=null] : (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject this_IdClauseProperty_0 = null;

        EObject this_IntClauseProperty_1 = null;

        EObject this_DateClauseProperty_2 = null;



        	enterRule();

        try {
            // InternalCk2.g:469:2: ( (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty ) )
            // InternalCk2.g:470:2: (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty )
            {
            // InternalCk2.g:470:2: (this_IdClauseProperty_0= ruleIdClauseProperty | this_IntClauseProperty_1= ruleIntClauseProperty | this_DateClauseProperty_2= ruleDateClauseProperty )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==15) ) {
                    alt7=3;
                }
                else if ( (LA7_2==21) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

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
                    // InternalCk2.g:471:3: this_IdClauseProperty_0= ruleIdClauseProperty
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
                    // InternalCk2.g:480:3: this_IntClauseProperty_1= ruleIntClauseProperty
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
                    // InternalCk2.g:489:3: this_DateClauseProperty_2= ruleDateClauseProperty
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
    // InternalCk2.g:501:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalCk2.g:501:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalCk2.g:502:2: iv_ruleStringProperty= ruleStringProperty EOF
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
    // InternalCk2.g:508:1: ruleStringProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:514:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCk2.g:515:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCk2.g:515:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCk2.g:516:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCk2.g:516:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:517:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:517:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:518:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:538:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCk2.g:539:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCk2.g:539:4: (lv_value_2_0= RULE_STRING )
            // InternalCk2.g:540:5: lv_value_2_0= RULE_STRING
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
    // InternalCk2.g:560:1: entryRuleIdProperty returns [EObject current=null] : iv_ruleIdProperty= ruleIdProperty EOF ;
    public final EObject entryRuleIdProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdProperty = null;


        try {
            // InternalCk2.g:560:51: (iv_ruleIdProperty= ruleIdProperty EOF )
            // InternalCk2.g:561:2: iv_ruleIdProperty= ruleIdProperty EOF
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
    // InternalCk2.g:567:1: ruleIdProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIdProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:573:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) )
            // InternalCk2.g:574:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // InternalCk2.g:574:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            // InternalCk2.g:575:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
            {
            // InternalCk2.g:575:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:576:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:576:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:577:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIdPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:597:3: ( (lv_value_2_0= RULE_ID ) )
            // InternalCk2.g:598:4: (lv_value_2_0= RULE_ID )
            {
            // InternalCk2.g:598:4: (lv_value_2_0= RULE_ID )
            // InternalCk2.g:599:5: lv_value_2_0= RULE_ID
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
    // InternalCk2.g:619:1: entryRuleCommandProperty returns [EObject current=null] : iv_ruleCommandProperty= ruleCommandProperty EOF ;
    public final EObject entryRuleCommandProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandProperty = null;


        try {
            // InternalCk2.g:619:56: (iv_ruleCommandProperty= ruleCommandProperty EOF )
            // InternalCk2.g:620:2: iv_ruleCommandProperty= ruleCommandProperty EOF
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
    // InternalCk2.g:626:1: ruleCommandProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) ;
    public final EObject ruleCommandProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCk2.g:632:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' ) )
            // InternalCk2.g:633:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            {
            // InternalCk2.g:633:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']' )
            // InternalCk2.g:634:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( (lv_value_3_0= RULE_ID ) ) otherlv_4= ']'
            {
            // InternalCk2.g:634:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:635:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:635:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:636:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandPropertyAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandPropertyAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalCk2.g:660:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalCk2.g:661:4: (lv_value_3_0= RULE_ID )
            {
            // InternalCk2.g:661:4: (lv_value_3_0= RULE_ID )
            // InternalCk2.g:662:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalCk2.g:686:1: entryRuleBoolProperty returns [EObject current=null] : iv_ruleBoolProperty= ruleBoolProperty EOF ;
    public final EObject entryRuleBoolProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolProperty = null;


        try {
            // InternalCk2.g:686:53: (iv_ruleBoolProperty= ruleBoolProperty EOF )
            // InternalCk2.g:687:2: iv_ruleBoolProperty= ruleBoolProperty EOF
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
    // InternalCk2.g:693:1: ruleBoolProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) ) ;
    public final EObject ruleBoolProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:699:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) ) )
            // InternalCk2.g:700:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) )
            {
            // InternalCk2.g:700:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) ) )
            // InternalCk2.g:701:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOL ) )
            {
            // InternalCk2.g:701:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:702:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:702:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:703:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:723:3: ( (lv_value_2_0= RULE_BOOL ) )
            // InternalCk2.g:724:4: (lv_value_2_0= RULE_BOOL )
            {
            // InternalCk2.g:724:4: (lv_value_2_0= RULE_BOOL )
            // InternalCk2.g:725:5: lv_value_2_0= RULE_BOOL
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
    // InternalCk2.g:745:1: entryRuleDateProperty returns [EObject current=null] : iv_ruleDateProperty= ruleDateProperty EOF ;
    public final EObject entryRuleDateProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateProperty = null;


        try {
            // InternalCk2.g:745:53: (iv_ruleDateProperty= ruleDateProperty EOF )
            // InternalCk2.g:746:2: iv_ruleDateProperty= ruleDateProperty EOF
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
    // InternalCk2.g:752:1: ruleDateProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) ) ;
    public final EObject ruleDateProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:758:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) ) )
            // InternalCk2.g:759:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) )
            {
            // InternalCk2.g:759:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) ) )
            // InternalCk2.g:760:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDate ) )
            {
            // InternalCk2.g:760:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:761:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:761:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:762:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDatePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:782:3: ( (lv_value_2_0= ruleDate ) )
            // InternalCk2.g:783:4: (lv_value_2_0= ruleDate )
            {
            // InternalCk2.g:783:4: (lv_value_2_0= ruleDate )
            // InternalCk2.g:784:5: lv_value_2_0= ruleDate
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
    // InternalCk2.g:805:1: entryRuleIntegerProperty returns [EObject current=null] : iv_ruleIntegerProperty= ruleIntegerProperty EOF ;
    public final EObject entryRuleIntegerProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerProperty = null;


        try {
            // InternalCk2.g:805:56: (iv_ruleIntegerProperty= ruleIntegerProperty EOF )
            // InternalCk2.g:806:2: iv_ruleIntegerProperty= ruleIntegerProperty EOF
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
    // InternalCk2.g:812:1: ruleIntegerProperty returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) ) ;
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
            // InternalCk2.g:818:2: ( ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) ) )
            // InternalCk2.g:819:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) )
            {
            // InternalCk2.g:819:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt8=2;
                    }
                    break;
                case 27:
                    {
                    alt8=5;
                    }
                    break;
                case 25:
                    {
                    alt8=3;
                    }
                    break;
                case 21:
                    {
                    alt8=1;
                    }
                    break;
                case 28:
                    {
                    alt8=6;
                    }
                    break;
                case 26:
                    {
                    alt8=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCk2.g:820:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:820:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) ) )
                    // InternalCk2.g:821:4: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleInteger ) )
                    {
                    // InternalCk2.g:821:4: ( (lv_key_0_0= RULE_ID ) )
                    // InternalCk2.g:822:5: (lv_key_0_0= RULE_ID )
                    {
                    // InternalCk2.g:822:5: (lv_key_0_0= RULE_ID )
                    // InternalCk2.g:823:6: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0_0());
                    					

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

                    otherlv_1=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalCk2.g:843:4: ( (lv_value_2_0= ruleInteger ) )
                    // InternalCk2.g:844:5: (lv_value_2_0= ruleInteger )
                    {
                    // InternalCk2.g:844:5: (lv_value_2_0= ruleInteger )
                    // InternalCk2.g:845:6: lv_value_2_0= ruleInteger
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
                    							"ck2xtext.Ck2.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:864:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:864:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) ) )
                    // InternalCk2.g:865:4: ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleInteger ) )
                    {
                    // InternalCk2.g:865:4: ( (lv_key_3_0= RULE_ID ) )
                    // InternalCk2.g:866:5: (lv_key_3_0= RULE_ID )
                    {
                    // InternalCk2.g:866:5: (lv_key_3_0= RULE_ID )
                    // InternalCk2.g:867:6: lv_key_3_0= RULE_ID
                    {
                    lv_key_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_key_3_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_3_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntegerPropertyAccess().getEqualsSignEqualsSignKeyword_1_1());
                    			
                    // InternalCk2.g:887:4: ( (lv_value_5_0= ruleInteger ) )
                    // InternalCk2.g:888:5: (lv_value_5_0= ruleInteger )
                    {
                    // InternalCk2.g:888:5: (lv_value_5_0= ruleInteger )
                    // InternalCk2.g:889:6: lv_value_5_0= ruleInteger
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
                    							"ck2xtext.Ck2.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:908:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:908:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) ) )
                    // InternalCk2.g:909:4: ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleInteger ) )
                    {
                    // InternalCk2.g:909:4: ( (lv_key_6_0= RULE_ID ) )
                    // InternalCk2.g:910:5: (lv_key_6_0= RULE_ID )
                    {
                    // InternalCk2.g:910:5: (lv_key_6_0= RULE_ID )
                    // InternalCk2.g:911:6: lv_key_6_0= RULE_ID
                    {
                    lv_key_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_key_6_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_6_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getIntegerPropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1());
                    			
                    // InternalCk2.g:931:4: ( (lv_value_8_0= ruleInteger ) )
                    // InternalCk2.g:932:5: (lv_value_8_0= ruleInteger )
                    {
                    // InternalCk2.g:932:5: (lv_value_8_0= ruleInteger )
                    // InternalCk2.g:933:6: lv_value_8_0= ruleInteger
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
                    							"ck2xtext.Ck2.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:952:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:952:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) ) )
                    // InternalCk2.g:953:4: ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleInteger ) )
                    {
                    // InternalCk2.g:953:4: ( (lv_key_9_0= RULE_ID ) )
                    // InternalCk2.g:954:5: (lv_key_9_0= RULE_ID )
                    {
                    // InternalCk2.g:954:5: (lv_key_9_0= RULE_ID )
                    // InternalCk2.g:955:6: lv_key_9_0= RULE_ID
                    {
                    lv_key_9_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_key_9_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_9_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getIntegerPropertyAccess().getGreaterThanSignKeyword_3_1());
                    			
                    // InternalCk2.g:975:4: ( (lv_value_11_0= ruleInteger ) )
                    // InternalCk2.g:976:5: (lv_value_11_0= ruleInteger )
                    {
                    // InternalCk2.g:976:5: (lv_value_11_0= ruleInteger )
                    // InternalCk2.g:977:6: lv_value_11_0= ruleInteger
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
                    							"ck2xtext.Ck2.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:996:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:996:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) ) )
                    // InternalCk2.g:997:4: ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleInteger ) )
                    {
                    // InternalCk2.g:997:4: ( (lv_key_12_0= RULE_ID ) )
                    // InternalCk2.g:998:5: (lv_key_12_0= RULE_ID )
                    {
                    // InternalCk2.g:998:5: (lv_key_12_0= RULE_ID )
                    // InternalCk2.g:999:6: lv_key_12_0= RULE_ID
                    {
                    lv_key_12_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_key_12_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_12_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getIntegerPropertyAccess().getLessThanSignEqualsSignKeyword_4_1());
                    			
                    // InternalCk2.g:1019:4: ( (lv_value_14_0= ruleInteger ) )
                    // InternalCk2.g:1020:5: (lv_value_14_0= ruleInteger )
                    {
                    // InternalCk2.g:1020:5: (lv_value_14_0= ruleInteger )
                    // InternalCk2.g:1021:6: lv_value_14_0= ruleInteger
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
                    							"ck2xtext.Ck2.Integer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:1040:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) )
                    {
                    // InternalCk2.g:1040:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) ) )
                    // InternalCk2.g:1041:4: ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleInteger ) )
                    {
                    // InternalCk2.g:1041:4: ( (lv_key_15_0= RULE_ID ) )
                    // InternalCk2.g:1042:5: (lv_key_15_0= RULE_ID )
                    {
                    // InternalCk2.g:1042:5: (lv_key_15_0= RULE_ID )
                    // InternalCk2.g:1043:6: lv_key_15_0= RULE_ID
                    {
                    lv_key_15_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_key_15_0, grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntegerPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_15_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getIntegerPropertyAccess().getLessThanSignKeyword_5_1());
                    			
                    // InternalCk2.g:1063:4: ( (lv_value_17_0= ruleInteger ) )
                    // InternalCk2.g:1064:5: (lv_value_17_0= ruleInteger )
                    {
                    // InternalCk2.g:1064:5: (lv_value_17_0= ruleInteger )
                    // InternalCk2.g:1065:6: lv_value_17_0= ruleInteger
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
                    							"ck2xtext.Ck2.Integer");
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
    // InternalCk2.g:1087:1: entryRuleDoubleProperty returns [EObject current=null] : iv_ruleDoubleProperty= ruleDoubleProperty EOF ;
    public final EObject entryRuleDoubleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleProperty = null;


        try {
            // InternalCk2.g:1087:55: (iv_ruleDoubleProperty= ruleDoubleProperty EOF )
            // InternalCk2.g:1088:2: iv_ruleDoubleProperty= ruleDoubleProperty EOF
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
    // InternalCk2.g:1094:1: ruleDoubleProperty returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) ) ;
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
            // InternalCk2.g:1100:2: ( ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) ) )
            // InternalCk2.g:1101:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) )
            {
            // InternalCk2.g:1101:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) ) | ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) ) | ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) ) | ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) ) | ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) ) | ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt9=6;
                    }
                    break;
                case 26:
                    {
                    alt9=4;
                    }
                    break;
                case 24:
                    {
                    alt9=2;
                    }
                    break;
                case 27:
                    {
                    alt9=5;
                    }
                    break;
                case 25:
                    {
                    alt9=3;
                    }
                    break;
                case 21:
                    {
                    alt9=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCk2.g:1102:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1102:3: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) ) )
                    // InternalCk2.g:1103:4: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1103:4: ( (lv_key_0_0= RULE_ID ) )
                    // InternalCk2.g:1104:5: (lv_key_0_0= RULE_ID )
                    {
                    // InternalCk2.g:1104:5: (lv_key_0_0= RULE_ID )
                    // InternalCk2.g:1105:6: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0_0());
                    					

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

                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalCk2.g:1125:4: ( (lv_value_2_0= ruleDouble ) )
                    // InternalCk2.g:1126:5: (lv_value_2_0= ruleDouble )
                    {
                    // InternalCk2.g:1126:5: (lv_value_2_0= ruleDouble )
                    // InternalCk2.g:1127:6: lv_value_2_0= ruleDouble
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
                    							"ck2xtext.Ck2.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:1146:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1146:3: ( ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) ) )
                    // InternalCk2.g:1147:4: ( (lv_key_3_0= RULE_ID ) ) otherlv_4= '==' ( (lv_value_5_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1147:4: ( (lv_key_3_0= RULE_ID ) )
                    // InternalCk2.g:1148:5: (lv_key_3_0= RULE_ID )
                    {
                    // InternalCk2.g:1148:5: (lv_key_3_0= RULE_ID )
                    // InternalCk2.g:1149:6: lv_key_3_0= RULE_ID
                    {
                    lv_key_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_key_3_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_3_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoublePropertyAccess().getEqualsSignEqualsSignKeyword_1_1());
                    			
                    // InternalCk2.g:1169:4: ( (lv_value_5_0= ruleDouble ) )
                    // InternalCk2.g:1170:5: (lv_value_5_0= ruleDouble )
                    {
                    // InternalCk2.g:1170:5: (lv_value_5_0= ruleDouble )
                    // InternalCk2.g:1171:6: lv_value_5_0= ruleDouble
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
                    							"ck2xtext.Ck2.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:1190:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1190:3: ( ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) ) )
                    // InternalCk2.g:1191:4: ( (lv_key_6_0= RULE_ID ) ) otherlv_7= '>=' ( (lv_value_8_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1191:4: ( (lv_key_6_0= RULE_ID ) )
                    // InternalCk2.g:1192:5: (lv_key_6_0= RULE_ID )
                    {
                    // InternalCk2.g:1192:5: (lv_key_6_0= RULE_ID )
                    // InternalCk2.g:1193:6: lv_key_6_0= RULE_ID
                    {
                    lv_key_6_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_key_6_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_6_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getDoublePropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1());
                    			
                    // InternalCk2.g:1213:4: ( (lv_value_8_0= ruleDouble ) )
                    // InternalCk2.g:1214:5: (lv_value_8_0= ruleDouble )
                    {
                    // InternalCk2.g:1214:5: (lv_value_8_0= ruleDouble )
                    // InternalCk2.g:1215:6: lv_value_8_0= ruleDouble
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
                    							"ck2xtext.Ck2.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:1234:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1234:3: ( ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) ) )
                    // InternalCk2.g:1235:4: ( (lv_key_9_0= RULE_ID ) ) otherlv_10= '>' ( (lv_value_11_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1235:4: ( (lv_key_9_0= RULE_ID ) )
                    // InternalCk2.g:1236:5: (lv_key_9_0= RULE_ID )
                    {
                    // InternalCk2.g:1236:5: (lv_key_9_0= RULE_ID )
                    // InternalCk2.g:1237:6: lv_key_9_0= RULE_ID
                    {
                    lv_key_9_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_key_9_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_9_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDoublePropertyAccess().getGreaterThanSignKeyword_3_1());
                    			
                    // InternalCk2.g:1257:4: ( (lv_value_11_0= ruleDouble ) )
                    // InternalCk2.g:1258:5: (lv_value_11_0= ruleDouble )
                    {
                    // InternalCk2.g:1258:5: (lv_value_11_0= ruleDouble )
                    // InternalCk2.g:1259:6: lv_value_11_0= ruleDouble
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
                    							"ck2xtext.Ck2.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:1278:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1278:3: ( ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) ) )
                    // InternalCk2.g:1279:4: ( (lv_key_12_0= RULE_ID ) ) otherlv_13= '<=' ( (lv_value_14_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1279:4: ( (lv_key_12_0= RULE_ID ) )
                    // InternalCk2.g:1280:5: (lv_key_12_0= RULE_ID )
                    {
                    // InternalCk2.g:1280:5: (lv_key_12_0= RULE_ID )
                    // InternalCk2.g:1281:6: lv_key_12_0= RULE_ID
                    {
                    lv_key_12_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_key_12_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_12_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getDoublePropertyAccess().getLessThanSignEqualsSignKeyword_4_1());
                    			
                    // InternalCk2.g:1301:4: ( (lv_value_14_0= ruleDouble ) )
                    // InternalCk2.g:1302:5: (lv_value_14_0= ruleDouble )
                    {
                    // InternalCk2.g:1302:5: (lv_value_14_0= ruleDouble )
                    // InternalCk2.g:1303:6: lv_value_14_0= ruleDouble
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
                    							"ck2xtext.Ck2.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:1322:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) )
                    {
                    // InternalCk2.g:1322:3: ( ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) ) )
                    // InternalCk2.g:1323:4: ( (lv_key_15_0= RULE_ID ) ) otherlv_16= '<' ( (lv_value_17_0= ruleDouble ) )
                    {
                    // InternalCk2.g:1323:4: ( (lv_key_15_0= RULE_ID ) )
                    // InternalCk2.g:1324:5: (lv_key_15_0= RULE_ID )
                    {
                    // InternalCk2.g:1324:5: (lv_key_15_0= RULE_ID )
                    // InternalCk2.g:1325:6: lv_key_15_0= RULE_ID
                    {
                    lv_key_15_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_key_15_0, grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoublePropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_15_0,
                    							"ck2xtext.Ck2.ID");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getDoublePropertyAccess().getLessThanSignKeyword_5_1());
                    			
                    // InternalCk2.g:1345:4: ( (lv_value_17_0= ruleDouble ) )
                    // InternalCk2.g:1346:5: (lv_value_17_0= ruleDouble )
                    {
                    // InternalCk2.g:1346:5: (lv_value_17_0= ruleDouble )
                    // InternalCk2.g:1347:6: lv_value_17_0= ruleDouble
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
                    							"ck2xtext.Ck2.Double");
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
    // InternalCk2.g:1369:1: entryRuleHexadecimalProperty returns [EObject current=null] : iv_ruleHexadecimalProperty= ruleHexadecimalProperty EOF ;
    public final EObject entryRuleHexadecimalProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexadecimalProperty = null;


        try {
            // InternalCk2.g:1369:60: (iv_ruleHexadecimalProperty= ruleHexadecimalProperty EOF )
            // InternalCk2.g:1370:2: iv_ruleHexadecimalProperty= ruleHexadecimalProperty EOF
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
    // InternalCk2.g:1376:1: ruleHexadecimalProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) ) ;
    public final EObject ruleHexadecimalProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCk2.g:1382:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) ) )
            // InternalCk2.g:1383:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) )
            {
            // InternalCk2.g:1383:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) ) )
            // InternalCk2.g:1384:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_HEX ) )
            {
            // InternalCk2.g:1384:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:1385:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:1385:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:1386:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_key_0_0, grammarAccess.getHexadecimalPropertyAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHexadecimalPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"ck2xtext.Ck2.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getHexadecimalPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1406:3: ( (lv_value_2_0= RULE_HEX ) )
            // InternalCk2.g:1407:4: (lv_value_2_0= RULE_HEX )
            {
            // InternalCk2.g:1407:4: (lv_value_2_0= RULE_HEX )
            // InternalCk2.g:1408:5: lv_value_2_0= RULE_HEX
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
            						"ck2xtext.Ck2.HEX");
            				

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
    // InternalCk2.g:1428:1: entryRuleListProperty returns [EObject current=null] : iv_ruleListProperty= ruleListProperty EOF ;
    public final EObject entryRuleListProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListProperty = null;


        try {
            // InternalCk2.g:1428:53: (iv_ruleListProperty= ruleListProperty EOF )
            // InternalCk2.g:1429:2: iv_ruleListProperty= ruleListProperty EOF
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
    // InternalCk2.g:1435:1: ruleListProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) ) ;
    public final EObject ruleListProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1441:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) ) )
            // InternalCk2.g:1442:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) )
            {
            // InternalCk2.g:1442:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) ) )
            // InternalCk2.g:1443:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleList ) )
            {
            // InternalCk2.g:1443:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalCk2.g:1444:4: (lv_key_0_0= RULE_ID )
            {
            // InternalCk2.g:1444:4: (lv_key_0_0= RULE_ID )
            // InternalCk2.g:1445:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getListPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1465:3: ( (lv_value_2_0= ruleList ) )
            // InternalCk2.g:1466:4: (lv_value_2_0= ruleList )
            {
            // InternalCk2.g:1466:4: (lv_value_2_0= ruleList )
            // InternalCk2.g:1467:5: lv_value_2_0= ruleList
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
    // InternalCk2.g:1488:1: entryRuleIdClauseProperty returns [EObject current=null] : iv_ruleIdClauseProperty= ruleIdClauseProperty EOF ;
    public final EObject entryRuleIdClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdClauseProperty = null;


        try {
            // InternalCk2.g:1488:57: (iv_ruleIdClauseProperty= ruleIdClauseProperty EOF )
            // InternalCk2.g:1489:2: iv_ruleIdClauseProperty= ruleIdClauseProperty EOF
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
    // InternalCk2.g:1495:1: ruleIdClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleIdClauseProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1501:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1502:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1502:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1503:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1503:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCk2.g:1504:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCk2.g:1504:4: (lv_name_0_0= RULE_ID )
            // InternalCk2.g:1505:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIdClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1525:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1526:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1526:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1527:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,19,FOLLOW_24); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1539:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCk2.g:1540:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1540:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1541:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIdClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCk2.g:1566:1: entryRuleIntClauseProperty returns [EObject current=null] : iv_ruleIntClauseProperty= ruleIntClauseProperty EOF ;
    public final EObject entryRuleIntClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntClauseProperty = null;


        try {
            // InternalCk2.g:1566:58: (iv_ruleIntClauseProperty= ruleIntClauseProperty EOF )
            // InternalCk2.g:1567:2: iv_ruleIntClauseProperty= ruleIntClauseProperty EOF
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
    // InternalCk2.g:1573:1: ruleIntClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleIntClauseProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1579:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1580:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1580:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1581:3: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1581:3: ( (lv_name_0_0= RULE_INT ) )
            // InternalCk2.g:1582:4: (lv_name_0_0= RULE_INT )
            {
            // InternalCk2.g:1582:4: (lv_name_0_0= RULE_INT )
            // InternalCk2.g:1583:5: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIntClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1603:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1604:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1604:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1605:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,19,FOLLOW_24); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1617:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCk2.g:1618:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1618:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1619:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getIntClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCk2.g:1644:1: entryRuleDateClauseProperty returns [EObject current=null] : iv_ruleDateClauseProperty= ruleDateClauseProperty EOF ;
    public final EObject entryRuleDateClauseProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateClauseProperty = null;


        try {
            // InternalCk2.g:1644:59: (iv_ruleDateClauseProperty= ruleDateClauseProperty EOF )
            // InternalCk2.g:1645:2: iv_ruleDateClauseProperty= ruleDateClauseProperty EOF
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
    // InternalCk2.g:1651:1: ruleDateClauseProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleDateClauseProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1657:2: ( ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalCk2.g:1658:2: ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalCk2.g:1658:2: ( ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalCk2.g:1659:3: ( (lv_name_0_0= ruleDate ) ) otherlv_1= '=' ( (lv_value_2_0= '{' ) ) ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            // InternalCk2.g:1659:3: ( (lv_name_0_0= ruleDate ) )
            // InternalCk2.g:1660:4: (lv_name_0_0= ruleDate )
            {
            // InternalCk2.g:1660:4: (lv_name_0_0= ruleDate )
            // InternalCk2.g:1661:5: lv_name_0_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDateClausePropertyAccess().getNameDateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDateClausePropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1682:3: ( (lv_value_2_0= '{' ) )
            // InternalCk2.g:1683:4: (lv_value_2_0= '{' )
            {
            // InternalCk2.g:1683:4: (lv_value_2_0= '{' )
            // InternalCk2.g:1684:5: lv_value_2_0= '{'
            {
            lv_value_2_0=(Token)match(input,19,FOLLOW_24); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateClausePropertyRule());
            					}
            					setWithLastConsumed(current, "value", lv_value_2_0, "{");
            				

            }


            }

            // InternalCk2.g:1696:3: ( (lv_properties_3_0= ruleProperty ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCk2.g:1697:4: (lv_properties_3_0= ruleProperty )
            	    {
            	    // InternalCk2.g:1697:4: (lv_properties_3_0= ruleProperty )
            	    // InternalCk2.g:1698:5: lv_properties_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDateClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalCk2.g:1723:1: entryRuleProbabilityProperty returns [EObject current=null] : iv_ruleProbabilityProperty= ruleProbabilityProperty EOF ;
    public final EObject entryRuleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbabilityProperty = null;


        try {
            // InternalCk2.g:1723:60: (iv_ruleProbabilityProperty= ruleProbabilityProperty EOF )
            // InternalCk2.g:1724:2: iv_ruleProbabilityProperty= ruleProbabilityProperty EOF
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
    // InternalCk2.g:1730:1: ruleProbabilityProperty returns [EObject current=null] : ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) ) ;
    public final EObject ruleProbabilityProperty() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalCk2.g:1736:2: ( ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) ) )
            // InternalCk2.g:1737:2: ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) )
            {
            // InternalCk2.g:1737:2: ( ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) ) )
            // InternalCk2.g:1738:3: ( (lv_key_0_0= RULE_INT ) ) otherlv_1= '=' ( (lv_value_2_0= ruleListElem ) )
            {
            // InternalCk2.g:1738:3: ( (lv_key_0_0= RULE_INT ) )
            // InternalCk2.g:1739:4: (lv_key_0_0= RULE_INT )
            {
            // InternalCk2.g:1739:4: (lv_key_0_0= RULE_INT )
            // InternalCk2.g:1740:5: lv_key_0_0= RULE_INT
            {
            lv_key_0_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProbabilityPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalCk2.g:1760:3: ( (lv_value_2_0= ruleListElem ) )
            // InternalCk2.g:1761:4: (lv_value_2_0= ruleListElem )
            {
            // InternalCk2.g:1761:4: (lv_value_2_0= ruleListElem )
            // InternalCk2.g:1762:5: lv_value_2_0= ruleListElem
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\14\uffff\1\47\11\uffff\1\47\2\uffff\1\47\2\uffff\1\47\2\uffff\1\47\2\uffff\1\47\6\uffff\1\47\2\uffff\1\52\2\uffff";
    static final String dfa_3s = "\1\4\1\25\1\17\7\4\1\uffff\2\4\2\uffff\2\4\3\uffff\17\4\1\uffff\2\4\2\uffff\2\4\1\uffff\3\4\1\uffff";
    static final String dfa_4s = "\1\5\1\34\1\25\1\26\5\21\1\23\1\uffff\2\24\2\uffff\2\4\3\uffff\2\4\1\24\2\4\1\24\2\4\1\24\2\4\1\24\2\4\1\24\1\uffff\1\34\1\25\2\uffff\1\4\1\24\1\uffff\1\4\2\24\1\uffff";
    static final String dfa_5s = "\12\uffff\1\12\2\uffff\1\10\1\2\2\uffff\1\4\1\3\1\1\17\uffff\1\13\2\uffff\1\11\1\6\2\uffff\1\7\3\uffff\1\5";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1",
            "\1\3\2\uffff\1\4\1\7\1\6\1\5\1\10",
            "\1\12\5\uffff\1\11",
            "\1\14\1\16\1\23\1\21\1\15\7\uffff\1\17\1\20\1\uffff\1\13\2\uffff\1\22",
            "\1\26\13\uffff\1\24\1\25",
            "\1\31\13\uffff\1\27\1\30",
            "\1\34\13\uffff\1\32\1\33",
            "\1\37\13\uffff\1\35\1\36",
            "\1\42\13\uffff\1\40\1\41",
            "\3\43\11\uffff\2\43\1\uffff\1\12",
            "",
            "\1\45\1\44\1\46\11\uffff\2\46\2\uffff\1\12",
            "\2\47\11\uffff\1\50\4\uffff\1\47",
            "",
            "",
            "\1\51",
            "\1\51",
            "",
            "",
            "",
            "\1\26",
            "\1\26",
            "\2\47\11\uffff\1\52\4\uffff\1\47",
            "\1\31",
            "\1\31",
            "\2\47\11\uffff\1\52\4\uffff\1\47",
            "\1\34",
            "\1\34",
            "\2\47\11\uffff\1\52\4\uffff\1\47",
            "\1\37",
            "\1\37",
            "\2\47\11\uffff\1\52\4\uffff\1\47",
            "\1\42",
            "\1\42",
            "\2\47\11\uffff\1\52\4\uffff\1\47",
            "",
            "\3\46\11\uffff\2\46\2\uffff\1\46\1\12\2\uffff\5\12",
            "\3\46\10\uffff\1\53\2\46\2\uffff\1\46\1\12",
            "",
            "",
            "\1\54",
            "\2\47\11\uffff\1\52\4\uffff\1\47",
            "",
            "\1\55",
            "\2\52\11\uffff\1\56\2\uffff\1\52\1\uffff\1\52",
            "\3\46\10\uffff\1\12\3\46\1\uffff\1\46",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "353:2: (this_StringProperty_0= ruleStringProperty | this_IdProperty_1= ruleIdProperty | this_CommandProperty_2= ruleCommandProperty | this_BoolProperty_3= ruleBoolProperty | this_DateProperty_4= ruleDateProperty | this_IntegerProperty_5= ruleIntegerProperty | this_DoubleProperty_6= ruleDoubleProperty | this_HexadecimalProperty_7= ruleHexadecimalProperty | this_ListProperty_8= ruleListProperty | this_Clause_9= ruleClause | this_ProbabilityProperty_10= ruleProbabilityProperty )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000130070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100030L});

}