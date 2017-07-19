package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/26/17 3:30 PM
 */
public enum TransferMethodEnum {

    SILOC(3),
    CHECKING(4),
    STR(5);

    private final int code;

    TransferMethodEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static TransferMethodEnum fromCode(int code) {
        for (TransferMethodEnum methodEnum : values()) {
            if(methodEnum.getCode() == code){
                return methodEnum;
            }
        }
        return null;
    }
}
