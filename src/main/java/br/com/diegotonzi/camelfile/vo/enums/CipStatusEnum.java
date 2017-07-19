package br.com.diegotonzi.camelfile.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/13/17 12:30 PM
 */
public enum CipStatusEnum {

    INITIAL("I"),
    ADVANCED("A"),
    RELEASED("R"),
    CANCELLED("C");

    private String statusCode;

    CipStatusEnum(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public static CipStatusEnum fromStatusCode(String cipStatusValue) {
        return null;
    }
}
