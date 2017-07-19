package br.com.diegotonzi.camelfile.xmltoobject.vo.adapter;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.commons.DateUtils;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/21/17 5:43 PM
 */
public class DateHourAdapter extends XmlAdapter<String, Date> {

    @Override
    public String marshal (final Date v) throws Exception {
        return DateUtils.DateEnum.YYYY_HYPHEN_MM_HYPHEN_DD_T_HH_COLON_MM_COLON_SS.format(v);
    }

    @Override
    public Date unmarshal (final String v) throws Exception {
        return DateUtils.DateEnum.YYYY_HYPHEN_MM_HYPHEN_DD_T_HH_COLON_MM_COLON_SS.parseDate(v);
    }
}