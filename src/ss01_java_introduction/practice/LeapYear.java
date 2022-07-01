package ss01_java_introduction.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("nhập năm: ");
        year = scanner.nextInt();
        if(year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            System.out.printf("%d Là năm nhuận", year);
        }else {
            System.out.printf("%d là năm không nhuận", year);
        }

    }
}
