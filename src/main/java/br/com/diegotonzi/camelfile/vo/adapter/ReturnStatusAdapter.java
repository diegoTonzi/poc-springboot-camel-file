package br.com.diegotonzi.camelfile.vo.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.diegotonzi.camelfile.vo.enums.ReturnStatusEnum;


/**
 * Created by maz_dcosta on 11/07/17.
 */
public class ReturnStatusAdapter extends XmlAdapter<Integer, ReturnStatusEnum> {

    @Override
    public ReturnStatusEnum unmarshal(Integer v) throws Exception {
        return ReturnStatusEnum.fromStatusCode(v);
    }

    @Override
    public Integer marshal(ReturnStatusEnum v) throws Exception {
        return v.getStatusCode();
    }

}