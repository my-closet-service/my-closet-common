package com.mycloset.common.member.service.impl;

import com.mycloset.common.member.entity.Member;
import com.mycloset.common.member.repository.MemberRepository;
import com.mycloset.common.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
