package br.com.diegotonzi.camelfile.xmltoobject.vo.base.importer;

import br.com.diegotonzi.camelfile.xmltoobject.vo.base.LiquidationBaseVO;


/**
 * Created by maz_dcosta on 11/07/17.
 */
public abstract class BatchReturnVo {

	public abstract <T extends LiquidationBaseVO> T  getLiquidationAcceptedGroups();

	public abstract <R extends LiquidationBaseVO> R getLiquidationRejectedGroups();

}
