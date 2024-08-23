package com.codes.shape;

class Rectangle {
    private int a; // length
    private int b; // width

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getLength() {
        return a;
    }

    public void setLength(int a) {
        this.a = a;
    }

    public int getWidth() {
        return b;
    }

    public void setWidth(int b) {
        this.b = b;
    }

    public float surfaceArea() {
        return a * b;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side); // A square has equal length and width
    }

    @Override
    public float surfaceArea() {
        return getLength() * getLength();
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float surfaceArea() {
        return 3.14f * radius * radius;
    }
}

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float surfaceArea() {
        return 2 * 3.14f * radius * height + 2 * 3.14f * radius * radius;
    }

    public float volume() {
        return 3.14f * radius * radius * height;
    }
}

class Sphere {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float surfaceArea() {
        return 4 * 3.14f * radius * radius;
    }

    public float volume() {
        return (4 / 3.0f) * 3.14f * radius * radius * radius;
    }
}

public class textEditproject{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(7);
        Circle circle = new Circle(4);
        Cylinder cylinder = new Cylinder(3, 10);
        Sphere sphere = new Sphere(6);

        System.out.println("Rectangle Surface Area: " + rectangle.surfaceArea());
        System.out.println("Square Surface Area: " + square.surfaceArea());
        System.out.println("Circle Surface Area: " + circle.surfaceArea());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Sphere Surface Area: " + sphere.surfaceArea());
        System.out.println("Sphere Volume: " + sphere.volume());
    }
}