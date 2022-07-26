package ss17_string_regex.execise.class_validate;

import java.util.Scanner;

public class ClassValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số điện thoại: ");
            String str = scanner.nextLine();
            if (str.matches("^[\\d]{2}-(0[0-9]{9})$")){
                System.out.println("số điện thoại đúng.");
                break;
            } else {
                System.err.println("số điện thoại sai. vui lòng nhập lại.");
            }
        }while (true);
    }
}
