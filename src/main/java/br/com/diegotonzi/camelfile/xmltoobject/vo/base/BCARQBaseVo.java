package br.com.diegotonzi.camelfile.xmltoobject.vo.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/21/17 11:10 AM
 */
@XmlTransient
public class BCARQBaseVo {

    private String fileName;

    @XmlElement(name = "NomArq", required = true)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
