package br.com.diegotonzi.camelfile.vo.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/21/17 4:08 PM
 */
@XmlType(propOrder = {
        "sequenceNumber",
        "continuityIndicator"
})
public class GrupoSeqVO {

    Long sequenceNumber;

    String continuityIndicator;

    @XmlElement(name = "NumSeq", required = true)
    public Long getSequenceNumber () {
        return sequenceNumber;
    }

    @XmlElement(name = "IndrCont", required = true)
    public String getContinuityIndicator () {
        return continuityIndicator;
    }

    public void setSequenceNumber (final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setContinuityIndicator (final String continuityIndicator) {
        this.continuityIndicator = continuityIndicator;
    }
}
