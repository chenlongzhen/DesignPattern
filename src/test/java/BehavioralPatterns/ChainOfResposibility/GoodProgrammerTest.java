package BehavioralPatterns.ChainOfResposibility;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodProgrammerTest {
    @Test
    public void test() {
        NormalProgrammer normal = new NormalProgrammer();
        GoodProgrammer good = new GoodProgrammer();

        Bug middle = new Bug(50);
        Bug hard = new Bug(100);

        // 组成责任链
        normal.setNext(good);

        // 从菜鸟程序员开始，沿着责任链传递
        normal.handle(middle);
        normal.handle(hard);
    }

}