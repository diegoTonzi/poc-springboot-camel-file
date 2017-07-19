package br.com.diegotonzi.camelfile.vo.base.importer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.diegotonzi.camelfile.vo.base.BCARQBaseVo;
import br.com.diegotonzi.camelfile.vo.base.BCARQVo;


/**
 * Created by maz_dcosta on 12/07/17.
 */
@XmlRootElement(name = "ASLCDOC")
@XmlType(propOrder = { "bcarq" })
public class DocumentErrorReturnVO<T extends BCARQBaseVo> {

    private BCARQBaseVo bCarq;

    public DocumentErrorReturnVO(){
        bCarq = new BCARQVo();
    }

    @XmlElement(name = "BCARQ")
    public BCARQBaseVo getBcarq() {
        return this.bCarq;
    }

}
