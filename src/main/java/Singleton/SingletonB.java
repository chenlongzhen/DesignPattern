package Singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-12 09:48
 **/
public class SingletonB {

    private static SingletonB instanse = null;

    private SingletonB() {

    }

    public static SingletonB getInstance() {
        if (instanse == null) {
            synchronized (SingletonB.class) {
                if (instanse == null) {
                    instanse = new SingletonB();
                }

            }
        }
        return instanse;
    }
}

/**
 * 双检锁的方式，
 * 先声明了一个初始值为 null 的 instance 变量，
 * 当需要使用时判断此变量是否已被初始化，没有初始化的话才 new 一个实例出来
 */
