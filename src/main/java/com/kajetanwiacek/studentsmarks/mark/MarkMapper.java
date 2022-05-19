package com.kajetanwiacek.studentsmarks.mark;

import com.kajetanwiacek.studentsmarks.exceptions.InvalidMarkValueException;
import com.kajetanwiacek.studentsmarks.mark.model.Mark;
import com.kajetanwiacek.studentsmarks.mark.model.MarkDto;
import org.springframework.stereotype.Component;

@Component
public class MarkMapper {
    public Mark toEntity(Long studentId, MarkDto markDto){
        int value = markDto.getValue();
        if(value<1 || value>6){
            throw new InvalidMarkValueException(value);
        }
        return new Mark(studentId,markDto.getValue(),markDto.getDescription());
    }
}
