package com.assignment.acInventaryRest.DAO;
import com.assignment.acInventaryRest.entity.AC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class ACDAO1 {


EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    public List<AC> getAllAC(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<AC> acList= (List<AC>) em.createQuery("From ac").getResultList();
        return acList;
    }

    public  AC getACbyID(Long id){
        EntityManager em = emf.createEntityManager();
        return (AC) em.find(AC.class,id);
    }

    public void saveAC(AC ac){
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(ac);
        em.getTransaction().commit();
        //System.out.println(ac);
    }

    public void updateAC(AC ac){

    }


    public void patchAC(Long id,AC ac){

    }


    public void deleteACbyID(Long id){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        AC acobj = getACbyID(id);
        em.remove(id);
        em.getTransaction().commit();
    }
}

