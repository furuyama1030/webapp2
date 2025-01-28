package com.example.demo2.form;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17QuestionnaireForm {
    @NotBlank(message="値を入力してください")
    @Size(min=1,max=127,message="Eメールは1桁以上127桁以内で記載してください")
    private String name;
    @Size(min=1,max=127,message="Eメールは1桁以上127桁以内で記載してください")
    private String mail;
    @NotBlank(message="値を入力してください")
    private String gender;
    @NotEmpty(message="値を入力してください")
    private List<Integer>hobbyList;
    private List<Integer>langList;
    @Size(min=1,max=2000,message="Eメールは1桁以上2000桁以内で記載してください")
    private String othertext;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<Integer> getLangList() {
        return langList;
    }
    public void setLangList(List<Integer> langList) {
        this.langList = langList;
    }
    public String getOthertext() {
        return othertext;
    }
    public void setOthertext(String othertext) {
        this.othertext = othertext;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Ex17QuestionnaireForm [name=" + name + ", mail=" + mail + ", gender=" + gender + ", hobbyList="
                + hobbyList + ", langList=" + langList + ", othertext=" + othertext + "]";
    }
}
