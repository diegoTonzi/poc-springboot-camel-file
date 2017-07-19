package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer.LiquidationGroupCredentiatorAcceptVO;

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
		"returnStatus",
		"centralizerAcceptGroups",
		"centralizerRejectGroups" })
public class RetCreditLiquidationGroupAcceptVO
		extends LiquidationGroupCredentiatorAcceptVO<RetCreditCentralizerAcceptGroupVO, RetCreditCentralizerRejectGroupVO> {

	private List<RetCreditCentralizerAcceptGroupVO> centralizerAcceptGroups;
	private List<RetCreditCentralizerRejectGroupVO> centralizerRejectGroups;

	public RetCreditLiquidationGroupAcceptVO() {
		this.centralizerAcceptGroups = new ArrayList<>();
		this.centralizerRejectGroups = new ArrayList<>();
	}

	@Override
	@XmlElement(name = "Grupo_ASLC027RET_CentrlzActo")
	public List<RetCreditCentralizerAcceptGroupVO> getCentralizerAcceptGroups() {
		return centralizerAcceptGroups;
	}

	@Override
	@XmlElement(name = "Grupo_ASLC027RET_CentrlzRecsdo")
	public List<RetCreditCentralizerRejectGroupVO> getCentralizerRejectGroups() {
		return centralizerRejectGroups;
	}

	public void setCentralizerAcceptGroups(List<RetCreditCentralizerAcceptGroupVO> centralizerAcceptGroups) {
		this.centralizerAcceptGroups = centralizerAcceptGroups;
	}

	public void setCentralizerRejectGroups(List<RetCreditCentralizerRejectGroupVO> centralizerRejectGroups) {
		this.centralizerRejectGroups = centralizerRejectGroups;
	}
}
