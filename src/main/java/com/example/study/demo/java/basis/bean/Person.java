package com.example.study.demo.java.basis.bean;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;
    private String telNo;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String telNo, String address) {
        this.name = name;
        this.age = age;
        this.telNo = telNo;
        this.address = address;
    }


}
