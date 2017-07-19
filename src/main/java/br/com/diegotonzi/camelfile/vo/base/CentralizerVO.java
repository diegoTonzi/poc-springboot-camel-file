package br.com.diegotonzi.camelfile.vo.base;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * @author elvis
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/13/17 6:31 PM
 */
@XmlTransient
public abstract class CentralizerVO<T extends TransactionVO> extends CentralizerBaseVO {

    private String branch;
    private String account;

    public abstract List<T> getSellPoints();

    @XmlElement(name = "AgCentrlz")
    public String getBranch() {
        return branch;
    }

    @XmlElement(name = "CtCentrlz")
    public String getAccount() {
        return account;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAccount(String account) {
        this.account = account;
    }

}
