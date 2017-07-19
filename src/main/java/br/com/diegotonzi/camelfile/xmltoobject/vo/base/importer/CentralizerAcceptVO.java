package br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * Created by maz_dcosta on 12/07/17.
 */
@XmlTransient
public abstract class CentralizerAcceptVO<T extends TransactionAcceptVO> {

    private String controlNumber;
    private String controlCipNumber;

    public abstract List<T> getSellPoints();

    @XmlElement(name = "NumCtrlCreddrCentrlzActo", required = true)
    public String getControlNumber() {
        return controlNumber;
    }

    @XmlElement(name = "NumCtrlCIPCentrlzActo", required = true)
    public String getControlCipNumber() {
        return controlCipNumber;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setControlCipNumber(String controlCipNumber) {
        this.controlCipNumber = controlCipNumber;
    }

    public void addTransaction(T transactionVO){
        getSellPoints().add(transactionVO);
    }
}
