package ss05_Acces_static_method_property.execise.access_modfier;

import ss05_Acces_static_method_property.execise.access_modfier.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);

        Circle circle2 = new Circle();
        circle2.setColor("blue");
        circle2.setRadius(5);
        System.out.println("Circle 2: " + circle2);

        Circle circle3 = new Circle(3, "black");
        System.out.println("Circle 3: " + circle3);
    }
}