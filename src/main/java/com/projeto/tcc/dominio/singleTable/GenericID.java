package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="GENERIC")
public class GenericID extends ObjectID {

    public GenericID(String scheme, String value) {
        super(value);
        this.scheme = scheme;
    }

    public GenericID() {
    }

    private String scheme;

    public String getScheme() {
        return scheme;
    }
    
}