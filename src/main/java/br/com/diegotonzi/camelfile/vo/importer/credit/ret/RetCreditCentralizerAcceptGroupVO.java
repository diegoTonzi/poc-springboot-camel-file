package br.com.diegotonzi.camelfile.vo.importer.credit.ret;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.vo.base.importer.TransactionAcceptVO;
import br.com.diegotonzi.camelfile.vo.base.importer.CentralizerAcceptVO;


/**
 * Created by maz_dcosta on 12/07/17.
 */
@XmlType(propOrder = {
        "controlNumber",
        "controlCipNumber",
        "sellPoints" })
public class RetCreditCentralizerAcceptGroupVO extends CentralizerAcceptVO<TransactionAcceptVO> {

    private List<TransactionAcceptVO> sellPoints;

    public RetCreditCentralizerAcceptGroupVO() {
        this.sellPoints = new ArrayList<>();
    }

    @Override
    @XmlElement(name = "Grupo_ASLC027RET_PontoVendaActo", required = true)
    public List<TransactionAcceptVO> getSellPoints() {
        return this.sellPoints;
    }

    public void setSellPoints(List<TransactionAcceptVO> sellPoints) {
        this.sellPoints = sellPoints;
    }
}
