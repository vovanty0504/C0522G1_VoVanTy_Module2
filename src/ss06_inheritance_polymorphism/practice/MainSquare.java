package ss06_inheritance_polymorphism.practice;

public class MainSquare {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(2.3);
        System.out.println(square2);

        Square square3 = new Square(5.8, "yellow", true);
        System.out.println(square3);
    }
}
