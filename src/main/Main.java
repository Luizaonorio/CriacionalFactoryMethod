package main;
import Formas.*;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Formas.Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Formas.Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Formas.Square");
        shape3.draw();



    }
}