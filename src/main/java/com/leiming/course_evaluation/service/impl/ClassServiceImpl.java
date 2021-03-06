package com.leiming.course_evaluation.service.impl;

import com.leiming.course_evaluation.dto.CgClass;
import com.leiming.course_evaluation.dto.Department;
import com.leiming.course_evaluation.repository.ClassRepository;
import com.leiming.course_evaluation.repository.DepartmentRepository;
import com.leiming.course_evaluation.service.ClassService;
import com.leiming.course_evaluation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepository classRepository;
    @Override
    public Page<CgClass> findAll(Pageable pageable) {
        return classRepository.findAll(pageable);
    }

    @Override
    public int findAllCount() {
        return classRepository.findAllCount();
    }

    @Override
    public List<CgClass> findAllList() {
        return classRepository.findAll();
    }

    @Override
    public CgClass findById(Long id) {
        return classRepository.findById(id).get();
    }

    @Override
    public void saveOne(CgClass cgClassNew) {
        classRepository.save(cgClassNew);
    }
    @Override
    public int deleteClass(int id) {
        return classRepository.deleteClass(id);
    }

    @Override
    public int deleteAllClass(List<Long> claList) {
        return classRepository.deleteAllClass(claList);
    }
    @Override
    public CgClass findOneByName(String className) {
        return classRepository.findOneByName(className);
    }

    @Override
    public Page<CgClass> findAll(Specification<CgClass> cgClassSpecification, Pageable pageable) {
        return classRepository.findAll(cgClassSpecification,pageable);
    }
}
