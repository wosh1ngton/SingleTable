package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.AccessGroupRef;
import com.projeto.tcc.dominio.singleTable.HierObjectID;
import com.projeto.tcc.dominio.singleTable.InternetID;
import com.projeto.tcc.dominio.singleTable.TemplateID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class GeraTabela {
    public static void main(String[] args) {
        
        
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("identification_st");
        EntityManager em=factory.createEntityManager();
        
        InternetID internet=new InternetID("http://www.sbt.com");
        TemplateID tempID=new TemplateID("oremos");
        
        
        em.getTransaction().begin();
        //tempID=em.find(TemplateID.class,1L);
        //em.persist(tempID);
        em.persist(internet);
       // AccessGroupRef agr2=new AccessGroupRef(tempID);
        //agr2.setType("segredo2");
        
        //em.persist(agr2);
        //em.persist(internet);
        em.getTransaction().commit();
        
        
        //Tarefa encontrada = manager.find(Tarefa.class, 2L);
        //System.out.println(encontrada.getDescricao());  
    
        System.out.println("Endereco: " + internet.getValue());
        
        em.close();
    }
  
}