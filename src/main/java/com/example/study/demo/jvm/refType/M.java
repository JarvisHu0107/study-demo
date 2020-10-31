package com.example.study.demo.jvm.refType;

import java.lang.ref.SoftReference;

/**
 * @author huxin
 * @Description
 * @create 2020-10-06 1:30 下午
 */
public class M {
    public static void main(String[] args) {
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024*1024*10]);
        System.out.println(m.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.get());
    }
}
