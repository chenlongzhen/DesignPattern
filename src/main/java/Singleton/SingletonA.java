package Singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-12 09:48
 **/
public class SingletonA {

//    初始化是就被调用
    private static SingletonA instanse = new SingletonA();

    private SingletonA(){

    }

    public static SingletonA getInstance(){
        return instanse;
    }
}

/**
 * 饿汉式有一个弊端，那就是即使这个单例不需要使用，
 * 它也会在类加载之后立即创建出来，
 * 占用一块内存，并增加类初始化时间。
 */
