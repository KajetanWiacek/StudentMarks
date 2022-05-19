package com.kajetanwiacek.studentsmarks.mark;

import com.kajetanwiacek.studentsmarks.mark.model.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepo extends JpaRepository<Mark,Long> {
    List<Mark> getByStudentId(Long id);
}
