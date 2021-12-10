package com.mycloset.common.test.service.impl;

import com.mycloset.common.test.entity.Test;
import com.mycloset.common.test.repository.TestRepository;
import com.mycloset.common.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> findAll(){
        return testRepository.findAll();
    }

    @Override
    public Test findById(Long seq) {
        return testRepository.findById(seq).orElse(null);
    }
}
