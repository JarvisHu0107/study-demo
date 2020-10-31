package com.example.study.demo.jvm;

public class T011_ClassReloading1 {
    public static void main(String[] args) throws Exception {
        T006_MSBClassLoader msbClassLoader = new T006_MSBClassLoader();
        Class clazz = msbClassLoader.loadClass("com.example.study.demo.jvm.Hello");
        System.out.println(msbClassLoader.hashCode());
        //msbClassLoader = null;
        System.out.println(clazz.hashCode());

//        msbClassLoader = null;
//
        msbClassLoader = new T006_MSBClassLoader();


        System.out.println(msbClassLoader.hashCode());
        Class clazz1 = msbClassLoader.loadClass("com.example.study.demo.jvm.Hello");
        System.out.println(clazz1.hashCode());

        System.out.println(clazz == clazz1);
    }
}
