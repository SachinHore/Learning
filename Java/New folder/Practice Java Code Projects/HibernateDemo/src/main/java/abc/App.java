package abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setAname("navin");
        telusko.setAcolour("Green1");
        telusko.setAddress(new Address("city1","state1"));

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(telusko); // post
        //session.update(telusko); //put
        //session.remove(telusko);
        //session.find(Alien.class).getAname();
        //Alien a = session.find(Alien.class,101);
        //System.out.println(a.getAname());

        Query query=session.createQuery("from Alien");
        List<Alien> list=query.list();


        tx.commit();
        System.out.println(list);

    }
}
