package com.projeto.tcc.dominio.singleTable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="IID")
public class InternetID extends UID {

    public InternetID() {
    }
    
    //@FullConstructor
    public InternetID(String value) {
        super.setValue(value);
    }
}