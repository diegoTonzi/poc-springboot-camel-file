package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/26/17 3:35 PM
 */
public enum CurrencyTypeEnum {

    REAL(790),

    ;

    private int code;

    CurrencyTypeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
