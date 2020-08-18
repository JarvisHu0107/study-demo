package com.example.study.demo.java.basis.annotationstudy.annotationextends;

import java.lang.annotation.*;

/**
 * @author huxin
 * @Description
 * @create 2020-08-18 9:52 下午
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyMethodAnnotation {
}
