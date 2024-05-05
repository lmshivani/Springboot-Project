package com.shivani.studentmanagementsysem.service;

import com.shivani.studentmanagementsysem.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getallStudent();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
