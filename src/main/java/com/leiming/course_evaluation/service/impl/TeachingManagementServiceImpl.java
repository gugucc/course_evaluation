package com.leiming.course_evaluation.service.impl;

import com.leiming.course_evaluation.dto.TeachingManagement;
import com.leiming.course_evaluation.repository.TeachingManagementRepository;
import com.leiming.course_evaluation.service.TeachingManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachingManagementServiceImpl implements TeachingManagementService {
    @Autowired
    private TeachingManagementRepository teachingManagementRepository;
    @Override
    public Page<TeachingManagement> findAll(Pageable pageable) {
        return teachingManagementRepository.findAll(pageable);
    }

    @Override
    public int findAllCount() {
        return teachingManagementRepository.findAllCount();
    }

    @Override
    public List<TeachingManagement> findAllList() {
        return teachingManagementRepository.findAll();
    }

    @Override
    public int deleteTeacherManagement(int id) {
        return teachingManagementRepository.deleteTeacherManagement(id);
    }

    @Override
    public int deleteAllTeacherManagement(List<Long> teaList) {
        return teachingManagementRepository.deleteAllTeacherManagement(teaList);
    }

    @Override
    public TeachingManagement findById(Long id) {
        return teachingManagementRepository.findById(id).get();
    }

    @Override
    public void saveOne(TeachingManagement teachingManagement) {
        teachingManagementRepository.save(teachingManagement);
    }

    @Override
    public List<TeachingManagement> finAllByClass(String className) {
        return teachingManagementRepository.finAllByClass(className);
    }

    @Override
    public String findBatchByClass(String className) {
        return teachingManagementRepository.finBatchByClass(className);
    }
    @Override
    public TeachingManagement findOneByClassAndCourse(String cgClass, String course) {
        return teachingManagementRepository.findOneByClassAndCourse(cgClass,course);
    }

    @Override
    public Page<TeachingManagement> findAll(Specification<TeachingManagement> teachingManagementSpecification, Pageable pageable) {
        return teachingManagementRepository.findAll(teachingManagementSpecification,pageable);
    }

}
