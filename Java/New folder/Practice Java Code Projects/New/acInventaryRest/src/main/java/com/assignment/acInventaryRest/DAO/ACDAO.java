package com.assignment.acInventaryRest.DAO;
import com.assignment.acInventaryRest.entity.AC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ACDAO {

    private Configuration con = new Configuration().configure().addAnnotatedClass(AC.class);
    private SessionFactory sf = con.buildSessionFactory();
    private Session session;
    private Transaction tx ;

    public ACDAO() {

    }

    public List<AC> getAllAC(){
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        List<AC> acList= (List<AC>) session.createQuery("From ac",AC.class).getResultList();
        tx.commit();
        session.close();
        return acList;
        //return null;
    }

    public  AC getACbyID(Long id){
       Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        AC ac = session.get(AC.class,id);
        tx.commit();
        session.close();
        return ac;
        //return null;

    }

    public void saveAC(AC ac){
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(ac);
        tx.commit();
        session.close();

    }

    public void updateAC(AC ac){

    }


    public void patchAC(Long id,AC ac){

    }


    public void deleteACbyID(Long id){

    }
}
