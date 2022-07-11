package ss07_abstract_class_interface.execise.interface_resizeable;

import ss07_abstract_class_interface.execise.interface_colorable.Circle;

public class circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public void resize(double percent) {
        setRadius(getRadius() + getRadius() * percent / 100);
    }
}
