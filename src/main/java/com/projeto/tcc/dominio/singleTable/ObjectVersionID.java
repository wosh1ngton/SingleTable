package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="VERSIONID")
public class ObjectVersionID extends UIDBasedID{

    public ObjectVersionID(String value) {
        super(value);
    }

    public ObjectVersionID() {
    }

  

 }
