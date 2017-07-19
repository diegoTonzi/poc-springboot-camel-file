package br.com.diegotonzi.camelfile.xmltoobject.vo.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlTransient
public class LiquidationBaseGroupVO extends LiquidationBaseVO {

    private String subParticipantId;
    private String credentiatorBaseCNPJ;
    private String credentiatorCNPJ;
    private String ispbDebtorIF;
    private String ispbCreditorIF;

    @XmlElement(name = "IdentdPartAdmtd", required = true)
    public String getSubParticipantId() {
        return subParticipantId;
    }

    @XmlElement(name = "CNPJBaseCreddr", required = true)
    public String getCredentiatorBaseCNPJ() {
        return credentiatorBaseCNPJ;
    }

    @XmlElement(name = "CNPJCreddr", required = true)
    public String getCredentiatorCNPJ() {
        return credentiatorCNPJ;
    }

    @XmlElement(name = "ISPBIFDevdr", required = true)
    public String getIspbDebtorIF() {
        return ispbDebtorIF;
    }

    @XmlElement(name = "ISPBIFCredr", required = true)
    public String getIspbCreditorIF() {
        return ispbCreditorIF;
    }


    public void setSubParticipantId(String subParticipantId) {
        this.subParticipantId = subParticipantId;
    }

    public void setCredentiatorBaseCNPJ(String credentiatorBaseCNPJ) {
        this.credentiatorBaseCNPJ = credentiatorBaseCNPJ;
    }

    public void setCredentiatorCNPJ(String credentiatorCNPJ) {
        this.credentiatorCNPJ = credentiatorCNPJ;
    }

    public void setIspbDebtorIF(String ispbDebtorIF) {
        this.ispbDebtorIF = ispbDebtorIF;
    }

    public void setIspbCreditorIF(String ispbCreditorIF) {
        this.ispbCreditorIF = ispbCreditorIF;
    }

}
