package com.mycloset.common.closet.service.impl;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycloset.common.closet.entity.Closet;
import com.mycloset.common.closet.entity.QCloset;
import com.mycloset.common.closet.repository.ClosetRepository;
import com.mycloset.common.closet.service.ClosetService;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Service
public class ClosetServiceImpl implements ClosetService {
    @Autowired
    private ClosetRepository closetRepository;

    @Autowired
    private JPAQueryFactory jpaQueryFactory;
    
    @Override
    public List<Closet> findAll(){
        return closetRepository.findAll();
    }

    @Override
    public Closet findById(String userId) {
    	QCloset closet = QCloset.closet;
      
        return jpaQueryFactory.selectFrom(closet).where(closet.userId.eq(userId)).limit(1).fetchOne();
    }
    
    @Override
    public void save() {
    	Closet closet = new Closet();
    	
    	closet.setUserId("TESTID");
    	closet.setCtgL("");
    	closet.setCtgM("");
    	closet.setCOLOR("");
    	closet.setUPDDATE(Instant.now());
    	closet.setREGDATE(Instant.now());
    	closetRepository.save(closet);
    	
    }
}
