package com.spring.batch.student;

import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student item) throws Exception {
        // all the business logic will be here
        return null;
    }
}
