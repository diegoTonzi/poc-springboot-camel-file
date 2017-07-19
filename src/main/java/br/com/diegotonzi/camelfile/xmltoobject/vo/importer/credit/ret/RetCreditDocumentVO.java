
package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer.DocumentReturnVO;

/**
 * Created by maz_dcosta on 12/07/17.
 */
@XmlRootElement(name = "ASLCDOC")
@XmlType(propOrder = {
        "bcarq",
        "batchGroup" })
public class RetCreditDocumentVO extends DocumentReturnVO<RetCreditBatchGroupVo, RetCreditBCarqVo> {

    private RetCreditBCarqVo bcarq;
    private RetCreditBatchGroupVo batchGroup;

    public RetCreditDocumentVO(){
        this.batchGroup = new RetCreditBatchGroupVo();
        this.bcarq = new RetCreditBCarqVo();
    }

    @Override
    @XmlElement(name = "BCARQ")
    public RetCreditBCarqVo getBcarq() {
        return this.bcarq;
    }

    @Override
    @XmlElement(name = "SISARQ")
    public RetCreditBatchGroupVo getBatchGroup() {
        return this.batchGroup;
    }

    public void setBatchGroup(RetCreditBatchGroupVo batchGroup) {
        this.batchGroup = batchGroup;
    }

    public void setBcarq(RetCreditBCarqVo bcarq) {
        this.bcarq = bcarq;
    }
}
