package br.com.diegotonzi.camelfile.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/14/17 2:19 PM
 */
public enum PersonTypeEnum {

    PERSONAL("P"),
    ENTERPRISE("E"),

    ;

    private final String code;

    PersonTypeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static PersonTypeEnum fromCode(String code){

        for (PersonTypeEnum personType : values()) {
            if(personType.getCode().equals(code)){
                return personType;
            }
        }
        return null;
    }
}
