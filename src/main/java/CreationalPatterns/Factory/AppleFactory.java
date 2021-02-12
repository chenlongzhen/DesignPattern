package CreationalPatterns.Factory;

/**
 * @program: DesignPattern
 * @description: 苹果工厂
 * @author: chenlonghzen
 * @create: 2021-02-12 09:24
 **/
public class AppleFactory implements IFactory{

    public Fruit create(){
        return new Apple();
    }

}


