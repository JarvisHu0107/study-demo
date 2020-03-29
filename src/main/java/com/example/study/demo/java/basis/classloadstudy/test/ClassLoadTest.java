package com.example.study.demo.java.basis.classloadstudy.test;



import com.example.study.demo.java.basis.classloadstudy.Singleton4ClassLoad;
import com.example.study.demo.java.basis.classloadstudy.bean.Son;


public class ClassLoadTest {

    public static void main(String[] args) {


//        Son son = new Son();
//        son.eat();

        Singleton4ClassLoad singleton4ClassLoad = Singleton4ClassLoad.getSignleton();
        System.out.println(singleton4ClassLoad.counter1);
        System.out.println(singleton4ClassLoad.counter2);
    }
}
