package br.com.diegotonzi.camelfile.vo.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.diegotonzi.camelfile.vo.enums.PersonTypeEnum;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/23/17 5:49 PM
 */
public class PersonTypeAdapter extends XmlAdapter<String, PersonTypeEnum>  {

    @Override
    public PersonTypeEnum unmarshal(String v) throws Exception {
        return PersonTypeEnum.fromCode(v);
    }

    @Override
    public String marshal(PersonTypeEnum v) throws Exception {
        return v.getCode();
    }
}