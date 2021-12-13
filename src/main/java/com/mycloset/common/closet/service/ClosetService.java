package com.mycloset.common.closet.service;

import java.util.List;

import com.mycloset.common.closet.entity.Closet;

public interface ClosetService {
    List<Closet> findAll();
    Closet findById(String id);
    void save();
}
