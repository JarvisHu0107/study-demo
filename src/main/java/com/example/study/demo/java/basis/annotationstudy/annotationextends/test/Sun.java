package com.example.study.demo.java.basis.annotationstudy.annotationextends.test;

import com.example.study.demo.java.basis.annotationstudy.annotationextends.AbstractClass;

/**
 * @author huxin
 * @Description
 * @create 2020-08-18 9:57 下午
 */
public class Sun extends AbstractClass {
    @Override
    public void testAnnotation() {
        super.testAnnotation();
        System.out.println("456");
    }

    @Override
    public void abstractTestAnnotation() {

    }
}
