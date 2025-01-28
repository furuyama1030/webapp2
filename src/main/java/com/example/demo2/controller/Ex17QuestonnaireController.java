package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.Questionnaire;
import com.example.demo2.form.Ex17QuestionnaireForm;

@Controller
@RequestMapping("/question")
public class Ex17QuestonnaireController {

    @ModelAttribute Ex17QuestionnaireForm setUpForm(){
        return new Ex17QuestionnaireForm();
    }

    @RequestMapping("")
    public String index(Model model) {
        Map<Integer, String> genderMap = new LinkedHashMap<>();
        genderMap.put(1, "男性");
        genderMap.put(2, "女性");

        model.addAttribute("genderMap", genderMap);

        Map<Integer, String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");

        model.addAttribute("hobbyMap", hobbyMap);

        Map<Integer, String> langMap = new LinkedHashMap<>();
        langMap.put(1, "java");
        langMap.put(2, "C");
        langMap.put(3, "PHP");

        model.addAttribute("langMap", langMap);
        return "user/ex17-input";
    }

    @RequestMapping("/create1")
    public String create1(
        @Validated Ex17QuestionnaireForm form
        ,BindingResult result
        ,RedirectAttributes redirectAttributes
        ,Model model
    ){
        if(result.hasErrors()){return index(model);}


        Questionnaire questionnaire = new Questionnaire();
        BeanUtils.copyProperties(form, questionnaire);

        String gender;
        if ("male".equals(form.getGender())) {
            gender = "男性";
        } else if ("female".equals(form.getGender())) {
            gender = "女性";
        } else {
            gender = "不明";
        }
        questionnaire.setGender(gender);

        List<String> hobbyList = new ArrayList<>();
        for (Integer hobbyCode : form.getHobbyList()) {
            switch (hobbyCode) {
                case 1:
                    hobbyList.add("野球");
                    break;
                case 2:
                    hobbyList.add("テニス");
                    break;
                case 3:
                    hobbyList.add("サッカー");
                    break;

            }
        }
        questionnaire.setHobbyList(hobbyList);
        redirectAttributes.addFlashAttribute("questionnaire", questionnaire);

        List<String> langList = new ArrayList<>();
        for (Integer langCode : form.getLangList()) {
            switch (langCode) {
                case 1:
                    langList.add("java");
                    break;
                case 2:
                    langList.add("C");
                    break;
                case 3:
                    langList.add("PHP");

            }
        }
        questionnaire.setLangList(langList);
        redirectAttributes.addFlashAttribute("questionnaire", questionnaire);

        return "redirect:/question/ex17-toresult";
    }

    @RequestMapping("/ex17-toresult")
    public String toresult1() {
        return "user/ex17-result";  
    }
}
