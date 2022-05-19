package com.kajetanwiacek.studentsmarks.mark;

import com.kajetanwiacek.studentsmarks.exceptions.InvalidMarkValueException;
import com.kajetanwiacek.studentsmarks.exceptions.InvalidMarkWeightException;
import com.kajetanwiacek.studentsmarks.mark.model.Mark;
import com.kajetanwiacek.studentsmarks.mark.model.MarkDto;
import org.springframework.stereotype.Component;

@Component
public class MarkMapper {
    public Mark toEntity(Long studentId, MarkDto markDto){
        int value = markDto.getValue();
        int weight = markDto.getWeight();
        if(value<1 || value>6){
            throw new InvalidMarkValueException(value);
        }
        if(weight<1 || weight>7){
            throw new InvalidMarkWeightException(weight);
        }
        if(markDto.getType() == null){
            throw new RuntimeException("Mark type not given");
        }
        return new Mark(studentId,markDto.getValue(), markDto.getWeight(), markDto.getDescription(),markDto.getType());
    }
}
