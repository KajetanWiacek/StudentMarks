package com.kajetanwiacek.studentsmarks.mark;

import com.kajetanwiacek.studentsmarks.mark.model.Mark;
import com.kajetanwiacek.studentsmarks.mark.model.MarkDto;
import com.kajetanwiacek.studentsmarks.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {
    private final MarkRepo markRepo;
    private final MarkMapper markMapper;

    @Autowired
    public MarkService(MarkRepo markRepo,MarkMapper markMapper) {
        this.markRepo = markRepo;
        this.markMapper = markMapper;
    }

    public List<Mark> getStudentMarks(Long studentId){
        return markRepo.getByStudentId(studentId);
    }

    public void saveMark(Long studentId,MarkDto dto){
        Mark mark = markMapper.toEntity(studentId,dto);
        markRepo.save(mark);
    }
}
