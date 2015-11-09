package com.projeto.tcc.singleTable.entidade;

import com.projeto.tcc.dominio.singleTable.AccessGroupRef;
import com.projeto.tcc.dominio.singleTable.ArchetypeID;
import com.projeto.tcc.dominio.singleTable.GenericID;
import com.projeto.tcc.dominio.singleTable.HierObjectID;
import com.projeto.tcc.dominio.singleTable.LocatableRef;
import com.projeto.tcc.dominio.singleTable.ObjectID;
import com.projeto.tcc.dominio.singleTable.ObjectRef;
import com.projeto.tcc.dominio.singleTable.ObjectVersionID;
import com.projeto.tcc.dominio.singleTable.PartyRef;
import com.projeto.tcc.dominio.singleTable.TemplateID;
import com.projeto.tcc.dominio.singleTable.TerminologyID;
import com.projeto.tcc.dominio.singleTable.UIDBasedID;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


/**
 *
 * @author Woshington
 */
public class InsereObjetos {
    
   
    
    public static void main(String[] args) {
        
   
    EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("identification_st");
    EntityManager entidade=fabrica.createEntityManager();
   entidade.getTransaction().begin();
    
    
    ObjectID objeto = entidade.find(ArchetypeID.class, 1L);
         
    TemplateID temp=entidade.find(TemplateID.class, 2L);
        
    GenericID generic=entidade.find(GenericID.class, 3L);
       //TerminologyID termi=entidade.find(TerminologyID.class, 4L);
        
        UIDBasedID uid=entidade.find(ObjectVersionID.class, 5L);
        UIDBasedID uid2=entidade.find(HierObjectID.class, 6L);
        
        //HierObjectID hier=entidade.find(HierObjectID.class, 7L);
       // ObjectVersionID version=entidade.find(ObjectVersionID.class, 8L);
      ObjectVersionID versao=entidade.find(ObjectVersionID.class, 9L);
         
         AccessGroupRef acc=new AccessGroupRef(temp);
         PartyRef party = new PartyRef(objeto);
         AccessGroupRef acc2=new AccessGroupRef(temp);
       PartyRef party2 = new PartyRef(generic);
       LocatableRef local = new LocatableRef(uid2, "feliz");
        LocatableRef local2 = new LocatableRef(versao, "teste", "exemplo", "servico");
    
      entidade.persist(acc);
      entidade.persist(party);
        entidade.persist(acc2);
       entidade.persist(party2);
       entidade.persist(local);
     entidade.persist(local2);
      //  entidade.persist();
      //  entidade.persist();
      //  entidade.persist();
        entidade.getTransaction().commit();
        entidade.close();
       
     }
}
