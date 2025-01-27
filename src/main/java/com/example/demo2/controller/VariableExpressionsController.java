package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("/variable-expressions")
public class VariableExpressionsController {

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("name", "伊賀将之");

        Car car = new Car(100, 50, "ベンツ");

        model.addAttribute("car", car);
        return "variable-expressions";

    }
}