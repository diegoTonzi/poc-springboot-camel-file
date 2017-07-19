package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/13/17 12:21 PM
 */
public enum BatchTypeEnum {

    ANTECIPATION("A", BatchTypeNames.ANTECIPATION),
    CREDIT("C", BatchTypeNames.CREDIT),
    DEBIT("D", BatchTypeNames.DEBIT)

    ;

    private String code;
    private String name;

    BatchTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public interface BatchTypeNames {
        String ANTECIPATION = "ANTECIPATION";
        String CREDIT = "CREDIT";
        String DEBIT = "DEBIT";
    }

    public static BatchTypeEnum fromCode(final String code){
        for (final BatchTypeEnum batchType : values()) {
            if(batchType.getCode().equals(code)){
                return batchType;
            }
        }
        return null;
    }
}
