package HibernateCache;

import CRUDOperations.Alien;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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

        Alien alien = (Alien) session.get(Alien.class,1);
        Query query=session.createQuery("from Alien");
        query.setCacheable(true);
        tx.commit();
        session.close();


        Session session2 = sf.openSession();
        Transaction tx2 = session2.beginTransaction();

        Alien alien2 = (Alien) session.get(Alien.class,1);

        tx2.commit();
        session2.close();
    }
}
