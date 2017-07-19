package br.com.diegotonzi.camelfile.vo.base;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.vo.adapter.PersonTypeAdapter;
import br.com.diegotonzi.camelfile.vo.enums.PersonTypeEnum;


/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/13/17 6:31 PM
 */
@XmlTransient
public abstract class CentralizerBaseVO<T extends TransactionVO> {

    private String controlNumber;
    private PersonTypeEnum personType;
    private String cpfCnpj;
    private Long code;
    private String accountType;
    private String paymentAccount;

    public abstract List<T> getSellPoints();

    @XmlElement(name = "NumCtrlCreddrCentrlz", required = true)
    public String getControlNumber() {
        return controlNumber;
    }

    @XmlElement(name = "TpPessoaCentrlz", required = true)
    @XmlJavaTypeAdapter(PersonTypeAdapter.class)
    public PersonTypeEnum getPersonType() {
        return personType;
    }

    @XmlElement(name = "CNPJ_CPFCentrlz", required = true)
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    @XmlElement(name = "CodCentrlz", required = true)
    public Long getCode() {
        return code;
    }

    @XmlElement(name = "TpCt")
    public String getAccountType() {
        return accountType;
    }

    @XmlElement(name = "CtPgtoCentrlz")
    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setControlNumber(String controlNumber) {
        this.controlNumber = controlNumber;
    }

    public void setPersonType(PersonTypeEnum personType) {
        this.personType = personType;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public void addTransaction(T transactionVO){
        getSellPoints().add(transactionVO);
    }
}
