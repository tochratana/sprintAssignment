package com.tochratana.springassignment.db;

import com.tochratana.springassignment.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InMemoryDatabase {

    @Bean
    public List<Student> student(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alice", "Female", 85));
        studentList.add(new Student(2, "Bob", "Male", 78));
        studentList.add(new Student(3, "Charlie", "Male", 90));
        studentList.add(new Student(4, "Diana", "Female", 88));
        studentList.add(new Student(5, "Eve", "Female", 92));
        studentList.add(new Student(6, "Frank", "Male", 70));
        studentList.add(new Student(7, "Grace", "Female", 76));
        studentList.add(new Student(8, "Hank", "Male", 65));
        studentList.add(new Student(9, "Ivy", "Female", 80));
        studentList.add(new Student(10, "Jack", "Male", 83));
        return studentList;
    }

}
