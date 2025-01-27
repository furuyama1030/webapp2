package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Item;
import com.example.demo2.domain.User;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/chat")

public class Ex16Controller {
    @Autowired
    ServletContext application;

    // private List<User> itemList = new ArrayList<>();

    @RequestMapping("")
    public String index() {
        List<User> chatList = (List<User>) application.getAttribute("chattext");
        if (chatList == null) {
            List<User> itemList = new ArrayList<>();
            application.setAttribute("chattext", itemList);
        }
        return "ex-16";
    }
    @Autowired
    @RequestMapping("/post")
    public String post(String name,String comment) {
        List<User> chatLog = (List<User>) application.getAttribute("chattext");

        User user =new User(name, comment);
        itemList.add(user);

        application.setAttribute("chattext", itemList);

    }

}
