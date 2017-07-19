package br.com.diegotonzi.camelfile.vo.importer.credit.ret;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.vo.base.CentralizerBaseVO;


/**
 * Created by maz_dcosta on 12/07/17.
 */
@XmlType(propOrder = {
        "controlNumber",
        "personType",
        "cpfCnpj",
        "code",
        "accountType",
        "paymentAccount",
        "sellPoints" })
public class RetCreditCentralizerRejectGroupVO extends CentralizerBaseVO<RetCreditTransactionVo> {

    private List<RetCreditTransactionVo> sellPoints;

    public RetCreditCentralizerRejectGroupVO() {
        this.sellPoints = new ArrayList<>();
    }

    @Override
    @XmlElement(name = "Grupo_ASLC027RET_PontoVendaRecsdo", required = true)
    public List<RetCreditTransactionVo> getSellPoints() {
        return this.sellPoints;
    }

    public void setSellPoints(List<RetCreditTransactionVo> sellPoints) {
        this.sellPoints = sellPoints;
    }
}
