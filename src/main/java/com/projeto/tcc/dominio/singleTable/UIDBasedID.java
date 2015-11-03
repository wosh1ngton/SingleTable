package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Woshington
 */

@Entity
@DiscriminatorValue(value="UID_BASEDID") 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "UIDBASED_TYPE",discriminatorType = DiscriminatorType.STRING)
public abstract class UIDBasedID extends ObjectID {
        
    public UIDBasedID(String value) {
        super(value);
    }

    public UIDBasedID() {
    }
    
}
