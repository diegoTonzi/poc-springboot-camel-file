package br.com.diegotonzi.camelfile.vo.base.importer;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.com.diegotonzi.camelfile.vo.adapter.ReturnStatusAdapter;
import br.com.diegotonzi.camelfile.vo.base.CentralizerBaseVO;
import br.com.diegotonzi.camelfile.vo.base.LiquidationBaseGroupVO;
import br.com.diegotonzi.camelfile.vo.enums.ReturnStatusEnum;


/**
 * Created by maz_dcosta on 11/07/17.
 */
@XmlTransient
public abstract class LiquidationGroupCredentiatorAcceptVO<T extends CentralizerAcceptVO, R extends CentralizerBaseVO>
        extends LiquidationBaseGroupVO {

    private ReturnStatusEnum returnStatus;

    public abstract List<T> getCentralizerAcceptGroups();

    public abstract List<R> getCentralizerRejectGroups();

    public LiquidationGroupCredentiatorAcceptVO(){}

    @XmlJavaTypeAdapter(ReturnStatusAdapter.class)
    @XmlElement(name = "SitRetReq", required = true)
    public ReturnStatusEnum getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(ReturnStatusEnum returnStatus) {
        this.returnStatus = returnStatus;
    }

    public void addAcceptGroup(T groupVO) {
        getCentralizerAcceptGroups().add(groupVO);
    }

    public void addRejectGroup(R groupVO) {
        getCentralizerRejectGroups().add(groupVO);
    }

}
