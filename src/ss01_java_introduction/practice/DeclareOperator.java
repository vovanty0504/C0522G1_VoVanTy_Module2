package ss01_java_introduction.practice;

import java.util.Scanner;

public class DeclareOperator {
    public static void main(String[] args) {
            float width;
            float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = scanner.nextFloat();

        System.out.println("enter height");
        height= scanner.nextFloat();

        float are = width * height;
        System.out.println("are is: " +are);
    }
}
