package com.projeto.tcc.dominio.singleTable;
import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="OBJECTREF") /*Anotação opcional, por padrão o nome da classe é o nome da tabela,
caso deseje mudar o nome da tabela gerada é preciso especificar na clásula name. */
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="REF_TYPE", discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue(value = "OBJECT_REF")
public class ObjectRef implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //Realiza o mapeamento de maneira automática.
    private Long id;
    
    @OneToOne
    private ObjectID objectId;
    private String namespace;
    private String type;

    public ObjectRef() {
    }

    public ObjectRef(ObjectID objectId) {
        this.objectId = objectId;
    }
    
    //@FullConstructor
    public ObjectRef(ObjectID objectId, String namespace, String type) {
        this.objectId = objectId;
        this.namespace = namespace;
        this.type = type;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ObjectID getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectID objectId) {
        this.objectId = objectId;
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