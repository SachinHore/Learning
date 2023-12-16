package OnetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setAlienName("alienname1");

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("vehiclename1");

        alien.setVehicle(vehicle);

        Configuration con = new Configuration().configure();
        con.addAnnotatedClass(Alien.class);
        con.addAnnotatedClass(Vehicle.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(alien); // post
        session.save(vehicle);
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
