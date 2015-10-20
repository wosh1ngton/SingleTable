/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.dominio.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="Object_Ref")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ObjectRef_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=1)
public class ObjectRef {
    
    @Id
    @OneToOne
    private ObjectID id;
    @Column
    private String namespace;
    @Column
    private String type;
    
    ObjectRef(){};

    public ObjectID getId() {
        return id;
    }

    public void setId(ObjectID id) {
        this.id = id;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
       
    
}
