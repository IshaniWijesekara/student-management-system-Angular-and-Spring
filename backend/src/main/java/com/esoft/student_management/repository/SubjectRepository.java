package com.esoft.student_management.repository;

import com.esoft.student_management.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SubjectRepository extends JpaRepository<Subject,Integer> {
    Subject findBySubjectName(String name);

}
