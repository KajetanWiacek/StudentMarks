package com.kajetanwiacek.studentsmarks.student;

import com.kajetanwiacek.studentsmarks.mark.MarkMapper;
import com.kajetanwiacek.studentsmarks.mark.MarkService;
import com.kajetanwiacek.studentsmarks.mark.model.Mark;
import com.kajetanwiacek.studentsmarks.mark.model.MarkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;
    private final MarkService markService;
    @Autowired
    public StudentService(StudentRepo studentRepo,MarkService markService) {
        this.studentRepo = studentRepo;
        this.markService = markService;
    }

    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public Student getStudent(Long studentId){
        return studentRepo.findById(studentId).orElseThrow();
    }

    public void saveMark(Long studentId, MarkDto dto){
        markService.saveMark(studentId,dto);
    }

    public List<Mark> getStudentMarks(Long studentId){
        return markService.getStudentMarks(studentId);
    }
}
