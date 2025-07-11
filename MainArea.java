abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class MainArea {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + String.format("%.2f", circle.area()));

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + String.format("%.2f", rectangle.area()));
    }
}

