package br.com.diegotonzi.camelfile.xmltoobject.vo.base;


/**
 * Created by maz_dcosta on 11/07/17.
 */
public abstract class Batch {

    public abstract <T extends LiquidationBaseVO> T getLiquidationGroup();

}
