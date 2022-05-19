package com.kajetanwiacek.studentsmarks.mark.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;

    private Integer value;

    private String description;

    public Mark(Long studentId, Integer value, String description) {
        this.studentId = studentId;
        this.value = value;
        this.description = description;
    }
}
