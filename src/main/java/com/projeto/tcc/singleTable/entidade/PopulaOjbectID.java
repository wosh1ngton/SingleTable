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
        EntityManager entidade=fabrica.createEntityManager();
        
        entidade.getTransaction().begin();
        ArchetypeID arquetipo=new ArchetypeID();
        arquetipo.setConceptName("biochemistry result-cholesterol");
        arquetipo.setDomainConcept("Saude");
        arquetipo.setQualifiedRmEntity("openehr-ehr_rm-entry");
        arquetipo.setRmEntity("entry");
        arquetipo.setRmOriginator("openehr");
        arquetipo.setSpecialisation(null);
        arquetipo.setVersionID("3.4");
        arquetipo.setValue("323232");
        
        TemplateID temp=new TemplateID("ABC");
        
        GenericID generic=new GenericID("171", "valor geral");
        
        ISO_OID iso;
        UUID u=new UUID("8-4-4-4-12");
         VersionTreeID vtid=new VersionTreeID("5", "3.2", "22", "2.4");
          VersionTreeID vtid2;
          vtid2=entidade.find(VersionTreeID.class, 2L);
        
        iso=entidade.find(ISO_OID.class,2L);
        u=entidade.find(UUID.class,3L);
        HierObjectID hob=new HierObjectID(iso, "valor");
        hob=entidade.find(HierObjectID.class, 5L);
        
        ObjectVersionID versao=new ObjectVersionID(u,vtid2, hob);
        entidade.persist(versao);
        entidade.getTransaction().commit();
        entidade.close();
    }
}
