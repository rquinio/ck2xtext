package ck2xtext.generic.ide.contentassist.antlr.internal;

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
import ck2xtext.generic.services.Ck2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCk2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_HEX", "RULE_DIGIT", "RULE_NON_ASCII_CAP", "RULE_NON_ASCII_LOW", "RULE_ID_PART", "RULE_SL_COMMENT", "RULE_WS", "'-'", "'+'", "'{'", "'}'", "'='", "'['", "']'", "'=='", "'>='", "'>'", "'<='", "'<'", "'.'", "'f'"
    };
    public static final int RULE_HEX=8;
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
    public static final int RULE_BOOL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=RULE_INT && LA1_0<=RULE_BOOL)) ) {
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


    // $ANTLR start "entryRuleListElem"
    // InternalCk2.g:85:1: entryRuleListElem : ruleListElem EOF ;
    public final void entryRuleListElem() throws RecognitionException {
        try {
            // InternalCk2.g:86:1: ( ruleListElem EOF )
            // InternalCk2.g:87:1: ruleListElem EOF
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
    // InternalCk2.g:94:1: ruleListElem : ( ( rule__ListElem__Alternatives ) ) ;
    public final void ruleListElem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:98:2: ( ( ( rule__ListElem__Alternatives ) ) )
            // InternalCk2.g:99:2: ( ( rule__ListElem__Alternatives ) )
            {
            // InternalCk2.g:99:2: ( ( rule__ListElem__Alternatives ) )
            // InternalCk2.g:100:3: ( rule__ListElem__Alternatives )
            {
             before(grammarAccess.getListElemAccess().getAlternatives()); 
            // InternalCk2.g:101:3: ( rule__ListElem__Alternatives )
            // InternalCk2.g:101:4: rule__ListElem__Alternatives
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


    // $ANTLR start "entryRuleList"
    // InternalCk2.g:110:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalCk2.g:111:1: ( ruleList EOF )
            // InternalCk2.g:112:1: ruleList EOF
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
    // InternalCk2.g:119:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:123:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalCk2.g:124:2: ( ( rule__List__Group__0 ) )
            {
            // InternalCk2.g:124:2: ( ( rule__List__Group__0 ) )
            // InternalCk2.g:125:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalCk2.g:126:3: ( rule__List__Group__0 )
            // InternalCk2.g:126:4: rule__List__Group__0
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


    // $ANTLR start "entryRuleProperty"
    // InternalCk2.g:135:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalCk2.g:136:1: ( ruleProperty EOF )
            // InternalCk2.g:137:1: ruleProperty EOF
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
    // InternalCk2.g:144:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:148:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalCk2.g:149:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalCk2.g:149:2: ( ( rule__Property__Alternatives ) )
            // InternalCk2.g:150:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalCk2.g:151:3: ( rule__Property__Alternatives )
            // InternalCk2.g:151:4: rule__Property__Alternatives
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
    // InternalCk2.g:160:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalCk2.g:161:1: ( ruleClause EOF )
            // InternalCk2.g:162:1: ruleClause EOF
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
    // InternalCk2.g:169:1: ruleClause : ( ( rule__Clause__Alternatives ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:173:2: ( ( ( rule__Clause__Alternatives ) ) )
            // InternalCk2.g:174:2: ( ( rule__Clause__Alternatives ) )
            {
            // InternalCk2.g:174:2: ( ( rule__Clause__Alternatives ) )
            // InternalCk2.g:175:3: ( rule__Clause__Alternatives )
            {
             before(grammarAccess.getClauseAccess().getAlternatives()); 
            // InternalCk2.g:176:3: ( rule__Clause__Alternatives )
            // InternalCk2.g:176:4: rule__Clause__Alternatives
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
    // InternalCk2.g:185:1: entryRuleStringProperty : ruleStringProperty EOF ;
    public final void entryRuleStringProperty() throws RecognitionException {
        try {
            // InternalCk2.g:186:1: ( ruleStringProperty EOF )
            // InternalCk2.g:187:1: ruleStringProperty EOF
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
    // InternalCk2.g:194:1: ruleStringProperty : ( ( rule__StringProperty__Group__0 ) ) ;
    public final void ruleStringProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:198:2: ( ( ( rule__StringProperty__Group__0 ) ) )
            // InternalCk2.g:199:2: ( ( rule__StringProperty__Group__0 ) )
            {
            // InternalCk2.g:199:2: ( ( rule__StringProperty__Group__0 ) )
            // InternalCk2.g:200:3: ( rule__StringProperty__Group__0 )
            {
             before(grammarAccess.getStringPropertyAccess().getGroup()); 
            // InternalCk2.g:201:3: ( rule__StringProperty__Group__0 )
            // InternalCk2.g:201:4: rule__StringProperty__Group__0
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
    // InternalCk2.g:210:1: entryRuleIdProperty : ruleIdProperty EOF ;
    public final void entryRuleIdProperty() throws RecognitionException {
        try {
            // InternalCk2.g:211:1: ( ruleIdProperty EOF )
            // InternalCk2.g:212:1: ruleIdProperty EOF
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
    // InternalCk2.g:219:1: ruleIdProperty : ( ( rule__IdProperty__Group__0 ) ) ;
    public final void ruleIdProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:223:2: ( ( ( rule__IdProperty__Group__0 ) ) )
            // InternalCk2.g:224:2: ( ( rule__IdProperty__Group__0 ) )
            {
            // InternalCk2.g:224:2: ( ( rule__IdProperty__Group__0 ) )
            // InternalCk2.g:225:3: ( rule__IdProperty__Group__0 )
            {
             before(grammarAccess.getIdPropertyAccess().getGroup()); 
            // InternalCk2.g:226:3: ( rule__IdProperty__Group__0 )
            // InternalCk2.g:226:4: rule__IdProperty__Group__0
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
    // InternalCk2.g:235:1: entryRuleCommandProperty : ruleCommandProperty EOF ;
    public final void entryRuleCommandProperty() throws RecognitionException {
        try {
            // InternalCk2.g:236:1: ( ruleCommandProperty EOF )
            // InternalCk2.g:237:1: ruleCommandProperty EOF
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
    // InternalCk2.g:244:1: ruleCommandProperty : ( ( rule__CommandProperty__Group__0 ) ) ;
    public final void ruleCommandProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:248:2: ( ( ( rule__CommandProperty__Group__0 ) ) )
            // InternalCk2.g:249:2: ( ( rule__CommandProperty__Group__0 ) )
            {
            // InternalCk2.g:249:2: ( ( rule__CommandProperty__Group__0 ) )
            // InternalCk2.g:250:3: ( rule__CommandProperty__Group__0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getGroup()); 
            // InternalCk2.g:251:3: ( rule__CommandProperty__Group__0 )
            // InternalCk2.g:251:4: rule__CommandProperty__Group__0
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
    // InternalCk2.g:260:1: entryRuleBoolProperty : ruleBoolProperty EOF ;
    public final void entryRuleBoolProperty() throws RecognitionException {
        try {
            // InternalCk2.g:261:1: ( ruleBoolProperty EOF )
            // InternalCk2.g:262:1: ruleBoolProperty EOF
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
    // InternalCk2.g:269:1: ruleBoolProperty : ( ( rule__BoolProperty__Group__0 ) ) ;
    public final void ruleBoolProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:273:2: ( ( ( rule__BoolProperty__Group__0 ) ) )
            // InternalCk2.g:274:2: ( ( rule__BoolProperty__Group__0 ) )
            {
            // InternalCk2.g:274:2: ( ( rule__BoolProperty__Group__0 ) )
            // InternalCk2.g:275:3: ( rule__BoolProperty__Group__0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getGroup()); 
            // InternalCk2.g:276:3: ( rule__BoolProperty__Group__0 )
            // InternalCk2.g:276:4: rule__BoolProperty__Group__0
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
    // InternalCk2.g:285:1: entryRuleDateProperty : ruleDateProperty EOF ;
    public final void entryRuleDateProperty() throws RecognitionException {
        try {
            // InternalCk2.g:286:1: ( ruleDateProperty EOF )
            // InternalCk2.g:287:1: ruleDateProperty EOF
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
    // InternalCk2.g:294:1: ruleDateProperty : ( ( rule__DateProperty__Group__0 ) ) ;
    public final void ruleDateProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:298:2: ( ( ( rule__DateProperty__Group__0 ) ) )
            // InternalCk2.g:299:2: ( ( rule__DateProperty__Group__0 ) )
            {
            // InternalCk2.g:299:2: ( ( rule__DateProperty__Group__0 ) )
            // InternalCk2.g:300:3: ( rule__DateProperty__Group__0 )
            {
             before(grammarAccess.getDatePropertyAccess().getGroup()); 
            // InternalCk2.g:301:3: ( rule__DateProperty__Group__0 )
            // InternalCk2.g:301:4: rule__DateProperty__Group__0
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
    // InternalCk2.g:310:1: entryRuleIntegerProperty : ruleIntegerProperty EOF ;
    public final void entryRuleIntegerProperty() throws RecognitionException {
        try {
            // InternalCk2.g:311:1: ( ruleIntegerProperty EOF )
            // InternalCk2.g:312:1: ruleIntegerProperty EOF
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
    // InternalCk2.g:319:1: ruleIntegerProperty : ( ( rule__IntegerProperty__Alternatives ) ) ;
    public final void ruleIntegerProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:323:2: ( ( ( rule__IntegerProperty__Alternatives ) ) )
            // InternalCk2.g:324:2: ( ( rule__IntegerProperty__Alternatives ) )
            {
            // InternalCk2.g:324:2: ( ( rule__IntegerProperty__Alternatives ) )
            // InternalCk2.g:325:3: ( rule__IntegerProperty__Alternatives )
            {
             before(grammarAccess.getIntegerPropertyAccess().getAlternatives()); 
            // InternalCk2.g:326:3: ( rule__IntegerProperty__Alternatives )
            // InternalCk2.g:326:4: rule__IntegerProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getAlternatives()); 

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
    // InternalCk2.g:335:1: entryRuleDoubleProperty : ruleDoubleProperty EOF ;
    public final void entryRuleDoubleProperty() throws RecognitionException {
        try {
            // InternalCk2.g:336:1: ( ruleDoubleProperty EOF )
            // InternalCk2.g:337:1: ruleDoubleProperty EOF
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
    // InternalCk2.g:344:1: ruleDoubleProperty : ( ( rule__DoubleProperty__Alternatives ) ) ;
    public final void ruleDoubleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:348:2: ( ( ( rule__DoubleProperty__Alternatives ) ) )
            // InternalCk2.g:349:2: ( ( rule__DoubleProperty__Alternatives ) )
            {
            // InternalCk2.g:349:2: ( ( rule__DoubleProperty__Alternatives ) )
            // InternalCk2.g:350:3: ( rule__DoubleProperty__Alternatives )
            {
             before(grammarAccess.getDoublePropertyAccess().getAlternatives()); 
            // InternalCk2.g:351:3: ( rule__DoubleProperty__Alternatives )
            // InternalCk2.g:351:4: rule__DoubleProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleHexadecimalProperty"
    // InternalCk2.g:360:1: entryRuleHexadecimalProperty : ruleHexadecimalProperty EOF ;
    public final void entryRuleHexadecimalProperty() throws RecognitionException {
        try {
            // InternalCk2.g:361:1: ( ruleHexadecimalProperty EOF )
            // InternalCk2.g:362:1: ruleHexadecimalProperty EOF
            {
             before(grammarAccess.getHexadecimalPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleHexadecimalProperty();

            state._fsp--;

             after(grammarAccess.getHexadecimalPropertyRule()); 
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
    // $ANTLR end "entryRuleHexadecimalProperty"


    // $ANTLR start "ruleHexadecimalProperty"
    // InternalCk2.g:369:1: ruleHexadecimalProperty : ( ( rule__HexadecimalProperty__Group__0 ) ) ;
    public final void ruleHexadecimalProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:373:2: ( ( ( rule__HexadecimalProperty__Group__0 ) ) )
            // InternalCk2.g:374:2: ( ( rule__HexadecimalProperty__Group__0 ) )
            {
            // InternalCk2.g:374:2: ( ( rule__HexadecimalProperty__Group__0 ) )
            // InternalCk2.g:375:3: ( rule__HexadecimalProperty__Group__0 )
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getGroup()); 
            // InternalCk2.g:376:3: ( rule__HexadecimalProperty__Group__0 )
            // InternalCk2.g:376:4: rule__HexadecimalProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHexadecimalPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleHexadecimalProperty"


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


    // $ANTLR start "entryRuleBoolClauseProperty"
    // InternalCk2.g:510:1: entryRuleBoolClauseProperty : ruleBoolClauseProperty EOF ;
    public final void entryRuleBoolClauseProperty() throws RecognitionException {
        try {
            // InternalCk2.g:511:1: ( ruleBoolClauseProperty EOF )
            // InternalCk2.g:512:1: ruleBoolClauseProperty EOF
            {
             before(grammarAccess.getBoolClausePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolClauseProperty();

            state._fsp--;

             after(grammarAccess.getBoolClausePropertyRule()); 
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
    // $ANTLR end "entryRuleBoolClauseProperty"


    // $ANTLR start "ruleBoolClauseProperty"
    // InternalCk2.g:519:1: ruleBoolClauseProperty : ( ( rule__BoolClauseProperty__Group__0 ) ) ;
    public final void ruleBoolClauseProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:523:2: ( ( ( rule__BoolClauseProperty__Group__0 ) ) )
            // InternalCk2.g:524:2: ( ( rule__BoolClauseProperty__Group__0 ) )
            {
            // InternalCk2.g:524:2: ( ( rule__BoolClauseProperty__Group__0 ) )
            // InternalCk2.g:525:3: ( rule__BoolClauseProperty__Group__0 )
            {
             before(grammarAccess.getBoolClausePropertyAccess().getGroup()); 
            // InternalCk2.g:526:3: ( rule__BoolClauseProperty__Group__0 )
            // InternalCk2.g:526:4: rule__BoolClauseProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolClausePropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleBoolClauseProperty"


    // $ANTLR start "entryRuleDate"
    // InternalCk2.g:535:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalCk2.g:536:1: ( ruleDate EOF )
            // InternalCk2.g:537:1: ruleDate EOF
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
    // InternalCk2.g:544:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:548:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalCk2.g:549:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalCk2.g:549:2: ( ( rule__Date__Group__0 ) )
            // InternalCk2.g:550:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalCk2.g:551:3: ( rule__Date__Group__0 )
            // InternalCk2.g:551:4: rule__Date__Group__0
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
    // InternalCk2.g:560:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalCk2.g:561:1: ( ruleInteger EOF )
            // InternalCk2.g:562:1: ruleInteger EOF
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
    // InternalCk2.g:569:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:573:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalCk2.g:574:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalCk2.g:574:2: ( ( rule__Integer__Group__0 ) )
            // InternalCk2.g:575:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalCk2.g:576:3: ( rule__Integer__Group__0 )
            // InternalCk2.g:576:4: rule__Integer__Group__0
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
    // InternalCk2.g:585:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalCk2.g:586:1: ( ruleDouble EOF )
            // InternalCk2.g:587:1: ruleDouble EOF
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
    // InternalCk2.g:594:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:598:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalCk2.g:599:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalCk2.g:599:2: ( ( rule__Double__Group__0 ) )
            // InternalCk2.g:600:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalCk2.g:601:3: ( rule__Double__Group__0 )
            // InternalCk2.g:601:4: rule__Double__Group__0
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


    // $ANTLR start "rule__ListElem__Alternatives"
    // InternalCk2.g:609:1: rule__ListElem__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleDouble ) );
    public final void rule__ListElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:613:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleDouble ) )
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
            case 15:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_INT) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_BOOL)||(LA2_5>=15 && LA2_5<=16)||LA2_5==18) ) {
                        alt2=3;
                    }
                    else if ( (LA2_5==27) ) {
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
            case 16:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==RULE_INT) ) {
                    int LA2_5 = input.LA(3);

                    if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_BOOL)||(LA2_5>=15 && LA2_5<=16)||LA2_5==18) ) {
                        alt2=3;
                    }
                    else if ( (LA2_5==27) ) {
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

                if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_BOOL)||(LA2_5>=15 && LA2_5<=16)||LA2_5==18) ) {
                    alt2=3;
                }
                else if ( (LA2_5==27) ) {
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
                    // InternalCk2.g:614:2: ( RULE_ID )
                    {
                    // InternalCk2.g:614:2: ( RULE_ID )
                    // InternalCk2.g:615:3: RULE_ID
                    {
                     before(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:620:2: ( RULE_STRING )
                    {
                    // InternalCk2.g:620:2: ( RULE_STRING )
                    // InternalCk2.g:621:3: RULE_STRING
                    {
                     before(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:626:2: ( ruleInteger )
                    {
                    // InternalCk2.g:626:2: ( ruleInteger )
                    // InternalCk2.g:627:3: ruleInteger
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
                    // InternalCk2.g:632:2: ( ruleDouble )
                    {
                    // InternalCk2.g:632:2: ( ruleDouble )
                    // InternalCk2.g:633:3: ruleDouble
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
    // InternalCk2.g:642:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleHexadecimalProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) | ( ruleBoolClauseProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:646:1: ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleHexadecimalProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) | ( ruleBoolClauseProperty ) )
            int alt3=12;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCk2.g:647:2: ( ruleStringProperty )
                    {
                    // InternalCk2.g:647:2: ( ruleStringProperty )
                    // InternalCk2.g:648:3: ruleStringProperty
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
                    // InternalCk2.g:653:2: ( ruleIdProperty )
                    {
                    // InternalCk2.g:653:2: ( ruleIdProperty )
                    // InternalCk2.g:654:3: ruleIdProperty
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
                    // InternalCk2.g:659:2: ( ruleCommandProperty )
                    {
                    // InternalCk2.g:659:2: ( ruleCommandProperty )
                    // InternalCk2.g:660:3: ruleCommandProperty
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
                    // InternalCk2.g:665:2: ( ruleBoolProperty )
                    {
                    // InternalCk2.g:665:2: ( ruleBoolProperty )
                    // InternalCk2.g:666:3: ruleBoolProperty
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
                    // InternalCk2.g:671:2: ( ruleDateProperty )
                    {
                    // InternalCk2.g:671:2: ( ruleDateProperty )
                    // InternalCk2.g:672:3: ruleDateProperty
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
                    // InternalCk2.g:677:2: ( ruleIntegerProperty )
                    {
                    // InternalCk2.g:677:2: ( ruleIntegerProperty )
                    // InternalCk2.g:678:3: ruleIntegerProperty
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
                    // InternalCk2.g:683:2: ( ruleDoubleProperty )
                    {
                    // InternalCk2.g:683:2: ( ruleDoubleProperty )
                    // InternalCk2.g:684:3: ruleDoubleProperty
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
                    // InternalCk2.g:689:2: ( ruleHexadecimalProperty )
                    {
                    // InternalCk2.g:689:2: ( ruleHexadecimalProperty )
                    // InternalCk2.g:690:3: ruleHexadecimalProperty
                    {
                     before(grammarAccess.getPropertyAccess().getHexadecimalPropertyParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleHexadecimalProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getHexadecimalPropertyParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCk2.g:695:2: ( ruleListProperty )
                    {
                    // InternalCk2.g:695:2: ( ruleListProperty )
                    // InternalCk2.g:696:3: ruleListProperty
                    {
                     before(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleListProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getListPropertyParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCk2.g:701:2: ( ruleClause )
                    {
                    // InternalCk2.g:701:2: ( ruleClause )
                    // InternalCk2.g:702:3: ruleClause
                    {
                     before(grammarAccess.getPropertyAccess().getClauseParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleClause();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getClauseParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCk2.g:707:2: ( ruleProbabilityProperty )
                    {
                    // InternalCk2.g:707:2: ( ruleProbabilityProperty )
                    // InternalCk2.g:708:3: ruleProbabilityProperty
                    {
                     before(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleProbabilityProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCk2.g:713:2: ( ruleBoolClauseProperty )
                    {
                    // InternalCk2.g:713:2: ( ruleBoolClauseProperty )
                    // InternalCk2.g:714:3: ruleBoolClauseProperty
                    {
                     before(grammarAccess.getPropertyAccess().getBoolClausePropertyParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolClauseProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getBoolClausePropertyParserRuleCall_11()); 

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
    // InternalCk2.g:723:1: rule__Clause__Alternatives : ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:727:1: ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==19) ) {
                    alt4=2;
                }
                else if ( (LA4_2==27) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCk2.g:728:2: ( ruleIdClauseProperty )
                    {
                    // InternalCk2.g:728:2: ( ruleIdClauseProperty )
                    // InternalCk2.g:729:3: ruleIdClauseProperty
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
                    // InternalCk2.g:734:2: ( ruleIntClauseProperty )
                    {
                    // InternalCk2.g:734:2: ( ruleIntClauseProperty )
                    // InternalCk2.g:735:3: ruleIntClauseProperty
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
                    // InternalCk2.g:740:2: ( ruleDateClauseProperty )
                    {
                    // InternalCk2.g:740:2: ( ruleDateClauseProperty )
                    // InternalCk2.g:741:3: ruleDateClauseProperty
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


    // $ANTLR start "rule__IntegerProperty__Alternatives"
    // InternalCk2.g:750:1: rule__IntegerProperty__Alternatives : ( ( ( rule__IntegerProperty__Group_0__0 ) ) | ( ( rule__IntegerProperty__Group_1__0 ) ) | ( ( rule__IntegerProperty__Group_2__0 ) ) | ( ( rule__IntegerProperty__Group_3__0 ) ) | ( ( rule__IntegerProperty__Group_4__0 ) ) | ( ( rule__IntegerProperty__Group_5__0 ) ) );
    public final void rule__IntegerProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:754:1: ( ( ( rule__IntegerProperty__Group_0__0 ) ) | ( ( rule__IntegerProperty__Group_1__0 ) ) | ( ( rule__IntegerProperty__Group_2__0 ) ) | ( ( rule__IntegerProperty__Group_3__0 ) ) | ( ( rule__IntegerProperty__Group_4__0 ) ) | ( ( rule__IntegerProperty__Group_5__0 ) ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt5=2;
                    }
                    break;
                case 24:
                    {
                    alt5=4;
                    }
                    break;
                case 26:
                    {
                    alt5=6;
                    }
                    break;
                case 19:
                    {
                    alt5=1;
                    }
                    break;
                case 23:
                    {
                    alt5=3;
                    }
                    break;
                case 25:
                    {
                    alt5=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

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
                    // InternalCk2.g:755:2: ( ( rule__IntegerProperty__Group_0__0 ) )
                    {
                    // InternalCk2.g:755:2: ( ( rule__IntegerProperty__Group_0__0 ) )
                    // InternalCk2.g:756:3: ( rule__IntegerProperty__Group_0__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_0()); 
                    // InternalCk2.g:757:3: ( rule__IntegerProperty__Group_0__0 )
                    // InternalCk2.g:757:4: rule__IntegerProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:761:2: ( ( rule__IntegerProperty__Group_1__0 ) )
                    {
                    // InternalCk2.g:761:2: ( ( rule__IntegerProperty__Group_1__0 ) )
                    // InternalCk2.g:762:3: ( rule__IntegerProperty__Group_1__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_1()); 
                    // InternalCk2.g:763:3: ( rule__IntegerProperty__Group_1__0 )
                    // InternalCk2.g:763:4: rule__IntegerProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:767:2: ( ( rule__IntegerProperty__Group_2__0 ) )
                    {
                    // InternalCk2.g:767:2: ( ( rule__IntegerProperty__Group_2__0 ) )
                    // InternalCk2.g:768:3: ( rule__IntegerProperty__Group_2__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_2()); 
                    // InternalCk2.g:769:3: ( rule__IntegerProperty__Group_2__0 )
                    // InternalCk2.g:769:4: rule__IntegerProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerProperty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerPropertyAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:773:2: ( ( rule__IntegerProperty__Group_3__0 ) )
                    {
                    // InternalCk2.g:773:2: ( ( rule__IntegerProperty__Group_3__0 ) )
                    // InternalCk2.g:774:3: ( rule__IntegerProperty__Group_3__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
                    // InternalCk2.g:775:3: ( rule__IntegerProperty__Group_3__0 )
                    // InternalCk2.g:775:4: rule__IntegerProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerProperty__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:779:2: ( ( rule__IntegerProperty__Group_4__0 ) )
                    {
                    // InternalCk2.g:779:2: ( ( rule__IntegerProperty__Group_4__0 ) )
                    // InternalCk2.g:780:3: ( rule__IntegerProperty__Group_4__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
                    // InternalCk2.g:781:3: ( rule__IntegerProperty__Group_4__0 )
                    // InternalCk2.g:781:4: rule__IntegerProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerProperty__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:785:2: ( ( rule__IntegerProperty__Group_5__0 ) )
                    {
                    // InternalCk2.g:785:2: ( ( rule__IntegerProperty__Group_5__0 ) )
                    // InternalCk2.g:786:3: ( rule__IntegerProperty__Group_5__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
                    // InternalCk2.g:787:3: ( rule__IntegerProperty__Group_5__0 )
                    // InternalCk2.g:787:4: rule__IntegerProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerProperty__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 

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
    // $ANTLR end "rule__IntegerProperty__Alternatives"


    // $ANTLR start "rule__DoubleProperty__Alternatives"
    // InternalCk2.g:795:1: rule__DoubleProperty__Alternatives : ( ( ( rule__DoubleProperty__Group_0__0 ) ) | ( ( rule__DoubleProperty__Group_1__0 ) ) | ( ( rule__DoubleProperty__Group_2__0 ) ) | ( ( rule__DoubleProperty__Group_3__0 ) ) | ( ( rule__DoubleProperty__Group_4__0 ) ) | ( ( rule__DoubleProperty__Group_5__0 ) ) );
    public final void rule__DoubleProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:799:1: ( ( ( rule__DoubleProperty__Group_0__0 ) ) | ( ( rule__DoubleProperty__Group_1__0 ) ) | ( ( rule__DoubleProperty__Group_2__0 ) ) | ( ( rule__DoubleProperty__Group_3__0 ) ) | ( ( rule__DoubleProperty__Group_4__0 ) ) | ( ( rule__DoubleProperty__Group_5__0 ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt6=2;
                    }
                    break;
                case 24:
                    {
                    alt6=4;
                    }
                    break;
                case 26:
                    {
                    alt6=6;
                    }
                    break;
                case 19:
                    {
                    alt6=1;
                    }
                    break;
                case 23:
                    {
                    alt6=3;
                    }
                    break;
                case 25:
                    {
                    alt6=5;
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
                    // InternalCk2.g:800:2: ( ( rule__DoubleProperty__Group_0__0 ) )
                    {
                    // InternalCk2.g:800:2: ( ( rule__DoubleProperty__Group_0__0 ) )
                    // InternalCk2.g:801:3: ( rule__DoubleProperty__Group_0__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_0()); 
                    // InternalCk2.g:802:3: ( rule__DoubleProperty__Group_0__0 )
                    // InternalCk2.g:802:4: rule__DoubleProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoublePropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:806:2: ( ( rule__DoubleProperty__Group_1__0 ) )
                    {
                    // InternalCk2.g:806:2: ( ( rule__DoubleProperty__Group_1__0 ) )
                    // InternalCk2.g:807:3: ( rule__DoubleProperty__Group_1__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_1()); 
                    // InternalCk2.g:808:3: ( rule__DoubleProperty__Group_1__0 )
                    // InternalCk2.g:808:4: rule__DoubleProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoublePropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:812:2: ( ( rule__DoubleProperty__Group_2__0 ) )
                    {
                    // InternalCk2.g:812:2: ( ( rule__DoubleProperty__Group_2__0 ) )
                    // InternalCk2.g:813:3: ( rule__DoubleProperty__Group_2__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_2()); 
                    // InternalCk2.g:814:3: ( rule__DoubleProperty__Group_2__0 )
                    // InternalCk2.g:814:4: rule__DoubleProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleProperty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoublePropertyAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCk2.g:818:2: ( ( rule__DoubleProperty__Group_3__0 ) )
                    {
                    // InternalCk2.g:818:2: ( ( rule__DoubleProperty__Group_3__0 ) )
                    // InternalCk2.g:819:3: ( rule__DoubleProperty__Group_3__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_3()); 
                    // InternalCk2.g:820:3: ( rule__DoubleProperty__Group_3__0 )
                    // InternalCk2.g:820:4: rule__DoubleProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleProperty__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoublePropertyAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCk2.g:824:2: ( ( rule__DoubleProperty__Group_4__0 ) )
                    {
                    // InternalCk2.g:824:2: ( ( rule__DoubleProperty__Group_4__0 ) )
                    // InternalCk2.g:825:3: ( rule__DoubleProperty__Group_4__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_4()); 
                    // InternalCk2.g:826:3: ( rule__DoubleProperty__Group_4__0 )
                    // InternalCk2.g:826:4: rule__DoubleProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleProperty__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoublePropertyAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCk2.g:830:2: ( ( rule__DoubleProperty__Group_5__0 ) )
                    {
                    // InternalCk2.g:830:2: ( ( rule__DoubleProperty__Group_5__0 ) )
                    // InternalCk2.g:831:3: ( rule__DoubleProperty__Group_5__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_5()); 
                    // InternalCk2.g:832:3: ( rule__DoubleProperty__Group_5__0 )
                    // InternalCk2.g:832:4: rule__DoubleProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleProperty__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDoublePropertyAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DoubleProperty__Alternatives"


    // $ANTLR start "rule__Integer__Alternatives_0"
    // InternalCk2.g:840:1: rule__Integer__Alternatives_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__Integer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:844:1: ( ( '-' ) | ( '+' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCk2.g:845:2: ( '-' )
                    {
                    // InternalCk2.g:845:2: ( '-' )
                    // InternalCk2.g:846:3: '-'
                    {
                     before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:851:2: ( '+' )
                    {
                    // InternalCk2.g:851:2: ( '+' )
                    // InternalCk2.g:852:3: '+'
                    {
                     before(grammarAccess.getIntegerAccess().getPlusSignKeyword_0_1()); 
                    match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__List__Group__0"
    // InternalCk2.g:861:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:865:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalCk2.g:866:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCk2.g:873:1: rule__List__Group__0__Impl : ( '{' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:877:1: ( ( '{' ) )
            // InternalCk2.g:878:1: ( '{' )
            {
            // InternalCk2.g:878:1: ( '{' )
            // InternalCk2.g:879:2: '{'
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
    // InternalCk2.g:888:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:892:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalCk2.g:893:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCk2.g:900:1: rule__List__Group__1__Impl : ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:904:1: ( ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) )
            // InternalCk2.g:905:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            {
            // InternalCk2.g:905:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            // InternalCk2.g:906:2: ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* )
            {
            // InternalCk2.g:906:2: ( ( rule__List__ElemsAssignment_1 ) )
            // InternalCk2.g:907:3: ( rule__List__ElemsAssignment_1 )
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:908:3: ( rule__List__ElemsAssignment_1 )
            // InternalCk2.g:908:4: rule__List__ElemsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__List__ElemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getElemsAssignment_1()); 

            }

            // InternalCk2.g:911:2: ( ( rule__List__ElemsAssignment_1 )* )
            // InternalCk2.g:912:3: ( rule__List__ElemsAssignment_1 )*
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:913:3: ( rule__List__ElemsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=15 && LA8_0<=16)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCk2.g:913:4: rule__List__ElemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
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
    // InternalCk2.g:922:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:926:1: ( rule__List__Group__2__Impl )
            // InternalCk2.g:927:2: rule__List__Group__2__Impl
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
    // InternalCk2.g:933:1: rule__List__Group__2__Impl : ( '}' ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:937:1: ( ( '}' ) )
            // InternalCk2.g:938:1: ( '}' )
            {
            // InternalCk2.g:938:1: ( '}' )
            // InternalCk2.g:939:2: '}'
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
    // InternalCk2.g:949:1: rule__StringProperty__Group__0 : rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:953:1: ( rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 )
            // InternalCk2.g:954:2: rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:961:1: rule__StringProperty__Group__0__Impl : ( ( rule__StringProperty__KeyAssignment_0 ) ) ;
    public final void rule__StringProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:965:1: ( ( ( rule__StringProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:966:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:966:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            // InternalCk2.g:967:2: ( rule__StringProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:968:2: ( rule__StringProperty__KeyAssignment_0 )
            // InternalCk2.g:968:3: rule__StringProperty__KeyAssignment_0
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
    // InternalCk2.g:976:1: rule__StringProperty__Group__1 : rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:980:1: ( rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 )
            // InternalCk2.g:981:2: rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCk2.g:988:1: rule__StringProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__StringProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:992:1: ( ( '=' ) )
            // InternalCk2.g:993:1: ( '=' )
            {
            // InternalCk2.g:993:1: ( '=' )
            // InternalCk2.g:994:2: '='
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
    // InternalCk2.g:1003:1: rule__StringProperty__Group__2 : rule__StringProperty__Group__2__Impl ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1007:1: ( rule__StringProperty__Group__2__Impl )
            // InternalCk2.g:1008:2: rule__StringProperty__Group__2__Impl
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
    // InternalCk2.g:1014:1: rule__StringProperty__Group__2__Impl : ( ( rule__StringProperty__ValueAssignment_2 ) ) ;
    public final void rule__StringProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1018:1: ( ( ( rule__StringProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1019:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1019:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1020:2: ( rule__StringProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1021:2: ( rule__StringProperty__ValueAssignment_2 )
            // InternalCk2.g:1021:3: rule__StringProperty__ValueAssignment_2
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
    // InternalCk2.g:1030:1: rule__IdProperty__Group__0 : rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 ;
    public final void rule__IdProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1034:1: ( rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 )
            // InternalCk2.g:1035:2: rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:1042:1: rule__IdProperty__Group__0__Impl : ( ( rule__IdProperty__KeyAssignment_0 ) ) ;
    public final void rule__IdProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1046:1: ( ( ( rule__IdProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1047:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1047:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1048:2: ( rule__IdProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getIdPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1049:2: ( rule__IdProperty__KeyAssignment_0 )
            // InternalCk2.g:1049:3: rule__IdProperty__KeyAssignment_0
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
    // InternalCk2.g:1057:1: rule__IdProperty__Group__1 : rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 ;
    public final void rule__IdProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1061:1: ( rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 )
            // InternalCk2.g:1062:2: rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCk2.g:1069:1: rule__IdProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1073:1: ( ( '=' ) )
            // InternalCk2.g:1074:1: ( '=' )
            {
            // InternalCk2.g:1074:1: ( '=' )
            // InternalCk2.g:1075:2: '='
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
    // InternalCk2.g:1084:1: rule__IdProperty__Group__2 : rule__IdProperty__Group__2__Impl ;
    public final void rule__IdProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1088:1: ( rule__IdProperty__Group__2__Impl )
            // InternalCk2.g:1089:2: rule__IdProperty__Group__2__Impl
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
    // InternalCk2.g:1095:1: rule__IdProperty__Group__2__Impl : ( ( rule__IdProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1099:1: ( ( ( rule__IdProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1100:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1100:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1101:2: ( rule__IdProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1102:2: ( rule__IdProperty__ValueAssignment_2 )
            // InternalCk2.g:1102:3: rule__IdProperty__ValueAssignment_2
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
    // InternalCk2.g:1111:1: rule__CommandProperty__Group__0 : rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 ;
    public final void rule__CommandProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1115:1: ( rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 )
            // InternalCk2.g:1116:2: rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:1123:1: rule__CommandProperty__Group__0__Impl : ( ( rule__CommandProperty__KeyAssignment_0 ) ) ;
    public final void rule__CommandProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1127:1: ( ( ( rule__CommandProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1128:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1128:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1129:2: ( rule__CommandProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1130:2: ( rule__CommandProperty__KeyAssignment_0 )
            // InternalCk2.g:1130:3: rule__CommandProperty__KeyAssignment_0
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
    // InternalCk2.g:1138:1: rule__CommandProperty__Group__1 : rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 ;
    public final void rule__CommandProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1142:1: ( rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 )
            // InternalCk2.g:1143:2: rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalCk2.g:1150:1: rule__CommandProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__CommandProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1154:1: ( ( '=' ) )
            // InternalCk2.g:1155:1: ( '=' )
            {
            // InternalCk2.g:1155:1: ( '=' )
            // InternalCk2.g:1156:2: '='
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
    // InternalCk2.g:1165:1: rule__CommandProperty__Group__2 : rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 ;
    public final void rule__CommandProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1169:1: ( rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 )
            // InternalCk2.g:1170:2: rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCk2.g:1177:1: rule__CommandProperty__Group__2__Impl : ( '[' ) ;
    public final void rule__CommandProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1181:1: ( ( '[' ) )
            // InternalCk2.g:1182:1: ( '[' )
            {
            // InternalCk2.g:1182:1: ( '[' )
            // InternalCk2.g:1183:2: '['
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
    // InternalCk2.g:1192:1: rule__CommandProperty__Group__3 : rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 ;
    public final void rule__CommandProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1196:1: ( rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 )
            // InternalCk2.g:1197:2: rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalCk2.g:1204:1: rule__CommandProperty__Group__3__Impl : ( ( rule__CommandProperty__ValueAssignment_3 ) ) ;
    public final void rule__CommandProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1208:1: ( ( ( rule__CommandProperty__ValueAssignment_3 ) ) )
            // InternalCk2.g:1209:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            {
            // InternalCk2.g:1209:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            // InternalCk2.g:1210:2: ( rule__CommandProperty__ValueAssignment_3 )
            {
             before(grammarAccess.getCommandPropertyAccess().getValueAssignment_3()); 
            // InternalCk2.g:1211:2: ( rule__CommandProperty__ValueAssignment_3 )
            // InternalCk2.g:1211:3: rule__CommandProperty__ValueAssignment_3
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
    // InternalCk2.g:1219:1: rule__CommandProperty__Group__4 : rule__CommandProperty__Group__4__Impl ;
    public final void rule__CommandProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1223:1: ( rule__CommandProperty__Group__4__Impl )
            // InternalCk2.g:1224:2: rule__CommandProperty__Group__4__Impl
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
    // InternalCk2.g:1230:1: rule__CommandProperty__Group__4__Impl : ( ']' ) ;
    public final void rule__CommandProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1234:1: ( ( ']' ) )
            // InternalCk2.g:1235:1: ( ']' )
            {
            // InternalCk2.g:1235:1: ( ']' )
            // InternalCk2.g:1236:2: ']'
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
    // InternalCk2.g:1246:1: rule__BoolProperty__Group__0 : rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1250:1: ( rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 )
            // InternalCk2.g:1251:2: rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:1258:1: rule__BoolProperty__Group__0__Impl : ( ( rule__BoolProperty__KeyAssignment_0 ) ) ;
    public final void rule__BoolProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1262:1: ( ( ( rule__BoolProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1263:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1263:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1264:2: ( rule__BoolProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1265:2: ( rule__BoolProperty__KeyAssignment_0 )
            // InternalCk2.g:1265:3: rule__BoolProperty__KeyAssignment_0
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
    // InternalCk2.g:1273:1: rule__BoolProperty__Group__1 : rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1277:1: ( rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 )
            // InternalCk2.g:1278:2: rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCk2.g:1285:1: rule__BoolProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__BoolProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1289:1: ( ( '=' ) )
            // InternalCk2.g:1290:1: ( '=' )
            {
            // InternalCk2.g:1290:1: ( '=' )
            // InternalCk2.g:1291:2: '='
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
    // InternalCk2.g:1300:1: rule__BoolProperty__Group__2 : rule__BoolProperty__Group__2__Impl ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1304:1: ( rule__BoolProperty__Group__2__Impl )
            // InternalCk2.g:1305:2: rule__BoolProperty__Group__2__Impl
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
    // InternalCk2.g:1311:1: rule__BoolProperty__Group__2__Impl : ( ( rule__BoolProperty__ValueAssignment_2 ) ) ;
    public final void rule__BoolProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1315:1: ( ( ( rule__BoolProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1316:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1316:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1317:2: ( rule__BoolProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1318:2: ( rule__BoolProperty__ValueAssignment_2 )
            // InternalCk2.g:1318:3: rule__BoolProperty__ValueAssignment_2
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
    // InternalCk2.g:1327:1: rule__DateProperty__Group__0 : rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 ;
    public final void rule__DateProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1331:1: ( rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 )
            // InternalCk2.g:1332:2: rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:1339:1: rule__DateProperty__Group__0__Impl : ( ( rule__DateProperty__KeyAssignment_0 ) ) ;
    public final void rule__DateProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1343:1: ( ( ( rule__DateProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1344:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1344:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1345:2: ( rule__DateProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getDatePropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1346:2: ( rule__DateProperty__KeyAssignment_0 )
            // InternalCk2.g:1346:3: rule__DateProperty__KeyAssignment_0
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
    // InternalCk2.g:1354:1: rule__DateProperty__Group__1 : rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 ;
    public final void rule__DateProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1358:1: ( rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 )
            // InternalCk2.g:1359:2: rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCk2.g:1366:1: rule__DateProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1370:1: ( ( '=' ) )
            // InternalCk2.g:1371:1: ( '=' )
            {
            // InternalCk2.g:1371:1: ( '=' )
            // InternalCk2.g:1372:2: '='
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
    // InternalCk2.g:1381:1: rule__DateProperty__Group__2 : rule__DateProperty__Group__2__Impl ;
    public final void rule__DateProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1385:1: ( rule__DateProperty__Group__2__Impl )
            // InternalCk2.g:1386:2: rule__DateProperty__Group__2__Impl
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
    // InternalCk2.g:1392:1: rule__DateProperty__Group__2__Impl : ( ( rule__DateProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1396:1: ( ( ( rule__DateProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1397:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1397:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1398:2: ( rule__DateProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDatePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1399:2: ( rule__DateProperty__ValueAssignment_2 )
            // InternalCk2.g:1399:3: rule__DateProperty__ValueAssignment_2
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


    // $ANTLR start "rule__IntegerProperty__Group_0__0"
    // InternalCk2.g:1408:1: rule__IntegerProperty__Group_0__0 : rule__IntegerProperty__Group_0__0__Impl rule__IntegerProperty__Group_0__1 ;
    public final void rule__IntegerProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1412:1: ( rule__IntegerProperty__Group_0__0__Impl rule__IntegerProperty__Group_0__1 )
            // InternalCk2.g:1413:2: rule__IntegerProperty__Group_0__0__Impl rule__IntegerProperty__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__IntegerProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_0__1();

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
    // $ANTLR end "rule__IntegerProperty__Group_0__0"


    // $ANTLR start "rule__IntegerProperty__Group_0__0__Impl"
    // InternalCk2.g:1420:1: rule__IntegerProperty__Group_0__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_0_0 ) ) ;
    public final void rule__IntegerProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1424:1: ( ( ( rule__IntegerProperty__KeyAssignment_0_0 ) ) )
            // InternalCk2.g:1425:1: ( ( rule__IntegerProperty__KeyAssignment_0_0 ) )
            {
            // InternalCk2.g:1425:1: ( ( rule__IntegerProperty__KeyAssignment_0_0 ) )
            // InternalCk2.g:1426:2: ( rule__IntegerProperty__KeyAssignment_0_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_0_0()); 
            // InternalCk2.g:1427:2: ( rule__IntegerProperty__KeyAssignment_0_0 )
            // InternalCk2.g:1427:3: rule__IntegerProperty__KeyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_0__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_0__1"
    // InternalCk2.g:1435:1: rule__IntegerProperty__Group_0__1 : rule__IntegerProperty__Group_0__1__Impl rule__IntegerProperty__Group_0__2 ;
    public final void rule__IntegerProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1439:1: ( rule__IntegerProperty__Group_0__1__Impl rule__IntegerProperty__Group_0__2 )
            // InternalCk2.g:1440:2: rule__IntegerProperty__Group_0__1__Impl rule__IntegerProperty__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__IntegerProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_0__2();

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
    // $ANTLR end "rule__IntegerProperty__Group_0__1"


    // $ANTLR start "rule__IntegerProperty__Group_0__1__Impl"
    // InternalCk2.g:1447:1: rule__IntegerProperty__Group_0__1__Impl : ( '=' ) ;
    public final void rule__IntegerProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1451:1: ( ( '=' ) )
            // InternalCk2.g:1452:1: ( '=' )
            {
            // InternalCk2.g:1452:1: ( '=' )
            // InternalCk2.g:1453:2: '='
            {
             before(grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_0__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_0__2"
    // InternalCk2.g:1462:1: rule__IntegerProperty__Group_0__2 : rule__IntegerProperty__Group_0__2__Impl ;
    public final void rule__IntegerProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1466:1: ( rule__IntegerProperty__Group_0__2__Impl )
            // InternalCk2.g:1467:2: rule__IntegerProperty__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_0__2__Impl();

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
    // $ANTLR end "rule__IntegerProperty__Group_0__2"


    // $ANTLR start "rule__IntegerProperty__Group_0__2__Impl"
    // InternalCk2.g:1473:1: rule__IntegerProperty__Group_0__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_0_2 ) ) ;
    public final void rule__IntegerProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1477:1: ( ( ( rule__IntegerProperty__ValueAssignment_0_2 ) ) )
            // InternalCk2.g:1478:1: ( ( rule__IntegerProperty__ValueAssignment_0_2 ) )
            {
            // InternalCk2.g:1478:1: ( ( rule__IntegerProperty__ValueAssignment_0_2 ) )
            // InternalCk2.g:1479:2: ( rule__IntegerProperty__ValueAssignment_0_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_0_2()); 
            // InternalCk2.g:1480:2: ( rule__IntegerProperty__ValueAssignment_0_2 )
            // InternalCk2.g:1480:3: rule__IntegerProperty__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_0_2()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_0__2__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_1__0"
    // InternalCk2.g:1489:1: rule__IntegerProperty__Group_1__0 : rule__IntegerProperty__Group_1__0__Impl rule__IntegerProperty__Group_1__1 ;
    public final void rule__IntegerProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1493:1: ( rule__IntegerProperty__Group_1__0__Impl rule__IntegerProperty__Group_1__1 )
            // InternalCk2.g:1494:2: rule__IntegerProperty__Group_1__0__Impl rule__IntegerProperty__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__IntegerProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_1__1();

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
    // $ANTLR end "rule__IntegerProperty__Group_1__0"


    // $ANTLR start "rule__IntegerProperty__Group_1__0__Impl"
    // InternalCk2.g:1501:1: rule__IntegerProperty__Group_1__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_1_0 ) ) ;
    public final void rule__IntegerProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1505:1: ( ( ( rule__IntegerProperty__KeyAssignment_1_0 ) ) )
            // InternalCk2.g:1506:1: ( ( rule__IntegerProperty__KeyAssignment_1_0 ) )
            {
            // InternalCk2.g:1506:1: ( ( rule__IntegerProperty__KeyAssignment_1_0 ) )
            // InternalCk2.g:1507:2: ( rule__IntegerProperty__KeyAssignment_1_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_1_0()); 
            // InternalCk2.g:1508:2: ( rule__IntegerProperty__KeyAssignment_1_0 )
            // InternalCk2.g:1508:3: rule__IntegerProperty__KeyAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_1_0()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_1__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_1__1"
    // InternalCk2.g:1516:1: rule__IntegerProperty__Group_1__1 : rule__IntegerProperty__Group_1__1__Impl rule__IntegerProperty__Group_1__2 ;
    public final void rule__IntegerProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1520:1: ( rule__IntegerProperty__Group_1__1__Impl rule__IntegerProperty__Group_1__2 )
            // InternalCk2.g:1521:2: rule__IntegerProperty__Group_1__1__Impl rule__IntegerProperty__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__IntegerProperty__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_1__2();

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
    // $ANTLR end "rule__IntegerProperty__Group_1__1"


    // $ANTLR start "rule__IntegerProperty__Group_1__1__Impl"
    // InternalCk2.g:1528:1: rule__IntegerProperty__Group_1__1__Impl : ( '==' ) ;
    public final void rule__IntegerProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1532:1: ( ( '==' ) )
            // InternalCk2.g:1533:1: ( '==' )
            {
            // InternalCk2.g:1533:1: ( '==' )
            // InternalCk2.g:1534:2: '=='
            {
             before(grammarAccess.getIntegerPropertyAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getEqualsSignEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_1__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_1__2"
    // InternalCk2.g:1543:1: rule__IntegerProperty__Group_1__2 : rule__IntegerProperty__Group_1__2__Impl ;
    public final void rule__IntegerProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1547:1: ( rule__IntegerProperty__Group_1__2__Impl )
            // InternalCk2.g:1548:2: rule__IntegerProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_1__2__Impl();

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
    // $ANTLR end "rule__IntegerProperty__Group_1__2"


    // $ANTLR start "rule__IntegerProperty__Group_1__2__Impl"
    // InternalCk2.g:1554:1: rule__IntegerProperty__Group_1__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_1_2 ) ) ;
    public final void rule__IntegerProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1558:1: ( ( ( rule__IntegerProperty__ValueAssignment_1_2 ) ) )
            // InternalCk2.g:1559:1: ( ( rule__IntegerProperty__ValueAssignment_1_2 ) )
            {
            // InternalCk2.g:1559:1: ( ( rule__IntegerProperty__ValueAssignment_1_2 ) )
            // InternalCk2.g:1560:2: ( rule__IntegerProperty__ValueAssignment_1_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_1_2()); 
            // InternalCk2.g:1561:2: ( rule__IntegerProperty__ValueAssignment_1_2 )
            // InternalCk2.g:1561:3: rule__IntegerProperty__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_1__2__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_2__0"
    // InternalCk2.g:1570:1: rule__IntegerProperty__Group_2__0 : rule__IntegerProperty__Group_2__0__Impl rule__IntegerProperty__Group_2__1 ;
    public final void rule__IntegerProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1574:1: ( rule__IntegerProperty__Group_2__0__Impl rule__IntegerProperty__Group_2__1 )
            // InternalCk2.g:1575:2: rule__IntegerProperty__Group_2__0__Impl rule__IntegerProperty__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__IntegerProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_2__1();

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
    // $ANTLR end "rule__IntegerProperty__Group_2__0"


    // $ANTLR start "rule__IntegerProperty__Group_2__0__Impl"
    // InternalCk2.g:1582:1: rule__IntegerProperty__Group_2__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_2_0 ) ) ;
    public final void rule__IntegerProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1586:1: ( ( ( rule__IntegerProperty__KeyAssignment_2_0 ) ) )
            // InternalCk2.g:1587:1: ( ( rule__IntegerProperty__KeyAssignment_2_0 ) )
            {
            // InternalCk2.g:1587:1: ( ( rule__IntegerProperty__KeyAssignment_2_0 ) )
            // InternalCk2.g:1588:2: ( rule__IntegerProperty__KeyAssignment_2_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_2_0()); 
            // InternalCk2.g:1589:2: ( rule__IntegerProperty__KeyAssignment_2_0 )
            // InternalCk2.g:1589:3: rule__IntegerProperty__KeyAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_2__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_2__1"
    // InternalCk2.g:1597:1: rule__IntegerProperty__Group_2__1 : rule__IntegerProperty__Group_2__1__Impl rule__IntegerProperty__Group_2__2 ;
    public final void rule__IntegerProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1601:1: ( rule__IntegerProperty__Group_2__1__Impl rule__IntegerProperty__Group_2__2 )
            // InternalCk2.g:1602:2: rule__IntegerProperty__Group_2__1__Impl rule__IntegerProperty__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__IntegerProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_2__2();

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
    // $ANTLR end "rule__IntegerProperty__Group_2__1"


    // $ANTLR start "rule__IntegerProperty__Group_2__1__Impl"
    // InternalCk2.g:1609:1: rule__IntegerProperty__Group_2__1__Impl : ( '>=' ) ;
    public final void rule__IntegerProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1613:1: ( ( '>=' ) )
            // InternalCk2.g:1614:1: ( '>=' )
            {
            // InternalCk2.g:1614:1: ( '>=' )
            // InternalCk2.g:1615:2: '>='
            {
             before(grammarAccess.getIntegerPropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_2__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_2__2"
    // InternalCk2.g:1624:1: rule__IntegerProperty__Group_2__2 : rule__IntegerProperty__Group_2__2__Impl ;
    public final void rule__IntegerProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1628:1: ( rule__IntegerProperty__Group_2__2__Impl )
            // InternalCk2.g:1629:2: rule__IntegerProperty__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_2__2__Impl();

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
    // $ANTLR end "rule__IntegerProperty__Group_2__2"


    // $ANTLR start "rule__IntegerProperty__Group_2__2__Impl"
    // InternalCk2.g:1635:1: rule__IntegerProperty__Group_2__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_2_2 ) ) ;
    public final void rule__IntegerProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1639:1: ( ( ( rule__IntegerProperty__ValueAssignment_2_2 ) ) )
            // InternalCk2.g:1640:1: ( ( rule__IntegerProperty__ValueAssignment_2_2 ) )
            {
            // InternalCk2.g:1640:1: ( ( rule__IntegerProperty__ValueAssignment_2_2 ) )
            // InternalCk2.g:1641:2: ( rule__IntegerProperty__ValueAssignment_2_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_2_2()); 
            // InternalCk2.g:1642:2: ( rule__IntegerProperty__ValueAssignment_2_2 )
            // InternalCk2.g:1642:3: rule__IntegerProperty__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_2_2()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_2__2__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_3__0"
    // InternalCk2.g:1651:1: rule__IntegerProperty__Group_3__0 : rule__IntegerProperty__Group_3__0__Impl rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1655:1: ( rule__IntegerProperty__Group_3__0__Impl rule__IntegerProperty__Group_3__1 )
            // InternalCk2.g:1656:2: rule__IntegerProperty__Group_3__0__Impl rule__IntegerProperty__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__IntegerProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_3__1();

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
    // $ANTLR end "rule__IntegerProperty__Group_3__0"


    // $ANTLR start "rule__IntegerProperty__Group_3__0__Impl"
    // InternalCk2.g:1663:1: rule__IntegerProperty__Group_3__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_3_0 ) ) ;
    public final void rule__IntegerProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1667:1: ( ( ( rule__IntegerProperty__KeyAssignment_3_0 ) ) )
            // InternalCk2.g:1668:1: ( ( rule__IntegerProperty__KeyAssignment_3_0 ) )
            {
            // InternalCk2.g:1668:1: ( ( rule__IntegerProperty__KeyAssignment_3_0 ) )
            // InternalCk2.g:1669:2: ( rule__IntegerProperty__KeyAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_3_0()); 
            // InternalCk2.g:1670:2: ( rule__IntegerProperty__KeyAssignment_3_0 )
            // InternalCk2.g:1670:3: rule__IntegerProperty__KeyAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_3_0()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_3__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_3__1"
    // InternalCk2.g:1678:1: rule__IntegerProperty__Group_3__1 : rule__IntegerProperty__Group_3__1__Impl rule__IntegerProperty__Group_3__2 ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1682:1: ( rule__IntegerProperty__Group_3__1__Impl rule__IntegerProperty__Group_3__2 )
            // InternalCk2.g:1683:2: rule__IntegerProperty__Group_3__1__Impl rule__IntegerProperty__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__IntegerProperty__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_3__2();

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
    // $ANTLR end "rule__IntegerProperty__Group_3__1"


    // $ANTLR start "rule__IntegerProperty__Group_3__1__Impl"
    // InternalCk2.g:1690:1: rule__IntegerProperty__Group_3__1__Impl : ( '>' ) ;
    public final void rule__IntegerProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1694:1: ( ( '>' ) )
            // InternalCk2.g:1695:1: ( '>' )
            {
            // InternalCk2.g:1695:1: ( '>' )
            // InternalCk2.g:1696:2: '>'
            {
             before(grammarAccess.getIntegerPropertyAccess().getGreaterThanSignKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getGreaterThanSignKeyword_3_1()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_3__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_3__2"
    // InternalCk2.g:1705:1: rule__IntegerProperty__Group_3__2 : rule__IntegerProperty__Group_3__2__Impl ;
    public final void rule__IntegerProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1709:1: ( rule__IntegerProperty__Group_3__2__Impl )
            // InternalCk2.g:1710:2: rule__IntegerProperty__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_3__2__Impl();

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
    // $ANTLR end "rule__IntegerProperty__Group_3__2"


    // $ANTLR start "rule__IntegerProperty__Group_3__2__Impl"
    // InternalCk2.g:1716:1: rule__IntegerProperty__Group_3__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_3_2 ) ) ;
    public final void rule__IntegerProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1720:1: ( ( ( rule__IntegerProperty__ValueAssignment_3_2 ) ) )
            // InternalCk2.g:1721:1: ( ( rule__IntegerProperty__ValueAssignment_3_2 ) )
            {
            // InternalCk2.g:1721:1: ( ( rule__IntegerProperty__ValueAssignment_3_2 ) )
            // InternalCk2.g:1722:2: ( rule__IntegerProperty__ValueAssignment_3_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_3_2()); 
            // InternalCk2.g:1723:2: ( rule__IntegerProperty__ValueAssignment_3_2 )
            // InternalCk2.g:1723:3: rule__IntegerProperty__ValueAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_3_2()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_3__2__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_4__0"
    // InternalCk2.g:1732:1: rule__IntegerProperty__Group_4__0 : rule__IntegerProperty__Group_4__0__Impl rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1736:1: ( rule__IntegerProperty__Group_4__0__Impl rule__IntegerProperty__Group_4__1 )
            // InternalCk2.g:1737:2: rule__IntegerProperty__Group_4__0__Impl rule__IntegerProperty__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__IntegerProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_4__1();

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
    // $ANTLR end "rule__IntegerProperty__Group_4__0"


    // $ANTLR start "rule__IntegerProperty__Group_4__0__Impl"
    // InternalCk2.g:1744:1: rule__IntegerProperty__Group_4__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_4_0 ) ) ;
    public final void rule__IntegerProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1748:1: ( ( ( rule__IntegerProperty__KeyAssignment_4_0 ) ) )
            // InternalCk2.g:1749:1: ( ( rule__IntegerProperty__KeyAssignment_4_0 ) )
            {
            // InternalCk2.g:1749:1: ( ( rule__IntegerProperty__KeyAssignment_4_0 ) )
            // InternalCk2.g:1750:2: ( rule__IntegerProperty__KeyAssignment_4_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_4_0()); 
            // InternalCk2.g:1751:2: ( rule__IntegerProperty__KeyAssignment_4_0 )
            // InternalCk2.g:1751:3: rule__IntegerProperty__KeyAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_4_0()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_4__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_4__1"
    // InternalCk2.g:1759:1: rule__IntegerProperty__Group_4__1 : rule__IntegerProperty__Group_4__1__Impl rule__IntegerProperty__Group_4__2 ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1763:1: ( rule__IntegerProperty__Group_4__1__Impl rule__IntegerProperty__Group_4__2 )
            // InternalCk2.g:1764:2: rule__IntegerProperty__Group_4__1__Impl rule__IntegerProperty__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__IntegerProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_4__2();

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
    // $ANTLR end "rule__IntegerProperty__Group_4__1"


    // $ANTLR start "rule__IntegerProperty__Group_4__1__Impl"
    // InternalCk2.g:1771:1: rule__IntegerProperty__Group_4__1__Impl : ( '<=' ) ;
    public final void rule__IntegerProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1775:1: ( ( '<=' ) )
            // InternalCk2.g:1776:1: ( '<=' )
            {
            // InternalCk2.g:1776:1: ( '<=' )
            // InternalCk2.g:1777:2: '<='
            {
             before(grammarAccess.getIntegerPropertyAccess().getLessThanSignEqualsSignKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getLessThanSignEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_4__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_4__2"
    // InternalCk2.g:1786:1: rule__IntegerProperty__Group_4__2 : rule__IntegerProperty__Group_4__2__Impl ;
    public final void rule__IntegerProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1790:1: ( rule__IntegerProperty__Group_4__2__Impl )
            // InternalCk2.g:1791:2: rule__IntegerProperty__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_4__2__Impl();

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
    // $ANTLR end "rule__IntegerProperty__Group_4__2"


    // $ANTLR start "rule__IntegerProperty__Group_4__2__Impl"
    // InternalCk2.g:1797:1: rule__IntegerProperty__Group_4__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__IntegerProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1801:1: ( ( ( rule__IntegerProperty__ValueAssignment_4_2 ) ) )
            // InternalCk2.g:1802:1: ( ( rule__IntegerProperty__ValueAssignment_4_2 ) )
            {
            // InternalCk2.g:1802:1: ( ( rule__IntegerProperty__ValueAssignment_4_2 ) )
            // InternalCk2.g:1803:2: ( rule__IntegerProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_4_2()); 
            // InternalCk2.g:1804:2: ( rule__IntegerProperty__ValueAssignment_4_2 )
            // InternalCk2.g:1804:3: rule__IntegerProperty__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_4_2()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_4__2__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_5__0"
    // InternalCk2.g:1813:1: rule__IntegerProperty__Group_5__0 : rule__IntegerProperty__Group_5__0__Impl rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1817:1: ( rule__IntegerProperty__Group_5__0__Impl rule__IntegerProperty__Group_5__1 )
            // InternalCk2.g:1818:2: rule__IntegerProperty__Group_5__0__Impl rule__IntegerProperty__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__IntegerProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_5__1();

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
    // $ANTLR end "rule__IntegerProperty__Group_5__0"


    // $ANTLR start "rule__IntegerProperty__Group_5__0__Impl"
    // InternalCk2.g:1825:1: rule__IntegerProperty__Group_5__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_5_0 ) ) ;
    public final void rule__IntegerProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1829:1: ( ( ( rule__IntegerProperty__KeyAssignment_5_0 ) ) )
            // InternalCk2.g:1830:1: ( ( rule__IntegerProperty__KeyAssignment_5_0 ) )
            {
            // InternalCk2.g:1830:1: ( ( rule__IntegerProperty__KeyAssignment_5_0 ) )
            // InternalCk2.g:1831:2: ( rule__IntegerProperty__KeyAssignment_5_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_5_0()); 
            // InternalCk2.g:1832:2: ( rule__IntegerProperty__KeyAssignment_5_0 )
            // InternalCk2.g:1832:3: rule__IntegerProperty__KeyAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__KeyAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_5_0()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_5__0__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_5__1"
    // InternalCk2.g:1840:1: rule__IntegerProperty__Group_5__1 : rule__IntegerProperty__Group_5__1__Impl rule__IntegerProperty__Group_5__2 ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1844:1: ( rule__IntegerProperty__Group_5__1__Impl rule__IntegerProperty__Group_5__2 )
            // InternalCk2.g:1845:2: rule__IntegerProperty__Group_5__1__Impl rule__IntegerProperty__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__IntegerProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_5__2();

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
    // $ANTLR end "rule__IntegerProperty__Group_5__1"


    // $ANTLR start "rule__IntegerProperty__Group_5__1__Impl"
    // InternalCk2.g:1852:1: rule__IntegerProperty__Group_5__1__Impl : ( '<' ) ;
    public final void rule__IntegerProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1856:1: ( ( '<' ) )
            // InternalCk2.g:1857:1: ( '<' )
            {
            // InternalCk2.g:1857:1: ( '<' )
            // InternalCk2.g:1858:2: '<'
            {
             before(grammarAccess.getIntegerPropertyAccess().getLessThanSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getLessThanSignKeyword_5_1()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerProperty__Group_5__2"
    // InternalCk2.g:1867:1: rule__IntegerProperty__Group_5__2 : rule__IntegerProperty__Group_5__2__Impl ;
    public final void rule__IntegerProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1871:1: ( rule__IntegerProperty__Group_5__2__Impl )
            // InternalCk2.g:1872:2: rule__IntegerProperty__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__Group_5__2__Impl();

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
    // $ANTLR end "rule__IntegerProperty__Group_5__2"


    // $ANTLR start "rule__IntegerProperty__Group_5__2__Impl"
    // InternalCk2.g:1878:1: rule__IntegerProperty__Group_5__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_5_2 ) ) ;
    public final void rule__IntegerProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1882:1: ( ( ( rule__IntegerProperty__ValueAssignment_5_2 ) ) )
            // InternalCk2.g:1883:1: ( ( rule__IntegerProperty__ValueAssignment_5_2 ) )
            {
            // InternalCk2.g:1883:1: ( ( rule__IntegerProperty__ValueAssignment_5_2 ) )
            // InternalCk2.g:1884:2: ( rule__IntegerProperty__ValueAssignment_5_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_5_2()); 
            // InternalCk2.g:1885:2: ( rule__IntegerProperty__ValueAssignment_5_2 )
            // InternalCk2.g:1885:3: rule__IntegerProperty__ValueAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerProperty__ValueAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerPropertyAccess().getValueAssignment_5_2()); 

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
    // $ANTLR end "rule__IntegerProperty__Group_5__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_0__0"
    // InternalCk2.g:1894:1: rule__DoubleProperty__Group_0__0 : rule__DoubleProperty__Group_0__0__Impl rule__DoubleProperty__Group_0__1 ;
    public final void rule__DoubleProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1898:1: ( rule__DoubleProperty__Group_0__0__Impl rule__DoubleProperty__Group_0__1 )
            // InternalCk2.g:1899:2: rule__DoubleProperty__Group_0__0__Impl rule__DoubleProperty__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__DoubleProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_0__1();

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
    // $ANTLR end "rule__DoubleProperty__Group_0__0"


    // $ANTLR start "rule__DoubleProperty__Group_0__0__Impl"
    // InternalCk2.g:1906:1: rule__DoubleProperty__Group_0__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_0_0 ) ) ;
    public final void rule__DoubleProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1910:1: ( ( ( rule__DoubleProperty__KeyAssignment_0_0 ) ) )
            // InternalCk2.g:1911:1: ( ( rule__DoubleProperty__KeyAssignment_0_0 ) )
            {
            // InternalCk2.g:1911:1: ( ( rule__DoubleProperty__KeyAssignment_0_0 ) )
            // InternalCk2.g:1912:2: ( rule__DoubleProperty__KeyAssignment_0_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_0_0()); 
            // InternalCk2.g:1913:2: ( rule__DoubleProperty__KeyAssignment_0_0 )
            // InternalCk2.g:1913:3: rule__DoubleProperty__KeyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_0__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_0__1"
    // InternalCk2.g:1921:1: rule__DoubleProperty__Group_0__1 : rule__DoubleProperty__Group_0__1__Impl rule__DoubleProperty__Group_0__2 ;
    public final void rule__DoubleProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1925:1: ( rule__DoubleProperty__Group_0__1__Impl rule__DoubleProperty__Group_0__2 )
            // InternalCk2.g:1926:2: rule__DoubleProperty__Group_0__1__Impl rule__DoubleProperty__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_0__2();

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
    // $ANTLR end "rule__DoubleProperty__Group_0__1"


    // $ANTLR start "rule__DoubleProperty__Group_0__1__Impl"
    // InternalCk2.g:1933:1: rule__DoubleProperty__Group_0__1__Impl : ( '=' ) ;
    public final void rule__DoubleProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1937:1: ( ( '=' ) )
            // InternalCk2.g:1938:1: ( '=' )
            {
            // InternalCk2.g:1938:1: ( '=' )
            // InternalCk2.g:1939:2: '='
            {
             before(grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_0__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_0__2"
    // InternalCk2.g:1948:1: rule__DoubleProperty__Group_0__2 : rule__DoubleProperty__Group_0__2__Impl ;
    public final void rule__DoubleProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1952:1: ( rule__DoubleProperty__Group_0__2__Impl )
            // InternalCk2.g:1953:2: rule__DoubleProperty__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_0__2__Impl();

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
    // $ANTLR end "rule__DoubleProperty__Group_0__2"


    // $ANTLR start "rule__DoubleProperty__Group_0__2__Impl"
    // InternalCk2.g:1959:1: rule__DoubleProperty__Group_0__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_0_2 ) ) ;
    public final void rule__DoubleProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1963:1: ( ( ( rule__DoubleProperty__ValueAssignment_0_2 ) ) )
            // InternalCk2.g:1964:1: ( ( rule__DoubleProperty__ValueAssignment_0_2 ) )
            {
            // InternalCk2.g:1964:1: ( ( rule__DoubleProperty__ValueAssignment_0_2 ) )
            // InternalCk2.g:1965:2: ( rule__DoubleProperty__ValueAssignment_0_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_0_2()); 
            // InternalCk2.g:1966:2: ( rule__DoubleProperty__ValueAssignment_0_2 )
            // InternalCk2.g:1966:3: rule__DoubleProperty__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_0_2()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_0__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_1__0"
    // InternalCk2.g:1975:1: rule__DoubleProperty__Group_1__0 : rule__DoubleProperty__Group_1__0__Impl rule__DoubleProperty__Group_1__1 ;
    public final void rule__DoubleProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1979:1: ( rule__DoubleProperty__Group_1__0__Impl rule__DoubleProperty__Group_1__1 )
            // InternalCk2.g:1980:2: rule__DoubleProperty__Group_1__0__Impl rule__DoubleProperty__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__DoubleProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_1__1();

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
    // $ANTLR end "rule__DoubleProperty__Group_1__0"


    // $ANTLR start "rule__DoubleProperty__Group_1__0__Impl"
    // InternalCk2.g:1987:1: rule__DoubleProperty__Group_1__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_1_0 ) ) ;
    public final void rule__DoubleProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1991:1: ( ( ( rule__DoubleProperty__KeyAssignment_1_0 ) ) )
            // InternalCk2.g:1992:1: ( ( rule__DoubleProperty__KeyAssignment_1_0 ) )
            {
            // InternalCk2.g:1992:1: ( ( rule__DoubleProperty__KeyAssignment_1_0 ) )
            // InternalCk2.g:1993:2: ( rule__DoubleProperty__KeyAssignment_1_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_1_0()); 
            // InternalCk2.g:1994:2: ( rule__DoubleProperty__KeyAssignment_1_0 )
            // InternalCk2.g:1994:3: rule__DoubleProperty__KeyAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_1_0()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_1__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_1__1"
    // InternalCk2.g:2002:1: rule__DoubleProperty__Group_1__1 : rule__DoubleProperty__Group_1__1__Impl rule__DoubleProperty__Group_1__2 ;
    public final void rule__DoubleProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2006:1: ( rule__DoubleProperty__Group_1__1__Impl rule__DoubleProperty__Group_1__2 )
            // InternalCk2.g:2007:2: rule__DoubleProperty__Group_1__1__Impl rule__DoubleProperty__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleProperty__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_1__2();

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
    // $ANTLR end "rule__DoubleProperty__Group_1__1"


    // $ANTLR start "rule__DoubleProperty__Group_1__1__Impl"
    // InternalCk2.g:2014:1: rule__DoubleProperty__Group_1__1__Impl : ( '==' ) ;
    public final void rule__DoubleProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2018:1: ( ( '==' ) )
            // InternalCk2.g:2019:1: ( '==' )
            {
            // InternalCk2.g:2019:1: ( '==' )
            // InternalCk2.g:2020:2: '=='
            {
             before(grammarAccess.getDoublePropertyAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getEqualsSignEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_1__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_1__2"
    // InternalCk2.g:2029:1: rule__DoubleProperty__Group_1__2 : rule__DoubleProperty__Group_1__2__Impl ;
    public final void rule__DoubleProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2033:1: ( rule__DoubleProperty__Group_1__2__Impl )
            // InternalCk2.g:2034:2: rule__DoubleProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_1__2__Impl();

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
    // $ANTLR end "rule__DoubleProperty__Group_1__2"


    // $ANTLR start "rule__DoubleProperty__Group_1__2__Impl"
    // InternalCk2.g:2040:1: rule__DoubleProperty__Group_1__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_1_2 ) ) ;
    public final void rule__DoubleProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2044:1: ( ( ( rule__DoubleProperty__ValueAssignment_1_2 ) ) )
            // InternalCk2.g:2045:1: ( ( rule__DoubleProperty__ValueAssignment_1_2 ) )
            {
            // InternalCk2.g:2045:1: ( ( rule__DoubleProperty__ValueAssignment_1_2 ) )
            // InternalCk2.g:2046:2: ( rule__DoubleProperty__ValueAssignment_1_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_1_2()); 
            // InternalCk2.g:2047:2: ( rule__DoubleProperty__ValueAssignment_1_2 )
            // InternalCk2.g:2047:3: rule__DoubleProperty__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_1__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_2__0"
    // InternalCk2.g:2056:1: rule__DoubleProperty__Group_2__0 : rule__DoubleProperty__Group_2__0__Impl rule__DoubleProperty__Group_2__1 ;
    public final void rule__DoubleProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2060:1: ( rule__DoubleProperty__Group_2__0__Impl rule__DoubleProperty__Group_2__1 )
            // InternalCk2.g:2061:2: rule__DoubleProperty__Group_2__0__Impl rule__DoubleProperty__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__DoubleProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_2__1();

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
    // $ANTLR end "rule__DoubleProperty__Group_2__0"


    // $ANTLR start "rule__DoubleProperty__Group_2__0__Impl"
    // InternalCk2.g:2068:1: rule__DoubleProperty__Group_2__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_2_0 ) ) ;
    public final void rule__DoubleProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2072:1: ( ( ( rule__DoubleProperty__KeyAssignment_2_0 ) ) )
            // InternalCk2.g:2073:1: ( ( rule__DoubleProperty__KeyAssignment_2_0 ) )
            {
            // InternalCk2.g:2073:1: ( ( rule__DoubleProperty__KeyAssignment_2_0 ) )
            // InternalCk2.g:2074:2: ( rule__DoubleProperty__KeyAssignment_2_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_2_0()); 
            // InternalCk2.g:2075:2: ( rule__DoubleProperty__KeyAssignment_2_0 )
            // InternalCk2.g:2075:3: rule__DoubleProperty__KeyAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_2__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_2__1"
    // InternalCk2.g:2083:1: rule__DoubleProperty__Group_2__1 : rule__DoubleProperty__Group_2__1__Impl rule__DoubleProperty__Group_2__2 ;
    public final void rule__DoubleProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2087:1: ( rule__DoubleProperty__Group_2__1__Impl rule__DoubleProperty__Group_2__2 )
            // InternalCk2.g:2088:2: rule__DoubleProperty__Group_2__1__Impl rule__DoubleProperty__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_2__2();

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
    // $ANTLR end "rule__DoubleProperty__Group_2__1"


    // $ANTLR start "rule__DoubleProperty__Group_2__1__Impl"
    // InternalCk2.g:2095:1: rule__DoubleProperty__Group_2__1__Impl : ( '>=' ) ;
    public final void rule__DoubleProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2099:1: ( ( '>=' ) )
            // InternalCk2.g:2100:1: ( '>=' )
            {
            // InternalCk2.g:2100:1: ( '>=' )
            // InternalCk2.g:2101:2: '>='
            {
             before(grammarAccess.getDoublePropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getGreaterThanSignEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_2__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_2__2"
    // InternalCk2.g:2110:1: rule__DoubleProperty__Group_2__2 : rule__DoubleProperty__Group_2__2__Impl ;
    public final void rule__DoubleProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2114:1: ( rule__DoubleProperty__Group_2__2__Impl )
            // InternalCk2.g:2115:2: rule__DoubleProperty__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_2__2__Impl();

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
    // $ANTLR end "rule__DoubleProperty__Group_2__2"


    // $ANTLR start "rule__DoubleProperty__Group_2__2__Impl"
    // InternalCk2.g:2121:1: rule__DoubleProperty__Group_2__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_2_2 ) ) ;
    public final void rule__DoubleProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2125:1: ( ( ( rule__DoubleProperty__ValueAssignment_2_2 ) ) )
            // InternalCk2.g:2126:1: ( ( rule__DoubleProperty__ValueAssignment_2_2 ) )
            {
            // InternalCk2.g:2126:1: ( ( rule__DoubleProperty__ValueAssignment_2_2 ) )
            // InternalCk2.g:2127:2: ( rule__DoubleProperty__ValueAssignment_2_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_2_2()); 
            // InternalCk2.g:2128:2: ( rule__DoubleProperty__ValueAssignment_2_2 )
            // InternalCk2.g:2128:3: rule__DoubleProperty__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_2_2()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_2__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_3__0"
    // InternalCk2.g:2137:1: rule__DoubleProperty__Group_3__0 : rule__DoubleProperty__Group_3__0__Impl rule__DoubleProperty__Group_3__1 ;
    public final void rule__DoubleProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2141:1: ( rule__DoubleProperty__Group_3__0__Impl rule__DoubleProperty__Group_3__1 )
            // InternalCk2.g:2142:2: rule__DoubleProperty__Group_3__0__Impl rule__DoubleProperty__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__DoubleProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_3__1();

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
    // $ANTLR end "rule__DoubleProperty__Group_3__0"


    // $ANTLR start "rule__DoubleProperty__Group_3__0__Impl"
    // InternalCk2.g:2149:1: rule__DoubleProperty__Group_3__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_3_0 ) ) ;
    public final void rule__DoubleProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2153:1: ( ( ( rule__DoubleProperty__KeyAssignment_3_0 ) ) )
            // InternalCk2.g:2154:1: ( ( rule__DoubleProperty__KeyAssignment_3_0 ) )
            {
            // InternalCk2.g:2154:1: ( ( rule__DoubleProperty__KeyAssignment_3_0 ) )
            // InternalCk2.g:2155:2: ( rule__DoubleProperty__KeyAssignment_3_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_3_0()); 
            // InternalCk2.g:2156:2: ( rule__DoubleProperty__KeyAssignment_3_0 )
            // InternalCk2.g:2156:3: rule__DoubleProperty__KeyAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_3_0()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_3__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_3__1"
    // InternalCk2.g:2164:1: rule__DoubleProperty__Group_3__1 : rule__DoubleProperty__Group_3__1__Impl rule__DoubleProperty__Group_3__2 ;
    public final void rule__DoubleProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2168:1: ( rule__DoubleProperty__Group_3__1__Impl rule__DoubleProperty__Group_3__2 )
            // InternalCk2.g:2169:2: rule__DoubleProperty__Group_3__1__Impl rule__DoubleProperty__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleProperty__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_3__2();

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
    // $ANTLR end "rule__DoubleProperty__Group_3__1"


    // $ANTLR start "rule__DoubleProperty__Group_3__1__Impl"
    // InternalCk2.g:2176:1: rule__DoubleProperty__Group_3__1__Impl : ( '>' ) ;
    public final void rule__DoubleProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2180:1: ( ( '>' ) )
            // InternalCk2.g:2181:1: ( '>' )
            {
            // InternalCk2.g:2181:1: ( '>' )
            // InternalCk2.g:2182:2: '>'
            {
             before(grammarAccess.getDoublePropertyAccess().getGreaterThanSignKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getGreaterThanSignKeyword_3_1()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_3__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_3__2"
    // InternalCk2.g:2191:1: rule__DoubleProperty__Group_3__2 : rule__DoubleProperty__Group_3__2__Impl ;
    public final void rule__DoubleProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2195:1: ( rule__DoubleProperty__Group_3__2__Impl )
            // InternalCk2.g:2196:2: rule__DoubleProperty__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_3__2__Impl();

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
    // $ANTLR end "rule__DoubleProperty__Group_3__2"


    // $ANTLR start "rule__DoubleProperty__Group_3__2__Impl"
    // InternalCk2.g:2202:1: rule__DoubleProperty__Group_3__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_3_2 ) ) ;
    public final void rule__DoubleProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2206:1: ( ( ( rule__DoubleProperty__ValueAssignment_3_2 ) ) )
            // InternalCk2.g:2207:1: ( ( rule__DoubleProperty__ValueAssignment_3_2 ) )
            {
            // InternalCk2.g:2207:1: ( ( rule__DoubleProperty__ValueAssignment_3_2 ) )
            // InternalCk2.g:2208:2: ( rule__DoubleProperty__ValueAssignment_3_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_3_2()); 
            // InternalCk2.g:2209:2: ( rule__DoubleProperty__ValueAssignment_3_2 )
            // InternalCk2.g:2209:3: rule__DoubleProperty__ValueAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_3_2()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_3__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_4__0"
    // InternalCk2.g:2218:1: rule__DoubleProperty__Group_4__0 : rule__DoubleProperty__Group_4__0__Impl rule__DoubleProperty__Group_4__1 ;
    public final void rule__DoubleProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2222:1: ( rule__DoubleProperty__Group_4__0__Impl rule__DoubleProperty__Group_4__1 )
            // InternalCk2.g:2223:2: rule__DoubleProperty__Group_4__0__Impl rule__DoubleProperty__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__DoubleProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_4__1();

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
    // $ANTLR end "rule__DoubleProperty__Group_4__0"


    // $ANTLR start "rule__DoubleProperty__Group_4__0__Impl"
    // InternalCk2.g:2230:1: rule__DoubleProperty__Group_4__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_4_0 ) ) ;
    public final void rule__DoubleProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2234:1: ( ( ( rule__DoubleProperty__KeyAssignment_4_0 ) ) )
            // InternalCk2.g:2235:1: ( ( rule__DoubleProperty__KeyAssignment_4_0 ) )
            {
            // InternalCk2.g:2235:1: ( ( rule__DoubleProperty__KeyAssignment_4_0 ) )
            // InternalCk2.g:2236:2: ( rule__DoubleProperty__KeyAssignment_4_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_4_0()); 
            // InternalCk2.g:2237:2: ( rule__DoubleProperty__KeyAssignment_4_0 )
            // InternalCk2.g:2237:3: rule__DoubleProperty__KeyAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_4_0()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_4__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_4__1"
    // InternalCk2.g:2245:1: rule__DoubleProperty__Group_4__1 : rule__DoubleProperty__Group_4__1__Impl rule__DoubleProperty__Group_4__2 ;
    public final void rule__DoubleProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2249:1: ( rule__DoubleProperty__Group_4__1__Impl rule__DoubleProperty__Group_4__2 )
            // InternalCk2.g:2250:2: rule__DoubleProperty__Group_4__1__Impl rule__DoubleProperty__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_4__2();

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
    // $ANTLR end "rule__DoubleProperty__Group_4__1"


    // $ANTLR start "rule__DoubleProperty__Group_4__1__Impl"
    // InternalCk2.g:2257:1: rule__DoubleProperty__Group_4__1__Impl : ( '<=' ) ;
    public final void rule__DoubleProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2261:1: ( ( '<=' ) )
            // InternalCk2.g:2262:1: ( '<=' )
            {
            // InternalCk2.g:2262:1: ( '<=' )
            // InternalCk2.g:2263:2: '<='
            {
             before(grammarAccess.getDoublePropertyAccess().getLessThanSignEqualsSignKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getLessThanSignEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_4__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_4__2"
    // InternalCk2.g:2272:1: rule__DoubleProperty__Group_4__2 : rule__DoubleProperty__Group_4__2__Impl ;
    public final void rule__DoubleProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2276:1: ( rule__DoubleProperty__Group_4__2__Impl )
            // InternalCk2.g:2277:2: rule__DoubleProperty__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_4__2__Impl();

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
    // $ANTLR end "rule__DoubleProperty__Group_4__2"


    // $ANTLR start "rule__DoubleProperty__Group_4__2__Impl"
    // InternalCk2.g:2283:1: rule__DoubleProperty__Group_4__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__DoubleProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2287:1: ( ( ( rule__DoubleProperty__ValueAssignment_4_2 ) ) )
            // InternalCk2.g:2288:1: ( ( rule__DoubleProperty__ValueAssignment_4_2 ) )
            {
            // InternalCk2.g:2288:1: ( ( rule__DoubleProperty__ValueAssignment_4_2 ) )
            // InternalCk2.g:2289:2: ( rule__DoubleProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_4_2()); 
            // InternalCk2.g:2290:2: ( rule__DoubleProperty__ValueAssignment_4_2 )
            // InternalCk2.g:2290:3: rule__DoubleProperty__ValueAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_4_2()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_4__2__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_5__0"
    // InternalCk2.g:2299:1: rule__DoubleProperty__Group_5__0 : rule__DoubleProperty__Group_5__0__Impl rule__DoubleProperty__Group_5__1 ;
    public final void rule__DoubleProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2303:1: ( rule__DoubleProperty__Group_5__0__Impl rule__DoubleProperty__Group_5__1 )
            // InternalCk2.g:2304:2: rule__DoubleProperty__Group_5__0__Impl rule__DoubleProperty__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__DoubleProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_5__1();

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
    // $ANTLR end "rule__DoubleProperty__Group_5__0"


    // $ANTLR start "rule__DoubleProperty__Group_5__0__Impl"
    // InternalCk2.g:2311:1: rule__DoubleProperty__Group_5__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_5_0 ) ) ;
    public final void rule__DoubleProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2315:1: ( ( ( rule__DoubleProperty__KeyAssignment_5_0 ) ) )
            // InternalCk2.g:2316:1: ( ( rule__DoubleProperty__KeyAssignment_5_0 ) )
            {
            // InternalCk2.g:2316:1: ( ( rule__DoubleProperty__KeyAssignment_5_0 ) )
            // InternalCk2.g:2317:2: ( rule__DoubleProperty__KeyAssignment_5_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_5_0()); 
            // InternalCk2.g:2318:2: ( rule__DoubleProperty__KeyAssignment_5_0 )
            // InternalCk2.g:2318:3: rule__DoubleProperty__KeyAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__KeyAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getKeyAssignment_5_0()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_5__0__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_5__1"
    // InternalCk2.g:2326:1: rule__DoubleProperty__Group_5__1 : rule__DoubleProperty__Group_5__1__Impl rule__DoubleProperty__Group_5__2 ;
    public final void rule__DoubleProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2330:1: ( rule__DoubleProperty__Group_5__1__Impl rule__DoubleProperty__Group_5__2 )
            // InternalCk2.g:2331:2: rule__DoubleProperty__Group_5__1__Impl rule__DoubleProperty__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_5__2();

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
    // $ANTLR end "rule__DoubleProperty__Group_5__1"


    // $ANTLR start "rule__DoubleProperty__Group_5__1__Impl"
    // InternalCk2.g:2338:1: rule__DoubleProperty__Group_5__1__Impl : ( '<' ) ;
    public final void rule__DoubleProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2342:1: ( ( '<' ) )
            // InternalCk2.g:2343:1: ( '<' )
            {
            // InternalCk2.g:2343:1: ( '<' )
            // InternalCk2.g:2344:2: '<'
            {
             before(grammarAccess.getDoublePropertyAccess().getLessThanSignKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getLessThanSignKeyword_5_1()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_5__1__Impl"


    // $ANTLR start "rule__DoubleProperty__Group_5__2"
    // InternalCk2.g:2353:1: rule__DoubleProperty__Group_5__2 : rule__DoubleProperty__Group_5__2__Impl ;
    public final void rule__DoubleProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2357:1: ( rule__DoubleProperty__Group_5__2__Impl )
            // InternalCk2.g:2358:2: rule__DoubleProperty__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__Group_5__2__Impl();

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
    // $ANTLR end "rule__DoubleProperty__Group_5__2"


    // $ANTLR start "rule__DoubleProperty__Group_5__2__Impl"
    // InternalCk2.g:2364:1: rule__DoubleProperty__Group_5__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_5_2 ) ) ;
    public final void rule__DoubleProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2368:1: ( ( ( rule__DoubleProperty__ValueAssignment_5_2 ) ) )
            // InternalCk2.g:2369:1: ( ( rule__DoubleProperty__ValueAssignment_5_2 ) )
            {
            // InternalCk2.g:2369:1: ( ( rule__DoubleProperty__ValueAssignment_5_2 ) )
            // InternalCk2.g:2370:2: ( rule__DoubleProperty__ValueAssignment_5_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_5_2()); 
            // InternalCk2.g:2371:2: ( rule__DoubleProperty__ValueAssignment_5_2 )
            // InternalCk2.g:2371:3: rule__DoubleProperty__ValueAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleProperty__ValueAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDoublePropertyAccess().getValueAssignment_5_2()); 

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
    // $ANTLR end "rule__DoubleProperty__Group_5__2__Impl"


    // $ANTLR start "rule__HexadecimalProperty__Group__0"
    // InternalCk2.g:2380:1: rule__HexadecimalProperty__Group__0 : rule__HexadecimalProperty__Group__0__Impl rule__HexadecimalProperty__Group__1 ;
    public final void rule__HexadecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2384:1: ( rule__HexadecimalProperty__Group__0__Impl rule__HexadecimalProperty__Group__1 )
            // InternalCk2.g:2385:2: rule__HexadecimalProperty__Group__0__Impl rule__HexadecimalProperty__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__HexadecimalProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HexadecimalProperty__Group__1();

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
    // $ANTLR end "rule__HexadecimalProperty__Group__0"


    // $ANTLR start "rule__HexadecimalProperty__Group__0__Impl"
    // InternalCk2.g:2392:1: rule__HexadecimalProperty__Group__0__Impl : ( ( rule__HexadecimalProperty__KeyAssignment_0 ) ) ;
    public final void rule__HexadecimalProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2396:1: ( ( ( rule__HexadecimalProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2397:1: ( ( rule__HexadecimalProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2397:1: ( ( rule__HexadecimalProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2398:2: ( rule__HexadecimalProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2399:2: ( rule__HexadecimalProperty__KeyAssignment_0 )
            // InternalCk2.g:2399:3: rule__HexadecimalProperty__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalProperty__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHexadecimalPropertyAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__HexadecimalProperty__Group__0__Impl"


    // $ANTLR start "rule__HexadecimalProperty__Group__1"
    // InternalCk2.g:2407:1: rule__HexadecimalProperty__Group__1 : rule__HexadecimalProperty__Group__1__Impl rule__HexadecimalProperty__Group__2 ;
    public final void rule__HexadecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2411:1: ( rule__HexadecimalProperty__Group__1__Impl rule__HexadecimalProperty__Group__2 )
            // InternalCk2.g:2412:2: rule__HexadecimalProperty__Group__1__Impl rule__HexadecimalProperty__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__HexadecimalProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HexadecimalProperty__Group__2();

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
    // $ANTLR end "rule__HexadecimalProperty__Group__1"


    // $ANTLR start "rule__HexadecimalProperty__Group__1__Impl"
    // InternalCk2.g:2419:1: rule__HexadecimalProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__HexadecimalProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2423:1: ( ( '=' ) )
            // InternalCk2.g:2424:1: ( '=' )
            {
            // InternalCk2.g:2424:1: ( '=' )
            // InternalCk2.g:2425:2: '='
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHexadecimalPropertyAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__HexadecimalProperty__Group__1__Impl"


    // $ANTLR start "rule__HexadecimalProperty__Group__2"
    // InternalCk2.g:2434:1: rule__HexadecimalProperty__Group__2 : rule__HexadecimalProperty__Group__2__Impl ;
    public final void rule__HexadecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2438:1: ( rule__HexadecimalProperty__Group__2__Impl )
            // InternalCk2.g:2439:2: rule__HexadecimalProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalProperty__Group__2__Impl();

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
    // $ANTLR end "rule__HexadecimalProperty__Group__2"


    // $ANTLR start "rule__HexadecimalProperty__Group__2__Impl"
    // InternalCk2.g:2445:1: rule__HexadecimalProperty__Group__2__Impl : ( ( rule__HexadecimalProperty__ValueAssignment_2 ) ) ;
    public final void rule__HexadecimalProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2449:1: ( ( ( rule__HexadecimalProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2450:1: ( ( rule__HexadecimalProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2450:1: ( ( rule__HexadecimalProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2451:2: ( rule__HexadecimalProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2452:2: ( rule__HexadecimalProperty__ValueAssignment_2 )
            // InternalCk2.g:2452:3: rule__HexadecimalProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHexadecimalPropertyAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__HexadecimalProperty__Group__2__Impl"


    // $ANTLR start "rule__ListProperty__Group__0"
    // InternalCk2.g:2461:1: rule__ListProperty__Group__0 : rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 ;
    public final void rule__ListProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2465:1: ( rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 )
            // InternalCk2.g:2466:2: rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:2473:1: rule__ListProperty__Group__0__Impl : ( ( rule__ListProperty__KeyAssignment_0 ) ) ;
    public final void rule__ListProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2477:1: ( ( ( rule__ListProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2478:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2478:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2479:2: ( rule__ListProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getListPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2480:2: ( rule__ListProperty__KeyAssignment_0 )
            // InternalCk2.g:2480:3: rule__ListProperty__KeyAssignment_0
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
    // InternalCk2.g:2488:1: rule__ListProperty__Group__1 : rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 ;
    public final void rule__ListProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2492:1: ( rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 )
            // InternalCk2.g:2493:2: rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCk2.g:2500:1: rule__ListProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ListProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2504:1: ( ( '=' ) )
            // InternalCk2.g:2505:1: ( '=' )
            {
            // InternalCk2.g:2505:1: ( '=' )
            // InternalCk2.g:2506:2: '='
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
    // InternalCk2.g:2515:1: rule__ListProperty__Group__2 : rule__ListProperty__Group__2__Impl ;
    public final void rule__ListProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2519:1: ( rule__ListProperty__Group__2__Impl )
            // InternalCk2.g:2520:2: rule__ListProperty__Group__2__Impl
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
    // InternalCk2.g:2526:1: rule__ListProperty__Group__2__Impl : ( ( rule__ListProperty__ValueAssignment_2 ) ) ;
    public final void rule__ListProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2530:1: ( ( ( rule__ListProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2531:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2531:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2532:2: ( rule__ListProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getListPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2533:2: ( rule__ListProperty__ValueAssignment_2 )
            // InternalCk2.g:2533:3: rule__ListProperty__ValueAssignment_2
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
    // InternalCk2.g:2542:1: rule__IdClauseProperty__Group__0 : rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 ;
    public final void rule__IdClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2546:1: ( rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 )
            // InternalCk2.g:2547:2: rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:2554:1: rule__IdClauseProperty__Group__0__Impl : ( ( rule__IdClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IdClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2558:1: ( ( ( rule__IdClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2559:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2559:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2560:2: ( rule__IdClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2561:2: ( rule__IdClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2561:3: rule__IdClauseProperty__NameAssignment_0
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
    // InternalCk2.g:2569:1: rule__IdClauseProperty__Group__1 : rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 ;
    public final void rule__IdClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2573:1: ( rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 )
            // InternalCk2.g:2574:2: rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCk2.g:2581:1: rule__IdClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2585:1: ( ( '=' ) )
            // InternalCk2.g:2586:1: ( '=' )
            {
            // InternalCk2.g:2586:1: ( '=' )
            // InternalCk2.g:2587:2: '='
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
    // InternalCk2.g:2596:1: rule__IdClauseProperty__Group__2 : rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 ;
    public final void rule__IdClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2600:1: ( rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 )
            // InternalCk2.g:2601:2: rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalCk2.g:2608:1: rule__IdClauseProperty__Group__2__Impl : ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2612:1: ( ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2613:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2613:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2614:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2615:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2615:3: rule__IdClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:2623:1: rule__IdClauseProperty__Group__3 : rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 ;
    public final void rule__IdClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2627:1: ( rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 )
            // InternalCk2.g:2628:2: rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCk2.g:2635:1: rule__IdClauseProperty__Group__3__Impl : ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IdClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2639:1: ( ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2640:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2640:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2641:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIdClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2642:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=RULE_INT && LA9_0<=RULE_BOOL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:2642:3: rule__IdClauseProperty__PropertiesAssignment_3
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
    // InternalCk2.g:2650:1: rule__IdClauseProperty__Group__4 : rule__IdClauseProperty__Group__4__Impl ;
    public final void rule__IdClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2654:1: ( rule__IdClauseProperty__Group__4__Impl )
            // InternalCk2.g:2655:2: rule__IdClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2661:1: rule__IdClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IdClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2665:1: ( ( '}' ) )
            // InternalCk2.g:2666:1: ( '}' )
            {
            // InternalCk2.g:2666:1: ( '}' )
            // InternalCk2.g:2667:2: '}'
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
    // InternalCk2.g:2677:1: rule__IntClauseProperty__Group__0 : rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 ;
    public final void rule__IntClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2681:1: ( rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 )
            // InternalCk2.g:2682:2: rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:2689:1: rule__IntClauseProperty__Group__0__Impl : ( ( rule__IntClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IntClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2693:1: ( ( ( rule__IntClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2694:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2694:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2695:2: ( rule__IntClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2696:2: ( rule__IntClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2696:3: rule__IntClauseProperty__NameAssignment_0
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
    // InternalCk2.g:2704:1: rule__IntClauseProperty__Group__1 : rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 ;
    public final void rule__IntClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2708:1: ( rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 )
            // InternalCk2.g:2709:2: rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCk2.g:2716:1: rule__IntClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IntClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2720:1: ( ( '=' ) )
            // InternalCk2.g:2721:1: ( '=' )
            {
            // InternalCk2.g:2721:1: ( '=' )
            // InternalCk2.g:2722:2: '='
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
    // InternalCk2.g:2731:1: rule__IntClauseProperty__Group__2 : rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 ;
    public final void rule__IntClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2735:1: ( rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 )
            // InternalCk2.g:2736:2: rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalCk2.g:2743:1: rule__IntClauseProperty__Group__2__Impl : ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IntClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2747:1: ( ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2748:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2748:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2749:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2750:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2750:3: rule__IntClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:2758:1: rule__IntClauseProperty__Group__3 : rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 ;
    public final void rule__IntClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2762:1: ( rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 )
            // InternalCk2.g:2763:2: rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCk2.g:2770:1: rule__IntClauseProperty__Group__3__Impl : ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IntClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2774:1: ( ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2775:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2775:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2776:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIntClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2777:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=RULE_INT && LA10_0<=RULE_BOOL)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCk2.g:2777:3: rule__IntClauseProperty__PropertiesAssignment_3
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
    // InternalCk2.g:2785:1: rule__IntClauseProperty__Group__4 : rule__IntClauseProperty__Group__4__Impl ;
    public final void rule__IntClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2789:1: ( rule__IntClauseProperty__Group__4__Impl )
            // InternalCk2.g:2790:2: rule__IntClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2796:1: rule__IntClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IntClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2800:1: ( ( '}' ) )
            // InternalCk2.g:2801:1: ( '}' )
            {
            // InternalCk2.g:2801:1: ( '}' )
            // InternalCk2.g:2802:2: '}'
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
    // InternalCk2.g:2812:1: rule__DateClauseProperty__Group__0 : rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 ;
    public final void rule__DateClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2816:1: ( rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 )
            // InternalCk2.g:2817:2: rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:2824:1: rule__DateClauseProperty__Group__0__Impl : ( ( rule__DateClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__DateClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2828:1: ( ( ( rule__DateClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2829:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2829:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2830:2: ( rule__DateClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2831:2: ( rule__DateClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2831:3: rule__DateClauseProperty__NameAssignment_0
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
    // InternalCk2.g:2839:1: rule__DateClauseProperty__Group__1 : rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 ;
    public final void rule__DateClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2843:1: ( rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 )
            // InternalCk2.g:2844:2: rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCk2.g:2851:1: rule__DateClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2855:1: ( ( '=' ) )
            // InternalCk2.g:2856:1: ( '=' )
            {
            // InternalCk2.g:2856:1: ( '=' )
            // InternalCk2.g:2857:2: '='
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
    // InternalCk2.g:2866:1: rule__DateClauseProperty__Group__2 : rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 ;
    public final void rule__DateClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2870:1: ( rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 )
            // InternalCk2.g:2871:2: rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalCk2.g:2878:1: rule__DateClauseProperty__Group__2__Impl : ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2882:1: ( ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2883:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2883:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2884:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2885:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2885:3: rule__DateClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:2893:1: rule__DateClauseProperty__Group__3 : rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 ;
    public final void rule__DateClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2897:1: ( rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 )
            // InternalCk2.g:2898:2: rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCk2.g:2905:1: rule__DateClauseProperty__Group__3__Impl : ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__DateClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2909:1: ( ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2910:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2910:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2911:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getDateClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2912:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=RULE_INT && LA11_0<=RULE_BOOL)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCk2.g:2912:3: rule__DateClauseProperty__PropertiesAssignment_3
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
    // InternalCk2.g:2920:1: rule__DateClauseProperty__Group__4 : rule__DateClauseProperty__Group__4__Impl ;
    public final void rule__DateClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2924:1: ( rule__DateClauseProperty__Group__4__Impl )
            // InternalCk2.g:2925:2: rule__DateClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2931:1: rule__DateClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DateClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2935:1: ( ( '}' ) )
            // InternalCk2.g:2936:1: ( '}' )
            {
            // InternalCk2.g:2936:1: ( '}' )
            // InternalCk2.g:2937:2: '}'
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
    // InternalCk2.g:2947:1: rule__ProbabilityProperty__Group__0 : rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 ;
    public final void rule__ProbabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2951:1: ( rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 )
            // InternalCk2.g:2952:2: rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCk2.g:2959:1: rule__ProbabilityProperty__Group__0__Impl : ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) ;
    public final void rule__ProbabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2963:1: ( ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2964:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2964:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2965:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2966:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            // InternalCk2.g:2966:3: rule__ProbabilityProperty__KeyAssignment_0
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
    // InternalCk2.g:2974:1: rule__ProbabilityProperty__Group__1 : rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 ;
    public final void rule__ProbabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2978:1: ( rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 )
            // InternalCk2.g:2979:2: rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalCk2.g:2986:1: rule__ProbabilityProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ProbabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2990:1: ( ( '=' ) )
            // InternalCk2.g:2991:1: ( '=' )
            {
            // InternalCk2.g:2991:1: ( '=' )
            // InternalCk2.g:2992:2: '='
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
    // InternalCk2.g:3001:1: rule__ProbabilityProperty__Group__2 : rule__ProbabilityProperty__Group__2__Impl ;
    public final void rule__ProbabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3005:1: ( rule__ProbabilityProperty__Group__2__Impl )
            // InternalCk2.g:3006:2: rule__ProbabilityProperty__Group__2__Impl
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
    // InternalCk2.g:3012:1: rule__ProbabilityProperty__Group__2__Impl : ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) ;
    public final void rule__ProbabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3016:1: ( ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:3017:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:3017:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            // InternalCk2.g:3018:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:3019:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            // InternalCk2.g:3019:3: rule__ProbabilityProperty__ValueAssignment_2
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


    // $ANTLR start "rule__BoolClauseProperty__Group__0"
    // InternalCk2.g:3028:1: rule__BoolClauseProperty__Group__0 : rule__BoolClauseProperty__Group__0__Impl rule__BoolClauseProperty__Group__1 ;
    public final void rule__BoolClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3032:1: ( rule__BoolClauseProperty__Group__0__Impl rule__BoolClauseProperty__Group__1 )
            // InternalCk2.g:3033:2: rule__BoolClauseProperty__Group__0__Impl rule__BoolClauseProperty__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__BoolClauseProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__Group__1();

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
    // $ANTLR end "rule__BoolClauseProperty__Group__0"


    // $ANTLR start "rule__BoolClauseProperty__Group__0__Impl"
    // InternalCk2.g:3040:1: rule__BoolClauseProperty__Group__0__Impl : ( ( rule__BoolClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__BoolClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3044:1: ( ( ( rule__BoolClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:3045:1: ( ( rule__BoolClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:3045:1: ( ( rule__BoolClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:3046:2: ( rule__BoolClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getBoolClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:3047:2: ( rule__BoolClauseProperty__NameAssignment_0 )
            // InternalCk2.g:3047:3: rule__BoolClauseProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolClausePropertyAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__BoolClauseProperty__Group__0__Impl"


    // $ANTLR start "rule__BoolClauseProperty__Group__1"
    // InternalCk2.g:3055:1: rule__BoolClauseProperty__Group__1 : rule__BoolClauseProperty__Group__1__Impl rule__BoolClauseProperty__Group__2 ;
    public final void rule__BoolClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3059:1: ( rule__BoolClauseProperty__Group__1__Impl rule__BoolClauseProperty__Group__2 )
            // InternalCk2.g:3060:2: rule__BoolClauseProperty__Group__1__Impl rule__BoolClauseProperty__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__BoolClauseProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__Group__2();

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
    // $ANTLR end "rule__BoolClauseProperty__Group__1"


    // $ANTLR start "rule__BoolClauseProperty__Group__1__Impl"
    // InternalCk2.g:3067:1: rule__BoolClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__BoolClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3071:1: ( ( '=' ) )
            // InternalCk2.g:3072:1: ( '=' )
            {
            // InternalCk2.g:3072:1: ( '=' )
            // InternalCk2.g:3073:2: '='
            {
             before(grammarAccess.getBoolClausePropertyAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoolClausePropertyAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__BoolClauseProperty__Group__1__Impl"


    // $ANTLR start "rule__BoolClauseProperty__Group__2"
    // InternalCk2.g:3082:1: rule__BoolClauseProperty__Group__2 : rule__BoolClauseProperty__Group__2__Impl rule__BoolClauseProperty__Group__3 ;
    public final void rule__BoolClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3086:1: ( rule__BoolClauseProperty__Group__2__Impl rule__BoolClauseProperty__Group__3 )
            // InternalCk2.g:3087:2: rule__BoolClauseProperty__Group__2__Impl rule__BoolClauseProperty__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__BoolClauseProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__Group__3();

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
    // $ANTLR end "rule__BoolClauseProperty__Group__2"


    // $ANTLR start "rule__BoolClauseProperty__Group__2__Impl"
    // InternalCk2.g:3094:1: rule__BoolClauseProperty__Group__2__Impl : ( ( rule__BoolClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__BoolClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3098:1: ( ( ( rule__BoolClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:3099:1: ( ( rule__BoolClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:3099:1: ( ( rule__BoolClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:3100:2: ( rule__BoolClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getBoolClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:3101:2: ( rule__BoolClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:3101:3: rule__BoolClauseProperty__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoolClausePropertyAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__BoolClauseProperty__Group__2__Impl"


    // $ANTLR start "rule__BoolClauseProperty__Group__3"
    // InternalCk2.g:3109:1: rule__BoolClauseProperty__Group__3 : rule__BoolClauseProperty__Group__3__Impl rule__BoolClauseProperty__Group__4 ;
    public final void rule__BoolClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3113:1: ( rule__BoolClauseProperty__Group__3__Impl rule__BoolClauseProperty__Group__4 )
            // InternalCk2.g:3114:2: rule__BoolClauseProperty__Group__3__Impl rule__BoolClauseProperty__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__BoolClauseProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__Group__4();

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
    // $ANTLR end "rule__BoolClauseProperty__Group__3"


    // $ANTLR start "rule__BoolClauseProperty__Group__3__Impl"
    // InternalCk2.g:3121:1: rule__BoolClauseProperty__Group__3__Impl : ( ( rule__BoolClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__BoolClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3125:1: ( ( ( rule__BoolClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:3126:1: ( ( rule__BoolClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:3126:1: ( ( rule__BoolClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:3127:2: ( rule__BoolClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getBoolClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:3128:2: ( rule__BoolClauseProperty__PropertiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=RULE_INT && LA12_0<=RULE_BOOL)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCk2.g:3128:3: rule__BoolClauseProperty__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__BoolClauseProperty__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBoolClausePropertyAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__BoolClauseProperty__Group__3__Impl"


    // $ANTLR start "rule__BoolClauseProperty__Group__4"
    // InternalCk2.g:3136:1: rule__BoolClauseProperty__Group__4 : rule__BoolClauseProperty__Group__4__Impl ;
    public final void rule__BoolClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3140:1: ( rule__BoolClauseProperty__Group__4__Impl )
            // InternalCk2.g:3141:2: rule__BoolClauseProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolClauseProperty__Group__4__Impl();

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
    // $ANTLR end "rule__BoolClauseProperty__Group__4"


    // $ANTLR start "rule__BoolClauseProperty__Group__4__Impl"
    // InternalCk2.g:3147:1: rule__BoolClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__BoolClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3151:1: ( ( '}' ) )
            // InternalCk2.g:3152:1: ( '}' )
            {
            // InternalCk2.g:3152:1: ( '}' )
            // InternalCk2.g:3153:2: '}'
            {
             before(grammarAccess.getBoolClausePropertyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBoolClausePropertyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__BoolClauseProperty__Group__4__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalCk2.g:3163:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3167:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalCk2.g:3168:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCk2.g:3175:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3179:1: ( ( RULE_INT ) )
            // InternalCk2.g:3180:1: ( RULE_INT )
            {
            // InternalCk2.g:3180:1: ( RULE_INT )
            // InternalCk2.g:3181:2: RULE_INT
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
    // InternalCk2.g:3190:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3194:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalCk2.g:3195:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCk2.g:3202:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3206:1: ( ( '.' ) )
            // InternalCk2.g:3207:1: ( '.' )
            {
            // InternalCk2.g:3207:1: ( '.' )
            // InternalCk2.g:3208:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCk2.g:3217:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3221:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalCk2.g:3222:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCk2.g:3229:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3233:1: ( ( RULE_INT ) )
            // InternalCk2.g:3234:1: ( RULE_INT )
            {
            // InternalCk2.g:3234:1: ( RULE_INT )
            // InternalCk2.g:3235:2: RULE_INT
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
    // InternalCk2.g:3244:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3248:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalCk2.g:3249:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCk2.g:3256:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3260:1: ( ( '.' ) )
            // InternalCk2.g:3261:1: ( '.' )
            {
            // InternalCk2.g:3261:1: ( '.' )
            // InternalCk2.g:3262:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCk2.g:3271:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3275:1: ( rule__Date__Group__4__Impl )
            // InternalCk2.g:3276:2: rule__Date__Group__4__Impl
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
    // InternalCk2.g:3282:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3286:1: ( ( RULE_INT ) )
            // InternalCk2.g:3287:1: ( RULE_INT )
            {
            // InternalCk2.g:3287:1: ( RULE_INT )
            // InternalCk2.g:3288:2: RULE_INT
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
    // InternalCk2.g:3298:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3302:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalCk2.g:3303:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCk2.g:3310:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__Alternatives_0 )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3314:1: ( ( ( rule__Integer__Alternatives_0 )? ) )
            // InternalCk2.g:3315:1: ( ( rule__Integer__Alternatives_0 )? )
            {
            // InternalCk2.g:3315:1: ( ( rule__Integer__Alternatives_0 )? )
            // InternalCk2.g:3316:2: ( rule__Integer__Alternatives_0 )?
            {
             before(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            // InternalCk2.g:3317:2: ( rule__Integer__Alternatives_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=16)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCk2.g:3317:3: rule__Integer__Alternatives_0
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
    // InternalCk2.g:3325:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3329:1: ( rule__Integer__Group__1__Impl )
            // InternalCk2.g:3330:2: rule__Integer__Group__1__Impl
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
    // InternalCk2.g:3336:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3340:1: ( ( RULE_INT ) )
            // InternalCk2.g:3341:1: ( RULE_INT )
            {
            // InternalCk2.g:3341:1: ( RULE_INT )
            // InternalCk2.g:3342:2: RULE_INT
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
    // InternalCk2.g:3352:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3356:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalCk2.g:3357:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCk2.g:3364:1: rule__Double__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3368:1: ( ( ruleInteger ) )
            // InternalCk2.g:3369:1: ( ruleInteger )
            {
            // InternalCk2.g:3369:1: ( ruleInteger )
            // InternalCk2.g:3370:2: ruleInteger
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
    // InternalCk2.g:3379:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3383:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalCk2.g:3384:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCk2.g:3391:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3395:1: ( ( '.' ) )
            // InternalCk2.g:3396:1: ( '.' )
            {
            // InternalCk2.g:3396:1: ( '.' )
            // InternalCk2.g:3397:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCk2.g:3406:1: rule__Double__Group__2 : rule__Double__Group__2__Impl rule__Double__Group__3 ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3410:1: ( rule__Double__Group__2__Impl rule__Double__Group__3 )
            // InternalCk2.g:3411:2: rule__Double__Group__2__Impl rule__Double__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Double__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__3();

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
    // InternalCk2.g:3418:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3422:1: ( ( RULE_INT ) )
            // InternalCk2.g:3423:1: ( RULE_INT )
            {
            // InternalCk2.g:3423:1: ( RULE_INT )
            // InternalCk2.g:3424:2: RULE_INT
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


    // $ANTLR start "rule__Double__Group__3"
    // InternalCk2.g:3433:1: rule__Double__Group__3 : rule__Double__Group__3__Impl ;
    public final void rule__Double__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3437:1: ( rule__Double__Group__3__Impl )
            // InternalCk2.g:3438:2: rule__Double__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__3__Impl();

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
    // $ANTLR end "rule__Double__Group__3"


    // $ANTLR start "rule__Double__Group__3__Impl"
    // InternalCk2.g:3444:1: rule__Double__Group__3__Impl : ( ( 'f' )? ) ;
    public final void rule__Double__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3448:1: ( ( ( 'f' )? ) )
            // InternalCk2.g:3449:1: ( ( 'f' )? )
            {
            // InternalCk2.g:3449:1: ( ( 'f' )? )
            // InternalCk2.g:3450:2: ( 'f' )?
            {
             before(grammarAccess.getDoubleAccess().getFKeyword_3()); 
            // InternalCk2.g:3451:2: ( 'f' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCk2.g:3451:3: 'f'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getFKeyword_3()); 

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
    // $ANTLR end "rule__Double__Group__3__Impl"


    // $ANTLR start "rule__Model__PropertiesAssignment"
    // InternalCk2.g:3460:1: rule__Model__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__Model__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3464:1: ( ( ruleProperty ) )
            // InternalCk2.g:3465:2: ( ruleProperty )
            {
            // InternalCk2.g:3465:2: ( ruleProperty )
            // InternalCk2.g:3466:3: ruleProperty
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
    // InternalCk2.g:3475:1: rule__List__ElemsAssignment_1 : ( ruleListElem ) ;
    public final void rule__List__ElemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3479:1: ( ( ruleListElem ) )
            // InternalCk2.g:3480:2: ( ruleListElem )
            {
            // InternalCk2.g:3480:2: ( ruleListElem )
            // InternalCk2.g:3481:3: ruleListElem
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
    // InternalCk2.g:3490:1: rule__StringProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3494:1: ( ( RULE_ID ) )
            // InternalCk2.g:3495:2: ( RULE_ID )
            {
            // InternalCk2.g:3495:2: ( RULE_ID )
            // InternalCk2.g:3496:3: RULE_ID
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
    // InternalCk2.g:3505:1: rule__StringProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3509:1: ( ( RULE_STRING ) )
            // InternalCk2.g:3510:2: ( RULE_STRING )
            {
            // InternalCk2.g:3510:2: ( RULE_STRING )
            // InternalCk2.g:3511:3: RULE_STRING
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
    // InternalCk2.g:3520:1: rule__IdProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3524:1: ( ( RULE_ID ) )
            // InternalCk2.g:3525:2: ( RULE_ID )
            {
            // InternalCk2.g:3525:2: ( RULE_ID )
            // InternalCk2.g:3526:3: RULE_ID
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
    // InternalCk2.g:3535:1: rule__IdProperty__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__IdProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3539:1: ( ( RULE_ID ) )
            // InternalCk2.g:3540:2: ( RULE_ID )
            {
            // InternalCk2.g:3540:2: ( RULE_ID )
            // InternalCk2.g:3541:3: RULE_ID
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
    // InternalCk2.g:3550:1: rule__CommandProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__CommandProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3554:1: ( ( RULE_ID ) )
            // InternalCk2.g:3555:2: ( RULE_ID )
            {
            // InternalCk2.g:3555:2: ( RULE_ID )
            // InternalCk2.g:3556:3: RULE_ID
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
    // InternalCk2.g:3565:1: rule__CommandProperty__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__CommandProperty__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3569:1: ( ( RULE_ID ) )
            // InternalCk2.g:3570:2: ( RULE_ID )
            {
            // InternalCk2.g:3570:2: ( RULE_ID )
            // InternalCk2.g:3571:3: RULE_ID
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
    // InternalCk2.g:3580:1: rule__BoolProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__BoolProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3584:1: ( ( RULE_ID ) )
            // InternalCk2.g:3585:2: ( RULE_ID )
            {
            // InternalCk2.g:3585:2: ( RULE_ID )
            // InternalCk2.g:3586:3: RULE_ID
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
    // InternalCk2.g:3595:1: rule__BoolProperty__ValueAssignment_2 : ( RULE_BOOL ) ;
    public final void rule__BoolProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3599:1: ( ( RULE_BOOL ) )
            // InternalCk2.g:3600:2: ( RULE_BOOL )
            {
            // InternalCk2.g:3600:2: ( RULE_BOOL )
            // InternalCk2.g:3601:3: RULE_BOOL
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
    // InternalCk2.g:3610:1: rule__DateProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__DateProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3614:1: ( ( RULE_ID ) )
            // InternalCk2.g:3615:2: ( RULE_ID )
            {
            // InternalCk2.g:3615:2: ( RULE_ID )
            // InternalCk2.g:3616:3: RULE_ID
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
    // InternalCk2.g:3625:1: rule__DateProperty__ValueAssignment_2 : ( ruleDate ) ;
    public final void rule__DateProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3629:1: ( ( ruleDate ) )
            // InternalCk2.g:3630:2: ( ruleDate )
            {
            // InternalCk2.g:3630:2: ( ruleDate )
            // InternalCk2.g:3631:3: ruleDate
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


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_0_0"
    // InternalCk2.g:3640:1: rule__IntegerProperty__KeyAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3644:1: ( ( RULE_ID ) )
            // InternalCk2.g:3645:2: ( RULE_ID )
            {
            // InternalCk2.g:3645:2: ( RULE_ID )
            // InternalCk2.g:3646:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_0_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_0_2"
    // InternalCk2.g:3655:1: rule__IntegerProperty__ValueAssignment_0_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3659:1: ( ( ruleInteger ) )
            // InternalCk2.g:3660:2: ( ruleInteger )
            {
            // InternalCk2.g:3660:2: ( ruleInteger )
            // InternalCk2.g:3661:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_0_2"


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_1_0"
    // InternalCk2.g:3670:1: rule__IntegerProperty__KeyAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3674:1: ( ( RULE_ID ) )
            // InternalCk2.g:3675:2: ( RULE_ID )
            {
            // InternalCk2.g:3675:2: ( RULE_ID )
            // InternalCk2.g:3676:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_1_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_1_2"
    // InternalCk2.g:3685:1: rule__IntegerProperty__ValueAssignment_1_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3689:1: ( ( ruleInteger ) )
            // InternalCk2.g:3690:2: ( ruleInteger )
            {
            // InternalCk2.g:3690:2: ( ruleInteger )
            // InternalCk2.g:3691:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_1_2"


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_2_0"
    // InternalCk2.g:3700:1: rule__IntegerProperty__KeyAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3704:1: ( ( RULE_ID ) )
            // InternalCk2.g:3705:2: ( RULE_ID )
            {
            // InternalCk2.g:3705:2: ( RULE_ID )
            // InternalCk2.g:3706:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_2_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_2_2"
    // InternalCk2.g:3715:1: rule__IntegerProperty__ValueAssignment_2_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3719:1: ( ( ruleInteger ) )
            // InternalCk2.g:3720:2: ( ruleInteger )
            {
            // InternalCk2.g:3720:2: ( ruleInteger )
            // InternalCk2.g:3721:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_2_2"


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_3_0"
    // InternalCk2.g:3730:1: rule__IntegerProperty__KeyAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3734:1: ( ( RULE_ID ) )
            // InternalCk2.g:3735:2: ( RULE_ID )
            {
            // InternalCk2.g:3735:2: ( RULE_ID )
            // InternalCk2.g:3736:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_3_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_3_2"
    // InternalCk2.g:3745:1: rule__IntegerProperty__ValueAssignment_3_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3749:1: ( ( ruleInteger ) )
            // InternalCk2.g:3750:2: ( ruleInteger )
            {
            // InternalCk2.g:3750:2: ( ruleInteger )
            // InternalCk2.g:3751:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_3_2"


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_4_0"
    // InternalCk2.g:3760:1: rule__IntegerProperty__KeyAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3764:1: ( ( RULE_ID ) )
            // InternalCk2.g:3765:2: ( RULE_ID )
            {
            // InternalCk2.g:3765:2: ( RULE_ID )
            // InternalCk2.g:3766:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_4_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_4_2"
    // InternalCk2.g:3775:1: rule__IntegerProperty__ValueAssignment_4_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3779:1: ( ( ruleInteger ) )
            // InternalCk2.g:3780:2: ( ruleInteger )
            {
            // InternalCk2.g:3780:2: ( ruleInteger )
            // InternalCk2.g:3781:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_4_2"


    // $ANTLR start "rule__IntegerProperty__KeyAssignment_5_0"
    // InternalCk2.g:3790:1: rule__IntegerProperty__KeyAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3794:1: ( ( RULE_ID ) )
            // InternalCk2.g:3795:2: ( RULE_ID )
            {
            // InternalCk2.g:3795:2: ( RULE_ID )
            // InternalCk2.g:3796:3: RULE_ID
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerPropertyAccess().getKeyIDTerminalRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__IntegerProperty__KeyAssignment_5_0"


    // $ANTLR start "rule__IntegerProperty__ValueAssignment_5_2"
    // InternalCk2.g:3805:1: rule__IntegerProperty__ValueAssignment_5_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3809:1: ( ( ruleInteger ) )
            // InternalCk2.g:3810:2: ( ruleInteger )
            {
            // InternalCk2.g:3810:2: ( ruleInteger )
            // InternalCk2.g:3811:3: ruleInteger
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerPropertyAccess().getValueIntegerParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__IntegerProperty__ValueAssignment_5_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_0_0"
    // InternalCk2.g:3820:1: rule__DoubleProperty__KeyAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3824:1: ( ( RULE_ID ) )
            // InternalCk2.g:3825:2: ( RULE_ID )
            {
            // InternalCk2.g:3825:2: ( RULE_ID )
            // InternalCk2.g:3826:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_0_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_0_2"
    // InternalCk2.g:3835:1: rule__DoubleProperty__ValueAssignment_0_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3839:1: ( ( ruleDouble ) )
            // InternalCk2.g:3840:2: ( ruleDouble )
            {
            // InternalCk2.g:3840:2: ( ruleDouble )
            // InternalCk2.g:3841:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_0_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_1_0"
    // InternalCk2.g:3850:1: rule__DoubleProperty__KeyAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3854:1: ( ( RULE_ID ) )
            // InternalCk2.g:3855:2: ( RULE_ID )
            {
            // InternalCk2.g:3855:2: ( RULE_ID )
            // InternalCk2.g:3856:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_1_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_1_2"
    // InternalCk2.g:3865:1: rule__DoubleProperty__ValueAssignment_1_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3869:1: ( ( ruleDouble ) )
            // InternalCk2.g:3870:2: ( ruleDouble )
            {
            // InternalCk2.g:3870:2: ( ruleDouble )
            // InternalCk2.g:3871:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_1_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_2_0"
    // InternalCk2.g:3880:1: rule__DoubleProperty__KeyAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3884:1: ( ( RULE_ID ) )
            // InternalCk2.g:3885:2: ( RULE_ID )
            {
            // InternalCk2.g:3885:2: ( RULE_ID )
            // InternalCk2.g:3886:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_2_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_2_2"
    // InternalCk2.g:3895:1: rule__DoubleProperty__ValueAssignment_2_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3899:1: ( ( ruleDouble ) )
            // InternalCk2.g:3900:2: ( ruleDouble )
            {
            // InternalCk2.g:3900:2: ( ruleDouble )
            // InternalCk2.g:3901:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_2_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_3_0"
    // InternalCk2.g:3910:1: rule__DoubleProperty__KeyAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3914:1: ( ( RULE_ID ) )
            // InternalCk2.g:3915:2: ( RULE_ID )
            {
            // InternalCk2.g:3915:2: ( RULE_ID )
            // InternalCk2.g:3916:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_3_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_3_2"
    // InternalCk2.g:3925:1: rule__DoubleProperty__ValueAssignment_3_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3929:1: ( ( ruleDouble ) )
            // InternalCk2.g:3930:2: ( ruleDouble )
            {
            // InternalCk2.g:3930:2: ( ruleDouble )
            // InternalCk2.g:3931:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_3_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_4_0"
    // InternalCk2.g:3940:1: rule__DoubleProperty__KeyAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3944:1: ( ( RULE_ID ) )
            // InternalCk2.g:3945:2: ( RULE_ID )
            {
            // InternalCk2.g:3945:2: ( RULE_ID )
            // InternalCk2.g:3946:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_4_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_4_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_4_2"
    // InternalCk2.g:3955:1: rule__DoubleProperty__ValueAssignment_4_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3959:1: ( ( ruleDouble ) )
            // InternalCk2.g:3960:2: ( ruleDouble )
            {
            // InternalCk2.g:3960:2: ( ruleDouble )
            // InternalCk2.g:3961:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_4_2"


    // $ANTLR start "rule__DoubleProperty__KeyAssignment_5_0"
    // InternalCk2.g:3970:1: rule__DoubleProperty__KeyAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3974:1: ( ( RULE_ID ) )
            // InternalCk2.g:3975:2: ( RULE_ID )
            {
            // InternalCk2.g:3975:2: ( RULE_ID )
            // InternalCk2.g:3976:3: RULE_ID
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_5_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoublePropertyAccess().getKeyIDTerminalRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__DoubleProperty__KeyAssignment_5_0"


    // $ANTLR start "rule__DoubleProperty__ValueAssignment_5_2"
    // InternalCk2.g:3985:1: rule__DoubleProperty__ValueAssignment_5_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3989:1: ( ( ruleDouble ) )
            // InternalCk2.g:3990:2: ( ruleDouble )
            {
            // InternalCk2.g:3990:2: ( ruleDouble )
            // InternalCk2.g:3991:3: ruleDouble
            {
             before(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoublePropertyAccess().getValueDoubleParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__DoubleProperty__ValueAssignment_5_2"


    // $ANTLR start "rule__HexadecimalProperty__KeyAssignment_0"
    // InternalCk2.g:4000:1: rule__HexadecimalProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__HexadecimalProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4004:1: ( ( RULE_ID ) )
            // InternalCk2.g:4005:2: ( RULE_ID )
            {
            // InternalCk2.g:4005:2: ( RULE_ID )
            // InternalCk2.g:4006:3: RULE_ID
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHexadecimalPropertyAccess().getKeyIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__HexadecimalProperty__KeyAssignment_0"


    // $ANTLR start "rule__HexadecimalProperty__ValueAssignment_2"
    // InternalCk2.g:4015:1: rule__HexadecimalProperty__ValueAssignment_2 : ( RULE_HEX ) ;
    public final void rule__HexadecimalProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4019:1: ( ( RULE_HEX ) )
            // InternalCk2.g:4020:2: ( RULE_HEX )
            {
            // InternalCk2.g:4020:2: ( RULE_HEX )
            // InternalCk2.g:4021:3: RULE_HEX
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getValueHEXTerminalRuleCall_2_0()); 
            match(input,RULE_HEX,FOLLOW_2); 
             after(grammarAccess.getHexadecimalPropertyAccess().getValueHEXTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__HexadecimalProperty__ValueAssignment_2"


    // $ANTLR start "rule__ListProperty__KeyAssignment_0"
    // InternalCk2.g:4030:1: rule__ListProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4034:1: ( ( RULE_ID ) )
            // InternalCk2.g:4035:2: ( RULE_ID )
            {
            // InternalCk2.g:4035:2: ( RULE_ID )
            // InternalCk2.g:4036:3: RULE_ID
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
    // InternalCk2.g:4045:1: rule__ListProperty__ValueAssignment_2 : ( ruleList ) ;
    public final void rule__ListProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4049:1: ( ( ruleList ) )
            // InternalCk2.g:4050:2: ( ruleList )
            {
            // InternalCk2.g:4050:2: ( ruleList )
            // InternalCk2.g:4051:3: ruleList
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
    // InternalCk2.g:4060:1: rule__IdClauseProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4064:1: ( ( RULE_ID ) )
            // InternalCk2.g:4065:2: ( RULE_ID )
            {
            // InternalCk2.g:4065:2: ( RULE_ID )
            // InternalCk2.g:4066:3: RULE_ID
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
    // InternalCk2.g:4075:1: rule__IdClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IdClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4079:1: ( ( ( '{' ) ) )
            // InternalCk2.g:4080:2: ( ( '{' ) )
            {
            // InternalCk2.g:4080:2: ( ( '{' ) )
            // InternalCk2.g:4081:3: ( '{' )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:4082:3: ( '{' )
            // InternalCk2.g:4083:4: '{'
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
    // InternalCk2.g:4094:1: rule__IdClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IdClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4098:1: ( ( ruleProperty ) )
            // InternalCk2.g:4099:2: ( ruleProperty )
            {
            // InternalCk2.g:4099:2: ( ruleProperty )
            // InternalCk2.g:4100:3: ruleProperty
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
    // InternalCk2.g:4109:1: rule__IntClauseProperty__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4113:1: ( ( RULE_INT ) )
            // InternalCk2.g:4114:2: ( RULE_INT )
            {
            // InternalCk2.g:4114:2: ( RULE_INT )
            // InternalCk2.g:4115:3: RULE_INT
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
    // InternalCk2.g:4124:1: rule__IntClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IntClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4128:1: ( ( ( '{' ) ) )
            // InternalCk2.g:4129:2: ( ( '{' ) )
            {
            // InternalCk2.g:4129:2: ( ( '{' ) )
            // InternalCk2.g:4130:3: ( '{' )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:4131:3: ( '{' )
            // InternalCk2.g:4132:4: '{'
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
    // InternalCk2.g:4143:1: rule__IntClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IntClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4147:1: ( ( ruleProperty ) )
            // InternalCk2.g:4148:2: ( ruleProperty )
            {
            // InternalCk2.g:4148:2: ( ruleProperty )
            // InternalCk2.g:4149:3: ruleProperty
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
    // InternalCk2.g:4158:1: rule__DateClauseProperty__NameAssignment_0 : ( ruleDate ) ;
    public final void rule__DateClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4162:1: ( ( ruleDate ) )
            // InternalCk2.g:4163:2: ( ruleDate )
            {
            // InternalCk2.g:4163:2: ( ruleDate )
            // InternalCk2.g:4164:3: ruleDate
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
    // InternalCk2.g:4173:1: rule__DateClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__DateClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4177:1: ( ( ( '{' ) ) )
            // InternalCk2.g:4178:2: ( ( '{' ) )
            {
            // InternalCk2.g:4178:2: ( ( '{' ) )
            // InternalCk2.g:4179:3: ( '{' )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:4180:3: ( '{' )
            // InternalCk2.g:4181:4: '{'
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
    // InternalCk2.g:4192:1: rule__DateClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__DateClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4196:1: ( ( ruleProperty ) )
            // InternalCk2.g:4197:2: ( ruleProperty )
            {
            // InternalCk2.g:4197:2: ( ruleProperty )
            // InternalCk2.g:4198:3: ruleProperty
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
    // InternalCk2.g:4207:1: rule__ProbabilityProperty__KeyAssignment_0 : ( RULE_INT ) ;
    public final void rule__ProbabilityProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4211:1: ( ( RULE_INT ) )
            // InternalCk2.g:4212:2: ( RULE_INT )
            {
            // InternalCk2.g:4212:2: ( RULE_INT )
            // InternalCk2.g:4213:3: RULE_INT
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
    // InternalCk2.g:4222:1: rule__ProbabilityProperty__ValueAssignment_2 : ( ruleListElem ) ;
    public final void rule__ProbabilityProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4226:1: ( ( ruleListElem ) )
            // InternalCk2.g:4227:2: ( ruleListElem )
            {
            // InternalCk2.g:4227:2: ( ruleListElem )
            // InternalCk2.g:4228:3: ruleListElem
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


    // $ANTLR start "rule__BoolClauseProperty__NameAssignment_0"
    // InternalCk2.g:4237:1: rule__BoolClauseProperty__NameAssignment_0 : ( RULE_BOOL ) ;
    public final void rule__BoolClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4241:1: ( ( RULE_BOOL ) )
            // InternalCk2.g:4242:2: ( RULE_BOOL )
            {
            // InternalCk2.g:4242:2: ( RULE_BOOL )
            // InternalCk2.g:4243:3: RULE_BOOL
            {
             before(grammarAccess.getBoolClausePropertyAccess().getNameBOOLTerminalRuleCall_0_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getBoolClausePropertyAccess().getNameBOOLTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__BoolClauseProperty__NameAssignment_0"


    // $ANTLR start "rule__BoolClauseProperty__ValueAssignment_2"
    // InternalCk2.g:4252:1: rule__BoolClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__BoolClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4256:1: ( ( ( '{' ) ) )
            // InternalCk2.g:4257:2: ( ( '{' ) )
            {
            // InternalCk2.g:4257:2: ( ( '{' ) )
            // InternalCk2.g:4258:3: ( '{' )
            {
             before(grammarAccess.getBoolClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:4259:3: ( '{' )
            // InternalCk2.g:4260:4: '{'
            {
             before(grammarAccess.getBoolClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBoolClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

            }

             after(grammarAccess.getBoolClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__BoolClauseProperty__ValueAssignment_2"


    // $ANTLR start "rule__BoolClauseProperty__PropertiesAssignment_3"
    // InternalCk2.g:4271:1: rule__BoolClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__BoolClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4275:1: ( ( ruleProperty ) )
            // InternalCk2.g:4276:2: ( ruleProperty )
            {
            // InternalCk2.g:4276:2: ( ruleProperty )
            // InternalCk2.g:4277:3: ruleProperty
            {
             before(grammarAccess.getBoolClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getBoolClausePropertyAccess().getPropertiesPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BoolClauseProperty__PropertiesAssignment_3"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\60\uffff";
    static final String dfa_2s = "\16\uffff\1\45\1\uffff\1\45\11\uffff\1\45\2\uffff\1\45\2\uffff\1\45\2\uffff\1\45\7\uffff\1\45\1\uffff\1\46\2\uffff";
    static final String dfa_3s = "\1\4\2\23\1\uffff\1\6\1\4\4\6\1\4\1\uffff\2\6\3\4\5\uffff\4\6\1\4\2\6\1\4\2\6\1\4\2\6\1\4\3\uffff\1\4\1\uffff\1\4\1\6\1\4\1\6\2\4\1\uffff";
    static final String dfa_4s = "\1\7\1\32\1\33\1\uffff\1\20\1\24\4\20\1\21\1\uffff\2\6\1\33\1\22\1\33\5\uffff\4\6\1\33\2\6\1\33\2\6\1\33\2\6\1\33\3\uffff\1\32\1\uffff\1\33\1\6\1\33\1\6\2\34\1\uffff";
    static final String dfa_5s = "\3\uffff\1\14\7\uffff\1\12\5\uffff\1\4\1\2\1\10\1\1\1\3\16\uffff\1\13\1\6\1\7\1\uffff\1\11\6\uffff\1\5";
    static final String dfa_6s = "\60\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\2\uffff\1\6\1\10\1\7\1\11\1\4",
            "\1\12\7\uffff\1\13",
            "",
            "\1\16\10\uffff\1\14\1\15",
            "\1\22\1\24\1\20\1\21\1\23\6\uffff\1\26\1\27\1\17\2\uffff\1\25",
            "\1\32\10\uffff\1\30\1\31",
            "\1\35\10\uffff\1\33\1\34",
            "\1\40\10\uffff\1\36\1\37",
            "\1\43\10\uffff\1\41\1\42",
            "\3\44\10\uffff\2\44\1\13",
            "",
            "\1\16",
            "\1\16",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\46",
            "\1\47\1\50\1\51\1\13\7\uffff\2\50\1\uffff\1\13",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\1\53",
            "\1\32",
            "\1\32",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\46",
            "\1\35",
            "\1\35",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\46",
            "\1\40",
            "\1\40",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\46",
            "\1\43",
            "\1\43",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\46",
            "",
            "",
            "",
            "\3\50\10\uffff\2\50\1\uffff\1\50\1\13\2\uffff\5\13",
            "",
            "\3\50\10\uffff\2\50\1\uffff\1\50\1\13\7\uffff\1\54",
            "\1\55",
            "\1\45\1\uffff\2\45\12\uffff\1\45\10\uffff\1\46",
            "\1\56",
            "\1\46\1\uffff\2\46\12\uffff\1\46\10\uffff\1\57\1\46",
            "\3\50\10\uffff\2\50\1\uffff\1\50\10\uffff\1\13\1\50",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "642:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleHexadecimalProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) | ( ruleBoolClauseProperty ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000018070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018072L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000400D0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}