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
         VersionTreeID vtid=new VersionTreeID("5", "3.2", "22", "2.4");
          VersionTreeID vtid2=new VersionTreeID("3", "3.2.1", "23", "2.5");
        entidade.persist(vtid2);
        entidade.getTransaction().commit();
        entidade.close();
    }
}
