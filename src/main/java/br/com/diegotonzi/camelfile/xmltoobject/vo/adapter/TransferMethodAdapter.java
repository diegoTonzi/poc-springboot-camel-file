package br.com.diegotonzi.camelfile.xmltoobject.vo.adapter;


import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.enums.TransferMethodEnum;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/22/17 4:13 PM
 */
public class TransferMethodAdapter extends XmlAdapter<Integer, TransferMethodEnum> {

    @Override
    public TransferMethodEnum unmarshal(Integer code) throws Exception {
        return TransferMethodEnum.fromCode(code);
    }

    @Override
    public Integer marshal(TransferMethodEnum tm) throws Exception {
        return tm.getCode();
    }
}
