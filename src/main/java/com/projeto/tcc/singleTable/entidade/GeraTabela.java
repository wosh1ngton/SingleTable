/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.HierObjectID;
import com.projeto.tcc.dominio.singleTable.InternetID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class GeraTabela {
    public static void main(String[] args) {
        InternetID internet=new InternetID();
        internet.setValue("www.globo.com");
        HierObjectID h=new HierObjectID();
        h.setValue("testand21");
        
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("identification_st");
        EntityManager em=factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(h);
        em.getTransaction().commit();
        
        System.out.println("Endereco: " + h.getValue());
        
        em.close();
    }
  
}
