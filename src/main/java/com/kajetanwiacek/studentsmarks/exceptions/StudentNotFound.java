package com.kajetanwiacek.studentsmarks.exceptions;

public class StudentNotFound extends RuntimeException{
    public StudentNotFound(Long id) {
        super("Student with id "+id+" not found");
    }
}
