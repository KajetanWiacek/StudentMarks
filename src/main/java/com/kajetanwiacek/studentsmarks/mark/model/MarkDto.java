package com.kajetanwiacek.studentsmarks.mark.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MarkDto {
    private Integer value;
    private Integer weight;
    private String description;
}
