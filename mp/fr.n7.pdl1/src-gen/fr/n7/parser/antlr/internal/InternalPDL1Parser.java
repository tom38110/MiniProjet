package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.PDL1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'uses'", "'ws'", "'from'", "'to'", "'note'", "'ressource'", "'quantity'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDL1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL1.g"; }



     	private PDL1GrammarAccess grammarAccess;

        public InternalPDL1Parser(TokenStream input, PDL1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL1.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL1.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL1.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL1.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_processElements_3_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:78:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' ) )
            // InternalPDL1.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            {
            // InternalPDL1.g:79:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}' )
            // InternalPDL1.g:80:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalPDL1.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPDL1.g:106:3: ( (lv_processElements_3_0= ruleProcessElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==16||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    {
            	    // InternalPDL1.g:107:4: (lv_processElements_3_0= ruleProcessElement )
            	    // InternalPDL1.g:108:5: lv_processElements_3_0= ruleProcessElement
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_processElements_3_0=ruleProcessElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processElements",
            	    						lv_processElements_3_0,
            	    						"fr.n7.PDL1.ProcessElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL1.g:133:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalPDL1.g:133:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalPDL1.g:134:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL1.g:140:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_Ressource_3 = null;



        	enterRule();

        try {
            // InternalPDL1.g:146:2: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource ) )
            // InternalPDL1.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource )
            {
            // InternalPDL1.g:147:2: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_Ressource_3= ruleRessource )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPDL1.g:148:3: this_WorkDefinition_0= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPDL1.g:157:3: this_WorkSequence_1= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPDL1.g:166:3: this_Guidance_2= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPDL1.g:175:3: this_Ressource_3= ruleRessource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ressource_3=ruleRessource();

                    state._fsp--;


                    			current = this_Ressource_3;
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL1.g:187:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalPDL1.g:187:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalPDL1.g:188:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL1.g:194:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+ )? ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_ressourcesUsed_3_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:200:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+ )? ) )
            // InternalPDL1.g:201:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+ )? )
            {
            // InternalPDL1.g:201:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+ )? )
            // InternalPDL1.g:202:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+ )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalPDL1.g:206:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:207:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:207:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:208:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPDL1.g:224:3: (otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL1.g:225:4: otherlv_2= 'uses' ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getUsesKeyword_2_0());
                    			
                    // InternalPDL1.g:229:4: ( (lv_ressourcesUsed_3_0= ruleRessourceUsed ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_INT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPDL1.g:230:5: (lv_ressourcesUsed_3_0= ruleRessourceUsed )
                    	    {
                    	    // InternalPDL1.g:230:5: (lv_ressourcesUsed_3_0= ruleRessourceUsed )
                    	    // InternalPDL1.g:231:6: lv_ressourcesUsed_3_0= ruleRessourceUsed
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getRessourcesUsedRessourceUsedParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_ressourcesUsed_3_0=ruleRessourceUsed();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ressourcesUsed",
                    	    							lv_ressourcesUsed_3_0,
                    	    							"fr.n7.PDL1.RessourceUsed");
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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL1.g:253:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL1.g:253:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL1.g:254:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL1.g:260:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL1.g:266:2: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPDL1.g:267:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPDL1.g:267:2: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalPDL1.g:268:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            // InternalPDL1.g:272:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL1.g:273:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL1.g:273:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL1.g:274:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL1.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
            		
            // InternalPDL1.g:295:3: ( (otherlv_3= RULE_ID ) )
            // InternalPDL1.g:296:4: (otherlv_3= RULE_ID )
            {
            // InternalPDL1.g:296:4: (otherlv_3= RULE_ID )
            // InternalPDL1.g:297:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
            		
            // InternalPDL1.g:312:3: ( (otherlv_5= RULE_ID ) )
            // InternalPDL1.g:313:4: (otherlv_5= RULE_ID )
            {
            // InternalPDL1.g:313:4: (otherlv_5= RULE_ID )
            // InternalPDL1.g:314:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
            				

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL1.g:329:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalPDL1.g:329:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalPDL1.g:330:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL1.g:336:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:342:2: ( (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) ) )
            // InternalPDL1.g:343:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            {
            // InternalPDL1.g:343:2: (otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) ) )
            // InternalPDL1.g:344:3: otherlv_0= 'note' ( (lv_texte_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
            		
            // InternalPDL1.g:348:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalPDL1.g:349:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalPDL1.g:349:4: (lv_texte_1_0= RULE_STRING )
            // InternalPDL1.g:350:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL1.g:370:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalPDL1.g:370:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalPDL1.g:371:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL1.g:377:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'ressource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;


        	enterRule();

        try {
            // InternalPDL1.g:383:2: ( (otherlv_0= 'ressource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) ) )
            // InternalPDL1.g:384:2: (otherlv_0= 'ressource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) )
            {
            // InternalPDL1.g:384:2: (otherlv_0= 'ressource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) ) )
            // InternalPDL1.g:385:3: otherlv_0= 'ressource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'quantity' ( (lv_quantity_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRessourceKeyword_0());
            		
            // InternalPDL1.g:389:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPDL1.g:390:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPDL1.g:390:4: (lv_name_1_0= RULE_ID )
            // InternalPDL1.g:391:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getQuantityKeyword_2());
            		
            // InternalPDL1.g:411:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalPDL1.g:412:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalPDL1.g:412:4: (lv_quantity_3_0= RULE_INT )
            // InternalPDL1.g:413:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleRessourceUsed"
    // InternalPDL1.g:433:1: entryRuleRessourceUsed returns [EObject current=null] : iv_ruleRessourceUsed= ruleRessourceUsed EOF ;
    public final EObject entryRuleRessourceUsed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessourceUsed = null;


        try {
            // InternalPDL1.g:433:54: (iv_ruleRessourceUsed= ruleRessourceUsed EOF )
            // InternalPDL1.g:434:2: iv_ruleRessourceUsed= ruleRessourceUsed EOF
            {
             newCompositeNode(grammarAccess.getRessourceUsedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessourceUsed=ruleRessourceUsed();

            state._fsp--;

             current =iv_ruleRessourceUsed; 
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
    // $ANTLR end "entryRuleRessourceUsed"


    // $ANTLR start "ruleRessourceUsed"
    // InternalPDL1.g:440:1: ruleRessourceUsed returns [EObject current=null] : ( ( (lv_occ_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRessourceUsed() throws RecognitionException {
        EObject current = null;

        Token lv_occ_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPDL1.g:446:2: ( ( ( (lv_occ_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalPDL1.g:447:2: ( ( (lv_occ_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalPDL1.g:447:2: ( ( (lv_occ_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalPDL1.g:448:3: ( (lv_occ_0_0= RULE_INT ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalPDL1.g:448:3: ( (lv_occ_0_0= RULE_INT ) )
            // InternalPDL1.g:449:4: (lv_occ_0_0= RULE_INT )
            {
            // InternalPDL1.g:449:4: (lv_occ_0_0= RULE_INT )
            // InternalPDL1.g:450:5: lv_occ_0_0= RULE_INT
            {
            lv_occ_0_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_occ_0_0, grammarAccess.getRessourceUsedAccess().getOccINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceUsedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"occ",
            						lv_occ_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPDL1.g:466:3: ( (otherlv_1= RULE_ID ) )
            // InternalPDL1.g:467:4: (otherlv_1= RULE_ID )
            {
            // InternalPDL1.g:467:4: (otherlv_1= RULE_ID )
            // InternalPDL1.g:468:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceUsedRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRessourceUsedAccess().getRessourceUsedRessourceCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRessourceUsed"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL1.g:483:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL1.g:489:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL1.g:490:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL1.g:490:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
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
                    // InternalPDL1.g:491:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL1.g:491:3: (enumLiteral_0= 's2s' )
                    // InternalPDL1.g:492:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL1.g:499:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL1.g:499:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL1.g:500:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL1.g:507:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL1.g:507:3: (enumLiteral_2= 's2f' )
                    // InternalPDL1.g:508:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL1.g:515:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL1.g:515:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL1.g:516:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000196000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});

}