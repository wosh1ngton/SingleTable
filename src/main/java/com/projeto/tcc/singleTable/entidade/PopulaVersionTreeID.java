package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.VersionTreeID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class PopulaVersionTreeID {
     public static void main(String[] args) {
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("identification_st");
        EntityManager entidade=fabrica.createEntityManager();
        
        entidade.getTransaction().begin();
       
       // entidade.persist();
        entidade.getTransaction().commit();
        entidade.close();
    }
}
