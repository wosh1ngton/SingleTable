/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@DiscriminatorValue(value="L")
public class LocatableRef extends ObjectRef {

    public LocatableRef() {
    }
    
    @OneToOne
    UIDBasedID based_id;
    
     @Column   
     private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
