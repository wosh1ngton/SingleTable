package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="TYD")
public class TerminologyID extends ObjectID {

    public TerminologyID(String name, String version, String value) {
        super(value); //chama o construtor da classe ancestral.
        this.name = name;
        this.version = version;
    }

    public TerminologyID() {
       
    }
       
     
    private String name;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    
}
