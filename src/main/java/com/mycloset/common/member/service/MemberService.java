package com.mycloset.common.member.service;

import com.mycloset.common.member.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> findAll();
}
