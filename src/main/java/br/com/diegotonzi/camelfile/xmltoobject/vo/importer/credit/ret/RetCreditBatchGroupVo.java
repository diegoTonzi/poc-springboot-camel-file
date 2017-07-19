package br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer.BatchGroupReturnVo;

/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlType(propOrder = {
        "batch" })
public class RetCreditBatchGroupVo extends BatchGroupReturnVo {

    private RetCreditBatchVo batch;

    public RetCreditBatchGroupVo() {
        batch = new RetCreditBatchVo();
    }

    @Override
    @XmlElement(name = "ASLC027RET", required = true)
    public RetCreditBatchVo getBatch () {
        return batch;
    }

    public void setBatch(RetCreditBatchVo batch) {
        this.batch = batch;
    }
}
