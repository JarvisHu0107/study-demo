package com.example.study.demo.java.basis.annotationstudy.annotationextends;

import java.lang.annotation.*;

/**
 * @author huxin
 * @Description
 * @create 2020-08-18 9:43 下午
 */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyClassAnnotation {
}
