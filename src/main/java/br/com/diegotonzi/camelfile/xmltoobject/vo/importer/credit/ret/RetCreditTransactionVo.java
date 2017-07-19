package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.LiquidationTypeAdapter;
import br.com.diegotonzi.camelfile.xmltoobject.vo.base.TransactionVO;
import br.com.diegotonzi.camelfile.xmltoobject.vo.enums.LiquidationTypeEnum;


/**
 * @author maz_dcosta
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 14/07/17
 */
@XmlType(propOrder = {
		"credentiatorControlNumber",
		"liquidationIsbpIf",
		"userId",
		"userName",
		"personType",
		"cpfCnpj",
		"paymentArrangementCode",
		"liquidationType",
		"transferMethod",
		"currencyCode",
		"paymentDate",
		"transactionValue"})
public class RetCreditTransactionVo extends TransactionVO {

	public RetCreditTransactionVo(){
		this.liquidationType = LiquidationTypeEnum.CREDIT_CARD;
	}

	@Override
	@XmlElement(name = "TpProdLiquidCred")
	@XmlJavaTypeAdapter(LiquidationTypeAdapter.class)
	public LiquidationTypeEnum getLiquidationType() {
		return this.liquidationType;
	}



}
