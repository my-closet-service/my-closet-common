package com.mycloset.common.closet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.mycloset.common.closet.entity.Closet;
import com.mycloset.common.closet.entity.ClosetKey;


@Repository
public interface ClosetRepository extends JpaRepository<Closet, ClosetKey> {

}
