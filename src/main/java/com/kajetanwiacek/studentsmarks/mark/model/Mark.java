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

    private Integer weight;

    private String description;

    private MarkType type;

    public Mark(Long studentId, Integer value, Integer weight, String description,MarkType type) {
        this.studentId = studentId;
        this.value = value;
        this.weight = weight;
        this.description = description;
        this.type = type;
    }
}
