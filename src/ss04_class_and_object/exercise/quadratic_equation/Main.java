package ss04_class_and_object.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA;
        do {
            System.out.print("Nhập a: ");
            numberA = scanner.nextDouble();
            if (numberA == 0) {
                System.out.println("nhập lại: ");
            }
        } while (numberA == 0);

        System.out.print("Nhập b: ");
        double numberB = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double numberC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA, numberB, numberC);
        System.out.println(quadraticEquation.display());
        System.out.println(quadraticEquation.viewResult());

    }

}
