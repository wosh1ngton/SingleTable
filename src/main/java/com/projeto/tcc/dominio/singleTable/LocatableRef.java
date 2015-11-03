package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="LOCATABLE")
public class LocatableRef extends ObjectRef {
        
    public LocatableRef() {
    }

    public LocatableRef(UIDBasedID based_id, String path) {
        this.based_id = based_id;
        this.path = path;
    }

       
    //@FullConstructor
    public LocatableRef(ObjectVersionID id, String namespace, String type, String path) {
        super(id, namespace, type);
        this.path=path;
        this.based_id=id;
    }

    @OneToOne
    private UIDBasedID based_id;
  
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
     public UIDBasedID getBased_id() {
        return based_id;
    }

    public void setBased_id(UIDBasedID based_id) {
        this.based_id = based_id;
    }
}
