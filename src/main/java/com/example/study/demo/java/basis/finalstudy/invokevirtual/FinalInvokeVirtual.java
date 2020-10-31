package com.example.study.demo.java.basis.finalstudy.invokevirtual;

/** 解释一下为什么 final和private 都可以静态判定调用目标。
 * 为什么是final解释为invokeVirtual 而不是 invokeSpecial(private) ?
 * @author huxin
 * @Description
 * @create 2020-10-31 12:33 下午
 */

class Base {
    public void foo() { System.out.println("Base"); }

    public void publicMethod(){
        System.out.println("Base-publicMethod");
    }

    private void privateMethod(){
        System.out.println("Base-privateMethod");
    }
}

class Derived extends Base {

    @Override
    public void publicMethod() {
        System.out.println("Derived-publicMethod");
    }

    @Override
    public final void foo() { System.out.println("Derived"); }

}


class DerivedTwo extends Derived {

    //只能重写publicMethod,不能重写foo

}

public class FinalInvokeVirtual {

    public static void main(String[] args) {
        Base b = new Base();
        b.foo();
        b.publicMethod();
        /**
         * 或许是出于一致的考虑。
         * 上述方法都会翻译为invokeVirtual，但是一个可以静态判断调用目标，一个只能动态判断调用目标
         *
         * 而且
         * 这一致性也带来了更好的二进制兼容性 —— 如果上例中FinalInvokeVirtual与Derived分离编译，
         * 🌟在FinalInvokeVirtual编译时b.foo()是final，
         * 🌟而后来Derived去掉了foo()的final并且单独重新编译了的话，
         * 🌟已编译的FinalInvokeVirtual代码仍然可以正确执行——甚至如果Derived进一步有子类覆写了foo()也没问题。
         *
         * 作者：RednaxelaFX
         * 链接：https://www.zhihu.com/question/45131640/answer/98820081
         * 来源：知乎
         * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         * https://www.zhihu.com/question/45131640
         */
    }


}
