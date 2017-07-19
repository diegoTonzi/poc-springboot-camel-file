package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Created by maz_dcosta on 31/05/17.
 */
public enum PaymentMethodEnum {

    CREDITCARD("C"), DEBITCARD("D"), OTHERS("O");

    private String code;

    PaymentMethodEnum(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return this.code;
    }

    @JsonCreator
    public static PaymentMethodEnum fromCode(String code) {
        for (final PaymentMethodEnum c : values()) {
            if (c.getCode().equals(code)) {
                return c;
            }
        }
        return null;
    }
}
