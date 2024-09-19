interface Shape1 {
    String getColor();
    void draw();


    default void describe() {
        System.out.println("This is a shape with color " + getColor());
    }
}


class Circle1 implements Shape1 {
    private double radius;
    private String color;

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String getColor() {
        return color;
    }


    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " and color " + color);
    }


    public void describe() {
        System.out.println("This is a shape with color " + getColor());
    }
}


class Rectangle1 implements Shape1 {
    private double length;
    private double width;
    private String color;

    public Rectangle1(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + ", width " + width + " and color " + color);
    }


    public void describe() {
        System.out.println("This is a shape with color " + getColor());
    }
}

// Implement Sign class
class Sign {
    private Shape1 shape;
    private String text;

    public Sign(Shape1 shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public Shape1 getShape() {
        return shape;
    }

    public void setShape(Shape1 shape) {
        this.shape = shape;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("Sign Text: " + text);
        shape.draw();
        shape.describe();
    }
}

public class Practical_23 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(5.0, "Red");
        Rectangle1 rectangle = new Rectangle1(10.0, 4.0, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Event!");
        Sign rectangleSign = new Sign(rectangle, "Campus Center Open!");

        circleSign.display();
        System.out.println();
        rectangleSign.display();
    }
}