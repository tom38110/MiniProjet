/*
 * generated by Xtext 2.23.0
 */
grammar InternalPDL2;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.n7.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.PDL2GrammarAccess;

}

@parser::members {

 	private PDL2GrammarAccess grammarAccess;

    public InternalPDL2Parser(TokenStream input, PDL2GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Process";
   	}

   	@Override
   	protected PDL2GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	iv_ruleProcess=ruleProcess
	{ $current=$iv_ruleProcess.current; }
	EOF;

// Rule Process
ruleProcess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='process'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcessRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
				}
				lv_processElements_3_0=ruleProcessElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					add(
						$current,
						"processElements",
						lv_processElements_3_0,
						"fr.n7.PDL2.ProcessElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleProcessElement
entryRuleProcessElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessElementRule()); }
	iv_ruleProcessElement=ruleProcessElement
	{ $current=$iv_ruleProcessElement.current; }
	EOF;

// Rule ProcessElement
ruleProcessElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
		}
		this_WorkDefinition_0=ruleWorkDefinition
		{
			$current = $this_WorkDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_1());
		}
		this_Guidance_1=ruleGuidance
		{
			$current = $this_Guidance_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkDefinitionRule()); }
	iv_ruleWorkDefinition=ruleWorkDefinition
	{ $current=$iv_ruleWorkDefinition.current; }
	EOF;

// Rule WorkDefinition
ruleWorkDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='wd'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='starts'
			{
				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getStartsKeyword_3_0());
			}
			otherlv_4='if'
			{
				newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getIfKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceStartParserRuleCall_3_2_0());
					}
					lv_linksToPredecessors_5_0=ruleDependanceStart
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
						}
						add(
							$current,
							"linksToPredecessors",
							lv_linksToPredecessors_5_0,
							"fr.n7.PDL2.DependanceStart");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		(
			otherlv_6='finishes'
			{
				newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getFinishesKeyword_4_0());
			}
			otherlv_7='if'
			{
				newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getIfKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsDependanceFinishParserRuleCall_4_2_0());
					}
					lv_linksToPredecessors_8_0=ruleDependanceFinish
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
						}
						add(
							$current,
							"linksToPredecessors",
							lv_linksToPredecessors_8_0,
							"fr.n7.PDL2.DependanceFinish");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleDependanceStart
entryRuleDependanceStart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependanceStartRule()); }
	iv_ruleDependanceStart=ruleDependanceStart
	{ $current=$iv_ruleDependanceStart.current; }
	EOF;

// Rule DependanceStart
ruleDependanceStart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDependanceStartRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0());
				}
				lv_link_1_0=ruleWorkSequenceKindStart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDependanceStartRule());
					}
					set(
						$current,
						"link",
						lv_link_1_0,
						"fr.n7.PDL2.WorkSequenceKindStart");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWorkSequenceKindStart
entryRuleWorkSequenceKindStart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceKindStartRule()); }
	iv_ruleWorkSequenceKindStart=ruleWorkSequenceKindStart
	{ $current=$iv_ruleWorkSequenceKindStart.current; }
	EOF;

// Rule WorkSequenceKindStart
ruleWorkSequenceKindStart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_Started2Start_0_0='started'
				{
					newLeafNode(lv_Started2Start_0_0, grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartStartedKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceKindStartRule());
					}
					setWithLastConsumed($current, "Started2Start", lv_Started2Start_0_0, "started");
				}
			)
		)
		    |
		(
			(
				lv_Started2Finish_1_0='finished'
				{
					newLeafNode(lv_Started2Finish_1_0, grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishFinishedKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceKindStartRule());
					}
					setWithLastConsumed($current, "Started2Finish", lv_Started2Finish_1_0, "finished");
				}
			)
		)
	)
;

// Entry rule entryRuleDependanceFinish
entryRuleDependanceFinish returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependanceFinishRule()); }
	iv_ruleDependanceFinish=ruleDependanceFinish
	{ $current=$iv_ruleDependanceFinish.current; }
	EOF;

// Rule DependanceFinish
ruleDependanceFinish returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDependanceFinishRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0());
				}
				lv_link_1_0=ruleWorkSequenceKindFinish
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDependanceFinishRule());
					}
					set(
						$current,
						"link",
						lv_link_1_0,
						"fr.n7.PDL2.WorkSequenceKindFinish");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWorkSequenceKindFinish
entryRuleWorkSequenceKindFinish returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceKindFinishRule()); }
	iv_ruleWorkSequenceKindFinish=ruleWorkSequenceKindFinish
	{ $current=$iv_ruleWorkSequenceKindFinish.current; }
	EOF;

// Rule WorkSequenceKindFinish
ruleWorkSequenceKindFinish returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_Finished2Start_0_0='started'
				{
					newLeafNode(lv_Finished2Start_0_0, grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartStartedKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceKindFinishRule());
					}
					setWithLastConsumed($current, "Finished2Start", lv_Finished2Start_0_0, "started");
				}
			)
		)
		    |
		(
			(
				lv_Finished2Finish_1_0='finished'
				{
					newLeafNode(lv_Finished2Finish_1_0, grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishFinishedKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceKindFinishRule());
					}
					setWithLastConsumed($current, "Finished2Finish", lv_Finished2Finish_1_0, "finished");
				}
			)
		)
	)
;

// Entry rule entryRuleGuidance
entryRuleGuidance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuidanceRule()); }
	iv_ruleGuidance=ruleGuidance
	{ $current=$iv_ruleGuidance.current; }
	EOF;

// Rule Guidance
ruleGuidance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='note'
		{
			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getNoteKeyword_0());
		}
		(
			(
				lv_texte_1_0=RULE_STRING
				{
					newLeafNode(lv_texte_1_0, grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuidanceRule());
					}
					setWithLastConsumed(
						$current,
						"texte",
						lv_texte_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
