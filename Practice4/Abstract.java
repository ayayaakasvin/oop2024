package Practice4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JFrame;

enum ColorEnum {
    Red, Green, White
}

abstract class Shape {
    int position;
    ColorEnum color;

    Shape (int pos, ColorEnum color) {
        this.position = pos;
        this.color = color;
    }
    
    abstract void draw(Graphics g);

    protected java.awt.Color colorConvert () {
        switch (this.color) {
            case Red:
                return Color.RED;
            case Green:
                return Color.GREEN;
            default: return Color.WHITE;
        }
    }
}

class Circle extends Shape {
    private int radius;

    Circle (int position, ColorEnum color, int radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(super.colorConvert());
        g.drawOval(position, position,  radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    Rectangle (int position, ColorEnum color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(super.colorConvert());
        g.drawRect(position, position, width, height);
    }
}

class Triangle extends Shape {
    private int base, height;

    Triangle(int position, ColorEnum color, int base, int height) {
        super(position, color);
        this.base = base;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(super.colorConvert());
        int[] xPoints = { position, position + base / 2, position - base / 2 };
        int[] yPoints = { position, position + height, position + height };
        g.drawPolygon(xPoints, yPoints, 3);
    }
}

class ShapeCanvas extends JPanel {
    private Vector<Shape> shapes;

    ShapeCanvas(Vector<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}

class TestShapes {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();

        // Add different shapes to the vector
        shapes.add(new Circle(50, ColorEnum.Red, 30));
        shapes.add(new Rectangle(150, ColorEnum.Green, 100, 50));
        shapes.add(new Triangle(300, ColorEnum.White, 60, 80));

        // Create a JFrame window
        JFrame frame = new JFrame("Shape Drawer");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom JPanel to draw shapes
        ShapeCanvas canvas = new ShapeCanvas(shapes);
        frame.add(canvas);
        frame.setVisible(true); // Make the window visible
    }
}