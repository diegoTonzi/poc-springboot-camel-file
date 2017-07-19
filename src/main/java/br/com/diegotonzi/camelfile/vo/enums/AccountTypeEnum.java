package br.com.diegotonzi.camelfile.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/26/17 2:28 PM
 */
public enum AccountTypeEnum {

    CHECKING("CC"),
    DEPOSIT("CD"),
    PAYMENT("PG"),
    SAVING("PP"),

    ;

    private String code;

    AccountTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
