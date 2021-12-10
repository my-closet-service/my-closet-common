package com.mycloset.common.member.repository;

import com.mycloset.common.member.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {

    @Override
    List<Member> findAll();
}
