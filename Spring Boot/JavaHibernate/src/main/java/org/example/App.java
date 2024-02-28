package org.example;

import org.example.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setStudnetName("rabin");
        s1.setStudentAddress("Kathmandu");
        s1.setStudentRollno("a_1");
        s1.setStudentGrade("10");

        Student s2 = new Student();
        s2.setStudnetName("Sampurna");
        s2.setStudentAddress("Dhading");
        s2.setStudentRollno("x_11");
        s2.setStudentGrade("11");

        Student s3 = new Student();
        s3.setStudentAddress("Nuwakot");
        s3.setStudnetName("Sangarsha");
        s3.setStudentRollno("x_12");
        s3.setStudentGrade("12");

        Student s4 = new Student();
        s4.setStudnetName("suman");
        s4.setStudentAddress("Nuwakot");
        s4.setStudentRollno("x_13");
        s4.setStudentGrade("13");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionBuilder = config.buildSessionFactory();
        Session session = sessionBuilder.openSession();

        Query<Student> getUpdateStudents = session.createQuery("From Student", Student.class);
        List<Student> listofStudent = getUpdateStudents.getResultList();

        System.out.println(listofStudent);


//        Student selectStudent = session.find(Student.class, 1); // Select with student id
//
//        if(selectStudent!= null){
//            System.out.println(selectStudent.getStudnetName());
//    }
//    else{
//        System.out.println("Failed");
//    }

        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        session.persist(s2);
//        session.persist(s3);
//        session.persist(s4);
//        transaction.commit();

        // Update query
        Student updateStudent = session.find(Student.class, 1); // Select with student id
        updateStudent.setStudentAddress("Lamjung");
        System.out.println(updateStudent);

        // Deletye Student by i d
        Student deleteStudent = session.find(Student.class, 4); // Select with student id
        session.remove(deleteStudent);
        transaction.commit();   // helps to delete with the id





        session.close();



    }
}
