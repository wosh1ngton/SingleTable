package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.ISO_OID;
import com.projeto.tcc.dominio.singleTable.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class PopulaUID {

    public static void main(String[] args) {
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("identification_st");
        EntityManager entidade=fabrica.createEntityManager();
        
        entidade.getTransaction().begin();
        ISO_OID iso=new ISO_OID("2.16.840.1.113883.3.1");
        UUID u=new UUID("8-4-4-4-12");
        entidade.persist(u);
        entidade.persist(iso);
        entidade.getTransaction().commit();
        entidade.close();
    }
    
}
