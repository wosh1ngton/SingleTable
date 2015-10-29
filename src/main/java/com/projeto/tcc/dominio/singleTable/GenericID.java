package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="GRI")
public class GenericID extends ObjectID {

    public GenericID(String scheme, String value) {
        super(value);
        this.scheme = scheme;
    }

    private final String scheme;

    public String getScheme() {
        return scheme;
    }
    
}