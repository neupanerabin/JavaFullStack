package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String studnetName;
    String studentAddress;
    String studentRollno;
    String studentGrade;


    public Student(String studnetName, String studentAddress, String studentRollno, String studentGrade) {
        this.studnetName = studnetName;
        this.studentAddress = studentAddress;
        this.studentRollno = studentRollno;
        this.studentGrade = studentGrade;
    }

    public void setStudnetName(String studnetName) {
        this.studnetName = studnetName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentRollno(String studentRollno) {
        this.studentRollno = studentRollno;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studnetName='" + studnetName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentRollno='" + studentRollno + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                '}';
    }


}
