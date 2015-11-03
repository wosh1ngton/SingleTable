package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="TERMINOLOGY")
public class TerminologyID extends ObjectID {

    public TerminologyID(String value) {
        super(value);
    }

    public TerminologyID() {
    }

      
    
}
