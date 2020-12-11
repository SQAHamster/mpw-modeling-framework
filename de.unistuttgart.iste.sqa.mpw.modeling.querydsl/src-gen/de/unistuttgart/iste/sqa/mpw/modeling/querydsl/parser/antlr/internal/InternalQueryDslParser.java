package de.unistuttgart.iste.sqa.mpw.modeling.querydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.services.QueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCUMENTATION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'::'", "'('", "')'", "'internal'", "'query'", "':'", "';'", "'precondition'", "'postcondition'", "','", "'invariant'", "'implies'", "'or'", "'and'", "'='", "'<>'", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'", "'null'", "'old'", "'self'", "'.'", "'->'", "'()'", "'notEmpty'", "'isEmpty'", "'size'", "'typeSelect('", "'at('", "'EAST'", "'WEST'", "'SOUTH'", "'NORTH'"
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

        public InternalQueryDslParser(TokenStream input, QueryDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected QueryDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalQueryDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalQueryDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalQueryDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalQueryDsl.g:71:1: ruleModel returns [EObject current=null] : this_Context_0= ruleContext ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Context_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:77:2: (this_Context_0= ruleContext )
            // InternalQueryDsl.g:78:2: this_Context_0= ruleContext
            {

            		newCompositeNode(grammarAccess.getModelAccess().getContextParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Context_0=ruleContext();

            state._fsp--;


            		current = this_Context_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleContext"
    // InternalQueryDsl.g:89:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalQueryDsl.g:89:48: (iv_ruleContext= ruleContext EOF )
            // InternalQueryDsl.g:90:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalQueryDsl.g:96:1: ruleContext returns [EObject current=null] : (this_ClassContext_0= ruleClassContext | this_CommandContext_1= ruleCommandContext ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        EObject this_ClassContext_0 = null;

        EObject this_CommandContext_1 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:102:2: ( (this_ClassContext_0= ruleClassContext | this_CommandContext_1= ruleCommandContext ) )
            // InternalQueryDsl.g:103:2: (this_ClassContext_0= ruleClassContext | this_CommandContext_1= ruleCommandContext )
            {
            // InternalQueryDsl.g:103:2: (this_ClassContext_0= ruleClassContext | this_CommandContext_1= ruleCommandContext )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==13) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==RULE_DOCUMENTATION||(LA1_2>=16 && LA1_2<=17)||(LA1_2>=20 && LA1_2<=21)||LA1_2==23) ) {
                        alt1=1;
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
                    // InternalQueryDsl.g:104:3: this_ClassContext_0= ruleClassContext
                    {

                    			newCompositeNode(grammarAccess.getContextAccess().getClassContextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassContext_0=ruleClassContext();

                    state._fsp--;


                    			current = this_ClassContext_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:113:3: this_CommandContext_1= ruleCommandContext
                    {

                    			newCompositeNode(grammarAccess.getContextAccess().getCommandContextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandContext_1=ruleCommandContext();

                    state._fsp--;


                    			current = this_CommandContext_1;
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleClassContext"
    // InternalQueryDsl.g:125:1: entryRuleClassContext returns [EObject current=null] : iv_ruleClassContext= ruleClassContext EOF ;
    public final EObject entryRuleClassContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassContext = null;


        try {
            // InternalQueryDsl.g:125:53: (iv_ruleClassContext= ruleClassContext EOF )
            // InternalQueryDsl.g:126:2: iv_ruleClassContext= ruleClassContext EOF
            {
             newCompositeNode(grammarAccess.getClassContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassContext=ruleClassContext();

            state._fsp--;

             current =iv_ruleClassContext; 
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
    // $ANTLR end "entryRuleClassContext"


    // $ANTLR start "ruleClassContext"
    // InternalQueryDsl.g:132:1: ruleClassContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )+ ) ;
    public final EObject ruleClassContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_className_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:138:2: ( (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )+ ) )
            // InternalQueryDsl.g:139:2: (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )+ )
            {
            // InternalQueryDsl.g:139:2: (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )+ )
            // InternalQueryDsl.g:140:3: otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleElement ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassContextAccess().getContextKeyword_0());
            		
            // InternalQueryDsl.g:144:3: ( (lv_className_1_0= RULE_ID ) )
            // InternalQueryDsl.g:145:4: (lv_className_1_0= RULE_ID )
            {
            // InternalQueryDsl.g:145:4: (lv_className_1_0= RULE_ID )
            // InternalQueryDsl.g:146:5: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_className_1_0, grammarAccess.getClassContextAccess().getClassNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQueryDsl.g:162:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DOCUMENTATION||(LA2_0>=16 && LA2_0<=17)||(LA2_0>=20 && LA2_0<=21)||LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQueryDsl.g:163:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalQueryDsl.g:163:4: (lv_elements_2_0= ruleElement )
            	    // InternalQueryDsl.g:164:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getClassContextAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleClassContext"


    // $ANTLR start "entryRuleCommandContext"
    // InternalQueryDsl.g:185:1: entryRuleCommandContext returns [EObject current=null] : iv_ruleCommandContext= ruleCommandContext EOF ;
    public final EObject entryRuleCommandContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandContext = null;


        try {
            // InternalQueryDsl.g:185:55: (iv_ruleCommandContext= ruleCommandContext EOF )
            // InternalQueryDsl.g:186:2: iv_ruleCommandContext= ruleCommandContext EOF
            {
             newCompositeNode(grammarAccess.getCommandContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandContext=ruleCommandContext();

            state._fsp--;

             current =iv_ruleCommandContext; 
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
    // $ANTLR end "entryRuleCommandContext"


    // $ANTLR start "ruleCommandContext"
    // InternalQueryDsl.g:192:1: ruleCommandContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '::' ( (lv_commandName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? ( (lv_elements_7_0= ruleElement ) )+ ) ;
    public final EObject ruleCommandContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_className_1_0=null;
        Token otherlv_2=null;
        Token lv_commandName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterList_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:198:2: ( (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '::' ( (lv_commandName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? ( (lv_elements_7_0= ruleElement ) )+ ) )
            // InternalQueryDsl.g:199:2: (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '::' ( (lv_commandName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? ( (lv_elements_7_0= ruleElement ) )+ )
            {
            // InternalQueryDsl.g:199:2: (otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '::' ( (lv_commandName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? ( (lv_elements_7_0= ruleElement ) )+ )
            // InternalQueryDsl.g:200:3: otherlv_0= 'context' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '::' ( (lv_commandName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? ( (lv_elements_7_0= ruleElement ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandContextAccess().getContextKeyword_0());
            		
            // InternalQueryDsl.g:204:3: ( (lv_className_1_0= RULE_ID ) )
            // InternalQueryDsl.g:205:4: (lv_className_1_0= RULE_ID )
            {
            // InternalQueryDsl.g:205:4: (lv_className_1_0= RULE_ID )
            // InternalQueryDsl.g:206:5: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_className_1_0, grammarAccess.getCommandContextAccess().getClassNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommandContextAccess().getColonColonKeyword_2());
            		
            // InternalQueryDsl.g:226:3: ( (lv_commandName_3_0= RULE_ID ) )
            // InternalQueryDsl.g:227:4: (lv_commandName_3_0= RULE_ID )
            {
            // InternalQueryDsl.g:227:4: (lv_commandName_3_0= RULE_ID )
            // InternalQueryDsl.g:228:5: lv_commandName_3_0= RULE_ID
            {
            lv_commandName_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_commandName_3_0, grammarAccess.getCommandContextAccess().getCommandNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommandContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"commandName",
            						lv_commandName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQueryDsl.g:244:3: (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQueryDsl.g:245:4: otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCommandContextAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalQueryDsl.g:249:4: ( (lv_parameterList_5_0= ruleParameterList ) )
                    // InternalQueryDsl.g:250:5: (lv_parameterList_5_0= ruleParameterList )
                    {
                    // InternalQueryDsl.g:250:5: (lv_parameterList_5_0= ruleParameterList )
                    // InternalQueryDsl.g:251:6: lv_parameterList_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getCommandContextAccess().getParameterListParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameterList_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommandContextRule());
                    						}
                    						set(
                    							current,
                    							"parameterList",
                    							lv_parameterList_5_0,
                    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.ParameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandContextAccess().getRightParenthesisKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalQueryDsl.g:273:3: ( (lv_elements_7_0= ruleElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOCUMENTATION||(LA4_0>=16 && LA4_0<=17)||(LA4_0>=20 && LA4_0<=21)||LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQueryDsl.g:274:4: (lv_elements_7_0= ruleElement )
            	    {
            	    // InternalQueryDsl.g:274:4: (lv_elements_7_0= ruleElement )
            	    // InternalQueryDsl.g:275:5: lv_elements_7_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getCommandContextAccess().getElementsElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_7_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommandContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_7_0,
            	    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Element");
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
    // $ANTLR end "ruleCommandContext"


    // $ANTLR start "entryRuleElement"
    // InternalQueryDsl.g:296:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalQueryDsl.g:296:48: (iv_ruleElement= ruleElement EOF )
            // InternalQueryDsl.g:297:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalQueryDsl.g:303:1: ruleElement returns [EObject current=null] : (this_Query_0= ruleQuery | this_CommandConstraint_1= ruleCommandConstraint | this_Invariant_2= ruleInvariant ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Query_0 = null;

        EObject this_CommandConstraint_1 = null;

        EObject this_Invariant_2 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:309:2: ( (this_Query_0= ruleQuery | this_CommandConstraint_1= ruleCommandConstraint | this_Invariant_2= ruleInvariant ) )
            // InternalQueryDsl.g:310:2: (this_Query_0= ruleQuery | this_CommandConstraint_1= ruleCommandConstraint | this_Invariant_2= ruleInvariant )
            {
            // InternalQueryDsl.g:310:2: (this_Query_0= ruleQuery | this_CommandConstraint_1= ruleCommandConstraint | this_Invariant_2= ruleInvariant )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                switch ( input.LA(2) ) {
                case 20:
                case 21:
                    {
                    alt5=2;
                    }
                    break;
                case 23:
                    {
                    alt5=3;
                    }
                    break;
                case 16:
                case 17:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 16:
            case 17:
                {
                alt5=1;
                }
                break;
            case 20:
            case 21:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQueryDsl.g:311:3: this_Query_0= ruleQuery
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query_0=ruleQuery();

                    state._fsp--;


                    			current = this_Query_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:320:3: this_CommandConstraint_1= ruleCommandConstraint
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getCommandConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommandConstraint_1=ruleCommandConstraint();

                    state._fsp--;


                    			current = this_CommandConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:329:3: this_Invariant_2= ruleInvariant
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInvariantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Invariant_2=ruleInvariant();

                    state._fsp--;


                    			current = this_Invariant_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleQuery"
    // InternalQueryDsl.g:341:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalQueryDsl.g:341:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalQueryDsl.g:342:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalQueryDsl.g:348:1: ruleQuery returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_internal_1_0= 'internal' ) )? otherlv_2= 'query' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? otherlv_7= ':' ( ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_internal_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameterList_5_0 = null;

        EObject lv_expressions_8_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:354:2: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_internal_1_0= 'internal' ) )? otherlv_2= 'query' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? otherlv_7= ':' ( ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';' ) ) )
            // InternalQueryDsl.g:355:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_internal_1_0= 'internal' ) )? otherlv_2= 'query' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? otherlv_7= ':' ( ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';' ) )
            {
            // InternalQueryDsl.g:355:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_internal_1_0= 'internal' ) )? otherlv_2= 'query' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? otherlv_7= ':' ( ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';' ) )
            // InternalQueryDsl.g:356:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_internal_1_0= 'internal' ) )? otherlv_2= 'query' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )? otherlv_7= ':' ( ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';' )
            {
            // InternalQueryDsl.g:356:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQueryDsl.g:357:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalQueryDsl.g:357:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalQueryDsl.g:358:5: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_9); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getQueryAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQueryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.DOCUMENTATION");
                    				

                    }


                    }
                    break;

            }

            // InternalQueryDsl.g:374:3: ( (lv_internal_1_0= 'internal' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQueryDsl.g:375:4: (lv_internal_1_0= 'internal' )
                    {
                    // InternalQueryDsl.g:375:4: (lv_internal_1_0= 'internal' )
                    // InternalQueryDsl.g:376:5: lv_internal_1_0= 'internal'
                    {
                    lv_internal_1_0=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(lv_internal_1_0, grammarAccess.getQueryAccess().getInternalInternalKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQueryRule());
                    					}
                    					setWithLastConsumed(current, "internal", lv_internal_1_0 != null, "internal");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryAccess().getQueryKeyword_2());
            		
            // InternalQueryDsl.g:392:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalQueryDsl.g:393:4: (lv_name_3_0= RULE_ID )
            {
            // InternalQueryDsl.g:393:4: (lv_name_3_0= RULE_ID )
            // InternalQueryDsl.g:394:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQueryDsl.g:410:3: (otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQueryDsl.g:411:4: otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalQueryDsl.g:415:4: ( (lv_parameterList_5_0= ruleParameterList ) )
                    // InternalQueryDsl.g:416:5: (lv_parameterList_5_0= ruleParameterList )
                    {
                    // InternalQueryDsl.g:416:5: (lv_parameterList_5_0= ruleParameterList )
                    // InternalQueryDsl.g:417:6: lv_parameterList_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getParameterListParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameterList_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryRule());
                    						}
                    						set(
                    							current,
                    							"parameterList",
                    							lv_parameterList_5_0,
                    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.ParameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getRightParenthesisKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getQueryAccess().getColonKeyword_5());
            		
            // InternalQueryDsl.g:443:3: ( ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';' )
            // InternalQueryDsl.g:444:4: ( (lv_expressions_8_0= ruleExpression ) ) otherlv_9= ';'
            {
            // InternalQueryDsl.g:444:4: ( (lv_expressions_8_0= ruleExpression ) )
            // InternalQueryDsl.g:445:5: (lv_expressions_8_0= ruleExpression )
            {
            // InternalQueryDsl.g:445:5: (lv_expressions_8_0= ruleExpression )
            // InternalQueryDsl.g:446:6: lv_expressions_8_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getQueryAccess().getExpressionsExpressionParserRuleCall_6_0_0());
            					
            pushFollow(FOLLOW_14);
            lv_expressions_8_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getQueryRule());
            						}
            						add(
            							current,
            							"expressions",
            							lv_expressions_8_0,
            							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(otherlv_9, grammarAccess.getQueryAccess().getSemicolonKeyword_6_1());
            			

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleCommandConstraint"
    // InternalQueryDsl.g:472:1: entryRuleCommandConstraint returns [EObject current=null] : iv_ruleCommandConstraint= ruleCommandConstraint EOF ;
    public final EObject entryRuleCommandConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandConstraint = null;


        try {
            // InternalQueryDsl.g:472:58: (iv_ruleCommandConstraint= ruleCommandConstraint EOF )
            // InternalQueryDsl.g:473:2: iv_ruleCommandConstraint= ruleCommandConstraint EOF
            {
             newCompositeNode(grammarAccess.getCommandConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandConstraint=ruleCommandConstraint();

            state._fsp--;

             current =iv_ruleCommandConstraint; 
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
    // $ANTLR end "entryRuleCommandConstraint"


    // $ANTLR start "ruleCommandConstraint"
    // InternalQueryDsl.g:479:1: ruleCommandConstraint returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleCommandConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:485:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalQueryDsl.g:486:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalQueryDsl.g:486:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==21) ) {
                    alt9=2;
                }
                else if ( (LA9_1==20) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQueryDsl.g:487:3: this_Precondition_0= rulePrecondition
                    {

                    			newCompositeNode(grammarAccess.getCommandConstraintAccess().getPreconditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Precondition_0=rulePrecondition();

                    state._fsp--;


                    			current = this_Precondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:496:3: this_Postcondition_1= rulePostcondition
                    {

                    			newCompositeNode(grammarAccess.getCommandConstraintAccess().getPostconditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Postcondition_1=rulePostcondition();

                    state._fsp--;


                    			current = this_Postcondition_1;
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
    // $ANTLR end "ruleCommandConstraint"


    // $ANTLR start "entryRulePrecondition"
    // InternalQueryDsl.g:508:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalQueryDsl.g:508:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalQueryDsl.g:509:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalQueryDsl.g:515:1: rulePrecondition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'precondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:521:2: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'precondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) ) )
            // InternalQueryDsl.g:522:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'precondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            {
            // InternalQueryDsl.g:522:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'precondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // InternalQueryDsl.g:523:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'precondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // InternalQueryDsl.g:523:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOCUMENTATION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryDsl.g:524:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalQueryDsl.g:524:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalQueryDsl.g:525:5: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_15); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getPreconditionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPreconditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.DOCUMENTATION");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getPreconditionKeyword_1());
            		
            // InternalQueryDsl.g:545:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQueryDsl.g:546:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalQueryDsl.g:546:4: (lv_name_2_0= RULE_ID )
                    // InternalQueryDsl.g:547:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPreconditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPreconditionAccess().getColonKeyword_3());
            		
            // InternalQueryDsl.g:567:3: ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' )
            // InternalQueryDsl.g:568:4: ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            // InternalQueryDsl.g:568:4: ( (lv_expressions_4_0= ruleExpression ) )
            // InternalQueryDsl.g:569:5: (lv_expressions_4_0= ruleExpression )
            {
            // InternalQueryDsl.g:569:5: (lv_expressions_4_0= ruleExpression )
            // InternalQueryDsl.g:570:6: lv_expressions_4_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getPreconditionAccess().getExpressionsExpressionParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_14);
            lv_expressions_4_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPreconditionRule());
            						}
            						add(
            							current,
            							"expressions",
            							lv_expressions_4_0,
            							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getPreconditionAccess().getSemicolonKeyword_4_1());
            			

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalQueryDsl.g:596:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalQueryDsl.g:596:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalQueryDsl.g:597:2: iv_rulePostcondition= rulePostcondition EOF
            {
             newCompositeNode(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;

             current =iv_rulePostcondition; 
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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalQueryDsl.g:603:1: rulePostcondition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'postcondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:609:2: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'postcondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) ) )
            // InternalQueryDsl.g:610:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'postcondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            {
            // InternalQueryDsl.g:610:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'postcondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // InternalQueryDsl.g:611:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'postcondition' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // InternalQueryDsl.g:611:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOCUMENTATION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQueryDsl.g:612:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalQueryDsl.g:612:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalQueryDsl.g:613:5: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_17); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getPostconditionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPostconditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.DOCUMENTATION");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getPostconditionKeyword_1());
            		
            // InternalQueryDsl.g:633:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQueryDsl.g:634:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalQueryDsl.g:634:4: (lv_name_2_0= RULE_ID )
                    // InternalQueryDsl.g:635:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPostconditionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPostconditionAccess().getColonKeyword_3());
            		
            // InternalQueryDsl.g:655:3: ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' )
            // InternalQueryDsl.g:656:4: ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            // InternalQueryDsl.g:656:4: ( (lv_expressions_4_0= ruleExpression ) )
            // InternalQueryDsl.g:657:5: (lv_expressions_4_0= ruleExpression )
            {
            // InternalQueryDsl.g:657:5: (lv_expressions_4_0= ruleExpression )
            // InternalQueryDsl.g:658:6: lv_expressions_4_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getPostconditionAccess().getExpressionsExpressionParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_14);
            lv_expressions_4_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPostconditionRule());
            						}
            						add(
            							current,
            							"expressions",
            							lv_expressions_4_0,
            							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getPostconditionAccess().getSemicolonKeyword_4_1());
            			

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
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleParameterList"
    // InternalQueryDsl.g:684:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalQueryDsl.g:684:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalQueryDsl.g:685:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalQueryDsl.g:691:1: ruleParameterList returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:697:2: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // InternalQueryDsl.g:698:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // InternalQueryDsl.g:698:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // InternalQueryDsl.g:699:3: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // InternalQueryDsl.g:699:3: ( (lv_parameters_0_0= ruleParameter ) )
            // InternalQueryDsl.g:700:4: (lv_parameters_0_0= ruleParameter )
            {
            // InternalQueryDsl.g:700:4: (lv_parameters_0_0= ruleParameter )
            // InternalQueryDsl.g:701:5: lv_parameters_0_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_parameters_0_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:718:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQueryDsl.g:719:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalQueryDsl.g:723:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalQueryDsl.g:724:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalQueryDsl.g:724:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalQueryDsl.g:725:6: lv_parameters_2_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getParametersParameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalQueryDsl.g:747:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalQueryDsl.g:747:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalQueryDsl.g:748:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalQueryDsl.g:754:1: ruleParameter returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        Token lv_typeName_2_0=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:760:2: ( ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeName_2_0= RULE_ID ) ) ) )
            // InternalQueryDsl.g:761:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeName_2_0= RULE_ID ) ) )
            {
            // InternalQueryDsl.g:761:2: ( ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeName_2_0= RULE_ID ) ) )
            // InternalQueryDsl.g:762:3: ( (lv_variableName_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_typeName_2_0= RULE_ID ) )
            {
            // InternalQueryDsl.g:762:3: ( (lv_variableName_0_0= RULE_ID ) )
            // InternalQueryDsl.g:763:4: (lv_variableName_0_0= RULE_ID )
            {
            // InternalQueryDsl.g:763:4: (lv_variableName_0_0= RULE_ID )
            // InternalQueryDsl.g:764:5: lv_variableName_0_0= RULE_ID
            {
            lv_variableName_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_variableName_0_0, grammarAccess.getParameterAccess().getVariableNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variableName",
            						lv_variableName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalQueryDsl.g:784:3: ( (lv_typeName_2_0= RULE_ID ) )
            // InternalQueryDsl.g:785:4: (lv_typeName_2_0= RULE_ID )
            {
            // InternalQueryDsl.g:785:4: (lv_typeName_2_0= RULE_ID )
            // InternalQueryDsl.g:786:5: lv_typeName_2_0= RULE_ID
            {
            lv_typeName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_typeName_2_0, grammarAccess.getParameterAccess().getTypeNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleInvariant"
    // InternalQueryDsl.g:806:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // InternalQueryDsl.g:806:50: (iv_ruleInvariant= ruleInvariant EOF )
            // InternalQueryDsl.g:807:2: iv_ruleInvariant= ruleInvariant EOF
            {
             newCompositeNode(grammarAccess.getInvariantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;

             current =iv_ruleInvariant; 
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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalQueryDsl.g:813:1: ruleInvariant returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:819:2: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) ) )
            // InternalQueryDsl.g:820:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            {
            // InternalQueryDsl.g:820:2: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // InternalQueryDsl.g:821:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'invariant' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= ':' ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // InternalQueryDsl.g:821:3: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOCUMENTATION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQueryDsl.g:822:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalQueryDsl.g:822:4: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalQueryDsl.g:823:5: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_19); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getInvariantAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInvariantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.DOCUMENTATION");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getInvariantAccess().getInvariantKeyword_1());
            		
            // InternalQueryDsl.g:843:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryDsl.g:844:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalQueryDsl.g:844:4: (lv_name_2_0= RULE_ID )
                    // InternalQueryDsl.g:845:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInvariantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getInvariantAccess().getColonKeyword_3());
            		
            // InternalQueryDsl.g:865:3: ( ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';' )
            // InternalQueryDsl.g:866:4: ( (lv_expressions_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            // InternalQueryDsl.g:866:4: ( (lv_expressions_4_0= ruleExpression ) )
            // InternalQueryDsl.g:867:5: (lv_expressions_4_0= ruleExpression )
            {
            // InternalQueryDsl.g:867:5: (lv_expressions_4_0= ruleExpression )
            // InternalQueryDsl.g:868:6: lv_expressions_4_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getInvariantAccess().getExpressionsExpressionParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_14);
            lv_expressions_4_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getInvariantRule());
            						}
            						add(
            							current,
            							"expressions",
            							lv_expressions_4_0,
            							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getInvariantAccess().getSemicolonKeyword_4_1());
            			

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
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleExpression"
    // InternalQueryDsl.g:894:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQueryDsl.g:894:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQueryDsl.g:895:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQueryDsl.g:901:1: ruleExpression returns [EObject current=null] : this_ImpliesExpression_0= ruleImpliesExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpression_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:907:2: (this_ImpliesExpression_0= ruleImpliesExpression )
            // InternalQueryDsl.g:908:2: this_ImpliesExpression_0= ruleImpliesExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getImpliesExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;


            		current = this_ImpliesExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // InternalQueryDsl.g:919:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // InternalQueryDsl.g:919:58: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // InternalQueryDsl.g:920:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
             newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;

             current =iv_ruleImpliesExpression; 
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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // InternalQueryDsl.g:926:1: ruleImpliesExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) ) )* ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:932:2: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) ) )* ) )
            // InternalQueryDsl.g:933:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            {
            // InternalQueryDsl.g:933:2: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) ) )* )
            // InternalQueryDsl.g:934:3: this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getImpliesExpressionAccess().getOrExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            			current = this_OrExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:942:3: ( () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQueryDsl.g:943:4: () otherlv_2= 'implies' ( (lv_right_3_0= ruleOrExpression ) )
            	    {
            	    // InternalQueryDsl.g:943:4: ()
            	    // InternalQueryDsl.g:944:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImpliesExpressionAccess().getImpliesKeyword_1_1());
            	    			
            	    // InternalQueryDsl.g:954:4: ( (lv_right_3_0= ruleOrExpression ) )
            	    // InternalQueryDsl.g:955:5: (lv_right_3_0= ruleOrExpression )
            	    {
            	    // InternalQueryDsl.g:955:5: (lv_right_3_0= ruleOrExpression )
            	    // InternalQueryDsl.g:956:6: lv_right_3_0= ruleOrExpression
            	    {

            	    						newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightOrExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleOrExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.OrExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalQueryDsl.g:978:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalQueryDsl.g:978:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalQueryDsl.g:979:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalQueryDsl.g:985:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:991:2: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalQueryDsl.g:992:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalQueryDsl.g:992:2: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalQueryDsl.g:993:3: this_AndExpression_0= ruleAndExpression ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:1001:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQueryDsl.g:1002:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalQueryDsl.g:1002:4: ()
            	    // InternalQueryDsl.g:1003:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	    			
            	    // InternalQueryDsl.g:1013:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalQueryDsl.g:1014:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalQueryDsl.g:1014:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalQueryDsl.g:1015:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalQueryDsl.g:1037:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalQueryDsl.g:1037:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalQueryDsl.g:1038:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalQueryDsl.g:1044:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1050:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalQueryDsl.g:1051:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalQueryDsl.g:1051:2: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalQueryDsl.g:1052:3: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:1060:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQueryDsl.g:1061:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalQueryDsl.g:1061:4: ()
            	    // InternalQueryDsl.g:1062:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	    			
            	    // InternalQueryDsl.g:1072:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalQueryDsl.g:1073:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalQueryDsl.g:1073:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalQueryDsl.g:1074:6: lv_right_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalQueryDsl.g:1096:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalQueryDsl.g:1096:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalQueryDsl.g:1097:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalQueryDsl.g:1103:1: ruleEqualityExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1109:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalQueryDsl.g:1110:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalQueryDsl.g:1110:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalQueryDsl.g:1111:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:1119:3: ( () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=27 && LA21_0<=28)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQueryDsl.g:1120:4: () ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalQueryDsl.g:1120:4: ()
            	    // InternalQueryDsl.g:1121:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQueryDsl.g:1127:4: ( ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) ) )
            	    // InternalQueryDsl.g:1128:5: ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) )
            	    {
            	    // InternalQueryDsl.g:1128:5: ( (lv_operation_2_1= '=' | lv_operation_2_2= '<>' ) )
            	    // InternalQueryDsl.g:1129:6: (lv_operation_2_1= '=' | lv_operation_2_2= '<>' )
            	    {
            	    // InternalQueryDsl.g:1129:6: (lv_operation_2_1= '=' | lv_operation_2_2= '<>' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==27) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==28) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalQueryDsl.g:1130:7: lv_operation_2_1= '='
            	            {
            	            lv_operation_2_1=(Token)match(input,27,FOLLOW_13); 

            	            							newLeafNode(lv_operation_2_1, grammarAccess.getEqualityExpressionAccess().getOperationEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalQueryDsl.g:1141:7: lv_operation_2_2= '<>'
            	            {
            	            lv_operation_2_2=(Token)match(input,28,FOLLOW_13); 

            	            							newLeafNode(lv_operation_2_2, grammarAccess.getEqualityExpressionAccess().getOperationLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalQueryDsl.g:1154:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalQueryDsl.g:1155:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalQueryDsl.g:1155:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalQueryDsl.g:1156:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalQueryDsl.g:1178:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalQueryDsl.g:1178:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalQueryDsl.g:1179:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalQueryDsl.g:1185:1: ruleComparisonExpression returns [EObject current=null] : (this_PlusOrMinusExpression_0= rulePlusOrMinusExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinusExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1191:2: ( (this_PlusOrMinusExpression_0= rulePlusOrMinusExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) ) )* ) )
            // InternalQueryDsl.g:1192:2: (this_PlusOrMinusExpression_0= rulePlusOrMinusExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) ) )* )
            {
            // InternalQueryDsl.g:1192:2: (this_PlusOrMinusExpression_0= rulePlusOrMinusExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) ) )* )
            // InternalQueryDsl.g:1193:3: this_PlusOrMinusExpression_0= rulePlusOrMinusExpression ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getPlusOrMinusExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PlusOrMinusExpression_0=rulePlusOrMinusExpression();

            state._fsp--;


            			current = this_PlusOrMinusExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:1201:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=29 && LA23_0<=32)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQueryDsl.g:1202:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinusExpression ) )
            	    {
            	    // InternalQueryDsl.g:1202:4: ()
            	    // InternalQueryDsl.g:1203:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalQueryDsl.g:1209:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalQueryDsl.g:1210:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalQueryDsl.g:1210:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalQueryDsl.g:1211:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalQueryDsl.g:1211:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt22=4;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt22=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalQueryDsl.g:1212:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_13); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalQueryDsl.g:1223:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,30,FOLLOW_13); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalQueryDsl.g:1234:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,31,FOLLOW_13); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalQueryDsl.g:1245:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,32,FOLLOW_13); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonExpressionAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalQueryDsl.g:1258:4: ( (lv_right_3_0= rulePlusOrMinusExpression ) )
            	    // InternalQueryDsl.g:1259:5: (lv_right_3_0= rulePlusOrMinusExpression )
            	    {
            	    // InternalQueryDsl.g:1259:5: (lv_right_3_0= rulePlusOrMinusExpression )
            	    // InternalQueryDsl.g:1260:6: lv_right_3_0= rulePlusOrMinusExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightPlusOrMinusExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=rulePlusOrMinusExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.PlusOrMinusExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRulePlusOrMinusExpression"
    // InternalQueryDsl.g:1282:1: entryRulePlusOrMinusExpression returns [EObject current=null] : iv_rulePlusOrMinusExpression= rulePlusOrMinusExpression EOF ;
    public final EObject entryRulePlusOrMinusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinusExpression = null;


        try {
            // InternalQueryDsl.g:1282:62: (iv_rulePlusOrMinusExpression= rulePlusOrMinusExpression EOF )
            // InternalQueryDsl.g:1283:2: iv_rulePlusOrMinusExpression= rulePlusOrMinusExpression EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinusExpression=rulePlusOrMinusExpression();

            state._fsp--;

             current =iv_rulePlusOrMinusExpression; 
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
    // $ANTLR end "entryRulePlusOrMinusExpression"


    // $ANTLR start "rulePlusOrMinusExpression"
    // InternalQueryDsl.g:1289:1: rulePlusOrMinusExpression returns [EObject current=null] : (this_MultiplicationOrDivisionExpression_0= ruleMultiplicationOrDivisionExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) ) )* ) ;
    public final EObject rulePlusOrMinusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicationOrDivisionExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1295:2: ( (this_MultiplicationOrDivisionExpression_0= ruleMultiplicationOrDivisionExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) ) )* ) )
            // InternalQueryDsl.g:1296:2: (this_MultiplicationOrDivisionExpression_0= ruleMultiplicationOrDivisionExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) ) )* )
            {
            // InternalQueryDsl.g:1296:2: (this_MultiplicationOrDivisionExpression_0= ruleMultiplicationOrDivisionExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) ) )* )
            // InternalQueryDsl.g:1297:3: this_MultiplicationOrDivisionExpression_0= ruleMultiplicationOrDivisionExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusExpressionAccess().getMultiplicationOrDivisionExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_MultiplicationOrDivisionExpression_0=ruleMultiplicationOrDivisionExpression();

            state._fsp--;


            			current = this_MultiplicationOrDivisionExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:1305:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQueryDsl.g:1306:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) )
            	    {
            	    // InternalQueryDsl.g:1306:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==33) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==34) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalQueryDsl.g:1307:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalQueryDsl.g:1307:5: ( () otherlv_2= '+' )
            	            // InternalQueryDsl.g:1308:6: () otherlv_2= '+'
            	            {
            	            // InternalQueryDsl.g:1308:6: ()
            	            // InternalQueryDsl.g:1309:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusExpressionAccess().getPlusExpressionLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,33,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalQueryDsl.g:1321:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalQueryDsl.g:1321:5: ( () otherlv_4= '-' )
            	            // InternalQueryDsl.g:1322:6: () otherlv_4= '-'
            	            {
            	            // InternalQueryDsl.g:1322:6: ()
            	            // InternalQueryDsl.g:1323:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusExpressionAccess().getMinusExpressionLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,34,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalQueryDsl.g:1335:4: ( (lv_right_5_0= ruleMultiplicationOrDivisionExpression ) )
            	    // InternalQueryDsl.g:1336:5: (lv_right_5_0= ruleMultiplicationOrDivisionExpression )
            	    {
            	    // InternalQueryDsl.g:1336:5: (lv_right_5_0= ruleMultiplicationOrDivisionExpression )
            	    // InternalQueryDsl.g:1337:6: lv_right_5_0= ruleMultiplicationOrDivisionExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusExpressionAccess().getRightMultiplicationOrDivisionExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_5_0=ruleMultiplicationOrDivisionExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.MultiplicationOrDivisionExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "rulePlusOrMinusExpression"


    // $ANTLR start "entryRuleMultiplicationOrDivisionExpression"
    // InternalQueryDsl.g:1359:1: entryRuleMultiplicationOrDivisionExpression returns [EObject current=null] : iv_ruleMultiplicationOrDivisionExpression= ruleMultiplicationOrDivisionExpression EOF ;
    public final EObject entryRuleMultiplicationOrDivisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOrDivisionExpression = null;


        try {
            // InternalQueryDsl.g:1359:75: (iv_ruleMultiplicationOrDivisionExpression= ruleMultiplicationOrDivisionExpression EOF )
            // InternalQueryDsl.g:1360:2: iv_ruleMultiplicationOrDivisionExpression= ruleMultiplicationOrDivisionExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationOrDivisionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicationOrDivisionExpression=ruleMultiplicationOrDivisionExpression();

            state._fsp--;

             current =iv_ruleMultiplicationOrDivisionExpression; 
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
    // $ANTLR end "entryRuleMultiplicationOrDivisionExpression"


    // $ANTLR start "ruleMultiplicationOrDivisionExpression"
    // InternalQueryDsl.g:1366:1: ruleMultiplicationOrDivisionExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationOrDivisionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1372:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // InternalQueryDsl.g:1373:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // InternalQueryDsl.g:1373:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // InternalQueryDsl.g:1374:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:1382:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=35 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQueryDsl.g:1383:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // InternalQueryDsl.g:1383:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==35) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==36) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalQueryDsl.g:1384:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalQueryDsl.g:1384:5: ( () otherlv_2= '*' )
            	            // InternalQueryDsl.g:1385:6: () otherlv_2= '*'
            	            {
            	            // InternalQueryDsl.g:1385:6: ()
            	            // InternalQueryDsl.g:1386:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationOrDivisionExpressionAccess().getMultiplicationExpressionLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,35,FOLLOW_13); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationOrDivisionExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalQueryDsl.g:1398:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalQueryDsl.g:1398:5: ( () otherlv_4= '/' )
            	            // InternalQueryDsl.g:1399:6: () otherlv_4= '/'
            	            {
            	            // InternalQueryDsl.g:1399:6: ()
            	            // InternalQueryDsl.g:1400:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationOrDivisionExpressionAccess().getDivisionExpressionLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,36,FOLLOW_13); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationOrDivisionExpressionAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalQueryDsl.g:1412:4: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // InternalQueryDsl.g:1413:5: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // InternalQueryDsl.g:1413:5: (lv_right_5_0= rulePrimaryExpression )
            	    // InternalQueryDsl.g:1414:6: lv_right_5_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationOrDivisionExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationOrDivisionExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiplicationOrDivisionExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalQueryDsl.g:1436:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalQueryDsl.g:1436:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalQueryDsl.g:1437:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalQueryDsl.g:1443:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PropertyPathExpression_6= rulePropertyPathExpression | this_OldValueExpression_7= ruleOldValueExpression | this_ConstantExpression_8= ruleConstantExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_PropertyPathExpression_6 = null;

        EObject this_OldValueExpression_7 = null;

        EObject this_ConstantExpression_8 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1449:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PropertyPathExpression_6= rulePropertyPathExpression | this_OldValueExpression_7= ruleOldValueExpression | this_ConstantExpression_8= ruleConstantExpression ) )
            // InternalQueryDsl.g:1450:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PropertyPathExpression_6= rulePropertyPathExpression | this_OldValueExpression_7= ruleOldValueExpression | this_ConstantExpression_8= ruleConstantExpression )
            {
            // InternalQueryDsl.g:1450:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) ) ) | this_PropertyPathExpression_6= rulePropertyPathExpression | this_OldValueExpression_7= ruleOldValueExpression | this_ConstantExpression_8= ruleConstantExpression )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
            case 42:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt28=3;
                }
                break;
            case 41:
                {
                alt28=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 38:
            case 39:
            case 40:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalQueryDsl.g:1451:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalQueryDsl.g:1451:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalQueryDsl.g:1452:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1470:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    {
                    // InternalQueryDsl.g:1470:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) ) )
                    // InternalQueryDsl.g:1471:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimaryExpression ) )
                    {
                    // InternalQueryDsl.g:1471:4: ()
                    // InternalQueryDsl.g:1472:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNotExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalQueryDsl.g:1482:4: ( (lv_expression_5_0= rulePrimaryExpression ) )
                    // InternalQueryDsl.g:1483:5: (lv_expression_5_0= rulePrimaryExpression )
                    {
                    // InternalQueryDsl.g:1483:5: (lv_expression_5_0= rulePrimaryExpression )
                    // InternalQueryDsl.g:1484:6: lv_expression_5_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1503:3: this_PropertyPathExpression_6= rulePropertyPathExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getPropertyPathExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyPathExpression_6=rulePropertyPathExpression();

                    state._fsp--;


                    			current = this_PropertyPathExpression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1512:3: this_OldValueExpression_7= ruleOldValueExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOldValueExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OldValueExpression_7=ruleOldValueExpression();

                    state._fsp--;


                    			current = this_OldValueExpression_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1521:3: this_ConstantExpression_8= ruleConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantExpression_8=ruleConstantExpression();

                    state._fsp--;


                    			current = this_ConstantExpression_8;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalQueryDsl.g:1533:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalQueryDsl.g:1533:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalQueryDsl.g:1534:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression; 
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
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalQueryDsl.g:1540:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1546:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) ) )
            // InternalQueryDsl.g:1547:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) )
            {
            // InternalQueryDsl.g:1547:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_value_7_0= 'null' ) ) ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt30=1;
                }
                break;
            case RULE_STRING:
                {
                alt30=2;
                }
                break;
            case 38:
            case 39:
                {
                alt30=3;
                }
                break;
            case 40:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalQueryDsl.g:1548:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1548:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1549:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalQueryDsl.g:1549:4: ()
                    // InternalQueryDsl.g:1550:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalQueryDsl.g:1556:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalQueryDsl.g:1557:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1557:5: (lv_value_1_0= RULE_INT )
                    // InternalQueryDsl.g:1558:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConstantExpressionAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1576:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalQueryDsl.g:1576:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalQueryDsl.g:1577:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalQueryDsl.g:1577:4: ()
                    // InternalQueryDsl.g:1578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalQueryDsl.g:1584:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalQueryDsl.g:1585:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalQueryDsl.g:1585:5: (lv_value_3_0= RULE_STRING )
                    // InternalQueryDsl.g:1586:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getConstantExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1604:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalQueryDsl.g:1604:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalQueryDsl.g:1605:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalQueryDsl.g:1605:4: ()
                    // InternalQueryDsl.g:1606:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalQueryDsl.g:1612:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalQueryDsl.g:1613:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalQueryDsl.g:1613:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalQueryDsl.g:1614:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalQueryDsl.g:1614:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==38) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==39) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalQueryDsl.g:1615:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,38,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getConstantExpressionAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalQueryDsl.g:1626:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,39,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getConstantExpressionAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1641:3: ( () ( (lv_value_7_0= 'null' ) ) )
                    {
                    // InternalQueryDsl.g:1641:3: ( () ( (lv_value_7_0= 'null' ) ) )
                    // InternalQueryDsl.g:1642:4: () ( (lv_value_7_0= 'null' ) )
                    {
                    // InternalQueryDsl.g:1642:4: ()
                    // InternalQueryDsl.g:1643:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getNullConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalQueryDsl.g:1649:4: ( (lv_value_7_0= 'null' ) )
                    // InternalQueryDsl.g:1650:5: (lv_value_7_0= 'null' )
                    {
                    // InternalQueryDsl.g:1650:5: (lv_value_7_0= 'null' )
                    // InternalQueryDsl.g:1651:6: lv_value_7_0= 'null'
                    {
                    lv_value_7_0=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getConstantExpressionAccess().getValueNullKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantExpressionRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_7_0, "null");
                    					

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
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleOldValueExpression"
    // InternalQueryDsl.g:1668:1: entryRuleOldValueExpression returns [EObject current=null] : iv_ruleOldValueExpression= ruleOldValueExpression EOF ;
    public final EObject entryRuleOldValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOldValueExpression = null;


        try {
            // InternalQueryDsl.g:1668:59: (iv_ruleOldValueExpression= ruleOldValueExpression EOF )
            // InternalQueryDsl.g:1669:2: iv_ruleOldValueExpression= ruleOldValueExpression EOF
            {
             newCompositeNode(grammarAccess.getOldValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOldValueExpression=ruleOldValueExpression();

            state._fsp--;

             current =iv_ruleOldValueExpression; 
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
    // $ANTLR end "entryRuleOldValueExpression"


    // $ANTLR start "ruleOldValueExpression"
    // InternalQueryDsl.g:1675:1: ruleOldValueExpression returns [EObject current=null] : ( () otherlv_1= 'old' otherlv_2= '(' ( (lv_expression_3_0= rulePropertyPathExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleOldValueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1681:2: ( ( () otherlv_1= 'old' otherlv_2= '(' ( (lv_expression_3_0= rulePropertyPathExpression ) ) otherlv_4= ')' ) )
            // InternalQueryDsl.g:1682:2: ( () otherlv_1= 'old' otherlv_2= '(' ( (lv_expression_3_0= rulePropertyPathExpression ) ) otherlv_4= ')' )
            {
            // InternalQueryDsl.g:1682:2: ( () otherlv_1= 'old' otherlv_2= '(' ( (lv_expression_3_0= rulePropertyPathExpression ) ) otherlv_4= ')' )
            // InternalQueryDsl.g:1683:3: () otherlv_1= 'old' otherlv_2= '(' ( (lv_expression_3_0= rulePropertyPathExpression ) ) otherlv_4= ')'
            {
            // InternalQueryDsl.g:1683:3: ()
            // InternalQueryDsl.g:1684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOldValueExpressionAccess().getOldValueExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getOldValueExpressionAccess().getOldKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getOldValueExpressionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalQueryDsl.g:1698:3: ( (lv_expression_3_0= rulePropertyPathExpression ) )
            // InternalQueryDsl.g:1699:4: (lv_expression_3_0= rulePropertyPathExpression )
            {
            // InternalQueryDsl.g:1699:4: (lv_expression_3_0= rulePropertyPathExpression )
            // InternalQueryDsl.g:1700:5: lv_expression_3_0= rulePropertyPathExpression
            {

            					newCompositeNode(grammarAccess.getOldValueExpressionAccess().getExpressionPropertyPathExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_expression_3_0=rulePropertyPathExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOldValueExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.PropertyPathExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOldValueExpressionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleOldValueExpression"


    // $ANTLR start "entryRulePropertyPathExpression"
    // InternalQueryDsl.g:1725:1: entryRulePropertyPathExpression returns [EObject current=null] : iv_rulePropertyPathExpression= rulePropertyPathExpression EOF ;
    public final EObject entryRulePropertyPathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyPathExpression = null;


        try {
            // InternalQueryDsl.g:1725:63: (iv_rulePropertyPathExpression= rulePropertyPathExpression EOF )
            // InternalQueryDsl.g:1726:2: iv_rulePropertyPathExpression= rulePropertyPathExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyPathExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyPathExpression=rulePropertyPathExpression();

            state._fsp--;

             current =iv_rulePropertyPathExpression; 
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
    // $ANTLR end "entryRulePropertyPathExpression"


    // $ANTLR start "rulePropertyPathExpression"
    // InternalQueryDsl.g:1732:1: rulePropertyPathExpression returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleNavigatedStatement ) )* ) ;
    public final EObject rulePropertyPathExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1738:2: ( ( () ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleNavigatedStatement ) )* ) )
            // InternalQueryDsl.g:1739:2: ( () ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleNavigatedStatement ) )* )
            {
            // InternalQueryDsl.g:1739:2: ( () ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleNavigatedStatement ) )* )
            // InternalQueryDsl.g:1740:3: () ( (lv_statements_1_0= ruleStatement ) ) ( (lv_statements_2_0= ruleNavigatedStatement ) )*
            {
            // InternalQueryDsl.g:1740:3: ()
            // InternalQueryDsl.g:1741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyPathExpressionAccess().getStatementsExpressionAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:1747:3: ( (lv_statements_1_0= ruleStatement ) )
            // InternalQueryDsl.g:1748:4: (lv_statements_1_0= ruleStatement )
            {
            // InternalQueryDsl.g:1748:4: (lv_statements_1_0= ruleStatement )
            // InternalQueryDsl.g:1749:5: lv_statements_1_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getPropertyPathExpressionAccess().getStatementsStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_statements_1_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyPathExpressionRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_1_0,
            						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1766:3: ( (lv_statements_2_0= ruleNavigatedStatement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=43 && LA31_0<=44)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalQueryDsl.g:1767:4: (lv_statements_2_0= ruleNavigatedStatement )
            	    {
            	    // InternalQueryDsl.g:1767:4: (lv_statements_2_0= ruleNavigatedStatement )
            	    // InternalQueryDsl.g:1768:5: lv_statements_2_0= ruleNavigatedStatement
            	    {

            	    					newCompositeNode(grammarAccess.getPropertyPathExpressionAccess().getStatementsNavigatedStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_statements_2_0=ruleNavigatedStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertyPathExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.NavigatedStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
    // $ANTLR end "rulePropertyPathExpression"


    // $ANTLR start "entryRuleStatement"
    // InternalQueryDsl.g:1789:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalQueryDsl.g:1789:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalQueryDsl.g:1790:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalQueryDsl.g:1796:1: ruleStatement returns [EObject current=null] : ( ( (lv_target_0_0= 'self' ) ) | ( (lv_target_1_0= ruleDirection ) ) | ( (lv_target_2_0= RULE_ID ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;
        Token lv_target_2_0=null;
        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1802:2: ( ( ( (lv_target_0_0= 'self' ) ) | ( (lv_target_1_0= ruleDirection ) ) | ( (lv_target_2_0= RULE_ID ) ) ) )
            // InternalQueryDsl.g:1803:2: ( ( (lv_target_0_0= 'self' ) ) | ( (lv_target_1_0= ruleDirection ) ) | ( (lv_target_2_0= RULE_ID ) ) )
            {
            // InternalQueryDsl.g:1803:2: ( ( (lv_target_0_0= 'self' ) ) | ( (lv_target_1_0= ruleDirection ) ) | ( (lv_target_2_0= RULE_ID ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt32=1;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalQueryDsl.g:1804:3: ( (lv_target_0_0= 'self' ) )
                    {
                    // InternalQueryDsl.g:1804:3: ( (lv_target_0_0= 'self' ) )
                    // InternalQueryDsl.g:1805:4: (lv_target_0_0= 'self' )
                    {
                    // InternalQueryDsl.g:1805:4: (lv_target_0_0= 'self' )
                    // InternalQueryDsl.g:1806:5: lv_target_0_0= 'self'
                    {
                    lv_target_0_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_target_0_0, grammarAccess.getStatementAccess().getTargetSelfKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStatementRule());
                    					}
                    					setWithLastConsumed(current, "target", lv_target_0_0, "self");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1819:3: ( (lv_target_1_0= ruleDirection ) )
                    {
                    // InternalQueryDsl.g:1819:3: ( (lv_target_1_0= ruleDirection ) )
                    // InternalQueryDsl.g:1820:4: (lv_target_1_0= ruleDirection )
                    {
                    // InternalQueryDsl.g:1820:4: (lv_target_1_0= ruleDirection )
                    // InternalQueryDsl.g:1821:5: lv_target_1_0= ruleDirection
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getTargetDirectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_target_1_0=ruleDirection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"target",
                    						lv_target_1_0,
                    						"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Direction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1839:3: ( (lv_target_2_0= RULE_ID ) )
                    {
                    // InternalQueryDsl.g:1839:3: ( (lv_target_2_0= RULE_ID ) )
                    // InternalQueryDsl.g:1840:4: (lv_target_2_0= RULE_ID )
                    {
                    // InternalQueryDsl.g:1840:4: (lv_target_2_0= RULE_ID )
                    // InternalQueryDsl.g:1841:5: lv_target_2_0= RULE_ID
                    {
                    lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_target_2_0, grammarAccess.getStatementAccess().getTargetIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStatementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"target",
                    						lv_target_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNavigatedStatement"
    // InternalQueryDsl.g:1861:1: entryRuleNavigatedStatement returns [EObject current=null] : iv_ruleNavigatedStatement= ruleNavigatedStatement EOF ;
    public final EObject entryRuleNavigatedStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatedStatement = null;


        try {
            // InternalQueryDsl.g:1861:59: (iv_ruleNavigatedStatement= ruleNavigatedStatement EOF )
            // InternalQueryDsl.g:1862:2: iv_ruleNavigatedStatement= ruleNavigatedStatement EOF
            {
             newCompositeNode(grammarAccess.getNavigatedStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatedStatement=ruleNavigatedStatement();

            state._fsp--;

             current =iv_ruleNavigatedStatement; 
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
    // $ANTLR end "entryRuleNavigatedStatement"


    // $ANTLR start "ruleNavigatedStatement"
    // InternalQueryDsl.g:1868:1: ruleNavigatedStatement returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) ) ) | (otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) ) ) | (otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) ) ) ) ;
    public final EObject ruleNavigatedStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_target_3_0=null;
        Token otherlv_4=null;
        EObject lv_methodCall_1_0 = null;

        EObject lv_collectionTarget_5_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1874:2: ( ( (otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) ) ) | (otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) ) ) | (otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) ) ) ) )
            // InternalQueryDsl.g:1875:2: ( (otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) ) ) | (otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) ) ) | (otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) ) ) )
            {
            // InternalQueryDsl.g:1875:2: ( (otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) ) ) | (otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) ) ) | (otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) ) ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_ID) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==EOF||LA33_3==15||LA33_3==19||(LA33_3>=24 && LA33_3<=36)||(LA33_3>=43 && LA33_3<=44)) ) {
                        alt33=2;
                    }
                    else if ( (LA33_3==14||LA33_3==45) ) {
                        alt33=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==44) ) {
                alt33=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalQueryDsl.g:1876:3: (otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) ) )
                    {
                    // InternalQueryDsl.g:1876:3: (otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) ) )
                    // InternalQueryDsl.g:1877:4: otherlv_0= '.' ( (lv_methodCall_1_0= ruleMethodCall ) )
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getNavigatedStatementAccess().getFullStopKeyword_0_0());
                    			
                    // InternalQueryDsl.g:1881:4: ( (lv_methodCall_1_0= ruleMethodCall ) )
                    // InternalQueryDsl.g:1882:5: (lv_methodCall_1_0= ruleMethodCall )
                    {
                    // InternalQueryDsl.g:1882:5: (lv_methodCall_1_0= ruleMethodCall )
                    // InternalQueryDsl.g:1883:6: lv_methodCall_1_0= ruleMethodCall
                    {

                    						newCompositeNode(grammarAccess.getNavigatedStatementAccess().getMethodCallMethodCallParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_methodCall_1_0=ruleMethodCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatedStatementRule());
                    						}
                    						set(
                    							current,
                    							"methodCall",
                    							lv_methodCall_1_0,
                    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.MethodCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1902:3: (otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) ) )
                    {
                    // InternalQueryDsl.g:1902:3: (otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) ) )
                    // InternalQueryDsl.g:1903:4: otherlv_2= '.' ( (lv_target_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNavigatedStatementAccess().getFullStopKeyword_1_0());
                    			
                    // InternalQueryDsl.g:1907:4: ( (lv_target_3_0= RULE_ID ) )
                    // InternalQueryDsl.g:1908:5: (lv_target_3_0= RULE_ID )
                    {
                    // InternalQueryDsl.g:1908:5: (lv_target_3_0= RULE_ID )
                    // InternalQueryDsl.g:1909:6: lv_target_3_0= RULE_ID
                    {
                    lv_target_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_target_3_0, grammarAccess.getNavigatedStatementAccess().getTargetIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigatedStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1927:3: (otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) ) )
                    {
                    // InternalQueryDsl.g:1927:3: (otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) ) )
                    // InternalQueryDsl.g:1928:4: otherlv_4= '->' ( (lv_collectionTarget_5_0= ruleCollectionMethod ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavigatedStatementAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalQueryDsl.g:1932:4: ( (lv_collectionTarget_5_0= ruleCollectionMethod ) )
                    // InternalQueryDsl.g:1933:5: (lv_collectionTarget_5_0= ruleCollectionMethod )
                    {
                    // InternalQueryDsl.g:1933:5: (lv_collectionTarget_5_0= ruleCollectionMethod )
                    // InternalQueryDsl.g:1934:6: lv_collectionTarget_5_0= ruleCollectionMethod
                    {

                    						newCompositeNode(grammarAccess.getNavigatedStatementAccess().getCollectionTargetCollectionMethodParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_collectionTarget_5_0=ruleCollectionMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavigatedStatementRule());
                    						}
                    						set(
                    							current,
                    							"collectionTarget",
                    							lv_collectionTarget_5_0,
                    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.CollectionMethod");
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
    // $ANTLR end "ruleNavigatedStatement"


    // $ANTLR start "entryRuleMethodCall"
    // InternalQueryDsl.g:1956:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalQueryDsl.g:1956:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalQueryDsl.g:1957:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalQueryDsl.g:1963:1: ruleMethodCall returns [EObject current=null] : ( ( (lv_targetMethod_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' ) | otherlv_4= '()' ) ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token lv_targetMethod_0_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1969:2: ( ( ( (lv_targetMethod_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' ) | otherlv_4= '()' ) ) )
            // InternalQueryDsl.g:1970:2: ( ( (lv_targetMethod_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' ) | otherlv_4= '()' ) )
            {
            // InternalQueryDsl.g:1970:2: ( ( (lv_targetMethod_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' ) | otherlv_4= '()' ) )
            // InternalQueryDsl.g:1971:3: ( (lv_targetMethod_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' ) | otherlv_4= '()' )
            {
            // InternalQueryDsl.g:1971:3: ( (lv_targetMethod_0_0= RULE_ID ) )
            // InternalQueryDsl.g:1972:4: (lv_targetMethod_0_0= RULE_ID )
            {
            // InternalQueryDsl.g:1972:4: (lv_targetMethod_0_0= RULE_ID )
            // InternalQueryDsl.g:1973:5: lv_targetMethod_0_0= RULE_ID
            {
            lv_targetMethod_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_targetMethod_0_0, grammarAccess.getMethodCallAccess().getTargetMethodIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetMethod",
            						lv_targetMethod_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQueryDsl.g:1989:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' ) | otherlv_4= '()' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalQueryDsl.g:1990:4: (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' )
                    {
                    // InternalQueryDsl.g:1990:4: (otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')' )
                    // InternalQueryDsl.g:1991:5: otherlv_1= '(' ( (lv_parameters_2_0= RULE_ID ) )* otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_32); 

                    					newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalQueryDsl.g:1995:5: ( (lv_parameters_2_0= RULE_ID ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ID) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalQueryDsl.g:1996:6: (lv_parameters_2_0= RULE_ID )
                    	    {
                    	    // InternalQueryDsl.g:1996:6: (lv_parameters_2_0= RULE_ID )
                    	    // InternalQueryDsl.g:1997:7: lv_parameters_2_0= RULE_ID
                    	    {
                    	    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    	    							newLeafNode(lv_parameters_2_0, grammarAccess.getMethodCallAccess().getParametersIDTerminalRuleCall_1_0_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMethodCallRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_2_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getMethodCallAccess().getRightParenthesisKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2019:4: otherlv_4= '()'
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                    			

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleCollectionMethod"
    // InternalQueryDsl.g:2028:1: entryRuleCollectionMethod returns [EObject current=null] : iv_ruleCollectionMethod= ruleCollectionMethod EOF ;
    public final EObject entryRuleCollectionMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionMethod = null;


        try {
            // InternalQueryDsl.g:2028:57: (iv_ruleCollectionMethod= ruleCollectionMethod EOF )
            // InternalQueryDsl.g:2029:2: iv_ruleCollectionMethod= ruleCollectionMethod EOF
            {
             newCompositeNode(grammarAccess.getCollectionMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionMethod=ruleCollectionMethod();

            state._fsp--;

             current =iv_ruleCollectionMethod; 
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
    // $ANTLR end "entryRuleCollectionMethod"


    // $ANTLR start "ruleCollectionMethod"
    // InternalQueryDsl.g:2035:1: ruleCollectionMethod returns [EObject current=null] : (this_SimpleCollectionMethod_0= ruleSimpleCollectionMethod | this_ParametrizedCollectionMethod_1= ruleParametrizedCollectionMethod ) ;
    public final EObject ruleCollectionMethod() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleCollectionMethod_0 = null;

        EObject this_ParametrizedCollectionMethod_1 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:2041:2: ( (this_SimpleCollectionMethod_0= ruleSimpleCollectionMethod | this_ParametrizedCollectionMethod_1= ruleParametrizedCollectionMethod ) )
            // InternalQueryDsl.g:2042:2: (this_SimpleCollectionMethod_0= ruleSimpleCollectionMethod | this_ParametrizedCollectionMethod_1= ruleParametrizedCollectionMethod )
            {
            // InternalQueryDsl.g:2042:2: (this_SimpleCollectionMethod_0= ruleSimpleCollectionMethod | this_ParametrizedCollectionMethod_1= ruleParametrizedCollectionMethod )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=46 && LA36_0<=48)) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=49 && LA36_0<=50)) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalQueryDsl.g:2043:3: this_SimpleCollectionMethod_0= ruleSimpleCollectionMethod
                    {

                    			newCompositeNode(grammarAccess.getCollectionMethodAccess().getSimpleCollectionMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleCollectionMethod_0=ruleSimpleCollectionMethod();

                    state._fsp--;


                    			current = this_SimpleCollectionMethod_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2052:3: this_ParametrizedCollectionMethod_1= ruleParametrizedCollectionMethod
                    {

                    			newCompositeNode(grammarAccess.getCollectionMethodAccess().getParametrizedCollectionMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParametrizedCollectionMethod_1=ruleParametrizedCollectionMethod();

                    state._fsp--;


                    			current = this_ParametrizedCollectionMethod_1;
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
    // $ANTLR end "ruleCollectionMethod"


    // $ANTLR start "entryRuleSimpleCollectionMethod"
    // InternalQueryDsl.g:2064:1: entryRuleSimpleCollectionMethod returns [EObject current=null] : iv_ruleSimpleCollectionMethod= ruleSimpleCollectionMethod EOF ;
    public final EObject entryRuleSimpleCollectionMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleCollectionMethod = null;


        try {
            // InternalQueryDsl.g:2064:63: (iv_ruleSimpleCollectionMethod= ruleSimpleCollectionMethod EOF )
            // InternalQueryDsl.g:2065:2: iv_ruleSimpleCollectionMethod= ruleSimpleCollectionMethod EOF
            {
             newCompositeNode(grammarAccess.getSimpleCollectionMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleCollectionMethod=ruleSimpleCollectionMethod();

            state._fsp--;

             current =iv_ruleSimpleCollectionMethod; 
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
    // $ANTLR end "entryRuleSimpleCollectionMethod"


    // $ANTLR start "ruleSimpleCollectionMethod"
    // InternalQueryDsl.g:2071:1: ruleSimpleCollectionMethod returns [EObject current=null] : ( ( ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) ) ) otherlv_1= '()' ) ;
    public final EObject ruleSimpleCollectionMethod() throws RecognitionException {
        EObject current = null;

        Token lv_method_0_1=null;
        Token lv_method_0_2=null;
        Token lv_method_0_3=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2077:2: ( ( ( ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) ) ) otherlv_1= '()' ) )
            // InternalQueryDsl.g:2078:2: ( ( ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) ) ) otherlv_1= '()' )
            {
            // InternalQueryDsl.g:2078:2: ( ( ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) ) ) otherlv_1= '()' )
            // InternalQueryDsl.g:2079:3: ( ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) ) ) otherlv_1= '()'
            {
            // InternalQueryDsl.g:2079:3: ( ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) ) )
            // InternalQueryDsl.g:2080:4: ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) )
            {
            // InternalQueryDsl.g:2080:4: ( (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' ) )
            // InternalQueryDsl.g:2081:5: (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' )
            {
            // InternalQueryDsl.g:2081:5: (lv_method_0_1= 'notEmpty' | lv_method_0_2= 'isEmpty' | lv_method_0_3= 'size' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt37=1;
                }
                break;
            case 47:
                {
                alt37=2;
                }
                break;
            case 48:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalQueryDsl.g:2082:6: lv_method_0_1= 'notEmpty'
                    {
                    lv_method_0_1=(Token)match(input,46,FOLLOW_33); 

                    						newLeafNode(lv_method_0_1, grammarAccess.getSimpleCollectionMethodAccess().getMethodNotEmptyKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleCollectionMethodRule());
                    						}
                    						setWithLastConsumed(current, "method", lv_method_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2093:6: lv_method_0_2= 'isEmpty'
                    {
                    lv_method_0_2=(Token)match(input,47,FOLLOW_33); 

                    						newLeafNode(lv_method_0_2, grammarAccess.getSimpleCollectionMethodAccess().getMethodIsEmptyKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleCollectionMethodRule());
                    						}
                    						setWithLastConsumed(current, "method", lv_method_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2104:6: lv_method_0_3= 'size'
                    {
                    lv_method_0_3=(Token)match(input,48,FOLLOW_33); 

                    						newLeafNode(lv_method_0_3, grammarAccess.getSimpleCollectionMethodAccess().getMethodSizeKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleCollectionMethodRule());
                    						}
                    						setWithLastConsumed(current, "method", lv_method_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleCollectionMethodAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleCollectionMethod"


    // $ANTLR start "entryRuleParametrizedCollectionMethod"
    // InternalQueryDsl.g:2125:1: entryRuleParametrizedCollectionMethod returns [EObject current=null] : iv_ruleParametrizedCollectionMethod= ruleParametrizedCollectionMethod EOF ;
    public final EObject entryRuleParametrizedCollectionMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametrizedCollectionMethod = null;


        try {
            // InternalQueryDsl.g:2125:69: (iv_ruleParametrizedCollectionMethod= ruleParametrizedCollectionMethod EOF )
            // InternalQueryDsl.g:2126:2: iv_ruleParametrizedCollectionMethod= ruleParametrizedCollectionMethod EOF
            {
             newCompositeNode(grammarAccess.getParametrizedCollectionMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametrizedCollectionMethod=ruleParametrizedCollectionMethod();

            state._fsp--;

             current =iv_ruleParametrizedCollectionMethod; 
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
    // $ANTLR end "entryRuleParametrizedCollectionMethod"


    // $ANTLR start "ruleParametrizedCollectionMethod"
    // InternalQueryDsl.g:2132:1: ruleParametrizedCollectionMethod returns [EObject current=null] : ( (otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleParametrizedCollectionMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_typeSelect_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_indexExpression_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:2138:2: ( ( (otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            // InternalQueryDsl.g:2139:2: ( (otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            {
            // InternalQueryDsl.g:2139:2: ( (otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')' ) | (otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            else if ( (LA38_0==50) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalQueryDsl.g:2140:3: (otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')' )
                    {
                    // InternalQueryDsl.g:2140:3: (otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')' )
                    // InternalQueryDsl.g:2141:4: otherlv_0= 'typeSelect(' ( (lv_typeSelect_1_0= RULE_ID ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectKeyword_0_0());
                    			
                    // InternalQueryDsl.g:2145:4: ( (lv_typeSelect_1_0= RULE_ID ) )
                    // InternalQueryDsl.g:2146:5: (lv_typeSelect_1_0= RULE_ID )
                    {
                    // InternalQueryDsl.g:2146:5: (lv_typeSelect_1_0= RULE_ID )
                    // InternalQueryDsl.g:2147:6: lv_typeSelect_1_0= RULE_ID
                    {
                    lv_typeSelect_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_typeSelect_1_0, grammarAccess.getParametrizedCollectionMethodAccess().getTypeSelectIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParametrizedCollectionMethodRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"typeSelect",
                    							lv_typeSelect_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParametrizedCollectionMethodAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2169:3: (otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
                    {
                    // InternalQueryDsl.g:2169:3: (otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')' )
                    // InternalQueryDsl.g:2170:4: otherlv_3= 'at(' ( (lv_indexExpression_4_0= ruleExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getParametrizedCollectionMethodAccess().getAtKeyword_1_0());
                    			
                    // InternalQueryDsl.g:2174:4: ( (lv_indexExpression_4_0= ruleExpression ) )
                    // InternalQueryDsl.g:2175:5: (lv_indexExpression_4_0= ruleExpression )
                    {
                    // InternalQueryDsl.g:2175:5: (lv_indexExpression_4_0= ruleExpression )
                    // InternalQueryDsl.g:2176:6: lv_indexExpression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getParametrizedCollectionMethodAccess().getIndexExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_indexExpression_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametrizedCollectionMethodRule());
                    						}
                    						set(
                    							current,
                    							"indexExpression",
                    							lv_indexExpression_4_0,
                    							"de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParametrizedCollectionMethodAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleParametrizedCollectionMethod"


    // $ANTLR start "entryRuleDirection"
    // InternalQueryDsl.g:2202:1: entryRuleDirection returns [String current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final String entryRuleDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirection = null;


        try {
            // InternalQueryDsl.g:2202:49: (iv_ruleDirection= ruleDirection EOF )
            // InternalQueryDsl.g:2203:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection.getText(); 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalQueryDsl.g:2209:1: ruleDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'EAST' | kw= 'WEST' | kw= 'SOUTH' | kw= 'NORTH' ) ;
    public final AntlrDatatypeRuleToken ruleDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2215:2: ( (kw= 'EAST' | kw= 'WEST' | kw= 'SOUTH' | kw= 'NORTH' ) )
            // InternalQueryDsl.g:2216:2: (kw= 'EAST' | kw= 'WEST' | kw= 'SOUTH' | kw= 'NORTH' )
            {
            // InternalQueryDsl.g:2216:2: (kw= 'EAST' | kw= 'WEST' | kw= 'SOUTH' | kw= 'NORTH' )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt39=1;
                }
                break;
            case 52:
                {
                alt39=2;
                }
                break;
            case 53:
                {
                alt39=3;
                }
                break;
            case 54:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalQueryDsl.g:2217:3: kw= 'EAST'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirectionAccess().getEASTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2223:3: kw= 'WEST'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirectionAccess().getWESTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2229:3: kw= 'SOUTH'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirectionAccess().getSOUTHKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:2235:3: kw= 'NORTH'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirectionAccess().getNORTHKeyword_3());
                    		

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
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000B30020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000B30022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000B34020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x007807E0000040D0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0078040000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0007C00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});

}