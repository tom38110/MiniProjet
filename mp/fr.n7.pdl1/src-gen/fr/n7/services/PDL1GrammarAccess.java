/*
 * generated by Xtext 2.23.0
 */
package fr.n7.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PDL1GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProcessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.Process");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcessKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProcessElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProcessElementsProcessElementParserRuleCall_3_0 = (RuleCall)cProcessElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Process:
		//	'process' name=ID '{'
		//	processElements+=ProcessElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'process' name=ID '{' processElements+=ProcessElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'process'
		public Keyword getProcessKeyword_0() { return cProcessKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//processElements+=ProcessElement*
		public Assignment getProcessElementsAssignment_3() { return cProcessElementsAssignment_3; }
		
		//ProcessElement
		public RuleCall getProcessElementsProcessElementParserRuleCall_3_0() { return cProcessElementsProcessElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ProcessElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.ProcessElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWorkDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWorkSequenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGuidanceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRessourceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ProcessElement:
		//	WorkDefinition | WorkSequence | Guidance | Ressource;
		@Override public ParserRule getRule() { return rule; }
		
		//WorkDefinition | WorkSequence | Guidance | Ressource
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//WorkDefinition
		public RuleCall getWorkDefinitionParserRuleCall_0() { return cWorkDefinitionParserRuleCall_0; }
		
		//WorkSequence
		public RuleCall getWorkSequenceParserRuleCall_1() { return cWorkSequenceParserRuleCall_1; }
		
		//Guidance
		public RuleCall getGuidanceParserRuleCall_2() { return cGuidanceParserRuleCall_2; }
		
		//Ressource
		public RuleCall getRessourceParserRuleCall_3() { return cRessourceParserRuleCall_3; }
	}
	public class WorkDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.WorkDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cUsesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRessourcesUsedAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRessourcesUsedRessourceUsedParserRuleCall_2_1_0 = (RuleCall)cRessourcesUsedAssignment_2_1.eContents().get(0);
		
		//WorkDefinition:
		//	'wd' name=ID ('uses' ressourcesUsed+=RessourceUsed+)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'wd' name=ID ('uses' ressourcesUsed+=RessourceUsed+)?
		public Group getGroup() { return cGroup; }
		
		//'wd'
		public Keyword getWdKeyword_0() { return cWdKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('uses' ressourcesUsed+=RessourceUsed+)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'uses'
		public Keyword getUsesKeyword_2_0() { return cUsesKeyword_2_0; }
		
		//ressourcesUsed+=RessourceUsed+
		public Assignment getRessourcesUsedAssignment_2_1() { return cRessourcesUsedAssignment_2_1; }
		
		//RessourceUsed
		public RuleCall getRessourcesUsedRessourceUsedParserRuleCall_2_1_0() { return cRessourcesUsedRessourceUsedParserRuleCall_2_1_0; }
	}
	public class WorkSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.WorkSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLinkTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTypeWorkSequenceTypeEnumRuleCall_1_0 = (RuleCall)cLinkTypeAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPredecessorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPredecessorWorkDefinitionCrossReference_3_0 = (CrossReference)cPredecessorAssignment_3.eContents().get(0);
		private final RuleCall cPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cPredecessorWorkDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSuccessorAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSuccessorWorkDefinitionCrossReference_5_0 = (CrossReference)cSuccessorAssignment_5.eContents().get(0);
		private final RuleCall cSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1 = (RuleCall)cSuccessorWorkDefinitionCrossReference_5_0.eContents().get(1);
		
		//WorkSequence:
		//	'ws' linkType=WorkSequenceType
		//	'from' predecessor=[WorkDefinition]
		//	'to' successor=[WorkDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'ws' linkType=WorkSequenceType 'from' predecessor=[WorkDefinition] 'to' successor=[WorkDefinition]
		public Group getGroup() { return cGroup; }
		
		//'ws'
		public Keyword getWsKeyword_0() { return cWsKeyword_0; }
		
		//linkType=WorkSequenceType
		public Assignment getLinkTypeAssignment_1() { return cLinkTypeAssignment_1; }
		
		//WorkSequenceType
		public RuleCall getLinkTypeWorkSequenceTypeEnumRuleCall_1_0() { return cLinkTypeWorkSequenceTypeEnumRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//predecessor=[WorkDefinition]
		public Assignment getPredecessorAssignment_3() { return cPredecessorAssignment_3; }
		
		//[WorkDefinition]
		public CrossReference getPredecessorWorkDefinitionCrossReference_3_0() { return cPredecessorWorkDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1() { return cPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//successor=[WorkDefinition]
		public Assignment getSuccessorAssignment_5() { return cSuccessorAssignment_5; }
		
		//[WorkDefinition]
		public CrossReference getSuccessorWorkDefinitionCrossReference_5_0() { return cSuccessorWorkDefinitionCrossReference_5_0; }
		
		//ID
		public RuleCall getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1() { return cSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1; }
	}
	public class GuidanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.Guidance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNoteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTexteAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTexteSTRINGTerminalRuleCall_1_0 = (RuleCall)cTexteAssignment_1.eContents().get(0);
		
		//Guidance:
		//	'note' texte=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'note' texte=STRING
		public Group getGroup() { return cGroup; }
		
		//'note'
		public Keyword getNoteKeyword_0() { return cNoteKeyword_0; }
		
		//texte=STRING
		public Assignment getTexteAssignment_1() { return cTexteAssignment_1; }
		
		//STRING
		public RuleCall getTexteSTRINGTerminalRuleCall_1_0() { return cTexteSTRINGTerminalRuleCall_1_0; }
	}
	public class RessourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.Ressource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRessourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cQuantityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuantityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuantityINTTerminalRuleCall_3_0 = (RuleCall)cQuantityAssignment_3.eContents().get(0);
		
		//Ressource:
		//	'ressource' name=ID 'quantity' quantity=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'ressource' name=ID 'quantity' quantity=INT
		public Group getGroup() { return cGroup; }
		
		//'ressource'
		public Keyword getRessourceKeyword_0() { return cRessourceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'quantity'
		public Keyword getQuantityKeyword_2() { return cQuantityKeyword_2; }
		
		//quantity=INT
		public Assignment getQuantityAssignment_3() { return cQuantityAssignment_3; }
		
		//INT
		public RuleCall getQuantityINTTerminalRuleCall_3_0() { return cQuantityINTTerminalRuleCall_3_0; }
	}
	public class RessourceUsedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.RessourceUsed");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOccAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOccINTTerminalRuleCall_0_0 = (RuleCall)cOccAssignment_0.eContents().get(0);
		private final Assignment cRessourceUsedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRessourceUsedRessourceCrossReference_1_0 = (CrossReference)cRessourceUsedAssignment_1.eContents().get(0);
		private final RuleCall cRessourceUsedRessourceIDTerminalRuleCall_1_0_1 = (RuleCall)cRessourceUsedRessourceCrossReference_1_0.eContents().get(1);
		
		//RessourceUsed:
		//	occ=INT ressourceUsed=[Ressource];
		@Override public ParserRule getRule() { return rule; }
		
		//occ=INT ressourceUsed=[Ressource]
		public Group getGroup() { return cGroup; }
		
		//occ=INT
		public Assignment getOccAssignment_0() { return cOccAssignment_0; }
		
		//INT
		public RuleCall getOccINTTerminalRuleCall_0_0() { return cOccINTTerminalRuleCall_0_0; }
		
		//ressourceUsed=[Ressource]
		public Assignment getRessourceUsedAssignment_1() { return cRessourceUsedAssignment_1; }
		
		//[Ressource]
		public CrossReference getRessourceUsedRessourceCrossReference_1_0() { return cRessourceUsedRessourceCrossReference_1_0; }
		
		//ID
		public RuleCall getRessourceUsedRessourceIDTerminalRuleCall_1_0_1() { return cRessourceUsedRessourceIDTerminalRuleCall_1_0_1; }
	}
	
	public class WorkSequenceTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.PDL1.WorkSequenceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStart2startEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStart2startS2sKeyword_0_0 = (Keyword)cStart2startEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFinish2startEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFinish2startF2sKeyword_1_0 = (Keyword)cFinish2startEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStart2finishEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStart2finishS2fKeyword_2_0 = (Keyword)cStart2finishEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFinish2finishEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFinish2finishF2fKeyword_3_0 = (Keyword)cFinish2finishEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum WorkSequenceType:
		//	start2start='s2s'
		//	| finish2start='f2s'
		//	| start2finish='s2f'
		//	| finish2finish='f2f';
		public EnumRule getRule() { return rule; }
		
		//start2start='s2s' | finish2start='f2s' | start2finish='s2f' | finish2finish='f2f'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//start2start='s2s'
		public EnumLiteralDeclaration getStart2startEnumLiteralDeclaration_0() { return cStart2startEnumLiteralDeclaration_0; }
		
		//'s2s'
		public Keyword getStart2startS2sKeyword_0_0() { return cStart2startS2sKeyword_0_0; }
		
		//finish2start='f2s'
		public EnumLiteralDeclaration getFinish2startEnumLiteralDeclaration_1() { return cFinish2startEnumLiteralDeclaration_1; }
		
		//'f2s'
		public Keyword getFinish2startF2sKeyword_1_0() { return cFinish2startF2sKeyword_1_0; }
		
		//start2finish='s2f'
		public EnumLiteralDeclaration getStart2finishEnumLiteralDeclaration_2() { return cStart2finishEnumLiteralDeclaration_2; }
		
		//'s2f'
		public Keyword getStart2finishS2fKeyword_2_0() { return cStart2finishS2fKeyword_2_0; }
		
		//finish2finish='f2f'
		public EnumLiteralDeclaration getFinish2finishEnumLiteralDeclaration_3() { return cFinish2finishEnumLiteralDeclaration_3; }
		
		//'f2f'
		public Keyword getFinish2finishF2fKeyword_3_0() { return cFinish2finishF2fKeyword_3_0; }
	}
	
	private final ProcessElements pProcess;
	private final ProcessElementElements pProcessElement;
	private final WorkDefinitionElements pWorkDefinition;
	private final WorkSequenceElements pWorkSequence;
	private final WorkSequenceTypeElements eWorkSequenceType;
	private final GuidanceElements pGuidance;
	private final RessourceElements pRessource;
	private final RessourceUsedElements pRessourceUsed;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PDL1GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProcess = new ProcessElements();
		this.pProcessElement = new ProcessElementElements();
		this.pWorkDefinition = new WorkDefinitionElements();
		this.pWorkSequence = new WorkSequenceElements();
		this.eWorkSequenceType = new WorkSequenceTypeElements();
		this.pGuidance = new GuidanceElements();
		this.pRessource = new RessourceElements();
		this.pRessourceUsed = new RessourceUsedElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.PDL1".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Process:
	//	'process' name=ID '{'
	//	processElements+=ProcessElement*
	//	'}';
	public ProcessElements getProcessAccess() {
		return pProcess;
	}
	
	public ParserRule getProcessRule() {
		return getProcessAccess().getRule();
	}
	
	//ProcessElement:
	//	WorkDefinition | WorkSequence | Guidance | Ressource;
	public ProcessElementElements getProcessElementAccess() {
		return pProcessElement;
	}
	
	public ParserRule getProcessElementRule() {
		return getProcessElementAccess().getRule();
	}
	
	//WorkDefinition:
	//	'wd' name=ID ('uses' ressourcesUsed+=RessourceUsed+)?;
	public WorkDefinitionElements getWorkDefinitionAccess() {
		return pWorkDefinition;
	}
	
	public ParserRule getWorkDefinitionRule() {
		return getWorkDefinitionAccess().getRule();
	}
	
	//WorkSequence:
	//	'ws' linkType=WorkSequenceType
	//	'from' predecessor=[WorkDefinition]
	//	'to' successor=[WorkDefinition];
	public WorkSequenceElements getWorkSequenceAccess() {
		return pWorkSequence;
	}
	
	public ParserRule getWorkSequenceRule() {
		return getWorkSequenceAccess().getRule();
	}
	
	//enum WorkSequenceType:
	//	start2start='s2s'
	//	| finish2start='f2s'
	//	| start2finish='s2f'
	//	| finish2finish='f2f';
	public WorkSequenceTypeElements getWorkSequenceTypeAccess() {
		return eWorkSequenceType;
	}
	
	public EnumRule getWorkSequenceTypeRule() {
		return getWorkSequenceTypeAccess().getRule();
	}
	
	//Guidance:
	//	'note' texte=STRING;
	public GuidanceElements getGuidanceAccess() {
		return pGuidance;
	}
	
	public ParserRule getGuidanceRule() {
		return getGuidanceAccess().getRule();
	}
	
	//Ressource:
	//	'ressource' name=ID 'quantity' quantity=INT;
	public RessourceElements getRessourceAccess() {
		return pRessource;
	}
	
	public ParserRule getRessourceRule() {
		return getRessourceAccess().getRule();
	}
	
	//RessourceUsed:
	//	occ=INT ressourceUsed=[Ressource];
	public RessourceUsedElements getRessourceUsedAccess() {
		return pRessourceUsed;
	}
	
	public ParserRule getRessourceUsedRule() {
		return getRessourceUsedAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
