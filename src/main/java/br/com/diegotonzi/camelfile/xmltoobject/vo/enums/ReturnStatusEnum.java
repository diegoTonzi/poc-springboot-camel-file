package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

/**
 * Created by maz_dcosta on 12/07/17.
 */
public enum ReturnStatusEnum {

    ACCEPT(1),
    REFUSED(2),
    PARTIALLY_ACCEPT(3);

    private Integer statusCode;

    ReturnStatusEnum(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public static ReturnStatusEnum fromStatusCode(Integer statusValue) {
        for (ReturnStatusEnum status : values()) {
            if(status.getStatusCode().equals(statusValue)){
                return status;
            }
        }
        return null;
    }
}
