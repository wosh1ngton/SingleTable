/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.dominio.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="GI")
public class GenericID extends ObjectID {

    public GenericID(String scheme) {
        this.scheme = scheme;
    }
    @Column   
    private final String scheme;

    public String getScheme() {
        return scheme;
    }
    
    
    
}
