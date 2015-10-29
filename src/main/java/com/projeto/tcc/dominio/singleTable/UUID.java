package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="UUD")
public class UUID extends UID {

    public UUID() {
    }
    
    //@FullConstructor
    public UUID(String value) {
        super.setValue(value);        
    }    
      
}