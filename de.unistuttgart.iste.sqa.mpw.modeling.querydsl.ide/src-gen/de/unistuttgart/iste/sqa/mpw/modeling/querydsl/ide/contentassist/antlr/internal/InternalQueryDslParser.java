package de.unistuttgart.iste.sqa.mpw.modeling.querydsl.ide.contentassist.antlr.internal;

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
import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.services.QueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCUMENTATION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'>='", "'<='", "'>'", "'<'", "'true'", "'false'", "'()'", "'notEmpty'", "'isEmpty'", "'size'", "'EAST'", "'WEST'", "'SOUTH'", "'NORTH'", "'context'", "'::'", "'('", "')'", "'query'", "':'", "';'", "'precondition'", "'postcondition'", "','", "'invariant'", "'implies'", "'or'", "'and'", "'+'", "'-'", "'*'", "'/'", "'!'", "'old'", "'.'", "'->'", "'typeSelect('", "'at('", "'internal'", "'null'", "'self'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DOCUMENTATION=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQueryDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQueryDsl.g"; }


    	private QueryDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(QueryDslGrammarAccess grammarAccess) {
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
    // InternalQueryDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalQueryDsl.g:54:1: ( ruleModel EOF )
            // InternalQueryDsl.g:55:1: ruleModel EOF
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
    // InternalQueryDsl.g:62:1: ruleModel : ( ruleContext ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:66:2: ( ( ruleContext ) )
            // InternalQueryDsl.g:67:2: ( ruleContext )
            {
            // InternalQueryDsl.g:67:2: ( ruleContext )
            // InternalQueryDsl.g:68:3: ruleContext
            {
             before(grammarAccess.getModelAccess().getContextParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContextParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleContext"
    // InternalQueryDsl.g:78:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalQueryDsl.g:79:1: ( ruleContext EOF )
            // InternalQueryDsl.g:80:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalQueryDsl.g:87:1: ruleContext : ( ( rule__Context__Alternatives ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:91:2: ( ( ( rule__Context__Alternatives ) ) )
            // InternalQueryDsl.g:92:2: ( ( rule__Context__Alternatives ) )
            {
            // InternalQueryDsl.g:92:2: ( ( rule__Context__Alternatives ) )
            // InternalQueryDsl.g:93:3: ( rule__Context__Alternatives )
            {
             before(grammarAccess.getContextAccess().getAlternatives()); 
            // InternalQueryDsl.g:94:3: ( rule__Context__Alternatives )
            // InternalQueryDsl.g:94:4: rule__Context__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Context__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleClassContext"
    // InternalQueryDsl.g:103:1: entryRuleClassContext : ruleClassContext EOF ;
    public final void entryRuleClassContext() throws RecognitionException {
        try {
            // InternalQueryDsl.g:104:1: ( ruleClassContext EOF )
            // InternalQueryDsl.g:105:1: ruleClassContext EOF
            {
             before(grammarAccess.getClassContextRule()); 
            pushFollow(FOLLOW_1);
            ruleClassContext();

            state._fsp--;

             after(grammarAccess.getClassContextRule()); 
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
    // $ANTLR end "entryRuleClassContext"


    // $ANTLR start "ruleClassContext"
    // InternalQueryDsl.g:112:1: ruleClassContext : ( ( rule__ClassContext__Group__0 ) ) ;
    public final void ruleClassContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:116:2: ( ( ( rule__ClassContext__Group__0 ) ) )
            // InternalQueryDsl.g:117:2: ( ( rule__ClassContext__Group__0 ) )
            {
            // InternalQueryDsl.g:117:2: ( ( rule__ClassContext__Group__0 ) )
            // InternalQueryDsl.g:118:3: ( rule__ClassContext__Group__0 )
            {
             before(grammarAccess.getClassContextAccess().getGroup()); 
            // InternalQueryDsl.g:119:3: ( rule__ClassContext__Group__0 )
            // InternalQueryDsl.g:119:4: rule__ClassContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassContext"


    // $ANTLR start "entryRuleCommandContext"
    // InternalQueryDsl.g:128:1: entryRuleCommandContext : ruleCommandContext EOF ;
    public final void entryRuleCommandContext() throws RecognitionException {
        try {
            // InternalQueryDsl.g:129:1: ( ruleCommandContext EOF )
            // InternalQueryDsl.g:130:1: ruleCommandContext EOF
            {
             before(grammarAccess.getCommandContextRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandContext();

            state._fsp--;

             after(grammarAccess.getCommandContextRule()); 
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
    // $ANTLR end "entryRuleCommandContext"


    // $ANTLR start "ruleCommandContext"
    // InternalQueryDsl.g:137:1: ruleCommandContext : ( ( rule__CommandContext__Group__0 ) ) ;
    public final void ruleCommandContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:141:2: ( ( ( rule__CommandContext__Group__0 ) ) )
            // InternalQueryDsl.g:142:2: ( ( rule__CommandContext__Group__0 ) )
            {
            // InternalQueryDsl.g:142:2: ( ( rule__CommandContext__Group__0 ) )
            // InternalQueryDsl.g:143:3: ( rule__CommandContext__Group__0 )
            {
             before(grammarAccess.getCommandContextAccess().getGroup()); 
            // InternalQueryDsl.g:144:3: ( rule__CommandContext__Group__0 )
            // InternalQueryDsl.g:144:4: rule__CommandContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandContext"


    // $ANTLR start "entryRuleElement"
    // InternalQueryDsl.g:153:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalQueryDsl.g:154:1: ( ruleElement EOF )
            // InternalQueryDsl.g:155:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalQueryDsl.g:162:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:166:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalQueryDsl.g:167:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalQueryDsl.g:167:2: ( ( rule__Element__Alternatives ) )
            // InternalQueryDsl.g:168:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalQueryDsl.g:169:3: ( rule__Element__Alternatives )
            // InternalQueryDsl.g:169:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleQuery"
    // InternalQueryDsl.g:178:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalQueryDsl.g:179:1: ( ruleQuery EOF )
            // InternalQueryDsl.g:180:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalQueryDsl.g:187:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:191:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalQueryDsl.g:192:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalQueryDsl.g:192:2: ( ( rule__Query__Group__0 ) )
            // InternalQueryDsl.g:193:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalQueryDsl.g:194:3: ( rule__Query__Group__0 )
            // InternalQueryDsl.g:194:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleCommandConstraint"
    // InternalQueryDsl.g:203:1: entryRuleCommandConstraint : ruleCommandConstraint EOF ;
    public final void entryRuleCommandConstraint() throws RecognitionException {
        try {
            // InternalQueryDsl.g:204:1: ( ruleCommandConstraint EOF )
            // InternalQueryDsl.g:205:1: ruleCommandConstraint EOF
            {
             before(grammarAccess.getCommandConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandConstraint();

            state._fsp--;

             after(grammarAccess.getCommandConstraintRule()); 
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
    // $ANTLR end "entryRuleCommandConstraint"


    // $ANTLR start "ruleCommandConstraint"
    // InternalQueryDsl.g:212:1: ruleCommandConstraint : ( ( rule__CommandConstraint__Alternatives ) ) ;
    public final void ruleCommandConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:216:2: ( ( ( rule__CommandConstraint__Alternatives ) ) )
            // InternalQueryDsl.g:217:2: ( ( rule__CommandConstraint__Alternatives ) )
            {
            // InternalQueryDsl.g:217:2: ( ( rule__CommandConstraint__Alternatives ) )
            // InternalQueryDsl.g:218:3: ( rule__CommandConstraint__Alternatives )
            {
             before(grammarAccess.getCommandConstraintAccess().getAlternatives()); 
            // InternalQueryDsl.g:219:3: ( rule__CommandConstraint__Alternatives )
            // InternalQueryDsl.g:219:4: rule__CommandConstraint__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommandConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandConstraint"


    // $ANTLR start "entryRulePrecondition"
    // InternalQueryDsl.g:228:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalQueryDsl.g:229:1: ( rulePrecondition EOF )
            // InternalQueryDsl.g:230:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalQueryDsl.g:237:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:241:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalQueryDsl.g:242:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalQueryDsl.g:242:2: ( ( rule__Precondition__Group__0 ) )
            // InternalQueryDsl.g:243:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalQueryDsl.g:244:3: ( rule__Precondition__Group__0 )
            // InternalQueryDsl.g:244:4: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalQueryDsl.g:253:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalQueryDsl.g:254:1: ( rulePostcondition EOF )
            // InternalQueryDsl.g:255:1: rulePostcondition EOF
            {
             before(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getPostconditionRule()); 
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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalQueryDsl.g:262:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:266:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalQueryDsl.g:267:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalQueryDsl.g:267:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalQueryDsl.g:268:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalQueryDsl.g:269:3: ( rule__Postcondition__Group__0 )
            // InternalQueryDsl.g:269:4: rule__Postcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleParameterList"
    // InternalQueryDsl.g:278:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalQueryDsl.g:279:1: ( ruleParameterList EOF )
            // InternalQueryDsl.g:280:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalQueryDsl.g:287:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:291:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalQueryDsl.g:292:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalQueryDsl.g:292:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalQueryDsl.g:293:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalQueryDsl.g:294:3: ( rule__ParameterList__Group__0 )
            // InternalQueryDsl.g:294:4: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalQueryDsl.g:303:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalQueryDsl.g:304:1: ( ruleParameter EOF )
            // InternalQueryDsl.g:305:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalQueryDsl.g:312:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:316:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalQueryDsl.g:317:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalQueryDsl.g:317:2: ( ( rule__Parameter__Group__0 ) )
            // InternalQueryDsl.g:318:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalQueryDsl.g:319:3: ( rule__Parameter__Group__0 )
            // InternalQueryDsl.g:319:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInvariant"
    // InternalQueryDsl.g:328:1: entryRuleInvariant : ruleInvariant EOF ;
    public final void entryRuleInvariant() throws RecognitionException {
        try {
            // InternalQueryDsl.g:329:1: ( ruleInvariant EOF )
            // InternalQueryDsl.g:330:1: ruleInvariant EOF
            {
             before(grammarAccess.getInvariantRule()); 
            pushFollow(FOLLOW_1);
            ruleInvariant();

            state._fsp--;

             after(grammarAccess.getInvariantRule()); 
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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalQueryDsl.g:337:1: ruleInvariant : ( ( rule__Invariant__Group__0 ) ) ;
    public final void ruleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:341:2: ( ( ( rule__Invariant__Group__0 ) ) )
            // InternalQueryDsl.g:342:2: ( ( rule__Invariant__Group__0 ) )
            {
            // InternalQueryDsl.g:342:2: ( ( rule__Invariant__Group__0 ) )
            // InternalQueryDsl.g:343:3: ( rule__Invariant__Group__0 )
            {
             before(grammarAccess.getInvariantAccess().getGroup()); 
            // InternalQueryDsl.g:344:3: ( rule__Invariant__Group__0 )
            // InternalQueryDsl.g:344:4: rule__Invariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Invariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleExpression"
    // InternalQueryDsl.g:353:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:354:1: ( ruleExpression EOF )
            // InternalQueryDsl.g:355:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQueryDsl.g:362:1: ruleExpression : ( ruleImpliesExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:366:2: ( ( ruleImpliesExpression ) )
            // InternalQueryDsl.g:367:2: ( ruleImpliesExpression )
            {
            // InternalQueryDsl.g:367:2: ( ruleImpliesExpression )
            // InternalQueryDsl.g:368:3: ruleImpliesExpression
            {
             before(grammarAccess.getExpressionAccess().getImpliesExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getImpliesExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalQueryDsl.g:378:1: entryRuleImpliesExpression : ruleImpliesExpression EOF ;
    public final void entryRuleImpliesExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:379:1: ( ruleImpliesExpression EOF )
            // InternalQueryDsl.g:380:1: ruleImpliesExpression EOF
            {
             before(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleImpliesExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionRule()); 
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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalQueryDsl.g:387:1: ruleImpliesExpression : ( ( rule__ImpliesExpression__Group__0 ) ) ;
    public final void ruleImpliesExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:391:2: ( ( ( rule__ImpliesExpression__Group__0 ) ) )
            // InternalQueryDsl.g:392:2: ( ( rule__ImpliesExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:392:2: ( ( rule__ImpliesExpression__Group__0 ) )
            // InternalQueryDsl.g:393:3: ( rule__ImpliesExpression__Group__0 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:394:3: ( rule__ImpliesExpression__Group__0 )
            // InternalQueryDsl.g:394:4: rule__ImpliesExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalQueryDsl.g:403:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:404:1: ( ruleOrExpression EOF )
            // InternalQueryDsl.g:405:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalQueryDsl.g:412:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:416:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalQueryDsl.g:417:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:417:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalQueryDsl.g:418:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:419:3: ( rule__OrExpression__Group__0 )
            // InternalQueryDsl.g:419:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalQueryDsl.g:428:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:429:1: ( ruleAndExpression EOF )
            // InternalQueryDsl.g:430:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalQueryDsl.g:437:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:441:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalQueryDsl.g:442:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:442:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalQueryDsl.g:443:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:444:3: ( rule__AndExpression__Group__0 )
            // InternalQueryDsl.g:444:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalQueryDsl.g:453:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:454:1: ( ruleEqualityExpression EOF )
            // InternalQueryDsl.g:455:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalQueryDsl.g:462:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:466:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalQueryDsl.g:467:2: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:467:2: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalQueryDsl.g:468:3: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:469:3: ( rule__EqualityExpression__Group__0 )
            // InternalQueryDsl.g:469:4: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalQueryDsl.g:478:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:479:1: ( ruleComparisonExpression EOF )
            // InternalQueryDsl.g:480:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalQueryDsl.g:487:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:491:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalQueryDsl.g:492:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:492:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalQueryDsl.g:493:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:494:3: ( rule__ComparisonExpression__Group__0 )
            // InternalQueryDsl.g:494:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePlusOrMinusExpression"
    // InternalQueryDsl.g:503:1: entryRulePlusOrMinusExpression : rulePlusOrMinusExpression EOF ;
    public final void entryRulePlusOrMinusExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:504:1: ( rulePlusOrMinusExpression EOF )
            // InternalQueryDsl.g:505:1: rulePlusOrMinusExpression EOF
            {
             before(grammarAccess.getPlusOrMinusExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinusExpression();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusExpressionRule()); 
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
    // $ANTLR end "entryRulePlusOrMinusExpression"


    // $ANTLR start "rulePlusOrMinusExpression"
    // InternalQueryDsl.g:512:1: rulePlusOrMinusExpression : ( ( rule__PlusOrMinusExpression__Group__0 ) ) ;
    public final void rulePlusOrMinusExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:516:2: ( ( ( rule__PlusOrMinusExpression__Group__0 ) ) )
            // InternalQueryDsl.g:517:2: ( ( rule__PlusOrMinusExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:517:2: ( ( rule__PlusOrMinusExpression__Group__0 ) )
            // InternalQueryDsl.g:518:3: ( rule__PlusOrMinusExpression__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:519:3: ( rule__PlusOrMinusExpression__Group__0 )
            // InternalQueryDsl.g:519:4: rule__PlusOrMinusExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinusExpression"


    // $ANTLR start "entryRuleMultiplicationOrDivisionExpression"
    // InternalQueryDsl.g:528:1: entryRuleMultiplicationOrDivisionExpression : ruleMultiplicationOrDivisionExpression EOF ;
    public final void entryRuleMultiplicationOrDivisionExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:529:1: ( ruleMultiplicationOrDivisionExpression EOF )
            // InternalQueryDsl.g:530:1: ruleMultiplicationOrDivisionExpression EOF
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicationOrDivisionExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationOrDivisionExpressionRule()); 
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
    // $ANTLR end "entryRuleMultiplicationOrDivisionExpression"


    // $ANTLR start "ruleMultiplicationOrDivisionExpression"
    // InternalQueryDsl.g:537:1: ruleMultiplicationOrDivisionExpression : ( ( rule__MultiplicationOrDivisionExpression__Group__0 ) ) ;
    public final void ruleMultiplicationOrDivisionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:541:2: ( ( ( rule__MultiplicationOrDivisionExpression__Group__0 ) ) )
            // InternalQueryDsl.g:542:2: ( ( rule__MultiplicationOrDivisionExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:542:2: ( ( rule__MultiplicationOrDivisionExpression__Group__0 ) )
            // InternalQueryDsl.g:543:3: ( rule__MultiplicationOrDivisionExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:544:3: ( rule__MultiplicationOrDivisionExpression__Group__0 )
            // InternalQueryDsl.g:544:4: rule__MultiplicationOrDivisionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationOrDivisionExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalQueryDsl.g:553:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:554:1: ( rulePrimaryExpression EOF )
            // InternalQueryDsl.g:555:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalQueryDsl.g:562:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:566:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalQueryDsl.g:567:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalQueryDsl.g:567:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalQueryDsl.g:568:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalQueryDsl.g:569:3: ( rule__PrimaryExpression__Alternatives )
            // InternalQueryDsl.g:569:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalQueryDsl.g:578:1: entryRuleConstantExpression : ruleConstantExpression EOF ;
    public final void entryRuleConstantExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:579:1: ( ruleConstantExpression EOF )
            // InternalQueryDsl.g:580:1: ruleConstantExpression EOF
            {
             before(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.getConstantExpressionRule()); 
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
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalQueryDsl.g:587:1: ruleConstantExpression : ( ( rule__ConstantExpression__Alternatives ) ) ;
    public final void ruleConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:591:2: ( ( ( rule__ConstantExpression__Alternatives ) ) )
            // InternalQueryDsl.g:592:2: ( ( rule__ConstantExpression__Alternatives ) )
            {
            // InternalQueryDsl.g:592:2: ( ( rule__ConstantExpression__Alternatives ) )
            // InternalQueryDsl.g:593:3: ( rule__ConstantExpression__Alternatives )
            {
             before(grammarAccess.getConstantExpressionAccess().getAlternatives()); 
            // InternalQueryDsl.g:594:3: ( rule__ConstantExpression__Alternatives )
            // InternalQueryDsl.g:594:4: rule__ConstantExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleOldValueExpression"
    // InternalQueryDsl.g:603:1: entryRuleOldValueExpression : ruleOldValueExpression EOF ;
    public final void entryRuleOldValueExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:604:1: ( ruleOldValueExpression EOF )
            // InternalQueryDsl.g:605:1: ruleOldValueExpression EOF
            {
             before(grammarAccess.getOldValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOldValueExpression();

            state._fsp--;

             after(grammarAccess.getOldValueExpressionRule()); 
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
    // $ANTLR end "entryRuleOldValueExpression"


    // $ANTLR start "ruleOldValueExpression"
    // InternalQueryDsl.g:612:1: ruleOldValueExpression : ( ( rule__OldValueExpression__Group__0 ) ) ;
    public final void ruleOldValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:616:2: ( ( ( rule__OldValueExpression__Group__0 ) ) )
            // InternalQueryDsl.g:617:2: ( ( rule__OldValueExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:617:2: ( ( rule__OldValueExpression__Group__0 ) )
            // InternalQueryDsl.g:618:3: ( rule__OldValueExpression__Group__0 )
            {
             before(grammarAccess.getOldValueExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:619:3: ( rule__OldValueExpression__Group__0 )
            // InternalQueryDsl.g:619:4: rule__OldValueExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OldValueExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOldValueExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOldValueExpression"


    // $ANTLR start "entryRulePropertyPathExpression"
    // InternalQueryDsl.g:628:1: entryRulePropertyPathExpression : rulePropertyPathExpression EOF ;
    public final void entryRulePropertyPathExpression() throws RecognitionException {
        try {
            // InternalQueryDsl.g:629:1: ( rulePropertyPathExpression EOF )
            // InternalQueryDsl.g:630:1: rulePropertyPathExpression EOF
            {
             before(grammarAccess.getPropertyPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyPathExpression();

            state._fsp--;

             after(grammarAccess.getPropertyPathExpressionRule()); 
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
    // $ANTLR end "entryRulePropertyPathExpression"


    // $ANTLR start "rulePropertyPathExpression"
    // InternalQueryDsl.g:637:1: rulePropertyPathExpression : ( ( rule__PropertyPathExpression__Group__0 ) ) ;
    public final void rulePropertyPathExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:641:2: ( ( ( rule__PropertyPathExpression__Group__0 ) ) )
            // InternalQueryDsl.g:642:2: ( ( rule__PropertyPathExpression__Group__0 ) )
            {
            // InternalQueryDsl.g:642:2: ( ( rule__PropertyPathExpression__Group__0 ) )
            // InternalQueryDsl.g:643:3: ( rule__PropertyPathExpression__Group__0 )
            {
             before(grammarAccess.getPropertyPathExpressionAccess().getGroup()); 
            // InternalQueryDsl.g:644:3: ( rule__PropertyPathExpression__Group__0 )
            // InternalQueryDsl.g:644:4: rule__PropertyPathExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyPathExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyPathExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyPathExpression"


    // $ANTLR start "entryRuleStatement"
    // InternalQueryDsl.g:653:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalQueryDsl.g:654:1: ( ruleStatement EOF )
            // InternalQueryDsl.g:655:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalQueryDsl.g:662:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:666:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalQueryDsl.g:667:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalQueryDsl.g:667:2: ( ( rule__Statement__Alternatives ) )
            // InternalQueryDsl.g:668:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalQueryDsl.g:669:3: ( rule__Statement__Alternatives )
            // InternalQueryDsl.g:669:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNavigatedStatement"
    // InternalQueryDsl.g:678:1: entryRuleNavigatedStatement : ruleNavigatedStatement EOF ;
    public final void entryRuleNavigatedStatement() throws RecognitionException {
        try {
            // InternalQueryDsl.g:679:1: ( ruleNavigatedStatement EOF )
            // InternalQueryDsl.g:680:1: ruleNavigatedStatement EOF
            {
             before(grammarAccess.getNavigatedStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigatedStatement();

            state._fsp--;

             after(grammarAccess.getNavigatedStatementRule()); 
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
    // $ANTLR end "entryRuleNavigatedStatement"


    // $ANTLR start "ruleNavigatedStatement"
    // InternalQueryDsl.g:687:1: ruleNavigatedStatement : ( ( rule__NavigatedStatement__Alternatives ) ) ;
    public final void ruleNavigatedStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:691:2: ( ( ( rule__NavigatedStatement__Alternatives ) ) )
            // InternalQueryDsl.g:692:2: ( ( rule__NavigatedStatement__Alternatives ) )
            {
            // InternalQueryDsl.g:692:2: ( ( rule__NavigatedStatement__Alternatives ) )
            // InternalQueryDsl.g:693:3: ( rule__NavigatedStatement__Alternatives )
            {
             before(grammarAccess.getNavigatedStatementAccess().getAlternatives()); 
            // InternalQueryDsl.g:694:3: ( rule__NavigatedStatement__Alternatives )
            // InternalQueryDsl.g:694:4: rule__NavigatedStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNavigatedStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigatedStatement"


    // $ANTLR start "entryRuleMethodCall"
    // InternalQueryDsl.g:703:1: entryRuleMethodCall : ruleMethodCall EOF ;
    public final void entryRuleMethodCall() throws RecognitionException {
        try {
            // InternalQueryDsl.g:704:1: ( ruleMethodCall EOF )
            // InternalQueryDsl.g:705:1: ruleMethodCall EOF
            {
             before(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getMethodCallRule()); 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalQueryDsl.g:712:1: ruleMethodCall : ( ( rule__MethodCall__Group__0 ) ) ;
    public final void ruleMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:716:2: ( ( ( rule__MethodCall__Group__0 ) ) )
            // InternalQueryDsl.g:717:2: ( ( rule__MethodCall__Group__0 ) )
            {
            // InternalQueryDsl.g:717:2: ( ( rule__MethodCall__Group__0 ) )
            // InternalQueryDsl.g:718:3: ( rule__MethodCall__Group__0 )
            {
             before(grammarAccess.getMethodCallAccess().getGroup()); 
            // InternalQueryDsl.g:719:3: ( rule__MethodCall__Group__0 )
            // InternalQueryDsl.g:719:4: rule__MethodCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleCollectionMethod"
    // InternalQueryDsl.g:728:1: entryRuleCollectionMethod : ruleCollectionMethod EOF ;
    public final void entryRuleCollectionMethod() throws RecognitionException {
        try {
            // InternalQueryDsl.g:729:1: ( ruleCollectionMethod EOF )
            // InternalQueryDsl.g:730:1: ruleCollectionMethod EOF
            {
             before(grammarAccess.getCollectionMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionMethod();

            state._fsp--;

             after(grammarAccess.getCollectionMethodRule()); 
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
    // $ANTLR end "entryRuleCollectionMethod"


    // $ANTLR start "ruleCollectionMethod"
    // InternalQueryDsl.g:737:1: ruleCollectionMethod : ( ( rule__CollectionMethod__Alternatives ) ) ;
    public final void ruleCollectionMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:741:2: ( ( ( rule__CollectionMethod__Alternatives ) ) )
            // InternalQueryDsl.g:742:2: ( ( rule__CollectionMethod__Alternatives ) )
            {
            // InternalQueryDsl.g:742:2: ( ( rule__CollectionMethod__Alternatives ) )
            // InternalQueryDsl.g:743:3: ( rule__CollectionMethod__Alternatives )
            {
             before(grammarAccess.getCollectionMethodAccess().getAlternatives()); 
            // InternalQueryDsl.g:744:3: ( rule__CollectionMethod__Alternatives )
            // InternalQueryDsl.g:744:4: rule__CollectionMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CollectionMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCollectionMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollectionMethod"


    // $ANTLR start "entryRuleSimpleCollectionMethod"
    // InternalQueryDsl.g:753:1: entryRuleSimpleCollectionMethod : ruleSimpleCollectionMethod EOF ;
    public final void entryRuleSimpleCollectionMethod() throws RecognitionException {
        try {
            // InternalQueryDsl.g:754:1: ( ruleSimpleCollectionMethod EOF )
            // InternalQueryDsl.g:755:1: ruleSimpleCollectionMethod EOF
            {
             before(grammarAccess.getSimpleCollectionMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleCollectionMethod();

            state._fsp--;

             after(grammarAccess.getSimpleCollectionMethodRule()); 
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
    // $ANTLR end "entryRuleSimpleCollectionMethod"


    // $ANTLR start "ruleSimpleCollectionMethod"
    // InternalQueryDsl.g:762:1: ruleSimpleCollectionMethod : ( ( rule__SimpleCollectionMethod__Group__0 ) ) ;
    public final void ruleSimpleCollectionMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:766:2: ( ( ( rule__SimpleCollectionMethod__Group__0 ) ) )
            // InternalQueryDsl.g:767:2: ( ( rule__SimpleCollectionMethod__Group__0 ) )
            {
            // InternalQueryDsl.g:767:2: ( ( rule__SimpleCollectionMethod__Group__0 ) )
            // InternalQueryDsl.g:768:3: ( rule__SimpleCollectionMethod__Group__0 )
            {
             before(grammarAccess.getSimpleCollectionMethodAccess().getGroup()); 
            // InternalQueryDsl.g:769:3: ( rule__SimpleCollectionMethod__Group__0 )
            // InternalQueryDsl.g:769:4: rule__SimpleCollectionMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCollectionMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleCollectionMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleCollectionMethod"


    // $ANTLR start "entryRuleParametrizedCollectionMethod"
    // InternalQueryDsl.g:778:1: entryRuleParametrizedCollectionMethod : ruleParametrizedCollectionMethod EOF ;
    public final void entryRuleParametrizedCollectionMethod() throws RecognitionException {
        try {
            // InternalQueryDsl.g:779:1: ( ruleParametrizedCollectionMethod EOF )
            // InternalQueryDsl.g:780:1: ruleParametrizedCollectionMethod EOF
            {
             before(grammarAccess.getParametrizedCollectionMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleParametrizedCollectionMethod();

            state._fsp--;

             after(grammarAccess.getParametrizedCollectionMethodRule()); 
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
    // $ANTLR end "entryRuleParametrizedCollectionMethod"


    // $ANTLR start "ruleParametrizedCollectionMethod"
    // InternalQueryDsl.g:787:1: ruleParametrizedCollectionMethod : ( ( rule__ParametrizedCollectionMethod__Alternatives ) ) ;
    public final void ruleParametrizedCollectionMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:791:2: ( ( ( rule__ParametrizedCollectionMethod__Alternatives ) ) )
            // InternalQueryDsl.g:792:2: ( ( rule__ParametrizedCollectionMethod__Alternatives ) )
            {
            // InternalQueryDsl.g:792:2: ( ( rule__ParametrizedCollectionMethod__Alternatives ) )
            // InternalQueryDsl.g:793:3: ( rule__ParametrizedCollectionMethod__Alternatives )
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getAlternatives()); 
            // InternalQueryDsl.g:794:3: ( rule__ParametrizedCollectionMethod__Alternatives )
            // InternalQueryDsl.g:794:4: rule__ParametrizedCollectionMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParametrizedCollectionMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametrizedCollectionMethod"


    // $ANTLR start "entryRuleDirection"
    // InternalQueryDsl.g:803:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // InternalQueryDsl.g:804:1: ( ruleDirection EOF )
            // InternalQueryDsl.g:805:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalQueryDsl.g:812:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:816:2: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalQueryDsl.g:817:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalQueryDsl.g:817:2: ( ( rule__Direction__Alternatives ) )
            // InternalQueryDsl.g:818:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalQueryDsl.g:819:3: ( rule__Direction__Alternatives )
            // InternalQueryDsl.g:819:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Context__Alternatives"
    // InternalQueryDsl.g:827:1: rule__Context__Alternatives : ( ( ruleClassContext ) | ( ruleCommandContext ) );
    public final void rule__Context__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:831:1: ( ( ruleClassContext ) | ( ruleCommandContext ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==RULE_DOCUMENTATION||LA1_2==32||(LA1_2>=35 && LA1_2<=36)||LA1_2==38||LA1_2==52) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==29) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQueryDsl.g:832:2: ( ruleClassContext )
                    {
                    // InternalQueryDsl.g:832:2: ( ruleClassContext )
                    // InternalQueryDsl.g:833:3: ruleClassContext
                    {
                     before(grammarAccess.getContextAccess().getClassContextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClassContext();

                    state._fsp--;

                     after(grammarAccess.getContextAccess().getClassContextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:838:2: ( ruleCommandContext )
                    {
                    // InternalQueryDsl.g:838:2: ( ruleCommandContext )
                    // InternalQueryDsl.g:839:3: ruleCommandContext
                    {
                     before(grammarAccess.getContextAccess().getCommandContextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandContext();

                    state._fsp--;

                     after(grammarAccess.getContextAccess().getCommandContextParserRuleCall_1()); 

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
    // $ANTLR end "rule__Context__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalQueryDsl.g:848:1: rule__Element__Alternatives : ( ( ruleQuery ) | ( ruleCommandConstraint ) | ( ruleInvariant ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:852:1: ( ( ruleQuery ) | ( ruleCommandConstraint ) | ( ruleInvariant ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 32:
                case 52:
                    {
                    alt2=1;
                    }
                    break;
                case 35:
                case 36:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 32:
            case 52:
                {
                alt2=1;
                }
                break;
            case 35:
            case 36:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQueryDsl.g:853:2: ( ruleQuery )
                    {
                    // InternalQueryDsl.g:853:2: ( ruleQuery )
                    // InternalQueryDsl.g:854:3: ruleQuery
                    {
                     before(grammarAccess.getElementAccess().getQueryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getQueryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:859:2: ( ruleCommandConstraint )
                    {
                    // InternalQueryDsl.g:859:2: ( ruleCommandConstraint )
                    // InternalQueryDsl.g:860:3: ruleCommandConstraint
                    {
                     before(grammarAccess.getElementAccess().getCommandConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCommandConstraint();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getCommandConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:865:2: ( ruleInvariant )
                    {
                    // InternalQueryDsl.g:865:2: ( ruleInvariant )
                    // InternalQueryDsl.g:866:3: ruleInvariant
                    {
                     before(grammarAccess.getElementAccess().getInvariantParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInvariant();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInvariantParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__CommandConstraint__Alternatives"
    // InternalQueryDsl.g:875:1: rule__CommandConstraint__Alternatives : ( ( rulePrecondition ) | ( rulePostcondition ) );
    public final void rule__CommandConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:879:1: ( ( rulePrecondition ) | ( rulePostcondition ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==35) ) {
                    alt3=1;
                }
                else if ( (LA3_1==36) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalQueryDsl.g:880:2: ( rulePrecondition )
                    {
                    // InternalQueryDsl.g:880:2: ( rulePrecondition )
                    // InternalQueryDsl.g:881:3: rulePrecondition
                    {
                     before(grammarAccess.getCommandConstraintAccess().getPreconditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrecondition();

                    state._fsp--;

                     after(grammarAccess.getCommandConstraintAccess().getPreconditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:886:2: ( rulePostcondition )
                    {
                    // InternalQueryDsl.g:886:2: ( rulePostcondition )
                    // InternalQueryDsl.g:887:3: rulePostcondition
                    {
                     before(grammarAccess.getCommandConstraintAccess().getPostconditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePostcondition();

                    state._fsp--;

                     after(grammarAccess.getCommandConstraintAccess().getPostconditionParserRuleCall_1()); 

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
    // $ANTLR end "rule__CommandConstraint__Alternatives"


    // $ANTLR start "rule__EqualityExpression__OperationAlternatives_1_1_0"
    // InternalQueryDsl.g:896:1: rule__EqualityExpression__OperationAlternatives_1_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__EqualityExpression__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:900:1: ( ( '=' ) | ( '<>' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQueryDsl.g:901:2: ( '=' )
                    {
                    // InternalQueryDsl.g:901:2: ( '=' )
                    // InternalQueryDsl.g:902:3: '='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOperationEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEqualityExpressionAccess().getOperationEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:907:2: ( '<>' )
                    {
                    // InternalQueryDsl.g:907:2: ( '<>' )
                    // InternalQueryDsl.g:908:3: '<>'
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOperationLessThanSignGreaterThanSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEqualityExpressionAccess().getOperationLessThanSignGreaterThanSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__EqualityExpression__OperationAlternatives_1_1_0"


    // $ANTLR start "rule__ComparisonExpression__OpAlternatives_1_1_0"
    // InternalQueryDsl.g:917:1: rule__ComparisonExpression__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__ComparisonExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:921:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQueryDsl.g:922:2: ( '>=' )
                    {
                    // InternalQueryDsl.g:922:2: ( '>=' )
                    // InternalQueryDsl.g:923:3: '>='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:928:2: ( '<=' )
                    {
                    // InternalQueryDsl.g:928:2: ( '<=' )
                    // InternalQueryDsl.g:929:3: '<='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:934:2: ( '>' )
                    {
                    // InternalQueryDsl.g:934:2: ( '>' )
                    // InternalQueryDsl.g:935:3: '>'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:940:2: ( '<' )
                    {
                    // InternalQueryDsl.g:940:2: ( '<' )
                    // InternalQueryDsl.g:941:3: '<'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__ComparisonExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinusExpression__Alternatives_1_0"
    // InternalQueryDsl.g:950:1: rule__PlusOrMinusExpression__Alternatives_1_0 : ( ( ( rule__PlusOrMinusExpression__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinusExpression__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinusExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:954:1: ( ( ( rule__PlusOrMinusExpression__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinusExpression__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==42) ) {
                alt6=1;
            }
            else if ( (LA6_0==43) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQueryDsl.g:955:2: ( ( rule__PlusOrMinusExpression__Group_1_0_0__0 ) )
                    {
                    // InternalQueryDsl.g:955:2: ( ( rule__PlusOrMinusExpression__Group_1_0_0__0 ) )
                    // InternalQueryDsl.g:956:3: ( rule__PlusOrMinusExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusExpressionAccess().getGroup_1_0_0()); 
                    // InternalQueryDsl.g:957:3: ( rule__PlusOrMinusExpression__Group_1_0_0__0 )
                    // InternalQueryDsl.g:957:4: rule__PlusOrMinusExpression__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinusExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:961:2: ( ( rule__PlusOrMinusExpression__Group_1_0_1__0 ) )
                    {
                    // InternalQueryDsl.g:961:2: ( ( rule__PlusOrMinusExpression__Group_1_0_1__0 ) )
                    // InternalQueryDsl.g:962:3: ( rule__PlusOrMinusExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusExpressionAccess().getGroup_1_0_1()); 
                    // InternalQueryDsl.g:963:3: ( rule__PlusOrMinusExpression__Group_1_0_1__0 )
                    // InternalQueryDsl.g:963:4: rule__PlusOrMinusExpression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinusExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusExpressionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinusExpression__Alternatives_1_0"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Alternatives_1_0"
    // InternalQueryDsl.g:971:1: rule__MultiplicationOrDivisionExpression__Alternatives_1_0 : ( ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 ) ) | ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 ) ) );
    public final void rule__MultiplicationOrDivisionExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:975:1: ( ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 ) ) | ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==45) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQueryDsl.g:976:2: ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 ) )
                    {
                    // InternalQueryDsl.g:976:2: ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 ) )
                    // InternalQueryDsl.g:977:3: ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup_1_0_0()); 
                    // InternalQueryDsl.g:978:3: ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 )
                    // InternalQueryDsl.g:978:4: rule__MultiplicationOrDivisionExpression__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationOrDivisionExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:982:2: ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 ) )
                    {
                    // InternalQueryDsl.g:982:2: ( ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 ) )
                    // InternalQueryDsl.g:983:3: ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup_1_0_1()); 
                    // InternalQueryDsl.g:984:3: ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 )
                    // InternalQueryDsl.g:984:4: rule__MultiplicationOrDivisionExpression__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplicationOrDivisionExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalQueryDsl.g:992:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( rulePropertyPathExpression ) | ( ruleOldValueExpression ) | ( ruleConstantExpression ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:996:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( rulePropertyPathExpression ) | ( ruleOldValueExpression ) | ( ruleConstantExpression ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 46:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case 24:
            case 25:
            case 26:
            case 27:
            case 54:
                {
                alt8=3;
                }
                break;
            case 47:
                {
                alt8=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 18:
            case 19:
            case 53:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQueryDsl.g:997:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:997:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalQueryDsl.g:998:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalQueryDsl.g:999:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalQueryDsl.g:999:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1003:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:1003:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalQueryDsl.g:1004:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalQueryDsl.g:1005:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalQueryDsl.g:1005:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1009:2: ( rulePropertyPathExpression )
                    {
                    // InternalQueryDsl.g:1009:2: ( rulePropertyPathExpression )
                    // InternalQueryDsl.g:1010:3: rulePropertyPathExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getPropertyPathExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePropertyPathExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getPropertyPathExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1015:2: ( ruleOldValueExpression )
                    {
                    // InternalQueryDsl.g:1015:2: ( ruleOldValueExpression )
                    // InternalQueryDsl.g:1016:3: ruleOldValueExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getOldValueExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOldValueExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getOldValueExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1021:2: ( ruleConstantExpression )
                    {
                    // InternalQueryDsl.g:1021:2: ( ruleConstantExpression )
                    // InternalQueryDsl.g:1022:3: ruleConstantExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_4()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__ConstantExpression__Alternatives"
    // InternalQueryDsl.g:1031:1: rule__ConstantExpression__Alternatives : ( ( ( rule__ConstantExpression__Group_0__0 ) ) | ( ( rule__ConstantExpression__Group_1__0 ) ) | ( ( rule__ConstantExpression__Group_2__0 ) ) | ( ( rule__ConstantExpression__Group_3__0 ) ) );
    public final void rule__ConstantExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1035:1: ( ( ( rule__ConstantExpression__Group_0__0 ) ) | ( ( rule__ConstantExpression__Group_1__0 ) ) | ( ( rule__ConstantExpression__Group_2__0 ) ) | ( ( rule__ConstantExpression__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case 18:
            case 19:
                {
                alt9=3;
                }
                break;
            case 53:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQueryDsl.g:1036:2: ( ( rule__ConstantExpression__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:1036:2: ( ( rule__ConstantExpression__Group_0__0 ) )
                    // InternalQueryDsl.g:1037:3: ( rule__ConstantExpression__Group_0__0 )
                    {
                     before(grammarAccess.getConstantExpressionAccess().getGroup_0()); 
                    // InternalQueryDsl.g:1038:3: ( rule__ConstantExpression__Group_0__0 )
                    // InternalQueryDsl.g:1038:4: rule__ConstantExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1042:2: ( ( rule__ConstantExpression__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:1042:2: ( ( rule__ConstantExpression__Group_1__0 ) )
                    // InternalQueryDsl.g:1043:3: ( rule__ConstantExpression__Group_1__0 )
                    {
                     before(grammarAccess.getConstantExpressionAccess().getGroup_1()); 
                    // InternalQueryDsl.g:1044:3: ( rule__ConstantExpression__Group_1__0 )
                    // InternalQueryDsl.g:1044:4: rule__ConstantExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1048:2: ( ( rule__ConstantExpression__Group_2__0 ) )
                    {
                    // InternalQueryDsl.g:1048:2: ( ( rule__ConstantExpression__Group_2__0 ) )
                    // InternalQueryDsl.g:1049:3: ( rule__ConstantExpression__Group_2__0 )
                    {
                     before(grammarAccess.getConstantExpressionAccess().getGroup_2()); 
                    // InternalQueryDsl.g:1050:3: ( rule__ConstantExpression__Group_2__0 )
                    // InternalQueryDsl.g:1050:4: rule__ConstantExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1054:2: ( ( rule__ConstantExpression__Group_3__0 ) )
                    {
                    // InternalQueryDsl.g:1054:2: ( ( rule__ConstantExpression__Group_3__0 ) )
                    // InternalQueryDsl.g:1055:3: ( rule__ConstantExpression__Group_3__0 )
                    {
                     before(grammarAccess.getConstantExpressionAccess().getGroup_3()); 
                    // InternalQueryDsl.g:1056:3: ( rule__ConstantExpression__Group_3__0 )
                    // InternalQueryDsl.g:1056:4: rule__ConstantExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstantExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ConstantExpression__Alternatives"


    // $ANTLR start "rule__ConstantExpression__ValueAlternatives_2_1_0"
    // InternalQueryDsl.g:1064:1: rule__ConstantExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__ConstantExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1068:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryDsl.g:1069:2: ( 'true' )
                    {
                    // InternalQueryDsl.g:1069:2: ( 'true' )
                    // InternalQueryDsl.g:1070:3: 'true'
                    {
                     before(grammarAccess.getConstantExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getConstantExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1075:2: ( 'false' )
                    {
                    // InternalQueryDsl.g:1075:2: ( 'false' )
                    // InternalQueryDsl.g:1076:3: 'false'
                    {
                     before(grammarAccess.getConstantExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getConstantExpressionAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__ConstantExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalQueryDsl.g:1085:1: rule__Statement__Alternatives : ( ( ( rule__Statement__TargetAssignment_0 ) ) | ( ( rule__Statement__TargetAssignment_1 ) ) | ( ( rule__Statement__TargetAssignment_2 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1089:1: ( ( ( rule__Statement__TargetAssignment_0 ) ) | ( ( rule__Statement__TargetAssignment_1 ) ) | ( ( rule__Statement__TargetAssignment_2 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt11=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalQueryDsl.g:1090:2: ( ( rule__Statement__TargetAssignment_0 ) )
                    {
                    // InternalQueryDsl.g:1090:2: ( ( rule__Statement__TargetAssignment_0 ) )
                    // InternalQueryDsl.g:1091:3: ( rule__Statement__TargetAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getTargetAssignment_0()); 
                    // InternalQueryDsl.g:1092:3: ( rule__Statement__TargetAssignment_0 )
                    // InternalQueryDsl.g:1092:4: rule__Statement__TargetAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__TargetAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getTargetAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1096:2: ( ( rule__Statement__TargetAssignment_1 ) )
                    {
                    // InternalQueryDsl.g:1096:2: ( ( rule__Statement__TargetAssignment_1 ) )
                    // InternalQueryDsl.g:1097:3: ( rule__Statement__TargetAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getTargetAssignment_1()); 
                    // InternalQueryDsl.g:1098:3: ( rule__Statement__TargetAssignment_1 )
                    // InternalQueryDsl.g:1098:4: rule__Statement__TargetAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__TargetAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getTargetAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1102:2: ( ( rule__Statement__TargetAssignment_2 ) )
                    {
                    // InternalQueryDsl.g:1102:2: ( ( rule__Statement__TargetAssignment_2 ) )
                    // InternalQueryDsl.g:1103:3: ( rule__Statement__TargetAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getTargetAssignment_2()); 
                    // InternalQueryDsl.g:1104:3: ( rule__Statement__TargetAssignment_2 )
                    // InternalQueryDsl.g:1104:4: rule__Statement__TargetAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__TargetAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getTargetAssignment_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__NavigatedStatement__Alternatives"
    // InternalQueryDsl.g:1112:1: rule__NavigatedStatement__Alternatives : ( ( ( rule__NavigatedStatement__Group_0__0 ) ) | ( ( rule__NavigatedStatement__Group_1__0 ) ) | ( ( rule__NavigatedStatement__Group_2__0 ) ) );
    public final void rule__NavigatedStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1116:1: ( ( ( rule__NavigatedStatement__Group_0__0 ) ) | ( ( rule__NavigatedStatement__Group_1__0 ) ) | ( ( rule__NavigatedStatement__Group_2__0 ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==20||LA12_3==30) ) {
                        alt12=1;
                    }
                    else if ( (LA12_3==EOF||(LA12_3>=12 && LA12_3<=17)||LA12_3==31||LA12_3==34||(LA12_3>=39 && LA12_3<=45)||(LA12_3>=48 && LA12_3<=49)) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==49) ) {
                alt12=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalQueryDsl.g:1117:2: ( ( rule__NavigatedStatement__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:1117:2: ( ( rule__NavigatedStatement__Group_0__0 ) )
                    // InternalQueryDsl.g:1118:3: ( rule__NavigatedStatement__Group_0__0 )
                    {
                     before(grammarAccess.getNavigatedStatementAccess().getGroup_0()); 
                    // InternalQueryDsl.g:1119:3: ( rule__NavigatedStatement__Group_0__0 )
                    // InternalQueryDsl.g:1119:4: rule__NavigatedStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatedStatement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigatedStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1123:2: ( ( rule__NavigatedStatement__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:1123:2: ( ( rule__NavigatedStatement__Group_1__0 ) )
                    // InternalQueryDsl.g:1124:3: ( rule__NavigatedStatement__Group_1__0 )
                    {
                     before(grammarAccess.getNavigatedStatementAccess().getGroup_1()); 
                    // InternalQueryDsl.g:1125:3: ( rule__NavigatedStatement__Group_1__0 )
                    // InternalQueryDsl.g:1125:4: rule__NavigatedStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatedStatement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigatedStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1129:2: ( ( rule__NavigatedStatement__Group_2__0 ) )
                    {
                    // InternalQueryDsl.g:1129:2: ( ( rule__NavigatedStatement__Group_2__0 ) )
                    // InternalQueryDsl.g:1130:3: ( rule__NavigatedStatement__Group_2__0 )
                    {
                     before(grammarAccess.getNavigatedStatementAccess().getGroup_2()); 
                    // InternalQueryDsl.g:1131:3: ( rule__NavigatedStatement__Group_2__0 )
                    // InternalQueryDsl.g:1131:4: rule__NavigatedStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigatedStatement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigatedStatementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NavigatedStatement__Alternatives"


    // $ANTLR start "rule__MethodCall__Alternatives_1"
    // InternalQueryDsl.g:1139:1: rule__MethodCall__Alternatives_1 : ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( '()' ) );
    public final void rule__MethodCall__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1143:1: ( ( ( rule__MethodCall__Group_1_0__0 ) ) | ( '()' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalQueryDsl.g:1144:2: ( ( rule__MethodCall__Group_1_0__0 ) )
                    {
                    // InternalQueryDsl.g:1144:2: ( ( rule__MethodCall__Group_1_0__0 ) )
                    // InternalQueryDsl.g:1145:3: ( rule__MethodCall__Group_1_0__0 )
                    {
                     before(grammarAccess.getMethodCallAccess().getGroup_1_0()); 
                    // InternalQueryDsl.g:1146:3: ( rule__MethodCall__Group_1_0__0 )
                    // InternalQueryDsl.g:1146:4: rule__MethodCall__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodCall__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodCallAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1150:2: ( '()' )
                    {
                    // InternalQueryDsl.g:1150:2: ( '()' )
                    // InternalQueryDsl.g:1151:3: '()'
                    {
                     before(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__MethodCall__Alternatives_1"


    // $ANTLR start "rule__CollectionMethod__Alternatives"
    // InternalQueryDsl.g:1160:1: rule__CollectionMethod__Alternatives : ( ( ruleSimpleCollectionMethod ) | ( ruleParametrizedCollectionMethod ) );
    public final void rule__CollectionMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1164:1: ( ( ruleSimpleCollectionMethod ) | ( ruleParametrizedCollectionMethod ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=21 && LA14_0<=23)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=50 && LA14_0<=51)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalQueryDsl.g:1165:2: ( ruleSimpleCollectionMethod )
                    {
                    // InternalQueryDsl.g:1165:2: ( ruleSimpleCollectionMethod )
                    // InternalQueryDsl.g:1166:3: ruleSimpleCollectionMethod
                    {
                     before(grammarAccess.getCollectionMethodAccess().getSimpleCollectionMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleCollectionMethod();

                    state._fsp--;

                     after(grammarAccess.getCollectionMethodAccess().getSimpleCollectionMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1171:2: ( ruleParametrizedCollectionMethod )
                    {
                    // InternalQueryDsl.g:1171:2: ( ruleParametrizedCollectionMethod )
                    // InternalQueryDsl.g:1172:3: ruleParametrizedCollectionMethod
                    {
                     before(grammarAccess.getCollectionMethodAccess().getParametrizedCollectionMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParametrizedCollectionMethod();

                    state._fsp--;

                     after(grammarAccess.getCollectionMethodAccess().getParametrizedCollectionMethodParserRuleCall_1()); 

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
    // $ANTLR end "rule__CollectionMethod__Alternatives"


    // $ANTLR start "rule__SimpleCollectionMethod__MethodAlternatives_0_0"
    // InternalQueryDsl.g:1181:1: rule__SimpleCollectionMethod__MethodAlternatives_0_0 : ( ( 'notEmpty' ) | ( 'isEmpty' ) | ( 'size' ) );
    public final void rule__SimpleCollectionMethod__MethodAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1185:1: ( ( 'notEmpty' ) | ( 'isEmpty' ) | ( 'size' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalQueryDsl.g:1186:2: ( 'notEmpty' )
                    {
                    // InternalQueryDsl.g:1186:2: ( 'notEmpty' )
                    // InternalQueryDsl.g:1187:3: 'notEmpty'
                    {
                     before(grammarAccess.getSimpleCollectionMethodAccess().getMethodNotEmptyKeyword_0_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSimpleCollectionMethodAccess().getMethodNotEmptyKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1192:2: ( 'isEmpty' )
                    {
                    // InternalQueryDsl.g:1192:2: ( 'isEmpty' )
                    // InternalQueryDsl.g:1193:3: 'isEmpty'
                    {
                     before(grammarAccess.getSimpleCollectionMethodAccess().getMethodIsEmptyKeyword_0_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSimpleCollectionMethodAccess().getMethodIsEmptyKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1198:2: ( 'size' )
                    {
                    // InternalQueryDsl.g:1198:2: ( 'size' )
                    // InternalQueryDsl.g:1199:3: 'size'
                    {
                     before(grammarAccess.getSimpleCollectionMethodAccess().getMethodSizeKeyword_0_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSimpleCollectionMethodAccess().getMethodSizeKeyword_0_0_2()); 

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
    // $ANTLR end "rule__SimpleCollectionMethod__MethodAlternatives_0_0"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Alternatives"
    // InternalQueryDsl.g:1208:1: rule__ParametrizedCollectionMethod__Alternatives : ( ( ( rule__ParametrizedCollectionMethod__Group_0__0 ) ) | ( ( rule__ParametrizedCollectionMethod__Group_1__0 ) ) );
    public final void rule__ParametrizedCollectionMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1212:1: ( ( ( rule__ParametrizedCollectionMethod__Group_0__0 ) ) | ( ( rule__ParametrizedCollectionMethod__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            else if ( (LA16_0==51) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryDsl.g:1213:2: ( ( rule__ParametrizedCollectionMethod__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:1213:2: ( ( rule__ParametrizedCollectionMethod__Group_0__0 ) )
                    // InternalQueryDsl.g:1214:3: ( rule__ParametrizedCollectionMethod__Group_0__0 )
                    {
                     before(grammarAccess.getParametrizedCollectionMethodAccess().getGroup_0()); 
                    // InternalQueryDsl.g:1215:3: ( rule__ParametrizedCollectionMethod__Group_0__0 )
                    // InternalQueryDsl.g:1215:4: rule__ParametrizedCollectionMethod__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParametrizedCollectionMethod__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParametrizedCollectionMethodAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1219:2: ( ( rule__ParametrizedCollectionMethod__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:1219:2: ( ( rule__ParametrizedCollectionMethod__Group_1__0 ) )
                    // InternalQueryDsl.g:1220:3: ( rule__ParametrizedCollectionMethod__Group_1__0 )
                    {
                     before(grammarAccess.getParametrizedCollectionMethodAccess().getGroup_1()); 
                    // InternalQueryDsl.g:1221:3: ( rule__ParametrizedCollectionMethod__Group_1__0 )
                    // InternalQueryDsl.g:1221:4: rule__ParametrizedCollectionMethod__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParametrizedCollectionMethod__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParametrizedCollectionMethodAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ParametrizedCollectionMethod__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalQueryDsl.g:1229:1: rule__Direction__Alternatives : ( ( 'EAST' ) | ( 'WEST' ) | ( 'SOUTH' ) | ( 'NORTH' ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1233:1: ( ( 'EAST' ) | ( 'WEST' ) | ( 'SOUTH' ) | ( 'NORTH' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt17=1;
                }
                break;
            case 25:
                {
                alt17=2;
                }
                break;
            case 26:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalQueryDsl.g:1234:2: ( 'EAST' )
                    {
                    // InternalQueryDsl.g:1234:2: ( 'EAST' )
                    // InternalQueryDsl.g:1235:3: 'EAST'
                    {
                     before(grammarAccess.getDirectionAccess().getEASTKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getDirectionAccess().getEASTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1240:2: ( 'WEST' )
                    {
                    // InternalQueryDsl.g:1240:2: ( 'WEST' )
                    // InternalQueryDsl.g:1241:3: 'WEST'
                    {
                     before(grammarAccess.getDirectionAccess().getWESTKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDirectionAccess().getWESTKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1246:2: ( 'SOUTH' )
                    {
                    // InternalQueryDsl.g:1246:2: ( 'SOUTH' )
                    // InternalQueryDsl.g:1247:3: 'SOUTH'
                    {
                     before(grammarAccess.getDirectionAccess().getSOUTHKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getDirectionAccess().getSOUTHKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1252:2: ( 'NORTH' )
                    {
                    // InternalQueryDsl.g:1252:2: ( 'NORTH' )
                    // InternalQueryDsl.g:1253:3: 'NORTH'
                    {
                     before(grammarAccess.getDirectionAccess().getNORTHKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getDirectionAccess().getNORTHKeyword_3()); 

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__ClassContext__Group__0"
    // InternalQueryDsl.g:1262:1: rule__ClassContext__Group__0 : rule__ClassContext__Group__0__Impl rule__ClassContext__Group__1 ;
    public final void rule__ClassContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1266:1: ( rule__ClassContext__Group__0__Impl rule__ClassContext__Group__1 )
            // InternalQueryDsl.g:1267:2: rule__ClassContext__Group__0__Impl rule__ClassContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__Group__0"


    // $ANTLR start "rule__ClassContext__Group__0__Impl"
    // InternalQueryDsl.g:1274:1: rule__ClassContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__ClassContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1278:1: ( ( 'context' ) )
            // InternalQueryDsl.g:1279:1: ( 'context' )
            {
            // InternalQueryDsl.g:1279:1: ( 'context' )
            // InternalQueryDsl.g:1280:2: 'context'
            {
             before(grammarAccess.getClassContextAccess().getContextKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClassContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__Group__0__Impl"


    // $ANTLR start "rule__ClassContext__Group__1"
    // InternalQueryDsl.g:1289:1: rule__ClassContext__Group__1 : rule__ClassContext__Group__1__Impl rule__ClassContext__Group__2 ;
    public final void rule__ClassContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1293:1: ( rule__ClassContext__Group__1__Impl rule__ClassContext__Group__2 )
            // InternalQueryDsl.g:1294:2: rule__ClassContext__Group__1__Impl rule__ClassContext__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ClassContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__Group__1"


    // $ANTLR start "rule__ClassContext__Group__1__Impl"
    // InternalQueryDsl.g:1301:1: rule__ClassContext__Group__1__Impl : ( ( rule__ClassContext__ClassNameAssignment_1 ) ) ;
    public final void rule__ClassContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1305:1: ( ( ( rule__ClassContext__ClassNameAssignment_1 ) ) )
            // InternalQueryDsl.g:1306:1: ( ( rule__ClassContext__ClassNameAssignment_1 ) )
            {
            // InternalQueryDsl.g:1306:1: ( ( rule__ClassContext__ClassNameAssignment_1 ) )
            // InternalQueryDsl.g:1307:2: ( rule__ClassContext__ClassNameAssignment_1 )
            {
             before(grammarAccess.getClassContextAccess().getClassNameAssignment_1()); 
            // InternalQueryDsl.g:1308:2: ( rule__ClassContext__ClassNameAssignment_1 )
            // InternalQueryDsl.g:1308:3: rule__ClassContext__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassContext__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassContextAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__Group__1__Impl"


    // $ANTLR start "rule__ClassContext__Group__2"
    // InternalQueryDsl.g:1316:1: rule__ClassContext__Group__2 : rule__ClassContext__Group__2__Impl ;
    public final void rule__ClassContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1320:1: ( rule__ClassContext__Group__2__Impl )
            // InternalQueryDsl.g:1321:2: rule__ClassContext__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassContext__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__Group__2"


    // $ANTLR start "rule__ClassContext__Group__2__Impl"
    // InternalQueryDsl.g:1327:1: rule__ClassContext__Group__2__Impl : ( ( ( rule__ClassContext__ElementsAssignment_2 ) ) ( ( rule__ClassContext__ElementsAssignment_2 )* ) ) ;
    public final void rule__ClassContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1331:1: ( ( ( ( rule__ClassContext__ElementsAssignment_2 ) ) ( ( rule__ClassContext__ElementsAssignment_2 )* ) ) )
            // InternalQueryDsl.g:1332:1: ( ( ( rule__ClassContext__ElementsAssignment_2 ) ) ( ( rule__ClassContext__ElementsAssignment_2 )* ) )
            {
            // InternalQueryDsl.g:1332:1: ( ( ( rule__ClassContext__ElementsAssignment_2 ) ) ( ( rule__ClassContext__ElementsAssignment_2 )* ) )
            // InternalQueryDsl.g:1333:2: ( ( rule__ClassContext__ElementsAssignment_2 ) ) ( ( rule__ClassContext__ElementsAssignment_2 )* )
            {
            // InternalQueryDsl.g:1333:2: ( ( rule__ClassContext__ElementsAssignment_2 ) )
            // InternalQueryDsl.g:1334:3: ( rule__ClassContext__ElementsAssignment_2 )
            {
             before(grammarAccess.getClassContextAccess().getElementsAssignment_2()); 
            // InternalQueryDsl.g:1335:3: ( rule__ClassContext__ElementsAssignment_2 )
            // InternalQueryDsl.g:1335:4: rule__ClassContext__ElementsAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__ClassContext__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassContextAccess().getElementsAssignment_2()); 

            }

            // InternalQueryDsl.g:1338:2: ( ( rule__ClassContext__ElementsAssignment_2 )* )
            // InternalQueryDsl.g:1339:3: ( rule__ClassContext__ElementsAssignment_2 )*
            {
             before(grammarAccess.getClassContextAccess().getElementsAssignment_2()); 
            // InternalQueryDsl.g:1340:3: ( rule__ClassContext__ElementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOCUMENTATION||LA18_0==32||(LA18_0>=35 && LA18_0<=36)||LA18_0==38||LA18_0==52) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQueryDsl.g:1340:4: rule__ClassContext__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ClassContext__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getClassContextAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__ClassContext__Group__2__Impl"


    // $ANTLR start "rule__CommandContext__Group__0"
    // InternalQueryDsl.g:1350:1: rule__CommandContext__Group__0 : rule__CommandContext__Group__0__Impl rule__CommandContext__Group__1 ;
    public final void rule__CommandContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1354:1: ( rule__CommandContext__Group__0__Impl rule__CommandContext__Group__1 )
            // InternalQueryDsl.g:1355:2: rule__CommandContext__Group__0__Impl rule__CommandContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__0"


    // $ANTLR start "rule__CommandContext__Group__0__Impl"
    // InternalQueryDsl.g:1362:1: rule__CommandContext__Group__0__Impl : ( 'context' ) ;
    public final void rule__CommandContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1366:1: ( ( 'context' ) )
            // InternalQueryDsl.g:1367:1: ( 'context' )
            {
            // InternalQueryDsl.g:1367:1: ( 'context' )
            // InternalQueryDsl.g:1368:2: 'context'
            {
             before(grammarAccess.getCommandContextAccess().getContextKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCommandContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__0__Impl"


    // $ANTLR start "rule__CommandContext__Group__1"
    // InternalQueryDsl.g:1377:1: rule__CommandContext__Group__1 : rule__CommandContext__Group__1__Impl rule__CommandContext__Group__2 ;
    public final void rule__CommandContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1381:1: ( rule__CommandContext__Group__1__Impl rule__CommandContext__Group__2 )
            // InternalQueryDsl.g:1382:2: rule__CommandContext__Group__1__Impl rule__CommandContext__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CommandContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__1"


    // $ANTLR start "rule__CommandContext__Group__1__Impl"
    // InternalQueryDsl.g:1389:1: rule__CommandContext__Group__1__Impl : ( ( rule__CommandContext__ClassNameAssignment_1 ) ) ;
    public final void rule__CommandContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1393:1: ( ( ( rule__CommandContext__ClassNameAssignment_1 ) ) )
            // InternalQueryDsl.g:1394:1: ( ( rule__CommandContext__ClassNameAssignment_1 ) )
            {
            // InternalQueryDsl.g:1394:1: ( ( rule__CommandContext__ClassNameAssignment_1 ) )
            // InternalQueryDsl.g:1395:2: ( rule__CommandContext__ClassNameAssignment_1 )
            {
             before(grammarAccess.getCommandContextAccess().getClassNameAssignment_1()); 
            // InternalQueryDsl.g:1396:2: ( rule__CommandContext__ClassNameAssignment_1 )
            // InternalQueryDsl.g:1396:3: rule__CommandContext__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandContext__ClassNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandContextAccess().getClassNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__1__Impl"


    // $ANTLR start "rule__CommandContext__Group__2"
    // InternalQueryDsl.g:1404:1: rule__CommandContext__Group__2 : rule__CommandContext__Group__2__Impl rule__CommandContext__Group__3 ;
    public final void rule__CommandContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1408:1: ( rule__CommandContext__Group__2__Impl rule__CommandContext__Group__3 )
            // InternalQueryDsl.g:1409:2: rule__CommandContext__Group__2__Impl rule__CommandContext__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CommandContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__2"


    // $ANTLR start "rule__CommandContext__Group__2__Impl"
    // InternalQueryDsl.g:1416:1: rule__CommandContext__Group__2__Impl : ( '::' ) ;
    public final void rule__CommandContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1420:1: ( ( '::' ) )
            // InternalQueryDsl.g:1421:1: ( '::' )
            {
            // InternalQueryDsl.g:1421:1: ( '::' )
            // InternalQueryDsl.g:1422:2: '::'
            {
             before(grammarAccess.getCommandContextAccess().getColonColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCommandContextAccess().getColonColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__2__Impl"


    // $ANTLR start "rule__CommandContext__Group__3"
    // InternalQueryDsl.g:1431:1: rule__CommandContext__Group__3 : rule__CommandContext__Group__3__Impl rule__CommandContext__Group__4 ;
    public final void rule__CommandContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1435:1: ( rule__CommandContext__Group__3__Impl rule__CommandContext__Group__4 )
            // InternalQueryDsl.g:1436:2: rule__CommandContext__Group__3__Impl rule__CommandContext__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__CommandContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__3"


    // $ANTLR start "rule__CommandContext__Group__3__Impl"
    // InternalQueryDsl.g:1443:1: rule__CommandContext__Group__3__Impl : ( ( rule__CommandContext__CommandNameAssignment_3 ) ) ;
    public final void rule__CommandContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1447:1: ( ( ( rule__CommandContext__CommandNameAssignment_3 ) ) )
            // InternalQueryDsl.g:1448:1: ( ( rule__CommandContext__CommandNameAssignment_3 ) )
            {
            // InternalQueryDsl.g:1448:1: ( ( rule__CommandContext__CommandNameAssignment_3 ) )
            // InternalQueryDsl.g:1449:2: ( rule__CommandContext__CommandNameAssignment_3 )
            {
             before(grammarAccess.getCommandContextAccess().getCommandNameAssignment_3()); 
            // InternalQueryDsl.g:1450:2: ( rule__CommandContext__CommandNameAssignment_3 )
            // InternalQueryDsl.g:1450:3: rule__CommandContext__CommandNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommandContext__CommandNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommandContextAccess().getCommandNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__3__Impl"


    // $ANTLR start "rule__CommandContext__Group__4"
    // InternalQueryDsl.g:1458:1: rule__CommandContext__Group__4 : rule__CommandContext__Group__4__Impl rule__CommandContext__Group__5 ;
    public final void rule__CommandContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1462:1: ( rule__CommandContext__Group__4__Impl rule__CommandContext__Group__5 )
            // InternalQueryDsl.g:1463:2: rule__CommandContext__Group__4__Impl rule__CommandContext__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__CommandContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__4"


    // $ANTLR start "rule__CommandContext__Group__4__Impl"
    // InternalQueryDsl.g:1470:1: rule__CommandContext__Group__4__Impl : ( ( rule__CommandContext__Group_4__0 )? ) ;
    public final void rule__CommandContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1474:1: ( ( ( rule__CommandContext__Group_4__0 )? ) )
            // InternalQueryDsl.g:1475:1: ( ( rule__CommandContext__Group_4__0 )? )
            {
            // InternalQueryDsl.g:1475:1: ( ( rule__CommandContext__Group_4__0 )? )
            // InternalQueryDsl.g:1476:2: ( rule__CommandContext__Group_4__0 )?
            {
             before(grammarAccess.getCommandContextAccess().getGroup_4()); 
            // InternalQueryDsl.g:1477:2: ( rule__CommandContext__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQueryDsl.g:1477:3: rule__CommandContext__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommandContext__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandContextAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__4__Impl"


    // $ANTLR start "rule__CommandContext__Group__5"
    // InternalQueryDsl.g:1485:1: rule__CommandContext__Group__5 : rule__CommandContext__Group__5__Impl ;
    public final void rule__CommandContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1489:1: ( rule__CommandContext__Group__5__Impl )
            // InternalQueryDsl.g:1490:2: rule__CommandContext__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandContext__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group__5"


    // $ANTLR start "rule__CommandContext__Group__5__Impl"
    // InternalQueryDsl.g:1496:1: rule__CommandContext__Group__5__Impl : ( ( ( rule__CommandContext__ElementsAssignment_5 ) ) ( ( rule__CommandContext__ElementsAssignment_5 )* ) ) ;
    public final void rule__CommandContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1500:1: ( ( ( ( rule__CommandContext__ElementsAssignment_5 ) ) ( ( rule__CommandContext__ElementsAssignment_5 )* ) ) )
            // InternalQueryDsl.g:1501:1: ( ( ( rule__CommandContext__ElementsAssignment_5 ) ) ( ( rule__CommandContext__ElementsAssignment_5 )* ) )
            {
            // InternalQueryDsl.g:1501:1: ( ( ( rule__CommandContext__ElementsAssignment_5 ) ) ( ( rule__CommandContext__ElementsAssignment_5 )* ) )
            // InternalQueryDsl.g:1502:2: ( ( rule__CommandContext__ElementsAssignment_5 ) ) ( ( rule__CommandContext__ElementsAssignment_5 )* )
            {
            // InternalQueryDsl.g:1502:2: ( ( rule__CommandContext__ElementsAssignment_5 ) )
            // InternalQueryDsl.g:1503:3: ( rule__CommandContext__ElementsAssignment_5 )
            {
             before(grammarAccess.getCommandContextAccess().getElementsAssignment_5()); 
            // InternalQueryDsl.g:1504:3: ( rule__CommandContext__ElementsAssignment_5 )
            // InternalQueryDsl.g:1504:4: rule__CommandContext__ElementsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__CommandContext__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCommandContextAccess().getElementsAssignment_5()); 

            }

            // InternalQueryDsl.g:1507:2: ( ( rule__CommandContext__ElementsAssignment_5 )* )
            // InternalQueryDsl.g:1508:3: ( rule__CommandContext__ElementsAssignment_5 )*
            {
             before(grammarAccess.getCommandContextAccess().getElementsAssignment_5()); 
            // InternalQueryDsl.g:1509:3: ( rule__CommandContext__ElementsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DOCUMENTATION||LA20_0==32||(LA20_0>=35 && LA20_0<=36)||LA20_0==38||LA20_0==52) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQueryDsl.g:1509:4: rule__CommandContext__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CommandContext__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCommandContextAccess().getElementsAssignment_5()); 

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
    // $ANTLR end "rule__CommandContext__Group__5__Impl"


    // $ANTLR start "rule__CommandContext__Group_4__0"
    // InternalQueryDsl.g:1519:1: rule__CommandContext__Group_4__0 : rule__CommandContext__Group_4__0__Impl rule__CommandContext__Group_4__1 ;
    public final void rule__CommandContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1523:1: ( rule__CommandContext__Group_4__0__Impl rule__CommandContext__Group_4__1 )
            // InternalQueryDsl.g:1524:2: rule__CommandContext__Group_4__0__Impl rule__CommandContext__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__CommandContext__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group_4__0"


    // $ANTLR start "rule__CommandContext__Group_4__0__Impl"
    // InternalQueryDsl.g:1531:1: rule__CommandContext__Group_4__0__Impl : ( '(' ) ;
    public final void rule__CommandContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1535:1: ( ( '(' ) )
            // InternalQueryDsl.g:1536:1: ( '(' )
            {
            // InternalQueryDsl.g:1536:1: ( '(' )
            // InternalQueryDsl.g:1537:2: '('
            {
             before(grammarAccess.getCommandContextAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommandContextAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group_4__0__Impl"


    // $ANTLR start "rule__CommandContext__Group_4__1"
    // InternalQueryDsl.g:1546:1: rule__CommandContext__Group_4__1 : rule__CommandContext__Group_4__1__Impl rule__CommandContext__Group_4__2 ;
    public final void rule__CommandContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1550:1: ( rule__CommandContext__Group_4__1__Impl rule__CommandContext__Group_4__2 )
            // InternalQueryDsl.g:1551:2: rule__CommandContext__Group_4__1__Impl rule__CommandContext__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__CommandContext__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommandContext__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group_4__1"


    // $ANTLR start "rule__CommandContext__Group_4__1__Impl"
    // InternalQueryDsl.g:1558:1: rule__CommandContext__Group_4__1__Impl : ( ( rule__CommandContext__ParameterListAssignment_4_1 ) ) ;
    public final void rule__CommandContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1562:1: ( ( ( rule__CommandContext__ParameterListAssignment_4_1 ) ) )
            // InternalQueryDsl.g:1563:1: ( ( rule__CommandContext__ParameterListAssignment_4_1 ) )
            {
            // InternalQueryDsl.g:1563:1: ( ( rule__CommandContext__ParameterListAssignment_4_1 ) )
            // InternalQueryDsl.g:1564:2: ( rule__CommandContext__ParameterListAssignment_4_1 )
            {
             before(grammarAccess.getCommandContextAccess().getParameterListAssignment_4_1()); 
            // InternalQueryDsl.g:1565:2: ( rule__CommandContext__ParameterListAssignment_4_1 )
            // InternalQueryDsl.g:1565:3: rule__CommandContext__ParameterListAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CommandContext__ParameterListAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandContextAccess().getParameterListAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group_4__1__Impl"


    // $ANTLR start "rule__CommandContext__Group_4__2"
    // InternalQueryDsl.g:1573:1: rule__CommandContext__Group_4__2 : rule__CommandContext__Group_4__2__Impl ;
    public final void rule__CommandContext__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1577:1: ( rule__CommandContext__Group_4__2__Impl )
            // InternalQueryDsl.g:1578:2: rule__CommandContext__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommandContext__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group_4__2"


    // $ANTLR start "rule__CommandContext__Group_4__2__Impl"
    // InternalQueryDsl.g:1584:1: rule__CommandContext__Group_4__2__Impl : ( ')' ) ;
    public final void rule__CommandContext__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1588:1: ( ( ')' ) )
            // InternalQueryDsl.g:1589:1: ( ')' )
            {
            // InternalQueryDsl.g:1589:1: ( ')' )
            // InternalQueryDsl.g:1590:2: ')'
            {
             before(grammarAccess.getCommandContextAccess().getRightParenthesisKeyword_4_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCommandContextAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__Group_4__2__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalQueryDsl.g:1600:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1604:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalQueryDsl.g:1605:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalQueryDsl.g:1612:1: rule__Query__Group__0__Impl : ( ( rule__Query__DocumentationAssignment_0 )? ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1616:1: ( ( ( rule__Query__DocumentationAssignment_0 )? ) )
            // InternalQueryDsl.g:1617:1: ( ( rule__Query__DocumentationAssignment_0 )? )
            {
            // InternalQueryDsl.g:1617:1: ( ( rule__Query__DocumentationAssignment_0 )? )
            // InternalQueryDsl.g:1618:2: ( rule__Query__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getQueryAccess().getDocumentationAssignment_0()); 
            // InternalQueryDsl.g:1619:2: ( rule__Query__DocumentationAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOCUMENTATION) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQueryDsl.g:1619:3: rule__Query__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalQueryDsl.g:1627:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1631:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalQueryDsl.g:1632:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalQueryDsl.g:1639:1: rule__Query__Group__1__Impl : ( ( rule__Query__InternalAssignment_1 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1643:1: ( ( ( rule__Query__InternalAssignment_1 )? ) )
            // InternalQueryDsl.g:1644:1: ( ( rule__Query__InternalAssignment_1 )? )
            {
            // InternalQueryDsl.g:1644:1: ( ( rule__Query__InternalAssignment_1 )? )
            // InternalQueryDsl.g:1645:2: ( rule__Query__InternalAssignment_1 )?
            {
             before(grammarAccess.getQueryAccess().getInternalAssignment_1()); 
            // InternalQueryDsl.g:1646:2: ( rule__Query__InternalAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQueryDsl.g:1646:3: rule__Query__InternalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__InternalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getInternalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalQueryDsl.g:1654:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1658:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalQueryDsl.g:1659:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalQueryDsl.g:1666:1: rule__Query__Group__2__Impl : ( 'query' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1670:1: ( ( 'query' ) )
            // InternalQueryDsl.g:1671:1: ( 'query' )
            {
            // InternalQueryDsl.g:1671:1: ( 'query' )
            // InternalQueryDsl.g:1672:2: 'query'
            {
             before(grammarAccess.getQueryAccess().getQueryKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getQueryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalQueryDsl.g:1681:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1685:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalQueryDsl.g:1686:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalQueryDsl.g:1693:1: rule__Query__Group__3__Impl : ( ( rule__Query__NameAssignment_3 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1697:1: ( ( ( rule__Query__NameAssignment_3 ) ) )
            // InternalQueryDsl.g:1698:1: ( ( rule__Query__NameAssignment_3 ) )
            {
            // InternalQueryDsl.g:1698:1: ( ( rule__Query__NameAssignment_3 ) )
            // InternalQueryDsl.g:1699:2: ( rule__Query__NameAssignment_3 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_3()); 
            // InternalQueryDsl.g:1700:2: ( rule__Query__NameAssignment_3 )
            // InternalQueryDsl.g:1700:3: rule__Query__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalQueryDsl.g:1708:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1712:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalQueryDsl.g:1713:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalQueryDsl.g:1720:1: rule__Query__Group__4__Impl : ( ( rule__Query__Group_4__0 )? ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1724:1: ( ( ( rule__Query__Group_4__0 )? ) )
            // InternalQueryDsl.g:1725:1: ( ( rule__Query__Group_4__0 )? )
            {
            // InternalQueryDsl.g:1725:1: ( ( rule__Query__Group_4__0 )? )
            // InternalQueryDsl.g:1726:2: ( rule__Query__Group_4__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_4()); 
            // InternalQueryDsl.g:1727:2: ( rule__Query__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQueryDsl.g:1727:3: rule__Query__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalQueryDsl.g:1735:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1739:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalQueryDsl.g:1740:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalQueryDsl.g:1747:1: rule__Query__Group__5__Impl : ( ':' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1751:1: ( ( ':' ) )
            // InternalQueryDsl.g:1752:1: ( ':' )
            {
            // InternalQueryDsl.g:1752:1: ( ':' )
            // InternalQueryDsl.g:1753:2: ':'
            {
             before(grammarAccess.getQueryAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // InternalQueryDsl.g:1762:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1766:1: ( rule__Query__Group__6__Impl )
            // InternalQueryDsl.g:1767:2: rule__Query__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // InternalQueryDsl.g:1773:1: rule__Query__Group__6__Impl : ( ( rule__Query__Group_6__0 ) ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1777:1: ( ( ( rule__Query__Group_6__0 ) ) )
            // InternalQueryDsl.g:1778:1: ( ( rule__Query__Group_6__0 ) )
            {
            // InternalQueryDsl.g:1778:1: ( ( rule__Query__Group_6__0 ) )
            // InternalQueryDsl.g:1779:2: ( rule__Query__Group_6__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup_6()); 
            // InternalQueryDsl.g:1780:2: ( rule__Query__Group_6__0 )
            // InternalQueryDsl.g:1780:3: rule__Query__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__Query__Group_4__0"
    // InternalQueryDsl.g:1789:1: rule__Query__Group_4__0 : rule__Query__Group_4__0__Impl rule__Query__Group_4__1 ;
    public final void rule__Query__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1793:1: ( rule__Query__Group_4__0__Impl rule__Query__Group_4__1 )
            // InternalQueryDsl.g:1794:2: rule__Query__Group_4__0__Impl rule__Query__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__0"


    // $ANTLR start "rule__Query__Group_4__0__Impl"
    // InternalQueryDsl.g:1801:1: rule__Query__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Query__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1805:1: ( ( '(' ) )
            // InternalQueryDsl.g:1806:1: ( '(' )
            {
            // InternalQueryDsl.g:1806:1: ( '(' )
            // InternalQueryDsl.g:1807:2: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__0__Impl"


    // $ANTLR start "rule__Query__Group_4__1"
    // InternalQueryDsl.g:1816:1: rule__Query__Group_4__1 : rule__Query__Group_4__1__Impl rule__Query__Group_4__2 ;
    public final void rule__Query__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1820:1: ( rule__Query__Group_4__1__Impl rule__Query__Group_4__2 )
            // InternalQueryDsl.g:1821:2: rule__Query__Group_4__1__Impl rule__Query__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Query__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__1"


    // $ANTLR start "rule__Query__Group_4__1__Impl"
    // InternalQueryDsl.g:1828:1: rule__Query__Group_4__1__Impl : ( ( rule__Query__ParameterListAssignment_4_1 ) ) ;
    public final void rule__Query__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1832:1: ( ( ( rule__Query__ParameterListAssignment_4_1 ) ) )
            // InternalQueryDsl.g:1833:1: ( ( rule__Query__ParameterListAssignment_4_1 ) )
            {
            // InternalQueryDsl.g:1833:1: ( ( rule__Query__ParameterListAssignment_4_1 ) )
            // InternalQueryDsl.g:1834:2: ( rule__Query__ParameterListAssignment_4_1 )
            {
             before(grammarAccess.getQueryAccess().getParameterListAssignment_4_1()); 
            // InternalQueryDsl.g:1835:2: ( rule__Query__ParameterListAssignment_4_1 )
            // InternalQueryDsl.g:1835:3: rule__Query__ParameterListAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__ParameterListAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getParameterListAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__1__Impl"


    // $ANTLR start "rule__Query__Group_4__2"
    // InternalQueryDsl.g:1843:1: rule__Query__Group_4__2 : rule__Query__Group_4__2__Impl ;
    public final void rule__Query__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1847:1: ( rule__Query__Group_4__2__Impl )
            // InternalQueryDsl.g:1848:2: rule__Query__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__2"


    // $ANTLR start "rule__Query__Group_4__2__Impl"
    // InternalQueryDsl.g:1854:1: rule__Query__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Query__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1858:1: ( ( ')' ) )
            // InternalQueryDsl.g:1859:1: ( ')' )
            {
            // InternalQueryDsl.g:1859:1: ( ')' )
            // InternalQueryDsl.g:1860:2: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_4_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_4__2__Impl"


    // $ANTLR start "rule__Query__Group_6__0"
    // InternalQueryDsl.g:1870:1: rule__Query__Group_6__0 : rule__Query__Group_6__0__Impl rule__Query__Group_6__1 ;
    public final void rule__Query__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1874:1: ( rule__Query__Group_6__0__Impl rule__Query__Group_6__1 )
            // InternalQueryDsl.g:1875:2: rule__Query__Group_6__0__Impl rule__Query__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Query__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_6__0"


    // $ANTLR start "rule__Query__Group_6__0__Impl"
    // InternalQueryDsl.g:1882:1: rule__Query__Group_6__0__Impl : ( ( rule__Query__ExpressionsAssignment_6_0 ) ) ;
    public final void rule__Query__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1886:1: ( ( ( rule__Query__ExpressionsAssignment_6_0 ) ) )
            // InternalQueryDsl.g:1887:1: ( ( rule__Query__ExpressionsAssignment_6_0 ) )
            {
            // InternalQueryDsl.g:1887:1: ( ( rule__Query__ExpressionsAssignment_6_0 ) )
            // InternalQueryDsl.g:1888:2: ( rule__Query__ExpressionsAssignment_6_0 )
            {
             before(grammarAccess.getQueryAccess().getExpressionsAssignment_6_0()); 
            // InternalQueryDsl.g:1889:2: ( rule__Query__ExpressionsAssignment_6_0 )
            // InternalQueryDsl.g:1889:3: rule__Query__ExpressionsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__ExpressionsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getExpressionsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_6__0__Impl"


    // $ANTLR start "rule__Query__Group_6__1"
    // InternalQueryDsl.g:1897:1: rule__Query__Group_6__1 : rule__Query__Group_6__1__Impl ;
    public final void rule__Query__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1901:1: ( rule__Query__Group_6__1__Impl )
            // InternalQueryDsl.g:1902:2: rule__Query__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_6__1"


    // $ANTLR start "rule__Query__Group_6__1__Impl"
    // InternalQueryDsl.g:1908:1: rule__Query__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Query__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1912:1: ( ( ';' ) )
            // InternalQueryDsl.g:1913:1: ( ';' )
            {
            // InternalQueryDsl.g:1913:1: ( ';' )
            // InternalQueryDsl.g:1914:2: ';'
            {
             before(grammarAccess.getQueryAccess().getSemicolonKeyword_6_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getSemicolonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_6__1__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalQueryDsl.g:1924:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1928:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalQueryDsl.g:1929:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // InternalQueryDsl.g:1936:1: rule__Precondition__Group__0__Impl : ( ( rule__Precondition__DocumentationAssignment_0 )? ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1940:1: ( ( ( rule__Precondition__DocumentationAssignment_0 )? ) )
            // InternalQueryDsl.g:1941:1: ( ( rule__Precondition__DocumentationAssignment_0 )? )
            {
            // InternalQueryDsl.g:1941:1: ( ( rule__Precondition__DocumentationAssignment_0 )? )
            // InternalQueryDsl.g:1942:2: ( rule__Precondition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getPreconditionAccess().getDocumentationAssignment_0()); 
            // InternalQueryDsl.g:1943:2: ( rule__Precondition__DocumentationAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DOCUMENTATION) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQueryDsl.g:1943:3: rule__Precondition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Precondition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPreconditionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // InternalQueryDsl.g:1951:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1955:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalQueryDsl.g:1956:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Precondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // InternalQueryDsl.g:1963:1: rule__Precondition__Group__1__Impl : ( 'precondition' ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1967:1: ( ( 'precondition' ) )
            // InternalQueryDsl.g:1968:1: ( 'precondition' )
            {
            // InternalQueryDsl.g:1968:1: ( 'precondition' )
            // InternalQueryDsl.g:1969:2: 'precondition'
            {
             before(grammarAccess.getPreconditionAccess().getPreconditionKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getPreconditionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__Precondition__Group__2"
    // InternalQueryDsl.g:1978:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl rule__Precondition__Group__3 ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1982:1: ( rule__Precondition__Group__2__Impl rule__Precondition__Group__3 )
            // InternalQueryDsl.g:1983:2: rule__Precondition__Group__2__Impl rule__Precondition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Precondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2"


    // $ANTLR start "rule__Precondition__Group__2__Impl"
    // InternalQueryDsl.g:1990:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__NameAssignment_2 )? ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1994:1: ( ( ( rule__Precondition__NameAssignment_2 )? ) )
            // InternalQueryDsl.g:1995:1: ( ( rule__Precondition__NameAssignment_2 )? )
            {
            // InternalQueryDsl.g:1995:1: ( ( rule__Precondition__NameAssignment_2 )? )
            // InternalQueryDsl.g:1996:2: ( rule__Precondition__NameAssignment_2 )?
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_2()); 
            // InternalQueryDsl.g:1997:2: ( rule__Precondition__NameAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQueryDsl.g:1997:3: rule__Precondition__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Precondition__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPreconditionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2__Impl"


    // $ANTLR start "rule__Precondition__Group__3"
    // InternalQueryDsl.g:2005:1: rule__Precondition__Group__3 : rule__Precondition__Group__3__Impl rule__Precondition__Group__4 ;
    public final void rule__Precondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2009:1: ( rule__Precondition__Group__3__Impl rule__Precondition__Group__4 )
            // InternalQueryDsl.g:2010:2: rule__Precondition__Group__3__Impl rule__Precondition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Precondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__3"


    // $ANTLR start "rule__Precondition__Group__3__Impl"
    // InternalQueryDsl.g:2017:1: rule__Precondition__Group__3__Impl : ( ':' ) ;
    public final void rule__Precondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2021:1: ( ( ':' ) )
            // InternalQueryDsl.g:2022:1: ( ':' )
            {
            // InternalQueryDsl.g:2022:1: ( ':' )
            // InternalQueryDsl.g:2023:2: ':'
            {
             before(grammarAccess.getPreconditionAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__3__Impl"


    // $ANTLR start "rule__Precondition__Group__4"
    // InternalQueryDsl.g:2032:1: rule__Precondition__Group__4 : rule__Precondition__Group__4__Impl ;
    public final void rule__Precondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2036:1: ( rule__Precondition__Group__4__Impl )
            // InternalQueryDsl.g:2037:2: rule__Precondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__4"


    // $ANTLR start "rule__Precondition__Group__4__Impl"
    // InternalQueryDsl.g:2043:1: rule__Precondition__Group__4__Impl : ( ( rule__Precondition__Group_4__0 ) ) ;
    public final void rule__Precondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2047:1: ( ( ( rule__Precondition__Group_4__0 ) ) )
            // InternalQueryDsl.g:2048:1: ( ( rule__Precondition__Group_4__0 ) )
            {
            // InternalQueryDsl.g:2048:1: ( ( rule__Precondition__Group_4__0 ) )
            // InternalQueryDsl.g:2049:2: ( rule__Precondition__Group_4__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup_4()); 
            // InternalQueryDsl.g:2050:2: ( rule__Precondition__Group_4__0 )
            // InternalQueryDsl.g:2050:3: rule__Precondition__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__4__Impl"


    // $ANTLR start "rule__Precondition__Group_4__0"
    // InternalQueryDsl.g:2059:1: rule__Precondition__Group_4__0 : rule__Precondition__Group_4__0__Impl rule__Precondition__Group_4__1 ;
    public final void rule__Precondition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2063:1: ( rule__Precondition__Group_4__0__Impl rule__Precondition__Group_4__1 )
            // InternalQueryDsl.g:2064:2: rule__Precondition__Group_4__0__Impl rule__Precondition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Precondition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_4__0"


    // $ANTLR start "rule__Precondition__Group_4__0__Impl"
    // InternalQueryDsl.g:2071:1: rule__Precondition__Group_4__0__Impl : ( ( rule__Precondition__ExpressionsAssignment_4_0 ) ) ;
    public final void rule__Precondition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2075:1: ( ( ( rule__Precondition__ExpressionsAssignment_4_0 ) ) )
            // InternalQueryDsl.g:2076:1: ( ( rule__Precondition__ExpressionsAssignment_4_0 ) )
            {
            // InternalQueryDsl.g:2076:1: ( ( rule__Precondition__ExpressionsAssignment_4_0 ) )
            // InternalQueryDsl.g:2077:2: ( rule__Precondition__ExpressionsAssignment_4_0 )
            {
             before(grammarAccess.getPreconditionAccess().getExpressionsAssignment_4_0()); 
            // InternalQueryDsl.g:2078:2: ( rule__Precondition__ExpressionsAssignment_4_0 )
            // InternalQueryDsl.g:2078:3: rule__Precondition__ExpressionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__ExpressionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getExpressionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_4__0__Impl"


    // $ANTLR start "rule__Precondition__Group_4__1"
    // InternalQueryDsl.g:2086:1: rule__Precondition__Group_4__1 : rule__Precondition__Group_4__1__Impl ;
    public final void rule__Precondition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2090:1: ( rule__Precondition__Group_4__1__Impl )
            // InternalQueryDsl.g:2091:2: rule__Precondition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_4__1"


    // $ANTLR start "rule__Precondition__Group_4__1__Impl"
    // InternalQueryDsl.g:2097:1: rule__Precondition__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Precondition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2101:1: ( ( ';' ) )
            // InternalQueryDsl.g:2102:1: ( ';' )
            {
            // InternalQueryDsl.g:2102:1: ( ';' )
            // InternalQueryDsl.g:2103:2: ';'
            {
             before(grammarAccess.getPreconditionAccess().getSemicolonKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group_4__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__0"
    // InternalQueryDsl.g:2113:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2117:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalQueryDsl.g:2118:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Postcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0"


    // $ANTLR start "rule__Postcondition__Group__0__Impl"
    // InternalQueryDsl.g:2125:1: rule__Postcondition__Group__0__Impl : ( ( rule__Postcondition__DocumentationAssignment_0 )? ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2129:1: ( ( ( rule__Postcondition__DocumentationAssignment_0 )? ) )
            // InternalQueryDsl.g:2130:1: ( ( rule__Postcondition__DocumentationAssignment_0 )? )
            {
            // InternalQueryDsl.g:2130:1: ( ( rule__Postcondition__DocumentationAssignment_0 )? )
            // InternalQueryDsl.g:2131:2: ( rule__Postcondition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getPostconditionAccess().getDocumentationAssignment_0()); 
            // InternalQueryDsl.g:2132:2: ( rule__Postcondition__DocumentationAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOCUMENTATION) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalQueryDsl.g:2132:3: rule__Postcondition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postcondition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostconditionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0__Impl"


    // $ANTLR start "rule__Postcondition__Group__1"
    // InternalQueryDsl.g:2140:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2144:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalQueryDsl.g:2145:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Postcondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1"


    // $ANTLR start "rule__Postcondition__Group__1__Impl"
    // InternalQueryDsl.g:2152:1: rule__Postcondition__Group__1__Impl : ( 'postcondition' ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2156:1: ( ( 'postcondition' ) )
            // InternalQueryDsl.g:2157:1: ( 'postcondition' )
            {
            // InternalQueryDsl.g:2157:1: ( 'postcondition' )
            // InternalQueryDsl.g:2158:2: 'postcondition'
            {
             before(grammarAccess.getPostconditionAccess().getPostconditionKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getPostconditionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__2"
    // InternalQueryDsl.g:2167:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2171:1: ( rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3 )
            // InternalQueryDsl.g:2172:2: rule__Postcondition__Group__2__Impl rule__Postcondition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Postcondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__2"


    // $ANTLR start "rule__Postcondition__Group__2__Impl"
    // InternalQueryDsl.g:2179:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__NameAssignment_2 )? ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2183:1: ( ( ( rule__Postcondition__NameAssignment_2 )? ) )
            // InternalQueryDsl.g:2184:1: ( ( rule__Postcondition__NameAssignment_2 )? )
            {
            // InternalQueryDsl.g:2184:1: ( ( rule__Postcondition__NameAssignment_2 )? )
            // InternalQueryDsl.g:2185:2: ( rule__Postcondition__NameAssignment_2 )?
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_2()); 
            // InternalQueryDsl.g:2186:2: ( rule__Postcondition__NameAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQueryDsl.g:2186:3: rule__Postcondition__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postcondition__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostconditionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__2__Impl"


    // $ANTLR start "rule__Postcondition__Group__3"
    // InternalQueryDsl.g:2194:1: rule__Postcondition__Group__3 : rule__Postcondition__Group__3__Impl rule__Postcondition__Group__4 ;
    public final void rule__Postcondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2198:1: ( rule__Postcondition__Group__3__Impl rule__Postcondition__Group__4 )
            // InternalQueryDsl.g:2199:2: rule__Postcondition__Group__3__Impl rule__Postcondition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Postcondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__3"


    // $ANTLR start "rule__Postcondition__Group__3__Impl"
    // InternalQueryDsl.g:2206:1: rule__Postcondition__Group__3__Impl : ( ':' ) ;
    public final void rule__Postcondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2210:1: ( ( ':' ) )
            // InternalQueryDsl.g:2211:1: ( ':' )
            {
            // InternalQueryDsl.g:2211:1: ( ':' )
            // InternalQueryDsl.g:2212:2: ':'
            {
             before(grammarAccess.getPostconditionAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__3__Impl"


    // $ANTLR start "rule__Postcondition__Group__4"
    // InternalQueryDsl.g:2221:1: rule__Postcondition__Group__4 : rule__Postcondition__Group__4__Impl ;
    public final void rule__Postcondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2225:1: ( rule__Postcondition__Group__4__Impl )
            // InternalQueryDsl.g:2226:2: rule__Postcondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__4"


    // $ANTLR start "rule__Postcondition__Group__4__Impl"
    // InternalQueryDsl.g:2232:1: rule__Postcondition__Group__4__Impl : ( ( rule__Postcondition__Group_4__0 ) ) ;
    public final void rule__Postcondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2236:1: ( ( ( rule__Postcondition__Group_4__0 ) ) )
            // InternalQueryDsl.g:2237:1: ( ( rule__Postcondition__Group_4__0 ) )
            {
            // InternalQueryDsl.g:2237:1: ( ( rule__Postcondition__Group_4__0 ) )
            // InternalQueryDsl.g:2238:2: ( rule__Postcondition__Group_4__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup_4()); 
            // InternalQueryDsl.g:2239:2: ( rule__Postcondition__Group_4__0 )
            // InternalQueryDsl.g:2239:3: rule__Postcondition__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__4__Impl"


    // $ANTLR start "rule__Postcondition__Group_4__0"
    // InternalQueryDsl.g:2248:1: rule__Postcondition__Group_4__0 : rule__Postcondition__Group_4__0__Impl rule__Postcondition__Group_4__1 ;
    public final void rule__Postcondition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2252:1: ( rule__Postcondition__Group_4__0__Impl rule__Postcondition__Group_4__1 )
            // InternalQueryDsl.g:2253:2: rule__Postcondition__Group_4__0__Impl rule__Postcondition__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Postcondition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group_4__0"


    // $ANTLR start "rule__Postcondition__Group_4__0__Impl"
    // InternalQueryDsl.g:2260:1: rule__Postcondition__Group_4__0__Impl : ( ( rule__Postcondition__ExpressionsAssignment_4_0 ) ) ;
    public final void rule__Postcondition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2264:1: ( ( ( rule__Postcondition__ExpressionsAssignment_4_0 ) ) )
            // InternalQueryDsl.g:2265:1: ( ( rule__Postcondition__ExpressionsAssignment_4_0 ) )
            {
            // InternalQueryDsl.g:2265:1: ( ( rule__Postcondition__ExpressionsAssignment_4_0 ) )
            // InternalQueryDsl.g:2266:2: ( rule__Postcondition__ExpressionsAssignment_4_0 )
            {
             before(grammarAccess.getPostconditionAccess().getExpressionsAssignment_4_0()); 
            // InternalQueryDsl.g:2267:2: ( rule__Postcondition__ExpressionsAssignment_4_0 )
            // InternalQueryDsl.g:2267:3: rule__Postcondition__ExpressionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__ExpressionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getExpressionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group_4__0__Impl"


    // $ANTLR start "rule__Postcondition__Group_4__1"
    // InternalQueryDsl.g:2275:1: rule__Postcondition__Group_4__1 : rule__Postcondition__Group_4__1__Impl ;
    public final void rule__Postcondition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2279:1: ( rule__Postcondition__Group_4__1__Impl )
            // InternalQueryDsl.g:2280:2: rule__Postcondition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group_4__1"


    // $ANTLR start "rule__Postcondition__Group_4__1__Impl"
    // InternalQueryDsl.g:2286:1: rule__Postcondition__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Postcondition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2290:1: ( ( ';' ) )
            // InternalQueryDsl.g:2291:1: ( ';' )
            {
            // InternalQueryDsl.g:2291:1: ( ';' )
            // InternalQueryDsl.g:2292:2: ';'
            {
             before(grammarAccess.getPostconditionAccess().getSemicolonKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalQueryDsl.g:2302:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2306:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalQueryDsl.g:2307:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // InternalQueryDsl.g:2314:1: rule__ParameterList__Group__0__Impl : ( ( rule__ParameterList__ParametersAssignment_0 ) ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2318:1: ( ( ( rule__ParameterList__ParametersAssignment_0 ) ) )
            // InternalQueryDsl.g:2319:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            {
            // InternalQueryDsl.g:2319:1: ( ( rule__ParameterList__ParametersAssignment_0 ) )
            // InternalQueryDsl.g:2320:2: ( rule__ParameterList__ParametersAssignment_0 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 
            // InternalQueryDsl.g:2321:2: ( rule__ParameterList__ParametersAssignment_0 )
            // InternalQueryDsl.g:2321:3: rule__ParameterList__ParametersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // InternalQueryDsl.g:2329:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2333:1: ( rule__ParameterList__Group__1__Impl )
            // InternalQueryDsl.g:2334:2: rule__ParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // InternalQueryDsl.g:2340:1: rule__ParameterList__Group__1__Impl : ( ( rule__ParameterList__Group_1__0 )* ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2344:1: ( ( ( rule__ParameterList__Group_1__0 )* ) )
            // InternalQueryDsl.g:2345:1: ( ( rule__ParameterList__Group_1__0 )* )
            {
            // InternalQueryDsl.g:2345:1: ( ( rule__ParameterList__Group_1__0 )* )
            // InternalQueryDsl.g:2346:2: ( rule__ParameterList__Group_1__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_1()); 
            // InternalQueryDsl.g:2347:2: ( rule__ParameterList__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalQueryDsl.g:2347:3: rule__ParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group_1__0"
    // InternalQueryDsl.g:2356:1: rule__ParameterList__Group_1__0 : rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 ;
    public final void rule__ParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2360:1: ( rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1 )
            // InternalQueryDsl.g:2361:2: rule__ParameterList__Group_1__0__Impl rule__ParameterList__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__0"


    // $ANTLR start "rule__ParameterList__Group_1__0__Impl"
    // InternalQueryDsl.g:2368:1: rule__ParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2372:1: ( ( ',' ) )
            // InternalQueryDsl.g:2373:1: ( ',' )
            {
            // InternalQueryDsl.g:2373:1: ( ',' )
            // InternalQueryDsl.g:2374:2: ','
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_1__1"
    // InternalQueryDsl.g:2383:1: rule__ParameterList__Group_1__1 : rule__ParameterList__Group_1__1__Impl ;
    public final void rule__ParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2387:1: ( rule__ParameterList__Group_1__1__Impl )
            // InternalQueryDsl.g:2388:2: rule__ParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__1"


    // $ANTLR start "rule__ParameterList__Group_1__1__Impl"
    // InternalQueryDsl.g:2394:1: rule__ParameterList__Group_1__1__Impl : ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) ;
    public final void rule__ParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2398:1: ( ( ( rule__ParameterList__ParametersAssignment_1_1 ) ) )
            // InternalQueryDsl.g:2399:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:2399:1: ( ( rule__ParameterList__ParametersAssignment_1_1 ) )
            // InternalQueryDsl.g:2400:2: ( rule__ParameterList__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 
            // InternalQueryDsl.g:2401:2: ( rule__ParameterList__ParametersAssignment_1_1 )
            // InternalQueryDsl.g:2401:3: rule__ParameterList__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalQueryDsl.g:2410:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2414:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalQueryDsl.g:2415:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalQueryDsl.g:2422:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__VariableNameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2426:1: ( ( ( rule__Parameter__VariableNameAssignment_0 ) ) )
            // InternalQueryDsl.g:2427:1: ( ( rule__Parameter__VariableNameAssignment_0 ) )
            {
            // InternalQueryDsl.g:2427:1: ( ( rule__Parameter__VariableNameAssignment_0 ) )
            // InternalQueryDsl.g:2428:2: ( rule__Parameter__VariableNameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getVariableNameAssignment_0()); 
            // InternalQueryDsl.g:2429:2: ( rule__Parameter__VariableNameAssignment_0 )
            // InternalQueryDsl.g:2429:3: rule__Parameter__VariableNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__VariableNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getVariableNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalQueryDsl.g:2437:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2441:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalQueryDsl.g:2442:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalQueryDsl.g:2449:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2453:1: ( ( ':' ) )
            // InternalQueryDsl.g:2454:1: ( ':' )
            {
            // InternalQueryDsl.g:2454:1: ( ':' )
            // InternalQueryDsl.g:2455:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalQueryDsl.g:2464:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2468:1: ( rule__Parameter__Group__2__Impl )
            // InternalQueryDsl.g:2469:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalQueryDsl.g:2475:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeNameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2479:1: ( ( ( rule__Parameter__TypeNameAssignment_2 ) ) )
            // InternalQueryDsl.g:2480:1: ( ( rule__Parameter__TypeNameAssignment_2 ) )
            {
            // InternalQueryDsl.g:2480:1: ( ( rule__Parameter__TypeNameAssignment_2 ) )
            // InternalQueryDsl.g:2481:2: ( rule__Parameter__TypeNameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeNameAssignment_2()); 
            // InternalQueryDsl.g:2482:2: ( rule__Parameter__TypeNameAssignment_2 )
            // InternalQueryDsl.g:2482:3: rule__Parameter__TypeNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Invariant__Group__0"
    // InternalQueryDsl.g:2491:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2495:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // InternalQueryDsl.g:2496:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Invariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Invariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__0"


    // $ANTLR start "rule__Invariant__Group__0__Impl"
    // InternalQueryDsl.g:2503:1: rule__Invariant__Group__0__Impl : ( ( rule__Invariant__DocumentationAssignment_0 )? ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2507:1: ( ( ( rule__Invariant__DocumentationAssignment_0 )? ) )
            // InternalQueryDsl.g:2508:1: ( ( rule__Invariant__DocumentationAssignment_0 )? )
            {
            // InternalQueryDsl.g:2508:1: ( ( rule__Invariant__DocumentationAssignment_0 )? )
            // InternalQueryDsl.g:2509:2: ( rule__Invariant__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getInvariantAccess().getDocumentationAssignment_0()); 
            // InternalQueryDsl.g:2510:2: ( rule__Invariant__DocumentationAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_DOCUMENTATION) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQueryDsl.g:2510:3: rule__Invariant__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Invariant__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getDocumentationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__0__Impl"


    // $ANTLR start "rule__Invariant__Group__1"
    // InternalQueryDsl.g:2518:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2522:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // InternalQueryDsl.g:2523:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Invariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Invariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__1"


    // $ANTLR start "rule__Invariant__Group__1__Impl"
    // InternalQueryDsl.g:2530:1: rule__Invariant__Group__1__Impl : ( 'invariant' ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2534:1: ( ( 'invariant' ) )
            // InternalQueryDsl.g:2535:1: ( 'invariant' )
            {
            // InternalQueryDsl.g:2535:1: ( 'invariant' )
            // InternalQueryDsl.g:2536:2: 'invariant'
            {
             before(grammarAccess.getInvariantAccess().getInvariantKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInvariantAccess().getInvariantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__1__Impl"


    // $ANTLR start "rule__Invariant__Group__2"
    // InternalQueryDsl.g:2545:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2549:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // InternalQueryDsl.g:2550:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Invariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Invariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__2"


    // $ANTLR start "rule__Invariant__Group__2__Impl"
    // InternalQueryDsl.g:2557:1: rule__Invariant__Group__2__Impl : ( ( rule__Invariant__NameAssignment_2 )? ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2561:1: ( ( ( rule__Invariant__NameAssignment_2 )? ) )
            // InternalQueryDsl.g:2562:1: ( ( rule__Invariant__NameAssignment_2 )? )
            {
            // InternalQueryDsl.g:2562:1: ( ( rule__Invariant__NameAssignment_2 )? )
            // InternalQueryDsl.g:2563:2: ( rule__Invariant__NameAssignment_2 )?
            {
             before(grammarAccess.getInvariantAccess().getNameAssignment_2()); 
            // InternalQueryDsl.g:2564:2: ( rule__Invariant__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalQueryDsl.g:2564:3: rule__Invariant__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Invariant__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInvariantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__2__Impl"


    // $ANTLR start "rule__Invariant__Group__3"
    // InternalQueryDsl.g:2572:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2576:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // InternalQueryDsl.g:2577:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Invariant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Invariant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__3"


    // $ANTLR start "rule__Invariant__Group__3__Impl"
    // InternalQueryDsl.g:2584:1: rule__Invariant__Group__3__Impl : ( ':' ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2588:1: ( ( ':' ) )
            // InternalQueryDsl.g:2589:1: ( ':' )
            {
            // InternalQueryDsl.g:2589:1: ( ':' )
            // InternalQueryDsl.g:2590:2: ':'
            {
             before(grammarAccess.getInvariantAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInvariantAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__3__Impl"


    // $ANTLR start "rule__Invariant__Group__4"
    // InternalQueryDsl.g:2599:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2603:1: ( rule__Invariant__Group__4__Impl )
            // InternalQueryDsl.g:2604:2: rule__Invariant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Invariant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__4"


    // $ANTLR start "rule__Invariant__Group__4__Impl"
    // InternalQueryDsl.g:2610:1: rule__Invariant__Group__4__Impl : ( ( rule__Invariant__Group_4__0 ) ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2614:1: ( ( ( rule__Invariant__Group_4__0 ) ) )
            // InternalQueryDsl.g:2615:1: ( ( rule__Invariant__Group_4__0 ) )
            {
            // InternalQueryDsl.g:2615:1: ( ( rule__Invariant__Group_4__0 ) )
            // InternalQueryDsl.g:2616:2: ( rule__Invariant__Group_4__0 )
            {
             before(grammarAccess.getInvariantAccess().getGroup_4()); 
            // InternalQueryDsl.g:2617:2: ( rule__Invariant__Group_4__0 )
            // InternalQueryDsl.g:2617:3: rule__Invariant__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Invariant__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__4__Impl"


    // $ANTLR start "rule__Invariant__Group_4__0"
    // InternalQueryDsl.g:2626:1: rule__Invariant__Group_4__0 : rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 ;
    public final void rule__Invariant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2630:1: ( rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1 )
            // InternalQueryDsl.g:2631:2: rule__Invariant__Group_4__0__Impl rule__Invariant__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Invariant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Invariant__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__0"


    // $ANTLR start "rule__Invariant__Group_4__0__Impl"
    // InternalQueryDsl.g:2638:1: rule__Invariant__Group_4__0__Impl : ( ( rule__Invariant__ExpressionsAssignment_4_0 ) ) ;
    public final void rule__Invariant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2642:1: ( ( ( rule__Invariant__ExpressionsAssignment_4_0 ) ) )
            // InternalQueryDsl.g:2643:1: ( ( rule__Invariant__ExpressionsAssignment_4_0 ) )
            {
            // InternalQueryDsl.g:2643:1: ( ( rule__Invariant__ExpressionsAssignment_4_0 ) )
            // InternalQueryDsl.g:2644:2: ( rule__Invariant__ExpressionsAssignment_4_0 )
            {
             before(grammarAccess.getInvariantAccess().getExpressionsAssignment_4_0()); 
            // InternalQueryDsl.g:2645:2: ( rule__Invariant__ExpressionsAssignment_4_0 )
            // InternalQueryDsl.g:2645:3: rule__Invariant__ExpressionsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Invariant__ExpressionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantAccess().getExpressionsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__0__Impl"


    // $ANTLR start "rule__Invariant__Group_4__1"
    // InternalQueryDsl.g:2653:1: rule__Invariant__Group_4__1 : rule__Invariant__Group_4__1__Impl ;
    public final void rule__Invariant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2657:1: ( rule__Invariant__Group_4__1__Impl )
            // InternalQueryDsl.g:2658:2: rule__Invariant__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Invariant__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__1"


    // $ANTLR start "rule__Invariant__Group_4__1__Impl"
    // InternalQueryDsl.g:2664:1: rule__Invariant__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Invariant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2668:1: ( ( ';' ) )
            // InternalQueryDsl.g:2669:1: ( ';' )
            {
            // InternalQueryDsl.g:2669:1: ( ';' )
            // InternalQueryDsl.g:2670:2: ';'
            {
             before(grammarAccess.getInvariantAccess().getSemicolonKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInvariantAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group_4__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__0"
    // InternalQueryDsl.g:2680:1: rule__ImpliesExpression__Group__0 : rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 ;
    public final void rule__ImpliesExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2684:1: ( rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1 )
            // InternalQueryDsl.g:2685:2: rule__ImpliesExpression__Group__0__Impl rule__ImpliesExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ImpliesExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0"


    // $ANTLR start "rule__ImpliesExpression__Group__0__Impl"
    // InternalQueryDsl.g:2692:1: rule__ImpliesExpression__Group__0__Impl : ( ruleOrExpression ) ;
    public final void rule__ImpliesExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2696:1: ( ( ruleOrExpression ) )
            // InternalQueryDsl.g:2697:1: ( ruleOrExpression )
            {
            // InternalQueryDsl.g:2697:1: ( ruleOrExpression )
            // InternalQueryDsl.g:2698:2: ruleOrExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group__1"
    // InternalQueryDsl.g:2707:1: rule__ImpliesExpression__Group__1 : rule__ImpliesExpression__Group__1__Impl ;
    public final void rule__ImpliesExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2711:1: ( rule__ImpliesExpression__Group__1__Impl )
            // InternalQueryDsl.g:2712:2: rule__ImpliesExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1"


    // $ANTLR start "rule__ImpliesExpression__Group__1__Impl"
    // InternalQueryDsl.g:2718:1: rule__ImpliesExpression__Group__1__Impl : ( ( rule__ImpliesExpression__Group_1__0 )* ) ;
    public final void rule__ImpliesExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2722:1: ( ( ( rule__ImpliesExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:2723:1: ( ( rule__ImpliesExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:2723:1: ( ( rule__ImpliesExpression__Group_1__0 )* )
            // InternalQueryDsl.g:2724:2: ( rule__ImpliesExpression__Group_1__0 )*
            {
             before(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:2725:2: ( rule__ImpliesExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQueryDsl.g:2725:3: rule__ImpliesExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ImpliesExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getImpliesExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0"
    // InternalQueryDsl.g:2734:1: rule__ImpliesExpression__Group_1__0 : rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 ;
    public final void rule__ImpliesExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2738:1: ( rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1 )
            // InternalQueryDsl.g:2739:2: rule__ImpliesExpression__Group_1__0__Impl rule__ImpliesExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ImpliesExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0"


    // $ANTLR start "rule__ImpliesExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:2746:1: rule__ImpliesExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ImpliesExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2750:1: ( ( () ) )
            // InternalQueryDsl.g:2751:1: ( () )
            {
            // InternalQueryDsl.g:2751:1: ( () )
            // InternalQueryDsl.g:2752:2: ()
            {
             before(grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLeftAction_1_0()); 
            // InternalQueryDsl.g:2753:2: ()
            // InternalQueryDsl.g:2753:3: 
            {
            }

             after(grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1"
    // InternalQueryDsl.g:2761:1: rule__ImpliesExpression__Group_1__1 : rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2 ;
    public final void rule__ImpliesExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2765:1: ( rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2 )
            // InternalQueryDsl.g:2766:2: rule__ImpliesExpression__Group_1__1__Impl rule__ImpliesExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__ImpliesExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1"


    // $ANTLR start "rule__ImpliesExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:2773:1: rule__ImpliesExpression__Group_1__1__Impl : ( 'implies' ) ;
    public final void rule__ImpliesExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2777:1: ( ( 'implies' ) )
            // InternalQueryDsl.g:2778:1: ( 'implies' )
            {
            // InternalQueryDsl.g:2778:1: ( 'implies' )
            // InternalQueryDsl.g:2779:2: 'implies'
            {
             before(grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ImpliesExpression__Group_1__2"
    // InternalQueryDsl.g:2788:1: rule__ImpliesExpression__Group_1__2 : rule__ImpliesExpression__Group_1__2__Impl ;
    public final void rule__ImpliesExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2792:1: ( rule__ImpliesExpression__Group_1__2__Impl )
            // InternalQueryDsl.g:2793:2: rule__ImpliesExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__2"


    // $ANTLR start "rule__ImpliesExpression__Group_1__2__Impl"
    // InternalQueryDsl.g:2799:1: rule__ImpliesExpression__Group_1__2__Impl : ( ( rule__ImpliesExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ImpliesExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2803:1: ( ( ( rule__ImpliesExpression__RightAssignment_1_2 ) ) )
            // InternalQueryDsl.g:2804:1: ( ( rule__ImpliesExpression__RightAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:2804:1: ( ( rule__ImpliesExpression__RightAssignment_1_2 ) )
            // InternalQueryDsl.g:2805:2: ( rule__ImpliesExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getImpliesExpressionAccess().getRightAssignment_1_2()); 
            // InternalQueryDsl.g:2806:2: ( rule__ImpliesExpression__RightAssignment_1_2 )
            // InternalQueryDsl.g:2806:3: rule__ImpliesExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ImpliesExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImpliesExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalQueryDsl.g:2815:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2819:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalQueryDsl.g:2820:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalQueryDsl.g:2827:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2831:1: ( ( ruleAndExpression ) )
            // InternalQueryDsl.g:2832:1: ( ruleAndExpression )
            {
            // InternalQueryDsl.g:2832:1: ( ruleAndExpression )
            // InternalQueryDsl.g:2833:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalQueryDsl.g:2842:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2846:1: ( rule__OrExpression__Group__1__Impl )
            // InternalQueryDsl.g:2847:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalQueryDsl.g:2853:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2857:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:2858:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:2858:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalQueryDsl.g:2859:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:2860:2: ( rule__OrExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==40) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQueryDsl.g:2860:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalQueryDsl.g:2869:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2873:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalQueryDsl.g:2874:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:2881:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2885:1: ( ( () ) )
            // InternalQueryDsl.g:2886:1: ( () )
            {
            // InternalQueryDsl.g:2886:1: ( () )
            // InternalQueryDsl.g:2887:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalQueryDsl.g:2888:2: ()
            // InternalQueryDsl.g:2888:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalQueryDsl.g:2896:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2900:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalQueryDsl.g:2901:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:2908:1: rule__OrExpression__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2912:1: ( ( 'or' ) )
            // InternalQueryDsl.g:2913:1: ( 'or' )
            {
            // InternalQueryDsl.g:2913:1: ( 'or' )
            // InternalQueryDsl.g:2914:2: 'or'
            {
             before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalQueryDsl.g:2923:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2927:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalQueryDsl.g:2928:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalQueryDsl.g:2934:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2938:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalQueryDsl.g:2939:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:2939:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalQueryDsl.g:2940:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // InternalQueryDsl.g:2941:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalQueryDsl.g:2941:3: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalQueryDsl.g:2950:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2954:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalQueryDsl.g:2955:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalQueryDsl.g:2962:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2966:1: ( ( ruleEqualityExpression ) )
            // InternalQueryDsl.g:2967:1: ( ruleEqualityExpression )
            {
            // InternalQueryDsl.g:2967:1: ( ruleEqualityExpression )
            // InternalQueryDsl.g:2968:2: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalQueryDsl.g:2977:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2981:1: ( rule__AndExpression__Group__1__Impl )
            // InternalQueryDsl.g:2982:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalQueryDsl.g:2988:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2992:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:2993:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:2993:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalQueryDsl.g:2994:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:2995:2: ( rule__AndExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==41) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalQueryDsl.g:2995:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalQueryDsl.g:3004:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3008:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalQueryDsl.g:3009:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:3016:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3020:1: ( ( () ) )
            // InternalQueryDsl.g:3021:1: ( () )
            {
            // InternalQueryDsl.g:3021:1: ( () )
            // InternalQueryDsl.g:3022:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalQueryDsl.g:3023:2: ()
            // InternalQueryDsl.g:3023:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalQueryDsl.g:3031:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3035:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalQueryDsl.g:3036:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:3043:1: rule__AndExpression__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3047:1: ( ( 'and' ) )
            // InternalQueryDsl.g:3048:1: ( 'and' )
            {
            // InternalQueryDsl.g:3048:1: ( 'and' )
            // InternalQueryDsl.g:3049:2: 'and'
            {
             before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalQueryDsl.g:3058:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3062:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalQueryDsl.g:3063:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalQueryDsl.g:3069:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3073:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalQueryDsl.g:3074:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:3074:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalQueryDsl.g:3075:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalQueryDsl.g:3076:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalQueryDsl.g:3076:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // InternalQueryDsl.g:3085:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3089:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalQueryDsl.g:3090:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // InternalQueryDsl.g:3097:1: rule__EqualityExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3101:1: ( ( ruleComparisonExpression ) )
            // InternalQueryDsl.g:3102:1: ( ruleComparisonExpression )
            {
            // InternalQueryDsl.g:3102:1: ( ruleComparisonExpression )
            // InternalQueryDsl.g:3103:2: ruleComparisonExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // InternalQueryDsl.g:3112:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3116:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalQueryDsl.g:3117:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // InternalQueryDsl.g:3123:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3127:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:3128:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:3128:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalQueryDsl.g:3129:2: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:3130:2: ( rule__EqualityExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=12 && LA34_0<=13)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalQueryDsl.g:3130:3: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // InternalQueryDsl.g:3139:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3143:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalQueryDsl.g:3144:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:3151:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3155:1: ( ( () ) )
            // InternalQueryDsl.g:3156:1: ( () )
            {
            // InternalQueryDsl.g:3156:1: ( () )
            // InternalQueryDsl.g:3157:2: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // InternalQueryDsl.g:3158:2: ()
            // InternalQueryDsl.g:3158:3: 
            {
            }

             after(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // InternalQueryDsl.g:3166:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3170:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalQueryDsl.g:3171:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:3178:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OperationAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3182:1: ( ( ( rule__EqualityExpression__OperationAssignment_1_1 ) ) )
            // InternalQueryDsl.g:3183:1: ( ( rule__EqualityExpression__OperationAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:3183:1: ( ( rule__EqualityExpression__OperationAssignment_1_1 ) )
            // InternalQueryDsl.g:3184:2: ( rule__EqualityExpression__OperationAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperationAssignment_1_1()); 
            // InternalQueryDsl.g:3185:2: ( rule__EqualityExpression__OperationAssignment_1_1 )
            // InternalQueryDsl.g:3185:3: rule__EqualityExpression__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // InternalQueryDsl.g:3193:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3197:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalQueryDsl.g:3198:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // InternalQueryDsl.g:3204:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3208:1: ( ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) )
            // InternalQueryDsl.g:3209:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:3209:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            // InternalQueryDsl.g:3210:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 
            // InternalQueryDsl.g:3211:2: ( rule__EqualityExpression__RightAssignment_1_2 )
            // InternalQueryDsl.g:3211:3: rule__EqualityExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalQueryDsl.g:3220:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3224:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalQueryDsl.g:3225:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalQueryDsl.g:3232:1: rule__ComparisonExpression__Group__0__Impl : ( rulePlusOrMinusExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3236:1: ( ( rulePlusOrMinusExpression ) )
            // InternalQueryDsl.g:3237:1: ( rulePlusOrMinusExpression )
            {
            // InternalQueryDsl.g:3237:1: ( rulePlusOrMinusExpression )
            // InternalQueryDsl.g:3238:2: rulePlusOrMinusExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getPlusOrMinusExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinusExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getPlusOrMinusExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalQueryDsl.g:3247:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3251:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalQueryDsl.g:3252:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalQueryDsl.g:3258:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3262:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:3263:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:3263:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalQueryDsl.g:3264:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:3265:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=14 && LA35_0<=17)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalQueryDsl.g:3265:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalQueryDsl.g:3274:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3278:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalQueryDsl.g:3279:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:3286:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3290:1: ( ( () ) )
            // InternalQueryDsl.g:3291:1: ( () )
            {
            // InternalQueryDsl.g:3291:1: ( () )
            // InternalQueryDsl.g:3292:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalQueryDsl.g:3293:2: ()
            // InternalQueryDsl.g:3293:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalQueryDsl.g:3301:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3305:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalQueryDsl.g:3306:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:3313:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OpAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3317:1: ( ( ( rule__ComparisonExpression__OpAssignment_1_1 ) ) )
            // InternalQueryDsl.g:3318:1: ( ( rule__ComparisonExpression__OpAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:3318:1: ( ( rule__ComparisonExpression__OpAssignment_1_1 ) )
            // InternalQueryDsl.g:3319:2: ( rule__ComparisonExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOpAssignment_1_1()); 
            // InternalQueryDsl.g:3320:2: ( rule__ComparisonExpression__OpAssignment_1_1 )
            // InternalQueryDsl.g:3320:3: rule__ComparisonExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalQueryDsl.g:3328:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3332:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalQueryDsl.g:3333:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalQueryDsl.g:3339:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3343:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalQueryDsl.g:3344:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:3344:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalQueryDsl.g:3345:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalQueryDsl.g:3346:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalQueryDsl.g:3346:3: rule__ComparisonExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group__0"
    // InternalQueryDsl.g:3355:1: rule__PlusOrMinusExpression__Group__0 : rule__PlusOrMinusExpression__Group__0__Impl rule__PlusOrMinusExpression__Group__1 ;
    public final void rule__PlusOrMinusExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3359:1: ( rule__PlusOrMinusExpression__Group__0__Impl rule__PlusOrMinusExpression__Group__1 )
            // InternalQueryDsl.g:3360:2: rule__PlusOrMinusExpression__Group__0__Impl rule__PlusOrMinusExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__PlusOrMinusExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group__0"


    // $ANTLR start "rule__PlusOrMinusExpression__Group__0__Impl"
    // InternalQueryDsl.g:3367:1: rule__PlusOrMinusExpression__Group__0__Impl : ( ruleMultiplicationOrDivisionExpression ) ;
    public final void rule__PlusOrMinusExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3371:1: ( ( ruleMultiplicationOrDivisionExpression ) )
            // InternalQueryDsl.g:3372:1: ( ruleMultiplicationOrDivisionExpression )
            {
            // InternalQueryDsl.g:3372:1: ( ruleMultiplicationOrDivisionExpression )
            // InternalQueryDsl.g:3373:2: ruleMultiplicationOrDivisionExpression
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getMultiplicationOrDivisionExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationOrDivisionExpression();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusExpressionAccess().getMultiplicationOrDivisionExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group__1"
    // InternalQueryDsl.g:3382:1: rule__PlusOrMinusExpression__Group__1 : rule__PlusOrMinusExpression__Group__1__Impl ;
    public final void rule__PlusOrMinusExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3386:1: ( rule__PlusOrMinusExpression__Group__1__Impl )
            // InternalQueryDsl.g:3387:2: rule__PlusOrMinusExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group__1"


    // $ANTLR start "rule__PlusOrMinusExpression__Group__1__Impl"
    // InternalQueryDsl.g:3393:1: rule__PlusOrMinusExpression__Group__1__Impl : ( ( rule__PlusOrMinusExpression__Group_1__0 )* ) ;
    public final void rule__PlusOrMinusExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3397:1: ( ( ( rule__PlusOrMinusExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:3398:1: ( ( rule__PlusOrMinusExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:3398:1: ( ( rule__PlusOrMinusExpression__Group_1__0 )* )
            // InternalQueryDsl.g:3399:2: ( rule__PlusOrMinusExpression__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:3400:2: ( rule__PlusOrMinusExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=42 && LA36_0<=43)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalQueryDsl.g:3400:3: rule__PlusOrMinusExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__PlusOrMinusExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1__0"
    // InternalQueryDsl.g:3409:1: rule__PlusOrMinusExpression__Group_1__0 : rule__PlusOrMinusExpression__Group_1__0__Impl rule__PlusOrMinusExpression__Group_1__1 ;
    public final void rule__PlusOrMinusExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3413:1: ( rule__PlusOrMinusExpression__Group_1__0__Impl rule__PlusOrMinusExpression__Group_1__1 )
            // InternalQueryDsl.g:3414:2: rule__PlusOrMinusExpression__Group_1__0__Impl rule__PlusOrMinusExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PlusOrMinusExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1__0"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:3421:1: rule__PlusOrMinusExpression__Group_1__0__Impl : ( ( rule__PlusOrMinusExpression__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinusExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3425:1: ( ( ( rule__PlusOrMinusExpression__Alternatives_1_0 ) ) )
            // InternalQueryDsl.g:3426:1: ( ( rule__PlusOrMinusExpression__Alternatives_1_0 ) )
            {
            // InternalQueryDsl.g:3426:1: ( ( rule__PlusOrMinusExpression__Alternatives_1_0 ) )
            // InternalQueryDsl.g:3427:2: ( rule__PlusOrMinusExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getAlternatives_1_0()); 
            // InternalQueryDsl.g:3428:2: ( rule__PlusOrMinusExpression__Alternatives_1_0 )
            // InternalQueryDsl.g:3428:3: rule__PlusOrMinusExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1__1"
    // InternalQueryDsl.g:3436:1: rule__PlusOrMinusExpression__Group_1__1 : rule__PlusOrMinusExpression__Group_1__1__Impl ;
    public final void rule__PlusOrMinusExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3440:1: ( rule__PlusOrMinusExpression__Group_1__1__Impl )
            // InternalQueryDsl.g:3441:2: rule__PlusOrMinusExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1__1"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:3447:1: rule__PlusOrMinusExpression__Group_1__1__Impl : ( ( rule__PlusOrMinusExpression__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinusExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3451:1: ( ( ( rule__PlusOrMinusExpression__RightAssignment_1_1 ) ) )
            // InternalQueryDsl.g:3452:1: ( ( rule__PlusOrMinusExpression__RightAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:3452:1: ( ( rule__PlusOrMinusExpression__RightAssignment_1_1 ) )
            // InternalQueryDsl.g:3453:2: ( rule__PlusOrMinusExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getRightAssignment_1_1()); 
            // InternalQueryDsl.g:3454:2: ( rule__PlusOrMinusExpression__RightAssignment_1_1 )
            // InternalQueryDsl.g:3454:3: rule__PlusOrMinusExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_0__0"
    // InternalQueryDsl.g:3463:1: rule__PlusOrMinusExpression__Group_1_0_0__0 : rule__PlusOrMinusExpression__Group_1_0_0__0__Impl rule__PlusOrMinusExpression__Group_1_0_0__1 ;
    public final void rule__PlusOrMinusExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3467:1: ( rule__PlusOrMinusExpression__Group_1_0_0__0__Impl rule__PlusOrMinusExpression__Group_1_0_0__1 )
            // InternalQueryDsl.g:3468:2: rule__PlusOrMinusExpression__Group_1_0_0__0__Impl rule__PlusOrMinusExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__PlusOrMinusExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_0__0__Impl"
    // InternalQueryDsl.g:3475:1: rule__PlusOrMinusExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinusExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3479:1: ( ( () ) )
            // InternalQueryDsl.g:3480:1: ( () )
            {
            // InternalQueryDsl.g:3480:1: ( () )
            // InternalQueryDsl.g:3481:2: ()
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getPlusExpressionLeftAction_1_0_0_0()); 
            // InternalQueryDsl.g:3482:2: ()
            // InternalQueryDsl.g:3482:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusExpressionAccess().getPlusExpressionLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_0__1"
    // InternalQueryDsl.g:3490:1: rule__PlusOrMinusExpression__Group_1_0_0__1 : rule__PlusOrMinusExpression__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinusExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3494:1: ( rule__PlusOrMinusExpression__Group_1_0_0__1__Impl )
            // InternalQueryDsl.g:3495:2: rule__PlusOrMinusExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_0__1__Impl"
    // InternalQueryDsl.g:3501:1: rule__PlusOrMinusExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinusExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3505:1: ( ( '+' ) )
            // InternalQueryDsl.g:3506:1: ( '+' )
            {
            // InternalQueryDsl.g:3506:1: ( '+' )
            // InternalQueryDsl.g:3507:2: '+'
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_1__0"
    // InternalQueryDsl.g:3517:1: rule__PlusOrMinusExpression__Group_1_0_1__0 : rule__PlusOrMinusExpression__Group_1_0_1__0__Impl rule__PlusOrMinusExpression__Group_1_0_1__1 ;
    public final void rule__PlusOrMinusExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3521:1: ( rule__PlusOrMinusExpression__Group_1_0_1__0__Impl rule__PlusOrMinusExpression__Group_1_0_1__1 )
            // InternalQueryDsl.g:3522:2: rule__PlusOrMinusExpression__Group_1_0_1__0__Impl rule__PlusOrMinusExpression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_30);
            rule__PlusOrMinusExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_1__0__Impl"
    // InternalQueryDsl.g:3529:1: rule__PlusOrMinusExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinusExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3533:1: ( ( () ) )
            // InternalQueryDsl.g:3534:1: ( () )
            {
            // InternalQueryDsl.g:3534:1: ( () )
            // InternalQueryDsl.g:3535:2: ()
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getMinusExpressionLeftAction_1_0_1_0()); 
            // InternalQueryDsl.g:3536:2: ()
            // InternalQueryDsl.g:3536:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusExpressionAccess().getMinusExpressionLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_1__1"
    // InternalQueryDsl.g:3544:1: rule__PlusOrMinusExpression__Group_1_0_1__1 : rule__PlusOrMinusExpression__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinusExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3548:1: ( rule__PlusOrMinusExpression__Group_1_0_1__1__Impl )
            // InternalQueryDsl.g:3549:2: rule__PlusOrMinusExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinusExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinusExpression__Group_1_0_1__1__Impl"
    // InternalQueryDsl.g:3555:1: rule__PlusOrMinusExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinusExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3559:1: ( ( '-' ) )
            // InternalQueryDsl.g:3560:1: ( '-' )
            {
            // InternalQueryDsl.g:3560:1: ( '-' )
            // InternalQueryDsl.g:3561:2: '-'
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group__0"
    // InternalQueryDsl.g:3571:1: rule__MultiplicationOrDivisionExpression__Group__0 : rule__MultiplicationOrDivisionExpression__Group__0__Impl rule__MultiplicationOrDivisionExpression__Group__1 ;
    public final void rule__MultiplicationOrDivisionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3575:1: ( rule__MultiplicationOrDivisionExpression__Group__0__Impl rule__MultiplicationOrDivisionExpression__Group__1 )
            // InternalQueryDsl.g:3576:2: rule__MultiplicationOrDivisionExpression__Group__0__Impl rule__MultiplicationOrDivisionExpression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MultiplicationOrDivisionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group__0"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group__0__Impl"
    // InternalQueryDsl.g:3583:1: rule__MultiplicationOrDivisionExpression__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3587:1: ( ( rulePrimaryExpression ) )
            // InternalQueryDsl.g:3588:1: ( rulePrimaryExpression )
            {
            // InternalQueryDsl.g:3588:1: ( rulePrimaryExpression )
            // InternalQueryDsl.g:3589:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group__1"
    // InternalQueryDsl.g:3598:1: rule__MultiplicationOrDivisionExpression__Group__1 : rule__MultiplicationOrDivisionExpression__Group__1__Impl ;
    public final void rule__MultiplicationOrDivisionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3602:1: ( rule__MultiplicationOrDivisionExpression__Group__1__Impl )
            // InternalQueryDsl.g:3603:2: rule__MultiplicationOrDivisionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group__1"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group__1__Impl"
    // InternalQueryDsl.g:3609:1: rule__MultiplicationOrDivisionExpression__Group__1__Impl : ( ( rule__MultiplicationOrDivisionExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3613:1: ( ( ( rule__MultiplicationOrDivisionExpression__Group_1__0 )* ) )
            // InternalQueryDsl.g:3614:1: ( ( rule__MultiplicationOrDivisionExpression__Group_1__0 )* )
            {
            // InternalQueryDsl.g:3614:1: ( ( rule__MultiplicationOrDivisionExpression__Group_1__0 )* )
            // InternalQueryDsl.g:3615:2: ( rule__MultiplicationOrDivisionExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup_1()); 
            // InternalQueryDsl.g:3616:2: ( rule__MultiplicationOrDivisionExpression__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=44 && LA37_0<=45)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalQueryDsl.g:3616:3: rule__MultiplicationOrDivisionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__MultiplicationOrDivisionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1__0"
    // InternalQueryDsl.g:3625:1: rule__MultiplicationOrDivisionExpression__Group_1__0 : rule__MultiplicationOrDivisionExpression__Group_1__0__Impl rule__MultiplicationOrDivisionExpression__Group_1__1 ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3629:1: ( rule__MultiplicationOrDivisionExpression__Group_1__0__Impl rule__MultiplicationOrDivisionExpression__Group_1__1 )
            // InternalQueryDsl.g:3630:2: rule__MultiplicationOrDivisionExpression__Group_1__0__Impl rule__MultiplicationOrDivisionExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MultiplicationOrDivisionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:3637:1: rule__MultiplicationOrDivisionExpression__Group_1__0__Impl : ( ( rule__MultiplicationOrDivisionExpression__Alternatives_1_0 ) ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3641:1: ( ( ( rule__MultiplicationOrDivisionExpression__Alternatives_1_0 ) ) )
            // InternalQueryDsl.g:3642:1: ( ( rule__MultiplicationOrDivisionExpression__Alternatives_1_0 ) )
            {
            // InternalQueryDsl.g:3642:1: ( ( rule__MultiplicationOrDivisionExpression__Alternatives_1_0 ) )
            // InternalQueryDsl.g:3643:2: ( rule__MultiplicationOrDivisionExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getAlternatives_1_0()); 
            // InternalQueryDsl.g:3644:2: ( rule__MultiplicationOrDivisionExpression__Alternatives_1_0 )
            // InternalQueryDsl.g:3644:3: rule__MultiplicationOrDivisionExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1__1"
    // InternalQueryDsl.g:3652:1: rule__MultiplicationOrDivisionExpression__Group_1__1 : rule__MultiplicationOrDivisionExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3656:1: ( rule__MultiplicationOrDivisionExpression__Group_1__1__Impl )
            // InternalQueryDsl.g:3657:2: rule__MultiplicationOrDivisionExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:3663:1: rule__MultiplicationOrDivisionExpression__Group_1__1__Impl : ( ( rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3667:1: ( ( ( rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 ) ) )
            // InternalQueryDsl.g:3668:1: ( ( rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:3668:1: ( ( rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 ) )
            // InternalQueryDsl.g:3669:2: ( rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getRightAssignment_1_1()); 
            // InternalQueryDsl.g:3670:2: ( rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 )
            // InternalQueryDsl.g:3670:3: rule__MultiplicationOrDivisionExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_0__0"
    // InternalQueryDsl.g:3679:1: rule__MultiplicationOrDivisionExpression__Group_1_0_0__0 : rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl rule__MultiplicationOrDivisionExpression__Group_1_0_0__1 ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3683:1: ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl rule__MultiplicationOrDivisionExpression__Group_1_0_0__1 )
            // InternalQueryDsl.g:3684:2: rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl rule__MultiplicationOrDivisionExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_35);
            rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl"
    // InternalQueryDsl.g:3691:1: rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3695:1: ( ( () ) )
            // InternalQueryDsl.g:3696:1: ( () )
            {
            // InternalQueryDsl.g:3696:1: ( () )
            // InternalQueryDsl.g:3697:2: ()
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0()); 
            // InternalQueryDsl.g:3698:2: ()
            // InternalQueryDsl.g:3698:3: 
            {
            }

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_0__1"
    // InternalQueryDsl.g:3706:1: rule__MultiplicationOrDivisionExpression__Group_1_0_0__1 : rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3710:1: ( rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl )
            // InternalQueryDsl.g:3711:2: rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl"
    // InternalQueryDsl.g:3717:1: rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3721:1: ( ( '*' ) )
            // InternalQueryDsl.g:3722:1: ( '*' )
            {
            // InternalQueryDsl.g:3722:1: ( '*' )
            // InternalQueryDsl.g:3723:2: '*'
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_1__0"
    // InternalQueryDsl.g:3733:1: rule__MultiplicationOrDivisionExpression__Group_1_0_1__0 : rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl rule__MultiplicationOrDivisionExpression__Group_1_0_1__1 ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3737:1: ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl rule__MultiplicationOrDivisionExpression__Group_1_0_1__1 )
            // InternalQueryDsl.g:3738:2: rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl rule__MultiplicationOrDivisionExpression__Group_1_0_1__1
            {
            pushFollow(FOLLOW_33);
            rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_1__0"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl"
    // InternalQueryDsl.g:3745:1: rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3749:1: ( ( () ) )
            // InternalQueryDsl.g:3750:1: ( () )
            {
            // InternalQueryDsl.g:3750:1: ( () )
            // InternalQueryDsl.g:3751:2: ()
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0_1_0()); 
            // InternalQueryDsl.g:3752:2: ()
            // InternalQueryDsl.g:3752:3: 
            {
            }

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_1__1"
    // InternalQueryDsl.g:3760:1: rule__MultiplicationOrDivisionExpression__Group_1_0_1__1 : rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3764:1: ( rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl )
            // InternalQueryDsl.g:3765:2: rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_1__1"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl"
    // InternalQueryDsl.g:3771:1: rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3775:1: ( ( '/' ) )
            // InternalQueryDsl.g:3776:1: ( '/' )
            {
            // InternalQueryDsl.g:3776:1: ( '/' )
            // InternalQueryDsl.g:3777:2: '/'
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalQueryDsl.g:3787:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3791:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalQueryDsl.g:3792:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalQueryDsl.g:3799:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3803:1: ( ( '(' ) )
            // InternalQueryDsl.g:3804:1: ( '(' )
            {
            // InternalQueryDsl.g:3804:1: ( '(' )
            // InternalQueryDsl.g:3805:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalQueryDsl.g:3814:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3818:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalQueryDsl.g:3819:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalQueryDsl.g:3826:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3830:1: ( ( ruleExpression ) )
            // InternalQueryDsl.g:3831:1: ( ruleExpression )
            {
            // InternalQueryDsl.g:3831:1: ( ruleExpression )
            // InternalQueryDsl.g:3832:2: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalQueryDsl.g:3841:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3845:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalQueryDsl.g:3846:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalQueryDsl.g:3852:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3856:1: ( ( ')' ) )
            // InternalQueryDsl.g:3857:1: ( ')' )
            {
            // InternalQueryDsl.g:3857:1: ( ')' )
            // InternalQueryDsl.g:3858:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalQueryDsl.g:3868:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3872:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalQueryDsl.g:3873:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:3880:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3884:1: ( ( () ) )
            // InternalQueryDsl.g:3885:1: ( () )
            {
            // InternalQueryDsl.g:3885:1: ( () )
            // InternalQueryDsl.g:3886:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNotExpressionAction_1_0()); 
            // InternalQueryDsl.g:3887:2: ()
            // InternalQueryDsl.g:3887:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNotExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalQueryDsl.g:3895:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3899:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // InternalQueryDsl.g:3900:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:3907:1: rule__PrimaryExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3911:1: ( ( '!' ) )
            // InternalQueryDsl.g:3912:1: ( '!' )
            {
            // InternalQueryDsl.g:3912:1: ( '!' )
            // InternalQueryDsl.g:3913:2: '!'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // InternalQueryDsl.g:3922:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3926:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // InternalQueryDsl.g:3927:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // InternalQueryDsl.g:3933:1: rule__PrimaryExpression__Group_1__2__Impl : ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3937:1: ( ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) ) )
            // InternalQueryDsl.g:3938:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:3938:1: ( ( rule__PrimaryExpression__ExpressionAssignment_1_2 ) )
            // InternalQueryDsl.g:3939:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 
            // InternalQueryDsl.g:3940:2: ( rule__PrimaryExpression__ExpressionAssignment_1_2 )
            // InternalQueryDsl.g:3940:3: rule__PrimaryExpression__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_0__0"
    // InternalQueryDsl.g:3949:1: rule__ConstantExpression__Group_0__0 : rule__ConstantExpression__Group_0__0__Impl rule__ConstantExpression__Group_0__1 ;
    public final void rule__ConstantExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3953:1: ( rule__ConstantExpression__Group_0__0__Impl rule__ConstantExpression__Group_0__1 )
            // InternalQueryDsl.g:3954:2: rule__ConstantExpression__Group_0__0__Impl rule__ConstantExpression__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__ConstantExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_0__0"


    // $ANTLR start "rule__ConstantExpression__Group_0__0__Impl"
    // InternalQueryDsl.g:3961:1: rule__ConstantExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__ConstantExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3965:1: ( ( () ) )
            // InternalQueryDsl.g:3966:1: ( () )
            {
            // InternalQueryDsl.g:3966:1: ( () )
            // InternalQueryDsl.g:3967:2: ()
            {
             before(grammarAccess.getConstantExpressionAccess().getIntConstantAction_0_0()); 
            // InternalQueryDsl.g:3968:2: ()
            // InternalQueryDsl.g:3968:3: 
            {
            }

             after(grammarAccess.getConstantExpressionAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_0__1"
    // InternalQueryDsl.g:3976:1: rule__ConstantExpression__Group_0__1 : rule__ConstantExpression__Group_0__1__Impl ;
    public final void rule__ConstantExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3980:1: ( rule__ConstantExpression__Group_0__1__Impl )
            // InternalQueryDsl.g:3981:2: rule__ConstantExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_0__1"


    // $ANTLR start "rule__ConstantExpression__Group_0__1__Impl"
    // InternalQueryDsl.g:3987:1: rule__ConstantExpression__Group_0__1__Impl : ( ( rule__ConstantExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__ConstantExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3991:1: ( ( ( rule__ConstantExpression__ValueAssignment_0_1 ) ) )
            // InternalQueryDsl.g:3992:1: ( ( rule__ConstantExpression__ValueAssignment_0_1 ) )
            {
            // InternalQueryDsl.g:3992:1: ( ( rule__ConstantExpression__ValueAssignment_0_1 ) )
            // InternalQueryDsl.g:3993:2: ( rule__ConstantExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantExpressionAccess().getValueAssignment_0_1()); 
            // InternalQueryDsl.g:3994:2: ( rule__ConstantExpression__ValueAssignment_0_1 )
            // InternalQueryDsl.g:3994:3: rule__ConstantExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_0__1__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_1__0"
    // InternalQueryDsl.g:4003:1: rule__ConstantExpression__Group_1__0 : rule__ConstantExpression__Group_1__0__Impl rule__ConstantExpression__Group_1__1 ;
    public final void rule__ConstantExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4007:1: ( rule__ConstantExpression__Group_1__0__Impl rule__ConstantExpression__Group_1__1 )
            // InternalQueryDsl.g:4008:2: rule__ConstantExpression__Group_1__0__Impl rule__ConstantExpression__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__ConstantExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_1__0"


    // $ANTLR start "rule__ConstantExpression__Group_1__0__Impl"
    // InternalQueryDsl.g:4015:1: rule__ConstantExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ConstantExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4019:1: ( ( () ) )
            // InternalQueryDsl.g:4020:1: ( () )
            {
            // InternalQueryDsl.g:4020:1: ( () )
            // InternalQueryDsl.g:4021:2: ()
            {
             before(grammarAccess.getConstantExpressionAccess().getStringConstantAction_1_0()); 
            // InternalQueryDsl.g:4022:2: ()
            // InternalQueryDsl.g:4022:3: 
            {
            }

             after(grammarAccess.getConstantExpressionAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_1__1"
    // InternalQueryDsl.g:4030:1: rule__ConstantExpression__Group_1__1 : rule__ConstantExpression__Group_1__1__Impl ;
    public final void rule__ConstantExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4034:1: ( rule__ConstantExpression__Group_1__1__Impl )
            // InternalQueryDsl.g:4035:2: rule__ConstantExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_1__1"


    // $ANTLR start "rule__ConstantExpression__Group_1__1__Impl"
    // InternalQueryDsl.g:4041:1: rule__ConstantExpression__Group_1__1__Impl : ( ( rule__ConstantExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__ConstantExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4045:1: ( ( ( rule__ConstantExpression__ValueAssignment_1_1 ) ) )
            // InternalQueryDsl.g:4046:1: ( ( rule__ConstantExpression__ValueAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:4046:1: ( ( rule__ConstantExpression__ValueAssignment_1_1 ) )
            // InternalQueryDsl.g:4047:2: ( rule__ConstantExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantExpressionAccess().getValueAssignment_1_1()); 
            // InternalQueryDsl.g:4048:2: ( rule__ConstantExpression__ValueAssignment_1_1 )
            // InternalQueryDsl.g:4048:3: rule__ConstantExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_2__0"
    // InternalQueryDsl.g:4057:1: rule__ConstantExpression__Group_2__0 : rule__ConstantExpression__Group_2__0__Impl rule__ConstantExpression__Group_2__1 ;
    public final void rule__ConstantExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4061:1: ( rule__ConstantExpression__Group_2__0__Impl rule__ConstantExpression__Group_2__1 )
            // InternalQueryDsl.g:4062:2: rule__ConstantExpression__Group_2__0__Impl rule__ConstantExpression__Group_2__1
            {
            pushFollow(FOLLOW_39);
            rule__ConstantExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_2__0"


    // $ANTLR start "rule__ConstantExpression__Group_2__0__Impl"
    // InternalQueryDsl.g:4069:1: rule__ConstantExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__ConstantExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4073:1: ( ( () ) )
            // InternalQueryDsl.g:4074:1: ( () )
            {
            // InternalQueryDsl.g:4074:1: ( () )
            // InternalQueryDsl.g:4075:2: ()
            {
             before(grammarAccess.getConstantExpressionAccess().getBoolConstantAction_2_0()); 
            // InternalQueryDsl.g:4076:2: ()
            // InternalQueryDsl.g:4076:3: 
            {
            }

             after(grammarAccess.getConstantExpressionAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_2__1"
    // InternalQueryDsl.g:4084:1: rule__ConstantExpression__Group_2__1 : rule__ConstantExpression__Group_2__1__Impl ;
    public final void rule__ConstantExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4088:1: ( rule__ConstantExpression__Group_2__1__Impl )
            // InternalQueryDsl.g:4089:2: rule__ConstantExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_2__1"


    // $ANTLR start "rule__ConstantExpression__Group_2__1__Impl"
    // InternalQueryDsl.g:4095:1: rule__ConstantExpression__Group_2__1__Impl : ( ( rule__ConstantExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__ConstantExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4099:1: ( ( ( rule__ConstantExpression__ValueAssignment_2_1 ) ) )
            // InternalQueryDsl.g:4100:1: ( ( rule__ConstantExpression__ValueAssignment_2_1 ) )
            {
            // InternalQueryDsl.g:4100:1: ( ( rule__ConstantExpression__ValueAssignment_2_1 ) )
            // InternalQueryDsl.g:4101:2: ( rule__ConstantExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantExpressionAccess().getValueAssignment_2_1()); 
            // InternalQueryDsl.g:4102:2: ( rule__ConstantExpression__ValueAssignment_2_1 )
            // InternalQueryDsl.g:4102:3: rule__ConstantExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_2__1__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_3__0"
    // InternalQueryDsl.g:4111:1: rule__ConstantExpression__Group_3__0 : rule__ConstantExpression__Group_3__0__Impl rule__ConstantExpression__Group_3__1 ;
    public final void rule__ConstantExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4115:1: ( rule__ConstantExpression__Group_3__0__Impl rule__ConstantExpression__Group_3__1 )
            // InternalQueryDsl.g:4116:2: rule__ConstantExpression__Group_3__0__Impl rule__ConstantExpression__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ConstantExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_3__0"


    // $ANTLR start "rule__ConstantExpression__Group_3__0__Impl"
    // InternalQueryDsl.g:4123:1: rule__ConstantExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__ConstantExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4127:1: ( ( () ) )
            // InternalQueryDsl.g:4128:1: ( () )
            {
            // InternalQueryDsl.g:4128:1: ( () )
            // InternalQueryDsl.g:4129:2: ()
            {
             before(grammarAccess.getConstantExpressionAccess().getNullConstantAction_3_0()); 
            // InternalQueryDsl.g:4130:2: ()
            // InternalQueryDsl.g:4130:3: 
            {
            }

             after(grammarAccess.getConstantExpressionAccess().getNullConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_3__0__Impl"


    // $ANTLR start "rule__ConstantExpression__Group_3__1"
    // InternalQueryDsl.g:4138:1: rule__ConstantExpression__Group_3__1 : rule__ConstantExpression__Group_3__1__Impl ;
    public final void rule__ConstantExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4142:1: ( rule__ConstantExpression__Group_3__1__Impl )
            // InternalQueryDsl.g:4143:2: rule__ConstantExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_3__1"


    // $ANTLR start "rule__ConstantExpression__Group_3__1__Impl"
    // InternalQueryDsl.g:4149:1: rule__ConstantExpression__Group_3__1__Impl : ( ( rule__ConstantExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__ConstantExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4153:1: ( ( ( rule__ConstantExpression__ValueAssignment_3_1 ) ) )
            // InternalQueryDsl.g:4154:1: ( ( rule__ConstantExpression__ValueAssignment_3_1 ) )
            {
            // InternalQueryDsl.g:4154:1: ( ( rule__ConstantExpression__ValueAssignment_3_1 ) )
            // InternalQueryDsl.g:4155:2: ( rule__ConstantExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantExpressionAccess().getValueAssignment_3_1()); 
            // InternalQueryDsl.g:4156:2: ( rule__ConstantExpression__ValueAssignment_3_1 )
            // InternalQueryDsl.g:4156:3: rule__ConstantExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantExpressionAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__Group_3__1__Impl"


    // $ANTLR start "rule__OldValueExpression__Group__0"
    // InternalQueryDsl.g:4165:1: rule__OldValueExpression__Group__0 : rule__OldValueExpression__Group__0__Impl rule__OldValueExpression__Group__1 ;
    public final void rule__OldValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4169:1: ( rule__OldValueExpression__Group__0__Impl rule__OldValueExpression__Group__1 )
            // InternalQueryDsl.g:4170:2: rule__OldValueExpression__Group__0__Impl rule__OldValueExpression__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__OldValueExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldValueExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__0"


    // $ANTLR start "rule__OldValueExpression__Group__0__Impl"
    // InternalQueryDsl.g:4177:1: rule__OldValueExpression__Group__0__Impl : ( () ) ;
    public final void rule__OldValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4181:1: ( ( () ) )
            // InternalQueryDsl.g:4182:1: ( () )
            {
            // InternalQueryDsl.g:4182:1: ( () )
            // InternalQueryDsl.g:4183:2: ()
            {
             before(grammarAccess.getOldValueExpressionAccess().getOldValueExpressionAction_0()); 
            // InternalQueryDsl.g:4184:2: ()
            // InternalQueryDsl.g:4184:3: 
            {
            }

             after(grammarAccess.getOldValueExpressionAccess().getOldValueExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__0__Impl"


    // $ANTLR start "rule__OldValueExpression__Group__1"
    // InternalQueryDsl.g:4192:1: rule__OldValueExpression__Group__1 : rule__OldValueExpression__Group__1__Impl rule__OldValueExpression__Group__2 ;
    public final void rule__OldValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4196:1: ( rule__OldValueExpression__Group__1__Impl rule__OldValueExpression__Group__2 )
            // InternalQueryDsl.g:4197:2: rule__OldValueExpression__Group__1__Impl rule__OldValueExpression__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__OldValueExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldValueExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__1"


    // $ANTLR start "rule__OldValueExpression__Group__1__Impl"
    // InternalQueryDsl.g:4204:1: rule__OldValueExpression__Group__1__Impl : ( 'old' ) ;
    public final void rule__OldValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4208:1: ( ( 'old' ) )
            // InternalQueryDsl.g:4209:1: ( 'old' )
            {
            // InternalQueryDsl.g:4209:1: ( 'old' )
            // InternalQueryDsl.g:4210:2: 'old'
            {
             before(grammarAccess.getOldValueExpressionAccess().getOldKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOldValueExpressionAccess().getOldKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__1__Impl"


    // $ANTLR start "rule__OldValueExpression__Group__2"
    // InternalQueryDsl.g:4219:1: rule__OldValueExpression__Group__2 : rule__OldValueExpression__Group__2__Impl rule__OldValueExpression__Group__3 ;
    public final void rule__OldValueExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4223:1: ( rule__OldValueExpression__Group__2__Impl rule__OldValueExpression__Group__3 )
            // InternalQueryDsl.g:4224:2: rule__OldValueExpression__Group__2__Impl rule__OldValueExpression__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__OldValueExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldValueExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__2"


    // $ANTLR start "rule__OldValueExpression__Group__2__Impl"
    // InternalQueryDsl.g:4231:1: rule__OldValueExpression__Group__2__Impl : ( '(' ) ;
    public final void rule__OldValueExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4235:1: ( ( '(' ) )
            // InternalQueryDsl.g:4236:1: ( '(' )
            {
            // InternalQueryDsl.g:4236:1: ( '(' )
            // InternalQueryDsl.g:4237:2: '('
            {
             before(grammarAccess.getOldValueExpressionAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOldValueExpressionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__2__Impl"


    // $ANTLR start "rule__OldValueExpression__Group__3"
    // InternalQueryDsl.g:4246:1: rule__OldValueExpression__Group__3 : rule__OldValueExpression__Group__3__Impl rule__OldValueExpression__Group__4 ;
    public final void rule__OldValueExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4250:1: ( rule__OldValueExpression__Group__3__Impl rule__OldValueExpression__Group__4 )
            // InternalQueryDsl.g:4251:2: rule__OldValueExpression__Group__3__Impl rule__OldValueExpression__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__OldValueExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OldValueExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__3"


    // $ANTLR start "rule__OldValueExpression__Group__3__Impl"
    // InternalQueryDsl.g:4258:1: rule__OldValueExpression__Group__3__Impl : ( ( rule__OldValueExpression__ExpressionAssignment_3 ) ) ;
    public final void rule__OldValueExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4262:1: ( ( ( rule__OldValueExpression__ExpressionAssignment_3 ) ) )
            // InternalQueryDsl.g:4263:1: ( ( rule__OldValueExpression__ExpressionAssignment_3 ) )
            {
            // InternalQueryDsl.g:4263:1: ( ( rule__OldValueExpression__ExpressionAssignment_3 ) )
            // InternalQueryDsl.g:4264:2: ( rule__OldValueExpression__ExpressionAssignment_3 )
            {
             before(grammarAccess.getOldValueExpressionAccess().getExpressionAssignment_3()); 
            // InternalQueryDsl.g:4265:2: ( rule__OldValueExpression__ExpressionAssignment_3 )
            // InternalQueryDsl.g:4265:3: rule__OldValueExpression__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OldValueExpression__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOldValueExpressionAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__3__Impl"


    // $ANTLR start "rule__OldValueExpression__Group__4"
    // InternalQueryDsl.g:4273:1: rule__OldValueExpression__Group__4 : rule__OldValueExpression__Group__4__Impl ;
    public final void rule__OldValueExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4277:1: ( rule__OldValueExpression__Group__4__Impl )
            // InternalQueryDsl.g:4278:2: rule__OldValueExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OldValueExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__4"


    // $ANTLR start "rule__OldValueExpression__Group__4__Impl"
    // InternalQueryDsl.g:4284:1: rule__OldValueExpression__Group__4__Impl : ( ')' ) ;
    public final void rule__OldValueExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4288:1: ( ( ')' ) )
            // InternalQueryDsl.g:4289:1: ( ')' )
            {
            // InternalQueryDsl.g:4289:1: ( ')' )
            // InternalQueryDsl.g:4290:2: ')'
            {
             before(grammarAccess.getOldValueExpressionAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOldValueExpressionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__Group__4__Impl"


    // $ANTLR start "rule__PropertyPathExpression__Group__0"
    // InternalQueryDsl.g:4300:1: rule__PropertyPathExpression__Group__0 : rule__PropertyPathExpression__Group__0__Impl rule__PropertyPathExpression__Group__1 ;
    public final void rule__PropertyPathExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4304:1: ( rule__PropertyPathExpression__Group__0__Impl rule__PropertyPathExpression__Group__1 )
            // InternalQueryDsl.g:4305:2: rule__PropertyPathExpression__Group__0__Impl rule__PropertyPathExpression__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__PropertyPathExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyPathExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__Group__0"


    // $ANTLR start "rule__PropertyPathExpression__Group__0__Impl"
    // InternalQueryDsl.g:4312:1: rule__PropertyPathExpression__Group__0__Impl : ( () ) ;
    public final void rule__PropertyPathExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4316:1: ( ( () ) )
            // InternalQueryDsl.g:4317:1: ( () )
            {
            // InternalQueryDsl.g:4317:1: ( () )
            // InternalQueryDsl.g:4318:2: ()
            {
             before(grammarAccess.getPropertyPathExpressionAccess().getStatementsExpressionAction_0()); 
            // InternalQueryDsl.g:4319:2: ()
            // InternalQueryDsl.g:4319:3: 
            {
            }

             after(grammarAccess.getPropertyPathExpressionAccess().getStatementsExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__Group__0__Impl"


    // $ANTLR start "rule__PropertyPathExpression__Group__1"
    // InternalQueryDsl.g:4327:1: rule__PropertyPathExpression__Group__1 : rule__PropertyPathExpression__Group__1__Impl rule__PropertyPathExpression__Group__2 ;
    public final void rule__PropertyPathExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4331:1: ( rule__PropertyPathExpression__Group__1__Impl rule__PropertyPathExpression__Group__2 )
            // InternalQueryDsl.g:4332:2: rule__PropertyPathExpression__Group__1__Impl rule__PropertyPathExpression__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__PropertyPathExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyPathExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__Group__1"


    // $ANTLR start "rule__PropertyPathExpression__Group__1__Impl"
    // InternalQueryDsl.g:4339:1: rule__PropertyPathExpression__Group__1__Impl : ( ( rule__PropertyPathExpression__StatementsAssignment_1 ) ) ;
    public final void rule__PropertyPathExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4343:1: ( ( ( rule__PropertyPathExpression__StatementsAssignment_1 ) ) )
            // InternalQueryDsl.g:4344:1: ( ( rule__PropertyPathExpression__StatementsAssignment_1 ) )
            {
            // InternalQueryDsl.g:4344:1: ( ( rule__PropertyPathExpression__StatementsAssignment_1 ) )
            // InternalQueryDsl.g:4345:2: ( rule__PropertyPathExpression__StatementsAssignment_1 )
            {
             before(grammarAccess.getPropertyPathExpressionAccess().getStatementsAssignment_1()); 
            // InternalQueryDsl.g:4346:2: ( rule__PropertyPathExpression__StatementsAssignment_1 )
            // InternalQueryDsl.g:4346:3: rule__PropertyPathExpression__StatementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyPathExpression__StatementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyPathExpressionAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__Group__1__Impl"


    // $ANTLR start "rule__PropertyPathExpression__Group__2"
    // InternalQueryDsl.g:4354:1: rule__PropertyPathExpression__Group__2 : rule__PropertyPathExpression__Group__2__Impl ;
    public final void rule__PropertyPathExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4358:1: ( rule__PropertyPathExpression__Group__2__Impl )
            // InternalQueryDsl.g:4359:2: rule__PropertyPathExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyPathExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__Group__2"


    // $ANTLR start "rule__PropertyPathExpression__Group__2__Impl"
    // InternalQueryDsl.g:4365:1: rule__PropertyPathExpression__Group__2__Impl : ( ( rule__PropertyPathExpression__StatementsAssignment_2 )* ) ;
    public final void rule__PropertyPathExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4369:1: ( ( ( rule__PropertyPathExpression__StatementsAssignment_2 )* ) )
            // InternalQueryDsl.g:4370:1: ( ( rule__PropertyPathExpression__StatementsAssignment_2 )* )
            {
            // InternalQueryDsl.g:4370:1: ( ( rule__PropertyPathExpression__StatementsAssignment_2 )* )
            // InternalQueryDsl.g:4371:2: ( rule__PropertyPathExpression__StatementsAssignment_2 )*
            {
             before(grammarAccess.getPropertyPathExpressionAccess().getStatementsAssignment_2()); 
            // InternalQueryDsl.g:4372:2: ( rule__PropertyPathExpression__StatementsAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=48 && LA38_0<=49)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalQueryDsl.g:4372:3: rule__PropertyPathExpression__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__PropertyPathExpression__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getPropertyPathExpressionAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__Group__2__Impl"


    // $ANTLR start "rule__NavigatedStatement__Group_0__0"
    // InternalQueryDsl.g:4381:1: rule__NavigatedStatement__Group_0__0 : rule__NavigatedStatement__Group_0__0__Impl rule__NavigatedStatement__Group_0__1 ;
    public final void rule__NavigatedStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4385:1: ( rule__NavigatedStatement__Group_0__0__Impl rule__NavigatedStatement__Group_0__1 )
            // InternalQueryDsl.g:4386:2: rule__NavigatedStatement__Group_0__0__Impl rule__NavigatedStatement__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__NavigatedStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_0__0"


    // $ANTLR start "rule__NavigatedStatement__Group_0__0__Impl"
    // InternalQueryDsl.g:4393:1: rule__NavigatedStatement__Group_0__0__Impl : ( '.' ) ;
    public final void rule__NavigatedStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4397:1: ( ( '.' ) )
            // InternalQueryDsl.g:4398:1: ( '.' )
            {
            // InternalQueryDsl.g:4398:1: ( '.' )
            // InternalQueryDsl.g:4399:2: '.'
            {
             before(grammarAccess.getNavigatedStatementAccess().getFullStopKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNavigatedStatementAccess().getFullStopKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_0__0__Impl"


    // $ANTLR start "rule__NavigatedStatement__Group_0__1"
    // InternalQueryDsl.g:4408:1: rule__NavigatedStatement__Group_0__1 : rule__NavigatedStatement__Group_0__1__Impl ;
    public final void rule__NavigatedStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4412:1: ( rule__NavigatedStatement__Group_0__1__Impl )
            // InternalQueryDsl.g:4413:2: rule__NavigatedStatement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_0__1"


    // $ANTLR start "rule__NavigatedStatement__Group_0__1__Impl"
    // InternalQueryDsl.g:4419:1: rule__NavigatedStatement__Group_0__1__Impl : ( ( rule__NavigatedStatement__MethodCallAssignment_0_1 ) ) ;
    public final void rule__NavigatedStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4423:1: ( ( ( rule__NavigatedStatement__MethodCallAssignment_0_1 ) ) )
            // InternalQueryDsl.g:4424:1: ( ( rule__NavigatedStatement__MethodCallAssignment_0_1 ) )
            {
            // InternalQueryDsl.g:4424:1: ( ( rule__NavigatedStatement__MethodCallAssignment_0_1 ) )
            // InternalQueryDsl.g:4425:2: ( rule__NavigatedStatement__MethodCallAssignment_0_1 )
            {
             before(grammarAccess.getNavigatedStatementAccess().getMethodCallAssignment_0_1()); 
            // InternalQueryDsl.g:4426:2: ( rule__NavigatedStatement__MethodCallAssignment_0_1 )
            // InternalQueryDsl.g:4426:3: rule__NavigatedStatement__MethodCallAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__MethodCallAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatedStatementAccess().getMethodCallAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_0__1__Impl"


    // $ANTLR start "rule__NavigatedStatement__Group_1__0"
    // InternalQueryDsl.g:4435:1: rule__NavigatedStatement__Group_1__0 : rule__NavigatedStatement__Group_1__0__Impl rule__NavigatedStatement__Group_1__1 ;
    public final void rule__NavigatedStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4439:1: ( rule__NavigatedStatement__Group_1__0__Impl rule__NavigatedStatement__Group_1__1 )
            // InternalQueryDsl.g:4440:2: rule__NavigatedStatement__Group_1__0__Impl rule__NavigatedStatement__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__NavigatedStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_1__0"


    // $ANTLR start "rule__NavigatedStatement__Group_1__0__Impl"
    // InternalQueryDsl.g:4447:1: rule__NavigatedStatement__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NavigatedStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4451:1: ( ( '.' ) )
            // InternalQueryDsl.g:4452:1: ( '.' )
            {
            // InternalQueryDsl.g:4452:1: ( '.' )
            // InternalQueryDsl.g:4453:2: '.'
            {
             before(grammarAccess.getNavigatedStatementAccess().getFullStopKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNavigatedStatementAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_1__0__Impl"


    // $ANTLR start "rule__NavigatedStatement__Group_1__1"
    // InternalQueryDsl.g:4462:1: rule__NavigatedStatement__Group_1__1 : rule__NavigatedStatement__Group_1__1__Impl ;
    public final void rule__NavigatedStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4466:1: ( rule__NavigatedStatement__Group_1__1__Impl )
            // InternalQueryDsl.g:4467:2: rule__NavigatedStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_1__1"


    // $ANTLR start "rule__NavigatedStatement__Group_1__1__Impl"
    // InternalQueryDsl.g:4473:1: rule__NavigatedStatement__Group_1__1__Impl : ( ( rule__NavigatedStatement__TargetAssignment_1_1 ) ) ;
    public final void rule__NavigatedStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4477:1: ( ( ( rule__NavigatedStatement__TargetAssignment_1_1 ) ) )
            // InternalQueryDsl.g:4478:1: ( ( rule__NavigatedStatement__TargetAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:4478:1: ( ( rule__NavigatedStatement__TargetAssignment_1_1 ) )
            // InternalQueryDsl.g:4479:2: ( rule__NavigatedStatement__TargetAssignment_1_1 )
            {
             before(grammarAccess.getNavigatedStatementAccess().getTargetAssignment_1_1()); 
            // InternalQueryDsl.g:4480:2: ( rule__NavigatedStatement__TargetAssignment_1_1 )
            // InternalQueryDsl.g:4480:3: rule__NavigatedStatement__TargetAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__TargetAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatedStatementAccess().getTargetAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_1__1__Impl"


    // $ANTLR start "rule__NavigatedStatement__Group_2__0"
    // InternalQueryDsl.g:4489:1: rule__NavigatedStatement__Group_2__0 : rule__NavigatedStatement__Group_2__0__Impl rule__NavigatedStatement__Group_2__1 ;
    public final void rule__NavigatedStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4493:1: ( rule__NavigatedStatement__Group_2__0__Impl rule__NavigatedStatement__Group_2__1 )
            // InternalQueryDsl.g:4494:2: rule__NavigatedStatement__Group_2__0__Impl rule__NavigatedStatement__Group_2__1
            {
            pushFollow(FOLLOW_45);
            rule__NavigatedStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_2__0"


    // $ANTLR start "rule__NavigatedStatement__Group_2__0__Impl"
    // InternalQueryDsl.g:4501:1: rule__NavigatedStatement__Group_2__0__Impl : ( '->' ) ;
    public final void rule__NavigatedStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4505:1: ( ( '->' ) )
            // InternalQueryDsl.g:4506:1: ( '->' )
            {
            // InternalQueryDsl.g:4506:1: ( '->' )
            // InternalQueryDsl.g:4507:2: '->'
            {
             before(grammarAccess.getNavigatedStatementAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNavigatedStatementAccess().getHyphenMinusGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_2__0__Impl"


    // $ANTLR start "rule__NavigatedStatement__Group_2__1"
    // InternalQueryDsl.g:4516:1: rule__NavigatedStatement__Group_2__1 : rule__NavigatedStatement__Group_2__1__Impl ;
    public final void rule__NavigatedStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4520:1: ( rule__NavigatedStatement__Group_2__1__Impl )
            // InternalQueryDsl.g:4521:2: rule__NavigatedStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_2__1"


    // $ANTLR start "rule__NavigatedStatement__Group_2__1__Impl"
    // InternalQueryDsl.g:4527:1: rule__NavigatedStatement__Group_2__1__Impl : ( ( rule__NavigatedStatement__CollectionTargetAssignment_2_1 ) ) ;
    public final void rule__NavigatedStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4531:1: ( ( ( rule__NavigatedStatement__CollectionTargetAssignment_2_1 ) ) )
            // InternalQueryDsl.g:4532:1: ( ( rule__NavigatedStatement__CollectionTargetAssignment_2_1 ) )
            {
            // InternalQueryDsl.g:4532:1: ( ( rule__NavigatedStatement__CollectionTargetAssignment_2_1 ) )
            // InternalQueryDsl.g:4533:2: ( rule__NavigatedStatement__CollectionTargetAssignment_2_1 )
            {
             before(grammarAccess.getNavigatedStatementAccess().getCollectionTargetAssignment_2_1()); 
            // InternalQueryDsl.g:4534:2: ( rule__NavigatedStatement__CollectionTargetAssignment_2_1 )
            // InternalQueryDsl.g:4534:3: rule__NavigatedStatement__CollectionTargetAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigatedStatement__CollectionTargetAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigatedStatementAccess().getCollectionTargetAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__Group_2__1__Impl"


    // $ANTLR start "rule__MethodCall__Group__0"
    // InternalQueryDsl.g:4543:1: rule__MethodCall__Group__0 : rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 ;
    public final void rule__MethodCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4547:1: ( rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1 )
            // InternalQueryDsl.g:4548:2: rule__MethodCall__Group__0__Impl rule__MethodCall__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__MethodCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0"


    // $ANTLR start "rule__MethodCall__Group__0__Impl"
    // InternalQueryDsl.g:4555:1: rule__MethodCall__Group__0__Impl : ( ( rule__MethodCall__TargetMethodAssignment_0 ) ) ;
    public final void rule__MethodCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4559:1: ( ( ( rule__MethodCall__TargetMethodAssignment_0 ) ) )
            // InternalQueryDsl.g:4560:1: ( ( rule__MethodCall__TargetMethodAssignment_0 ) )
            {
            // InternalQueryDsl.g:4560:1: ( ( rule__MethodCall__TargetMethodAssignment_0 ) )
            // InternalQueryDsl.g:4561:2: ( rule__MethodCall__TargetMethodAssignment_0 )
            {
             before(grammarAccess.getMethodCallAccess().getTargetMethodAssignment_0()); 
            // InternalQueryDsl.g:4562:2: ( rule__MethodCall__TargetMethodAssignment_0 )
            // InternalQueryDsl.g:4562:3: rule__MethodCall__TargetMethodAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__TargetMethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getTargetMethodAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__0__Impl"


    // $ANTLR start "rule__MethodCall__Group__1"
    // InternalQueryDsl.g:4570:1: rule__MethodCall__Group__1 : rule__MethodCall__Group__1__Impl ;
    public final void rule__MethodCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4574:1: ( rule__MethodCall__Group__1__Impl )
            // InternalQueryDsl.g:4575:2: rule__MethodCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1"


    // $ANTLR start "rule__MethodCall__Group__1__Impl"
    // InternalQueryDsl.g:4581:1: rule__MethodCall__Group__1__Impl : ( ( rule__MethodCall__Alternatives_1 ) ) ;
    public final void rule__MethodCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4585:1: ( ( ( rule__MethodCall__Alternatives_1 ) ) )
            // InternalQueryDsl.g:4586:1: ( ( rule__MethodCall__Alternatives_1 ) )
            {
            // InternalQueryDsl.g:4586:1: ( ( rule__MethodCall__Alternatives_1 ) )
            // InternalQueryDsl.g:4587:2: ( rule__MethodCall__Alternatives_1 )
            {
             before(grammarAccess.getMethodCallAccess().getAlternatives_1()); 
            // InternalQueryDsl.g:4588:2: ( rule__MethodCall__Alternatives_1 )
            // InternalQueryDsl.g:4588:3: rule__MethodCall__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodCallAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_0__0"
    // InternalQueryDsl.g:4597:1: rule__MethodCall__Group_1_0__0 : rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 ;
    public final void rule__MethodCall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4601:1: ( rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1 )
            // InternalQueryDsl.g:4602:2: rule__MethodCall__Group_1_0__0__Impl rule__MethodCall__Group_1_0__1
            {
            pushFollow(FOLLOW_47);
            rule__MethodCall__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__0"


    // $ANTLR start "rule__MethodCall__Group_1_0__0__Impl"
    // InternalQueryDsl.g:4609:1: rule__MethodCall__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__MethodCall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4613:1: ( ( '(' ) )
            // InternalQueryDsl.g:4614:1: ( '(' )
            {
            // InternalQueryDsl.g:4614:1: ( '(' )
            // InternalQueryDsl.g:4615:2: '('
            {
             before(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__0__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_0__1"
    // InternalQueryDsl.g:4624:1: rule__MethodCall__Group_1_0__1 : rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 ;
    public final void rule__MethodCall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4628:1: ( rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2 )
            // InternalQueryDsl.g:4629:2: rule__MethodCall__Group_1_0__1__Impl rule__MethodCall__Group_1_0__2
            {
            pushFollow(FOLLOW_47);
            rule__MethodCall__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__1"


    // $ANTLR start "rule__MethodCall__Group_1_0__1__Impl"
    // InternalQueryDsl.g:4636:1: rule__MethodCall__Group_1_0__1__Impl : ( ( rule__MethodCall__ParametersAssignment_1_0_1 )* ) ;
    public final void rule__MethodCall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4640:1: ( ( ( rule__MethodCall__ParametersAssignment_1_0_1 )* ) )
            // InternalQueryDsl.g:4641:1: ( ( rule__MethodCall__ParametersAssignment_1_0_1 )* )
            {
            // InternalQueryDsl.g:4641:1: ( ( rule__MethodCall__ParametersAssignment_1_0_1 )* )
            // InternalQueryDsl.g:4642:2: ( rule__MethodCall__ParametersAssignment_1_0_1 )*
            {
             before(grammarAccess.getMethodCallAccess().getParametersAssignment_1_0_1()); 
            // InternalQueryDsl.g:4643:2: ( rule__MethodCall__ParametersAssignment_1_0_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalQueryDsl.g:4643:3: rule__MethodCall__ParametersAssignment_1_0_1
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__MethodCall__ParametersAssignment_1_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getMethodCallAccess().getParametersAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__1__Impl"


    // $ANTLR start "rule__MethodCall__Group_1_0__2"
    // InternalQueryDsl.g:4651:1: rule__MethodCall__Group_1_0__2 : rule__MethodCall__Group_1_0__2__Impl ;
    public final void rule__MethodCall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4655:1: ( rule__MethodCall__Group_1_0__2__Impl )
            // InternalQueryDsl.g:4656:2: rule__MethodCall__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodCall__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__2"


    // $ANTLR start "rule__MethodCall__Group_1_0__2__Impl"
    // InternalQueryDsl.g:4662:1: rule__MethodCall__Group_1_0__2__Impl : ( ')' ) ;
    public final void rule__MethodCall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4666:1: ( ( ')' ) )
            // InternalQueryDsl.g:4667:1: ( ')' )
            {
            // InternalQueryDsl.g:4667:1: ( ')' )
            // InternalQueryDsl.g:4668:2: ')'
            {
             before(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_0_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__Group_1_0__2__Impl"


    // $ANTLR start "rule__SimpleCollectionMethod__Group__0"
    // InternalQueryDsl.g:4678:1: rule__SimpleCollectionMethod__Group__0 : rule__SimpleCollectionMethod__Group__0__Impl rule__SimpleCollectionMethod__Group__1 ;
    public final void rule__SimpleCollectionMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4682:1: ( rule__SimpleCollectionMethod__Group__0__Impl rule__SimpleCollectionMethod__Group__1 )
            // InternalQueryDsl.g:4683:2: rule__SimpleCollectionMethod__Group__0__Impl rule__SimpleCollectionMethod__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__SimpleCollectionMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCollectionMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCollectionMethod__Group__0"


    // $ANTLR start "rule__SimpleCollectionMethod__Group__0__Impl"
    // InternalQueryDsl.g:4690:1: rule__SimpleCollectionMethod__Group__0__Impl : ( ( rule__SimpleCollectionMethod__MethodAssignment_0 ) ) ;
    public final void rule__SimpleCollectionMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4694:1: ( ( ( rule__SimpleCollectionMethod__MethodAssignment_0 ) ) )
            // InternalQueryDsl.g:4695:1: ( ( rule__SimpleCollectionMethod__MethodAssignment_0 ) )
            {
            // InternalQueryDsl.g:4695:1: ( ( rule__SimpleCollectionMethod__MethodAssignment_0 ) )
            // InternalQueryDsl.g:4696:2: ( rule__SimpleCollectionMethod__MethodAssignment_0 )
            {
             before(grammarAccess.getSimpleCollectionMethodAccess().getMethodAssignment_0()); 
            // InternalQueryDsl.g:4697:2: ( rule__SimpleCollectionMethod__MethodAssignment_0 )
            // InternalQueryDsl.g:4697:3: rule__SimpleCollectionMethod__MethodAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCollectionMethod__MethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleCollectionMethodAccess().getMethodAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCollectionMethod__Group__0__Impl"


    // $ANTLR start "rule__SimpleCollectionMethod__Group__1"
    // InternalQueryDsl.g:4705:1: rule__SimpleCollectionMethod__Group__1 : rule__SimpleCollectionMethod__Group__1__Impl ;
    public final void rule__SimpleCollectionMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4709:1: ( rule__SimpleCollectionMethod__Group__1__Impl )
            // InternalQueryDsl.g:4710:2: rule__SimpleCollectionMethod__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCollectionMethod__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCollectionMethod__Group__1"


    // $ANTLR start "rule__SimpleCollectionMethod__Group__1__Impl"
    // InternalQueryDsl.g:4716:1: rule__SimpleCollectionMethod__Group__1__Impl : ( '()' ) ;
    public final void rule__SimpleCollectionMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4720:1: ( ( '()' ) )
            // InternalQueryDsl.g:4721:1: ( '()' )
            {
            // InternalQueryDsl.g:4721:1: ( '()' )
            // InternalQueryDsl.g:4722:2: '()'
            {
             before(grammarAccess.getSimpleCollectionMethodAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSimpleCollectionMethodAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCollectionMethod__Group__1__Impl"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_0__0"
    // InternalQueryDsl.g:4732:1: rule__ParametrizedCollectionMethod__Group_0__0 : rule__ParametrizedCollectionMethod__Group_0__0__Impl rule__ParametrizedCollectionMethod__Group_0__1 ;
    public final void rule__ParametrizedCollectionMethod__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4736:1: ( rule__ParametrizedCollectionMethod__Group_0__0__Impl rule__ParametrizedCollectionMethod__Group_0__1 )
            // InternalQueryDsl.g:4737:2: rule__ParametrizedCollectionMethod__Group_0__0__Impl rule__ParametrizedCollectionMethod__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__ParametrizedCollectionMethod__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_0__0"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_0__0__Impl"
    // InternalQueryDsl.g:4744:1: rule__ParametrizedCollectionMethod__Group_0__0__Impl : ( 'typeSelect(' ) ;
    public final void rule__ParametrizedCollectionMethod__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4748:1: ( ( 'typeSelect(' ) )
            // InternalQueryDsl.g:4749:1: ( 'typeSelect(' )
            {
            // InternalQueryDsl.g:4749:1: ( 'typeSelect(' )
            // InternalQueryDsl.g:4750:2: 'typeSelect('
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_0__0__Impl"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_0__1"
    // InternalQueryDsl.g:4759:1: rule__ParametrizedCollectionMethod__Group_0__1 : rule__ParametrizedCollectionMethod__Group_0__1__Impl rule__ParametrizedCollectionMethod__Group_0__2 ;
    public final void rule__ParametrizedCollectionMethod__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4763:1: ( rule__ParametrizedCollectionMethod__Group_0__1__Impl rule__ParametrizedCollectionMethod__Group_0__2 )
            // InternalQueryDsl.g:4764:2: rule__ParametrizedCollectionMethod__Group_0__1__Impl rule__ParametrizedCollectionMethod__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__ParametrizedCollectionMethod__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_0__1"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_0__1__Impl"
    // InternalQueryDsl.g:4771:1: rule__ParametrizedCollectionMethod__Group_0__1__Impl : ( ( rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 ) ) ;
    public final void rule__ParametrizedCollectionMethod__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4775:1: ( ( ( rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 ) ) )
            // InternalQueryDsl.g:4776:1: ( ( rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 ) )
            {
            // InternalQueryDsl.g:4776:1: ( ( rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 ) )
            // InternalQueryDsl.g:4777:2: ( rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 )
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectAssignment_0_1()); 
            // InternalQueryDsl.g:4778:2: ( rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 )
            // InternalQueryDsl.g:4778:3: rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_0__1__Impl"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_0__2"
    // InternalQueryDsl.g:4786:1: rule__ParametrizedCollectionMethod__Group_0__2 : rule__ParametrizedCollectionMethod__Group_0__2__Impl ;
    public final void rule__ParametrizedCollectionMethod__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4790:1: ( rule__ParametrizedCollectionMethod__Group_0__2__Impl )
            // InternalQueryDsl.g:4791:2: rule__ParametrizedCollectionMethod__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_0__2"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_0__2__Impl"
    // InternalQueryDsl.g:4797:1: rule__ParametrizedCollectionMethod__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ParametrizedCollectionMethod__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4801:1: ( ( ')' ) )
            // InternalQueryDsl.g:4802:1: ( ')' )
            {
            // InternalQueryDsl.g:4802:1: ( ')' )
            // InternalQueryDsl.g:4803:2: ')'
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getRightParenthesisKeyword_0_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParametrizedCollectionMethodAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_0__2__Impl"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_1__0"
    // InternalQueryDsl.g:4813:1: rule__ParametrizedCollectionMethod__Group_1__0 : rule__ParametrizedCollectionMethod__Group_1__0__Impl rule__ParametrizedCollectionMethod__Group_1__1 ;
    public final void rule__ParametrizedCollectionMethod__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4817:1: ( rule__ParametrizedCollectionMethod__Group_1__0__Impl rule__ParametrizedCollectionMethod__Group_1__1 )
            // InternalQueryDsl.g:4818:2: rule__ParametrizedCollectionMethod__Group_1__0__Impl rule__ParametrizedCollectionMethod__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ParametrizedCollectionMethod__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_1__0"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_1__0__Impl"
    // InternalQueryDsl.g:4825:1: rule__ParametrizedCollectionMethod__Group_1__0__Impl : ( 'at(' ) ;
    public final void rule__ParametrizedCollectionMethod__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4829:1: ( ( 'at(' ) )
            // InternalQueryDsl.g:4830:1: ( 'at(' )
            {
            // InternalQueryDsl.g:4830:1: ( 'at(' )
            // InternalQueryDsl.g:4831:2: 'at('
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getAtKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getParametrizedCollectionMethodAccess().getAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_1__0__Impl"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_1__1"
    // InternalQueryDsl.g:4840:1: rule__ParametrizedCollectionMethod__Group_1__1 : rule__ParametrizedCollectionMethod__Group_1__1__Impl rule__ParametrizedCollectionMethod__Group_1__2 ;
    public final void rule__ParametrizedCollectionMethod__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4844:1: ( rule__ParametrizedCollectionMethod__Group_1__1__Impl rule__ParametrizedCollectionMethod__Group_1__2 )
            // InternalQueryDsl.g:4845:2: rule__ParametrizedCollectionMethod__Group_1__1__Impl rule__ParametrizedCollectionMethod__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ParametrizedCollectionMethod__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_1__1"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_1__1__Impl"
    // InternalQueryDsl.g:4852:1: rule__ParametrizedCollectionMethod__Group_1__1__Impl : ( ( rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 ) ) ;
    public final void rule__ParametrizedCollectionMethod__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4856:1: ( ( ( rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 ) ) )
            // InternalQueryDsl.g:4857:1: ( ( rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:4857:1: ( ( rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 ) )
            // InternalQueryDsl.g:4858:2: ( rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 )
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getIndexExpressionAssignment_1_1()); 
            // InternalQueryDsl.g:4859:2: ( rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 )
            // InternalQueryDsl.g:4859:3: rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParametrizedCollectionMethodAccess().getIndexExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_1__1__Impl"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_1__2"
    // InternalQueryDsl.g:4867:1: rule__ParametrizedCollectionMethod__Group_1__2 : rule__ParametrizedCollectionMethod__Group_1__2__Impl ;
    public final void rule__ParametrizedCollectionMethod__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4871:1: ( rule__ParametrizedCollectionMethod__Group_1__2__Impl )
            // InternalQueryDsl.g:4872:2: rule__ParametrizedCollectionMethod__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParametrizedCollectionMethod__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_1__2"


    // $ANTLR start "rule__ParametrizedCollectionMethod__Group_1__2__Impl"
    // InternalQueryDsl.g:4878:1: rule__ParametrizedCollectionMethod__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ParametrizedCollectionMethod__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4882:1: ( ( ')' ) )
            // InternalQueryDsl.g:4883:1: ( ')' )
            {
            // InternalQueryDsl.g:4883:1: ( ')' )
            // InternalQueryDsl.g:4884:2: ')'
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getRightParenthesisKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParametrizedCollectionMethodAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__Group_1__2__Impl"


    // $ANTLR start "rule__ClassContext__ClassNameAssignment_1"
    // InternalQueryDsl.g:4894:1: rule__ClassContext__ClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassContext__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4898:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:4899:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:4899:2: ( RULE_ID )
            // InternalQueryDsl.g:4900:3: RULE_ID
            {
             before(grammarAccess.getClassContextAccess().getClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassContextAccess().getClassNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__ClassNameAssignment_1"


    // $ANTLR start "rule__ClassContext__ElementsAssignment_2"
    // InternalQueryDsl.g:4909:1: rule__ClassContext__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__ClassContext__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4913:1: ( ( ruleElement ) )
            // InternalQueryDsl.g:4914:2: ( ruleElement )
            {
            // InternalQueryDsl.g:4914:2: ( ruleElement )
            // InternalQueryDsl.g:4915:3: ruleElement
            {
             before(grammarAccess.getClassContextAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getClassContextAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassContext__ElementsAssignment_2"


    // $ANTLR start "rule__CommandContext__ClassNameAssignment_1"
    // InternalQueryDsl.g:4924:1: rule__CommandContext__ClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommandContext__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4928:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:4929:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:4929:2: ( RULE_ID )
            // InternalQueryDsl.g:4930:3: RULE_ID
            {
             before(grammarAccess.getCommandContextAccess().getClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandContextAccess().getClassNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__ClassNameAssignment_1"


    // $ANTLR start "rule__CommandContext__CommandNameAssignment_3"
    // InternalQueryDsl.g:4939:1: rule__CommandContext__CommandNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__CommandContext__CommandNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4943:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:4944:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:4944:2: ( RULE_ID )
            // InternalQueryDsl.g:4945:3: RULE_ID
            {
             before(grammarAccess.getCommandContextAccess().getCommandNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommandContextAccess().getCommandNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__CommandNameAssignment_3"


    // $ANTLR start "rule__CommandContext__ParameterListAssignment_4_1"
    // InternalQueryDsl.g:4954:1: rule__CommandContext__ParameterListAssignment_4_1 : ( ruleParameterList ) ;
    public final void rule__CommandContext__ParameterListAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4958:1: ( ( ruleParameterList ) )
            // InternalQueryDsl.g:4959:2: ( ruleParameterList )
            {
            // InternalQueryDsl.g:4959:2: ( ruleParameterList )
            // InternalQueryDsl.g:4960:3: ruleParameterList
            {
             before(grammarAccess.getCommandContextAccess().getParameterListParameterListParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getCommandContextAccess().getParameterListParameterListParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__ParameterListAssignment_4_1"


    // $ANTLR start "rule__CommandContext__ElementsAssignment_5"
    // InternalQueryDsl.g:4969:1: rule__CommandContext__ElementsAssignment_5 : ( ruleElement ) ;
    public final void rule__CommandContext__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4973:1: ( ( ruleElement ) )
            // InternalQueryDsl.g:4974:2: ( ruleElement )
            {
            // InternalQueryDsl.g:4974:2: ( ruleElement )
            // InternalQueryDsl.g:4975:3: ruleElement
            {
             before(grammarAccess.getCommandContextAccess().getElementsElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getCommandContextAccess().getElementsElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandContext__ElementsAssignment_5"


    // $ANTLR start "rule__Query__DocumentationAssignment_0"
    // InternalQueryDsl.g:4984:1: rule__Query__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Query__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4988:1: ( ( RULE_DOCUMENTATION ) )
            // InternalQueryDsl.g:4989:2: ( RULE_DOCUMENTATION )
            {
            // InternalQueryDsl.g:4989:2: ( RULE_DOCUMENTATION )
            // InternalQueryDsl.g:4990:3: RULE_DOCUMENTATION
            {
             before(grammarAccess.getQueryAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__DocumentationAssignment_0"


    // $ANTLR start "rule__Query__InternalAssignment_1"
    // InternalQueryDsl.g:4999:1: rule__Query__InternalAssignment_1 : ( ( 'internal' ) ) ;
    public final void rule__Query__InternalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5003:1: ( ( ( 'internal' ) ) )
            // InternalQueryDsl.g:5004:2: ( ( 'internal' ) )
            {
            // InternalQueryDsl.g:5004:2: ( ( 'internal' ) )
            // InternalQueryDsl.g:5005:3: ( 'internal' )
            {
             before(grammarAccess.getQueryAccess().getInternalInternalKeyword_1_0()); 
            // InternalQueryDsl.g:5006:3: ( 'internal' )
            // InternalQueryDsl.g:5007:4: 'internal'
            {
             before(grammarAccess.getQueryAccess().getInternalInternalKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getInternalInternalKeyword_1_0()); 

            }

             after(grammarAccess.getQueryAccess().getInternalInternalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__InternalAssignment_1"


    // $ANTLR start "rule__Query__NameAssignment_3"
    // InternalQueryDsl.g:5018:1: rule__Query__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5022:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5023:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5023:2: ( RULE_ID )
            // InternalQueryDsl.g:5024:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NameAssignment_3"


    // $ANTLR start "rule__Query__ParameterListAssignment_4_1"
    // InternalQueryDsl.g:5033:1: rule__Query__ParameterListAssignment_4_1 : ( ruleParameterList ) ;
    public final void rule__Query__ParameterListAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5037:1: ( ( ruleParameterList ) )
            // InternalQueryDsl.g:5038:2: ( ruleParameterList )
            {
            // InternalQueryDsl.g:5038:2: ( ruleParameterList )
            // InternalQueryDsl.g:5039:3: ruleParameterList
            {
             before(grammarAccess.getQueryAccess().getParameterListParameterListParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getParameterListParameterListParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ParameterListAssignment_4_1"


    // $ANTLR start "rule__Query__ExpressionsAssignment_6_0"
    // InternalQueryDsl.g:5048:1: rule__Query__ExpressionsAssignment_6_0 : ( ruleExpression ) ;
    public final void rule__Query__ExpressionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5052:1: ( ( ruleExpression ) )
            // InternalQueryDsl.g:5053:2: ( ruleExpression )
            {
            // InternalQueryDsl.g:5053:2: ( ruleExpression )
            // InternalQueryDsl.g:5054:3: ruleExpression
            {
             before(grammarAccess.getQueryAccess().getExpressionsExpressionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getExpressionsExpressionParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ExpressionsAssignment_6_0"


    // $ANTLR start "rule__Precondition__DocumentationAssignment_0"
    // InternalQueryDsl.g:5063:1: rule__Precondition__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Precondition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5067:1: ( ( RULE_DOCUMENTATION ) )
            // InternalQueryDsl.g:5068:2: ( RULE_DOCUMENTATION )
            {
            // InternalQueryDsl.g:5068:2: ( RULE_DOCUMENTATION )
            // InternalQueryDsl.g:5069:3: RULE_DOCUMENTATION
            {
             before(grammarAccess.getPreconditionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__DocumentationAssignment_0"


    // $ANTLR start "rule__Precondition__NameAssignment_2"
    // InternalQueryDsl.g:5078:1: rule__Precondition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Precondition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5082:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5083:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5083:2: ( RULE_ID )
            // InternalQueryDsl.g:5084:3: RULE_ID
            {
             before(grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__NameAssignment_2"


    // $ANTLR start "rule__Precondition__ExpressionsAssignment_4_0"
    // InternalQueryDsl.g:5093:1: rule__Precondition__ExpressionsAssignment_4_0 : ( ruleExpression ) ;
    public final void rule__Precondition__ExpressionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5097:1: ( ( ruleExpression ) )
            // InternalQueryDsl.g:5098:2: ( ruleExpression )
            {
            // InternalQueryDsl.g:5098:2: ( ruleExpression )
            // InternalQueryDsl.g:5099:3: ruleExpression
            {
             before(grammarAccess.getPreconditionAccess().getExpressionsExpressionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getExpressionsExpressionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__ExpressionsAssignment_4_0"


    // $ANTLR start "rule__Postcondition__DocumentationAssignment_0"
    // InternalQueryDsl.g:5108:1: rule__Postcondition__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Postcondition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5112:1: ( ( RULE_DOCUMENTATION ) )
            // InternalQueryDsl.g:5113:2: ( RULE_DOCUMENTATION )
            {
            // InternalQueryDsl.g:5113:2: ( RULE_DOCUMENTATION )
            // InternalQueryDsl.g:5114:3: RULE_DOCUMENTATION
            {
             before(grammarAccess.getPostconditionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__DocumentationAssignment_0"


    // $ANTLR start "rule__Postcondition__NameAssignment_2"
    // InternalQueryDsl.g:5123:1: rule__Postcondition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Postcondition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5127:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5128:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5128:2: ( RULE_ID )
            // InternalQueryDsl.g:5129:3: RULE_ID
            {
             before(grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__NameAssignment_2"


    // $ANTLR start "rule__Postcondition__ExpressionsAssignment_4_0"
    // InternalQueryDsl.g:5138:1: rule__Postcondition__ExpressionsAssignment_4_0 : ( ruleExpression ) ;
    public final void rule__Postcondition__ExpressionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5142:1: ( ( ruleExpression ) )
            // InternalQueryDsl.g:5143:2: ( ruleExpression )
            {
            // InternalQueryDsl.g:5143:2: ( ruleExpression )
            // InternalQueryDsl.g:5144:3: ruleExpression
            {
             before(grammarAccess.getPostconditionAccess().getExpressionsExpressionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPostconditionAccess().getExpressionsExpressionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__ExpressionsAssignment_4_0"


    // $ANTLR start "rule__ParameterList__ParametersAssignment_0"
    // InternalQueryDsl.g:5153:1: rule__ParameterList__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5157:1: ( ( ruleParameter ) )
            // InternalQueryDsl.g:5158:2: ( ruleParameter )
            {
            // InternalQueryDsl.g:5158:2: ( ruleParameter )
            // InternalQueryDsl.g:5159:3: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ParametersAssignment_0"


    // $ANTLR start "rule__ParameterList__ParametersAssignment_1_1"
    // InternalQueryDsl.g:5168:1: rule__ParameterList__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterList__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5172:1: ( ( ruleParameter ) )
            // InternalQueryDsl.g:5173:2: ( ruleParameter )
            {
            // InternalQueryDsl.g:5173:2: ( ruleParameter )
            // InternalQueryDsl.g:5174:3: ruleParameter
            {
             before(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__VariableNameAssignment_0"
    // InternalQueryDsl.g:5183:1: rule__Parameter__VariableNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__VariableNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5187:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5188:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5188:2: ( RULE_ID )
            // InternalQueryDsl.g:5189:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getVariableNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getVariableNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__VariableNameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeNameAssignment_2"
    // InternalQueryDsl.g:5198:1: rule__Parameter__TypeNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__TypeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5202:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5203:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5203:2: ( RULE_ID )
            // InternalQueryDsl.g:5204:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeNameAssignment_2"


    // $ANTLR start "rule__Invariant__DocumentationAssignment_0"
    // InternalQueryDsl.g:5213:1: rule__Invariant__DocumentationAssignment_0 : ( RULE_DOCUMENTATION ) ;
    public final void rule__Invariant__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5217:1: ( ( RULE_DOCUMENTATION ) )
            // InternalQueryDsl.g:5218:2: ( RULE_DOCUMENTATION )
            {
            // InternalQueryDsl.g:5218:2: ( RULE_DOCUMENTATION )
            // InternalQueryDsl.g:5219:3: RULE_DOCUMENTATION
            {
             before(grammarAccess.getInvariantAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
            match(input,RULE_DOCUMENTATION,FOLLOW_2); 
             after(grammarAccess.getInvariantAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__DocumentationAssignment_0"


    // $ANTLR start "rule__Invariant__NameAssignment_2"
    // InternalQueryDsl.g:5228:1: rule__Invariant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Invariant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5232:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5233:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5233:2: ( RULE_ID )
            // InternalQueryDsl.g:5234:3: RULE_ID
            {
             before(grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__NameAssignment_2"


    // $ANTLR start "rule__Invariant__ExpressionsAssignment_4_0"
    // InternalQueryDsl.g:5243:1: rule__Invariant__ExpressionsAssignment_4_0 : ( ruleExpression ) ;
    public final void rule__Invariant__ExpressionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5247:1: ( ( ruleExpression ) )
            // InternalQueryDsl.g:5248:2: ( ruleExpression )
            {
            // InternalQueryDsl.g:5248:2: ( ruleExpression )
            // InternalQueryDsl.g:5249:3: ruleExpression
            {
             before(grammarAccess.getInvariantAccess().getExpressionsExpressionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInvariantAccess().getExpressionsExpressionParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__ExpressionsAssignment_4_0"


    // $ANTLR start "rule__ImpliesExpression__RightAssignment_1_2"
    // InternalQueryDsl.g:5258:1: rule__ImpliesExpression__RightAssignment_1_2 : ( ruleOrExpression ) ;
    public final void rule__ImpliesExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5262:1: ( ( ruleOrExpression ) )
            // InternalQueryDsl.g:5263:2: ( ruleOrExpression )
            {
            // InternalQueryDsl.g:5263:2: ( ruleOrExpression )
            // InternalQueryDsl.g:5264:3: ruleOrExpression
            {
             before(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpression__RightAssignment_1_2"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // InternalQueryDsl.g:5273:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5277:1: ( ( ruleAndExpression ) )
            // InternalQueryDsl.g:5278:2: ( ruleAndExpression )
            {
            // InternalQueryDsl.g:5278:2: ( ruleAndExpression )
            // InternalQueryDsl.g:5279:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalQueryDsl.g:5288:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5292:1: ( ( ruleEqualityExpression ) )
            // InternalQueryDsl.g:5293:2: ( ruleEqualityExpression )
            {
            // InternalQueryDsl.g:5293:2: ( ruleEqualityExpression )
            // InternalQueryDsl.g:5294:3: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OperationAssignment_1_1"
    // InternalQueryDsl.g:5303:1: rule__EqualityExpression__OperationAssignment_1_1 : ( ( rule__EqualityExpression__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__EqualityExpression__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5307:1: ( ( ( rule__EqualityExpression__OperationAlternatives_1_1_0 ) ) )
            // InternalQueryDsl.g:5308:2: ( ( rule__EqualityExpression__OperationAlternatives_1_1_0 ) )
            {
            // InternalQueryDsl.g:5308:2: ( ( rule__EqualityExpression__OperationAlternatives_1_1_0 ) )
            // InternalQueryDsl.g:5309:3: ( rule__EqualityExpression__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperationAlternatives_1_1_0()); 
            // InternalQueryDsl.g:5310:3: ( rule__EqualityExpression__OperationAlternatives_1_1_0 )
            // InternalQueryDsl.g:5310:4: rule__EqualityExpression__OperationAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExpression__OperationAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperationAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OperationAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__RightAssignment_1_2"
    // InternalQueryDsl.g:5318:1: rule__EqualityExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualityExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5322:1: ( ( ruleComparisonExpression ) )
            // InternalQueryDsl.g:5323:2: ( ruleComparisonExpression )
            {
            // InternalQueryDsl.g:5323:2: ( ruleComparisonExpression )
            // InternalQueryDsl.g:5324:3: ruleComparisonExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OpAssignment_1_1"
    // InternalQueryDsl.g:5333:1: rule__ComparisonExpression__OpAssignment_1_1 : ( ( rule__ComparisonExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__ComparisonExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5337:1: ( ( ( rule__ComparisonExpression__OpAlternatives_1_1_0 ) ) )
            // InternalQueryDsl.g:5338:2: ( ( rule__ComparisonExpression__OpAlternatives_1_1_0 ) )
            {
            // InternalQueryDsl.g:5338:2: ( ( rule__ComparisonExpression__OpAlternatives_1_1_0 ) )
            // InternalQueryDsl.g:5339:3: ( rule__ComparisonExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOpAlternatives_1_1_0()); 
            // InternalQueryDsl.g:5340:3: ( rule__ComparisonExpression__OpAlternatives_1_1_0 )
            // InternalQueryDsl.g:5340:4: rule__ComparisonExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OpAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_2"
    // InternalQueryDsl.g:5348:1: rule__ComparisonExpression__RightAssignment_1_2 : ( rulePlusOrMinusExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5352:1: ( ( rulePlusOrMinusExpression ) )
            // InternalQueryDsl.g:5353:2: ( rulePlusOrMinusExpression )
            {
            // InternalQueryDsl.g:5353:2: ( rulePlusOrMinusExpression )
            // InternalQueryDsl.g:5354:3: rulePlusOrMinusExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightPlusOrMinusExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinusExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightPlusOrMinusExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinusExpression__RightAssignment_1_1"
    // InternalQueryDsl.g:5363:1: rule__PlusOrMinusExpression__RightAssignment_1_1 : ( ruleMultiplicationOrDivisionExpression ) ;
    public final void rule__PlusOrMinusExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5367:1: ( ( ruleMultiplicationOrDivisionExpression ) )
            // InternalQueryDsl.g:5368:2: ( ruleMultiplicationOrDivisionExpression )
            {
            // InternalQueryDsl.g:5368:2: ( ruleMultiplicationOrDivisionExpression )
            // InternalQueryDsl.g:5369:3: ruleMultiplicationOrDivisionExpression
            {
             before(grammarAccess.getPlusOrMinusExpressionAccess().getRightMultiplicationOrDivisionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicationOrDivisionExpression();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusExpressionAccess().getRightMultiplicationOrDivisionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinusExpression__RightAssignment_1_1"


    // $ANTLR start "rule__MultiplicationOrDivisionExpression__RightAssignment_1_1"
    // InternalQueryDsl.g:5378:1: rule__MultiplicationOrDivisionExpression__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__MultiplicationOrDivisionExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5382:1: ( ( rulePrimaryExpression ) )
            // InternalQueryDsl.g:5383:2: ( rulePrimaryExpression )
            {
            // InternalQueryDsl.g:5383:2: ( rulePrimaryExpression )
            // InternalQueryDsl.g:5384:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOrDivisionExpression__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ExpressionAssignment_1_2"
    // InternalQueryDsl.g:5393:1: rule__PrimaryExpression__ExpressionAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PrimaryExpression__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5397:1: ( ( rulePrimaryExpression ) )
            // InternalQueryDsl.g:5398:2: ( rulePrimaryExpression )
            {
            // InternalQueryDsl.g:5398:2: ( rulePrimaryExpression )
            // InternalQueryDsl.g:5399:3: rulePrimaryExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ExpressionAssignment_1_2"


    // $ANTLR start "rule__ConstantExpression__ValueAssignment_0_1"
    // InternalQueryDsl.g:5408:1: rule__ConstantExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__ConstantExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5412:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:5413:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:5413:2: ( RULE_INT )
            // InternalQueryDsl.g:5414:3: RULE_INT
            {
             before(grammarAccess.getConstantExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__ConstantExpression__ValueAssignment_1_1"
    // InternalQueryDsl.g:5423:1: rule__ConstantExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__ConstantExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5427:1: ( ( RULE_STRING ) )
            // InternalQueryDsl.g:5428:2: ( RULE_STRING )
            {
            // InternalQueryDsl.g:5428:2: ( RULE_STRING )
            // InternalQueryDsl.g:5429:3: RULE_STRING
            {
             before(grammarAccess.getConstantExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__ConstantExpression__ValueAssignment_2_1"
    // InternalQueryDsl.g:5438:1: rule__ConstantExpression__ValueAssignment_2_1 : ( ( rule__ConstantExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__ConstantExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5442:1: ( ( ( rule__ConstantExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalQueryDsl.g:5443:2: ( ( rule__ConstantExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalQueryDsl.g:5443:2: ( ( rule__ConstantExpression__ValueAlternatives_2_1_0 ) )
            // InternalQueryDsl.g:5444:3: ( rule__ConstantExpression__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getConstantExpressionAccess().getValueAlternatives_2_1_0()); 
            // InternalQueryDsl.g:5445:3: ( rule__ConstantExpression__ValueAlternatives_2_1_0 )
            // InternalQueryDsl.g:5445:4: rule__ConstantExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ConstantExpression__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantExpressionAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__ConstantExpression__ValueAssignment_3_1"
    // InternalQueryDsl.g:5453:1: rule__ConstantExpression__ValueAssignment_3_1 : ( ( 'null' ) ) ;
    public final void rule__ConstantExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5457:1: ( ( ( 'null' ) ) )
            // InternalQueryDsl.g:5458:2: ( ( 'null' ) )
            {
            // InternalQueryDsl.g:5458:2: ( ( 'null' ) )
            // InternalQueryDsl.g:5459:3: ( 'null' )
            {
             before(grammarAccess.getConstantExpressionAccess().getValueNullKeyword_3_1_0()); 
            // InternalQueryDsl.g:5460:3: ( 'null' )
            // InternalQueryDsl.g:5461:4: 'null'
            {
             before(grammarAccess.getConstantExpressionAccess().getValueNullKeyword_3_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getConstantExpressionAccess().getValueNullKeyword_3_1_0()); 

            }

             after(grammarAccess.getConstantExpressionAccess().getValueNullKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__OldValueExpression__ExpressionAssignment_3"
    // InternalQueryDsl.g:5472:1: rule__OldValueExpression__ExpressionAssignment_3 : ( rulePropertyPathExpression ) ;
    public final void rule__OldValueExpression__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5476:1: ( ( rulePropertyPathExpression ) )
            // InternalQueryDsl.g:5477:2: ( rulePropertyPathExpression )
            {
            // InternalQueryDsl.g:5477:2: ( rulePropertyPathExpression )
            // InternalQueryDsl.g:5478:3: rulePropertyPathExpression
            {
             before(grammarAccess.getOldValueExpressionAccess().getExpressionPropertyPathExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyPathExpression();

            state._fsp--;

             after(grammarAccess.getOldValueExpressionAccess().getExpressionPropertyPathExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OldValueExpression__ExpressionAssignment_3"


    // $ANTLR start "rule__PropertyPathExpression__StatementsAssignment_1"
    // InternalQueryDsl.g:5487:1: rule__PropertyPathExpression__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__PropertyPathExpression__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5491:1: ( ( ruleStatement ) )
            // InternalQueryDsl.g:5492:2: ( ruleStatement )
            {
            // InternalQueryDsl.g:5492:2: ( ruleStatement )
            // InternalQueryDsl.g:5493:3: ruleStatement
            {
             before(grammarAccess.getPropertyPathExpressionAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getPropertyPathExpressionAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__StatementsAssignment_1"


    // $ANTLR start "rule__PropertyPathExpression__StatementsAssignment_2"
    // InternalQueryDsl.g:5502:1: rule__PropertyPathExpression__StatementsAssignment_2 : ( ruleNavigatedStatement ) ;
    public final void rule__PropertyPathExpression__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5506:1: ( ( ruleNavigatedStatement ) )
            // InternalQueryDsl.g:5507:2: ( ruleNavigatedStatement )
            {
            // InternalQueryDsl.g:5507:2: ( ruleNavigatedStatement )
            // InternalQueryDsl.g:5508:3: ruleNavigatedStatement
            {
             before(grammarAccess.getPropertyPathExpressionAccess().getStatementsNavigatedStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigatedStatement();

            state._fsp--;

             after(grammarAccess.getPropertyPathExpressionAccess().getStatementsNavigatedStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyPathExpression__StatementsAssignment_2"


    // $ANTLR start "rule__Statement__TargetAssignment_0"
    // InternalQueryDsl.g:5517:1: rule__Statement__TargetAssignment_0 : ( ( 'self' ) ) ;
    public final void rule__Statement__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5521:1: ( ( ( 'self' ) ) )
            // InternalQueryDsl.g:5522:2: ( ( 'self' ) )
            {
            // InternalQueryDsl.g:5522:2: ( ( 'self' ) )
            // InternalQueryDsl.g:5523:3: ( 'self' )
            {
             before(grammarAccess.getStatementAccess().getTargetSelfKeyword_0_0()); 
            // InternalQueryDsl.g:5524:3: ( 'self' )
            // InternalQueryDsl.g:5525:4: 'self'
            {
             before(grammarAccess.getStatementAccess().getTargetSelfKeyword_0_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getTargetSelfKeyword_0_0()); 

            }

             after(grammarAccess.getStatementAccess().getTargetSelfKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TargetAssignment_0"


    // $ANTLR start "rule__Statement__TargetAssignment_1"
    // InternalQueryDsl.g:5536:1: rule__Statement__TargetAssignment_1 : ( ruleDirection ) ;
    public final void rule__Statement__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5540:1: ( ( ruleDirection ) )
            // InternalQueryDsl.g:5541:2: ( ruleDirection )
            {
            // InternalQueryDsl.g:5541:2: ( ruleDirection )
            // InternalQueryDsl.g:5542:3: ruleDirection
            {
             before(grammarAccess.getStatementAccess().getTargetDirectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTargetDirectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TargetAssignment_1"


    // $ANTLR start "rule__Statement__TargetAssignment_2"
    // InternalQueryDsl.g:5551:1: rule__Statement__TargetAssignment_2 : ( RULE_ID ) ;
    public final void rule__Statement__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5555:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5556:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5556:2: ( RULE_ID )
            // InternalQueryDsl.g:5557:3: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getTargetIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getTargetIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__TargetAssignment_2"


    // $ANTLR start "rule__NavigatedStatement__MethodCallAssignment_0_1"
    // InternalQueryDsl.g:5566:1: rule__NavigatedStatement__MethodCallAssignment_0_1 : ( ruleMethodCall ) ;
    public final void rule__NavigatedStatement__MethodCallAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5570:1: ( ( ruleMethodCall ) )
            // InternalQueryDsl.g:5571:2: ( ruleMethodCall )
            {
            // InternalQueryDsl.g:5571:2: ( ruleMethodCall )
            // InternalQueryDsl.g:5572:3: ruleMethodCall
            {
             before(grammarAccess.getNavigatedStatementAccess().getMethodCallMethodCallParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodCall();

            state._fsp--;

             after(grammarAccess.getNavigatedStatementAccess().getMethodCallMethodCallParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__MethodCallAssignment_0_1"


    // $ANTLR start "rule__NavigatedStatement__TargetAssignment_1_1"
    // InternalQueryDsl.g:5581:1: rule__NavigatedStatement__TargetAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__NavigatedStatement__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5585:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5586:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5586:2: ( RULE_ID )
            // InternalQueryDsl.g:5587:3: RULE_ID
            {
             before(grammarAccess.getNavigatedStatementAccess().getTargetIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNavigatedStatementAccess().getTargetIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__TargetAssignment_1_1"


    // $ANTLR start "rule__NavigatedStatement__CollectionTargetAssignment_2_1"
    // InternalQueryDsl.g:5596:1: rule__NavigatedStatement__CollectionTargetAssignment_2_1 : ( ruleCollectionMethod ) ;
    public final void rule__NavigatedStatement__CollectionTargetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5600:1: ( ( ruleCollectionMethod ) )
            // InternalQueryDsl.g:5601:2: ( ruleCollectionMethod )
            {
            // InternalQueryDsl.g:5601:2: ( ruleCollectionMethod )
            // InternalQueryDsl.g:5602:3: ruleCollectionMethod
            {
             before(grammarAccess.getNavigatedStatementAccess().getCollectionTargetCollectionMethodParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCollectionMethod();

            state._fsp--;

             after(grammarAccess.getNavigatedStatementAccess().getCollectionTargetCollectionMethodParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigatedStatement__CollectionTargetAssignment_2_1"


    // $ANTLR start "rule__MethodCall__TargetMethodAssignment_0"
    // InternalQueryDsl.g:5611:1: rule__MethodCall__TargetMethodAssignment_0 : ( RULE_ID ) ;
    public final void rule__MethodCall__TargetMethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5615:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5616:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5616:2: ( RULE_ID )
            // InternalQueryDsl.g:5617:3: RULE_ID
            {
             before(grammarAccess.getMethodCallAccess().getTargetMethodIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getTargetMethodIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__TargetMethodAssignment_0"


    // $ANTLR start "rule__MethodCall__ParametersAssignment_1_0_1"
    // InternalQueryDsl.g:5626:1: rule__MethodCall__ParametersAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__MethodCall__ParametersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5630:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5631:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5631:2: ( RULE_ID )
            // InternalQueryDsl.g:5632:3: RULE_ID
            {
             before(grammarAccess.getMethodCallAccess().getParametersIDTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodCallAccess().getParametersIDTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodCall__ParametersAssignment_1_0_1"


    // $ANTLR start "rule__SimpleCollectionMethod__MethodAssignment_0"
    // InternalQueryDsl.g:5641:1: rule__SimpleCollectionMethod__MethodAssignment_0 : ( ( rule__SimpleCollectionMethod__MethodAlternatives_0_0 ) ) ;
    public final void rule__SimpleCollectionMethod__MethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5645:1: ( ( ( rule__SimpleCollectionMethod__MethodAlternatives_0_0 ) ) )
            // InternalQueryDsl.g:5646:2: ( ( rule__SimpleCollectionMethod__MethodAlternatives_0_0 ) )
            {
            // InternalQueryDsl.g:5646:2: ( ( rule__SimpleCollectionMethod__MethodAlternatives_0_0 ) )
            // InternalQueryDsl.g:5647:3: ( rule__SimpleCollectionMethod__MethodAlternatives_0_0 )
            {
             before(grammarAccess.getSimpleCollectionMethodAccess().getMethodAlternatives_0_0()); 
            // InternalQueryDsl.g:5648:3: ( rule__SimpleCollectionMethod__MethodAlternatives_0_0 )
            // InternalQueryDsl.g:5648:4: rule__SimpleCollectionMethod__MethodAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCollectionMethod__MethodAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleCollectionMethodAccess().getMethodAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCollectionMethod__MethodAssignment_0"


    // $ANTLR start "rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1"
    // InternalQueryDsl.g:5656:1: rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5660:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:5661:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:5661:2: ( RULE_ID )
            // InternalQueryDsl.g:5662:3: RULE_ID
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__TypeSelectAssignment_0_1"


    // $ANTLR start "rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1"
    // InternalQueryDsl.g:5671:1: rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5675:1: ( ( ruleExpression ) )
            // InternalQueryDsl.g:5676:2: ( ruleExpression )
            {
            // InternalQueryDsl.g:5676:2: ( ruleExpression )
            // InternalQueryDsl.g:5677:3: ruleExpression
            {
             before(grammarAccess.getParametrizedCollectionMethodAccess().getIndexExpressionExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParametrizedCollectionMethodAccess().getIndexExpressionExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametrizedCollectionMethod__IndexExpressionAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0010005900000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0010005900000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0010005940000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010005940000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000100000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0060C0004F0C00D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x004000000F000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000C000000E00000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000100000L});

}