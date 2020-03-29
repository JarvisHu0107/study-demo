package com.example.study.demo.java.basis.finalstudy.test;

import com.example.study.demo.java.basis.bean.Person;
import com.example.study.demo.java.basis.finalstudy.FinalDemo;


public class FinalDemoMainTest {

    public static void main(String[] args) {
         new A();
        /**
         * final修饰的对象是不可以改变引用 ，只能改变对象的属性值
          */
        FinalDemo fd  = new FinalDemo("123",new Person());
       // fd.p2  = new Person();//error
        fd.p2.setAddress("456");
        System.out.println(fd.p2.getAddress());



        //===========================================================
        FinalDemo fd1 = new FinalDemo("123",new Person());
        Person person = new Person();
        person.setAddress("CHINA");
        FinalDemo fd2 = new FinalDemo("456", person);
        System.out.println(fd1.b);
        System.out.println(fd2.b);
        System.out.println(fd1.p2.getAddress());
        System.out.println(fd2.p2.getAddress());
    }

    /**
     * final修饰本地变量
     * 例1
     */
    private static void methodA(){
        /**
         * 如果这里没有初始化赋值，在使用i的时候会报错，提示没有进行初始化
         * 所以final修饰的本地变量一定要初始化
         */
        //==============================错误案例===========================
//       final int i;
//       System.out.println(i);//error

//        final int k;
//        methodB(k);//error
       //=================================================================
        //方案一
        final int i = 2;
        //方案二
        final int j;
        j = 3;
        System.out.println(i+" " + j);



    }

    /**
     * final修饰本地变量
     * 例2
     */
    private static void methodB(final int b){
        //b = 2;//error
        System.out.println("methodB");

    }
}
