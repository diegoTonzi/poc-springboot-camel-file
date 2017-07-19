/*
 * Copyright (c) - UOL Inc, Todos os direitos reservados
 *
 * Este arquivo e uma propriedade confidencial do Universo Online Inc. Nenhuma
 * parte do mesmo pode ser copiada, reproduzida, impressa ou transmitida por
 * qualquer meio sem autorizacao expressa e por escrito de um representante
 * legal do Universo Online Inc.
 *
 * All rights reserved
 *
 * This file is a confidential property of Universo Online Inc. No part of this
 * file may be reproduced or copied in any form or by any means without written
 * permisson from an authorized person from Universo Online Inc.
 */
package br.com.diegotonzi.camelfile.vo.commons;

//import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * StringUtils.java<br>
 * 
 * @author <a href="mailto:tqi_lroos@uolinc.com">Luiz Gustavo Roos</a>
 * @since 04/03/2010 22:09:06
 */
public class Strings {

    private static List<String> fromCharSeparetedToList(String charSeparetedString, String charachter) {
        final List<String> stringList = new ArrayList<String>();
        if (charSeparetedString != null && charSeparetedString.trim().length() > 0) {
            for (String hostname : charSeparetedString.trim().split(charachter)) {
                stringList.add(hostname.trim());
            }
        }
        return stringList;
    }

    /**
     * Dada uma String com diversos valores separados por virgula, converte em uma lista<br/>
     * onde cada um desses valores � um elemento da lista
     * 
     * @param commaSeparetedString
     * @return Lista de Strings
     */
    public static List<String> fromCommaSeparetedToStringList(final String commaSeparetedString) {
        return fromCharSeparetedToList(commaSeparetedString, ",");
    }

}
