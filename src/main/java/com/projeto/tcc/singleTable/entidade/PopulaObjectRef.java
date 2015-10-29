/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.AccessGroupRef;
import com.projeto.tcc.dominio.singleTable.GenericID;
import com.projeto.tcc.dominio.singleTable.HierObjectID;
import com.projeto.tcc.dominio.singleTable.ISO_OID;
import com.projeto.tcc.dominio.singleTable.LocatableRef;
import com.projeto.tcc.dominio.singleTable.ObjectRef;
import com.projeto.tcc.dominio.singleTable.ObjectVersionID;
import com.projeto.tcc.dominio.singleTable.UUID;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import sun.net.www.content.text.Generic;

/**
 *
 * @author Woshington
 */
public class PopulaObjectRef {
    
    private EntityManager entityManager;
            public List<ObjectRef> findAllObjects() {
            TypedQuery<ObjectRef> query = entityManager.createQuery(
            "SELECT c FROM OBJECTREF c",ObjectRef.class);
            return query.getResultList();
        }
     public static void main(String[] args) {
         
        List<ObjectRef> objetos=new ArrayList<ObjectRef>();
        PopulaObjectRef pf=new PopulaObjectRef();
        objetos=pf.findAllObjects();
         System.out.println("teste: "+objetos);
        /*
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("identification_st");
        EntityManager entidade=fabrica.createEntityManager();
         entidade.getTransaction().begin();
         
         
       /*
       
        ISO_OID iso;
        iso=entidade.find(ISO_OID.class,2L);
        HierObjectID hob=new HierObjectID(iso, "valor");
        hob=entidade.find(HierObjectID.class, 5L);
        //ObjectRef or=new ObjectRef(hob, "nada", "tipo2");
        ObjectVersionID ovid;
        ovid=entidade.find(ObjectVersionID.class, 8L);
         AccessGroupRef agr=new AccessGroupRef(hob);
         LocatableRef lrf=new LocatableRef(ovid, "namespace", "tipo", "caminho");
        //UUID u=new UUID("8-4-4-4-12");
       
        //entidade.persist();
        entidade.getTransaction().commit();
        entidade.close();
        */
     }
}
