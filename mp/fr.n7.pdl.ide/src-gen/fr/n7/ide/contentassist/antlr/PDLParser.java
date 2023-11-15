/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.n7.ide.contentassist.antlr.internal.InternalPDLParser;
import fr.n7.services.PDLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PDLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PDLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PDLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getProcessElementAccess().getAlternatives(), "rule__ProcessElement__Alternatives");
			builder.put(grammarAccess.getWorkSequenceKindStartAccess().getAlternatives(), "rule__WorkSequenceKindStart__Alternatives");
			builder.put(grammarAccess.getWorkSequenceKindFinishAccess().getAlternatives(), "rule__WorkSequenceKindFinish__Alternatives");
			builder.put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup(), "rule__WorkDefinition__Group__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup_3(), "rule__WorkDefinition__Group_3__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup_4(), "rule__WorkDefinition__Group_4__0");
			builder.put(grammarAccess.getDependanceStartAccess().getGroup(), "rule__DependanceStart__Group__0");
			builder.put(grammarAccess.getDependanceFinishAccess().getGroup(), "rule__DependanceFinish__Group__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup(), "rule__Guidance__Group__0");
			builder.put(grammarAccess.getProcessAccess().getNameAssignment_1(), "rule__Process__NameAssignment_1");
			builder.put(grammarAccess.getProcessAccess().getProcessElementsAssignment_3(), "rule__Process__ProcessElementsAssignment_3");
			builder.put(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1(), "rule__WorkDefinition__NameAssignment_1");
			builder.put(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_3_2(), "rule__WorkDefinition__LinksToPredecessorsAssignment_3_2");
			builder.put(grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorsAssignment_4_2(), "rule__WorkDefinition__LinksToPredecessorsAssignment_4_2");
			builder.put(grammarAccess.getDependanceStartAccess().getPredecessorAssignment_0(), "rule__DependanceStart__PredecessorAssignment_0");
			builder.put(grammarAccess.getDependanceStartAccess().getLinkAssignment_1(), "rule__DependanceStart__LinkAssignment_1");
			builder.put(grammarAccess.getWorkSequenceKindStartAccess().getStarted2StartAssignment_0(), "rule__WorkSequenceKindStart__Started2StartAssignment_0");
			builder.put(grammarAccess.getWorkSequenceKindStartAccess().getStarted2FinishAssignment_1(), "rule__WorkSequenceKindStart__Started2FinishAssignment_1");
			builder.put(grammarAccess.getDependanceFinishAccess().getPredecessorAssignment_0(), "rule__DependanceFinish__PredecessorAssignment_0");
			builder.put(grammarAccess.getDependanceFinishAccess().getLinkAssignment_1(), "rule__DependanceFinish__LinkAssignment_1");
			builder.put(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2StartAssignment_0(), "rule__WorkSequenceKindFinish__Finished2StartAssignment_0");
			builder.put(grammarAccess.getWorkSequenceKindFinishAccess().getFinished2FinishAssignment_1(), "rule__WorkSequenceKindFinish__Finished2FinishAssignment_1");
			builder.put(grammarAccess.getGuidanceAccess().getTexteAssignment_1(), "rule__Guidance__TexteAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PDLGrammarAccess grammarAccess;

	@Override
	protected InternalPDLParser createParser() {
		InternalPDLParser result = new InternalPDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
