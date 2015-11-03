/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.ArchetypeID;
import com.projeto.tcc.dominio.singleTable.GenericID;
import com.projeto.tcc.dominio.singleTable.HierObjectID;
import com.projeto.tcc.dominio.singleTable.ISO_OID;
import com.projeto.tcc.dominio.singleTable.ObjectVersionID;
import com.projeto.tcc.dominio.singleTable.TemplateID;
import com.projeto.tcc.dominio.singleTable.TerminologyID;
import com.projeto.tcc.dominio.singleTable.UIDBasedID;
import com.projeto.tcc.dominio.singleTable.UUID;
import com.projeto.tcc.dominio.singleTable.VersionTreeID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class PopulaOjbectID {
    public static void main(String[] args) {
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("identification_st");
        EntityManager em=fabrica.createEntityManager();
        
        ArchetypeID arquetipo=new ArchetypeID();
        arquetipo.setValue("valor arquetipo");
        
        TemplateID temp=new TemplateID("ABC");        
        GenericID generic=new GenericID("171", "valor geral");
        TerminologyID termi=new TerminologyID("terminologia");        
        UIDBasedID uid=new ObjectVersionID("version_id");
        UIDBasedID uid2=new HierObjectID("hier_do_uid");        
        HierObjectID hier=new HierObjectID("direto do hier");
        ObjectVersionID version=new ObjectVersionID("Direto do version");
        ObjectVersionID versao=new ObjectVersionID();
        versao.setValue("fwefewf");
        
        em.getTransaction().begin();
        em.persist(arquetipo);
        em.persist(temp);
        em.persist(generic);
        em.persist(termi);
        em.persist(uid);
        em.persist(uid2);
        em.persist(hier);
        em.persist(version);
        em.persist(versao);
        em.getTransaction().commit();
        
        System.out.println("Endereco: " + arquetipo.getValue());
        
        em.close();
    }
}
