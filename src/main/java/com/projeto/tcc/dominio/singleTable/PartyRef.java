package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="PARTY")
public class PartyRef extends ObjectRef {
    
    //Obrigatório o uso pelo JPA
    public PartyRef() {
    }

    public PartyRef(ObjectID objectId, String namespace, String type) {
        super(objectId, namespace, type);
    }
    
   //@FullConstructor

    public PartyRef(ObjectID objectId) {
        super(objectId);
    }
       
}
