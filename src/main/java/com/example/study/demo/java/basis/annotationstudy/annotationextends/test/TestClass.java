package com.example.study.demo.java.basis.annotationstudy.annotationextends.test;

import com.example.study.demo.java.basis.annotationstudy.annotationextends.MyClassAnnotation;
import com.example.study.demo.java.basis.annotationstudy.annotationextends.MyMethodAnnotation;

/**
 * @author huxin
 * @Description
 * @create 2020-08-18 9:56 下午
 */
public class TestClass {

    public static void main(String[] args) throws NoSuchMethodException {
        //实现接口
        /**
         * MyClassAnnotation 注解上加不加@Inherited 都是false
         */
        System.out.println(null != Son.class.getAnnotation(MyClassAnnotation.class));
        System.out.println(null != Son.class.getMethod("testAnnotation").getAnnotation(MyMethodAnnotation.class));
        System.out.println(null != Son.class.getMethod("abstractTestAnnotation").getAnnotation(MyMethodAnnotation.class));
        /**
         * 注解上加不加@Inherited  都是true
         */
        System.out.println(null != Son.class.getMethod("interfaceMethod").getAnnotation(MyMethodAnnotation.class));


        //继承抽象类
        /**
         * MyClassAnnotation 加上@Inherited = true.不加 = false
         */
        System.out.println(null != Sun.class.getAnnotation(MyClassAnnotation.class));
        System.out.println(null != Sun.class.getMethod("testAnnotation").getAnnotation(MyMethodAnnotation.class));
        System.out.println(null != Sun.class.getMethod("abstractTestAnnotation").getAnnotation(MyMethodAnnotation.class));
        /**
         * 注解上加不加@Inherited  都是true
         */
        System.out.println(null != Sun.class.getMethod("interfaceMethod").getAnnotation(MyMethodAnnotation.class));
    }

    /**
     * 父类的方法上有注解，不管此注解有没有@Inherited 只要没有被子类覆盖，一定继承了了注解。
     * 如果方法被子类覆盖了，不管此注解有没有@Inherited，一定继承不到注解
     */
    /**
     * 子类实现了父类的抽象方法，方法上的注解无法继承
     */

    /**
     * 特例  Feign的接口和Controller之间的继承。@RestController  @RequestMapping
     * mvc层面的源码中只要这个类（beanType）有controller注解 或 requestMapping注解就是一个handler，就有请求映射url和处理类的关系
     */
}
