package br.com.diegotonzi.camelfile.vo.base.importer;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.vo.adapter.DateHourAdapter;


/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlType(propOrder = {
        "credentiatorControlNumber",
        "cipControlNumber",
        "liquidationNumber",
        "manutDate"})
public class TransactionAcceptVO {

    private String credentiatorControlNumber;
    private String cipControlNumber;
    private String liquidationNumber;
    private Date manutDate;

    @XmlElement(name = "NumCtrlCreddrPontoVendaActo", required = true)
    public String getCredentiatorControlNumber() {
        return credentiatorControlNumber;
    }

    @XmlElement(name = "NumCtrlCIPPontoVendaActo", required = true)
    public String getCipControlNumber() {
        return cipControlNumber;
    }

    @XmlElement(name = "NULiquid", required = true)
    public String getLiquidationNumber() {
        return liquidationNumber;
    }

    @XmlElement(name = "DtHrManut", required = true)
    @XmlJavaTypeAdapter(DateHourAdapter.class)
    public Date getManutDate() {
        return manutDate;
    }


    public void setCredentiatorControlNumber(String credentiatorControlNumber) {
        this.credentiatorControlNumber = credentiatorControlNumber;
    }

    public void setCipControlNumber(String cipControlNumber) {
        this.cipControlNumber = cipControlNumber;
    }

    public void setLiquidationNumber(String liquidationNumber) {
        this.liquidationNumber = liquidationNumber;
    }

    public void setManutDate(Date manutDate) {
        this.manutDate = manutDate;
    }

}
