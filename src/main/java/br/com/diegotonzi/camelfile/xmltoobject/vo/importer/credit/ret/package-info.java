@XmlSchema(
		namespace = "http://www.cip-bancos.org.br/ARQ/ASLC027.xsd",
		xmlns = {
	        @XmlNs(prefix = "slc", namespaceURI = "http://www.cip-bancos.org.br/ARQ/ASLC027.xsd")
		},
		elementFormDefault = XmlNsForm.QUALIFIED
)
/**
 * Classe para definir o namespace geral do pacote. Namespace padr�o n�o funciona nessa implementa��o da JAXB
 *
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/21/17 11:19 AM
 */
//NAMESPACE: remover essa classe se for usar o xmlns padr�o de CreditASLDOCVO
package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;