package com.mycloset.common.test.service;

import com.mycloset.common.test.entity.Test;

import java.util.List;

public interface TestService {
    List<Test> findAll();
    Test findById(Long seq);
}
