package com.example.study.demo.java.basis.finalstudy;

import com.example.study.demo.java.basis.bean.Person;
import lombok.Data;

/**
 * final可以修饰    成员变量  方法   类   本地变量（方法内的局部变量）
 *
 * 成员变量:
 * final变量 int String... etc  不可以被改变数值
 * final对象 引用不可以被改变，但是可以改变对象内的属性值
 *
 *
 *
 * final域，编译器和处理器要遵守两个重排序规则：

 *  final 写：“构造函数内对一个final域的写入”，与“随后把这个被构造对象的引用赋值给一个引用变量”，这两个操作之间不能重排序。
 *
 *  final 读：“初次读一个包含final域的对象的引用”，与“随后初次读对象的final域”，这两个操作之间不能重排序。
 *

 *
 *
 * 参考：https://juejin.im/post/5b8821b5e51d4538a108c969
 *      https://blog.csdn.net/riemann_/article/details/96390511
 */
@Data
public class FinalDemo {
    /**
     * 类常量final + static 必须也只能在此处声明并初始化 否则报错
     */
    public final  static int a = 11 ;

    /**
     * final 修饰的类成员变量（没有static）  1.要么在此初始化     2.要么在构造器中初始化
     */
    public final String b ;

    /**
     * 类常量
     */
    public final static  Person p1 = new Person();

    public final Person p2;

    public FinalDemo(String b,Person p2) {
        this.b = b;
        this.p2 = p2;
    }



}
