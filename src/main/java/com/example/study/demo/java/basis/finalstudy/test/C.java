package com.example.study.demo.java.basis.finalstudy.test;

public class C {
    private int a;                        //普通变量
    private final int b;                  //final变量
    private static C finalDemo;

    public C() {      //构造函数
        a = 1;                //写普通域
        b = 2;                //写final域
    }

    public static void writer() {    //写线程A执行
        finalDemo = new C();
    }

    public static void reader() {        //读线程B执行
        if(finalDemo != null){
            C object = finalDemo;    //读对象引用
            int a = object.a;                //读普通域
            int b = object.b;                //读final域
        }

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                C.reader();
            }
        });
        thread.run();
        //Thread.sleep(123);


        writer();
    }

}
