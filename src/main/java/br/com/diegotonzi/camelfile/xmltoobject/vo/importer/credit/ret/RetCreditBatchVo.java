package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer.BatchReturnVo;

/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlType(propOrder = {
		"liquidationAcceptedGroups",
		"liquidationRejectedGroups"
})
public class RetCreditBatchVo extends BatchReturnVo {

	private RetCreditLiquidationGroupAcceptVO liquidationAcceptedGroups;
	private RetCreditLiquidationGroupRejectVO liquidationRejectedGroups;

	public RetCreditBatchVo() {
		this.liquidationAcceptedGroups = new RetCreditLiquidationGroupAcceptVO();
		this.liquidationRejectedGroups = new RetCreditLiquidationGroupRejectVO();
	}

	@XmlElement(name = "Grupo_ASLC027RET_LiquidTranscCredActo")
	public RetCreditLiquidationGroupAcceptVO getLiquidationAcceptedGroups() {
		return liquidationAcceptedGroups;
	}

	public void setLiquidationAcceptedGroups(RetCreditLiquidationGroupAcceptVO liquidationAcceptedGroups) {
		this.liquidationAcceptedGroups = liquidationAcceptedGroups;
	}

	@XmlElement(name = "Grupo_ASLC027RET_LiquidTranscCredRecsdo")
	public RetCreditLiquidationGroupRejectVO getLiquidationRejectedGroups() {
		return liquidationRejectedGroups;
	}

	public void setLiquidationRejectedGroups(RetCreditLiquidationGroupRejectVO liquidationRejectedGroups) {
		this.liquidationRejectedGroups = liquidationRejectedGroups;
	}

}
