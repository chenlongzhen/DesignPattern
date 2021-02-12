package Factory;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-12 09:39
 **/
public class User {
    public int eat(){
        IFactory factory = new AppleFactory();
        Fruit fruit = factory.create();
        fruit.eat();
        return 1;
    }
}
