/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington Rodrigues
 */
@Entity
@DiscriminatorValue(value="A")
public class AccessGroupRef extends ObjectRef {

    public AccessGroupRef() {
    }
    
}