/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.LocatableRef;
import com.projeto.tcc.dominio.singleTable.ObjectRef;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Woshington
 */
public class RecuperaObjetos {
    
 
    private EntityManager manager;
     
    public ObjectRef buscaObjeto(Long id) {
       ObjectRef objeto;
       objeto = manager.find(ObjectRef.class, id);
       return objeto;
    
    }
       
    public List<ObjectRef> findAllObjetcs() {
        
        TypedQuery<ObjectRef> query = manager.createQuery("FROM ObjectRef",ObjectRef.class);     
        return query.getResultList();
    }
    public void mostraObjetos(List<ObjectRef> objetos) {
        for (ObjectRef objeto : objetos) {
            System.out.println(objeto.getObjectId());
        }
    }
       
    public static void main(String[] args) {
        RecuperaObjetos recupera = new RecuperaObjetos();
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("identification_st");
        
        recupera.manager = fabrica.createEntityManager();        
        
        List<ObjectRef> objectsRef = recupera.findAllObjetcs();
        recupera.mostraObjetos(objectsRef);
               
             
    }
    
}
