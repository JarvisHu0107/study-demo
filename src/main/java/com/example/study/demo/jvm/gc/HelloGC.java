package com.example.study.demo.jvm.gc;

import java.util.LinkedList;
import java.util.List;

/**
 * @author huxin
 * @Description
 * @create 2020-10-11 9:15 下午
 */
public class HelloGC {
    public static void main(String[] args) {
        System.out.println("HelloGC!");
        List list = new LinkedList();
        for(;;) {
            byte[] b = new byte[256];
            list.add(b);
        }

    }

}
