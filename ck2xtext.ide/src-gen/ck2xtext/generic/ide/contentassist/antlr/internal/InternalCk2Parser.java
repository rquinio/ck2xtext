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


    // $ANTLR start "entryRuleDate"
    // InternalCk2.g:510:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalCk2.g:511:1: ( ruleDate EOF )
            // InternalCk2.g:512:1: ruleDate EOF
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
    // InternalCk2.g:519:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:523:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalCk2.g:524:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalCk2.g:524:2: ( ( rule__Date__Group__0 ) )
            // InternalCk2.g:525:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalCk2.g:526:3: ( rule__Date__Group__0 )
            // InternalCk2.g:526:4: rule__Date__Group__0
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
    // InternalCk2.g:535:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalCk2.g:536:1: ( ruleInteger EOF )
            // InternalCk2.g:537:1: ruleInteger EOF
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
    // InternalCk2.g:544:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:548:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalCk2.g:549:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalCk2.g:549:2: ( ( rule__Integer__Group__0 ) )
            // InternalCk2.g:550:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalCk2.g:551:3: ( rule__Integer__Group__0 )
            // InternalCk2.g:551:4: rule__Integer__Group__0
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
    // InternalCk2.g:560:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalCk2.g:561:1: ( ruleDouble EOF )
            // InternalCk2.g:562:1: ruleDouble EOF
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
    // InternalCk2.g:569:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:573:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalCk2.g:574:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalCk2.g:574:2: ( ( rule__Double__Group__0 ) )
            // InternalCk2.g:575:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalCk2.g:576:3: ( rule__Double__Group__0 )
            // InternalCk2.g:576:4: rule__Double__Group__0
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
    // InternalCk2.g:584:1: rule__ListElem__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleDouble ) );
    public final void rule__ListElem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:588:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleInteger ) | ( ruleDouble ) )
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

                    if ( (LA2_5==27) ) {
                        alt2=4;
                    }
                    else if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_INT)||(LA2_5>=15 && LA2_5<=16)||LA2_5==18) ) {
                        alt2=3;
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

                    if ( (LA2_5==27) ) {
                        alt2=4;
                    }
                    else if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_INT)||(LA2_5>=15 && LA2_5<=16)||LA2_5==18) ) {
                        alt2=3;
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

                if ( (LA2_5==27) ) {
                    alt2=4;
                }
                else if ( (LA2_5==EOF||(LA2_5>=RULE_ID && LA2_5<=RULE_INT)||(LA2_5>=15 && LA2_5<=16)||LA2_5==18) ) {
                    alt2=3;
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
                    // InternalCk2.g:589:2: ( RULE_ID )
                    {
                    // InternalCk2.g:589:2: ( RULE_ID )
                    // InternalCk2.g:590:3: RULE_ID
                    {
                     before(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:595:2: ( RULE_STRING )
                    {
                    // InternalCk2.g:595:2: ( RULE_STRING )
                    // InternalCk2.g:596:3: RULE_STRING
                    {
                     before(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getListElemAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCk2.g:601:2: ( ruleInteger )
                    {
                    // InternalCk2.g:601:2: ( ruleInteger )
                    // InternalCk2.g:602:3: ruleInteger
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
                    // InternalCk2.g:607:2: ( ruleDouble )
                    {
                    // InternalCk2.g:607:2: ( ruleDouble )
                    // InternalCk2.g:608:3: ruleDouble
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
    // InternalCk2.g:617:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleHexadecimalProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:621:1: ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleHexadecimalProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) )
            int alt3=11;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCk2.g:622:2: ( ruleStringProperty )
                    {
                    // InternalCk2.g:622:2: ( ruleStringProperty )
                    // InternalCk2.g:623:3: ruleStringProperty
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
                    // InternalCk2.g:628:2: ( ruleIdProperty )
                    {
                    // InternalCk2.g:628:2: ( ruleIdProperty )
                    // InternalCk2.g:629:3: ruleIdProperty
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
                    // InternalCk2.g:634:2: ( ruleCommandProperty )
                    {
                    // InternalCk2.g:634:2: ( ruleCommandProperty )
                    // InternalCk2.g:635:3: ruleCommandProperty
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
                    // InternalCk2.g:640:2: ( ruleBoolProperty )
                    {
                    // InternalCk2.g:640:2: ( ruleBoolProperty )
                    // InternalCk2.g:641:3: ruleBoolProperty
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
                    // InternalCk2.g:646:2: ( ruleDateProperty )
                    {
                    // InternalCk2.g:646:2: ( ruleDateProperty )
                    // InternalCk2.g:647:3: ruleDateProperty
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
                    // InternalCk2.g:652:2: ( ruleIntegerProperty )
                    {
                    // InternalCk2.g:652:2: ( ruleIntegerProperty )
                    // InternalCk2.g:653:3: ruleIntegerProperty
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
                    // InternalCk2.g:658:2: ( ruleDoubleProperty )
                    {
                    // InternalCk2.g:658:2: ( ruleDoubleProperty )
                    // InternalCk2.g:659:3: ruleDoubleProperty
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
                    // InternalCk2.g:664:2: ( ruleHexadecimalProperty )
                    {
                    // InternalCk2.g:664:2: ( ruleHexadecimalProperty )
                    // InternalCk2.g:665:3: ruleHexadecimalProperty
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
                    // InternalCk2.g:670:2: ( ruleListProperty )
                    {
                    // InternalCk2.g:670:2: ( ruleListProperty )
                    // InternalCk2.g:671:3: ruleListProperty
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
                    // InternalCk2.g:676:2: ( ruleClause )
                    {
                    // InternalCk2.g:676:2: ( ruleClause )
                    // InternalCk2.g:677:3: ruleClause
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
                    // InternalCk2.g:682:2: ( ruleProbabilityProperty )
                    {
                    // InternalCk2.g:682:2: ( ruleProbabilityProperty )
                    // InternalCk2.g:683:3: ruleProbabilityProperty
                    {
                     before(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleProbabilityProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getProbabilityPropertyParserRuleCall_10()); 

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
    // InternalCk2.g:692:1: rule__Clause__Alternatives : ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) );
    public final void rule__Clause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:696:1: ( ( ruleIdClauseProperty ) | ( ruleIntClauseProperty ) | ( ruleDateClauseProperty ) )
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
                    // InternalCk2.g:697:2: ( ruleIdClauseProperty )
                    {
                    // InternalCk2.g:697:2: ( ruleIdClauseProperty )
                    // InternalCk2.g:698:3: ruleIdClauseProperty
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
                    // InternalCk2.g:703:2: ( ruleIntClauseProperty )
                    {
                    // InternalCk2.g:703:2: ( ruleIntClauseProperty )
                    // InternalCk2.g:704:3: ruleIntClauseProperty
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
                    // InternalCk2.g:709:2: ( ruleDateClauseProperty )
                    {
                    // InternalCk2.g:709:2: ( ruleDateClauseProperty )
                    // InternalCk2.g:710:3: ruleDateClauseProperty
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
    // InternalCk2.g:719:1: rule__IntegerProperty__Alternatives : ( ( ( rule__IntegerProperty__Group_0__0 ) ) | ( ( rule__IntegerProperty__Group_1__0 ) ) | ( ( rule__IntegerProperty__Group_2__0 ) ) | ( ( rule__IntegerProperty__Group_3__0 ) ) | ( ( rule__IntegerProperty__Group_4__0 ) ) | ( ( rule__IntegerProperty__Group_5__0 ) ) );
    public final void rule__IntegerProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:723:1: ( ( ( rule__IntegerProperty__Group_0__0 ) ) | ( ( rule__IntegerProperty__Group_1__0 ) ) | ( ( rule__IntegerProperty__Group_2__0 ) ) | ( ( rule__IntegerProperty__Group_3__0 ) ) | ( ( rule__IntegerProperty__Group_4__0 ) ) | ( ( rule__IntegerProperty__Group_5__0 ) ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                    // InternalCk2.g:724:2: ( ( rule__IntegerProperty__Group_0__0 ) )
                    {
                    // InternalCk2.g:724:2: ( ( rule__IntegerProperty__Group_0__0 ) )
                    // InternalCk2.g:725:3: ( rule__IntegerProperty__Group_0__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_0()); 
                    // InternalCk2.g:726:3: ( rule__IntegerProperty__Group_0__0 )
                    // InternalCk2.g:726:4: rule__IntegerProperty__Group_0__0
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
                    // InternalCk2.g:730:2: ( ( rule__IntegerProperty__Group_1__0 ) )
                    {
                    // InternalCk2.g:730:2: ( ( rule__IntegerProperty__Group_1__0 ) )
                    // InternalCk2.g:731:3: ( rule__IntegerProperty__Group_1__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_1()); 
                    // InternalCk2.g:732:3: ( rule__IntegerProperty__Group_1__0 )
                    // InternalCk2.g:732:4: rule__IntegerProperty__Group_1__0
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
                    // InternalCk2.g:736:2: ( ( rule__IntegerProperty__Group_2__0 ) )
                    {
                    // InternalCk2.g:736:2: ( ( rule__IntegerProperty__Group_2__0 ) )
                    // InternalCk2.g:737:3: ( rule__IntegerProperty__Group_2__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_2()); 
                    // InternalCk2.g:738:3: ( rule__IntegerProperty__Group_2__0 )
                    // InternalCk2.g:738:4: rule__IntegerProperty__Group_2__0
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
                    // InternalCk2.g:742:2: ( ( rule__IntegerProperty__Group_3__0 ) )
                    {
                    // InternalCk2.g:742:2: ( ( rule__IntegerProperty__Group_3__0 ) )
                    // InternalCk2.g:743:3: ( rule__IntegerProperty__Group_3__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_3()); 
                    // InternalCk2.g:744:3: ( rule__IntegerProperty__Group_3__0 )
                    // InternalCk2.g:744:4: rule__IntegerProperty__Group_3__0
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
                    // InternalCk2.g:748:2: ( ( rule__IntegerProperty__Group_4__0 ) )
                    {
                    // InternalCk2.g:748:2: ( ( rule__IntegerProperty__Group_4__0 ) )
                    // InternalCk2.g:749:3: ( rule__IntegerProperty__Group_4__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_4()); 
                    // InternalCk2.g:750:3: ( rule__IntegerProperty__Group_4__0 )
                    // InternalCk2.g:750:4: rule__IntegerProperty__Group_4__0
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
                    // InternalCk2.g:754:2: ( ( rule__IntegerProperty__Group_5__0 ) )
                    {
                    // InternalCk2.g:754:2: ( ( rule__IntegerProperty__Group_5__0 ) )
                    // InternalCk2.g:755:3: ( rule__IntegerProperty__Group_5__0 )
                    {
                     before(grammarAccess.getIntegerPropertyAccess().getGroup_5()); 
                    // InternalCk2.g:756:3: ( rule__IntegerProperty__Group_5__0 )
                    // InternalCk2.g:756:4: rule__IntegerProperty__Group_5__0
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
    // InternalCk2.g:764:1: rule__DoubleProperty__Alternatives : ( ( ( rule__DoubleProperty__Group_0__0 ) ) | ( ( rule__DoubleProperty__Group_1__0 ) ) | ( ( rule__DoubleProperty__Group_2__0 ) ) | ( ( rule__DoubleProperty__Group_3__0 ) ) | ( ( rule__DoubleProperty__Group_4__0 ) ) | ( ( rule__DoubleProperty__Group_5__0 ) ) );
    public final void rule__DoubleProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:768:1: ( ( ( rule__DoubleProperty__Group_0__0 ) ) | ( ( rule__DoubleProperty__Group_1__0 ) ) | ( ( rule__DoubleProperty__Group_2__0 ) ) | ( ( rule__DoubleProperty__Group_3__0 ) ) | ( ( rule__DoubleProperty__Group_4__0 ) ) | ( ( rule__DoubleProperty__Group_5__0 ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                    // InternalCk2.g:769:2: ( ( rule__DoubleProperty__Group_0__0 ) )
                    {
                    // InternalCk2.g:769:2: ( ( rule__DoubleProperty__Group_0__0 ) )
                    // InternalCk2.g:770:3: ( rule__DoubleProperty__Group_0__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_0()); 
                    // InternalCk2.g:771:3: ( rule__DoubleProperty__Group_0__0 )
                    // InternalCk2.g:771:4: rule__DoubleProperty__Group_0__0
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
                    // InternalCk2.g:775:2: ( ( rule__DoubleProperty__Group_1__0 ) )
                    {
                    // InternalCk2.g:775:2: ( ( rule__DoubleProperty__Group_1__0 ) )
                    // InternalCk2.g:776:3: ( rule__DoubleProperty__Group_1__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_1()); 
                    // InternalCk2.g:777:3: ( rule__DoubleProperty__Group_1__0 )
                    // InternalCk2.g:777:4: rule__DoubleProperty__Group_1__0
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
                    // InternalCk2.g:781:2: ( ( rule__DoubleProperty__Group_2__0 ) )
                    {
                    // InternalCk2.g:781:2: ( ( rule__DoubleProperty__Group_2__0 ) )
                    // InternalCk2.g:782:3: ( rule__DoubleProperty__Group_2__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_2()); 
                    // InternalCk2.g:783:3: ( rule__DoubleProperty__Group_2__0 )
                    // InternalCk2.g:783:4: rule__DoubleProperty__Group_2__0
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
                    // InternalCk2.g:787:2: ( ( rule__DoubleProperty__Group_3__0 ) )
                    {
                    // InternalCk2.g:787:2: ( ( rule__DoubleProperty__Group_3__0 ) )
                    // InternalCk2.g:788:3: ( rule__DoubleProperty__Group_3__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_3()); 
                    // InternalCk2.g:789:3: ( rule__DoubleProperty__Group_3__0 )
                    // InternalCk2.g:789:4: rule__DoubleProperty__Group_3__0
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
                    // InternalCk2.g:793:2: ( ( rule__DoubleProperty__Group_4__0 ) )
                    {
                    // InternalCk2.g:793:2: ( ( rule__DoubleProperty__Group_4__0 ) )
                    // InternalCk2.g:794:3: ( rule__DoubleProperty__Group_4__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_4()); 
                    // InternalCk2.g:795:3: ( rule__DoubleProperty__Group_4__0 )
                    // InternalCk2.g:795:4: rule__DoubleProperty__Group_4__0
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
                    // InternalCk2.g:799:2: ( ( rule__DoubleProperty__Group_5__0 ) )
                    {
                    // InternalCk2.g:799:2: ( ( rule__DoubleProperty__Group_5__0 ) )
                    // InternalCk2.g:800:3: ( rule__DoubleProperty__Group_5__0 )
                    {
                     before(grammarAccess.getDoublePropertyAccess().getGroup_5()); 
                    // InternalCk2.g:801:3: ( rule__DoubleProperty__Group_5__0 )
                    // InternalCk2.g:801:4: rule__DoubleProperty__Group_5__0
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
    // InternalCk2.g:809:1: rule__Integer__Alternatives_0 : ( ( '-' ) | ( '+' ) );
    public final void rule__Integer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:813:1: ( ( '-' ) | ( '+' ) )
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
                    // InternalCk2.g:814:2: ( '-' )
                    {
                    // InternalCk2.g:814:2: ( '-' )
                    // InternalCk2.g:815:3: '-'
                    {
                     before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCk2.g:820:2: ( '+' )
                    {
                    // InternalCk2.g:820:2: ( '+' )
                    // InternalCk2.g:821:3: '+'
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
    // InternalCk2.g:830:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:834:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalCk2.g:835:2: rule__List__Group__0__Impl rule__List__Group__1
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
    // InternalCk2.g:842:1: rule__List__Group__0__Impl : ( '{' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:846:1: ( ( '{' ) )
            // InternalCk2.g:847:1: ( '{' )
            {
            // InternalCk2.g:847:1: ( '{' )
            // InternalCk2.g:848:2: '{'
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
    // InternalCk2.g:857:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:861:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // InternalCk2.g:862:2: rule__List__Group__1__Impl rule__List__Group__2
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
    // InternalCk2.g:869:1: rule__List__Group__1__Impl : ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:873:1: ( ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) ) )
            // InternalCk2.g:874:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            {
            // InternalCk2.g:874:1: ( ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* ) )
            // InternalCk2.g:875:2: ( ( rule__List__ElemsAssignment_1 ) ) ( ( rule__List__ElemsAssignment_1 )* )
            {
            // InternalCk2.g:875:2: ( ( rule__List__ElemsAssignment_1 ) )
            // InternalCk2.g:876:3: ( rule__List__ElemsAssignment_1 )
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:877:3: ( rule__List__ElemsAssignment_1 )
            // InternalCk2.g:877:4: rule__List__ElemsAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__List__ElemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getElemsAssignment_1()); 

            }

            // InternalCk2.g:880:2: ( ( rule__List__ElemsAssignment_1 )* )
            // InternalCk2.g:881:3: ( rule__List__ElemsAssignment_1 )*
            {
             before(grammarAccess.getListAccess().getElemsAssignment_1()); 
            // InternalCk2.g:882:3: ( rule__List__ElemsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=15 && LA8_0<=16)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCk2.g:882:4: rule__List__ElemsAssignment_1
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
    // InternalCk2.g:891:1: rule__List__Group__2 : rule__List__Group__2__Impl ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:895:1: ( rule__List__Group__2__Impl )
            // InternalCk2.g:896:2: rule__List__Group__2__Impl
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
    // InternalCk2.g:902:1: rule__List__Group__2__Impl : ( '}' ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:906:1: ( ( '}' ) )
            // InternalCk2.g:907:1: ( '}' )
            {
            // InternalCk2.g:907:1: ( '}' )
            // InternalCk2.g:908:2: '}'
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
    // InternalCk2.g:918:1: rule__StringProperty__Group__0 : rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 ;
    public final void rule__StringProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:922:1: ( rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1 )
            // InternalCk2.g:923:2: rule__StringProperty__Group__0__Impl rule__StringProperty__Group__1
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
    // InternalCk2.g:930:1: rule__StringProperty__Group__0__Impl : ( ( rule__StringProperty__KeyAssignment_0 ) ) ;
    public final void rule__StringProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:934:1: ( ( ( rule__StringProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:935:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:935:1: ( ( rule__StringProperty__KeyAssignment_0 ) )
            // InternalCk2.g:936:2: ( rule__StringProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getStringPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:937:2: ( rule__StringProperty__KeyAssignment_0 )
            // InternalCk2.g:937:3: rule__StringProperty__KeyAssignment_0
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
    // InternalCk2.g:945:1: rule__StringProperty__Group__1 : rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 ;
    public final void rule__StringProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:949:1: ( rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2 )
            // InternalCk2.g:950:2: rule__StringProperty__Group__1__Impl rule__StringProperty__Group__2
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
    // InternalCk2.g:957:1: rule__StringProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__StringProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:961:1: ( ( '=' ) )
            // InternalCk2.g:962:1: ( '=' )
            {
            // InternalCk2.g:962:1: ( '=' )
            // InternalCk2.g:963:2: '='
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
    // InternalCk2.g:972:1: rule__StringProperty__Group__2 : rule__StringProperty__Group__2__Impl ;
    public final void rule__StringProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:976:1: ( rule__StringProperty__Group__2__Impl )
            // InternalCk2.g:977:2: rule__StringProperty__Group__2__Impl
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
    // InternalCk2.g:983:1: rule__StringProperty__Group__2__Impl : ( ( rule__StringProperty__ValueAssignment_2 ) ) ;
    public final void rule__StringProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:987:1: ( ( ( rule__StringProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:988:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:988:1: ( ( rule__StringProperty__ValueAssignment_2 ) )
            // InternalCk2.g:989:2: ( rule__StringProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getStringPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:990:2: ( rule__StringProperty__ValueAssignment_2 )
            // InternalCk2.g:990:3: rule__StringProperty__ValueAssignment_2
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
    // InternalCk2.g:999:1: rule__IdProperty__Group__0 : rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 ;
    public final void rule__IdProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1003:1: ( rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1 )
            // InternalCk2.g:1004:2: rule__IdProperty__Group__0__Impl rule__IdProperty__Group__1
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
    // InternalCk2.g:1011:1: rule__IdProperty__Group__0__Impl : ( ( rule__IdProperty__KeyAssignment_0 ) ) ;
    public final void rule__IdProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1015:1: ( ( ( rule__IdProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1016:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1016:1: ( ( rule__IdProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1017:2: ( rule__IdProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getIdPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1018:2: ( rule__IdProperty__KeyAssignment_0 )
            // InternalCk2.g:1018:3: rule__IdProperty__KeyAssignment_0
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
    // InternalCk2.g:1026:1: rule__IdProperty__Group__1 : rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 ;
    public final void rule__IdProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1030:1: ( rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2 )
            // InternalCk2.g:1031:2: rule__IdProperty__Group__1__Impl rule__IdProperty__Group__2
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
    // InternalCk2.g:1038:1: rule__IdProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1042:1: ( ( '=' ) )
            // InternalCk2.g:1043:1: ( '=' )
            {
            // InternalCk2.g:1043:1: ( '=' )
            // InternalCk2.g:1044:2: '='
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
    // InternalCk2.g:1053:1: rule__IdProperty__Group__2 : rule__IdProperty__Group__2__Impl ;
    public final void rule__IdProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1057:1: ( rule__IdProperty__Group__2__Impl )
            // InternalCk2.g:1058:2: rule__IdProperty__Group__2__Impl
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
    // InternalCk2.g:1064:1: rule__IdProperty__Group__2__Impl : ( ( rule__IdProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1068:1: ( ( ( rule__IdProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1069:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1069:1: ( ( rule__IdProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1070:2: ( rule__IdProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1071:2: ( rule__IdProperty__ValueAssignment_2 )
            // InternalCk2.g:1071:3: rule__IdProperty__ValueAssignment_2
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
    // InternalCk2.g:1080:1: rule__CommandProperty__Group__0 : rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 ;
    public final void rule__CommandProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1084:1: ( rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1 )
            // InternalCk2.g:1085:2: rule__CommandProperty__Group__0__Impl rule__CommandProperty__Group__1
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
    // InternalCk2.g:1092:1: rule__CommandProperty__Group__0__Impl : ( ( rule__CommandProperty__KeyAssignment_0 ) ) ;
    public final void rule__CommandProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1096:1: ( ( ( rule__CommandProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1097:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1097:1: ( ( rule__CommandProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1098:2: ( rule__CommandProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getCommandPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1099:2: ( rule__CommandProperty__KeyAssignment_0 )
            // InternalCk2.g:1099:3: rule__CommandProperty__KeyAssignment_0
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
    // InternalCk2.g:1107:1: rule__CommandProperty__Group__1 : rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 ;
    public final void rule__CommandProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1111:1: ( rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2 )
            // InternalCk2.g:1112:2: rule__CommandProperty__Group__1__Impl rule__CommandProperty__Group__2
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
    // InternalCk2.g:1119:1: rule__CommandProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__CommandProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1123:1: ( ( '=' ) )
            // InternalCk2.g:1124:1: ( '=' )
            {
            // InternalCk2.g:1124:1: ( '=' )
            // InternalCk2.g:1125:2: '='
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
    // InternalCk2.g:1134:1: rule__CommandProperty__Group__2 : rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 ;
    public final void rule__CommandProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1138:1: ( rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3 )
            // InternalCk2.g:1139:2: rule__CommandProperty__Group__2__Impl rule__CommandProperty__Group__3
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
    // InternalCk2.g:1146:1: rule__CommandProperty__Group__2__Impl : ( '[' ) ;
    public final void rule__CommandProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1150:1: ( ( '[' ) )
            // InternalCk2.g:1151:1: ( '[' )
            {
            // InternalCk2.g:1151:1: ( '[' )
            // InternalCk2.g:1152:2: '['
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
    // InternalCk2.g:1161:1: rule__CommandProperty__Group__3 : rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 ;
    public final void rule__CommandProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1165:1: ( rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4 )
            // InternalCk2.g:1166:2: rule__CommandProperty__Group__3__Impl rule__CommandProperty__Group__4
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
    // InternalCk2.g:1173:1: rule__CommandProperty__Group__3__Impl : ( ( rule__CommandProperty__ValueAssignment_3 ) ) ;
    public final void rule__CommandProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1177:1: ( ( ( rule__CommandProperty__ValueAssignment_3 ) ) )
            // InternalCk2.g:1178:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            {
            // InternalCk2.g:1178:1: ( ( rule__CommandProperty__ValueAssignment_3 ) )
            // InternalCk2.g:1179:2: ( rule__CommandProperty__ValueAssignment_3 )
            {
             before(grammarAccess.getCommandPropertyAccess().getValueAssignment_3()); 
            // InternalCk2.g:1180:2: ( rule__CommandProperty__ValueAssignment_3 )
            // InternalCk2.g:1180:3: rule__CommandProperty__ValueAssignment_3
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
    // InternalCk2.g:1188:1: rule__CommandProperty__Group__4 : rule__CommandProperty__Group__4__Impl ;
    public final void rule__CommandProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1192:1: ( rule__CommandProperty__Group__4__Impl )
            // InternalCk2.g:1193:2: rule__CommandProperty__Group__4__Impl
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
    // InternalCk2.g:1199:1: rule__CommandProperty__Group__4__Impl : ( ']' ) ;
    public final void rule__CommandProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1203:1: ( ( ']' ) )
            // InternalCk2.g:1204:1: ( ']' )
            {
            // InternalCk2.g:1204:1: ( ']' )
            // InternalCk2.g:1205:2: ']'
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
    // InternalCk2.g:1215:1: rule__BoolProperty__Group__0 : rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 ;
    public final void rule__BoolProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1219:1: ( rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1 )
            // InternalCk2.g:1220:2: rule__BoolProperty__Group__0__Impl rule__BoolProperty__Group__1
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
    // InternalCk2.g:1227:1: rule__BoolProperty__Group__0__Impl : ( ( rule__BoolProperty__KeyAssignment_0 ) ) ;
    public final void rule__BoolProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1231:1: ( ( ( rule__BoolProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1232:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1232:1: ( ( rule__BoolProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1233:2: ( rule__BoolProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getBoolPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1234:2: ( rule__BoolProperty__KeyAssignment_0 )
            // InternalCk2.g:1234:3: rule__BoolProperty__KeyAssignment_0
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
    // InternalCk2.g:1242:1: rule__BoolProperty__Group__1 : rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 ;
    public final void rule__BoolProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1246:1: ( rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2 )
            // InternalCk2.g:1247:2: rule__BoolProperty__Group__1__Impl rule__BoolProperty__Group__2
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
    // InternalCk2.g:1254:1: rule__BoolProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__BoolProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1258:1: ( ( '=' ) )
            // InternalCk2.g:1259:1: ( '=' )
            {
            // InternalCk2.g:1259:1: ( '=' )
            // InternalCk2.g:1260:2: '='
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
    // InternalCk2.g:1269:1: rule__BoolProperty__Group__2 : rule__BoolProperty__Group__2__Impl ;
    public final void rule__BoolProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1273:1: ( rule__BoolProperty__Group__2__Impl )
            // InternalCk2.g:1274:2: rule__BoolProperty__Group__2__Impl
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
    // InternalCk2.g:1280:1: rule__BoolProperty__Group__2__Impl : ( ( rule__BoolProperty__ValueAssignment_2 ) ) ;
    public final void rule__BoolProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1284:1: ( ( ( rule__BoolProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1285:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1285:1: ( ( rule__BoolProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1286:2: ( rule__BoolProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getBoolPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1287:2: ( rule__BoolProperty__ValueAssignment_2 )
            // InternalCk2.g:1287:3: rule__BoolProperty__ValueAssignment_2
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
    // InternalCk2.g:1296:1: rule__DateProperty__Group__0 : rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 ;
    public final void rule__DateProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1300:1: ( rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1 )
            // InternalCk2.g:1301:2: rule__DateProperty__Group__0__Impl rule__DateProperty__Group__1
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
    // InternalCk2.g:1308:1: rule__DateProperty__Group__0__Impl : ( ( rule__DateProperty__KeyAssignment_0 ) ) ;
    public final void rule__DateProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1312:1: ( ( ( rule__DateProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:1313:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:1313:1: ( ( rule__DateProperty__KeyAssignment_0 ) )
            // InternalCk2.g:1314:2: ( rule__DateProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getDatePropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:1315:2: ( rule__DateProperty__KeyAssignment_0 )
            // InternalCk2.g:1315:3: rule__DateProperty__KeyAssignment_0
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
    // InternalCk2.g:1323:1: rule__DateProperty__Group__1 : rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 ;
    public final void rule__DateProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1327:1: ( rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2 )
            // InternalCk2.g:1328:2: rule__DateProperty__Group__1__Impl rule__DateProperty__Group__2
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
    // InternalCk2.g:1335:1: rule__DateProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1339:1: ( ( '=' ) )
            // InternalCk2.g:1340:1: ( '=' )
            {
            // InternalCk2.g:1340:1: ( '=' )
            // InternalCk2.g:1341:2: '='
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
    // InternalCk2.g:1350:1: rule__DateProperty__Group__2 : rule__DateProperty__Group__2__Impl ;
    public final void rule__DateProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1354:1: ( rule__DateProperty__Group__2__Impl )
            // InternalCk2.g:1355:2: rule__DateProperty__Group__2__Impl
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
    // InternalCk2.g:1361:1: rule__DateProperty__Group__2__Impl : ( ( rule__DateProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1365:1: ( ( ( rule__DateProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:1366:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:1366:1: ( ( rule__DateProperty__ValueAssignment_2 ) )
            // InternalCk2.g:1367:2: ( rule__DateProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDatePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:1368:2: ( rule__DateProperty__ValueAssignment_2 )
            // InternalCk2.g:1368:3: rule__DateProperty__ValueAssignment_2
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
    // InternalCk2.g:1377:1: rule__IntegerProperty__Group_0__0 : rule__IntegerProperty__Group_0__0__Impl rule__IntegerProperty__Group_0__1 ;
    public final void rule__IntegerProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1381:1: ( rule__IntegerProperty__Group_0__0__Impl rule__IntegerProperty__Group_0__1 )
            // InternalCk2.g:1382:2: rule__IntegerProperty__Group_0__0__Impl rule__IntegerProperty__Group_0__1
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
    // InternalCk2.g:1389:1: rule__IntegerProperty__Group_0__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_0_0 ) ) ;
    public final void rule__IntegerProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1393:1: ( ( ( rule__IntegerProperty__KeyAssignment_0_0 ) ) )
            // InternalCk2.g:1394:1: ( ( rule__IntegerProperty__KeyAssignment_0_0 ) )
            {
            // InternalCk2.g:1394:1: ( ( rule__IntegerProperty__KeyAssignment_0_0 ) )
            // InternalCk2.g:1395:2: ( rule__IntegerProperty__KeyAssignment_0_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_0_0()); 
            // InternalCk2.g:1396:2: ( rule__IntegerProperty__KeyAssignment_0_0 )
            // InternalCk2.g:1396:3: rule__IntegerProperty__KeyAssignment_0_0
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
    // InternalCk2.g:1404:1: rule__IntegerProperty__Group_0__1 : rule__IntegerProperty__Group_0__1__Impl rule__IntegerProperty__Group_0__2 ;
    public final void rule__IntegerProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1408:1: ( rule__IntegerProperty__Group_0__1__Impl rule__IntegerProperty__Group_0__2 )
            // InternalCk2.g:1409:2: rule__IntegerProperty__Group_0__1__Impl rule__IntegerProperty__Group_0__2
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
    // InternalCk2.g:1416:1: rule__IntegerProperty__Group_0__1__Impl : ( '=' ) ;
    public final void rule__IntegerProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1420:1: ( ( '=' ) )
            // InternalCk2.g:1421:1: ( '=' )
            {
            // InternalCk2.g:1421:1: ( '=' )
            // InternalCk2.g:1422:2: '='
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
    // InternalCk2.g:1431:1: rule__IntegerProperty__Group_0__2 : rule__IntegerProperty__Group_0__2__Impl ;
    public final void rule__IntegerProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1435:1: ( rule__IntegerProperty__Group_0__2__Impl )
            // InternalCk2.g:1436:2: rule__IntegerProperty__Group_0__2__Impl
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
    // InternalCk2.g:1442:1: rule__IntegerProperty__Group_0__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_0_2 ) ) ;
    public final void rule__IntegerProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1446:1: ( ( ( rule__IntegerProperty__ValueAssignment_0_2 ) ) )
            // InternalCk2.g:1447:1: ( ( rule__IntegerProperty__ValueAssignment_0_2 ) )
            {
            // InternalCk2.g:1447:1: ( ( rule__IntegerProperty__ValueAssignment_0_2 ) )
            // InternalCk2.g:1448:2: ( rule__IntegerProperty__ValueAssignment_0_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_0_2()); 
            // InternalCk2.g:1449:2: ( rule__IntegerProperty__ValueAssignment_0_2 )
            // InternalCk2.g:1449:3: rule__IntegerProperty__ValueAssignment_0_2
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
    // InternalCk2.g:1458:1: rule__IntegerProperty__Group_1__0 : rule__IntegerProperty__Group_1__0__Impl rule__IntegerProperty__Group_1__1 ;
    public final void rule__IntegerProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1462:1: ( rule__IntegerProperty__Group_1__0__Impl rule__IntegerProperty__Group_1__1 )
            // InternalCk2.g:1463:2: rule__IntegerProperty__Group_1__0__Impl rule__IntegerProperty__Group_1__1
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
    // InternalCk2.g:1470:1: rule__IntegerProperty__Group_1__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_1_0 ) ) ;
    public final void rule__IntegerProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1474:1: ( ( ( rule__IntegerProperty__KeyAssignment_1_0 ) ) )
            // InternalCk2.g:1475:1: ( ( rule__IntegerProperty__KeyAssignment_1_0 ) )
            {
            // InternalCk2.g:1475:1: ( ( rule__IntegerProperty__KeyAssignment_1_0 ) )
            // InternalCk2.g:1476:2: ( rule__IntegerProperty__KeyAssignment_1_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_1_0()); 
            // InternalCk2.g:1477:2: ( rule__IntegerProperty__KeyAssignment_1_0 )
            // InternalCk2.g:1477:3: rule__IntegerProperty__KeyAssignment_1_0
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
    // InternalCk2.g:1485:1: rule__IntegerProperty__Group_1__1 : rule__IntegerProperty__Group_1__1__Impl rule__IntegerProperty__Group_1__2 ;
    public final void rule__IntegerProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1489:1: ( rule__IntegerProperty__Group_1__1__Impl rule__IntegerProperty__Group_1__2 )
            // InternalCk2.g:1490:2: rule__IntegerProperty__Group_1__1__Impl rule__IntegerProperty__Group_1__2
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
    // InternalCk2.g:1497:1: rule__IntegerProperty__Group_1__1__Impl : ( '==' ) ;
    public final void rule__IntegerProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1501:1: ( ( '==' ) )
            // InternalCk2.g:1502:1: ( '==' )
            {
            // InternalCk2.g:1502:1: ( '==' )
            // InternalCk2.g:1503:2: '=='
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
    // InternalCk2.g:1512:1: rule__IntegerProperty__Group_1__2 : rule__IntegerProperty__Group_1__2__Impl ;
    public final void rule__IntegerProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1516:1: ( rule__IntegerProperty__Group_1__2__Impl )
            // InternalCk2.g:1517:2: rule__IntegerProperty__Group_1__2__Impl
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
    // InternalCk2.g:1523:1: rule__IntegerProperty__Group_1__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_1_2 ) ) ;
    public final void rule__IntegerProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1527:1: ( ( ( rule__IntegerProperty__ValueAssignment_1_2 ) ) )
            // InternalCk2.g:1528:1: ( ( rule__IntegerProperty__ValueAssignment_1_2 ) )
            {
            // InternalCk2.g:1528:1: ( ( rule__IntegerProperty__ValueAssignment_1_2 ) )
            // InternalCk2.g:1529:2: ( rule__IntegerProperty__ValueAssignment_1_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_1_2()); 
            // InternalCk2.g:1530:2: ( rule__IntegerProperty__ValueAssignment_1_2 )
            // InternalCk2.g:1530:3: rule__IntegerProperty__ValueAssignment_1_2
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
    // InternalCk2.g:1539:1: rule__IntegerProperty__Group_2__0 : rule__IntegerProperty__Group_2__0__Impl rule__IntegerProperty__Group_2__1 ;
    public final void rule__IntegerProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1543:1: ( rule__IntegerProperty__Group_2__0__Impl rule__IntegerProperty__Group_2__1 )
            // InternalCk2.g:1544:2: rule__IntegerProperty__Group_2__0__Impl rule__IntegerProperty__Group_2__1
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
    // InternalCk2.g:1551:1: rule__IntegerProperty__Group_2__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_2_0 ) ) ;
    public final void rule__IntegerProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1555:1: ( ( ( rule__IntegerProperty__KeyAssignment_2_0 ) ) )
            // InternalCk2.g:1556:1: ( ( rule__IntegerProperty__KeyAssignment_2_0 ) )
            {
            // InternalCk2.g:1556:1: ( ( rule__IntegerProperty__KeyAssignment_2_0 ) )
            // InternalCk2.g:1557:2: ( rule__IntegerProperty__KeyAssignment_2_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_2_0()); 
            // InternalCk2.g:1558:2: ( rule__IntegerProperty__KeyAssignment_2_0 )
            // InternalCk2.g:1558:3: rule__IntegerProperty__KeyAssignment_2_0
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
    // InternalCk2.g:1566:1: rule__IntegerProperty__Group_2__1 : rule__IntegerProperty__Group_2__1__Impl rule__IntegerProperty__Group_2__2 ;
    public final void rule__IntegerProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1570:1: ( rule__IntegerProperty__Group_2__1__Impl rule__IntegerProperty__Group_2__2 )
            // InternalCk2.g:1571:2: rule__IntegerProperty__Group_2__1__Impl rule__IntegerProperty__Group_2__2
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
    // InternalCk2.g:1578:1: rule__IntegerProperty__Group_2__1__Impl : ( '>=' ) ;
    public final void rule__IntegerProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1582:1: ( ( '>=' ) )
            // InternalCk2.g:1583:1: ( '>=' )
            {
            // InternalCk2.g:1583:1: ( '>=' )
            // InternalCk2.g:1584:2: '>='
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
    // InternalCk2.g:1593:1: rule__IntegerProperty__Group_2__2 : rule__IntegerProperty__Group_2__2__Impl ;
    public final void rule__IntegerProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1597:1: ( rule__IntegerProperty__Group_2__2__Impl )
            // InternalCk2.g:1598:2: rule__IntegerProperty__Group_2__2__Impl
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
    // InternalCk2.g:1604:1: rule__IntegerProperty__Group_2__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_2_2 ) ) ;
    public final void rule__IntegerProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1608:1: ( ( ( rule__IntegerProperty__ValueAssignment_2_2 ) ) )
            // InternalCk2.g:1609:1: ( ( rule__IntegerProperty__ValueAssignment_2_2 ) )
            {
            // InternalCk2.g:1609:1: ( ( rule__IntegerProperty__ValueAssignment_2_2 ) )
            // InternalCk2.g:1610:2: ( rule__IntegerProperty__ValueAssignment_2_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_2_2()); 
            // InternalCk2.g:1611:2: ( rule__IntegerProperty__ValueAssignment_2_2 )
            // InternalCk2.g:1611:3: rule__IntegerProperty__ValueAssignment_2_2
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
    // InternalCk2.g:1620:1: rule__IntegerProperty__Group_3__0 : rule__IntegerProperty__Group_3__0__Impl rule__IntegerProperty__Group_3__1 ;
    public final void rule__IntegerProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1624:1: ( rule__IntegerProperty__Group_3__0__Impl rule__IntegerProperty__Group_3__1 )
            // InternalCk2.g:1625:2: rule__IntegerProperty__Group_3__0__Impl rule__IntegerProperty__Group_3__1
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
    // InternalCk2.g:1632:1: rule__IntegerProperty__Group_3__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_3_0 ) ) ;
    public final void rule__IntegerProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1636:1: ( ( ( rule__IntegerProperty__KeyAssignment_3_0 ) ) )
            // InternalCk2.g:1637:1: ( ( rule__IntegerProperty__KeyAssignment_3_0 ) )
            {
            // InternalCk2.g:1637:1: ( ( rule__IntegerProperty__KeyAssignment_3_0 ) )
            // InternalCk2.g:1638:2: ( rule__IntegerProperty__KeyAssignment_3_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_3_0()); 
            // InternalCk2.g:1639:2: ( rule__IntegerProperty__KeyAssignment_3_0 )
            // InternalCk2.g:1639:3: rule__IntegerProperty__KeyAssignment_3_0
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
    // InternalCk2.g:1647:1: rule__IntegerProperty__Group_3__1 : rule__IntegerProperty__Group_3__1__Impl rule__IntegerProperty__Group_3__2 ;
    public final void rule__IntegerProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1651:1: ( rule__IntegerProperty__Group_3__1__Impl rule__IntegerProperty__Group_3__2 )
            // InternalCk2.g:1652:2: rule__IntegerProperty__Group_3__1__Impl rule__IntegerProperty__Group_3__2
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
    // InternalCk2.g:1659:1: rule__IntegerProperty__Group_3__1__Impl : ( '>' ) ;
    public final void rule__IntegerProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1663:1: ( ( '>' ) )
            // InternalCk2.g:1664:1: ( '>' )
            {
            // InternalCk2.g:1664:1: ( '>' )
            // InternalCk2.g:1665:2: '>'
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
    // InternalCk2.g:1674:1: rule__IntegerProperty__Group_3__2 : rule__IntegerProperty__Group_3__2__Impl ;
    public final void rule__IntegerProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1678:1: ( rule__IntegerProperty__Group_3__2__Impl )
            // InternalCk2.g:1679:2: rule__IntegerProperty__Group_3__2__Impl
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
    // InternalCk2.g:1685:1: rule__IntegerProperty__Group_3__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_3_2 ) ) ;
    public final void rule__IntegerProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1689:1: ( ( ( rule__IntegerProperty__ValueAssignment_3_2 ) ) )
            // InternalCk2.g:1690:1: ( ( rule__IntegerProperty__ValueAssignment_3_2 ) )
            {
            // InternalCk2.g:1690:1: ( ( rule__IntegerProperty__ValueAssignment_3_2 ) )
            // InternalCk2.g:1691:2: ( rule__IntegerProperty__ValueAssignment_3_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_3_2()); 
            // InternalCk2.g:1692:2: ( rule__IntegerProperty__ValueAssignment_3_2 )
            // InternalCk2.g:1692:3: rule__IntegerProperty__ValueAssignment_3_2
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
    // InternalCk2.g:1701:1: rule__IntegerProperty__Group_4__0 : rule__IntegerProperty__Group_4__0__Impl rule__IntegerProperty__Group_4__1 ;
    public final void rule__IntegerProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1705:1: ( rule__IntegerProperty__Group_4__0__Impl rule__IntegerProperty__Group_4__1 )
            // InternalCk2.g:1706:2: rule__IntegerProperty__Group_4__0__Impl rule__IntegerProperty__Group_4__1
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
    // InternalCk2.g:1713:1: rule__IntegerProperty__Group_4__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_4_0 ) ) ;
    public final void rule__IntegerProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1717:1: ( ( ( rule__IntegerProperty__KeyAssignment_4_0 ) ) )
            // InternalCk2.g:1718:1: ( ( rule__IntegerProperty__KeyAssignment_4_0 ) )
            {
            // InternalCk2.g:1718:1: ( ( rule__IntegerProperty__KeyAssignment_4_0 ) )
            // InternalCk2.g:1719:2: ( rule__IntegerProperty__KeyAssignment_4_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_4_0()); 
            // InternalCk2.g:1720:2: ( rule__IntegerProperty__KeyAssignment_4_0 )
            // InternalCk2.g:1720:3: rule__IntegerProperty__KeyAssignment_4_0
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
    // InternalCk2.g:1728:1: rule__IntegerProperty__Group_4__1 : rule__IntegerProperty__Group_4__1__Impl rule__IntegerProperty__Group_4__2 ;
    public final void rule__IntegerProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1732:1: ( rule__IntegerProperty__Group_4__1__Impl rule__IntegerProperty__Group_4__2 )
            // InternalCk2.g:1733:2: rule__IntegerProperty__Group_4__1__Impl rule__IntegerProperty__Group_4__2
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
    // InternalCk2.g:1740:1: rule__IntegerProperty__Group_4__1__Impl : ( '<=' ) ;
    public final void rule__IntegerProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1744:1: ( ( '<=' ) )
            // InternalCk2.g:1745:1: ( '<=' )
            {
            // InternalCk2.g:1745:1: ( '<=' )
            // InternalCk2.g:1746:2: '<='
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
    // InternalCk2.g:1755:1: rule__IntegerProperty__Group_4__2 : rule__IntegerProperty__Group_4__2__Impl ;
    public final void rule__IntegerProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1759:1: ( rule__IntegerProperty__Group_4__2__Impl )
            // InternalCk2.g:1760:2: rule__IntegerProperty__Group_4__2__Impl
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
    // InternalCk2.g:1766:1: rule__IntegerProperty__Group_4__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__IntegerProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1770:1: ( ( ( rule__IntegerProperty__ValueAssignment_4_2 ) ) )
            // InternalCk2.g:1771:1: ( ( rule__IntegerProperty__ValueAssignment_4_2 ) )
            {
            // InternalCk2.g:1771:1: ( ( rule__IntegerProperty__ValueAssignment_4_2 ) )
            // InternalCk2.g:1772:2: ( rule__IntegerProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_4_2()); 
            // InternalCk2.g:1773:2: ( rule__IntegerProperty__ValueAssignment_4_2 )
            // InternalCk2.g:1773:3: rule__IntegerProperty__ValueAssignment_4_2
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
    // InternalCk2.g:1782:1: rule__IntegerProperty__Group_5__0 : rule__IntegerProperty__Group_5__0__Impl rule__IntegerProperty__Group_5__1 ;
    public final void rule__IntegerProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1786:1: ( rule__IntegerProperty__Group_5__0__Impl rule__IntegerProperty__Group_5__1 )
            // InternalCk2.g:1787:2: rule__IntegerProperty__Group_5__0__Impl rule__IntegerProperty__Group_5__1
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
    // InternalCk2.g:1794:1: rule__IntegerProperty__Group_5__0__Impl : ( ( rule__IntegerProperty__KeyAssignment_5_0 ) ) ;
    public final void rule__IntegerProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1798:1: ( ( ( rule__IntegerProperty__KeyAssignment_5_0 ) ) )
            // InternalCk2.g:1799:1: ( ( rule__IntegerProperty__KeyAssignment_5_0 ) )
            {
            // InternalCk2.g:1799:1: ( ( rule__IntegerProperty__KeyAssignment_5_0 ) )
            // InternalCk2.g:1800:2: ( rule__IntegerProperty__KeyAssignment_5_0 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getKeyAssignment_5_0()); 
            // InternalCk2.g:1801:2: ( rule__IntegerProperty__KeyAssignment_5_0 )
            // InternalCk2.g:1801:3: rule__IntegerProperty__KeyAssignment_5_0
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
    // InternalCk2.g:1809:1: rule__IntegerProperty__Group_5__1 : rule__IntegerProperty__Group_5__1__Impl rule__IntegerProperty__Group_5__2 ;
    public final void rule__IntegerProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1813:1: ( rule__IntegerProperty__Group_5__1__Impl rule__IntegerProperty__Group_5__2 )
            // InternalCk2.g:1814:2: rule__IntegerProperty__Group_5__1__Impl rule__IntegerProperty__Group_5__2
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
    // InternalCk2.g:1821:1: rule__IntegerProperty__Group_5__1__Impl : ( '<' ) ;
    public final void rule__IntegerProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1825:1: ( ( '<' ) )
            // InternalCk2.g:1826:1: ( '<' )
            {
            // InternalCk2.g:1826:1: ( '<' )
            // InternalCk2.g:1827:2: '<'
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
    // InternalCk2.g:1836:1: rule__IntegerProperty__Group_5__2 : rule__IntegerProperty__Group_5__2__Impl ;
    public final void rule__IntegerProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1840:1: ( rule__IntegerProperty__Group_5__2__Impl )
            // InternalCk2.g:1841:2: rule__IntegerProperty__Group_5__2__Impl
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
    // InternalCk2.g:1847:1: rule__IntegerProperty__Group_5__2__Impl : ( ( rule__IntegerProperty__ValueAssignment_5_2 ) ) ;
    public final void rule__IntegerProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1851:1: ( ( ( rule__IntegerProperty__ValueAssignment_5_2 ) ) )
            // InternalCk2.g:1852:1: ( ( rule__IntegerProperty__ValueAssignment_5_2 ) )
            {
            // InternalCk2.g:1852:1: ( ( rule__IntegerProperty__ValueAssignment_5_2 ) )
            // InternalCk2.g:1853:2: ( rule__IntegerProperty__ValueAssignment_5_2 )
            {
             before(grammarAccess.getIntegerPropertyAccess().getValueAssignment_5_2()); 
            // InternalCk2.g:1854:2: ( rule__IntegerProperty__ValueAssignment_5_2 )
            // InternalCk2.g:1854:3: rule__IntegerProperty__ValueAssignment_5_2
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
    // InternalCk2.g:1863:1: rule__DoubleProperty__Group_0__0 : rule__DoubleProperty__Group_0__0__Impl rule__DoubleProperty__Group_0__1 ;
    public final void rule__DoubleProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1867:1: ( rule__DoubleProperty__Group_0__0__Impl rule__DoubleProperty__Group_0__1 )
            // InternalCk2.g:1868:2: rule__DoubleProperty__Group_0__0__Impl rule__DoubleProperty__Group_0__1
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
    // InternalCk2.g:1875:1: rule__DoubleProperty__Group_0__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_0_0 ) ) ;
    public final void rule__DoubleProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1879:1: ( ( ( rule__DoubleProperty__KeyAssignment_0_0 ) ) )
            // InternalCk2.g:1880:1: ( ( rule__DoubleProperty__KeyAssignment_0_0 ) )
            {
            // InternalCk2.g:1880:1: ( ( rule__DoubleProperty__KeyAssignment_0_0 ) )
            // InternalCk2.g:1881:2: ( rule__DoubleProperty__KeyAssignment_0_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_0_0()); 
            // InternalCk2.g:1882:2: ( rule__DoubleProperty__KeyAssignment_0_0 )
            // InternalCk2.g:1882:3: rule__DoubleProperty__KeyAssignment_0_0
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
    // InternalCk2.g:1890:1: rule__DoubleProperty__Group_0__1 : rule__DoubleProperty__Group_0__1__Impl rule__DoubleProperty__Group_0__2 ;
    public final void rule__DoubleProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1894:1: ( rule__DoubleProperty__Group_0__1__Impl rule__DoubleProperty__Group_0__2 )
            // InternalCk2.g:1895:2: rule__DoubleProperty__Group_0__1__Impl rule__DoubleProperty__Group_0__2
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
    // InternalCk2.g:1902:1: rule__DoubleProperty__Group_0__1__Impl : ( '=' ) ;
    public final void rule__DoubleProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1906:1: ( ( '=' ) )
            // InternalCk2.g:1907:1: ( '=' )
            {
            // InternalCk2.g:1907:1: ( '=' )
            // InternalCk2.g:1908:2: '='
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
    // InternalCk2.g:1917:1: rule__DoubleProperty__Group_0__2 : rule__DoubleProperty__Group_0__2__Impl ;
    public final void rule__DoubleProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1921:1: ( rule__DoubleProperty__Group_0__2__Impl )
            // InternalCk2.g:1922:2: rule__DoubleProperty__Group_0__2__Impl
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
    // InternalCk2.g:1928:1: rule__DoubleProperty__Group_0__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_0_2 ) ) ;
    public final void rule__DoubleProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1932:1: ( ( ( rule__DoubleProperty__ValueAssignment_0_2 ) ) )
            // InternalCk2.g:1933:1: ( ( rule__DoubleProperty__ValueAssignment_0_2 ) )
            {
            // InternalCk2.g:1933:1: ( ( rule__DoubleProperty__ValueAssignment_0_2 ) )
            // InternalCk2.g:1934:2: ( rule__DoubleProperty__ValueAssignment_0_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_0_2()); 
            // InternalCk2.g:1935:2: ( rule__DoubleProperty__ValueAssignment_0_2 )
            // InternalCk2.g:1935:3: rule__DoubleProperty__ValueAssignment_0_2
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
    // InternalCk2.g:1944:1: rule__DoubleProperty__Group_1__0 : rule__DoubleProperty__Group_1__0__Impl rule__DoubleProperty__Group_1__1 ;
    public final void rule__DoubleProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1948:1: ( rule__DoubleProperty__Group_1__0__Impl rule__DoubleProperty__Group_1__1 )
            // InternalCk2.g:1949:2: rule__DoubleProperty__Group_1__0__Impl rule__DoubleProperty__Group_1__1
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
    // InternalCk2.g:1956:1: rule__DoubleProperty__Group_1__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_1_0 ) ) ;
    public final void rule__DoubleProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1960:1: ( ( ( rule__DoubleProperty__KeyAssignment_1_0 ) ) )
            // InternalCk2.g:1961:1: ( ( rule__DoubleProperty__KeyAssignment_1_0 ) )
            {
            // InternalCk2.g:1961:1: ( ( rule__DoubleProperty__KeyAssignment_1_0 ) )
            // InternalCk2.g:1962:2: ( rule__DoubleProperty__KeyAssignment_1_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_1_0()); 
            // InternalCk2.g:1963:2: ( rule__DoubleProperty__KeyAssignment_1_0 )
            // InternalCk2.g:1963:3: rule__DoubleProperty__KeyAssignment_1_0
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
    // InternalCk2.g:1971:1: rule__DoubleProperty__Group_1__1 : rule__DoubleProperty__Group_1__1__Impl rule__DoubleProperty__Group_1__2 ;
    public final void rule__DoubleProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1975:1: ( rule__DoubleProperty__Group_1__1__Impl rule__DoubleProperty__Group_1__2 )
            // InternalCk2.g:1976:2: rule__DoubleProperty__Group_1__1__Impl rule__DoubleProperty__Group_1__2
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
    // InternalCk2.g:1983:1: rule__DoubleProperty__Group_1__1__Impl : ( '==' ) ;
    public final void rule__DoubleProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:1987:1: ( ( '==' ) )
            // InternalCk2.g:1988:1: ( '==' )
            {
            // InternalCk2.g:1988:1: ( '==' )
            // InternalCk2.g:1989:2: '=='
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
    // InternalCk2.g:1998:1: rule__DoubleProperty__Group_1__2 : rule__DoubleProperty__Group_1__2__Impl ;
    public final void rule__DoubleProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2002:1: ( rule__DoubleProperty__Group_1__2__Impl )
            // InternalCk2.g:2003:2: rule__DoubleProperty__Group_1__2__Impl
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
    // InternalCk2.g:2009:1: rule__DoubleProperty__Group_1__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_1_2 ) ) ;
    public final void rule__DoubleProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2013:1: ( ( ( rule__DoubleProperty__ValueAssignment_1_2 ) ) )
            // InternalCk2.g:2014:1: ( ( rule__DoubleProperty__ValueAssignment_1_2 ) )
            {
            // InternalCk2.g:2014:1: ( ( rule__DoubleProperty__ValueAssignment_1_2 ) )
            // InternalCk2.g:2015:2: ( rule__DoubleProperty__ValueAssignment_1_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_1_2()); 
            // InternalCk2.g:2016:2: ( rule__DoubleProperty__ValueAssignment_1_2 )
            // InternalCk2.g:2016:3: rule__DoubleProperty__ValueAssignment_1_2
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
    // InternalCk2.g:2025:1: rule__DoubleProperty__Group_2__0 : rule__DoubleProperty__Group_2__0__Impl rule__DoubleProperty__Group_2__1 ;
    public final void rule__DoubleProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2029:1: ( rule__DoubleProperty__Group_2__0__Impl rule__DoubleProperty__Group_2__1 )
            // InternalCk2.g:2030:2: rule__DoubleProperty__Group_2__0__Impl rule__DoubleProperty__Group_2__1
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
    // InternalCk2.g:2037:1: rule__DoubleProperty__Group_2__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_2_0 ) ) ;
    public final void rule__DoubleProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2041:1: ( ( ( rule__DoubleProperty__KeyAssignment_2_0 ) ) )
            // InternalCk2.g:2042:1: ( ( rule__DoubleProperty__KeyAssignment_2_0 ) )
            {
            // InternalCk2.g:2042:1: ( ( rule__DoubleProperty__KeyAssignment_2_0 ) )
            // InternalCk2.g:2043:2: ( rule__DoubleProperty__KeyAssignment_2_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_2_0()); 
            // InternalCk2.g:2044:2: ( rule__DoubleProperty__KeyAssignment_2_0 )
            // InternalCk2.g:2044:3: rule__DoubleProperty__KeyAssignment_2_0
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
    // InternalCk2.g:2052:1: rule__DoubleProperty__Group_2__1 : rule__DoubleProperty__Group_2__1__Impl rule__DoubleProperty__Group_2__2 ;
    public final void rule__DoubleProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2056:1: ( rule__DoubleProperty__Group_2__1__Impl rule__DoubleProperty__Group_2__2 )
            // InternalCk2.g:2057:2: rule__DoubleProperty__Group_2__1__Impl rule__DoubleProperty__Group_2__2
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
    // InternalCk2.g:2064:1: rule__DoubleProperty__Group_2__1__Impl : ( '>=' ) ;
    public final void rule__DoubleProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2068:1: ( ( '>=' ) )
            // InternalCk2.g:2069:1: ( '>=' )
            {
            // InternalCk2.g:2069:1: ( '>=' )
            // InternalCk2.g:2070:2: '>='
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
    // InternalCk2.g:2079:1: rule__DoubleProperty__Group_2__2 : rule__DoubleProperty__Group_2__2__Impl ;
    public final void rule__DoubleProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2083:1: ( rule__DoubleProperty__Group_2__2__Impl )
            // InternalCk2.g:2084:2: rule__DoubleProperty__Group_2__2__Impl
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
    // InternalCk2.g:2090:1: rule__DoubleProperty__Group_2__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_2_2 ) ) ;
    public final void rule__DoubleProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2094:1: ( ( ( rule__DoubleProperty__ValueAssignment_2_2 ) ) )
            // InternalCk2.g:2095:1: ( ( rule__DoubleProperty__ValueAssignment_2_2 ) )
            {
            // InternalCk2.g:2095:1: ( ( rule__DoubleProperty__ValueAssignment_2_2 ) )
            // InternalCk2.g:2096:2: ( rule__DoubleProperty__ValueAssignment_2_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_2_2()); 
            // InternalCk2.g:2097:2: ( rule__DoubleProperty__ValueAssignment_2_2 )
            // InternalCk2.g:2097:3: rule__DoubleProperty__ValueAssignment_2_2
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
    // InternalCk2.g:2106:1: rule__DoubleProperty__Group_3__0 : rule__DoubleProperty__Group_3__0__Impl rule__DoubleProperty__Group_3__1 ;
    public final void rule__DoubleProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2110:1: ( rule__DoubleProperty__Group_3__0__Impl rule__DoubleProperty__Group_3__1 )
            // InternalCk2.g:2111:2: rule__DoubleProperty__Group_3__0__Impl rule__DoubleProperty__Group_3__1
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
    // InternalCk2.g:2118:1: rule__DoubleProperty__Group_3__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_3_0 ) ) ;
    public final void rule__DoubleProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2122:1: ( ( ( rule__DoubleProperty__KeyAssignment_3_0 ) ) )
            // InternalCk2.g:2123:1: ( ( rule__DoubleProperty__KeyAssignment_3_0 ) )
            {
            // InternalCk2.g:2123:1: ( ( rule__DoubleProperty__KeyAssignment_3_0 ) )
            // InternalCk2.g:2124:2: ( rule__DoubleProperty__KeyAssignment_3_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_3_0()); 
            // InternalCk2.g:2125:2: ( rule__DoubleProperty__KeyAssignment_3_0 )
            // InternalCk2.g:2125:3: rule__DoubleProperty__KeyAssignment_3_0
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
    // InternalCk2.g:2133:1: rule__DoubleProperty__Group_3__1 : rule__DoubleProperty__Group_3__1__Impl rule__DoubleProperty__Group_3__2 ;
    public final void rule__DoubleProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2137:1: ( rule__DoubleProperty__Group_3__1__Impl rule__DoubleProperty__Group_3__2 )
            // InternalCk2.g:2138:2: rule__DoubleProperty__Group_3__1__Impl rule__DoubleProperty__Group_3__2
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
    // InternalCk2.g:2145:1: rule__DoubleProperty__Group_3__1__Impl : ( '>' ) ;
    public final void rule__DoubleProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2149:1: ( ( '>' ) )
            // InternalCk2.g:2150:1: ( '>' )
            {
            // InternalCk2.g:2150:1: ( '>' )
            // InternalCk2.g:2151:2: '>'
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
    // InternalCk2.g:2160:1: rule__DoubleProperty__Group_3__2 : rule__DoubleProperty__Group_3__2__Impl ;
    public final void rule__DoubleProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2164:1: ( rule__DoubleProperty__Group_3__2__Impl )
            // InternalCk2.g:2165:2: rule__DoubleProperty__Group_3__2__Impl
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
    // InternalCk2.g:2171:1: rule__DoubleProperty__Group_3__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_3_2 ) ) ;
    public final void rule__DoubleProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2175:1: ( ( ( rule__DoubleProperty__ValueAssignment_3_2 ) ) )
            // InternalCk2.g:2176:1: ( ( rule__DoubleProperty__ValueAssignment_3_2 ) )
            {
            // InternalCk2.g:2176:1: ( ( rule__DoubleProperty__ValueAssignment_3_2 ) )
            // InternalCk2.g:2177:2: ( rule__DoubleProperty__ValueAssignment_3_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_3_2()); 
            // InternalCk2.g:2178:2: ( rule__DoubleProperty__ValueAssignment_3_2 )
            // InternalCk2.g:2178:3: rule__DoubleProperty__ValueAssignment_3_2
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
    // InternalCk2.g:2187:1: rule__DoubleProperty__Group_4__0 : rule__DoubleProperty__Group_4__0__Impl rule__DoubleProperty__Group_4__1 ;
    public final void rule__DoubleProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2191:1: ( rule__DoubleProperty__Group_4__0__Impl rule__DoubleProperty__Group_4__1 )
            // InternalCk2.g:2192:2: rule__DoubleProperty__Group_4__0__Impl rule__DoubleProperty__Group_4__1
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
    // InternalCk2.g:2199:1: rule__DoubleProperty__Group_4__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_4_0 ) ) ;
    public final void rule__DoubleProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2203:1: ( ( ( rule__DoubleProperty__KeyAssignment_4_0 ) ) )
            // InternalCk2.g:2204:1: ( ( rule__DoubleProperty__KeyAssignment_4_0 ) )
            {
            // InternalCk2.g:2204:1: ( ( rule__DoubleProperty__KeyAssignment_4_0 ) )
            // InternalCk2.g:2205:2: ( rule__DoubleProperty__KeyAssignment_4_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_4_0()); 
            // InternalCk2.g:2206:2: ( rule__DoubleProperty__KeyAssignment_4_0 )
            // InternalCk2.g:2206:3: rule__DoubleProperty__KeyAssignment_4_0
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
    // InternalCk2.g:2214:1: rule__DoubleProperty__Group_4__1 : rule__DoubleProperty__Group_4__1__Impl rule__DoubleProperty__Group_4__2 ;
    public final void rule__DoubleProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2218:1: ( rule__DoubleProperty__Group_4__1__Impl rule__DoubleProperty__Group_4__2 )
            // InternalCk2.g:2219:2: rule__DoubleProperty__Group_4__1__Impl rule__DoubleProperty__Group_4__2
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
    // InternalCk2.g:2226:1: rule__DoubleProperty__Group_4__1__Impl : ( '<=' ) ;
    public final void rule__DoubleProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2230:1: ( ( '<=' ) )
            // InternalCk2.g:2231:1: ( '<=' )
            {
            // InternalCk2.g:2231:1: ( '<=' )
            // InternalCk2.g:2232:2: '<='
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
    // InternalCk2.g:2241:1: rule__DoubleProperty__Group_4__2 : rule__DoubleProperty__Group_4__2__Impl ;
    public final void rule__DoubleProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2245:1: ( rule__DoubleProperty__Group_4__2__Impl )
            // InternalCk2.g:2246:2: rule__DoubleProperty__Group_4__2__Impl
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
    // InternalCk2.g:2252:1: rule__DoubleProperty__Group_4__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_4_2 ) ) ;
    public final void rule__DoubleProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2256:1: ( ( ( rule__DoubleProperty__ValueAssignment_4_2 ) ) )
            // InternalCk2.g:2257:1: ( ( rule__DoubleProperty__ValueAssignment_4_2 ) )
            {
            // InternalCk2.g:2257:1: ( ( rule__DoubleProperty__ValueAssignment_4_2 ) )
            // InternalCk2.g:2258:2: ( rule__DoubleProperty__ValueAssignment_4_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_4_2()); 
            // InternalCk2.g:2259:2: ( rule__DoubleProperty__ValueAssignment_4_2 )
            // InternalCk2.g:2259:3: rule__DoubleProperty__ValueAssignment_4_2
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
    // InternalCk2.g:2268:1: rule__DoubleProperty__Group_5__0 : rule__DoubleProperty__Group_5__0__Impl rule__DoubleProperty__Group_5__1 ;
    public final void rule__DoubleProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2272:1: ( rule__DoubleProperty__Group_5__0__Impl rule__DoubleProperty__Group_5__1 )
            // InternalCk2.g:2273:2: rule__DoubleProperty__Group_5__0__Impl rule__DoubleProperty__Group_5__1
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
    // InternalCk2.g:2280:1: rule__DoubleProperty__Group_5__0__Impl : ( ( rule__DoubleProperty__KeyAssignment_5_0 ) ) ;
    public final void rule__DoubleProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2284:1: ( ( ( rule__DoubleProperty__KeyAssignment_5_0 ) ) )
            // InternalCk2.g:2285:1: ( ( rule__DoubleProperty__KeyAssignment_5_0 ) )
            {
            // InternalCk2.g:2285:1: ( ( rule__DoubleProperty__KeyAssignment_5_0 ) )
            // InternalCk2.g:2286:2: ( rule__DoubleProperty__KeyAssignment_5_0 )
            {
             before(grammarAccess.getDoublePropertyAccess().getKeyAssignment_5_0()); 
            // InternalCk2.g:2287:2: ( rule__DoubleProperty__KeyAssignment_5_0 )
            // InternalCk2.g:2287:3: rule__DoubleProperty__KeyAssignment_5_0
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
    // InternalCk2.g:2295:1: rule__DoubleProperty__Group_5__1 : rule__DoubleProperty__Group_5__1__Impl rule__DoubleProperty__Group_5__2 ;
    public final void rule__DoubleProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2299:1: ( rule__DoubleProperty__Group_5__1__Impl rule__DoubleProperty__Group_5__2 )
            // InternalCk2.g:2300:2: rule__DoubleProperty__Group_5__1__Impl rule__DoubleProperty__Group_5__2
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
    // InternalCk2.g:2307:1: rule__DoubleProperty__Group_5__1__Impl : ( '<' ) ;
    public final void rule__DoubleProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2311:1: ( ( '<' ) )
            // InternalCk2.g:2312:1: ( '<' )
            {
            // InternalCk2.g:2312:1: ( '<' )
            // InternalCk2.g:2313:2: '<'
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
    // InternalCk2.g:2322:1: rule__DoubleProperty__Group_5__2 : rule__DoubleProperty__Group_5__2__Impl ;
    public final void rule__DoubleProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2326:1: ( rule__DoubleProperty__Group_5__2__Impl )
            // InternalCk2.g:2327:2: rule__DoubleProperty__Group_5__2__Impl
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
    // InternalCk2.g:2333:1: rule__DoubleProperty__Group_5__2__Impl : ( ( rule__DoubleProperty__ValueAssignment_5_2 ) ) ;
    public final void rule__DoubleProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2337:1: ( ( ( rule__DoubleProperty__ValueAssignment_5_2 ) ) )
            // InternalCk2.g:2338:1: ( ( rule__DoubleProperty__ValueAssignment_5_2 ) )
            {
            // InternalCk2.g:2338:1: ( ( rule__DoubleProperty__ValueAssignment_5_2 ) )
            // InternalCk2.g:2339:2: ( rule__DoubleProperty__ValueAssignment_5_2 )
            {
             before(grammarAccess.getDoublePropertyAccess().getValueAssignment_5_2()); 
            // InternalCk2.g:2340:2: ( rule__DoubleProperty__ValueAssignment_5_2 )
            // InternalCk2.g:2340:3: rule__DoubleProperty__ValueAssignment_5_2
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
    // InternalCk2.g:2349:1: rule__HexadecimalProperty__Group__0 : rule__HexadecimalProperty__Group__0__Impl rule__HexadecimalProperty__Group__1 ;
    public final void rule__HexadecimalProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2353:1: ( rule__HexadecimalProperty__Group__0__Impl rule__HexadecimalProperty__Group__1 )
            // InternalCk2.g:2354:2: rule__HexadecimalProperty__Group__0__Impl rule__HexadecimalProperty__Group__1
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
    // InternalCk2.g:2361:1: rule__HexadecimalProperty__Group__0__Impl : ( ( rule__HexadecimalProperty__KeyAssignment_0 ) ) ;
    public final void rule__HexadecimalProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2365:1: ( ( ( rule__HexadecimalProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2366:1: ( ( rule__HexadecimalProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2366:1: ( ( rule__HexadecimalProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2367:2: ( rule__HexadecimalProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2368:2: ( rule__HexadecimalProperty__KeyAssignment_0 )
            // InternalCk2.g:2368:3: rule__HexadecimalProperty__KeyAssignment_0
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
    // InternalCk2.g:2376:1: rule__HexadecimalProperty__Group__1 : rule__HexadecimalProperty__Group__1__Impl rule__HexadecimalProperty__Group__2 ;
    public final void rule__HexadecimalProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2380:1: ( rule__HexadecimalProperty__Group__1__Impl rule__HexadecimalProperty__Group__2 )
            // InternalCk2.g:2381:2: rule__HexadecimalProperty__Group__1__Impl rule__HexadecimalProperty__Group__2
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
    // InternalCk2.g:2388:1: rule__HexadecimalProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__HexadecimalProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2392:1: ( ( '=' ) )
            // InternalCk2.g:2393:1: ( '=' )
            {
            // InternalCk2.g:2393:1: ( '=' )
            // InternalCk2.g:2394:2: '='
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
    // InternalCk2.g:2403:1: rule__HexadecimalProperty__Group__2 : rule__HexadecimalProperty__Group__2__Impl ;
    public final void rule__HexadecimalProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2407:1: ( rule__HexadecimalProperty__Group__2__Impl )
            // InternalCk2.g:2408:2: rule__HexadecimalProperty__Group__2__Impl
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
    // InternalCk2.g:2414:1: rule__HexadecimalProperty__Group__2__Impl : ( ( rule__HexadecimalProperty__ValueAssignment_2 ) ) ;
    public final void rule__HexadecimalProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2418:1: ( ( ( rule__HexadecimalProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2419:1: ( ( rule__HexadecimalProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2419:1: ( ( rule__HexadecimalProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2420:2: ( rule__HexadecimalProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getHexadecimalPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2421:2: ( rule__HexadecimalProperty__ValueAssignment_2 )
            // InternalCk2.g:2421:3: rule__HexadecimalProperty__ValueAssignment_2
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
    // InternalCk2.g:2430:1: rule__ListProperty__Group__0 : rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 ;
    public final void rule__ListProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2434:1: ( rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1 )
            // InternalCk2.g:2435:2: rule__ListProperty__Group__0__Impl rule__ListProperty__Group__1
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
    // InternalCk2.g:2442:1: rule__ListProperty__Group__0__Impl : ( ( rule__ListProperty__KeyAssignment_0 ) ) ;
    public final void rule__ListProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2446:1: ( ( ( rule__ListProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2447:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2447:1: ( ( rule__ListProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2448:2: ( rule__ListProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getListPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2449:2: ( rule__ListProperty__KeyAssignment_0 )
            // InternalCk2.g:2449:3: rule__ListProperty__KeyAssignment_0
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
    // InternalCk2.g:2457:1: rule__ListProperty__Group__1 : rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 ;
    public final void rule__ListProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2461:1: ( rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2 )
            // InternalCk2.g:2462:2: rule__ListProperty__Group__1__Impl rule__ListProperty__Group__2
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
    // InternalCk2.g:2469:1: rule__ListProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ListProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2473:1: ( ( '=' ) )
            // InternalCk2.g:2474:1: ( '=' )
            {
            // InternalCk2.g:2474:1: ( '=' )
            // InternalCk2.g:2475:2: '='
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
    // InternalCk2.g:2484:1: rule__ListProperty__Group__2 : rule__ListProperty__Group__2__Impl ;
    public final void rule__ListProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2488:1: ( rule__ListProperty__Group__2__Impl )
            // InternalCk2.g:2489:2: rule__ListProperty__Group__2__Impl
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
    // InternalCk2.g:2495:1: rule__ListProperty__Group__2__Impl : ( ( rule__ListProperty__ValueAssignment_2 ) ) ;
    public final void rule__ListProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2499:1: ( ( ( rule__ListProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2500:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2500:1: ( ( rule__ListProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2501:2: ( rule__ListProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getListPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2502:2: ( rule__ListProperty__ValueAssignment_2 )
            // InternalCk2.g:2502:3: rule__ListProperty__ValueAssignment_2
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
    // InternalCk2.g:2511:1: rule__IdClauseProperty__Group__0 : rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 ;
    public final void rule__IdClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2515:1: ( rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1 )
            // InternalCk2.g:2516:2: rule__IdClauseProperty__Group__0__Impl rule__IdClauseProperty__Group__1
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
    // InternalCk2.g:2523:1: rule__IdClauseProperty__Group__0__Impl : ( ( rule__IdClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IdClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2527:1: ( ( ( rule__IdClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2528:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2528:1: ( ( rule__IdClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2529:2: ( rule__IdClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2530:2: ( rule__IdClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2530:3: rule__IdClauseProperty__NameAssignment_0
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
    // InternalCk2.g:2538:1: rule__IdClauseProperty__Group__1 : rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 ;
    public final void rule__IdClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2542:1: ( rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2 )
            // InternalCk2.g:2543:2: rule__IdClauseProperty__Group__1__Impl rule__IdClauseProperty__Group__2
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
    // InternalCk2.g:2550:1: rule__IdClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IdClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2554:1: ( ( '=' ) )
            // InternalCk2.g:2555:1: ( '=' )
            {
            // InternalCk2.g:2555:1: ( '=' )
            // InternalCk2.g:2556:2: '='
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
    // InternalCk2.g:2565:1: rule__IdClauseProperty__Group__2 : rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 ;
    public final void rule__IdClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2569:1: ( rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3 )
            // InternalCk2.g:2570:2: rule__IdClauseProperty__Group__2__Impl rule__IdClauseProperty__Group__3
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
    // InternalCk2.g:2577:1: rule__IdClauseProperty__Group__2__Impl : ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IdClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2581:1: ( ( ( rule__IdClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2582:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2582:1: ( ( rule__IdClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2583:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2584:2: ( rule__IdClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2584:3: rule__IdClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:2592:1: rule__IdClauseProperty__Group__3 : rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 ;
    public final void rule__IdClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2596:1: ( rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4 )
            // InternalCk2.g:2597:2: rule__IdClauseProperty__Group__3__Impl rule__IdClauseProperty__Group__4
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
    // InternalCk2.g:2604:1: rule__IdClauseProperty__Group__3__Impl : ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IdClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2608:1: ( ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2609:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2609:1: ( ( rule__IdClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2610:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIdClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2611:2: ( rule__IdClauseProperty__PropertiesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCk2.g:2611:3: rule__IdClauseProperty__PropertiesAssignment_3
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
    // InternalCk2.g:2619:1: rule__IdClauseProperty__Group__4 : rule__IdClauseProperty__Group__4__Impl ;
    public final void rule__IdClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2623:1: ( rule__IdClauseProperty__Group__4__Impl )
            // InternalCk2.g:2624:2: rule__IdClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2630:1: rule__IdClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IdClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2634:1: ( ( '}' ) )
            // InternalCk2.g:2635:1: ( '}' )
            {
            // InternalCk2.g:2635:1: ( '}' )
            // InternalCk2.g:2636:2: '}'
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
    // InternalCk2.g:2646:1: rule__IntClauseProperty__Group__0 : rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 ;
    public final void rule__IntClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2650:1: ( rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1 )
            // InternalCk2.g:2651:2: rule__IntClauseProperty__Group__0__Impl rule__IntClauseProperty__Group__1
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
    // InternalCk2.g:2658:1: rule__IntClauseProperty__Group__0__Impl : ( ( rule__IntClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__IntClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2662:1: ( ( ( rule__IntClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2663:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2663:1: ( ( rule__IntClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2664:2: ( rule__IntClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2665:2: ( rule__IntClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2665:3: rule__IntClauseProperty__NameAssignment_0
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
    // InternalCk2.g:2673:1: rule__IntClauseProperty__Group__1 : rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 ;
    public final void rule__IntClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2677:1: ( rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2 )
            // InternalCk2.g:2678:2: rule__IntClauseProperty__Group__1__Impl rule__IntClauseProperty__Group__2
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
    // InternalCk2.g:2685:1: rule__IntClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__IntClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2689:1: ( ( '=' ) )
            // InternalCk2.g:2690:1: ( '=' )
            {
            // InternalCk2.g:2690:1: ( '=' )
            // InternalCk2.g:2691:2: '='
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
    // InternalCk2.g:2700:1: rule__IntClauseProperty__Group__2 : rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 ;
    public final void rule__IntClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2704:1: ( rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3 )
            // InternalCk2.g:2705:2: rule__IntClauseProperty__Group__2__Impl rule__IntClauseProperty__Group__3
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
    // InternalCk2.g:2712:1: rule__IntClauseProperty__Group__2__Impl : ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__IntClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2716:1: ( ( ( rule__IntClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2717:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2717:1: ( ( rule__IntClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2718:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2719:2: ( rule__IntClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2719:3: rule__IntClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:2727:1: rule__IntClauseProperty__Group__3 : rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 ;
    public final void rule__IntClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2731:1: ( rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4 )
            // InternalCk2.g:2732:2: rule__IntClauseProperty__Group__3__Impl rule__IntClauseProperty__Group__4
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
    // InternalCk2.g:2739:1: rule__IntClauseProperty__Group__3__Impl : ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__IntClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2743:1: ( ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2744:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2744:1: ( ( rule__IntClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2745:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getIntClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2746:2: ( rule__IntClauseProperty__PropertiesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCk2.g:2746:3: rule__IntClauseProperty__PropertiesAssignment_3
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
    // InternalCk2.g:2754:1: rule__IntClauseProperty__Group__4 : rule__IntClauseProperty__Group__4__Impl ;
    public final void rule__IntClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2758:1: ( rule__IntClauseProperty__Group__4__Impl )
            // InternalCk2.g:2759:2: rule__IntClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2765:1: rule__IntClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__IntClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2769:1: ( ( '}' ) )
            // InternalCk2.g:2770:1: ( '}' )
            {
            // InternalCk2.g:2770:1: ( '}' )
            // InternalCk2.g:2771:2: '}'
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
    // InternalCk2.g:2781:1: rule__DateClauseProperty__Group__0 : rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 ;
    public final void rule__DateClauseProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2785:1: ( rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1 )
            // InternalCk2.g:2786:2: rule__DateClauseProperty__Group__0__Impl rule__DateClauseProperty__Group__1
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
    // InternalCk2.g:2793:1: rule__DateClauseProperty__Group__0__Impl : ( ( rule__DateClauseProperty__NameAssignment_0 ) ) ;
    public final void rule__DateClauseProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2797:1: ( ( ( rule__DateClauseProperty__NameAssignment_0 ) ) )
            // InternalCk2.g:2798:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            {
            // InternalCk2.g:2798:1: ( ( rule__DateClauseProperty__NameAssignment_0 ) )
            // InternalCk2.g:2799:2: ( rule__DateClauseProperty__NameAssignment_0 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getNameAssignment_0()); 
            // InternalCk2.g:2800:2: ( rule__DateClauseProperty__NameAssignment_0 )
            // InternalCk2.g:2800:3: rule__DateClauseProperty__NameAssignment_0
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
    // InternalCk2.g:2808:1: rule__DateClauseProperty__Group__1 : rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 ;
    public final void rule__DateClauseProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2812:1: ( rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2 )
            // InternalCk2.g:2813:2: rule__DateClauseProperty__Group__1__Impl rule__DateClauseProperty__Group__2
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
    // InternalCk2.g:2820:1: rule__DateClauseProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__DateClauseProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2824:1: ( ( '=' ) )
            // InternalCk2.g:2825:1: ( '=' )
            {
            // InternalCk2.g:2825:1: ( '=' )
            // InternalCk2.g:2826:2: '='
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
    // InternalCk2.g:2835:1: rule__DateClauseProperty__Group__2 : rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 ;
    public final void rule__DateClauseProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2839:1: ( rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3 )
            // InternalCk2.g:2840:2: rule__DateClauseProperty__Group__2__Impl rule__DateClauseProperty__Group__3
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
    // InternalCk2.g:2847:1: rule__DateClauseProperty__Group__2__Impl : ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) ;
    public final void rule__DateClauseProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2851:1: ( ( ( rule__DateClauseProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2852:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2852:1: ( ( rule__DateClauseProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2853:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2854:2: ( rule__DateClauseProperty__ValueAssignment_2 )
            // InternalCk2.g:2854:3: rule__DateClauseProperty__ValueAssignment_2
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
    // InternalCk2.g:2862:1: rule__DateClauseProperty__Group__3 : rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 ;
    public final void rule__DateClauseProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2866:1: ( rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4 )
            // InternalCk2.g:2867:2: rule__DateClauseProperty__Group__3__Impl rule__DateClauseProperty__Group__4
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
    // InternalCk2.g:2874:1: rule__DateClauseProperty__Group__3__Impl : ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) ;
    public final void rule__DateClauseProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2878:1: ( ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* ) )
            // InternalCk2.g:2879:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            {
            // InternalCk2.g:2879:1: ( ( rule__DateClauseProperty__PropertiesAssignment_3 )* )
            // InternalCk2.g:2880:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getDateClausePropertyAccess().getPropertiesAssignment_3()); 
            // InternalCk2.g:2881:2: ( rule__DateClauseProperty__PropertiesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCk2.g:2881:3: rule__DateClauseProperty__PropertiesAssignment_3
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
    // InternalCk2.g:2889:1: rule__DateClauseProperty__Group__4 : rule__DateClauseProperty__Group__4__Impl ;
    public final void rule__DateClauseProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2893:1: ( rule__DateClauseProperty__Group__4__Impl )
            // InternalCk2.g:2894:2: rule__DateClauseProperty__Group__4__Impl
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
    // InternalCk2.g:2900:1: rule__DateClauseProperty__Group__4__Impl : ( '}' ) ;
    public final void rule__DateClauseProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2904:1: ( ( '}' ) )
            // InternalCk2.g:2905:1: ( '}' )
            {
            // InternalCk2.g:2905:1: ( '}' )
            // InternalCk2.g:2906:2: '}'
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
    // InternalCk2.g:2916:1: rule__ProbabilityProperty__Group__0 : rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 ;
    public final void rule__ProbabilityProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2920:1: ( rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1 )
            // InternalCk2.g:2921:2: rule__ProbabilityProperty__Group__0__Impl rule__ProbabilityProperty__Group__1
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
    // InternalCk2.g:2928:1: rule__ProbabilityProperty__Group__0__Impl : ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) ;
    public final void rule__ProbabilityProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2932:1: ( ( ( rule__ProbabilityProperty__KeyAssignment_0 ) ) )
            // InternalCk2.g:2933:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            {
            // InternalCk2.g:2933:1: ( ( rule__ProbabilityProperty__KeyAssignment_0 ) )
            // InternalCk2.g:2934:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getKeyAssignment_0()); 
            // InternalCk2.g:2935:2: ( rule__ProbabilityProperty__KeyAssignment_0 )
            // InternalCk2.g:2935:3: rule__ProbabilityProperty__KeyAssignment_0
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
    // InternalCk2.g:2943:1: rule__ProbabilityProperty__Group__1 : rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 ;
    public final void rule__ProbabilityProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2947:1: ( rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2 )
            // InternalCk2.g:2948:2: rule__ProbabilityProperty__Group__1__Impl rule__ProbabilityProperty__Group__2
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
    // InternalCk2.g:2955:1: rule__ProbabilityProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__ProbabilityProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2959:1: ( ( '=' ) )
            // InternalCk2.g:2960:1: ( '=' )
            {
            // InternalCk2.g:2960:1: ( '=' )
            // InternalCk2.g:2961:2: '='
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
    // InternalCk2.g:2970:1: rule__ProbabilityProperty__Group__2 : rule__ProbabilityProperty__Group__2__Impl ;
    public final void rule__ProbabilityProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2974:1: ( rule__ProbabilityProperty__Group__2__Impl )
            // InternalCk2.g:2975:2: rule__ProbabilityProperty__Group__2__Impl
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
    // InternalCk2.g:2981:1: rule__ProbabilityProperty__Group__2__Impl : ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) ;
    public final void rule__ProbabilityProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:2985:1: ( ( ( rule__ProbabilityProperty__ValueAssignment_2 ) ) )
            // InternalCk2.g:2986:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            {
            // InternalCk2.g:2986:1: ( ( rule__ProbabilityProperty__ValueAssignment_2 ) )
            // InternalCk2.g:2987:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            {
             before(grammarAccess.getProbabilityPropertyAccess().getValueAssignment_2()); 
            // InternalCk2.g:2988:2: ( rule__ProbabilityProperty__ValueAssignment_2 )
            // InternalCk2.g:2988:3: rule__ProbabilityProperty__ValueAssignment_2
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


    // $ANTLR start "rule__Date__Group__0"
    // InternalCk2.g:2997:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3001:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalCk2.g:3002:2: rule__Date__Group__0__Impl rule__Date__Group__1
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
    // InternalCk2.g:3009:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3013:1: ( ( RULE_INT ) )
            // InternalCk2.g:3014:1: ( RULE_INT )
            {
            // InternalCk2.g:3014:1: ( RULE_INT )
            // InternalCk2.g:3015:2: RULE_INT
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
    // InternalCk2.g:3024:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3028:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalCk2.g:3029:2: rule__Date__Group__1__Impl rule__Date__Group__2
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
    // InternalCk2.g:3036:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3040:1: ( ( '.' ) )
            // InternalCk2.g:3041:1: ( '.' )
            {
            // InternalCk2.g:3041:1: ( '.' )
            // InternalCk2.g:3042:2: '.'
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
    // InternalCk2.g:3051:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3055:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalCk2.g:3056:2: rule__Date__Group__2__Impl rule__Date__Group__3
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
    // InternalCk2.g:3063:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3067:1: ( ( RULE_INT ) )
            // InternalCk2.g:3068:1: ( RULE_INT )
            {
            // InternalCk2.g:3068:1: ( RULE_INT )
            // InternalCk2.g:3069:2: RULE_INT
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
    // InternalCk2.g:3078:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3082:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalCk2.g:3083:2: rule__Date__Group__3__Impl rule__Date__Group__4
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
    // InternalCk2.g:3090:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3094:1: ( ( '.' ) )
            // InternalCk2.g:3095:1: ( '.' )
            {
            // InternalCk2.g:3095:1: ( '.' )
            // InternalCk2.g:3096:2: '.'
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
    // InternalCk2.g:3105:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3109:1: ( rule__Date__Group__4__Impl )
            // InternalCk2.g:3110:2: rule__Date__Group__4__Impl
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
    // InternalCk2.g:3116:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3120:1: ( ( RULE_INT ) )
            // InternalCk2.g:3121:1: ( RULE_INT )
            {
            // InternalCk2.g:3121:1: ( RULE_INT )
            // InternalCk2.g:3122:2: RULE_INT
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
    // InternalCk2.g:3132:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3136:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalCk2.g:3137:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalCk2.g:3144:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__Alternatives_0 )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3148:1: ( ( ( rule__Integer__Alternatives_0 )? ) )
            // InternalCk2.g:3149:1: ( ( rule__Integer__Alternatives_0 )? )
            {
            // InternalCk2.g:3149:1: ( ( rule__Integer__Alternatives_0 )? )
            // InternalCk2.g:3150:2: ( rule__Integer__Alternatives_0 )?
            {
             before(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            // InternalCk2.g:3151:2: ( rule__Integer__Alternatives_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=16)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCk2.g:3151:3: rule__Integer__Alternatives_0
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
    // InternalCk2.g:3159:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3163:1: ( rule__Integer__Group__1__Impl )
            // InternalCk2.g:3164:2: rule__Integer__Group__1__Impl
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
    // InternalCk2.g:3170:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3174:1: ( ( RULE_INT ) )
            // InternalCk2.g:3175:1: ( RULE_INT )
            {
            // InternalCk2.g:3175:1: ( RULE_INT )
            // InternalCk2.g:3176:2: RULE_INT
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
    // InternalCk2.g:3186:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3190:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalCk2.g:3191:2: rule__Double__Group__0__Impl rule__Double__Group__1
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
    // InternalCk2.g:3198:1: rule__Double__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3202:1: ( ( ruleInteger ) )
            // InternalCk2.g:3203:1: ( ruleInteger )
            {
            // InternalCk2.g:3203:1: ( ruleInteger )
            // InternalCk2.g:3204:2: ruleInteger
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
    // InternalCk2.g:3213:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3217:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalCk2.g:3218:2: rule__Double__Group__1__Impl rule__Double__Group__2
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
    // InternalCk2.g:3225:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3229:1: ( ( '.' ) )
            // InternalCk2.g:3230:1: ( '.' )
            {
            // InternalCk2.g:3230:1: ( '.' )
            // InternalCk2.g:3231:2: '.'
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
    // InternalCk2.g:3240:1: rule__Double__Group__2 : rule__Double__Group__2__Impl rule__Double__Group__3 ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3244:1: ( rule__Double__Group__2__Impl rule__Double__Group__3 )
            // InternalCk2.g:3245:2: rule__Double__Group__2__Impl rule__Double__Group__3
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
    // InternalCk2.g:3252:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3256:1: ( ( RULE_INT ) )
            // InternalCk2.g:3257:1: ( RULE_INT )
            {
            // InternalCk2.g:3257:1: ( RULE_INT )
            // InternalCk2.g:3258:2: RULE_INT
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
    // InternalCk2.g:3267:1: rule__Double__Group__3 : rule__Double__Group__3__Impl ;
    public final void rule__Double__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3271:1: ( rule__Double__Group__3__Impl )
            // InternalCk2.g:3272:2: rule__Double__Group__3__Impl
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
    // InternalCk2.g:3278:1: rule__Double__Group__3__Impl : ( ( 'f' )? ) ;
    public final void rule__Double__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3282:1: ( ( ( 'f' )? ) )
            // InternalCk2.g:3283:1: ( ( 'f' )? )
            {
            // InternalCk2.g:3283:1: ( ( 'f' )? )
            // InternalCk2.g:3284:2: ( 'f' )?
            {
             before(grammarAccess.getDoubleAccess().getFKeyword_3()); 
            // InternalCk2.g:3285:2: ( 'f' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCk2.g:3285:3: 'f'
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
    // InternalCk2.g:3294:1: rule__Model__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__Model__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3298:1: ( ( ruleProperty ) )
            // InternalCk2.g:3299:2: ( ruleProperty )
            {
            // InternalCk2.g:3299:2: ( ruleProperty )
            // InternalCk2.g:3300:3: ruleProperty
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
    // InternalCk2.g:3309:1: rule__List__ElemsAssignment_1 : ( ruleListElem ) ;
    public final void rule__List__ElemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3313:1: ( ( ruleListElem ) )
            // InternalCk2.g:3314:2: ( ruleListElem )
            {
            // InternalCk2.g:3314:2: ( ruleListElem )
            // InternalCk2.g:3315:3: ruleListElem
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
    // InternalCk2.g:3324:1: rule__StringProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3328:1: ( ( RULE_ID ) )
            // InternalCk2.g:3329:2: ( RULE_ID )
            {
            // InternalCk2.g:3329:2: ( RULE_ID )
            // InternalCk2.g:3330:3: RULE_ID
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
    // InternalCk2.g:3339:1: rule__StringProperty__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3343:1: ( ( RULE_STRING ) )
            // InternalCk2.g:3344:2: ( RULE_STRING )
            {
            // InternalCk2.g:3344:2: ( RULE_STRING )
            // InternalCk2.g:3345:3: RULE_STRING
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
    // InternalCk2.g:3354:1: rule__IdProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3358:1: ( ( RULE_ID ) )
            // InternalCk2.g:3359:2: ( RULE_ID )
            {
            // InternalCk2.g:3359:2: ( RULE_ID )
            // InternalCk2.g:3360:3: RULE_ID
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
    // InternalCk2.g:3369:1: rule__IdProperty__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__IdProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3373:1: ( ( RULE_ID ) )
            // InternalCk2.g:3374:2: ( RULE_ID )
            {
            // InternalCk2.g:3374:2: ( RULE_ID )
            // InternalCk2.g:3375:3: RULE_ID
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
    // InternalCk2.g:3384:1: rule__CommandProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__CommandProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3388:1: ( ( RULE_ID ) )
            // InternalCk2.g:3389:2: ( RULE_ID )
            {
            // InternalCk2.g:3389:2: ( RULE_ID )
            // InternalCk2.g:3390:3: RULE_ID
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
    // InternalCk2.g:3399:1: rule__CommandProperty__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__CommandProperty__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3403:1: ( ( RULE_ID ) )
            // InternalCk2.g:3404:2: ( RULE_ID )
            {
            // InternalCk2.g:3404:2: ( RULE_ID )
            // InternalCk2.g:3405:3: RULE_ID
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
    // InternalCk2.g:3414:1: rule__BoolProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__BoolProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3418:1: ( ( RULE_ID ) )
            // InternalCk2.g:3419:2: ( RULE_ID )
            {
            // InternalCk2.g:3419:2: ( RULE_ID )
            // InternalCk2.g:3420:3: RULE_ID
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
    // InternalCk2.g:3429:1: rule__BoolProperty__ValueAssignment_2 : ( RULE_BOOL ) ;
    public final void rule__BoolProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3433:1: ( ( RULE_BOOL ) )
            // InternalCk2.g:3434:2: ( RULE_BOOL )
            {
            // InternalCk2.g:3434:2: ( RULE_BOOL )
            // InternalCk2.g:3435:3: RULE_BOOL
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
    // InternalCk2.g:3444:1: rule__DateProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__DateProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3448:1: ( ( RULE_ID ) )
            // InternalCk2.g:3449:2: ( RULE_ID )
            {
            // InternalCk2.g:3449:2: ( RULE_ID )
            // InternalCk2.g:3450:3: RULE_ID
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
    // InternalCk2.g:3459:1: rule__DateProperty__ValueAssignment_2 : ( ruleDate ) ;
    public final void rule__DateProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3463:1: ( ( ruleDate ) )
            // InternalCk2.g:3464:2: ( ruleDate )
            {
            // InternalCk2.g:3464:2: ( ruleDate )
            // InternalCk2.g:3465:3: ruleDate
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
    // InternalCk2.g:3474:1: rule__IntegerProperty__KeyAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3478:1: ( ( RULE_ID ) )
            // InternalCk2.g:3479:2: ( RULE_ID )
            {
            // InternalCk2.g:3479:2: ( RULE_ID )
            // InternalCk2.g:3480:3: RULE_ID
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
    // InternalCk2.g:3489:1: rule__IntegerProperty__ValueAssignment_0_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3493:1: ( ( ruleInteger ) )
            // InternalCk2.g:3494:2: ( ruleInteger )
            {
            // InternalCk2.g:3494:2: ( ruleInteger )
            // InternalCk2.g:3495:3: ruleInteger
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
    // InternalCk2.g:3504:1: rule__IntegerProperty__KeyAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3508:1: ( ( RULE_ID ) )
            // InternalCk2.g:3509:2: ( RULE_ID )
            {
            // InternalCk2.g:3509:2: ( RULE_ID )
            // InternalCk2.g:3510:3: RULE_ID
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
    // InternalCk2.g:3519:1: rule__IntegerProperty__ValueAssignment_1_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3523:1: ( ( ruleInteger ) )
            // InternalCk2.g:3524:2: ( ruleInteger )
            {
            // InternalCk2.g:3524:2: ( ruleInteger )
            // InternalCk2.g:3525:3: ruleInteger
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
    // InternalCk2.g:3534:1: rule__IntegerProperty__KeyAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3538:1: ( ( RULE_ID ) )
            // InternalCk2.g:3539:2: ( RULE_ID )
            {
            // InternalCk2.g:3539:2: ( RULE_ID )
            // InternalCk2.g:3540:3: RULE_ID
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
    // InternalCk2.g:3549:1: rule__IntegerProperty__ValueAssignment_2_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3553:1: ( ( ruleInteger ) )
            // InternalCk2.g:3554:2: ( ruleInteger )
            {
            // InternalCk2.g:3554:2: ( ruleInteger )
            // InternalCk2.g:3555:3: ruleInteger
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
    // InternalCk2.g:3564:1: rule__IntegerProperty__KeyAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3568:1: ( ( RULE_ID ) )
            // InternalCk2.g:3569:2: ( RULE_ID )
            {
            // InternalCk2.g:3569:2: ( RULE_ID )
            // InternalCk2.g:3570:3: RULE_ID
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
    // InternalCk2.g:3579:1: rule__IntegerProperty__ValueAssignment_3_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3583:1: ( ( ruleInteger ) )
            // InternalCk2.g:3584:2: ( ruleInteger )
            {
            // InternalCk2.g:3584:2: ( ruleInteger )
            // InternalCk2.g:3585:3: ruleInteger
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
    // InternalCk2.g:3594:1: rule__IntegerProperty__KeyAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3598:1: ( ( RULE_ID ) )
            // InternalCk2.g:3599:2: ( RULE_ID )
            {
            // InternalCk2.g:3599:2: ( RULE_ID )
            // InternalCk2.g:3600:3: RULE_ID
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
    // InternalCk2.g:3609:1: rule__IntegerProperty__ValueAssignment_4_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3613:1: ( ( ruleInteger ) )
            // InternalCk2.g:3614:2: ( ruleInteger )
            {
            // InternalCk2.g:3614:2: ( ruleInteger )
            // InternalCk2.g:3615:3: ruleInteger
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
    // InternalCk2.g:3624:1: rule__IntegerProperty__KeyAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__IntegerProperty__KeyAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3628:1: ( ( RULE_ID ) )
            // InternalCk2.g:3629:2: ( RULE_ID )
            {
            // InternalCk2.g:3629:2: ( RULE_ID )
            // InternalCk2.g:3630:3: RULE_ID
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
    // InternalCk2.g:3639:1: rule__IntegerProperty__ValueAssignment_5_2 : ( ruleInteger ) ;
    public final void rule__IntegerProperty__ValueAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3643:1: ( ( ruleInteger ) )
            // InternalCk2.g:3644:2: ( ruleInteger )
            {
            // InternalCk2.g:3644:2: ( ruleInteger )
            // InternalCk2.g:3645:3: ruleInteger
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
    // InternalCk2.g:3654:1: rule__DoubleProperty__KeyAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3658:1: ( ( RULE_ID ) )
            // InternalCk2.g:3659:2: ( RULE_ID )
            {
            // InternalCk2.g:3659:2: ( RULE_ID )
            // InternalCk2.g:3660:3: RULE_ID
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
    // InternalCk2.g:3669:1: rule__DoubleProperty__ValueAssignment_0_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3673:1: ( ( ruleDouble ) )
            // InternalCk2.g:3674:2: ( ruleDouble )
            {
            // InternalCk2.g:3674:2: ( ruleDouble )
            // InternalCk2.g:3675:3: ruleDouble
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
    // InternalCk2.g:3684:1: rule__DoubleProperty__KeyAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3688:1: ( ( RULE_ID ) )
            // InternalCk2.g:3689:2: ( RULE_ID )
            {
            // InternalCk2.g:3689:2: ( RULE_ID )
            // InternalCk2.g:3690:3: RULE_ID
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
    // InternalCk2.g:3699:1: rule__DoubleProperty__ValueAssignment_1_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3703:1: ( ( ruleDouble ) )
            // InternalCk2.g:3704:2: ( ruleDouble )
            {
            // InternalCk2.g:3704:2: ( ruleDouble )
            // InternalCk2.g:3705:3: ruleDouble
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
    // InternalCk2.g:3714:1: rule__DoubleProperty__KeyAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3718:1: ( ( RULE_ID ) )
            // InternalCk2.g:3719:2: ( RULE_ID )
            {
            // InternalCk2.g:3719:2: ( RULE_ID )
            // InternalCk2.g:3720:3: RULE_ID
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
    // InternalCk2.g:3729:1: rule__DoubleProperty__ValueAssignment_2_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3733:1: ( ( ruleDouble ) )
            // InternalCk2.g:3734:2: ( ruleDouble )
            {
            // InternalCk2.g:3734:2: ( ruleDouble )
            // InternalCk2.g:3735:3: ruleDouble
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
    // InternalCk2.g:3744:1: rule__DoubleProperty__KeyAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3748:1: ( ( RULE_ID ) )
            // InternalCk2.g:3749:2: ( RULE_ID )
            {
            // InternalCk2.g:3749:2: ( RULE_ID )
            // InternalCk2.g:3750:3: RULE_ID
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
    // InternalCk2.g:3759:1: rule__DoubleProperty__ValueAssignment_3_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3763:1: ( ( ruleDouble ) )
            // InternalCk2.g:3764:2: ( ruleDouble )
            {
            // InternalCk2.g:3764:2: ( ruleDouble )
            // InternalCk2.g:3765:3: ruleDouble
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
    // InternalCk2.g:3774:1: rule__DoubleProperty__KeyAssignment_4_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3778:1: ( ( RULE_ID ) )
            // InternalCk2.g:3779:2: ( RULE_ID )
            {
            // InternalCk2.g:3779:2: ( RULE_ID )
            // InternalCk2.g:3780:3: RULE_ID
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
    // InternalCk2.g:3789:1: rule__DoubleProperty__ValueAssignment_4_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3793:1: ( ( ruleDouble ) )
            // InternalCk2.g:3794:2: ( ruleDouble )
            {
            // InternalCk2.g:3794:2: ( ruleDouble )
            // InternalCk2.g:3795:3: ruleDouble
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
    // InternalCk2.g:3804:1: rule__DoubleProperty__KeyAssignment_5_0 : ( RULE_ID ) ;
    public final void rule__DoubleProperty__KeyAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3808:1: ( ( RULE_ID ) )
            // InternalCk2.g:3809:2: ( RULE_ID )
            {
            // InternalCk2.g:3809:2: ( RULE_ID )
            // InternalCk2.g:3810:3: RULE_ID
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
    // InternalCk2.g:3819:1: rule__DoubleProperty__ValueAssignment_5_2 : ( ruleDouble ) ;
    public final void rule__DoubleProperty__ValueAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3823:1: ( ( ruleDouble ) )
            // InternalCk2.g:3824:2: ( ruleDouble )
            {
            // InternalCk2.g:3824:2: ( ruleDouble )
            // InternalCk2.g:3825:3: ruleDouble
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
    // InternalCk2.g:3834:1: rule__HexadecimalProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__HexadecimalProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3838:1: ( ( RULE_ID ) )
            // InternalCk2.g:3839:2: ( RULE_ID )
            {
            // InternalCk2.g:3839:2: ( RULE_ID )
            // InternalCk2.g:3840:3: RULE_ID
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
    // InternalCk2.g:3849:1: rule__HexadecimalProperty__ValueAssignment_2 : ( RULE_HEX ) ;
    public final void rule__HexadecimalProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3853:1: ( ( RULE_HEX ) )
            // InternalCk2.g:3854:2: ( RULE_HEX )
            {
            // InternalCk2.g:3854:2: ( RULE_HEX )
            // InternalCk2.g:3855:3: RULE_HEX
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
    // InternalCk2.g:3864:1: rule__ListProperty__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3868:1: ( ( RULE_ID ) )
            // InternalCk2.g:3869:2: ( RULE_ID )
            {
            // InternalCk2.g:3869:2: ( RULE_ID )
            // InternalCk2.g:3870:3: RULE_ID
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
    // InternalCk2.g:3879:1: rule__ListProperty__ValueAssignment_2 : ( ruleList ) ;
    public final void rule__ListProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3883:1: ( ( ruleList ) )
            // InternalCk2.g:3884:2: ( ruleList )
            {
            // InternalCk2.g:3884:2: ( ruleList )
            // InternalCk2.g:3885:3: ruleList
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
    // InternalCk2.g:3894:1: rule__IdClauseProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__IdClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3898:1: ( ( RULE_ID ) )
            // InternalCk2.g:3899:2: ( RULE_ID )
            {
            // InternalCk2.g:3899:2: ( RULE_ID )
            // InternalCk2.g:3900:3: RULE_ID
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
    // InternalCk2.g:3909:1: rule__IdClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IdClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3913:1: ( ( ( '{' ) ) )
            // InternalCk2.g:3914:2: ( ( '{' ) )
            {
            // InternalCk2.g:3914:2: ( ( '{' ) )
            // InternalCk2.g:3915:3: ( '{' )
            {
             before(grammarAccess.getIdClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:3916:3: ( '{' )
            // InternalCk2.g:3917:4: '{'
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
    // InternalCk2.g:3928:1: rule__IdClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IdClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3932:1: ( ( ruleProperty ) )
            // InternalCk2.g:3933:2: ( ruleProperty )
            {
            // InternalCk2.g:3933:2: ( ruleProperty )
            // InternalCk2.g:3934:3: ruleProperty
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
    // InternalCk2.g:3943:1: rule__IntClauseProperty__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3947:1: ( ( RULE_INT ) )
            // InternalCk2.g:3948:2: ( RULE_INT )
            {
            // InternalCk2.g:3948:2: ( RULE_INT )
            // InternalCk2.g:3949:3: RULE_INT
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
    // InternalCk2.g:3958:1: rule__IntClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__IntClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3962:1: ( ( ( '{' ) ) )
            // InternalCk2.g:3963:2: ( ( '{' ) )
            {
            // InternalCk2.g:3963:2: ( ( '{' ) )
            // InternalCk2.g:3964:3: ( '{' )
            {
             before(grammarAccess.getIntClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:3965:3: ( '{' )
            // InternalCk2.g:3966:4: '{'
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
    // InternalCk2.g:3977:1: rule__IntClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__IntClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3981:1: ( ( ruleProperty ) )
            // InternalCk2.g:3982:2: ( ruleProperty )
            {
            // InternalCk2.g:3982:2: ( ruleProperty )
            // InternalCk2.g:3983:3: ruleProperty
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
    // InternalCk2.g:3992:1: rule__DateClauseProperty__NameAssignment_0 : ( ruleDate ) ;
    public final void rule__DateClauseProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:3996:1: ( ( ruleDate ) )
            // InternalCk2.g:3997:2: ( ruleDate )
            {
            // InternalCk2.g:3997:2: ( ruleDate )
            // InternalCk2.g:3998:3: ruleDate
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
    // InternalCk2.g:4007:1: rule__DateClauseProperty__ValueAssignment_2 : ( ( '{' ) ) ;
    public final void rule__DateClauseProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4011:1: ( ( ( '{' ) ) )
            // InternalCk2.g:4012:2: ( ( '{' ) )
            {
            // InternalCk2.g:4012:2: ( ( '{' ) )
            // InternalCk2.g:4013:3: ( '{' )
            {
             before(grammarAccess.getDateClausePropertyAccess().getValueLeftCurlyBracketKeyword_2_0()); 
            // InternalCk2.g:4014:3: ( '{' )
            // InternalCk2.g:4015:4: '{'
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
    // InternalCk2.g:4026:1: rule__DateClauseProperty__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__DateClauseProperty__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4030:1: ( ( ruleProperty ) )
            // InternalCk2.g:4031:2: ( ruleProperty )
            {
            // InternalCk2.g:4031:2: ( ruleProperty )
            // InternalCk2.g:4032:3: ruleProperty
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
    // InternalCk2.g:4041:1: rule__ProbabilityProperty__KeyAssignment_0 : ( RULE_INT ) ;
    public final void rule__ProbabilityProperty__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4045:1: ( ( RULE_INT ) )
            // InternalCk2.g:4046:2: ( RULE_INT )
            {
            // InternalCk2.g:4046:2: ( RULE_INT )
            // InternalCk2.g:4047:3: RULE_INT
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
    // InternalCk2.g:4056:1: rule__ProbabilityProperty__ValueAssignment_2 : ( ruleListElem ) ;
    public final void rule__ProbabilityProperty__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCk2.g:4060:1: ( ( ruleListElem ) )
            // InternalCk2.g:4061:2: ( ruleListElem )
            {
            // InternalCk2.g:4061:2: ( ruleListElem )
            // InternalCk2.g:4062:3: ruleListElem
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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\57\uffff";
    static final String dfa_2s = "\22\uffff\1\51\3\uffff\1\51\2\uffff\1\51\2\uffff\1\51\2\uffff\1\51\2\uffff\1\51\4\uffff\1\51\4\uffff\1\52\2\uffff";
    static final String dfa_3s = "\1\4\2\23\1\4\5\6\1\4\1\uffff\1\4\4\uffff\2\6\1\4\1\uffff\2\6\1\4\2\6\1\4\2\6\1\4\2\6\1\4\2\6\1\4\1\uffff\1\4\1\uffff\2\4\1\6\2\uffff\1\6\2\4\1\uffff";
    static final String dfa_4s = "\1\6\1\32\1\33\1\24\5\20\1\21\1\uffff\1\22\4\uffff\2\6\1\33\1\uffff\2\6\1\33\2\6\1\33\2\6\1\33\2\6\1\33\2\6\1\33\1\uffff\1\32\1\uffff\2\33\1\6\2\uffff\1\6\2\34\1\uffff";
    static final String dfa_5s = "\12\uffff\1\12\1\uffff\1\2\1\10\1\1\1\3\3\uffff\1\4\17\uffff\1\13\1\uffff\1\11\3\uffff\1\6\1\7\3\uffff\1\5";
    static final String dfa_6s = "\57\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2",
            "\1\3\2\uffff\1\4\1\6\1\10\1\5\1\7",
            "\1\11\7\uffff\1\12",
            "\1\14\1\16\1\22\1\23\1\15\6\uffff\1\20\1\21\1\13\2\uffff\1\17",
            "\1\26\10\uffff\1\24\1\25",
            "\1\31\10\uffff\1\27\1\30",
            "\1\34\10\uffff\1\32\1\33",
            "\1\37\10\uffff\1\35\1\36",
            "\1\42\10\uffff\1\40\1\41",
            "\3\43\10\uffff\2\43\1\12",
            "",
            "\1\44\1\45\1\46\10\uffff\2\45\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\47",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\50",
            "",
            "\1\26",
            "\1\26",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\52",
            "\1\31",
            "\1\31",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\52",
            "\1\34",
            "\1\34",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\52",
            "\1\37",
            "\1\37",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\52",
            "\1\42",
            "\1\42",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\52",
            "",
            "\3\45\10\uffff\2\45\1\uffff\1\45\1\12\2\uffff\5\12",
            "",
            "\3\45\10\uffff\2\45\1\uffff\1\45\1\12\7\uffff\1\53",
            "\1\51\1\uffff\1\51\13\uffff\1\51\10\uffff\1\52",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\52\1\uffff\1\52\13\uffff\1\52\10\uffff\1\56\1\52",
            "\3\45\10\uffff\2\45\1\uffff\1\45\10\uffff\1\12\1\45",
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
            return "617:1: rule__Property__Alternatives : ( ( ruleStringProperty ) | ( ruleIdProperty ) | ( ruleCommandProperty ) | ( ruleBoolProperty ) | ( ruleDateProperty ) | ( ruleIntegerProperty ) | ( ruleDoubleProperty ) | ( ruleHexadecimalProperty ) | ( ruleListProperty ) | ( ruleClause ) | ( ruleProbabilityProperty ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000052L});
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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}