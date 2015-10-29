package com.projeto.tcc.dominio.singleTable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="UIDBasedID_TYPE",
      discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue(value="UIB")
public abstract class UIDBasedID extends ObjectID {
    public abstract UID root();
}
