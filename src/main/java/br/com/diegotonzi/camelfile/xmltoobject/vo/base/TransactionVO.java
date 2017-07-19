package br.com.diegotonzi.camelfile.xmltoobject.vo.base;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.DateAdapter;
import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.PersonTypeAdapter;
import br.com.diegotonzi.camelfile.xmltoobject.vo.adapter.TransferMethodAdapter;
import br.com.diegotonzi.camelfile.xmltoobject.vo.enums.LiquidationTypeEnum;
import br.com.diegotonzi.camelfile.xmltoobject.vo.enums.PersonTypeEnum;
import br.com.diegotonzi.camelfile.xmltoobject.vo.enums.TransferMethodEnum;


/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/13/17 6:35 PM
 */
@XmlTransient
public abstract class TransactionVO {

    private String credentiatorControlNumber;
    private String liquidationIsbpIf;
    private Long userId;
    private String userName;
    private PersonTypeEnum personType;
    private String cpfCnpj;
    private String paymentArrangementCode;
    protected LiquidationTypeEnum liquidationType;
    private TransferMethodEnum transferMethod;
    private Integer currencyCode;
    private Date paymentDate;
    private BigDecimal transactionValue;

    @XmlElement
    public abstract LiquidationTypeEnum getLiquidationType();

    @XmlElement(name = "NumCtrlCreddrPontoVenda", required = true)
    public String getCredentiatorControlNumber() {
        return credentiatorControlNumber;
    }

    @XmlElement(name = "ISPBIFLiquidPontoVenda", required = true)
    public String getLiquidationIsbpIf() {
        return liquidationIsbpIf;
    }

    @XmlElement(name = "CodPontoVenda", required = true)
    public Long getUserId() {
        return userId;
    }

    @XmlElement(name = "NomePontoVenda", required = true)
    public String getUserName() {
        return userName;
    }

    @XmlElement(name = "TpPessoaPontoVenda", required = true)
    @XmlJavaTypeAdapter(PersonTypeAdapter.class)
    public PersonTypeEnum getPersonType() {
        return personType;
    }

    @XmlElement(name = "CNPJ_CPFPontoVenda", required = true)
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    @XmlElement(name = "CodInstitdrArrajPgto", required = true)
    public String getPaymentArrangementCode() {
        return paymentArrangementCode;
    }

    @XmlElement(name = "IndrFormaTransf", required = true)
    @XmlJavaTypeAdapter(TransferMethodAdapter.class)
    public TransferMethodEnum getTransferMethod() { return transferMethod; }

    @XmlElement(name = "CodMoeda", required = true)
    public Integer getCurrencyCode() {
        return currencyCode;
    }

    @XmlElement(name = "DtPgto", required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getPaymentDate() {
        return paymentDate;
    }

    @XmlElement(name = "VlrPgto", required = true)
    public BigDecimal getTransactionValue() {
        return transactionValue;
    }

    public void setCredentiatorControlNumber(String credentiatorControlNumber) {
        this.credentiatorControlNumber = credentiatorControlNumber;
    }

    public void setLiquidationIsbpIf(String liquidationIsbpIf) {
        this.liquidationIsbpIf = liquidationIsbpIf;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPersonType(PersonTypeEnum personType) {
        this.personType = personType;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setPaymentArrangementCode(String paymentArrangementCode) {
        this.paymentArrangementCode = paymentArrangementCode;
    }

    public void setTransferMethod(final TransferMethodEnum transferMethod) {
        this.transferMethod = transferMethod;
    }

    public void setCurrencyCode(Integer currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setTransactionValue(BigDecimal transactionValue) {
        this.transactionValue = transactionValue;
    }
}
