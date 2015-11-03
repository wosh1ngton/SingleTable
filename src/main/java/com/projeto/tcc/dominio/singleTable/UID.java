package com.projeto.tcc.dominio.singleTable;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Woshington 
 * Single-Table Strategy
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="UID_TYPE", discriminatorType=DiscriminatorType.STRING, length=20)
public abstract class UID implements Serializable {

    public UID() {
    }
    
    protected UID(String value) {
       this.value=value;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
        
}