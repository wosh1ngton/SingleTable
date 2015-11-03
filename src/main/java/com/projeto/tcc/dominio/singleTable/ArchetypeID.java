package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="ARCHETYPE")
public class ArchetypeID extends ObjectID {

    public ArchetypeID(String value) {
        super(value);
    }

       
    public ArchetypeID() {
    }
     
}