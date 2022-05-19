package com.kajetanwiacek.studentsmarks.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    boolean existsByName(String name);
}
