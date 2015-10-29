package com.projeto.tcc.dominio.singleTable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington Rodrigues
 */
@Entity
@DiscriminatorValue(value="AGR")
public class AccessGroupRef extends ObjectRef {
    
    //Exigência do JPA, construtor público ou privado.
    public AccessGroupRef() {
    }

    //@FullConstructor
    public AccessGroupRef(ObjectID objectId) {
        super.setObjectId(objectId);
    }  
    
}