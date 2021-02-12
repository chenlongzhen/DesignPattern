package StructuralPatterns.Decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class StickyHookDecoratorTest {

    @Test
    public void show() {
        IHouse house = new House();
        house.live();

        IstickyHouse stickyHookHouse = new StickyHookDecorator(house);
        stickyHookHouse.live();
        stickyHookHouse.hangThings();
    }

}