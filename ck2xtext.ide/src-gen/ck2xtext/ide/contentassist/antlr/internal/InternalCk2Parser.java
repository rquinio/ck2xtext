package ck2xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ck2xtext.services.Ck2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCk2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_DIGIT", "RULE_NON_ASCII_CAP", "RULE_NON_ASCII_LOW", "RULE_ID_PART", "RULE_SL_COMMENT", "RULE_WS", "'-'", "'+'", "'.'", "'{'", "'}'", "'='", "'['", "']'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=8;
    public static final int RULE_BOOL=7;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(Ck2GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalCk2.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCk2.g:54:1: ( ruleModel EOF )
            // InternalCk2.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCk2.g:62:1: ruleModel : ( ( ( rule__Model__PropertiesAssignment ) ) ( ( rule__Model__PropertiesAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:66:2: ( ( ( ( rule__Model__PropertiesAssignment ) ) ( ( rule__Model__PropertiesAssignment )* ) ) )
            // InternalCk2.g:67:2: ( ( ( rule__Model__PropertiesAssignment ) ) ( ( rule__Model__PropertiesAssignment )* ) )
            {
            // InternalCk2.g:67:2: ( ( ( rule__Model__PropertiesAssignment ) ) ( ( rule__Model__PropertiesAssignment )* ) )
            // InternalCk2.g:68:3: ( ( rule__Model__PropertiesAssignment ) ) ( ( rule__Model__PropertiesAssignment )* )
            {
            // InternalCk2.g:68:3: ( ( rule__Model__PropertiesAssignment ) )
            // InternalCk2.g:69:4: ( rule__Model__PropertiesAssignment )
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment()); 
            // InternalCk2.g:70:4: ( rule__Model__PropertiesAssignment )
            // InternalCk2.g:70:5: rule__Model__PropertiesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__PropertiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPropertiesAssignment()); 

            }

            // InternalCk2.g:73:3: ( ( rule__Model__PropertiesAssignment )* )
            // InternalCk2.g:74:4: ( rule__Model__PropertiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getPropertiesAssignment()); 
            // InternalCk2.g:75:4: ( rule__Model__PropertiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCk2.g:75:5: rule__Model__PropertiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__PropertiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPropertiesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDate"
    // InternalCk2.g:85:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalCk2.g:86:1: ( ruleDate EOF )
            // InternalCk2.g:87:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalCk2.g:94:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:98:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalCk2.g:99:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalCk2.g:99:2: ( ( rule__Date__Group__0 ) )
            // InternalCk2.g:100:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalCk2.g:101:3: ( rule__Date__Group__0 )
            // InternalCk2.g:101:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleInteger"
    // InternalCk2.g:110:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalCk2.g:111:1: ( ruleInteger EOF )
            // InternalCk2.g:112:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalCk2.g:119:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:123:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalCk2.g:124:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalCk2.g:124:2: ( ( rule__Integer__Group__0 ) )
            // InternalCk2.g:125:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalCk2.g:126:3: ( rule__Integer__Group__0 )
            // InternalCk2.g:126:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDouble"
    // InternalCk2.g:135:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalCk2.g:136:1: ( ruleDouble EOF )
            // InternalCk2.g:137:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalCk2.g:144:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:148:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalCk2.g:149:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalCk2.g:149:2: ( ( rule__Double__Group__0 ) )
            // InternalCk2.g:150:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalCk2.g:151:3: ( rule__Double__Group__0 )
            // InternalCk2.g:151:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleList"
    // InternalCk2.g:160:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalCk2.g:161:1: ( ruleList EOF )
            // InternalCk2.g:162:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalCk2.g:169:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:173:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalCk2.g:174:2: ( ( rule__List__Group__0 ) )
            {
            // InternalCk2.g:174:2: ( ( rule__List__Group__0 ) )
            // InternalCk2.g:175:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalCk2.g:176:3: ( rule__List__Group__0 )
            // InternalCk2.g:176:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleListElem"
    // InternalCk2.g:185:1: entryRuleListElem : ruleListElem EOF ;
    public final void entryRuleListElem() throws RecognitionException {
        try {
            // InternalCk2.g:186:1: ( ruleListElem EOF )
            // InternalCk2.g:187:1: ruleListElem EOF
            {
             before(grammarAccess.getListElemRule()); 
            pushFollow(FOLLOW_1);
            ruleListElem();

            state._fsp--;

             after(grammarAccess.getListElemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListElem"


    // $ANTLR start "ruleListElem"
    // InternalCk2.g:194:1: ruleListElem : ( ( rule__ListElem__Alternatives ) ) ;
    public final void ruleListElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:198:2: ( ( ( rule__ListElem__Alternatives ) ) )
            // InternalCk2.g:199:2: ( ( rule__ListElem__Alternatives ) )
            {
            // InternalCk2.g:199:2: ( ( rule__ListElem__Alternatives ) )
            // InternalCk2.g:200:3: ( rule__ListElem__Alternatives )
            {
             before(grammarAccess.getListElemAccess().getAlternatives()); 
            // InternalCk2.g:201:3: ( rule__ListElem__Alternatives )
            // InternalCk2.g:201:4: rule__ListElem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListElem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListElemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListElem"


    // $ANTLR start "entryRuleProperty"
    // InternalCk2.g:210:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalCk2.g:211:1: ( ruleProperty EOF )
            // InternalCk2.g:212:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalCk2.g:219:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:223:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalCk2.g:224:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalCk2.g:224:2: ( ( rule__Property__Alternatives ) )
            // InternalCk2.g:225:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalCk2.g:226:3: ( rule__Property__Alternatives )
            // InternalCk2.g:226:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleClause"
    // InternalCk2.g:235:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalCk2.g:236:1: ( ruleClause EOF )
            // InternalCk2.g:237:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalCk2.g:244:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:248:2: ( ( ( rule__Clause__Alternatives ) ) )
            // InternalCk2.g:249:2: ( ( rule__Clause__Alternatives ) )
            {
            // InternalCk2.g:249:2: ( ( rule__Clause__Alternatives ) )
            // InternalCk2.g:250:3: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // InternalCk2.g:251:3: ( rule__Clause__Alternatives )
            // InternalCk2.g:251:4: rule__Clause__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleStringProperty"
    // InternalCk2.g:260:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // InternalCk2.g:261:1: ( ruleStringProperty EOF )
            // InternalCk2.g:262:1: ruleStringProperty EOF
            {
             before(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleStringProperty();

            state._fsp--;

             after(grammarAccess.getStringPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // InternalCk2.g:269:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:273:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // InternalCk2.g:274:2: ( ( rule__StringProperty__Group__0 ) )
            {
            // InternalCk2.g:274:2: ( ( rule__StringProperty__Group__0 ) )
            // InternalCk2.g:275:3: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // InternalCk2.g:276:3: ( rule__StringProperty__Group__0 )
            // InternalCk2.g:276:4: rule__StringProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleIdProperty"
    // InternalCk2.g:285:1: entryRuleIdProperty : ruleIdProperty EOF ;
    public final void entryRuleIdProperty() throws RecognitionException {
        try {
            // InternalCk2.g:286:1: ( ruleIdProperty EOF )
            // InternalCk2.g:287:1: ruleIdProperty EOF
            {
             before(grammarAccess.getIdPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleIdProperty();

            state._fsp--;

             after(grammarAccess.getIdPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdProperty"


    // $ANTLR start "ruleIdProperty"
    // InternalCk2.g:294:1: ruleIdProperty : ( ( rule__IdProperty__Group__0 ) ) ;
    public final void ruleIdProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:298:2: ( ( ( rule__IdProperty__Group__0 ) ) )
            // InternalCk2.g:299:2: ( ( rule__IdProperty__Group__0 ) )
            {
            // InternalCk2.g:299:2: ( ( rule__IdProperty__Group__0 ) )
            // InternalCk2.g:300:3: ( rule__IdProperty__Group__0 )
            {
             before(grammarAccess.getIdPropertyAccess().getGroup()); 
            // InternalCk2.g:301:3: ( rule__IdProperty__Group__0 )
            // InternalCk2.g:301:4: rule__IdProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdProperty"


    // $ANTLR start "entryRuleCommandProperty"
    // InternalCk2.g:310:1: entryRuleCommandProperty : ruleCommandProperty EOF ;
    public final void entryRuleCommandProperty() throws RecognitionException {
        try {
            // InternalCk2.g:311:1: ( ruleCommandProperty EOF )
            // InternalCk2.g:312:1: ruleCommandProperty EOF
            {
             before(grammarAccess.getCommandPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandProperty();

            state._fsp--;

             after(grammarAccess.getCommandPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandProperty"


    // $ANTLR start "ruleCommandProperty"
    // InternalCk2.g:319:1: ruleCommandProperty : ( ( rule__CommandProperty__Group__0 ) ) ;
    public final void ruleCommandProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:323:2: ( ( ( rule__CommandProperty__Group__0 ) ) )
            // InternalCk2.g:324:2: ( ( rule__CommandProperty__Group__0 ) )
            {
            // InternalCk2.g:324:2: ( ( rule__CommandProperty__Group__0 ) )
            // InternalCk2.g:325:3: ( rule__CommandProperty__Group__0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getGroup()); 
            // InternalCk2.g:326:3: ( rule__CommandProperty__Group__0 )
            // InternalCk2.g:326:4: rule__CommandProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandProperty"


    // $ANTLR start "entryRuleBoolProperty"
    // InternalCk2.g:335:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // InternalCk2.g:336:1: ( ruleBoolProperty EOF )
            // InternalCk2.g:337:1: ruleBoolProperty EOF
            {
             before(grammarAccess.getBoolPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolProperty();

            state._fsp--;

             after(grammarAccess.getBoolPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolProperty"


    // $ANTLR start "ruleBoolProperty"
    // InternalCk2.g:344:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:348:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // InternalCk2.g:349:2: ( ( rule__BoolProperty__Group__0 ) )
            {
            // InternalCk2.g:349:2: ( ( rule__BoolProperty__Group__0 ) )
            // InternalCk2.g:350:3: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // InternalCk2.g:351:3: ( rule__BoolProperty__Group__0 )
            // InternalCk2.g:351:4: rule__BoolProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolProperty"


    // $ANTLR start "entryRuleDateProperty"
    // InternalCk2.g:360:1: entryRuleDateProperty : ruleDateProperty EOF ;
    public final void entryRuleDateProperty() throws RecognitionException {
        try {
            // InternalCk2.g:361:1: ( ruleDateProperty EOF )
            // InternalCk2.g:362:1: ruleDateProperty EOF
            {
             before(grammarAccess.getDatePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleDateProperty();

            state._fsp--;

             after(grammarAccess.getDatePropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateProperty"


    // $ANTLR start "ruleDateProperty"
    // InternalCk2.g:369:1: ruleDateProperty : ( ( rule__DateProperty__Group__0 ) ) ;
    public final void ruleDateProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:373:2: ( ( ( rule__DateProperty__Group__0 ) ) )
            // InternalCk2.g:374:2: ( ( rule__DateProperty__Group__0 ) )
            {
            // InternalCk2.g:374:2: ( ( rule__DateProperty__Group__0 ) )
            // InternalCk2.g:375:3: ( rule__DateProperty__Group__0 )
            {
             before(grammarAccess.getDatePropertyAccess().getGroup()); 
            // InternalCk2.g:376:3: ( rule__DateProperty__Group__0 )
            // InternalCk2.g:376:4: rule__DateProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateProperty"


    // $ANTLR start "entryRuleIntegerProperty"
    // InternalCk2.g:385:1: entryRuleIntegerProperty : ruleIntegerProperty EOF ;
    public final void entryRuleIntegerProperty() throws RecognitionException {
        try {
            // InternalCk2.g:386:1: ( ruleIntegerProperty EOF )
            // InternalCk2.g:387:1: ruleIntegerProperty EOF
            {
             before(grammarAccess.getIntegerPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerProperty();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerProperty"


    // $ANTLR start "ruleIntegerProperty"
    // InternalCk2.g:394:1: ruleIntegerProperty : ( ( rule__IntegerProperty__Group__0 ) ) ;
    public final void ruleIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:398:2: ( ( ( rule__IntegerProperty__Group__0 ) ) )
            // InternalCk2.g:399:2: ( ( rule__IntegerProperty__Group__0 ) )
            {
            // InternalCk2.g:399:2: ( ( rule__IntegerProperty__Group__0 ) )
            // InternalCk2.g:400:3: ( rule__IntegerProperty__Group__0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getGroup()); 
            // InternalCk2.g:401:3: ( rule__IntegerProperty__Group__0 )
            // InternalCk2.g:401:4: rule__IntegerProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerProperty"


    // $ANTLR start "entryRuleDoubleProperty"
    // InternalCk2.g:410:1: entryRuleDoubleProperty : ruleDoubleProperty EOF ;
    public final void entryRuleDoubleProperty() throws RecognitionException {
        try {
            // InternalCk2.g:411:1: ( ruleDoubleProperty EOF )
            // InternalCk2.g:412:1: ruleDoubleProperty EOF
            {
             before(grammarAccess.getDoublePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleProperty();

            state._fsp--;

             after(grammarAccess.getDoublePropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleProperty"


    // $ANTLR start "ruleDoubleProperty"
    // InternalCk2.g:419:1: ruleDoubleProperty : ( ( rule__DoubleProperty__Group__0 ) ) ;
    public final void ruleDoubleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:423:2: ( ( ( rule__DoubleProperty__Group__0 ) ) )
            // InternalCk2.g:424:2: ( ( rule__DoubleProperty__Group__0 ) )
            {
            // InternalCk2.g:424:2: ( ( rule__DoubleProperty__Group__0 ) )
            // InternalCk2.g:425:3: ( rule__DoubleProperty__Group__0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getGroup()); 
            // InternalCk2.g:426:3: ( rule__DoubleProperty__Group__0 )
            // InternalCk2.g:426:4: rule__DoubleProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleProperty"


    // $ANTLR start "entryRuleListProperty"
    // InternalCk2.g:435:1: entryRuleListProperty : ruleListProperty EOF ;
    public final void entryRuleListProperty() throws RecognitionException {
        try {
            // InternalCk2.g:436:1: ( ruleListProperty EOF )
            // InternalCk2.g:437:1: ruleListProperty EOF
            {
             before(grammarAccess.getListPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleListProperty();

            state._fsp--;

             after(grammarAccess.getListPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListProperty"


    // $ANTLR start "ruleListProperty"
    // InternalCk2.g:444:1: ruleListProperty : ( ( rule__ListProperty__Group__0 ) ) ;
    public final void ruleListProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:448:2: ( ( ( rule__ListProperty__Group__0 ) ) )
            // InternalCk2.g:449:2: ( ( rule__ListProperty__Group__0 ) )
            {
            // InternalCk2.g:449:2: ( ( rule__ListProperty__Group__0 ) )
            // InternalCk2.g:450:3: ( rule__ListProperty__Group__0 )
            {
             before(grammarAccess.getListPropertyAccess().getGroup()); 
            // InternalCk2.g:451:3: ( rule__ListProperty__Group__0 )
            // InternalCk2.g:451:4: rule__ListProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListProperty"


    // $ANTLR start "entryRuleIdClauseProperty"
    // InternalCk2.g:460:1: entryRuleIdClauseProperty : ruleIdClauseProperty EOF ;
    public final void entryRuleIdClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:461:1: ( ruleIdClauseProperty EOF )
            // InternalCk2.g:462:1: ruleIdClauseProperty EOF
            {
             before(grammarAccess.getIdClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleIdClauseProperty();

            state._fsp--;

             after(grammarAccess.getIdClausePropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdClauseProperty"


    // $ANTLR start "ruleIdClauseProperty"
    // InternalCk2.g:469:1: ruleIdClauseProperty : ( ( rule__IdClauseProperty__Group__0 ) ) ;
    public final void ruleIdClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:473:2: ( ( ( rule__IdClauseProperty__Group__0 ) ) )
            // InternalCk2.g:474:2: ( ( rule__IdClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:474:2: ( ( rule__IdClauseProperty__Group__0 ) )
            // InternalCk2.g:475:3: ( rule__IdClauseProperty__Group__0 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getGroup()); 
            // InternalCk2.g:476:3: ( rule__IdClauseProperty__Group__0 )
            // InternalCk2.g:476:4: rule__IdClauseProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdClausePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdClauseProperty"


    // $ANTLR start "entryRuleIntClauseProperty"
    // InternalCk2.g:485:1: entryRuleIntClauseProperty : ruleIntClauseProperty EOF ;
    public final void entryRuleIntClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:486:1: ( ruleIntClauseProperty EOF )
            // InternalCk2.g:487:1: ruleIntClauseProperty EOF
            {
             before(grammarAccess.getIntClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleIntClauseProperty();

            state._fsp--;

             after(grammarAccess.getIntClausePropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntClauseProperty"


    // $ANTLR start "ruleIntClauseProperty"
    // InternalCk2.g:494:1: ruleIntClauseProperty : ( ( rule__IntClauseProperty__Group__0 ) ) ;
    public final void ruleIntClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:498:2: ( ( ( rule__IntClauseProperty__Group__0 ) ) )
            // InternalCk2.g:499:2: ( ( rule__IntClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:499:2: ( ( rule__IntClauseProperty__Group__0 ) )
            // InternalCk2.g:500:3: ( rule__IntClauseProperty__Group__0 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getGroup()); 
            // InternalCk2.g:501:3: ( rule__IntClauseProperty__Group__0 )
            // InternalCk2.g:501:4: rule__IntClauseProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntClausePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntClauseProperty"


    // $ANTLR start "entryRuleDateClauseProperty"
    // InternalCk2.g:510:1: entryRuleDateClauseProperty : ruleDateClauseProperty EOF ;
    public final void entryRuleDateClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:511:1: ( ruleDateClauseProperty EOF )
            // InternalCk2.g:512:1: ruleDateClauseProperty EOF
            {
             before(grammarAccess.getDateClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleDateClauseProperty();

            state._fsp--;

             after(grammarAccess.getDateClausePropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateClauseProperty"


    // $ANTLR start "ruleDateClauseProperty"
    // InternalCk2.g:519:1: ruleDateClauseProperty : ( ( rule__DateClauseProperty__Group__0 ) ) ;
    public final void ruleDateClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:523:2: ( ( ( rule__DateClauseProperty__Group__0 ) ) )
            // InternalCk2.g:524:2: ( ( rule__DateClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:524:2: ( ( rule__DateClauseProperty__Group__0 ) )
            // InternalCk2.g:525:3: ( rule__DateClauseProperty__Group__0 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getGroup()); 
            // InternalCk2.g:526:3: ( rule__DateClauseProperty__Group__0 )
            // InternalCk2.g:526:4: rule__DateClauseProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateClausePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateClauseProperty"


    // $ANTLR start "entryRuleProbabilityProperty"
    // InternalCk2.g:535:1: entryRuleProbabilityProperty : ruleProbabilityProperty EOF ;
    public final void entryRuleProbabilityProperty() throws RecognitionException {
        try {
            // InternalCk2.g:536:1: ( ruleProbabilityProperty EOF )
            // InternalCk2.g:537:1: ruleProbabilityProperty EOF
            {
             before(grammarAccess.getProbabilityPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProbabilityProperty();

            state._fsp--;

             after(grammarAccess.getProbabilityPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProbabilityProperty"


    // $ANTLR start "ruleProbabilityProperty"
    // InternalCk2.g:544:1: ruleProbabilityProperty : ( ( rule__ProbabilityProperty__Group__0 ) ) ;
    public final void ruleProbabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:548:2: ( ( ( rule__ProbabilityProperty__Group__0 ) ) )
            // InternalCk2.g:549:2: ( ( rule__ProbabilityProperty__Group__0 ) )
            {
            // InternalCk2.g:549:2: ( ( rule__ProbabilityProperty__Group__0 ) )
            // InternalCk2.g:550:3: ( rule__ProbabilityProperty__Group__0 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getGroup()); 
            // InternalCk2.g:551:3: ( rule__ProbabilityProperty__Group__0 )
            // InternalCk2.g:551:4: rule__ProbabilityProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilityProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbabilityProperty"


    // $ANTLR start "rule__Integer__Alternatives_0"
    // InternalCk2.g:559:1: rule__Integer__Alternatives_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__Integer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:563:1: ( ( '-' ) | ( '+' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCk2.g:564:2: ( '-' )
                    {
                    // InternalCk2.g:564:2: ( '-' )
                    // InternalCk2.g:565:3: '-'
                    {
                     before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:570:2: ( '+' )
                    {
                    // InternalCk2.g:570:2: ( '+' )
                    // InternalCk2.g:571:3: '+'
                    {
                     before(grammarAccess.getIntegerAccess().getPlusSignKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIntegerAccess().getPlusSignKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Alternatives_0"


    // $ANTLR start "rule__ListElem__Alternatives"
    // InternalCk2.g:580:1: rule__ListElem__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleDouble ) );
    public final void rule__ListElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:584:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleDouble ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_INT) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||(LA3_5>=RULE_ID && LA3_5<=RULE_INT)||(LA3_5>=14 && LA3_5<=15)||LA3_5==18) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==16) ) {
                        alt3=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==RULE_INT) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||(LA3_5>=RULE_ID && LA3_5<=RULE_INT)||(LA3_5>=14 && LA3_5<=15)||LA3_5==18) ) {
                        alt3=3;
                    }
                    else if ( (LA3_5==16) ) {
                        alt3=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==EOF||(LA3_5>=RULE_ID && LA3_5<=RULE_INT)||(LA3_5>=14 && LA3_5<=15)||LA3_5==18) ) {
                    alt3=3;
                }
                else if ( (LA3_5==16) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCk2.g:585:2: ( RULE_ID )
                    {
                    // InternalCk2.g:585:2: ( RULE_ID )
                    // InternalCk2.g:586:3: RULE_ID
                    {
                     before(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:591:2: ( RULE_STRING )
                    {
                    // InternalCk2.g:591:2: ( RULE_STRING )
                    // InternalCk2.g:592:3: RULE_STRING
                    {
                     before(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:597:2: ( ruleInteger )
                    {
                    // InternalCk2.g:597:2: ( ruleInteger )
                    // InternalCk2.g:598:3: ruleInteger
                    {
                     before(grammarAccess.getListElemAccess().getIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getListElemAccess().getIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:603:2: ( ruleDouble )
                    {
                    // InternalCk2.g:603:2: ( ruleDouble )
                    // InternalCk2.g:604:3: ruleDouble
                    {
                     before(grammarAccess.getListElemAccess().getDoubleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getListElemAccess().getDoubleParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElem__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalCk2.g:613:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:617:1: ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) )
            int alt4=10;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCk2.g:618:2: ( ruleStringProperty )
                    {
                    // InternalCk2.g:618:2: ( ruleStringProperty )
                    // InternalCk2.g:619:3: ruleStringProperty
                    {
                     before(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getStringPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:624:2: ( ruleIdProperty )
                    {
                    // InternalCk2.g:624:2: ( ruleIdProperty )
                    // InternalCk2.g:625:3: ruleIdProperty
                    {
                     before(grammarAccess.getPropertyAccess().getIdPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIdProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getIdPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:630:2: ( ruleCommandProperty )
                    {
                    // InternalCk2.g:630:2: ( ruleCommandProperty )
                    // InternalCk2.g:631:3: ruleCommandProperty
                    {
                     before(grammarAccess.getPropertyAccess().getCommandPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getCommandPropertyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:636:2: ( ruleBoolProperty )
                    {
                    // InternalCk2.g:636:2: ( ruleBoolProperty )
                    // InternalCk2.g:637:3: ruleBoolProperty
                    {
                     before(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getBoolPropertyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:642:2: ( ruleDateProperty )
                    {
                    // InternalCk2.g:642:2: ( ruleDateProperty )
                    // InternalCk2.g:643:3: ruleDateProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDatePropertyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDateProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getDatePropertyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:648:2: ( ruleIntegerProperty )
                    {
                    // InternalCk2.g:648:2: ( ruleIntegerProperty )
                    // InternalCk2.g:649:3: ruleIntegerProperty
                    {
                     before(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getIntegerPropertyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCk2.g:654:2: ( ruleDoubleProperty )
                    {
                    // InternalCk2.g:654:2: ( ruleDoubleProperty )
                    // InternalCk2.g:655:3: ruleDoubleProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDoublePropertyParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getDoublePropertyParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCk2.g:660:2: ( ruleListProperty )
                    {
                    // InternalCk2.g:660:2: ( ruleListProperty )
                    // InternalCk2.g:661:3: ruleListProperty
                    {
                     before(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleListProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCk2.g:666:2: ( ruleClause )
                    {
                    // InternalCk2.g:666:2: ( ruleClause )
                    // InternalCk2.g:667:3: ruleClause
                    {
                     before(grammarAccess.getPropertyAccess().getClauseParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleClause();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getClauseParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCk2.g:672:2: ( ruleProbabilityProperty )
                    {
                    // InternalCk2.g:672:2: ( ruleProbabilityProperty )
                    // InternalCk2.g:673:3: ruleProbabilityProperty
                    {
                     before(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleProbabilityProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Clause__Alternatives"
    // InternalCk2.g:682:1: rule__Clause__Alternatives : ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:686:1: ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==19) ) {
                    alt5=2;
                }
                else if ( (LA5_2==16) ) {
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
                    // InternalCk2.g:687:2: ( ruleIdClauseProperty )
                    {
                    // InternalCk2.g:687:2: ( ruleIdClauseProperty )
                    // InternalCk2.g:688:3: ruleIdClauseProperty
                    {
                     before(grammarAccess.getClauseAccess().getIdClausePropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIdClauseProperty();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getIdClausePropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:693:2: ( ruleIntClauseProperty )
                    {
                    // InternalCk2.g:693:2: ( ruleIntClauseProperty )
                    // InternalCk2.g:694:3: ruleIntClauseProperty
                    {
                     before(grammarAccess.getClauseAccess().getIntClausePropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntClauseProperty();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getIntClausePropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:699:2: ( ruleDateClauseProperty )
                    {
                    // InternalCk2.g:699:2: ( ruleDateClauseProperty )
                    // InternalCk2.g:700:3: ruleDateClauseProperty
                    {
                     before(grammarAccess.getClauseAccess().getDateClausePropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDateClauseProperty();

                    state._fsp--;

                     after(grammarAccess.getClauseAccess().getDateClausePropertyParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clause__Alternatives"


    // $ANTLR start "rule__Date__Group__0"
    // InternalCk2.g:709:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:713:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalCk2.g:714:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalCk2.g:721:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:725:1: ( ( RULE_INT ) )
            // InternalCk2.g:726:1: ( RULE_INT )
            {
            // InternalCk2.g:726:1: ( RULE_INT )
            // InternalCk2.g:727:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalCk2.g:736:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:740:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalCk2.g:741:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalCk2.g:748:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:752:1: ( ( '.' ) )
            // InternalCk2.g:753:1: ( '.' )
            {
            // InternalCk2.g:753:1: ( '.' )
            // InternalCk2.g:754:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalCk2.g:763:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:767:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalCk2.g:768:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalCk2.g:775:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:779:1: ( ( RULE_INT ) )
            // InternalCk2.g:780:1: ( RULE_INT )
            {
            // InternalCk2.g:780:1: ( RULE_INT )
            // InternalCk2.g:781:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalCk2.g:790:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:794:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalCk2.g:795:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalCk2.g:802:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:806:1: ( ( '.' ) )
            // InternalCk2.g:807:1: ( '.' )
            {
            // InternalCk2.g:807:1: ( '.' )
            // InternalCk2.g:808:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalCk2.g:817:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:821:1: ( rule__Date__Group__4__Impl )
            // InternalCk2.g:822:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalCk2.g:828:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:832:1: ( ( RULE_INT ) )
            // InternalCk2.g:833:1: ( RULE_INT )
            {
            // InternalCk2.g:833:1: ( RULE_INT )
            // InternalCk2.g:834:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalCk2.g:844:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:848:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalCk2.g:849:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalCk2.g:856:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__Alternatives_0 )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:860:1: ( ( ( rule__Integer__Alternatives_0 )? ) )
            // InternalCk2.g:861:1: ( ( rule__Integer__Alternatives_0 )? )
            {
            // InternalCk2.g:861:1: ( ( rule__Integer__Alternatives_0 )? )
            // InternalCk2.g:862:2: ( rule__Integer__Alternatives_0 )?
            {
             before(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            // InternalCk2.g:863:2: ( rule__Integer__Alternatives_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCk2.g:863:3: rule__Integer__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Integer__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalCk2.g:871:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:875:1: ( rule__Integer__Group__1__Impl )
            // InternalCk2.g:876:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalCk2.g:882:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:886:1: ( ( RULE_INT ) )
            // InternalCk2.g:887:1: ( RULE_INT )
            {
            // InternalCk2.g:887:1: ( RULE_INT )
            // InternalCk2.g:888:2: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalCk2.g:898:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:902:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalCk2.g:903:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalCk2.g:910:1: rule__Double__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:914:1: ( ( ruleInteger ) )
            // InternalCk2.g:915:1: ( ruleInteger )
            {
            // InternalCk2.g:915:1: ( ruleInteger )
            // InternalCk2.g:916:2: ruleInteger
            {
             before(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getDoubleAccess().getIntegerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalCk2.g:925:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:929:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalCk2.g:930:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalCk2.g:937:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:941:1: ( ( '.' ) )
            // InternalCk2.g:942:1: ( '.' )
            {
            // InternalCk2.g:942:1: ( '.' )
            // InternalCk2.g:943:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalCk2.g:952:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:956:1: ( rule__Double__Group__2__Impl )
            // InternalCk2.g:957:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalCk2.g:963:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:967:1: ( ( RULE_INT ) )
            // InternalCk2.g:968:1: ( RULE_INT )
            {
            // InternalCk2.g:968:1: ( RULE_INT )
            // InternalCk2.g:969:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalCk2.g:979:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:983:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalCk2.g:984:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalCk2.g:991:1: rule__List__Group__0__Impl : ( '{' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:995:1: ( ( '{' ) )
            // InternalCk2.g:996:1: ( '{' )
            {
            // InternalCk2.g:996:1: ( '{' )
            // InternalCk2.g:997:2: '{'
            {
             before(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getListAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalCk2.g:1006:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1010:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalCk2.g:1011:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__List__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalCk2.g:1018:1: rule__List__Group__1__Impl : ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1022:1: ( ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) )
            // InternalCk2.g:1023:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            {
            // InternalCk2.g:1023:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            // InternalCk2.g:1024:2: ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* )
            {
            // InternalCk2.g:1024:2: ( ( rule__List__ElemsAssignment_1 ) )
            // InternalCk2.g:1025:3: ( rule__List__ElemsAssignment_1 )
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:1026:3: ( rule__List__ElemsAssignment_1 )
            // InternalCk2.g:1026:4: rule__List__ElemsAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__List__ElemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getElemsAssignment_1()); 

            }

            // InternalCk2.g:1029:2: ( ( rule__List__ElemsAssignment_1 )* )
            // InternalCk2.g:1030:3: ( rule__List__ElemsAssignment_1 )*
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:1031:3: ( rule__List__ElemsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=14 && LA7_0<=15)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCk2.g:1031:4: rule__List__ElemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__List__ElemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getListAccess().getElemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // InternalCk2.g:1040:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1044:1: ( rule__List__Group__2__Impl )
            // InternalCk2.g:1045:2: rule__List__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // InternalCk2.g:1051:1: rule__List__Group__2__Impl : ( '}' ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1055:1: ( ( '}' ) )
            // InternalCk2.g:1056:1: ( '}' )
            {
            // InternalCk2.g:1056:1: ( '}' )
            // InternalCk2.g:1057:2: '}'
            {
             before(grammarAccess.getListAccess().getRightCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getListAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__StringProperty__Group__0"
    // InternalCk2.g:1067:1: rule__StringProperty__Group__0 : rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1071:1: ( rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 )
            // InternalCk2.g:1072:2: rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StringProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__0"


    // $ANTLR start "rule__StringProperty__Group__0__Impl"
    // InternalCk2.g:1079:1: rule__StringProperty__Group__0__Impl : ( ( rule__StringProperty__KeyAssignment_0 ) ) ;
    public final void rule__StringProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1083:1: ( ( ( rule__StringProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1084:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1084:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1085:2: ( rule__StringProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1086:2: ( rule__StringProperty__KeyAssignment_0 )
            // InternalCk2.g:1086:3: rule__StringProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__0__Impl"


    // $ANTLR start "rule__StringProperty__Group__1"
    // InternalCk2.g:1094:1: rule__StringProperty__Group__1 : rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1098:1: ( rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 )
            // InternalCk2.g:1099:2: rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StringProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__1"


    // $ANTLR start "rule__StringProperty__Group__1__Impl"
    // InternalCk2.g:1106:1: rule__StringProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__StringProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1110:1: ( ( '=' ) )
            // InternalCk2.g:1111:1: ( '=' )
            {
            // InternalCk2.g:1111:1: ( '=' )
            // InternalCk2.g:1112:2: '='
            {
             before(grammarAccess.getStringPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStringPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__1__Impl"


    // $ANTLR start "rule__StringProperty__Group__2"
    // InternalCk2.g:1121:1: rule__StringProperty__Group__2 : rule__StringProperty__Group__2__Impl ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1125:1: ( rule__StringProperty__Group__2__Impl )
            // InternalCk2.g:1126:2: rule__StringProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__2"


    // $ANTLR start "rule__StringProperty__Group__2__Impl"
    // InternalCk2.g:1132:1: rule__StringProperty__Group__2__Impl : ( ( rule__StringProperty__ValueAssignment_2 ) ) ;
    public final void rule__StringProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1136:1: ( ( ( rule__StringProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1137:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1137:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1138:2: ( rule__StringProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1139:2: ( rule__StringProperty__ValueAssignment_2 )
            // InternalCk2.g:1139:3: rule__StringProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__Group__2__Impl"


    // $ANTLR start "rule__IdProperty__Group__0"
    // InternalCk2.g:1148:1: rule__IdProperty__Group__0 : rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 ;
    public final void rule__IdProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1152:1: ( rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 )
            // InternalCk2.g:1153:2: rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IdProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__Group__0"


    // $ANTLR start "rule__IdProperty__Group__0__Impl"
    // InternalCk2.g:1160:1: rule__IdProperty__Group__0__Impl : ( ( rule__IdProperty__KeyAssignment_0 ) ) ;
    public final void rule__IdProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1164:1: ( ( ( rule__IdProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1165:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1165:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1166:2: ( rule__IdProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getIdPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1167:2: ( rule__IdProperty__KeyAssignment_0 )
            // InternalCk2.g:1167:3: rule__IdProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IdProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__Group__0__Impl"


    // $ANTLR start "rule__IdProperty__Group__1"
    // InternalCk2.g:1175:1: rule__IdProperty__Group__1 : rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 ;
    public final void rule__IdProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1179:1: ( rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 )
            // InternalCk2.g:1180:2: rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IdProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__Group__1"


    // $ANTLR start "rule__IdProperty__Group__1__Impl"
    // InternalCk2.g:1187:1: rule__IdProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1191:1: ( ( '=' ) )
            // InternalCk2.g:1192:1: ( '=' )
            {
            // InternalCk2.g:1192:1: ( '=' )
            // InternalCk2.g:1193:2: '='
            {
             before(grammarAccess.getIdPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIdPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__Group__1__Impl"


    // $ANTLR start "rule__IdProperty__Group__2"
    // InternalCk2.g:1202:1: rule__IdProperty__Group__2 : rule__IdProperty__Group__2__Impl ;
    public final void rule__IdProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1206:1: ( rule__IdProperty__Group__2__Impl )
            // InternalCk2.g:1207:2: rule__IdProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__Group__2"


    // $ANTLR start "rule__IdProperty__Group__2__Impl"
    // InternalCk2.g:1213:1: rule__IdProperty__Group__2__Impl : ( ( rule__IdProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1217:1: ( ( ( rule__IdProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1218:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1218:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1219:2: ( rule__IdProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1220:2: ( rule__IdProperty__ValueAssignment_2 )
            // InternalCk2.g:1220:3: rule__IdProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IdProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIdPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__Group__2__Impl"


    // $ANTLR start "rule__CommandProperty__Group__0"
    // InternalCk2.g:1229:1: rule__CommandProperty__Group__0 : rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 ;
    public final void rule__CommandProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1233:1: ( rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 )
            // InternalCk2.g:1234:2: rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CommandProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__0"


    // $ANTLR start "rule__CommandProperty__Group__0__Impl"
    // InternalCk2.g:1241:1: rule__CommandProperty__Group__0__Impl : ( ( rule__CommandProperty__KeyAssignment_0 ) ) ;
    public final void rule__CommandProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1245:1: ( ( ( rule__CommandProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1246:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1246:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1247:2: ( rule__CommandProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1248:2: ( rule__CommandProperty__KeyAssignment_0 )
            // InternalCk2.g:1248:3: rule__CommandProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommandProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__0__Impl"


    // $ANTLR start "rule__CommandProperty__Group__1"
    // InternalCk2.g:1256:1: rule__CommandProperty__Group__1 : rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 ;
    public final void rule__CommandProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1260:1: ( rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 )
            // InternalCk2.g:1261:2: rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CommandProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__1"


    // $ANTLR start "rule__CommandProperty__Group__1__Impl"
    // InternalCk2.g:1268:1: rule__CommandProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__CommandProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1272:1: ( ( '=' ) )
            // InternalCk2.g:1273:1: ( '=' )
            {
            // InternalCk2.g:1273:1: ( '=' )
            // InternalCk2.g:1274:2: '='
            {
             before(grammarAccess.getCommandPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCommandPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__1__Impl"


    // $ANTLR start "rule__CommandProperty__Group__2"
    // InternalCk2.g:1283:1: rule__CommandProperty__Group__2 : rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 ;
    public final void rule__CommandProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1287:1: ( rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 )
            // InternalCk2.g:1288:2: rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CommandProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__2"


    // $ANTLR start "rule__CommandProperty__Group__2__Impl"
    // InternalCk2.g:1295:1: rule__CommandProperty__Group__2__Impl : ( '[' ) ;
    public final void rule__CommandProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1299:1: ( ( '[' ) )
            // InternalCk2.g:1300:1: ( '[' )
            {
            // InternalCk2.g:1300:1: ( '[' )
            // InternalCk2.g:1301:2: '['
            {
             before(grammarAccess.getCommandPropertyAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCommandPropertyAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__2__Impl"


    // $ANTLR start "rule__CommandProperty__Group__3"
    // InternalCk2.g:1310:1: rule__CommandProperty__Group__3 : rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 ;
    public final void rule__CommandProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1314:1: ( rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 )
            // InternalCk2.g:1315:2: rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__CommandProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__3"


    // $ANTLR start "rule__CommandProperty__Group__3__Impl"
    // InternalCk2.g:1322:1: rule__CommandProperty__Group__3__Impl : ( ( rule__CommandProperty__ValueAssignment_3 ) ) ;
    public final void rule__CommandProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1326:1: ( ( ( rule__CommandProperty__ValueAssignment_3 ) ) )
            // InternalCk2.g:1327:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            {
            // InternalCk2.g:1327:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            // InternalCk2.g:1328:2: ( rule__CommandProperty__ValueAssignment_3 )
            {
             before(grammarAccess.getCommandPropertyAccess().getValueAssignment_3()); 
            // InternalCk2.g:1329:2: ( rule__CommandProperty__ValueAssignment_3 )
            // InternalCk2.g:1329:3: rule__CommandProperty__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommandProperty__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandPropertyAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__3__Impl"


    // $ANTLR start "rule__CommandProperty__Group__4"
    // InternalCk2.g:1337:1: rule__CommandProperty__Group__4 : rule__CommandProperty__Group__4__Impl ;
    public final void rule__CommandProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1341:1: ( rule__CommandProperty__Group__4__Impl )
            // InternalCk2.g:1342:2: rule__CommandProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__4"


    // $ANTLR start "rule__CommandProperty__Group__4__Impl"
    // InternalCk2.g:1348:1: rule__CommandProperty__Group__4__Impl : ( ']' ) ;
    public final void rule__CommandProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1352:1: ( ( ']' ) )
            // InternalCk2.g:1353:1: ( ']' )
            {
            // InternalCk2.g:1353:1: ( ']' )
            // InternalCk2.g:1354:2: ']'
            {
             before(grammarAccess.getCommandPropertyAccess().getRightSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCommandPropertyAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__Group__4__Impl"


    // $ANTLR start "rule__BoolProperty__Group__0"
    // InternalCk2.g:1364:1: rule__BoolProperty__Group__0 : rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1368:1: ( rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 )
            // InternalCk2.g:1369:2: rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__BoolProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__Group__0"


    // $ANTLR start "rule__BoolProperty__Group__0__Impl"
    // InternalCk2.g:1376:1: rule__BoolProperty__Group__0__Impl : ( ( rule__BoolProperty__KeyAssignment_0 ) ) ;
    public final void rule__BoolProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1380:1: ( ( ( rule__BoolProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1381:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1381:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1382:2: ( rule__BoolProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1383:2: ( rule__BoolProperty__KeyAssignment_0 )
            // InternalCk2.g:1383:3: rule__BoolProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__Group__0__Impl"


    // $ANTLR start "rule__BoolProperty__Group__1"
    // InternalCk2.g:1391:1: rule__BoolProperty__Group__1 : rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1395:1: ( rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 )
            // InternalCk2.g:1396:2: rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BoolProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__Group__1"


    // $ANTLR start "rule__BoolProperty__Group__1__Impl"
    // InternalCk2.g:1403:1: rule__BoolProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__BoolProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1407:1: ( ( '=' ) )
            // InternalCk2.g:1408:1: ( '=' )
            {
            // InternalCk2.g:1408:1: ( '=' )
            // InternalCk2.g:1409:2: '='
            {
             before(grammarAccess.getBoolPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoolPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__Group__1__Impl"


    // $ANTLR start "rule__BoolProperty__Group__2"
    // InternalCk2.g:1418:1: rule__BoolProperty__Group__2 : rule__BoolProperty__Group__2__Impl ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1422:1: ( rule__BoolProperty__Group__2__Impl )
            // InternalCk2.g:1423:2: rule__BoolProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__Group__2"


    // $ANTLR start "rule__BoolProperty__Group__2__Impl"
    // InternalCk2.g:1429:1: rule__BoolProperty__Group__2__Impl : ( ( rule__BoolProperty__ValueAssignment_2 ) ) ;
    public final void rule__BoolProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1433:1: ( ( ( rule__BoolProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1434:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1434:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1435:2: ( rule__BoolProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1436:2: ( rule__BoolProperty__ValueAssignment_2 )
            // InternalCk2.g:1436:3: rule__BoolProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BoolProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoolPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__Group__2__Impl"


    // $ANTLR start "rule__DateProperty__Group__0"
    // InternalCk2.g:1445:1: rule__DateProperty__Group__0 : rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 ;
    public final void rule__DateProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1449:1: ( rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 )
            // InternalCk2.g:1450:2: rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DateProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__Group__0"


    // $ANTLR start "rule__DateProperty__Group__0__Impl"
    // InternalCk2.g:1457:1: rule__DateProperty__Group__0__Impl : ( ( rule__DateProperty__KeyAssignment_0 ) ) ;
    public final void rule__DateProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1461:1: ( ( ( rule__DateProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1462:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1462:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1463:2: ( rule__DateProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getDatePropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1464:2: ( rule__DateProperty__KeyAssignment_0 )
            // InternalCk2.g:1464:3: rule__DateProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DateProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDatePropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__Group__0__Impl"


    // $ANTLR start "rule__DateProperty__Group__1"
    // InternalCk2.g:1472:1: rule__DateProperty__Group__1 : rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 ;
    public final void rule__DateProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1476:1: ( rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 )
            // InternalCk2.g:1477:2: rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DateProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__Group__1"


    // $ANTLR start "rule__DateProperty__Group__1__Impl"
    // InternalCk2.g:1484:1: rule__DateProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1488:1: ( ( '=' ) )
            // InternalCk2.g:1489:1: ( '=' )
            {
            // InternalCk2.g:1489:1: ( '=' )
            // InternalCk2.g:1490:2: '='
            {
             before(grammarAccess.getDatePropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDatePropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__Group__1__Impl"


    // $ANTLR start "rule__DateProperty__Group__2"
    // InternalCk2.g:1499:1: rule__DateProperty__Group__2 : rule__DateProperty__Group__2__Impl ;
    public final void rule__DateProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1503:1: ( rule__DateProperty__Group__2__Impl )
            // InternalCk2.g:1504:2: rule__DateProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__Group__2"


    // $ANTLR start "rule__DateProperty__Group__2__Impl"
    // InternalCk2.g:1510:1: rule__DateProperty__Group__2__Impl : ( ( rule__DateProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1514:1: ( ( ( rule__DateProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1515:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1515:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1516:2: ( rule__DateProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDatePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1517:2: ( rule__DateProperty__ValueAssignment_2 )
            // InternalCk2.g:1517:3: rule__DateProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DateProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatePropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__Group__2__Impl"


    // $ANTLR start "rule__IntegerProperty__Group__0"
    // InternalCk2.g:1526:1: rule__IntegerProperty__Group__0 : rule__IntegerProperty__Group__0__Impl rule__IntegerProperty__Group__1 ;
    public final void rule__IntegerProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1530:1: ( rule__IntegerProperty__Group__0__Impl rule__IntegerProperty__Group__1 )
            // InternalCk2.g:1531:2: rule__IntegerProperty__Group__0__Impl rule__IntegerProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IntegerProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__Group__0"


    // $ANTLR start "rule__IntegerProperty__Group__0__Impl"
    // InternalCk2.g:1538:1: rule__IntegerProperty__Group__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_0 ) ) ;
    public final void rule__IntegerProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1542:1: ( ( ( rule__IntegerProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1543:1: ( ( rule__IntegerProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1543:1: ( ( rule__IntegerProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1544:2: ( rule__IntegerProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1545:2: ( rule__IntegerProperty__KeyAssignment_0 )
            // InternalCk2.g:1545:3: rule__IntegerProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__Group__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group__1"
    // InternalCk2.g:1553:1: rule__IntegerProperty__Group__1 : rule__IntegerProperty__Group__1__Impl rule__IntegerProperty__Group__2 ;
    public final void rule__IntegerProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1557:1: ( rule__IntegerProperty__Group__1__Impl rule__IntegerProperty__Group__2 )
            // InternalCk2.g:1558:2: rule__IntegerProperty__Group__1__Impl rule__IntegerProperty__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__IntegerProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__Group__1"


    // $ANTLR start "rule__IntegerProperty__Group__1__Impl"
    // InternalCk2.g:1565:1: rule__IntegerProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IntegerProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1569:1: ( ( '=' ) )
            // InternalCk2.g:1570:1: ( '=' )
            {
            // InternalCk2.g:1570:1: ( '=' )
            // InternalCk2.g:1571:2: '='
            {
             before(grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__Group__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group__2"
    // InternalCk2.g:1580:1: rule__IntegerProperty__Group__2 : rule__IntegerProperty__Group__2__Impl ;
    public final void rule__IntegerProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1584:1: ( rule__IntegerProperty__Group__2__Impl )
            // InternalCk2.g:1585:2: rule__IntegerProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__Group__2"


    // $ANTLR start "rule__IntegerProperty__Group__2__Impl"
    // InternalCk2.g:1591:1: rule__IntegerProperty__Group__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_2 ) ) ;
    public final void rule__IntegerProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1595:1: ( ( ( rule__IntegerProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1596:1: ( ( rule__IntegerProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1596:1: ( ( rule__IntegerProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1597:2: ( rule__IntegerProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1598:2: ( rule__IntegerProperty__ValueAssignment_2 )
            // InternalCk2.g:1598:3: rule__IntegerProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__Group__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group__0"
    // InternalCk2.g:1607:1: rule__DoubleProperty__Group__0 : rule__DoubleProperty__Group__0__Impl rule__DoubleProperty__Group__1 ;
    public final void rule__DoubleProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1611:1: ( rule__DoubleProperty__Group__0__Impl rule__DoubleProperty__Group__1 )
            // InternalCk2.g:1612:2: rule__DoubleProperty__Group__0__Impl rule__DoubleProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DoubleProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__Group__0"


    // $ANTLR start "rule__DoubleProperty__Group__0__Impl"
    // InternalCk2.g:1619:1: rule__DoubleProperty__Group__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_0 ) ) ;
    public final void rule__DoubleProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1623:1: ( ( ( rule__DoubleProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1624:1: ( ( rule__DoubleProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1624:1: ( ( rule__DoubleProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1625:2: ( rule__DoubleProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1626:2: ( rule__DoubleProperty__KeyAssignment_0 )
            // InternalCk2.g:1626:3: rule__DoubleProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__Group__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group__1"
    // InternalCk2.g:1634:1: rule__DoubleProperty__Group__1 : rule__DoubleProperty__Group__1__Impl rule__DoubleProperty__Group__2 ;
    public final void rule__DoubleProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1638:1: ( rule__DoubleProperty__Group__1__Impl rule__DoubleProperty__Group__2 )
            // InternalCk2.g:1639:2: rule__DoubleProperty__Group__1__Impl rule__DoubleProperty__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DoubleProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__Group__1"


    // $ANTLR start "rule__DoubleProperty__Group__1__Impl"
    // InternalCk2.g:1646:1: rule__DoubleProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DoubleProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1650:1: ( ( '=' ) )
            // InternalCk2.g:1651:1: ( '=' )
            {
            // InternalCk2.g:1651:1: ( '=' )
            // InternalCk2.g:1652:2: '='
            {
             before(grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__Group__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group__2"
    // InternalCk2.g:1661:1: rule__DoubleProperty__Group__2 : rule__DoubleProperty__Group__2__Impl ;
    public final void rule__DoubleProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1665:1: ( rule__DoubleProperty__Group__2__Impl )
            // InternalCk2.g:1666:2: rule__DoubleProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__Group__2"


    // $ANTLR start "rule__DoubleProperty__Group__2__Impl"
    // InternalCk2.g:1672:1: rule__DoubleProperty__Group__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_2 ) ) ;
    public final void rule__DoubleProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1676:1: ( ( ( rule__DoubleProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1677:1: ( ( rule__DoubleProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1677:1: ( ( rule__DoubleProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1678:2: ( rule__DoubleProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1679:2: ( rule__DoubleProperty__ValueAssignment_2 )
            // InternalCk2.g:1679:3: rule__DoubleProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__Group__2__Impl"


    // $ANTLR start "rule__ListProperty__Group__0"
    // InternalCk2.g:1688:1: rule__ListProperty__Group__0 : rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 ;
    public final void rule__ListProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1692:1: ( rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 )
            // InternalCk2.g:1693:2: rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ListProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__Group__0"


    // $ANTLR start "rule__ListProperty__Group__0__Impl"
    // InternalCk2.g:1700:1: rule__ListProperty__Group__0__Impl : ( ( rule__ListProperty__KeyAssignment_0 ) ) ;
    public final void rule__ListProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1704:1: ( ( ( rule__ListProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1705:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1705:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1706:2: ( rule__ListProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getListPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1707:2: ( rule__ListProperty__KeyAssignment_0 )
            // InternalCk2.g:1707:3: rule__ListProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__Group__0__Impl"


    // $ANTLR start "rule__ListProperty__Group__1"
    // InternalCk2.g:1715:1: rule__ListProperty__Group__1 : rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 ;
    public final void rule__ListProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1719:1: ( rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 )
            // InternalCk2.g:1720:2: rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ListProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__Group__1"


    // $ANTLR start "rule__ListProperty__Group__1__Impl"
    // InternalCk2.g:1727:1: rule__ListProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ListProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1731:1: ( ( '=' ) )
            // InternalCk2.g:1732:1: ( '=' )
            {
            // InternalCk2.g:1732:1: ( '=' )
            // InternalCk2.g:1733:2: '='
            {
             before(grammarAccess.getListPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getListPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__Group__1__Impl"


    // $ANTLR start "rule__ListProperty__Group__2"
    // InternalCk2.g:1742:1: rule__ListProperty__Group__2 : rule__ListProperty__Group__2__Impl ;
    public final void rule__ListProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1746:1: ( rule__ListProperty__Group__2__Impl )
            // InternalCk2.g:1747:2: rule__ListProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__Group__2"


    // $ANTLR start "rule__ListProperty__Group__2__Impl"
    // InternalCk2.g:1753:1: rule__ListProperty__Group__2__Impl : ( ( rule__ListProperty__ValueAssignment_2 ) ) ;
    public final void rule__ListProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1757:1: ( ( ( rule__ListProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1758:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1758:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1759:2: ( rule__ListProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getListPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1760:2: ( rule__ListProperty__ValueAssignment_2 )
            // InternalCk2.g:1760:3: rule__ListProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__Group__2__Impl"


    // $ANTLR start "rule__IdClauseProperty__Group__0"
    // InternalCk2.g:1769:1: rule__IdClauseProperty__Group__0 : rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 ;
    public final void rule__IdClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1773:1: ( rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 )
            // InternalCk2.g:1774:2: rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IdClauseProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__0"


    // $ANTLR start "rule__IdClauseProperty__Group__0__Impl"
    // InternalCk2.g:1781:1: rule__IdClauseProperty__Group__0__Impl : ( ( rule__IdClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IdClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1785:1: ( ( ( rule__IdClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:1786:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:1786:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:1787:2: ( rule__IdClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:1788:2: ( rule__IdClauseProperty__NameAssignment_0 )
            // InternalCk2.g:1788:3: rule__IdClauseProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdClausePropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__0__Impl"


    // $ANTLR start "rule__IdClauseProperty__Group__1"
    // InternalCk2.g:1796:1: rule__IdClauseProperty__Group__1 : rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 ;
    public final void rule__IdClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1800:1: ( rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 )
            // InternalCk2.g:1801:2: rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__IdClauseProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__1"


    // $ANTLR start "rule__IdClauseProperty__Group__1__Impl"
    // InternalCk2.g:1808:1: rule__IdClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1812:1: ( ( '=' ) )
            // InternalCk2.g:1813:1: ( '=' )
            {
            // InternalCk2.g:1813:1: ( '=' )
            // InternalCk2.g:1814:2: '='
            {
             before(grammarAccess.getIdClausePropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIdClausePropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__1__Impl"


    // $ANTLR start "rule__IdClauseProperty__Group__2"
    // InternalCk2.g:1823:1: rule__IdClauseProperty__Group__2 : rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 ;
    public final void rule__IdClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1827:1: ( rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 )
            // InternalCk2.g:1828:2: rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__IdClauseProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__2"


    // $ANTLR start "rule__IdClauseProperty__Group__2__Impl"
    // InternalCk2.g:1835:1: rule__IdClauseProperty__Group__2__Impl : ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1839:1: ( ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1840:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1840:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1841:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1842:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:1842:3: rule__IdClauseProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIdClausePropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__2__Impl"


    // $ANTLR start "rule__IdClauseProperty__Group__3"
    // InternalCk2.g:1850:1: rule__IdClauseProperty__Group__3 : rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 ;
    public final void rule__IdClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1854:1: ( rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 )
            // InternalCk2.g:1855:2: rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__IdClauseProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__3"


    // $ANTLR start "rule__IdClauseProperty__Group__3__Impl"
    // InternalCk2.g:1862:1: rule__IdClauseProperty__Group__3__Impl : ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IdClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1866:1: ( ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:1867:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:1867:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:1868:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIdClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:1869:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCk2.g:1869:3: rule__IdClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IdClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIdClausePropertyAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__3__Impl"


    // $ANTLR start "rule__IdClauseProperty__Group__4"
    // InternalCk2.g:1877:1: rule__IdClauseProperty__Group__4 : rule__IdClauseProperty__Group__4__Impl ;
    public final void rule__IdClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1881:1: ( rule__IdClauseProperty__Group__4__Impl )
            // InternalCk2.g:1882:2: rule__IdClauseProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IdClauseProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__4"


    // $ANTLR start "rule__IdClauseProperty__Group__4__Impl"
    // InternalCk2.g:1888:1: rule__IdClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IdClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1892:1: ( ( '}' ) )
            // InternalCk2.g:1893:1: ( '}' )
            {
            // InternalCk2.g:1893:1: ( '}' )
            // InternalCk2.g:1894:2: '}'
            {
             before(grammarAccess.getIdClausePropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIdClausePropertyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__Group__4__Impl"


    // $ANTLR start "rule__IntClauseProperty__Group__0"
    // InternalCk2.g:1904:1: rule__IntClauseProperty__Group__0 : rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 ;
    public final void rule__IntClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1908:1: ( rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 )
            // InternalCk2.g:1909:2: rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IntClauseProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__0"


    // $ANTLR start "rule__IntClauseProperty__Group__0__Impl"
    // InternalCk2.g:1916:1: rule__IntClauseProperty__Group__0__Impl : ( ( rule__IntClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IntClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1920:1: ( ( ( rule__IntClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:1921:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:1921:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:1922:2: ( rule__IntClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:1923:2: ( rule__IntClauseProperty__NameAssignment_0 )
            // InternalCk2.g:1923:3: rule__IntClauseProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntClausePropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__0__Impl"


    // $ANTLR start "rule__IntClauseProperty__Group__1"
    // InternalCk2.g:1931:1: rule__IntClauseProperty__Group__1 : rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 ;
    public final void rule__IntClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1935:1: ( rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 )
            // InternalCk2.g:1936:2: rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__IntClauseProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__1"


    // $ANTLR start "rule__IntClauseProperty__Group__1__Impl"
    // InternalCk2.g:1943:1: rule__IntClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IntClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1947:1: ( ( '=' ) )
            // InternalCk2.g:1948:1: ( '=' )
            {
            // InternalCk2.g:1948:1: ( '=' )
            // InternalCk2.g:1949:2: '='
            {
             before(grammarAccess.getIntClausePropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntClausePropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__1__Impl"


    // $ANTLR start "rule__IntClauseProperty__Group__2"
    // InternalCk2.g:1958:1: rule__IntClauseProperty__Group__2 : rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 ;
    public final void rule__IntClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1962:1: ( rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 )
            // InternalCk2.g:1963:2: rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__IntClauseProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__2"


    // $ANTLR start "rule__IntClauseProperty__Group__2__Impl"
    // InternalCk2.g:1970:1: rule__IntClauseProperty__Group__2__Impl : ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IntClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1974:1: ( ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1975:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1975:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1976:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1977:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:1977:3: rule__IntClauseProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntClausePropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__2__Impl"


    // $ANTLR start "rule__IntClauseProperty__Group__3"
    // InternalCk2.g:1985:1: rule__IntClauseProperty__Group__3 : rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 ;
    public final void rule__IntClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1989:1: ( rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 )
            // InternalCk2.g:1990:2: rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__IntClauseProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__3"


    // $ANTLR start "rule__IntClauseProperty__Group__3__Impl"
    // InternalCk2.g:1997:1: rule__IntClauseProperty__Group__3__Impl : ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IntClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2001:1: ( ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2002:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2002:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2003:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIntClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2004:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:2004:3: rule__IntClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IntClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getIntClausePropertyAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__3__Impl"


    // $ANTLR start "rule__IntClauseProperty__Group__4"
    // InternalCk2.g:2012:1: rule__IntClauseProperty__Group__4 : rule__IntClauseProperty__Group__4__Impl ;
    public final void rule__IntClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2016:1: ( rule__IntClauseProperty__Group__4__Impl )
            // InternalCk2.g:2017:2: rule__IntClauseProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntClauseProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__4"


    // $ANTLR start "rule__IntClauseProperty__Group__4__Impl"
    // InternalCk2.g:2023:1: rule__IntClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IntClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2027:1: ( ( '}' ) )
            // InternalCk2.g:2028:1: ( '}' )
            {
            // InternalCk2.g:2028:1: ( '}' )
            // InternalCk2.g:2029:2: '}'
            {
             before(grammarAccess.getIntClausePropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIntClausePropertyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__Group__4__Impl"


    // $ANTLR start "rule__DateClauseProperty__Group__0"
    // InternalCk2.g:2039:1: rule__DateClauseProperty__Group__0 : rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 ;
    public final void rule__DateClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2043:1: ( rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 )
            // InternalCk2.g:2044:2: rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DateClauseProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__0"


    // $ANTLR start "rule__DateClauseProperty__Group__0__Impl"
    // InternalCk2.g:2051:1: rule__DateClauseProperty__Group__0__Impl : ( ( rule__DateClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__DateClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2055:1: ( ( ( rule__DateClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2056:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2056:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2057:2: ( rule__DateClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2058:2: ( rule__DateClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2058:3: rule__DateClauseProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateClausePropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__0__Impl"


    // $ANTLR start "rule__DateClauseProperty__Group__1"
    // InternalCk2.g:2066:1: rule__DateClauseProperty__Group__1 : rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 ;
    public final void rule__DateClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2070:1: ( rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 )
            // InternalCk2.g:2071:2: rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DateClauseProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__1"


    // $ANTLR start "rule__DateClauseProperty__Group__1__Impl"
    // InternalCk2.g:2078:1: rule__DateClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2082:1: ( ( '=' ) )
            // InternalCk2.g:2083:1: ( '=' )
            {
            // InternalCk2.g:2083:1: ( '=' )
            // InternalCk2.g:2084:2: '='
            {
             before(grammarAccess.getDateClausePropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDateClausePropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__1__Impl"


    // $ANTLR start "rule__DateClauseProperty__Group__2"
    // InternalCk2.g:2093:1: rule__DateClauseProperty__Group__2 : rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 ;
    public final void rule__DateClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2097:1: ( rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 )
            // InternalCk2.g:2098:2: rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__DateClauseProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__2"


    // $ANTLR start "rule__DateClauseProperty__Group__2__Impl"
    // InternalCk2.g:2105:1: rule__DateClauseProperty__Group__2__Impl : ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2109:1: ( ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2110:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2110:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2111:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2112:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2112:3: rule__DateClauseProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateClausePropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__2__Impl"


    // $ANTLR start "rule__DateClauseProperty__Group__3"
    // InternalCk2.g:2120:1: rule__DateClauseProperty__Group__3 : rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 ;
    public final void rule__DateClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2124:1: ( rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 )
            // InternalCk2.g:2125:2: rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DateClauseProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__3"


    // $ANTLR start "rule__DateClauseProperty__Group__3__Impl"
    // InternalCk2.g:2132:1: rule__DateClauseProperty__Group__3__Impl : ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__DateClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2136:1: ( ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2137:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2137:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2138:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getDateClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2139:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCk2.g:2139:3: rule__DateClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DateClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDateClausePropertyAccess().getPropertiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__3__Impl"


    // $ANTLR start "rule__DateClauseProperty__Group__4"
    // InternalCk2.g:2147:1: rule__DateClauseProperty__Group__4 : rule__DateClauseProperty__Group__4__Impl ;
    public final void rule__DateClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2151:1: ( rule__DateClauseProperty__Group__4__Impl )
            // InternalCk2.g:2152:2: rule__DateClauseProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateClauseProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__4"


    // $ANTLR start "rule__DateClauseProperty__Group__4__Impl"
    // InternalCk2.g:2158:1: rule__DateClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DateClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2162:1: ( ( '}' ) )
            // InternalCk2.g:2163:1: ( '}' )
            {
            // InternalCk2.g:2163:1: ( '}' )
            // InternalCk2.g:2164:2: '}'
            {
             before(grammarAccess.getDateClausePropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDateClausePropertyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__Group__4__Impl"


    // $ANTLR start "rule__ProbabilityProperty__Group__0"
    // InternalCk2.g:2174:1: rule__ProbabilityProperty__Group__0 : rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 ;
    public final void rule__ProbabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2178:1: ( rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 )
            // InternalCk2.g:2179:2: rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ProbabilityProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilityProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__Group__0"


    // $ANTLR start "rule__ProbabilityProperty__Group__0__Impl"
    // InternalCk2.g:2186:1: rule__ProbabilityProperty__Group__0__Impl : ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) ;
    public final void rule__ProbabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2190:1: ( ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2191:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2191:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2192:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2193:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            // InternalCk2.g:2193:3: rule__ProbabilityProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilityProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__Group__0__Impl"


    // $ANTLR start "rule__ProbabilityProperty__Group__1"
    // InternalCk2.g:2201:1: rule__ProbabilityProperty__Group__1 : rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 ;
    public final void rule__ProbabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2205:1: ( rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 )
            // InternalCk2.g:2206:2: rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ProbabilityProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProbabilityProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__Group__1"


    // $ANTLR start "rule__ProbabilityProperty__Group__1__Impl"
    // InternalCk2.g:2213:1: rule__ProbabilityProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ProbabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2217:1: ( ( '=' ) )
            // InternalCk2.g:2218:1: ( '=' )
            {
            // InternalCk2.g:2218:1: ( '=' )
            // InternalCk2.g:2219:2: '='
            {
             before(grammarAccess.getProbabilityPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProbabilityPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__Group__1__Impl"


    // $ANTLR start "rule__ProbabilityProperty__Group__2"
    // InternalCk2.g:2228:1: rule__ProbabilityProperty__Group__2 : rule__ProbabilityProperty__Group__2__Impl ;
    public final void rule__ProbabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2232:1: ( rule__ProbabilityProperty__Group__2__Impl )
            // InternalCk2.g:2233:2: rule__ProbabilityProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilityProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__Group__2"


    // $ANTLR start "rule__ProbabilityProperty__Group__2__Impl"
    // InternalCk2.g:2239:1: rule__ProbabilityProperty__Group__2__Impl : ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) ;
    public final void rule__ProbabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2243:1: ( ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2244:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2244:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2245:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2246:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            // InternalCk2.g:2246:3: rule__ProbabilityProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProbabilityProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__Group__2__Impl"


    // $ANTLR start "rule__Model__PropertiesAssignment"
    // InternalCk2.g:2255:1: rule__Model__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__Model__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2259:1: ( ( ruleProperty ) )
            // InternalCk2.g:2260:2: ( ruleProperty )
            {
            // InternalCk2.g:2260:2: ( ruleProperty )
            // InternalCk2.g:2261:3: ruleProperty
            {
             before(grammarAccess.getModelAccess().getPropertiesPropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPropertiesPropertyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PropertiesAssignment"


    // $ANTLR start "rule__List__ElemsAssignment_1"
    // InternalCk2.g:2270:1: rule__List__ElemsAssignment_1 : ( ruleListElem ) ;
    public final void rule__List__ElemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2274:1: ( ( ruleListElem ) )
            // InternalCk2.g:2275:2: ( ruleListElem )
            {
            // InternalCk2.g:2275:2: ( ruleListElem )
            // InternalCk2.g:2276:3: ruleListElem
            {
             before(grammarAccess.getListAccess().getElemsListElemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleListElem();

            state._fsp--;

             after(grammarAccess.getListAccess().getElemsListElemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ElemsAssignment_1"


    // $ANTLR start "rule__StringProperty__KeyAssignment_0"
    // InternalCk2.g:2285:1: rule__StringProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2289:1: ( ( RULE_ID ) )
            // InternalCk2.g:2290:2: ( RULE_ID )
            {
            // InternalCk2.g:2290:2: ( RULE_ID )
            // InternalCk2.g:2291:3: RULE_ID
            {
             before(grammarAccess.getStringPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__KeyAssignment_0"


    // $ANTLR start "rule__StringProperty__ValueAssignment_2"
    // InternalCk2.g:2300:1: rule__StringProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2304:1: ( ( RULE_STRING ) )
            // InternalCk2.g:2305:2: ( RULE_STRING )
            {
            // InternalCk2.g:2305:2: ( RULE_STRING )
            // InternalCk2.g:2306:3: RULE_STRING
            {
             before(grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringPropertyAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringProperty__ValueAssignment_2"


    // $ANTLR start "rule__IdProperty__KeyAssignment_0"
    // InternalCk2.g:2315:1: rule__IdProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2319:1: ( ( RULE_ID ) )
            // InternalCk2.g:2320:2: ( RULE_ID )
            {
            // InternalCk2.g:2320:2: ( RULE_ID )
            // InternalCk2.g:2321:3: RULE_ID
            {
             before(grammarAccess.getIdPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__KeyAssignment_0"


    // $ANTLR start "rule__IdProperty__ValueAssignment_2"
    // InternalCk2.g:2330:1: rule__IdProperty__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__IdProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2334:1: ( ( RULE_ID ) )
            // InternalCk2.g:2335:2: ( RULE_ID )
            {
            // InternalCk2.g:2335:2: ( RULE_ID )
            // InternalCk2.g:2336:3: RULE_ID
            {
             before(grammarAccess.getIdPropertyAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdPropertyAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdProperty__ValueAssignment_2"


    // $ANTLR start "rule__CommandProperty__KeyAssignment_0"
    // InternalCk2.g:2345:1: rule__CommandProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__CommandProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2349:1: ( ( RULE_ID ) )
            // InternalCk2.g:2350:2: ( RULE_ID )
            {
            // InternalCk2.g:2350:2: ( RULE_ID )
            // InternalCk2.g:2351:3: RULE_ID
            {
             before(grammarAccess.getCommandPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__KeyAssignment_0"


    // $ANTLR start "rule__CommandProperty__ValueAssignment_3"
    // InternalCk2.g:2360:1: rule__CommandProperty__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__CommandProperty__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2364:1: ( ( RULE_ID ) )
            // InternalCk2.g:2365:2: ( RULE_ID )
            {
            // InternalCk2.g:2365:2: ( RULE_ID )
            // InternalCk2.g:2366:3: RULE_ID
            {
             before(grammarAccess.getCommandPropertyAccess().getValueIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandPropertyAccess().getValueIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandProperty__ValueAssignment_3"


    // $ANTLR start "rule__BoolProperty__KeyAssignment_0"
    // InternalCk2.g:2375:1: rule__BoolProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__BoolProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2379:1: ( ( RULE_ID ) )
            // InternalCk2.g:2380:2: ( RULE_ID )
            {
            // InternalCk2.g:2380:2: ( RULE_ID )
            // InternalCk2.g:2381:3: RULE_ID
            {
             before(grammarAccess.getBoolPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoolPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__KeyAssignment_0"


    // $ANTLR start "rule__BoolProperty__ValueAssignment_2"
    // InternalCk2.g:2390:1: rule__BoolProperty__ValueAssignment_2 : ( RULE_BOOL ) ;
    public final void rule__BoolProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2394:1: ( ( RULE_BOOL ) )
            // InternalCk2.g:2395:2: ( RULE_BOOL )
            {
            // InternalCk2.g:2395:2: ( RULE_BOOL )
            // InternalCk2.g:2396:3: RULE_BOOL
            {
             before(grammarAccess.getBoolPropertyAccess().getValueBOOLTerminalRuleCall_2_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getBoolPropertyAccess().getValueBOOLTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolProperty__ValueAssignment_2"


    // $ANTLR start "rule__DateProperty__KeyAssignment_0"
    // InternalCk2.g:2405:1: rule__DateProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__DateProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2409:1: ( ( RULE_ID ) )
            // InternalCk2.g:2410:2: ( RULE_ID )
            {
            // InternalCk2.g:2410:2: ( RULE_ID )
            // InternalCk2.g:2411:3: RULE_ID
            {
             before(grammarAccess.getDatePropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatePropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__KeyAssignment_0"


    // $ANTLR start "rule__DateProperty__ValueAssignment_2"
    // InternalCk2.g:2420:1: rule__DateProperty__ValueAssignment_2 : ( ruleDate ) ;
    public final void rule__DateProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2424:1: ( ( ruleDate ) )
            // InternalCk2.g:2425:2: ( ruleDate )
            {
            // InternalCk2.g:2425:2: ( ruleDate )
            // InternalCk2.g:2426:3: ruleDate
            {
             before(grammarAccess.getDatePropertyAccess().getValueDateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDatePropertyAccess().getValueDateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateProperty__ValueAssignment_2"


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_0"
    // InternalCk2.g:2435:1: rule__IntegerProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2439:1: ( ( RULE_ID ) )
            // InternalCk2.g:2440:2: ( RULE_ID )
            {
            // InternalCk2.g:2440:2: ( RULE_ID )
            // InternalCk2.g:2441:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_2"
    // InternalCk2.g:2450:1: rule__IntegerProperty__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2454:1: ( ( ruleInteger ) )
            // InternalCk2.g:2455:2: ( ruleInteger )
            {
            // InternalCk2.g:2455:2: ( ruleInteger )
            // InternalCk2.g:2456:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_0"
    // InternalCk2.g:2465:1: rule__DoubleProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2469:1: ( ( RULE_ID ) )
            // InternalCk2.g:2470:2: ( RULE_ID )
            {
            // InternalCk2.g:2470:2: ( RULE_ID )
            // InternalCk2.g:2471:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_2"
    // InternalCk2.g:2480:1: rule__DoubleProperty__ValueAssignment_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2484:1: ( ( ruleDouble ) )
            // InternalCk2.g:2485:2: ( ruleDouble )
            {
            // InternalCk2.g:2485:2: ( ruleDouble )
            // InternalCk2.g:2486:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_2"


    // $ANTLR start "rule__ListProperty__KeyAssignment_0"
    // InternalCk2.g:2495:1: rule__ListProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2499:1: ( ( RULE_ID ) )
            // InternalCk2.g:2500:2: ( RULE_ID )
            {
            // InternalCk2.g:2500:2: ( RULE_ID )
            // InternalCk2.g:2501:3: RULE_ID
            {
             before(grammarAccess.getListPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__KeyAssignment_0"


    // $ANTLR start "rule__ListProperty__ValueAssignment_2"
    // InternalCk2.g:2510:1: rule__ListProperty__ValueAssignment_2 : ( ruleList ) ;
    public final void rule__ListProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2514:1: ( ( ruleList ) )
            // InternalCk2.g:2515:2: ( ruleList )
            {
            // InternalCk2.g:2515:2: ( ruleList )
            // InternalCk2.g:2516:3: ruleList
            {
             before(grammarAccess.getListPropertyAccess().getValueListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListPropertyAccess().getValueListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListProperty__ValueAssignment_2"


    // $ANTLR start "rule__IdClauseProperty__NameAssignment_0"
    // InternalCk2.g:2525:1: rule__IdClauseProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2529:1: ( ( RULE_ID ) )
            // InternalCk2.g:2530:2: ( RULE_ID )
            {
            // InternalCk2.g:2530:2: ( RULE_ID )
            // InternalCk2.g:2531:3: RULE_ID
            {
             before(grammarAccess.getIdClausePropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdClausePropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__NameAssignment_0"


    // $ANTLR start "rule__IdClauseProperty__ValueAssignment_2"
    // InternalCk2.g:2540:1: rule__IdClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IdClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2544:1: ( ( ( '{' ) ) )
            // InternalCk2.g:2545:2: ( ( '{' ) )
            {
            // InternalCk2.g:2545:2: ( ( '{' ) )
            // InternalCk2.g:2546:3: ( '{' )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:2547:3: ( '{' )
            // InternalCk2.g:2548:4: '{'
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__ValueAssignment_2"


    // $ANTLR start "rule__IdClauseProperty__PropertiesAssignment_3"
    // InternalCk2.g:2559:1: rule__IdClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IdClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2563:1: ( ( ruleProperty ) )
            // InternalCk2.g:2564:2: ( ruleProperty )
            {
            // InternalCk2.g:2564:2: ( ruleProperty )
            // InternalCk2.g:2565:3: ruleProperty
            {
             before(grammarAccess.getIdClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getIdClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdClauseProperty__PropertiesAssignment_3"


    // $ANTLR start "rule__IntClauseProperty__NameAssignment_0"
    // InternalCk2.g:2574:1: rule__IntClauseProperty__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2578:1: ( ( RULE_INT ) )
            // InternalCk2.g:2579:2: ( RULE_INT )
            {
            // InternalCk2.g:2579:2: ( RULE_INT )
            // InternalCk2.g:2580:3: RULE_INT
            {
             before(grammarAccess.getIntClausePropertyAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntClausePropertyAccess().getNameINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__NameAssignment_0"


    // $ANTLR start "rule__IntClauseProperty__ValueAssignment_2"
    // InternalCk2.g:2589:1: rule__IntClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IntClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2593:1: ( ( ( '{' ) ) )
            // InternalCk2.g:2594:2: ( ( '{' ) )
            {
            // InternalCk2.g:2594:2: ( ( '{' ) )
            // InternalCk2.g:2595:3: ( '{' )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:2596:3: ( '{' )
            // InternalCk2.g:2597:4: '{'
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__ValueAssignment_2"


    // $ANTLR start "rule__IntClauseProperty__PropertiesAssignment_3"
    // InternalCk2.g:2608:1: rule__IntClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IntClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2612:1: ( ( ruleProperty ) )
            // InternalCk2.g:2613:2: ( ruleProperty )
            {
            // InternalCk2.g:2613:2: ( ruleProperty )
            // InternalCk2.g:2614:3: ruleProperty
            {
             before(grammarAccess.getIntClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getIntClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntClauseProperty__PropertiesAssignment_3"


    // $ANTLR start "rule__DateClauseProperty__NameAssignment_0"
    // InternalCk2.g:2623:1: rule__DateClauseProperty__NameAssignment_0 : ( ruleDate ) ;
    public final void rule__DateClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2627:1: ( ( ruleDate ) )
            // InternalCk2.g:2628:2: ( ruleDate )
            {
            // InternalCk2.g:2628:2: ( ruleDate )
            // InternalCk2.g:2629:3: ruleDate
            {
             before(grammarAccess.getDateClausePropertyAccess().getNameDateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateClausePropertyAccess().getNameDateParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__NameAssignment_0"


    // $ANTLR start "rule__DateClauseProperty__ValueAssignment_2"
    // InternalCk2.g:2638:1: rule__DateClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__DateClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2642:1: ( ( ( '{' ) ) )
            // InternalCk2.g:2643:2: ( ( '{' ) )
            {
            // InternalCk2.g:2643:2: ( ( '{' ) )
            // InternalCk2.g:2644:3: ( '{' )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:2645:3: ( '{' )
            // InternalCk2.g:2646:4: '{'
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__ValueAssignment_2"


    // $ANTLR start "rule__DateClauseProperty__PropertiesAssignment_3"
    // InternalCk2.g:2657:1: rule__DateClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__DateClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2661:1: ( ( ruleProperty ) )
            // InternalCk2.g:2662:2: ( ruleProperty )
            {
            // InternalCk2.g:2662:2: ( ruleProperty )
            // InternalCk2.g:2663:3: ruleProperty
            {
             before(grammarAccess.getDateClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getDateClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateClauseProperty__PropertiesAssignment_3"


    // $ANTLR start "rule__ProbabilityProperty__KeyAssignment_0"
    // InternalCk2.g:2672:1: rule__ProbabilityProperty__KeyAssignment_0 : ( RULE_INT ) ;
    public final void rule__ProbabilityProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2676:1: ( ( RULE_INT ) )
            // InternalCk2.g:2677:2: ( RULE_INT )
            {
            // InternalCk2.g:2677:2: ( RULE_INT )
            // InternalCk2.g:2678:3: RULE_INT
            {
             before(grammarAccess.getProbabilityPropertyAccess().getKeyINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProbabilityPropertyAccess().getKeyINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__KeyAssignment_0"


    // $ANTLR start "rule__ProbabilityProperty__ValueAssignment_2"
    // InternalCk2.g:2687:1: rule__ProbabilityProperty__ValueAssignment_2 : ( ruleListElem ) ;
    public final void rule__ProbabilityProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2691:1: ( ( ruleListElem ) )
            // InternalCk2.g:2692:2: ( ruleListElem )
            {
            // InternalCk2.g:2692:2: ( ruleListElem )
            // InternalCk2.g:2693:3: ruleListElem
            {
             before(grammarAccess.getProbabilityPropertyAccess().getValueListElemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleListElem();

            state._fsp--;

             after(grammarAccess.getProbabilityPropertyAccess().getValueListElemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProbabilityProperty__ValueAssignment_2"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\7\uffff\1\22\14\uffff\1\22\1\uffff\1\27\3\uffff";
    static final String dfa_3s = "\1\4\1\23\1\20\2\4\1\uffff\2\4\2\6\5\uffff\2\4\2\uffff\1\6\1\4\1\6\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\6\2\23\1\24\1\21\1\uffff\2\22\2\6\5\uffff\2\23\2\uffff\1\6\1\22\1\6\1\22\1\uffff\1\22\1\uffff";
    static final String dfa_5s = "\5\uffff\1\11\4\uffff\1\4\1\2\1\1\1\3\1\12\2\uffff\1\10\1\6\4\uffff\1\7\1\uffff\1\5";
    static final String dfa_6s = "\32\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2",
            "\1\3",
            "\1\5\2\uffff\1\4",
            "\1\13\1\14\1\7\1\12\6\uffff\1\10\1\11\1\uffff\1\6\2\uffff\1\15",
            "\3\16\7\uffff\2\16\1\uffff\1\5",
            "",
            "\1\17\1\21\1\20\7\uffff\2\21\2\uffff\1\5",
            "\1\22\1\uffff\1\22\11\uffff\1\23\1\uffff\1\22",
            "\1\24",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "\3\21\7\uffff\2\21\2\uffff\1\21\1\5",
            "\3\21\7\uffff\2\21\1\25\1\uffff\1\21\1\5",
            "",
            "",
            "\1\26",
            "\1\22\1\uffff\1\22\11\uffff\1\27\1\uffff\1\22",
            "\1\30",
            "\1\27\1\uffff\1\27\11\uffff\1\31\1\uffff\1\27",
            "",
            "\3\21\7\uffff\2\21\1\5\1\uffff\1\21",
            ""
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
            return "613:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000C040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040050L});

}