package ss02_java_loop.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int numberFirst;
        int numberSecond;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập XeTai: ");
        numberFirst = input.nextInt();
        System.out.println("Nhập XeOTo: ");
        numberSecond = input.nextInt();

        numberFirst = Math.abs(numberFirst);
        numberSecond = Math.abs(numberSecond);

        if (numberFirst == 0 || numberSecond ==0){
            System.out.println("Không có ước tố chung lớn nhất");
        }
        while (numberFirst != numberSecond ){
            if (numberFirst >numberSecond){
                numberFirst = numberFirst - numberSecond;

            }else {
                numberSecond = numberSecond - numberFirst;
            }
        }
        System.out.println("ước tố chung lớn nhất: " + numberFirst);
    }
}
