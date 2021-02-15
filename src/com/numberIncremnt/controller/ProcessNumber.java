package com.numberIncremnt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numberIncrement.dao.ContentDaoImpl;
/*
 * This the RESTAPI which is used for increment of the the number
 * Just got "localhost:8080/index/numberIncrement" and the increment is done */
@RestController
@RequestMapping("/index")
public class ProcessNumber {

    @Autowired
    private ContentDaoImpl contentDaoImpl;
    
    @RequestMapping(value="/numberIncrement")
    public void numberIncrement(HttpServletRequest request, HttpServletResponse response) {
        contentDaoImpl.setNumber("numberIncrement");
    }
}
