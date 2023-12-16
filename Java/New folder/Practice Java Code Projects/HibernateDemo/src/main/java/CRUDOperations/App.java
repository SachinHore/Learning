package CRUDOperations;

import abc.Address;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Configuration con = new Configuration().configure();
        con.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
/*
        for(int i=0;i<10;i++) {
            Alien telusko = new Alien();
            telusko.setAname("Alien "+(i+1));
            session.save(telusko);  //Post it tracks
            //session.persist(telusko); //not track
        }*/
/*
        Alien alien=(Alien) session.get(Alien.class,6);  //get by id
        System.out.println("Alien name pulled up is: "+alien.getAname());

        Alien alien1 =new Alien();
        alien1.setAid(3);
        session.delete(alien1);  //delete */


        //alien.setAname("Updated user 6666");
        //session.update(alien);  //put
/*
        Query query=session.createQuery("from Alien"); //getAll
        query.setFirstResult(5);
        query.setMaxResults(4);
        List<Alien> list = query.list();

        session.createQuery("from Alien where aid > 5");

        session.createQuery("Select aname from Alien");

        session.createQuery("Select max(aid) from Alien");

        int i = 5;
        Query query1 = session.createQuery("from Alien where aid > ?");
        query1.setInteger(0,i);

        Criteria criteria = session.createCriteria(Alien.class);
        criteria.add(Restrictions.eq("aname","User 10"))
                .setProjection(Projections.count("aid"));*/

        tx.commit();
        session.close();

        Session session1 = sf.openSession();
        session1.beginTransaction();
        for(int i=0;i<10;i++) {
            Alien telusko = new Alien();
            telusko.setAname("Alien "+(i+1));
            session1.save(telusko);  //Post it tracks
            //session.persist(telusko); //not track
        }
        Alien alien=(Alien) session1.get(Alien.class,6);  //get by id
        System.out.println("Alien name pulled up is: "+alien.getAname());


    }
}
