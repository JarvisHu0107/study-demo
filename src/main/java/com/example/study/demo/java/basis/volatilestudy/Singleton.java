package com.example.study.demo.java.basis.volatilestudy;


/**在《java并发编程实践》一书建议用静态内部类单例模式来替代DCL。
 *
 * 单例模式例子： 双重检验锁DCL
 *
 *
 * 双检查锁模式为什么会出现空指针异常：
 *
 *      instance = new Singleton(); 分解为3个cpu指令并进行重排序后
 *
 *      * memory = allocate();    //1：分配对象的内存空间
 *      * instance = memory;     //3：instance指向刚分配的内存地址，此时对象还未初始化
 *      * ctorInstance(memory);  //2：初始化对象
 *      A线程获得了锁 走到1.分配对象的内存空间 2.在instance指向刚分配的内存地址  未执行3.初始化对象时
 *      B线程执行instance == null ---->false   B线程返回了这个单例实例，但是实际他这个对象还未初始化
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class Singleton {
    private volatile static Singleton instance = null;  //正确
    //private static Singleton instance = null;  //错误。不加volatile 多线程并发下会出现空指针异常

    private Singleton() { }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
