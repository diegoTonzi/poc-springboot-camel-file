package br.com.diegotonzi.camelfile.xmltoobject.vo.base;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlTransient
public abstract class LiquidationGroupCredentiatorVO<T extends CentralizerBaseVO>
        extends LiquidationBaseGroupVO {

    private Integer credentiatorBranch;
    private Integer credentiatorAccount;
    private String credentiatorName;

    public abstract List<T> getCentralizerGroups();

    public LiquidationGroupCredentiatorVO(){}

    @XmlElement(name = "AgCreddr", required = true)
    public Integer getCredentiatorBranch() {
        return credentiatorBranch;
    }

    @XmlElement(name = "CtCreddr", required = true)
    public Integer getCredentiatorAccount() {
        return credentiatorAccount;
    }

    @XmlElement(name = "NomCreddr", required = true)
    public String getCredentiatorName() {
        return credentiatorName;
    }

    public void setCredentiatorBranch(Integer credentiatorBranch) {
        this.credentiatorBranch = credentiatorBranch;
    }

    public void setCredentiatorAccount(Integer credentiatorAccount) {
        this.credentiatorAccount = credentiatorAccount;
    }

    public void setCredentiatorName(String credentiatorName) {
        this.credentiatorName = credentiatorName;
    }

    public void addGroup(T groupVO) {
        getCentralizerGroups().add(groupVO);
    }
}
