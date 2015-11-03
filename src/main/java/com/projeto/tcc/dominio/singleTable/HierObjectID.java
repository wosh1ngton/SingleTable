package com.projeto.tcc.dominio.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="HIER")
public class HierObjectID extends UIDBasedID {

    public HierObjectID(String value) {
        super(value);
    }

    public HierObjectID() {
    }

    
    
 
    
}
