package com.tochratana.springassignment;

import com.tochratana.springassignment.model.Student;
import com.tochratana.springassignment.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAssignmentApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(StudentService studentService) {
        return args -> {

            System.out.println("==== Get All Student ====");
            studentService.getAllStudent();

            System.out.println("==== Insert new student ====");
            Student newStudent = new Student(11, "Leo", "Male", 95);
            studentService.insertStudent(newStudent);

            System.out.println("==== Select student by index of list");
            studentService.selectStudent(2);

            System.out.println("==== Select student with ID 5 ====");
            studentService.selectStudentById(5);

            System.out.println("==== Update student with ID 3 ====");
            Student updatedStudent = new Student(3, "Charlie Updated", "Male", 99);
            studentService.updateStudentById(3, updatedStudent);

            System.out.println("==== Delete student with ID 2 ==== ");
            studentService.deleteStudentById(2);
        };
    }

}
