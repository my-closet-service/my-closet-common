package com.mycloset.common.closet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycloset.common.closet.entity.Closet;
import com.mycloset.common.closet.service.ClosetService;
import com.mycloset.common.util.ApiUtils;

@RestController
@RequestMapping("/test")
public class ClosetController {
    @Autowired
    private ClosetService closetService;

    @RequestMapping(method= RequestMethod.GET)
    public ApiUtils.ApiResult<?> findAll() {
        return ApiUtils.success(closetService.findAll());
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public Closet findById(@PathVariable("id")String id) {
        return closetService.findById(id);
    }
    
    @RequestMapping(value="/save", method= RequestMethod.GET)
    public void save() {
    	 closetService.save();
    }
}
