package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.xmltoobject.vo.base.LiquidationGroupCredentiatorVO;


/**
 * Created by maz_dcosta on 12/07/17.
 */
@XmlType(propOrder = {
		"mainParticipantId",
		"subParticipantId",
		"credentiatorBaseCNPJ",
		"credentiatorCNPJ",
		"ispbDebtorIF",
		"ispbCreditorIF",
		"credentiatorBranch",
		"credentiatorAccount",
		"credentiatorName",
		"centralizerGroups" })
public class RetCreditLiquidationGroupRejectVO
		extends LiquidationGroupCredentiatorVO<RetCreditCentralizerRejectGroupVO> {

	private List<RetCreditCentralizerRejectGroupVO> centralizerGroups;

	public RetCreditLiquidationGroupRejectVO() {
		this.centralizerGroups = new ArrayList<>();
	}

	@Override
	@XmlElement(name = "Grupo_ASLC027RET_CentrlzRecsdo", required = true)
	public List<RetCreditCentralizerRejectGroupVO> getCentralizerGroups() {
		return centralizerGroups;
	}

	public void setCentralizerGroups(List<RetCreditCentralizerRejectGroupVO> centralizerGroups) {
		this.centralizerGroups = centralizerGroups;
	}
}
