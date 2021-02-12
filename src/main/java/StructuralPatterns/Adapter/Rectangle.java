package StructuralPatterns.Adapter;

/**
 * @program: DesignPattern
 * @description: shape
 * @author: chenlonghzen
 * @create: 2021-02-12 21:26
 **/
public class Rectangle implements IShape{

    private IColor color;

    void setColor(IColor color){
        this.color = color;
    }

    public void draw() {
        System.out.println("draw "+ color.getColor() + " rectangle");
    }
}
