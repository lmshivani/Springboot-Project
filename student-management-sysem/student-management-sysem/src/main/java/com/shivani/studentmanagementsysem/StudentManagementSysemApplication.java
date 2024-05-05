package com.shivani.studentmanagementsysem;

import com.shivani.studentmanagementsysem.entity.Student;
import com.shivani.studentmanagementsysem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSysemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSysemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {
//		Student student1=new Student("ram","kumar","ram@gmail.com");
//		studentRepository.save(student1);
//		Student student2=new Student("ravi","kumar","ravi@gmail.com");
//		studentRepository.save(student2);
//		Student student3=new Student("abhi","kumar","abhi@gmail.com");
//		studentRepository.save(student3);
	}
}
