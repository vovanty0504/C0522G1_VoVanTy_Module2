package casestudy.execise1;

import java.util.Scanner;

public class DisplayMainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int number1 = 0;

        do {
            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.println("input: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("1Display list employees\n" +
                            "2Add new employee\n" +
                            "3Edit employee\n" +
                            "4Return main menu");
                    System.out.println("input1: ");
                    number1 = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu");
                    number1 = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("1Display list facility\n" +
                            "2Add new facility\n" +
                            "3Display list facility maintenance\n" +
                            "4Return main menu");
                    number1 = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "Return main menu");
                    number1 = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu");
                    number1 = scanner.nextInt();
                    break;
                default:
                    System.out.println("cảm ơn quý khách");

            }

        } while (number1 == 4 || number1 == 6 || number1 == 3 && number != 6);
    }
}
