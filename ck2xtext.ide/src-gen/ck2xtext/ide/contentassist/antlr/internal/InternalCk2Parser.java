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


    // $ANTLR start "entryRuleDouble"
    // InternalCk2.g:110:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalCk2.g:111:1: ( ruleDouble EOF )
            // InternalCk2.g:112:1: ruleDouble EOF
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
    // InternalCk2.g:119:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:123:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalCk2.g:124:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalCk2.g:124:2: ( ( rule__Double__Group__0 ) )
            // InternalCk2.g:125:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalCk2.g:126:3: ( rule__Double__Group__0 )
            // InternalCk2.g:126:4: rule__Double__Group__0
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
    // InternalCk2.g:135:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalCk2.g:136:1: ( ruleList EOF )
            // InternalCk2.g:137:1: ruleList EOF
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
    // InternalCk2.g:144:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:148:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalCk2.g:149:2: ( ( rule__List__Group__0 ) )
            {
            // InternalCk2.g:149:2: ( ( rule__List__Group__0 ) )
            // InternalCk2.g:150:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalCk2.g:151:3: ( rule__List__Group__0 )
            // InternalCk2.g:151:4: rule__List__Group__0
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
    // InternalCk2.g:160:1: entryRuleListElem : ruleListElem EOF ;
    public final void entryRuleListElem() throws RecognitionException {
        try {
            // InternalCk2.g:161:1: ( ruleListElem EOF )
            // InternalCk2.g:162:1: ruleListElem EOF
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
    // InternalCk2.g:169:1: ruleListElem : ( ( rule__ListElem__Alternatives ) ) ;
    public final void ruleListElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:173:2: ( ( ( rule__ListElem__Alternatives ) ) )
            // InternalCk2.g:174:2: ( ( rule__ListElem__Alternatives ) )
            {
            // InternalCk2.g:174:2: ( ( rule__ListElem__Alternatives ) )
            // InternalCk2.g:175:3: ( rule__ListElem__Alternatives )
            {
             before(grammarAccess.getListElemAccess().getAlternatives()); 
            // InternalCk2.g:176:3: ( rule__ListElem__Alternatives )
            // InternalCk2.g:176:4: rule__ListElem__Alternatives
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
    // InternalCk2.g:185:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalCk2.g:186:1: ( ruleProperty EOF )
            // InternalCk2.g:187:1: ruleProperty EOF
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
    // InternalCk2.g:194:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:198:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalCk2.g:199:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalCk2.g:199:2: ( ( rule__Property__Alternatives ) )
            // InternalCk2.g:200:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalCk2.g:201:3: ( rule__Property__Alternatives )
            // InternalCk2.g:201:4: rule__Property__Alternatives
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
    // InternalCk2.g:210:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalCk2.g:211:1: ( ruleClause EOF )
            // InternalCk2.g:212:1: ruleClause EOF
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
    // InternalCk2.g:219:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:223:2: ( ( ( rule__Clause__Alternatives ) ) )
            // InternalCk2.g:224:2: ( ( rule__Clause__Alternatives ) )
            {
            // InternalCk2.g:224:2: ( ( rule__Clause__Alternatives ) )
            // InternalCk2.g:225:3: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // InternalCk2.g:226:3: ( rule__Clause__Alternatives )
            // InternalCk2.g:226:4: rule__Clause__Alternatives
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
    // InternalCk2.g:235:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // InternalCk2.g:236:1: ( ruleStringProperty EOF )
            // InternalCk2.g:237:1: ruleStringProperty EOF
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
    // InternalCk2.g:244:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:248:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // InternalCk2.g:249:2: ( ( rule__StringProperty__Group__0 ) )
            {
            // InternalCk2.g:249:2: ( ( rule__StringProperty__Group__0 ) )
            // InternalCk2.g:250:3: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // InternalCk2.g:251:3: ( rule__StringProperty__Group__0 )
            // InternalCk2.g:251:4: rule__StringProperty__Group__0
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
    // InternalCk2.g:260:1: entryRuleIdProperty : ruleIdProperty EOF ;
    public final void entryRuleIdProperty() throws RecognitionException {
        try {
            // InternalCk2.g:261:1: ( ruleIdProperty EOF )
            // InternalCk2.g:262:1: ruleIdProperty EOF
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
    // InternalCk2.g:269:1: ruleIdProperty : ( ( rule__IdProperty__Group__0 ) ) ;
    public final void ruleIdProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:273:2: ( ( ( rule__IdProperty__Group__0 ) ) )
            // InternalCk2.g:274:2: ( ( rule__IdProperty__Group__0 ) )
            {
            // InternalCk2.g:274:2: ( ( rule__IdProperty__Group__0 ) )
            // InternalCk2.g:275:3: ( rule__IdProperty__Group__0 )
            {
             before(grammarAccess.getIdPropertyAccess().getGroup()); 
            // InternalCk2.g:276:3: ( rule__IdProperty__Group__0 )
            // InternalCk2.g:276:4: rule__IdProperty__Group__0
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
    // InternalCk2.g:285:1: entryRuleCommandProperty : ruleCommandProperty EOF ;
    public final void entryRuleCommandProperty() throws RecognitionException {
        try {
            // InternalCk2.g:286:1: ( ruleCommandProperty EOF )
            // InternalCk2.g:287:1: ruleCommandProperty EOF
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
    // InternalCk2.g:294:1: ruleCommandProperty : ( ( rule__CommandProperty__Group__0 ) ) ;
    public final void ruleCommandProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:298:2: ( ( ( rule__CommandProperty__Group__0 ) ) )
            // InternalCk2.g:299:2: ( ( rule__CommandProperty__Group__0 ) )
            {
            // InternalCk2.g:299:2: ( ( rule__CommandProperty__Group__0 ) )
            // InternalCk2.g:300:3: ( rule__CommandProperty__Group__0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getGroup()); 
            // InternalCk2.g:301:3: ( rule__CommandProperty__Group__0 )
            // InternalCk2.g:301:4: rule__CommandProperty__Group__0
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
    // InternalCk2.g:310:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // InternalCk2.g:311:1: ( ruleBoolProperty EOF )
            // InternalCk2.g:312:1: ruleBoolProperty EOF
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
    // InternalCk2.g:319:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:323:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // InternalCk2.g:324:2: ( ( rule__BoolProperty__Group__0 ) )
            {
            // InternalCk2.g:324:2: ( ( rule__BoolProperty__Group__0 ) )
            // InternalCk2.g:325:3: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // InternalCk2.g:326:3: ( rule__BoolProperty__Group__0 )
            // InternalCk2.g:326:4: rule__BoolProperty__Group__0
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
    // InternalCk2.g:335:1: entryRuleDateProperty : ruleDateProperty EOF ;
    public final void entryRuleDateProperty() throws RecognitionException {
        try {
            // InternalCk2.g:336:1: ( ruleDateProperty EOF )
            // InternalCk2.g:337:1: ruleDateProperty EOF
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
    // InternalCk2.g:344:1: ruleDateProperty : ( ( rule__DateProperty__Group__0 ) ) ;
    public final void ruleDateProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:348:2: ( ( ( rule__DateProperty__Group__0 ) ) )
            // InternalCk2.g:349:2: ( ( rule__DateProperty__Group__0 ) )
            {
            // InternalCk2.g:349:2: ( ( rule__DateProperty__Group__0 ) )
            // InternalCk2.g:350:3: ( rule__DateProperty__Group__0 )
            {
             before(grammarAccess.getDatePropertyAccess().getGroup()); 
            // InternalCk2.g:351:3: ( rule__DateProperty__Group__0 )
            // InternalCk2.g:351:4: rule__DateProperty__Group__0
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


    // $ANTLR start "entryRuleNumericProperty"
    // InternalCk2.g:360:1: entryRuleNumericProperty : ruleNumericProperty EOF ;
    public final void entryRuleNumericProperty() throws RecognitionException {
        try {
            // InternalCk2.g:361:1: ( ruleNumericProperty EOF )
            // InternalCk2.g:362:1: ruleNumericProperty EOF
            {
             before(grammarAccess.getNumericPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericProperty();

            state._fsp--;

             after(grammarAccess.getNumericPropertyRule()); 
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
    // $ANTLR end "entryRuleNumericProperty"


    // $ANTLR start "ruleNumericProperty"
    // InternalCk2.g:369:1: ruleNumericProperty : ( ( rule__NumericProperty__Group__0 ) ) ;
    public final void ruleNumericProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:373:2: ( ( ( rule__NumericProperty__Group__0 ) ) )
            // InternalCk2.g:374:2: ( ( rule__NumericProperty__Group__0 ) )
            {
            // InternalCk2.g:374:2: ( ( rule__NumericProperty__Group__0 ) )
            // InternalCk2.g:375:3: ( rule__NumericProperty__Group__0 )
            {
             before(grammarAccess.getNumericPropertyAccess().getGroup()); 
            // InternalCk2.g:376:3: ( rule__NumericProperty__Group__0 )
            // InternalCk2.g:376:4: rule__NumericProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumericProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleNumericProperty"


    // $ANTLR start "entryRuleListProperty"
    // InternalCk2.g:385:1: entryRuleListProperty : ruleListProperty EOF ;
    public final void entryRuleListProperty() throws RecognitionException {
        try {
            // InternalCk2.g:386:1: ( ruleListProperty EOF )
            // InternalCk2.g:387:1: ruleListProperty EOF
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
    // InternalCk2.g:394:1: ruleListProperty : ( ( rule__ListProperty__Group__0 ) ) ;
    public final void ruleListProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:398:2: ( ( ( rule__ListProperty__Group__0 ) ) )
            // InternalCk2.g:399:2: ( ( rule__ListProperty__Group__0 ) )
            {
            // InternalCk2.g:399:2: ( ( rule__ListProperty__Group__0 ) )
            // InternalCk2.g:400:3: ( rule__ListProperty__Group__0 )
            {
             before(grammarAccess.getListPropertyAccess().getGroup()); 
            // InternalCk2.g:401:3: ( rule__ListProperty__Group__0 )
            // InternalCk2.g:401:4: rule__ListProperty__Group__0
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
    // InternalCk2.g:410:1: entryRuleIdClauseProperty : ruleIdClauseProperty EOF ;
    public final void entryRuleIdClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:411:1: ( ruleIdClauseProperty EOF )
            // InternalCk2.g:412:1: ruleIdClauseProperty EOF
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
    // InternalCk2.g:419:1: ruleIdClauseProperty : ( ( rule__IdClauseProperty__Group__0 ) ) ;
    public final void ruleIdClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:423:2: ( ( ( rule__IdClauseProperty__Group__0 ) ) )
            // InternalCk2.g:424:2: ( ( rule__IdClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:424:2: ( ( rule__IdClauseProperty__Group__0 ) )
            // InternalCk2.g:425:3: ( rule__IdClauseProperty__Group__0 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getGroup()); 
            // InternalCk2.g:426:3: ( rule__IdClauseProperty__Group__0 )
            // InternalCk2.g:426:4: rule__IdClauseProperty__Group__0
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
    // InternalCk2.g:435:1: entryRuleIntClauseProperty : ruleIntClauseProperty EOF ;
    public final void entryRuleIntClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:436:1: ( ruleIntClauseProperty EOF )
            // InternalCk2.g:437:1: ruleIntClauseProperty EOF
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
    // InternalCk2.g:444:1: ruleIntClauseProperty : ( ( rule__IntClauseProperty__Group__0 ) ) ;
    public final void ruleIntClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:448:2: ( ( ( rule__IntClauseProperty__Group__0 ) ) )
            // InternalCk2.g:449:2: ( ( rule__IntClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:449:2: ( ( rule__IntClauseProperty__Group__0 ) )
            // InternalCk2.g:450:3: ( rule__IntClauseProperty__Group__0 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getGroup()); 
            // InternalCk2.g:451:3: ( rule__IntClauseProperty__Group__0 )
            // InternalCk2.g:451:4: rule__IntClauseProperty__Group__0
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
    // InternalCk2.g:460:1: entryRuleDateClauseProperty : ruleDateClauseProperty EOF ;
    public final void entryRuleDateClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:461:1: ( ruleDateClauseProperty EOF )
            // InternalCk2.g:462:1: ruleDateClauseProperty EOF
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
    // InternalCk2.g:469:1: ruleDateClauseProperty : ( ( rule__DateClauseProperty__Group__0 ) ) ;
    public final void ruleDateClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:473:2: ( ( ( rule__DateClauseProperty__Group__0 ) ) )
            // InternalCk2.g:474:2: ( ( rule__DateClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:474:2: ( ( rule__DateClauseProperty__Group__0 ) )
            // InternalCk2.g:475:3: ( rule__DateClauseProperty__Group__0 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getGroup()); 
            // InternalCk2.g:476:3: ( rule__DateClauseProperty__Group__0 )
            // InternalCk2.g:476:4: rule__DateClauseProperty__Group__0
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
    // InternalCk2.g:485:1: entryRuleProbabilityProperty : ruleProbabilityProperty EOF ;
    public final void entryRuleProbabilityProperty() throws RecognitionException {
        try {
            // InternalCk2.g:486:1: ( ruleProbabilityProperty EOF )
            // InternalCk2.g:487:1: ruleProbabilityProperty EOF
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
    // InternalCk2.g:494:1: ruleProbabilityProperty : ( ( rule__ProbabilityProperty__Group__0 ) ) ;
    public final void ruleProbabilityProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:498:2: ( ( ( rule__ProbabilityProperty__Group__0 ) ) )
            // InternalCk2.g:499:2: ( ( rule__ProbabilityProperty__Group__0 ) )
            {
            // InternalCk2.g:499:2: ( ( rule__ProbabilityProperty__Group__0 ) )
            // InternalCk2.g:500:3: ( rule__ProbabilityProperty__Group__0 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getGroup()); 
            // InternalCk2.g:501:3: ( rule__ProbabilityProperty__Group__0 )
            // InternalCk2.g:501:4: rule__ProbabilityProperty__Group__0
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


    // $ANTLR start "rule__Double__Alternatives_0"
    // InternalCk2.g:509:1: rule__Double__Alternatives_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__Double__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:513:1: ( ( '-' ) | ( '+' ) )
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
                    // InternalCk2.g:514:2: ( '-' )
                    {
                    // InternalCk2.g:514:2: ( '-' )
                    // InternalCk2.g:515:3: '-'
                    {
                     before(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDoubleAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:520:2: ( '+' )
                    {
                    // InternalCk2.g:520:2: ( '+' )
                    // InternalCk2.g:521:3: '+'
                    {
                     before(grammarAccess.getDoubleAccess().getPlusSignKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDoubleAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Double__Alternatives_0"


    // $ANTLR start "rule__ListElem__Alternatives"
    // InternalCk2.g:530:1: rule__ListElem__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleDouble ) );
    public final void rule__ListElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:534:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleDouble ) )
            int alt3=3;
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
            case RULE_INT:
            case 14:
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCk2.g:535:2: ( RULE_ID )
                    {
                    // InternalCk2.g:535:2: ( RULE_ID )
                    // InternalCk2.g:536:3: RULE_ID
                    {
                     before(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:541:2: ( RULE_STRING )
                    {
                    // InternalCk2.g:541:2: ( RULE_STRING )
                    // InternalCk2.g:542:3: RULE_STRING
                    {
                     before(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:547:2: ( ruleDouble )
                    {
                    // InternalCk2.g:547:2: ( ruleDouble )
                    // InternalCk2.g:548:3: ruleDouble
                    {
                     before(grammarAccess.getListElemAccess().getDoubleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getListElemAccess().getDoubleParserRuleCall_2()); 

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
    // InternalCk2.g:557:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleNumericProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:561:1: ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleNumericProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCk2.g:562:2: ( ruleStringProperty )
                    {
                    // InternalCk2.g:562:2: ( ruleStringProperty )
                    // InternalCk2.g:563:3: ruleStringProperty
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
                    // InternalCk2.g:568:2: ( ruleIdProperty )
                    {
                    // InternalCk2.g:568:2: ( ruleIdProperty )
                    // InternalCk2.g:569:3: ruleIdProperty
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
                    // InternalCk2.g:574:2: ( ruleCommandProperty )
                    {
                    // InternalCk2.g:574:2: ( ruleCommandProperty )
                    // InternalCk2.g:575:3: ruleCommandProperty
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
                    // InternalCk2.g:580:2: ( ruleBoolProperty )
                    {
                    // InternalCk2.g:580:2: ( ruleBoolProperty )
                    // InternalCk2.g:581:3: ruleBoolProperty
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
                    // InternalCk2.g:586:2: ( ruleDateProperty )
                    {
                    // InternalCk2.g:586:2: ( ruleDateProperty )
                    // InternalCk2.g:587:3: ruleDateProperty
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
                    // InternalCk2.g:592:2: ( ruleNumericProperty )
                    {
                    // InternalCk2.g:592:2: ( ruleNumericProperty )
                    // InternalCk2.g:593:3: ruleNumericProperty
                    {
                     before(grammarAccess.getPropertyAccess().getNumericPropertyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getNumericPropertyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCk2.g:598:2: ( ruleListProperty )
                    {
                    // InternalCk2.g:598:2: ( ruleListProperty )
                    // InternalCk2.g:599:3: ruleListProperty
                    {
                     before(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleListProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCk2.g:604:2: ( ruleClause )
                    {
                    // InternalCk2.g:604:2: ( ruleClause )
                    // InternalCk2.g:605:3: ruleClause
                    {
                     before(grammarAccess.getPropertyAccess().getClauseParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleClause();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getClauseParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCk2.g:610:2: ( ruleProbabilityProperty )
                    {
                    // InternalCk2.g:610:2: ( ruleProbabilityProperty )
                    // InternalCk2.g:611:3: ruleProbabilityProperty
                    {
                     before(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleProbabilityProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_8()); 

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
    // InternalCk2.g:620:1: rule__Clause__Alternatives : ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:624:1: ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) )
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
                    // InternalCk2.g:625:2: ( ruleIdClauseProperty )
                    {
                    // InternalCk2.g:625:2: ( ruleIdClauseProperty )
                    // InternalCk2.g:626:3: ruleIdClauseProperty
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
                    // InternalCk2.g:631:2: ( ruleIntClauseProperty )
                    {
                    // InternalCk2.g:631:2: ( ruleIntClauseProperty )
                    // InternalCk2.g:632:3: ruleIntClauseProperty
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
                    // InternalCk2.g:637:2: ( ruleDateClauseProperty )
                    {
                    // InternalCk2.g:637:2: ( ruleDateClauseProperty )
                    // InternalCk2.g:638:3: ruleDateClauseProperty
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
    // InternalCk2.g:647:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:651:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalCk2.g:652:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalCk2.g:659:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:663:1: ( ( RULE_INT ) )
            // InternalCk2.g:664:1: ( RULE_INT )
            {
            // InternalCk2.g:664:1: ( RULE_INT )
            // InternalCk2.g:665:2: RULE_INT
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
    // InternalCk2.g:674:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:678:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalCk2.g:679:2: rule__Date__Group__1__Impl rule__Date__Group__2
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
    // InternalCk2.g:686:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:690:1: ( ( '.' ) )
            // InternalCk2.g:691:1: ( '.' )
            {
            // InternalCk2.g:691:1: ( '.' )
            // InternalCk2.g:692:2: '.'
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
    // InternalCk2.g:701:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:705:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalCk2.g:706:2: rule__Date__Group__2__Impl rule__Date__Group__3
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
    // InternalCk2.g:713:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:717:1: ( ( RULE_INT ) )
            // InternalCk2.g:718:1: ( RULE_INT )
            {
            // InternalCk2.g:718:1: ( RULE_INT )
            // InternalCk2.g:719:2: RULE_INT
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
    // InternalCk2.g:728:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:732:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalCk2.g:733:2: rule__Date__Group__3__Impl rule__Date__Group__4
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
    // InternalCk2.g:740:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:744:1: ( ( '.' ) )
            // InternalCk2.g:745:1: ( '.' )
            {
            // InternalCk2.g:745:1: ( '.' )
            // InternalCk2.g:746:2: '.'
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
    // InternalCk2.g:755:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:759:1: ( rule__Date__Group__4__Impl )
            // InternalCk2.g:760:2: rule__Date__Group__4__Impl
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
    // InternalCk2.g:766:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:770:1: ( ( RULE_INT ) )
            // InternalCk2.g:771:1: ( RULE_INT )
            {
            // InternalCk2.g:771:1: ( RULE_INT )
            // InternalCk2.g:772:2: RULE_INT
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


    // $ANTLR start "rule__Double__Group__0"
    // InternalCk2.g:782:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:786:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalCk2.g:787:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCk2.g:794:1: rule__Double__Group__0__Impl : ( ( rule__Double__Alternatives_0 )? ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:798:1: ( ( ( rule__Double__Alternatives_0 )? ) )
            // InternalCk2.g:799:1: ( ( rule__Double__Alternatives_0 )? )
            {
            // InternalCk2.g:799:1: ( ( rule__Double__Alternatives_0 )? )
            // InternalCk2.g:800:2: ( rule__Double__Alternatives_0 )?
            {
             before(grammarAccess.getDoubleAccess().getAlternatives_0()); 
            // InternalCk2.g:801:2: ( rule__Double__Alternatives_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCk2.g:801:3: rule__Double__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Double__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getAlternatives_0()); 

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
    // InternalCk2.g:809:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:813:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalCk2.g:814:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCk2.g:821:1: rule__Double__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:825:1: ( ( RULE_INT ) )
            // InternalCk2.g:826:1: ( RULE_INT )
            {
            // InternalCk2.g:826:1: ( RULE_INT )
            // InternalCk2.g:827:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // InternalCk2.g:836:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:840:1: ( rule__Double__Group__2__Impl )
            // InternalCk2.g:841:2: rule__Double__Group__2__Impl
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
    // InternalCk2.g:847:1: rule__Double__Group__2__Impl : ( ( rule__Double__Group_2__0 )? ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:851:1: ( ( ( rule__Double__Group_2__0 )? ) )
            // InternalCk2.g:852:1: ( ( rule__Double__Group_2__0 )? )
            {
            // InternalCk2.g:852:1: ( ( rule__Double__Group_2__0 )? )
            // InternalCk2.g:853:2: ( rule__Double__Group_2__0 )?
            {
             before(grammarAccess.getDoubleAccess().getGroup_2()); 
            // InternalCk2.g:854:2: ( rule__Double__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCk2.g:854:3: rule__Double__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Double__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Double__Group_2__0"
    // InternalCk2.g:863:1: rule__Double__Group_2__0 : rule__Double__Group_2__0__Impl rule__Double__Group_2__1 ;
    public final void rule__Double__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:867:1: ( rule__Double__Group_2__0__Impl rule__Double__Group_2__1 )
            // InternalCk2.g:868:2: rule__Double__Group_2__0__Impl rule__Double__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Double__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group_2__1();

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
    // $ANTLR end "rule__Double__Group_2__0"


    // $ANTLR start "rule__Double__Group_2__0__Impl"
    // InternalCk2.g:875:1: rule__Double__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Double__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:879:1: ( ( '.' ) )
            // InternalCk2.g:880:1: ( '.' )
            {
            // InternalCk2.g:880:1: ( '.' )
            // InternalCk2.g:881:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__Double__Group_2__0__Impl"


    // $ANTLR start "rule__Double__Group_2__1"
    // InternalCk2.g:890:1: rule__Double__Group_2__1 : rule__Double__Group_2__1__Impl ;
    public final void rule__Double__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:894:1: ( rule__Double__Group_2__1__Impl )
            // InternalCk2.g:895:2: rule__Double__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group_2__1__Impl();

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
    // $ANTLR end "rule__Double__Group_2__1"


    // $ANTLR start "rule__Double__Group_2__1__Impl"
    // InternalCk2.g:901:1: rule__Double__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:905:1: ( ( RULE_INT ) )
            // InternalCk2.g:906:1: ( RULE_INT )
            {
            // InternalCk2.g:906:1: ( RULE_INT )
            // InternalCk2.g:907:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Double__Group_2__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalCk2.g:917:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:921:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalCk2.g:922:2: rule__List__Group__0__Impl rule__List__Group__1
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
    // InternalCk2.g:929:1: rule__List__Group__0__Impl : ( '{' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:933:1: ( ( '{' ) )
            // InternalCk2.g:934:1: ( '{' )
            {
            // InternalCk2.g:934:1: ( '{' )
            // InternalCk2.g:935:2: '{'
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
    // InternalCk2.g:944:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:948:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalCk2.g:949:2: rule__List__Group__1__Impl rule__List__Group__2
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
    // InternalCk2.g:956:1: rule__List__Group__1__Impl : ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:960:1: ( ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) )
            // InternalCk2.g:961:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            {
            // InternalCk2.g:961:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            // InternalCk2.g:962:2: ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* )
            {
            // InternalCk2.g:962:2: ( ( rule__List__ElemsAssignment_1 ) )
            // InternalCk2.g:963:3: ( rule__List__ElemsAssignment_1 )
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:964:3: ( rule__List__ElemsAssignment_1 )
            // InternalCk2.g:964:4: rule__List__ElemsAssignment_1
            {
            pushFollow(FOLLOW_8);
            rule__List__ElemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getElemsAssignment_1()); 

            }

            // InternalCk2.g:967:2: ( ( rule__List__ElemsAssignment_1 )* )
            // InternalCk2.g:968:3: ( rule__List__ElemsAssignment_1 )*
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:969:3: ( rule__List__ElemsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=14 && LA8_0<=15)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCk2.g:969:4: rule__List__ElemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__List__ElemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalCk2.g:978:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:982:1: ( rule__List__Group__2__Impl )
            // InternalCk2.g:983:2: rule__List__Group__2__Impl
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
    // InternalCk2.g:989:1: rule__List__Group__2__Impl : ( '}' ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:993:1: ( ( '}' ) )
            // InternalCk2.g:994:1: ( '}' )
            {
            // InternalCk2.g:994:1: ( '}' )
            // InternalCk2.g:995:2: '}'
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
    // InternalCk2.g:1005:1: rule__StringProperty__Group__0 : rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1009:1: ( rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 )
            // InternalCk2.g:1010:2: rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1
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
    // InternalCk2.g:1017:1: rule__StringProperty__Group__0__Impl : ( ( rule__StringProperty__KeyAssignment_0 ) ) ;
    public final void rule__StringProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1021:1: ( ( ( rule__StringProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1022:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1022:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1023:2: ( rule__StringProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1024:2: ( rule__StringProperty__KeyAssignment_0 )
            // InternalCk2.g:1024:3: rule__StringProperty__KeyAssignment_0
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
    // InternalCk2.g:1032:1: rule__StringProperty__Group__1 : rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1036:1: ( rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 )
            // InternalCk2.g:1037:2: rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2
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
    // InternalCk2.g:1044:1: rule__StringProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__StringProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1048:1: ( ( '=' ) )
            // InternalCk2.g:1049:1: ( '=' )
            {
            // InternalCk2.g:1049:1: ( '=' )
            // InternalCk2.g:1050:2: '='
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
    // InternalCk2.g:1059:1: rule__StringProperty__Group__2 : rule__StringProperty__Group__2__Impl ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1063:1: ( rule__StringProperty__Group__2__Impl )
            // InternalCk2.g:1064:2: rule__StringProperty__Group__2__Impl
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
    // InternalCk2.g:1070:1: rule__StringProperty__Group__2__Impl : ( ( rule__StringProperty__ValueAssignment_2 ) ) ;
    public final void rule__StringProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1074:1: ( ( ( rule__StringProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1075:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1075:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1076:2: ( rule__StringProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1077:2: ( rule__StringProperty__ValueAssignment_2 )
            // InternalCk2.g:1077:3: rule__StringProperty__ValueAssignment_2
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
    // InternalCk2.g:1086:1: rule__IdProperty__Group__0 : rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 ;
    public final void rule__IdProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1090:1: ( rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 )
            // InternalCk2.g:1091:2: rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1
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
    // InternalCk2.g:1098:1: rule__IdProperty__Group__0__Impl : ( ( rule__IdProperty__KeyAssignment_0 ) ) ;
    public final void rule__IdProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1102:1: ( ( ( rule__IdProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1103:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1103:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1104:2: ( rule__IdProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getIdPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1105:2: ( rule__IdProperty__KeyAssignment_0 )
            // InternalCk2.g:1105:3: rule__IdProperty__KeyAssignment_0
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
    // InternalCk2.g:1113:1: rule__IdProperty__Group__1 : rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 ;
    public final void rule__IdProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1117:1: ( rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 )
            // InternalCk2.g:1118:2: rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2
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
    // InternalCk2.g:1125:1: rule__IdProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1129:1: ( ( '=' ) )
            // InternalCk2.g:1130:1: ( '=' )
            {
            // InternalCk2.g:1130:1: ( '=' )
            // InternalCk2.g:1131:2: '='
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
    // InternalCk2.g:1140:1: rule__IdProperty__Group__2 : rule__IdProperty__Group__2__Impl ;
    public final void rule__IdProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1144:1: ( rule__IdProperty__Group__2__Impl )
            // InternalCk2.g:1145:2: rule__IdProperty__Group__2__Impl
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
    // InternalCk2.g:1151:1: rule__IdProperty__Group__2__Impl : ( ( rule__IdProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1155:1: ( ( ( rule__IdProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1156:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1156:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1157:2: ( rule__IdProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1158:2: ( rule__IdProperty__ValueAssignment_2 )
            // InternalCk2.g:1158:3: rule__IdProperty__ValueAssignment_2
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
    // InternalCk2.g:1167:1: rule__CommandProperty__Group__0 : rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 ;
    public final void rule__CommandProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1171:1: ( rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 )
            // InternalCk2.g:1172:2: rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1
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
    // InternalCk2.g:1179:1: rule__CommandProperty__Group__0__Impl : ( ( rule__CommandProperty__KeyAssignment_0 ) ) ;
    public final void rule__CommandProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1183:1: ( ( ( rule__CommandProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1184:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1184:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1185:2: ( rule__CommandProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1186:2: ( rule__CommandProperty__KeyAssignment_0 )
            // InternalCk2.g:1186:3: rule__CommandProperty__KeyAssignment_0
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
    // InternalCk2.g:1194:1: rule__CommandProperty__Group__1 : rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 ;
    public final void rule__CommandProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1198:1: ( rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 )
            // InternalCk2.g:1199:2: rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2
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
    // InternalCk2.g:1206:1: rule__CommandProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__CommandProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1210:1: ( ( '=' ) )
            // InternalCk2.g:1211:1: ( '=' )
            {
            // InternalCk2.g:1211:1: ( '=' )
            // InternalCk2.g:1212:2: '='
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
    // InternalCk2.g:1221:1: rule__CommandProperty__Group__2 : rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 ;
    public final void rule__CommandProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1225:1: ( rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 )
            // InternalCk2.g:1226:2: rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3
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
    // InternalCk2.g:1233:1: rule__CommandProperty__Group__2__Impl : ( '[' ) ;
    public final void rule__CommandProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1237:1: ( ( '[' ) )
            // InternalCk2.g:1238:1: ( '[' )
            {
            // InternalCk2.g:1238:1: ( '[' )
            // InternalCk2.g:1239:2: '['
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
    // InternalCk2.g:1248:1: rule__CommandProperty__Group__3 : rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 ;
    public final void rule__CommandProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1252:1: ( rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 )
            // InternalCk2.g:1253:2: rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4
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
    // InternalCk2.g:1260:1: rule__CommandProperty__Group__3__Impl : ( ( rule__CommandProperty__ValueAssignment_3 ) ) ;
    public final void rule__CommandProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1264:1: ( ( ( rule__CommandProperty__ValueAssignment_3 ) ) )
            // InternalCk2.g:1265:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            {
            // InternalCk2.g:1265:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            // InternalCk2.g:1266:2: ( rule__CommandProperty__ValueAssignment_3 )
            {
             before(grammarAccess.getCommandPropertyAccess().getValueAssignment_3()); 
            // InternalCk2.g:1267:2: ( rule__CommandProperty__ValueAssignment_3 )
            // InternalCk2.g:1267:3: rule__CommandProperty__ValueAssignment_3
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
    // InternalCk2.g:1275:1: rule__CommandProperty__Group__4 : rule__CommandProperty__Group__4__Impl ;
    public final void rule__CommandProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1279:1: ( rule__CommandProperty__Group__4__Impl )
            // InternalCk2.g:1280:2: rule__CommandProperty__Group__4__Impl
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
    // InternalCk2.g:1286:1: rule__CommandProperty__Group__4__Impl : ( ']' ) ;
    public final void rule__CommandProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1290:1: ( ( ']' ) )
            // InternalCk2.g:1291:1: ( ']' )
            {
            // InternalCk2.g:1291:1: ( ']' )
            // InternalCk2.g:1292:2: ']'
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
    // InternalCk2.g:1302:1: rule__BoolProperty__Group__0 : rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1306:1: ( rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 )
            // InternalCk2.g:1307:2: rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1
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
    // InternalCk2.g:1314:1: rule__BoolProperty__Group__0__Impl : ( ( rule__BoolProperty__KeyAssignment_0 ) ) ;
    public final void rule__BoolProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1318:1: ( ( ( rule__BoolProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1319:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1319:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1320:2: ( rule__BoolProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1321:2: ( rule__BoolProperty__KeyAssignment_0 )
            // InternalCk2.g:1321:3: rule__BoolProperty__KeyAssignment_0
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
    // InternalCk2.g:1329:1: rule__BoolProperty__Group__1 : rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1333:1: ( rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 )
            // InternalCk2.g:1334:2: rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2
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
    // InternalCk2.g:1341:1: rule__BoolProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__BoolProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1345:1: ( ( '=' ) )
            // InternalCk2.g:1346:1: ( '=' )
            {
            // InternalCk2.g:1346:1: ( '=' )
            // InternalCk2.g:1347:2: '='
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
    // InternalCk2.g:1356:1: rule__BoolProperty__Group__2 : rule__BoolProperty__Group__2__Impl ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1360:1: ( rule__BoolProperty__Group__2__Impl )
            // InternalCk2.g:1361:2: rule__BoolProperty__Group__2__Impl
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
    // InternalCk2.g:1367:1: rule__BoolProperty__Group__2__Impl : ( ( rule__BoolProperty__ValueAssignment_2 ) ) ;
    public final void rule__BoolProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1371:1: ( ( ( rule__BoolProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1372:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1372:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1373:2: ( rule__BoolProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1374:2: ( rule__BoolProperty__ValueAssignment_2 )
            // InternalCk2.g:1374:3: rule__BoolProperty__ValueAssignment_2
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
    // InternalCk2.g:1383:1: rule__DateProperty__Group__0 : rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 ;
    public final void rule__DateProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1387:1: ( rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 )
            // InternalCk2.g:1388:2: rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1
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
    // InternalCk2.g:1395:1: rule__DateProperty__Group__0__Impl : ( ( rule__DateProperty__KeyAssignment_0 ) ) ;
    public final void rule__DateProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1399:1: ( ( ( rule__DateProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1400:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1400:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1401:2: ( rule__DateProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getDatePropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1402:2: ( rule__DateProperty__KeyAssignment_0 )
            // InternalCk2.g:1402:3: rule__DateProperty__KeyAssignment_0
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
    // InternalCk2.g:1410:1: rule__DateProperty__Group__1 : rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 ;
    public final void rule__DateProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1414:1: ( rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 )
            // InternalCk2.g:1415:2: rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2
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
    // InternalCk2.g:1422:1: rule__DateProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1426:1: ( ( '=' ) )
            // InternalCk2.g:1427:1: ( '=' )
            {
            // InternalCk2.g:1427:1: ( '=' )
            // InternalCk2.g:1428:2: '='
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
    // InternalCk2.g:1437:1: rule__DateProperty__Group__2 : rule__DateProperty__Group__2__Impl ;
    public final void rule__DateProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1441:1: ( rule__DateProperty__Group__2__Impl )
            // InternalCk2.g:1442:2: rule__DateProperty__Group__2__Impl
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
    // InternalCk2.g:1448:1: rule__DateProperty__Group__2__Impl : ( ( rule__DateProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1452:1: ( ( ( rule__DateProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1453:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1453:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1454:2: ( rule__DateProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDatePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1455:2: ( rule__DateProperty__ValueAssignment_2 )
            // InternalCk2.g:1455:3: rule__DateProperty__ValueAssignment_2
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


    // $ANTLR start "rule__NumericProperty__Group__0"
    // InternalCk2.g:1464:1: rule__NumericProperty__Group__0 : rule__NumericProperty__Group__0__Impl rule__NumericProperty__Group__1 ;
    public final void rule__NumericProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1468:1: ( rule__NumericProperty__Group__0__Impl rule__NumericProperty__Group__1 )
            // InternalCk2.g:1469:2: rule__NumericProperty__Group__0__Impl rule__NumericProperty__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NumericProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericProperty__Group__1();

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
    // $ANTLR end "rule__NumericProperty__Group__0"


    // $ANTLR start "rule__NumericProperty__Group__0__Impl"
    // InternalCk2.g:1476:1: rule__NumericProperty__Group__0__Impl : ( ( rule__NumericProperty__KeyAssignment_0 ) ) ;
    public final void rule__NumericProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1480:1: ( ( ( rule__NumericProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1481:1: ( ( rule__NumericProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1481:1: ( ( rule__NumericProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1482:2: ( rule__NumericProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getNumericPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1483:2: ( rule__NumericProperty__KeyAssignment_0 )
            // InternalCk2.g:1483:3: rule__NumericProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumericProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumericPropertyAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__NumericProperty__Group__0__Impl"


    // $ANTLR start "rule__NumericProperty__Group__1"
    // InternalCk2.g:1491:1: rule__NumericProperty__Group__1 : rule__NumericProperty__Group__1__Impl rule__NumericProperty__Group__2 ;
    public final void rule__NumericProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1495:1: ( rule__NumericProperty__Group__1__Impl rule__NumericProperty__Group__2 )
            // InternalCk2.g:1496:2: rule__NumericProperty__Group__1__Impl rule__NumericProperty__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__NumericProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumericProperty__Group__2();

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
    // $ANTLR end "rule__NumericProperty__Group__1"


    // $ANTLR start "rule__NumericProperty__Group__1__Impl"
    // InternalCk2.g:1503:1: rule__NumericProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__NumericProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1507:1: ( ( '=' ) )
            // InternalCk2.g:1508:1: ( '=' )
            {
            // InternalCk2.g:1508:1: ( '=' )
            // InternalCk2.g:1509:2: '='
            {
             before(grammarAccess.getNumericPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNumericPropertyAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__NumericProperty__Group__1__Impl"


    // $ANTLR start "rule__NumericProperty__Group__2"
    // InternalCk2.g:1518:1: rule__NumericProperty__Group__2 : rule__NumericProperty__Group__2__Impl ;
    public final void rule__NumericProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1522:1: ( rule__NumericProperty__Group__2__Impl )
            // InternalCk2.g:1523:2: rule__NumericProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumericProperty__Group__2__Impl();

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
    // $ANTLR end "rule__NumericProperty__Group__2"


    // $ANTLR start "rule__NumericProperty__Group__2__Impl"
    // InternalCk2.g:1529:1: rule__NumericProperty__Group__2__Impl : ( ( rule__NumericProperty__ValueAssignment_2 ) ) ;
    public final void rule__NumericProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1533:1: ( ( ( rule__NumericProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1534:1: ( ( rule__NumericProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1534:1: ( ( rule__NumericProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1535:2: ( rule__NumericProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getNumericPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1536:2: ( rule__NumericProperty__ValueAssignment_2 )
            // InternalCk2.g:1536:3: rule__NumericProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumericProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumericPropertyAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__NumericProperty__Group__2__Impl"


    // $ANTLR start "rule__ListProperty__Group__0"
    // InternalCk2.g:1545:1: rule__ListProperty__Group__0 : rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 ;
    public final void rule__ListProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1549:1: ( rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 )
            // InternalCk2.g:1550:2: rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1
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
    // InternalCk2.g:1557:1: rule__ListProperty__Group__0__Impl : ( ( rule__ListProperty__KeyAssignment_0 ) ) ;
    public final void rule__ListProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1561:1: ( ( ( rule__ListProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1562:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1562:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1563:2: ( rule__ListProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getListPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1564:2: ( rule__ListProperty__KeyAssignment_0 )
            // InternalCk2.g:1564:3: rule__ListProperty__KeyAssignment_0
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
    // InternalCk2.g:1572:1: rule__ListProperty__Group__1 : rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 ;
    public final void rule__ListProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1576:1: ( rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 )
            // InternalCk2.g:1577:2: rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCk2.g:1584:1: rule__ListProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ListProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1588:1: ( ( '=' ) )
            // InternalCk2.g:1589:1: ( '=' )
            {
            // InternalCk2.g:1589:1: ( '=' )
            // InternalCk2.g:1590:2: '='
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
    // InternalCk2.g:1599:1: rule__ListProperty__Group__2 : rule__ListProperty__Group__2__Impl ;
    public final void rule__ListProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1603:1: ( rule__ListProperty__Group__2__Impl )
            // InternalCk2.g:1604:2: rule__ListProperty__Group__2__Impl
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
    // InternalCk2.g:1610:1: rule__ListProperty__Group__2__Impl : ( ( rule__ListProperty__ValueAssignment_2 ) ) ;
    public final void rule__ListProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1614:1: ( ( ( rule__ListProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1615:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1615:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1616:2: ( rule__ListProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getListPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1617:2: ( rule__ListProperty__ValueAssignment_2 )
            // InternalCk2.g:1617:3: rule__ListProperty__ValueAssignment_2
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
    // InternalCk2.g:1626:1: rule__IdClauseProperty__Group__0 : rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 ;
    public final void rule__IdClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1630:1: ( rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 )
            // InternalCk2.g:1631:2: rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1
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
    // InternalCk2.g:1638:1: rule__IdClauseProperty__Group__0__Impl : ( ( rule__IdClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IdClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1642:1: ( ( ( rule__IdClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:1643:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:1643:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:1644:2: ( rule__IdClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:1645:2: ( rule__IdClauseProperty__NameAssignment_0 )
            // InternalCk2.g:1645:3: rule__IdClauseProperty__NameAssignment_0
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
    // InternalCk2.g:1653:1: rule__IdClauseProperty__Group__1 : rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 ;
    public final void rule__IdClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1657:1: ( rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 )
            // InternalCk2.g:1658:2: rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCk2.g:1665:1: rule__IdClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1669:1: ( ( '=' ) )
            // InternalCk2.g:1670:1: ( '=' )
            {
            // InternalCk2.g:1670:1: ( '=' )
            // InternalCk2.g:1671:2: '='
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
    // InternalCk2.g:1680:1: rule__IdClauseProperty__Group__2 : rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 ;
    public final void rule__IdClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1684:1: ( rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 )
            // InternalCk2.g:1685:2: rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCk2.g:1692:1: rule__IdClauseProperty__Group__2__Impl : ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1696:1: ( ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1697:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1697:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1698:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1699:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:1699:3: rule__IdClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:1707:1: rule__IdClauseProperty__Group__3 : rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 ;
    public final void rule__IdClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1711:1: ( rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 )
            // InternalCk2.g:1712:2: rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCk2.g:1719:1: rule__IdClauseProperty__Group__3__Impl : ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IdClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1723:1: ( ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:1724:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:1724:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:1725:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIdClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:1726:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:1726:3: rule__IdClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IdClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCk2.g:1734:1: rule__IdClauseProperty__Group__4 : rule__IdClauseProperty__Group__4__Impl ;
    public final void rule__IdClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1738:1: ( rule__IdClauseProperty__Group__4__Impl )
            // InternalCk2.g:1739:2: rule__IdClauseProperty__Group__4__Impl
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
    // InternalCk2.g:1745:1: rule__IdClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IdClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1749:1: ( ( '}' ) )
            // InternalCk2.g:1750:1: ( '}' )
            {
            // InternalCk2.g:1750:1: ( '}' )
            // InternalCk2.g:1751:2: '}'
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
    // InternalCk2.g:1761:1: rule__IntClauseProperty__Group__0 : rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 ;
    public final void rule__IntClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1765:1: ( rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 )
            // InternalCk2.g:1766:2: rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1
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
    // InternalCk2.g:1773:1: rule__IntClauseProperty__Group__0__Impl : ( ( rule__IntClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IntClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1777:1: ( ( ( rule__IntClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:1778:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:1778:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:1779:2: ( rule__IntClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:1780:2: ( rule__IntClauseProperty__NameAssignment_0 )
            // InternalCk2.g:1780:3: rule__IntClauseProperty__NameAssignment_0
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
    // InternalCk2.g:1788:1: rule__IntClauseProperty__Group__1 : rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 ;
    public final void rule__IntClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1792:1: ( rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 )
            // InternalCk2.g:1793:2: rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCk2.g:1800:1: rule__IntClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IntClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1804:1: ( ( '=' ) )
            // InternalCk2.g:1805:1: ( '=' )
            {
            // InternalCk2.g:1805:1: ( '=' )
            // InternalCk2.g:1806:2: '='
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
    // InternalCk2.g:1815:1: rule__IntClauseProperty__Group__2 : rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 ;
    public final void rule__IntClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1819:1: ( rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 )
            // InternalCk2.g:1820:2: rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCk2.g:1827:1: rule__IntClauseProperty__Group__2__Impl : ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IntClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1831:1: ( ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1832:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1832:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1833:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1834:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:1834:3: rule__IntClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:1842:1: rule__IntClauseProperty__Group__3 : rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 ;
    public final void rule__IntClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1846:1: ( rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 )
            // InternalCk2.g:1847:2: rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCk2.g:1854:1: rule__IntClauseProperty__Group__3__Impl : ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IntClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1858:1: ( ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:1859:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:1859:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:1860:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIntClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:1861:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCk2.g:1861:3: rule__IntClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__IntClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCk2.g:1869:1: rule__IntClauseProperty__Group__4 : rule__IntClauseProperty__Group__4__Impl ;
    public final void rule__IntClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1873:1: ( rule__IntClauseProperty__Group__4__Impl )
            // InternalCk2.g:1874:2: rule__IntClauseProperty__Group__4__Impl
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
    // InternalCk2.g:1880:1: rule__IntClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IntClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1884:1: ( ( '}' ) )
            // InternalCk2.g:1885:1: ( '}' )
            {
            // InternalCk2.g:1885:1: ( '}' )
            // InternalCk2.g:1886:2: '}'
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
    // InternalCk2.g:1896:1: rule__DateClauseProperty__Group__0 : rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 ;
    public final void rule__DateClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1900:1: ( rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 )
            // InternalCk2.g:1901:2: rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1
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
    // InternalCk2.g:1908:1: rule__DateClauseProperty__Group__0__Impl : ( ( rule__DateClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__DateClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1912:1: ( ( ( rule__DateClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:1913:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:1913:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:1914:2: ( rule__DateClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:1915:2: ( rule__DateClauseProperty__NameAssignment_0 )
            // InternalCk2.g:1915:3: rule__DateClauseProperty__NameAssignment_0
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
    // InternalCk2.g:1923:1: rule__DateClauseProperty__Group__1 : rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 ;
    public final void rule__DateClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1927:1: ( rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 )
            // InternalCk2.g:1928:2: rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCk2.g:1935:1: rule__DateClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1939:1: ( ( '=' ) )
            // InternalCk2.g:1940:1: ( '=' )
            {
            // InternalCk2.g:1940:1: ( '=' )
            // InternalCk2.g:1941:2: '='
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
    // InternalCk2.g:1950:1: rule__DateClauseProperty__Group__2 : rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 ;
    public final void rule__DateClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1954:1: ( rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 )
            // InternalCk2.g:1955:2: rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCk2.g:1962:1: rule__DateClauseProperty__Group__2__Impl : ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1966:1: ( ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1967:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1967:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1968:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1969:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:1969:3: rule__DateClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:1977:1: rule__DateClauseProperty__Group__3 : rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 ;
    public final void rule__DateClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1981:1: ( rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 )
            // InternalCk2.g:1982:2: rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCk2.g:1989:1: rule__DateClauseProperty__Group__3__Impl : ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__DateClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1993:1: ( ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:1994:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:1994:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:1995:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getDateClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:1996:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCk2.g:1996:3: rule__DateClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DateClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCk2.g:2004:1: rule__DateClauseProperty__Group__4 : rule__DateClauseProperty__Group__4__Impl ;
    public final void rule__DateClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2008:1: ( rule__DateClauseProperty__Group__4__Impl )
            // InternalCk2.g:2009:2: rule__DateClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2015:1: rule__DateClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DateClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2019:1: ( ( '}' ) )
            // InternalCk2.g:2020:1: ( '}' )
            {
            // InternalCk2.g:2020:1: ( '}' )
            // InternalCk2.g:2021:2: '}'
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
    // InternalCk2.g:2031:1: rule__ProbabilityProperty__Group__0 : rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 ;
    public final void rule__ProbabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2035:1: ( rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 )
            // InternalCk2.g:2036:2: rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1
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
    // InternalCk2.g:2043:1: rule__ProbabilityProperty__Group__0__Impl : ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) ;
    public final void rule__ProbabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2047:1: ( ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2048:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2048:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2049:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2050:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            // InternalCk2.g:2050:3: rule__ProbabilityProperty__KeyAssignment_0
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
    // InternalCk2.g:2058:1: rule__ProbabilityProperty__Group__1 : rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 ;
    public final void rule__ProbabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2062:1: ( rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 )
            // InternalCk2.g:2063:2: rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2
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
    // InternalCk2.g:2070:1: rule__ProbabilityProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ProbabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2074:1: ( ( '=' ) )
            // InternalCk2.g:2075:1: ( '=' )
            {
            // InternalCk2.g:2075:1: ( '=' )
            // InternalCk2.g:2076:2: '='
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
    // InternalCk2.g:2085:1: rule__ProbabilityProperty__Group__2 : rule__ProbabilityProperty__Group__2__Impl ;
    public final void rule__ProbabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2089:1: ( rule__ProbabilityProperty__Group__2__Impl )
            // InternalCk2.g:2090:2: rule__ProbabilityProperty__Group__2__Impl
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
    // InternalCk2.g:2096:1: rule__ProbabilityProperty__Group__2__Impl : ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) ;
    public final void rule__ProbabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2100:1: ( ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2101:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2101:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2102:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2103:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            // InternalCk2.g:2103:3: rule__ProbabilityProperty__ValueAssignment_2
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
    // InternalCk2.g:2112:1: rule__Model__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__Model__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2116:1: ( ( ruleProperty ) )
            // InternalCk2.g:2117:2: ( ruleProperty )
            {
            // InternalCk2.g:2117:2: ( ruleProperty )
            // InternalCk2.g:2118:3: ruleProperty
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
    // InternalCk2.g:2127:1: rule__List__ElemsAssignment_1 : ( ruleListElem ) ;
    public final void rule__List__ElemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2131:1: ( ( ruleListElem ) )
            // InternalCk2.g:2132:2: ( ruleListElem )
            {
            // InternalCk2.g:2132:2: ( ruleListElem )
            // InternalCk2.g:2133:3: ruleListElem
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
    // InternalCk2.g:2142:1: rule__StringProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2146:1: ( ( RULE_ID ) )
            // InternalCk2.g:2147:2: ( RULE_ID )
            {
            // InternalCk2.g:2147:2: ( RULE_ID )
            // InternalCk2.g:2148:3: RULE_ID
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
    // InternalCk2.g:2157:1: rule__StringProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2161:1: ( ( RULE_STRING ) )
            // InternalCk2.g:2162:2: ( RULE_STRING )
            {
            // InternalCk2.g:2162:2: ( RULE_STRING )
            // InternalCk2.g:2163:3: RULE_STRING
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
    // InternalCk2.g:2172:1: rule__IdProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2176:1: ( ( RULE_ID ) )
            // InternalCk2.g:2177:2: ( RULE_ID )
            {
            // InternalCk2.g:2177:2: ( RULE_ID )
            // InternalCk2.g:2178:3: RULE_ID
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
    // InternalCk2.g:2187:1: rule__IdProperty__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__IdProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2191:1: ( ( RULE_ID ) )
            // InternalCk2.g:2192:2: ( RULE_ID )
            {
            // InternalCk2.g:2192:2: ( RULE_ID )
            // InternalCk2.g:2193:3: RULE_ID
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
    // InternalCk2.g:2202:1: rule__CommandProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__CommandProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2206:1: ( ( RULE_ID ) )
            // InternalCk2.g:2207:2: ( RULE_ID )
            {
            // InternalCk2.g:2207:2: ( RULE_ID )
            // InternalCk2.g:2208:3: RULE_ID
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
    // InternalCk2.g:2217:1: rule__CommandProperty__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__CommandProperty__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2221:1: ( ( RULE_ID ) )
            // InternalCk2.g:2222:2: ( RULE_ID )
            {
            // InternalCk2.g:2222:2: ( RULE_ID )
            // InternalCk2.g:2223:3: RULE_ID
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
    // InternalCk2.g:2232:1: rule__BoolProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__BoolProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2236:1: ( ( RULE_ID ) )
            // InternalCk2.g:2237:2: ( RULE_ID )
            {
            // InternalCk2.g:2237:2: ( RULE_ID )
            // InternalCk2.g:2238:3: RULE_ID
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
    // InternalCk2.g:2247:1: rule__BoolProperty__ValueAssignment_2 : ( RULE_BOOL ) ;
    public final void rule__BoolProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2251:1: ( ( RULE_BOOL ) )
            // InternalCk2.g:2252:2: ( RULE_BOOL )
            {
            // InternalCk2.g:2252:2: ( RULE_BOOL )
            // InternalCk2.g:2253:3: RULE_BOOL
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
    // InternalCk2.g:2262:1: rule__DateProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__DateProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2266:1: ( ( RULE_ID ) )
            // InternalCk2.g:2267:2: ( RULE_ID )
            {
            // InternalCk2.g:2267:2: ( RULE_ID )
            // InternalCk2.g:2268:3: RULE_ID
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
    // InternalCk2.g:2277:1: rule__DateProperty__ValueAssignment_2 : ( ruleDate ) ;
    public final void rule__DateProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2281:1: ( ( ruleDate ) )
            // InternalCk2.g:2282:2: ( ruleDate )
            {
            // InternalCk2.g:2282:2: ( ruleDate )
            // InternalCk2.g:2283:3: ruleDate
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


    // $ANTLR start "rule__NumericProperty__KeyAssignment_0"
    // InternalCk2.g:2292:1: rule__NumericProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__NumericProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2296:1: ( ( RULE_ID ) )
            // InternalCk2.g:2297:2: ( RULE_ID )
            {
            // InternalCk2.g:2297:2: ( RULE_ID )
            // InternalCk2.g:2298:3: RULE_ID
            {
             before(grammarAccess.getNumericPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNumericPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumericProperty__KeyAssignment_0"


    // $ANTLR start "rule__NumericProperty__ValueAssignment_2"
    // InternalCk2.g:2307:1: rule__NumericProperty__ValueAssignment_2 : ( ruleDouble ) ;
    public final void rule__NumericProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2311:1: ( ( ruleDouble ) )
            // InternalCk2.g:2312:2: ( ruleDouble )
            {
            // InternalCk2.g:2312:2: ( ruleDouble )
            // InternalCk2.g:2313:3: ruleDouble
            {
             before(grammarAccess.getNumericPropertyAccess().getValueDoubleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getNumericPropertyAccess().getValueDoubleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NumericProperty__ValueAssignment_2"


    // $ANTLR start "rule__ListProperty__KeyAssignment_0"
    // InternalCk2.g:2322:1: rule__ListProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2326:1: ( ( RULE_ID ) )
            // InternalCk2.g:2327:2: ( RULE_ID )
            {
            // InternalCk2.g:2327:2: ( RULE_ID )
            // InternalCk2.g:2328:3: RULE_ID
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
    // InternalCk2.g:2337:1: rule__ListProperty__ValueAssignment_2 : ( ruleList ) ;
    public final void rule__ListProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2341:1: ( ( ruleList ) )
            // InternalCk2.g:2342:2: ( ruleList )
            {
            // InternalCk2.g:2342:2: ( ruleList )
            // InternalCk2.g:2343:3: ruleList
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
    // InternalCk2.g:2352:1: rule__IdClauseProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2356:1: ( ( RULE_ID ) )
            // InternalCk2.g:2357:2: ( RULE_ID )
            {
            // InternalCk2.g:2357:2: ( RULE_ID )
            // InternalCk2.g:2358:3: RULE_ID
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
    // InternalCk2.g:2367:1: rule__IdClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IdClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2371:1: ( ( ( '{' ) ) )
            // InternalCk2.g:2372:2: ( ( '{' ) )
            {
            // InternalCk2.g:2372:2: ( ( '{' ) )
            // InternalCk2.g:2373:3: ( '{' )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:2374:3: ( '{' )
            // InternalCk2.g:2375:4: '{'
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
    // InternalCk2.g:2386:1: rule__IdClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IdClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2390:1: ( ( ruleProperty ) )
            // InternalCk2.g:2391:2: ( ruleProperty )
            {
            // InternalCk2.g:2391:2: ( ruleProperty )
            // InternalCk2.g:2392:3: ruleProperty
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
    // InternalCk2.g:2401:1: rule__IntClauseProperty__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2405:1: ( ( RULE_INT ) )
            // InternalCk2.g:2406:2: ( RULE_INT )
            {
            // InternalCk2.g:2406:2: ( RULE_INT )
            // InternalCk2.g:2407:3: RULE_INT
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
    // InternalCk2.g:2416:1: rule__IntClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IntClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2420:1: ( ( ( '{' ) ) )
            // InternalCk2.g:2421:2: ( ( '{' ) )
            {
            // InternalCk2.g:2421:2: ( ( '{' ) )
            // InternalCk2.g:2422:3: ( '{' )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:2423:3: ( '{' )
            // InternalCk2.g:2424:4: '{'
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
    // InternalCk2.g:2435:1: rule__IntClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IntClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2439:1: ( ( ruleProperty ) )
            // InternalCk2.g:2440:2: ( ruleProperty )
            {
            // InternalCk2.g:2440:2: ( ruleProperty )
            // InternalCk2.g:2441:3: ruleProperty
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
    // InternalCk2.g:2450:1: rule__DateClauseProperty__NameAssignment_0 : ( ruleDate ) ;
    public final void rule__DateClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2454:1: ( ( ruleDate ) )
            // InternalCk2.g:2455:2: ( ruleDate )
            {
            // InternalCk2.g:2455:2: ( ruleDate )
            // InternalCk2.g:2456:3: ruleDate
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
    // InternalCk2.g:2465:1: rule__DateClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__DateClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2469:1: ( ( ( '{' ) ) )
            // InternalCk2.g:2470:2: ( ( '{' ) )
            {
            // InternalCk2.g:2470:2: ( ( '{' ) )
            // InternalCk2.g:2471:3: ( '{' )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:2472:3: ( '{' )
            // InternalCk2.g:2473:4: '{'
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
    // InternalCk2.g:2484:1: rule__DateClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__DateClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2488:1: ( ( ruleProperty ) )
            // InternalCk2.g:2489:2: ( ruleProperty )
            {
            // InternalCk2.g:2489:2: ( ruleProperty )
            // InternalCk2.g:2490:3: ruleProperty
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
    // InternalCk2.g:2499:1: rule__ProbabilityProperty__KeyAssignment_0 : ( RULE_INT ) ;
    public final void rule__ProbabilityProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2503:1: ( ( RULE_INT ) )
            // InternalCk2.g:2504:2: ( RULE_INT )
            {
            // InternalCk2.g:2504:2: ( RULE_INT )
            // InternalCk2.g:2505:3: RULE_INT
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
    // InternalCk2.g:2514:1: rule__ProbabilityProperty__ValueAssignment_2 : ( ruleListElem ) ;
    public final void rule__ProbabilityProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2518:1: ( ( ruleListElem ) )
            // InternalCk2.g:2519:2: ( ruleListElem )
            {
            // InternalCk2.g:2519:2: ( ruleListElem )
            // InternalCk2.g:2520:3: ruleListElem
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
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\11\uffff\1\10\11\uffff\1\10\2\uffff";
    static final String dfa_3s = "\1\4\1\23\1\20\2\4\1\uffff\1\4\2\uffff\1\4\4\uffff\1\4\1\uffff\1\4\2\6\2\4\1\uffff";
    static final String dfa_4s = "\1\6\2\23\1\24\1\21\1\uffff\1\22\2\uffff\1\22\4\uffff\1\23\1\uffff\1\23\2\6\2\22\1\uffff";
    static final String dfa_5s = "\5\uffff\1\10\1\uffff\1\4\1\6\1\uffff\1\1\1\3\1\2\1\11\1\uffff\1\7\5\uffff\1\5";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2",
            "\1\3",
            "\1\5\2\uffff\1\4",
            "\1\14\1\12\1\11\1\7\6\uffff\2\10\1\uffff\1\6\2\uffff\1\13",
            "\3\15\7\uffff\2\15\1\uffff\1\5",
            "",
            "\1\16\1\17\1\20\7\uffff\2\17\2\uffff\1\5",
            "",
            "",
            "\1\10\1\uffff\1\10\11\uffff\1\21\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "\3\17\7\uffff\2\17\2\uffff\1\17\1\5",
            "",
            "\3\17\7\uffff\2\17\1\22\1\uffff\1\17\1\5",
            "\1\23",
            "\1\24",
            "\1\10\1\uffff\1\10\11\uffff\1\25\1\uffff\1\10",
            "\3\17\7\uffff\2\17\1\5\1\uffff\1\17",
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
            return "557:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleNumericProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) );";
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040050L});

}