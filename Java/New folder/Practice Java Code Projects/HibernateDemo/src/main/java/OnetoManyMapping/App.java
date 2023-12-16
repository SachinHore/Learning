package OnetoManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Alien alien = new Alien();
        alien.setAlienName("alienName1");

        Vehicle vehicle1 = new Vehicle("vehiclename1");
        Vehicle vehicle2 = new Vehicle("vehiclename2");



        alien.getVehicles().add(vehicle1);
        alien.getVehicles().add(vehicle2);

        Configuration con = new Configuration().configure();
        con.addAnnotatedClass(Alien.class);
        con.addAnnotatedClass(Vehicle.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(alien); // post
        session.save(vehicle1);
        session.save(vehicle2);
        //session.update(telusko); //put
        //session.remove(telusko);
        //session.find(Alien.class).getAname();
        //Alien a = session.find(Alien.class,101);
        //System.out.println(a.getAname());

        Query query=session.createQuery("from Alien");
        List<Alien> list=query.list();

        Query query1=session.createQuery("from Vehicle");
        List<Alien> list1=query1.list();


        tx.commit();
        System.out.println(list);
        System.out.println(list1);

    }
}
