package br.com.diegotonzi.camelfile.xmltoobject.vo.enums;

/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 10/14/16 5:10 PM
 */
public enum EmailsEnum {

    SCRUM_ZURIQUE("l-scrum-zurique@uolinc.com")
    ;

    private String email;

    EmailsEnum(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}

