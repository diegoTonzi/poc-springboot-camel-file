package br.com.diegotonzi.camelfile.vo.base;


/**
 * @author femello
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 6/20/17 6:05 PM
 */
public abstract class DocumentVO<T extends BatchGroup, V extends BCARQVo> {

    public abstract V getBcarq();

    public abstract T getBatchGroup();

}
