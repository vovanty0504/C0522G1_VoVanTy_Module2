package ss00_thuat_toan.execise.controller;

import ss00_thuat_toan.execise.service.IPersonService;
import ss00_thuat_toan.execise.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    IPersonService iPersonService = new TeacherService();


        public void menuTeacher() {
            do {
                System.out.println("1. Thêm mới giảng viên \n" +
                        "2. Xóa giảng viên \n" +
                        "3. Xem danh sách giảng viên \n" +
                        "4. Quay về menu chính.\n");
                System.out.print("Mời bạn nhập lựa chọn: \n");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        iPersonService.add();
                        break;
                    case 2:
                        iPersonService.remove();
                        break;
                    case 3:
                        iPersonService.display();
                        break;
                    case 4:
                        return;
                }
            } while (true);
        }
    }

