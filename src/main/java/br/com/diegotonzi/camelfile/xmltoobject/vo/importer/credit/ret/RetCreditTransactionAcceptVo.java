package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer.TransactionAcceptVO;


/**
 * @author maz_dcosta
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 14/07/17
 */
@XmlType(propOrder = {
		"credentiatorControlNumber",
		"cipControlNumber",
		"liquidationNumber",
		"manutDate"
})
public class RetCreditTransactionAcceptVo extends TransactionAcceptVO {

}
