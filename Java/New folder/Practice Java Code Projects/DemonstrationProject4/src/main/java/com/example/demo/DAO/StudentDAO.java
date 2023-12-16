package com.example.demo.DAO;

import com.example.demo.entities.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class StudentDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

    public List<Student> findAll() {

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        List<Student> slist = (List<Student>) em.createQuery("From sms").getResultList();;
        //em.getTransaction().commit();


        return slist;
    }


    public void save(Student student) {  //ok

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        System.out.println(student);

    }


    public void deleteById(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student sobj = findById(id);
        em.remove(id);
        em.getTransaction().commit();
    }


    public Student findById(int id) {   //ok
        EntityManager em = emf.createEntityManager();
        return em.find(Student.class,id);
    }

    public void update(Student student) {

    }
}
