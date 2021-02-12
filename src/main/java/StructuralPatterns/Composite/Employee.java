package StructuralPatterns.Composite;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-12 21:46
 **/
public class Employee extends  Component{

    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    void check() {
        work();
    }

}
