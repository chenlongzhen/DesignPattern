package CreationalPatterns.Singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-12 09:48
 **/
public class SingletonB2 {
// 静态内部类方式实现的懒加载，jvm保证线程安全
    private static class SingletonHolder {
        public static SingletonB2 instance = new SingletonB2();
    }

    private SingletonB2() {
    }

    public static SingletonB2 getInstance() {
        return SingletonHolder.instance;
    }
}


/**
 * 著名的软件大师 Martin 在《代码整洁之道》一书中也说到：不提倡使用懒加载方式，因为程序应该将构建与使用分离，达到解耦。饿汉式在声明时直接初始化变量的方式也更直观易懂。所以在使用饿汉式还是懒汉式时，需要权衡利弊。
 */

