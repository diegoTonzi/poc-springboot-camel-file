package br.com.diegotonzi.camelfile.xmltoobject.vo.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by maz_lcarvalho on 6/1/16.
 */
public final class DateUtils {

    private static final SimpleDateFormat sdfFormatddMMyyyyhhmi = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    //private static final Logger log = LoggerFactory.getLogger(DateUtils.class.getName());

    /**
     * Gets the date as string dd/MM/yyyy HH:mm.
     *
     * @param date
     *            the date
     * @return the date as string
     */
    public static String getDateAsStringddMMyyyyhhmi(final Date date) {
        if (date != null) {
            try {
                synchronized (sdfFormatddMMyyyyhhmi) {
                    return sdfFormatddMMyyyyhhmi.format(date);
                }
            } catch (final Exception e) {
                //log.error("e=Error to convert Date to (BR4Format),date=" + date, e);
            }
        }
        return null;
    }

    public static Calendar adjustTimeToMinimum(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getMinimum(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.getMinimum(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.getMinimum(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, calendar.getMinimum(Calendar.MILLISECOND));
        return calendar;
    }

    /**
     * @author elvis
     * @version $Revision: $<br/>
     *          $Id: $
     * @since 6/13/17 5:22 PM
     */
    public static enum DateEnum {

        YYYYMMDD("yyyyMMdd"),
        YYYY_DASH_MM_DASH_DD("yyyy-MM-dd"),
        YYYY_DASH_MM_DASH_DD_SPACE_HH_COLON_MM_COLON_SS("yyyy-MM-dd HH:mm:ss"),
        YYYY_HYPHEN_MM_HYPHEN_DD_T_HH_COLON_MM_COLON_SS("yyyy-MM-dd'T'HH:mm:ss")

        ;

        private String pattern;

        DateEnum(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }

        public Date parseDate(String dateStr){
            return doParse(dateStr);
        }

        public Calendar parseCalendar(String dateStr){
            final Date date = doParse(dateStr);
            if(date == null ){
                return null;
            }
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        }

        public String format(Date dateStr){
            return doFormat(dateStr);
        }

        public String format(Calendar calendar){
            if(calendar == null){
                return null;
            }
            return doFormat(calendar.getTime());
        }

        private Date doParse(String dateStr) {
            try {
//                if(StringUtils.isBlank(dateStr)){
//                    return null;
//                }
                return new SimpleDateFormat(getPattern()).parse(dateStr);
            } catch (ParseException e) {
                return null;
            }
        }

        private String doFormat(Object time) {
            if(time == null){
                return null;
            }
            return new SimpleDateFormat(getPattern()).format(time);
        }
    }
}
