package br.com.diegotonzi.camelfile.xmltoobject.vo.base;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.DateAdapter;
import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.DateHourAdapter;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/21/17 11:10 AM
 */
@XmlTransient
public class BCARQVo extends BCARQBaseVo {

    private Integer emissorControlNumber;
    private Integer originalDestinyControlNumber;
    private String emissorIspb;
    private String destinyIspb;
    private Date fileDateHour;
    private Integer inquiryStatus;
    private GrupoSeqVO seqGroup;
    private Date referenceDate;

    @XmlElement(name = "NumCtrlEmis", required = true)
    public Integer getEmissorControlNumber() {
        return emissorControlNumber;
    }

    @XmlElement(name = "NumCtrlDestOr")
    public Integer getOriginalDestinyControlNumber() {
        return originalDestinyControlNumber;
    }

    @XmlElement(name = "ISPBEmissor", required = true)
    public String getEmissorIspb() {
        return emissorIspb;
    }

    @XmlElement(name = "ISPBDestinatario", required = true)
    public String getDestinyIspb() {
        return destinyIspb;
    }

    @XmlElement(name = "DtHrArq", required = true)
    @XmlJavaTypeAdapter(DateHourAdapter.class)
    public Date getFileDateHour() {
        return fileDateHour;
    }

    @XmlElement(name = "SitCons")
    public Integer getInquiryStatus() {
        return inquiryStatus;
    }

    @XmlElement(name = "Grupo_Seq")
    public GrupoSeqVO getSeqGroup() {
        return seqGroup;
    }

    @XmlElement(name = "DtRef", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getReferenceDate() {
        return referenceDate;
    }

    public void setEmissorControlNumber(Integer emissorControlNumber) {
        this.emissorControlNumber = emissorControlNumber;
    }

    public void setOriginalDestinyControlNumber(Integer originalDestinyControlNumber) {
        this.originalDestinyControlNumber = originalDestinyControlNumber;
    }

    public void setEmissorIspb(String emissorIspb) {
        this.emissorIspb = emissorIspb;
    }

    public void setDestinyIspb(String destinyIspb) {
        this.destinyIspb = destinyIspb;
    }

    public void setFileDateHour(Date fileDateHour) {
        this.fileDateHour = fileDateHour;
    }

    public void setInquiryStatus(Integer inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    public void setSeqGroup(GrupoSeqVO seqGroup) {
        this.seqGroup = seqGroup;
    }

    public void setReferenceDate(Date referenceDate) {
        this.referenceDate = referenceDate;
    }
}
