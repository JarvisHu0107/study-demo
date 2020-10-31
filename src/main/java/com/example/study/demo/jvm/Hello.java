package com.example.study.demo.jvm;

public class Hello {
    public void m() {
        System.out.println("Hello JVM!");
    }

    public static void main(String[] args) {

        String str1 = new String("123") + new String("456");
        //String str1 = new String("123456");
        str1.intern();
        String str2 = "123456";
        System.out.println(str1 == str2);

    }

}


