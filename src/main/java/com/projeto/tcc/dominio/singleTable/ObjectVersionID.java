/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="OV")
public class ObjectVersionID extends UIDBasedID{

    public ObjectVersionID() {
    }

    public ObjectVersionID(UID objectID, VersionTreeID versionTreeID, HierObjectID creatingSystemID) {
        this.objectID = objectID;
        this.versionTreeID = versionTreeID;
        this.creatingSystemID = creatingSystemID;
    }
    
    
    @OneToOne
    private UID objectID;
    @OneToOne
    private VersionTreeID versionTreeID;
    @OneToOne
    private HierObjectID creatingSystemID;
    
    public UID objectID() {
		return objectID;
	}
    
    @Override
	public UID root() {
		return objectID();
    }

 }
