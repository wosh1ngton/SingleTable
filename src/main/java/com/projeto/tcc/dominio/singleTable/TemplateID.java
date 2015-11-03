package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="TEMPLATE")
public class TemplateID extends ObjectID {

    public TemplateID() {
    }
    
    //@FullConstructor
    public TemplateID(String value) {
	super(value);
    }
}
