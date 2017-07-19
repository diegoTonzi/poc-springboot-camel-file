package br.com.diegotonzi.camelfile.xmltoobject.vo.adapter;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.commons.DateUtils;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/20/17 2:11 PM
 */
public class DateAdapter extends XmlAdapter<String, Date> {

    @Override
    public String marshal (final Date v) throws Exception {
        return DateUtils.DateEnum.YYYY_DASH_MM_DASH_DD.format(v);
    }

    @Override
    public Date unmarshal (final String v) throws Exception {
        return DateUtils.DateEnum.YYYY_DASH_MM_DASH_DD.parseDate(v);
    }
}
