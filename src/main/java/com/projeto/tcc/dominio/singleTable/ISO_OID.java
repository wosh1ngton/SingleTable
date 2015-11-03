package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="ISO")
public class ISO_OID extends UID {
    
      
    public ISO_OID() {
    }
    
    //@FullConstructor
    public ISO_OID(String value) {
        super(value);        
    }
     
}
