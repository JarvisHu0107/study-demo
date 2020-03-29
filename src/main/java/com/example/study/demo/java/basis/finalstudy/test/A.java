package com.example.study.demo.java.basis.finalstudy.test;

public class A {

    //public static int col = col1();

    {//非静态代码块
        System.out.println("none static code block ");
    }



    public static B b = new B();//非静态属性

    static {//静态代码块
        System.out.println("static code block ");
    }


    public A() {
        System.out.println("construct A ");
    }

    public static int col1(){

        System.out.println("静态字段执行");
        return 1;
    }

    public static void staticMethod(){
        System.out.println("静态方法执行");

    }
}
