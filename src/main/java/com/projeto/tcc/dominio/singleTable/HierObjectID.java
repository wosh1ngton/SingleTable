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
@DiscriminatorValue(value="HO")
public class HierObjectID extends UIDBasedID {

    public HierObjectID() {
    }

    public HierObjectID(UID root, String extension) {
        this.root = root;
        this.extension = extension;
    }
    
    @OneToOne
    private UID root;   // mandatory
    private String extension;
    
    public UID objectID() {
		return root;
	}
    
    @Override
	public UID root() {
		return objectID();
    }
 
    
}
