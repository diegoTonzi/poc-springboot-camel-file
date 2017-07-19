package br.com.diegotonzi.camelfile.xmltoobject.vo.adapter;


import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.enums.LiquidationTypeEnum;


/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/26/17 5:11 PM
 */
public class LiquidationTypeAdapter extends XmlAdapter<Integer, LiquidationTypeEnum> {
    @Override
    public LiquidationTypeEnum unmarshal(Integer v) throws Exception {
        return LiquidationTypeEnum.fromCode(v);
    }

    @Override
    public Integer marshal(LiquidationTypeEnum v) throws Exception {
        return v.getCode();
    }
}
