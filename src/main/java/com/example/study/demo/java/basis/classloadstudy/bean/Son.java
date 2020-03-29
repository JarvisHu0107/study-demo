package com.example.study.demo.java.basis.classloadstudy.bean;



public class Son extends Father {

    @Override
    public void say() {
        System.out.println("son say");
    }


    public void eat(){
        System.out.println("son eat");
    }
}
