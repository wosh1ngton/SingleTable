package com.projeto.tcc.dominio.singleTable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="NET")
public class InternetID extends UID {

    public InternetID() {
    }
    
    //@FullConstructor
    public InternetID(String value) {
        super(value);
        
    }
}