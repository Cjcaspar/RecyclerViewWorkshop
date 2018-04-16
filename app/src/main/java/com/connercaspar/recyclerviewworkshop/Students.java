package com.connercaspar.recyclerviewworkshop;

/**
 * Created by connercaspar on 4/16/18.
 */

public class Students {

    private String name;
    private String phoneType;
    private String summary;
    private int age;

    public Students(String name, String phoneType, String summary, int age) {
        this.name = name;
        this.phoneType = phoneType;
        this.summary = summary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
