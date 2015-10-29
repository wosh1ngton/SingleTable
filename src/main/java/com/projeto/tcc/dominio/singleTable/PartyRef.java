package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="PYR")
public class PartyRef extends ObjectRef {
    
    //Obrigatório o uso pelo JPA
    public PartyRef() {
    }
    
   //@FullConstructor
    public PartyRef(ObjectID objectId, String type) {
        super.setObjectId(objectId);
        super.setType(type);
    }    
}
