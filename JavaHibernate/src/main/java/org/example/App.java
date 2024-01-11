package org.example;

import org.example.entity.Student;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setStudnetName("Rsm");
        s1.setStudentAddress("Kathmandu");
        s1.setStudentRollno("11");
        s1.setStudentGrade("10");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionBuilder = config.buildSessionFactory();
        Session session = sessionBuilder.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        session.close();



    }
}
