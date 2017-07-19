package br.com.diegotonzi.camelfile.vo.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlTransient
public class LiquidationBaseVO {

    private String mainParticipantId;

    @XmlElement(name = "IdentdPartPrincipal", required = true)
    public String getMainParticipantId() {
        return mainParticipantId;
    }

    public void setMainParticipantId(String mainParticipantId) {
        this.mainParticipantId = mainParticipantId;
    }

}
