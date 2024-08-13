package week06;

import week06.shape.*;

public class ShapeDemo {
    public static void main(String[] args) {
        // Test Circle
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Original Radius: " + circle.getRadius());
        circle.resize(2.0);
        System.out.println("Resized Radius: " + circle.getRadius());
        System.out.println();

        // Test Rectangle
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Original Length: " + rectangle.getLength());
        System.out.println("Original Width: " + rectangle.getWidth());
        rectangle.resize(1.5);
        System.out.println("Resized Length: " + rectangle.getLength());
        System.out.println("Resized Width: " + rectangle.getWidth());
        System.out.println();

        // Test Square
        Square square = new Square(4.0);
        System.out.println("Square:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Original Side Length: " + square.getSide());
        square.resize(0.5);
        System.out.println("Resized Side Length: " + square.getSide());

    }

}
