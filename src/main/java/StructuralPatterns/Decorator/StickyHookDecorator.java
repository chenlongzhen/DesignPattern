package StructuralPatterns.Decorator;

/**
 * @program: DesignPattern
 * @description: 粘勾装饰
 * @author: chenlonghzen
 * @create: 2021-02-12 21:58
 **/
public class StickyHookDecorator implements IstickyHouse{

    private final IHouse house;

    public StickyHookDecorator(IHouse house) {
        this.house = house;
    }

    public void live() {
        house.live();
    }

    public void hangThings() {
        System.out.println("有了粘钩后，新增了挂东西功能");
    }

}
