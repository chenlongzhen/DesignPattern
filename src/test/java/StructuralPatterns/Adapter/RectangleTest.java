package StructuralPatterns.Adapter;

import org.junit.Test;

public class RectangleTest {

    @Test
    public void setColor() {
    }

    @Test
    public void draw() {

        IColor color = new Red();

        Rectangle rectangle = new Rectangle();
        rectangle.setColor(color);
        rectangle.draw();
    }
}