package com.numberIncremnt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.numberIncrement.dao.ContentDaoImpl;
import com.numberIncrement.entity.Numbers;
/*
 * This Controller is basically for checking purpose that connection with jsp is working right or not
 * */
@Controller
@RequestMapping("/")
public class HomepageController {

    @Autowired
    private ContentDaoImpl contentDaoImpl;
    
    @RequestMapping("/")    
    public String getHomePage(HttpServletRequest request, HttpServletResponse response){
        
        
       Numbers numbers = contentDaoImpl.getNumbers("numberIncrement");
        request.setAttribute("numbers", numbers);
        return "homePage";
    }
}
