package com.example.study.demo.java.basis.annotationstudy.annotationextends;

/**
 * @author huxin
 * @Description
 * @create 2020-08-18 9:55 下午
 */
@MyClassAnnotation
public abstract class AbstractClass {

    @MyMethodAnnotation
    public void testAnnotation() {
        System.out.println("123");
    }

    @MyMethodAnnotation
    public abstract void abstractTestAnnotation();

    @MyMethodAnnotation
    public void interfaceMethod(){
        System.out.println("22121");
    }
}
