package com.example.study.demo.java.basis.annotationstudy.annotationextends;

/**
 * @author huxin
 * @Description
 * @create 2020-08-18 9:52 下午
 */
@MyClassAnnotation
public interface Father {

    @MyMethodAnnotation
    void testAnnotation();

    @MyMethodAnnotation
    abstract void abstractTestAnnotation();

    @MyMethodAnnotation
    default void interfaceMethod(){
        System.out.println("22121");
    }

}
