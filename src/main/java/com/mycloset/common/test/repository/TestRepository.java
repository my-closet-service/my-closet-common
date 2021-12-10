package com.mycloset.common.test.repository;

import com.mycloset.common.test.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {
    @Override
    List<Test> findAll();
}
