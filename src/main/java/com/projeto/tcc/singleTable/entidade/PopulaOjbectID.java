package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.AccessGroupRef;
import com.projeto.tcc.dominio.singleTable.ArchetypeID;
import com.projeto.tcc.dominio.singleTable.GenericID;
import com.projeto.tcc.dominio.singleTable.HierObjectID;
import com.projeto.tcc.dominio.singleTable.LocatableRef;
import com.projeto.tcc.dominio.singleTable.ObjectRef;
import com.projeto.tcc.dominio.singleTable.ObjectVersionID;
import com.projeto.tcc.dominio.singleTable.PartyRef;
import com.projeto.tcc.dominio.singleTable.TemplateID;
import com.projeto.tcc.dominio.singleTable.TerminologyID;
import com.projeto.tcc.dominio.singleTable.UIDBasedID;
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
        EntityManager manager=fabrica.createEntityManager();
                
        
        //Cria instâncias das classes de ObjectId e preenche os valores
        ArchetypeID arquetipo = new ArchetypeID("arquétipo");
        TemplateID template = new TemplateID("template");  
        TemplateID temp = new TemplateID("template2"); 
        GenericID generic = new GenericID("genérico", "esquema");
        GenericID generic2 = new GenericID("genérico2", "esquema2");
        TerminologyID terminology = new TerminologyID("terminologia");        
        UIDBasedID object_based = new ObjectVersionID("version_id");
        UIDBasedID hier_based = new HierObjectID("hier_id");        
        HierObjectID hier = new HierObjectID("hier");
        HierObjectID hier2 = new HierObjectID("hier2");
        ObjectVersionID version = new ObjectVersionID("version");
        ObjectVersionID version2 = new ObjectVersionID("version2");
        
        
        manager.getTransaction().begin();
        manager.persist(arquetipo);
        manager.persist(template);
        manager.persist(temp);
        manager.persist(generic);
        manager.persist(generic2);
        manager.persist(terminology);
        manager.persist(object_based);
        manager.persist(hier_based);
        manager.persist(hier);
        manager.persist(hier2);
        manager.persist(version);
        manager.persist(version2);
        manager.getTransaction().commit();
        
        //Recupera os objectId que serão utilizados como referência em ObjectRef
        arquetipo = manager.find(ArchetypeID.class, 1L);
        template = manager.find(TemplateID.class, 2L);
        temp = manager.find(TemplateID.class, 3L);
        generic = manager.find(GenericID.class, 4L);
        generic2 = manager.find(GenericID.class, 5L);
        terminology = manager.find(TerminologyID.class, 6L);
        object_based = manager.find(UIDBasedID.class, 7L);
        hier_based = manager.find(UIDBasedID.class, 8L);
        hier = manager.find(HierObjectID.class, 9L);
        hier2 = manager.find(HierObjectID.class, 10L);
        version = manager.find(ObjectVersionID.class, 11L);
        version2 = manager.find(ObjectVersionID.class, 12L);
        
        //Cria instâncias das classes de ObjectRef e preenche os valores
        ObjectRef ref = new ObjectRef(arquetipo, "local", "Pessoa");
        AccessGroupRef access = new AccessGroupRef(template);
        PartyRef party = new PartyRef(temp);
        PartyRef party2 = new PartyRef(generic, "unknow", "Carro");
        LocatableRef local = new LocatableRef(version2, "path", "Paciente", "teste");
        LocatableRef local2 = new LocatableRef(version, "caminho2", "Instrumento", "caminho3");
        ObjectRef ref2 = new ObjectRef(terminology, "local", "Carro");
        AccessGroupRef access2 = new AccessGroupRef(generic2);
        AccessGroupRef access3 = new AccessGroupRef(hier);
        LocatableRef local3 = new LocatableRef(version, "caminho4", "Pessoa", "caminho6");
        PartyRef party3 = new PartyRef(version2);
        PartyRef party4 = new PartyRef(version, "local", "Arquetipo");
        
        manager.getTransaction().begin();
        manager.persist(ref);
        manager.persist(access);
        manager.persist(party);
        manager.persist(party2);
        manager.persist(local);
        manager.persist(local2);
        manager.persist(ref2);
        manager.persist(access2);
        manager.persist(access3);
        manager.persist(local3);
        manager.persist(party3);
        manager.persist(party4);
        manager.getTransaction().commit();
        
       
        System.out.println("Fim");
        
        manager.close();
    }
}
