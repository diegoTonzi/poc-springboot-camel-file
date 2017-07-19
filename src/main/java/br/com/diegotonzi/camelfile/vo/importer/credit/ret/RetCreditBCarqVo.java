package br.com.diegotonzi.camelfile.vo.importer.credit.ret;

import javax.xml.bind.annotation.XmlType;
import br.com.diegotonzi.camelfile.vo.base.BCARQVo;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/26/17 4:48 PM
 */
@XmlType(name = "BCARQ", propOrder = {
        "fileName",
        "emissorControlNumber",
        "originalDestinyControlNumber",
        "emissorIspb",
        "destinyIspb",
        "fileDateHour",
        "inquiryStatus",
        "seqGroup",
        "referenceDate" })
public class RetCreditBCarqVo extends BCARQVo {

    public RetCreditBCarqVo() {

    }
}
