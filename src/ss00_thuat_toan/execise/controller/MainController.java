package ss00_thuat_toan.execise.controller;


import java.util.Scanner;

public class MainController {
    public static void menuDisplay() {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        do {
            System.out.println("Chào mừng bạn đến với Codegym. \n" +
                    "1. Quản lí sinh viên.\n" +
                    "2. Quản lí giảng viên \n" +
                    "4. Thoát chương trình \n");

            System.out.print("Mời bạn nhập lựa chọn: \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);

            }
        } while (true);
    }


}
