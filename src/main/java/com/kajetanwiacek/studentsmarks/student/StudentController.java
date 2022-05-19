package com.kajetanwiacek.studentsmarks.student;

import com.kajetanwiacek.studentsmarks.mark.model.Mark;
import com.kajetanwiacek.studentsmarks.mark.model.MarkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);

        return new ResponseEntity<>("Student added", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentService.getStudents(),HttpStatus.OK);
    }

    @GetMapping("/{studentId}/marks")
    public ResponseEntity<List<Mark>> getAllStudents(@PathVariable Long studentId){
        return new ResponseEntity<>(studentService.getStudentMarks(studentId),HttpStatus.OK);
    }

    @PostMapping("/{studentId}")
    public ResponseEntity<String> addMark(@PathVariable Long studentId, @RequestBody MarkDto dto){
        studentService.saveMark(studentId,dto);

        return new ResponseEntity<>("Mark saved", HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable Long studentId){
        return new ResponseEntity<>(studentService.getStudent(studentId),HttpStatus.OK);
    }
}
