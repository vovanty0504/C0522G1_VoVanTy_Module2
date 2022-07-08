package ss06_inheritance_polymorphism.practice;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3=new Circle(4,"indigo",false);
        System.out.println(circle3);
    }
}
