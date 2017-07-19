package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/26/17 3:27 PM
 */
public enum LiquidationTypeEnum {

    CREDIT_CARD(01),
    CREDIT_CARD_ADJUSTMENT(02),
    ;

    private final Integer code;

    LiquidationTypeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static LiquidationTypeEnum fromCode(Integer v) {

        for (LiquidationTypeEnum liquidation : values()) {
            if(liquidation.getCode().equals(v)){
                return liquidation;
            }
        }
        return null;
    }
}
