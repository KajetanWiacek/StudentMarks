package com.kajetanwiacek.studentsmarks.exceptions;

public class InvalidMarkValueException extends RuntimeException{
    public InvalidMarkValueException(int value) {
        super("Invalid mark value "+value);
    }
}
