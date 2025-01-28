package com.example.demo2.domain;

import java.util.List;

public class Questionnaire {

    private String name;
    private String mail;
    private String gender;
    private List<String>hobbyList;
    private List<String>langList;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<String> getLangList() {
        return langList;
    }
    public void setLangList(List<String> langList) {
        this.langList = langList;
    }
    public String getOthertext() {
        return othertext;
    }
    public void setOthertext(String othertext) {
        this.othertext = othertext;
    }
    @Override
    public String toString() {
        return "Questionnaire [name=" + name + ", mail=" + mail + ", gender=" + gender + ", hobbyList=" + hobbyList
                + ", langList=" + langList + ", othertext=" + othertext + "]";
    }

    
    
}
