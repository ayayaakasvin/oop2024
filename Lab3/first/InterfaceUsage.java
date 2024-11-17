package Lab3.first;

import java.lang.Math;

interface Shape {
    void printInformation ();
    Double area ();
    Double perimeter ();
}

class Circle implements Shape {
    private Double radius;

    Circle (Double radius) throws IllegalArgumentException {
        if (radius < 0.0) {
            throw new IllegalArgumentException("Radius can not be negative");
        }

        this.radius = radius;
    }

    @Override
    public Double area () {
        return radius * radius * Math.PI;
    }

    @Override
    public Double perimeter () {
        return 2 * radius * Math.PI;
    }

    @Override
    public void printInformation () {
        System.out.printf(
            "Circle`s radius is %f\n\tArea is %f\n\tPerimeter(Circumference) is %f", 
            radius, 
            area(), 
            perimeter()
        );
    }
}

class Square implements Shape {
    private Double side;

    Square(Double side) throws IllegalArgumentException {
        if (side < 0.0) {
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        this.side = side;
    }

    @Override
    public Double area() {
        return side * side;
    }

    @Override
    public Double perimeter() {
        return 4 * side;
    }

    @Override
    public void printInformation() {
        System.out.printf(
            "Square's side length is %f\n\tArea is %f\n\tPerimeter is %f\n",
            side,
            area(),
            perimeter()
        );
    }
}

public class InterfaceUsage {
    public static void main(String[] args) {
        try {
            Shape circle = new Circle(5.0);
            circle.printInformation();

            System.out.println();

            Shape square = new Square(4.0);
            square.printInformation();

            System.out.println();

            Shape invalidCircle = new Circle(-5.0);
            invalidCircle.printInformation();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            Shape invalidSquare = new Square(-3.0);
            invalidSquare.printInformation();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
