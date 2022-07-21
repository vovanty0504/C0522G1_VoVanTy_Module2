package ss00_thuat_toan.execise.controller;


import java.util.Scanner;

public class MainController {
    public static void menuDisplay() {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        int choose;

        do {
            System.out.println("Chào mừng bạn đến với Codegym. \n" +
                    "1. Quản lí sinh viên.\n" +
                    "2. Quản lí giảng viên \n" +
                    "3. Thoát chương trình \n");

            while (true) {
                try {
                    System.out.print("Mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai cú pháp vui lòng nhập số! ");
                }
            }

            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.out.println("Cảm ớn quý khách!");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại! ");

            }
        } while (true);
    }


}
