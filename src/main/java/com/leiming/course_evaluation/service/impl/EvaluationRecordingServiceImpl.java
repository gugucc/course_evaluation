package com.leiming.course_evaluation.service.impl;

import com.leiming.course_evaluation.dto.EvaluationRecording;
import com.leiming.course_evaluation.repository.EvaluationRecordingRepository;
import com.leiming.course_evaluation.service.EvaluationRecordingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 雷鸣
 * @ClassName EvaluationRecordingServiceImpl
 * LovelyLM
 * @Date 2019/9/29 10:40
 */
@Service
public class EvaluationRecordingServiceImpl implements EvaluationRecordingService {
    @Autowired
    private EvaluationRecordingRepository evaluationRecordingRepository;
    @Override
    public List<EvaluationRecording> findByNumber(String stuNumber) {
        return evaluationRecordingRepository.findByNumber(stuNumber);
    }

    @Override
    public void save(EvaluationRecording evaluationRecording) {
        evaluationRecordingRepository.save(evaluationRecording);
    }

    @Override
    public List<EvaluationRecording> findAll() {
        return evaluationRecordingRepository.findAll();
    }

    @Override
    public List<EvaluationRecording> findByClassAndCourse(String cgClass, String course) {
        return evaluationRecordingRepository.findByClassAndCourse(cgClass,course);
    }

    @Override
    public EvaluationRecording findOneByNumber(String userNumber, String teacherNumber) {
        return evaluationRecordingRepository.findOneByNumber(userNumber,teacherNumber);
    }

    @Override
    public List<EvaluationRecording> findByTeacherNumber(String teacherNumber) {
        return evaluationRecordingRepository.findByTeacherNumber(teacherNumber);
    }

    @Override
    public void deleteEvaluationRecording(Long id) {
         evaluationRecordingRepository.deleteEvaluationRecording(id);
    }

    @Override
    public void deleteEvaluationRecordingById(Long id) {
        evaluationRecordingRepository.deleteById(id);
    }

    @Override
    public int deleteEvaluationRecordingByTeacherId(Long teacherNumber) {
        return evaluationRecordingRepository.deleteByTeacherId(teacherNumber);
    }

    @Override
    public Page<EvaluationRecording> findAll(Specification<EvaluationRecording> evaluationRecordingSpecification, Pageable pageable) {
        return evaluationRecordingRepository.findAll(evaluationRecordingSpecification,pageable);
    }
}
