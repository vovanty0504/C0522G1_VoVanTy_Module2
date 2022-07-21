package ss14_debug_exception.execise.controller;
import ss14_debug_exception.execise.exception.IllegalTriangleException;
import ss14_debug_exception.execise.modle.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstEdge;
        double secondEdge;
        double thirdEdge;
        
        while (true) {
            try {
                System.out.print("nhập cạnh thứ nhất 1: ");
                firstEdge = Double.parseDouble(scanner.nextLine());
                System.out.print("nhập cạnh thứ nhất 2: ");
                secondEdge = Double.parseDouble(scanner.nextLine());
                System.out.print("nhập cạnh thứ nhất 3: ");
                thirdEdge = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(firstEdge, secondEdge, thirdEdge);
                System.out.println(triangle);
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("vui lòng nhập số: \n");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("vui lòng nhập cạnh lớn hơn 0");
            }
        }
    }
}
