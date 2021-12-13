package com.mycloset.common.closet.entity;

import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@IdClass(ClosetKey.class)
@Table(name="CLOSET")
public class Closet {
    @Id
    @Column(name="USER_ID")
    private String userId;

    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false)
    private Integer seq;

    @Column(nullable=false, name="CTG_L")
    private String ctgL;
    
    @Column(nullable=false,  name="CTG_M")
    private String ctgM;
    
    @Column(nullable=false)
    private String COLOR;
    
    @Column(nullable=true)
    private String FILTER;
    
    @Column(nullable=true)
    private String FILTER2;
    
    @Column(nullable=true)
    private String MEMO;

    @Column(updatable= false)
    private Instant  REGDATE;
    
    @Column(updatable = true)
    private Instant  UPDDATE;

   
}