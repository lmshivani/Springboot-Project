package com.shivani.studentmanagementsysem.repository;
import com.shivani.studentmanagementsysem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
