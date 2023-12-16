package ImplInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("car");

        TwoWheeler bike = new TwoWheeler();
        bike.setVehicleName("Bike");
        bike.setSteeringHandle("Bike Strring Handle");

        FourWheeler car = new FourWheeler();
        car.setVehicleName("Porshe");
        car.setSteeringWheel("Porshe Steering wheel");




        Configuration con = new Configuration().configure();
        con.addAnnotatedClass(Vehicle.class);
        con.addAnnotatedClass(TwoWheeler.class);
        con.addAnnotatedClass(FourWheeler.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(vehicle); // post
        session.save(bike);
        session.save(car);

        //session.update(telusko); //put
        //session.remove(telusko);
        //session.find(Alien.class).getAname();
        //Alien a = session.find(Alien.class,101);
        //System.out.println(a.getAname());

       // Query query=session.createQuery("from Alien");
        //List<Alien> list=query.list();

        //Query query1=session.createQuery("from Vehicle");
       // List<Alien> list1=query1.list();


        tx.commit();
        session.close();
        //System.out.println(list);
        //System.out.println(list1);

    }
}
