package br.com.diegotonzi.camelfile.vo.base.importer;

import br.com.diegotonzi.camelfile.vo.base.BCARQVo;


/**
 * Created by maz_dcosta on 12/07/17.
 */
public abstract class DocumentReturnVO<T extends BatchGroupReturnVo, V extends BCARQVo> {

    public abstract V getBcarq();

    public abstract T getBatchGroup();

}
