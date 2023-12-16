package DAO;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class UserDAO {

    private static Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
    private static SessionFactory sf = config.buildSessionFactory();
    private Session session = sf.openSession();
    private Transaction tx;


    public void saveUser(User user){
        session = sf.openSession();
        tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    public ArrayList<User> getAllUsers(){
        session = sf.openSession();
        tx = session.beginTransaction();
        ArrayList<User> users = (ArrayList<User>) session.createQuery("from User",User.class).getResultList();
        tx.commit();
        session.close();
        return users;
    }

    public User getUser(String userName, String userPassword){
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from User where userName= :userName and userPassword= :userPassword",User.class);
        query.setParameter("userName",userName);
        query.setParameter("userPassword",userPassword);
        User user = (User) query.uniqueResult();
        tx.commit();
        session.close();
        return user;
    }

    public User getUserbyId(Long id){
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from User where id= :id ",User.class);
        query.setParameter("id",id);
        User user = (User) query.uniqueResult();
        tx.commit();
        session.close();
        return user;
    }

    public User getUserbyUserName(String userName){
        session = sf.openSession();
        tx = session.beginTransaction();
        Query query = session.createQuery("from User where userName= :userName ",User.class);
        query.setParameter("userName",userName);
        User user = (User) query.uniqueResult();
        tx.commit();
        session.close();
        return user;
    }

    public void updateUser(User user){
        session = sf.openSession();
        tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
    }

    public void deleteUser(Long id){
        session = sf.openSession();
        tx = session.beginTransaction();
        session.createQuery("delete from User where userId=:id").setParameter("id",id).executeUpdate();
        tx.commit();
        session.close();
    }

}
