package com.tochratana.springassignment.service;

import com.tochratana.springassignment.db.InMemoryDatabase;
import com.tochratana.springassignment.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    // Create Dependency
    private List<Student> studentList;

    // Constructor Injection
    public StudentService (List<Student> students){
        this.studentList = students;
    }

    // TODO getAllStudent
    public void getAllStudent(){
        studentList.forEach(System.out::println);
    }

    // TODO Insert new student
    public void insertStudent(Student student){
        studentList.add(student);
        System.out.println("[✓] Insert new student : " + student);
    }

    // TODO Select student
    public void selectStudent(Integer index){
        System.out.println("[✓] Get student by index : " + studentList.get(index));
    }

    // TODO select student by id
    public void selectStudentById(Integer id){
        System.out.println("[✓] Get student by id : " + studentList.stream().filter(s -> s.getId() == id).findFirst());
    }

    // TODO update by id
    public void updateStudentById(Integer id, Student newStudent){
        studentList.stream().filter(s -> s.getId() == id)
                    .findFirst()
                    .ifPresent(oldStudent -> {
                                oldStudent.setId(newStudent.getId());
                                oldStudent.setGender(newStudent.getGender());
                                oldStudent.setFullName(newStudent.getFullName());
                                oldStudent.setScore(newStudent.getScore());
                            }
                    );

        System.out.println("[✓] Update student by id successfully " + newStudent);
    }

    // TODO deleting student by id
    public void deleteStudentById(Integer id){
        System.out.println("[✓] Remove student by id successfully " + studentList.removeIf(studentForDelete -> studentForDelete.getId() == id));
    }

}
