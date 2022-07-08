package ss06_inheritance_polymorphism.practice;

public class MainShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("blu",false);
        System.out.println(shape1);
    }
}
