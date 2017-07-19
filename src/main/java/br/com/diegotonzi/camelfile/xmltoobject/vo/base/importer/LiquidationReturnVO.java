package br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.DateHourAdapter;
import br.com.diegotonzi.camelfile.xmltoobject.vo.base.LiquidationBaseVO;


/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlTransient
public class LiquidationReturnVO extends LiquidationBaseVO {

    // classe que representa o conteudo do arquivo x-PRO

    private String admParticipantId;
    private String liquidationNumber;
    private String occurrenceCode;
    private Date manutDate;

    @XmlElement(name = "IdentdPartAdmtd", required = true)
    public String getSubParticipantId() {
        return admParticipantId;
    }

    @XmlElement(name = "NULiquid", required = true)
    public String getLiquidationNumber() {
        return liquidationNumber;
    }

    @XmlElement(name = "CodOcorc", required = true)
    public String getOccurrenceCode() {
        return occurrenceCode;
    }

    @XmlElement(name = "DtHrManut", required = true)
    @XmlJavaTypeAdapter(DateHourAdapter.class)
    public Date getManutDate() {
        return manutDate;
    }


    public void setAdmParticipantId(String admParticipantId) {
        this.admParticipantId = admParticipantId;
    }

    public void setLiquidationNumber(String liquidationNumber) {
        this.liquidationNumber = liquidationNumber;
    }

    public void setOccurrenceCode(String occurrenceCode) {
        this.occurrenceCode = occurrenceCode;
    }

    public void setManutDate(Date manutDate) {
        this.manutDate = manutDate;
    }

}
