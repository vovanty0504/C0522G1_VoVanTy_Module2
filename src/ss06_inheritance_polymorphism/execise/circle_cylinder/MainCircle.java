package ss06_inheritance_polymorphism.execise.circle_cylinder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(10, "black");
        System.out.println(circle2);
    }
}
