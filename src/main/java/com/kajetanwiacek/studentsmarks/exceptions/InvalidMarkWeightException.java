package com.kajetanwiacek.studentsmarks.exceptions;

public class InvalidMarkWeightException extends RuntimeException{
    public InvalidMarkWeightException(Integer weight) {
        super("Invalid weight "+weight);
    }
}
