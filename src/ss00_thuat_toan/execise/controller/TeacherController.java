package ss00_thuat_toan.execise.controller;

import ss00_thuat_toan.execise.service.IPersonService;
import ss00_thuat_toan.execise.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static Scanner scanner = new Scanner(System.in);
    private static   IPersonService iPersonService = new TeacherService();


        public void menuTeacher() {
            do {
                System.out.println("1. Thêm mới giảng viên \n" +
                        "2. Xóa giảng viên \n" +
                        "3. Xem danh sách giảng viên \n" +
                        "4. Tìm kiếm theo ID\n" +
                        "5. Tìm kiếm theo tên\n"+
                        "6. Sắp xếp theo tên\n"+
                        "7. Quay về menu chính.\n");
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
                        iPersonService.searchID();
                        break;
                    case 5:
                        iPersonService.searchName();
                        break;
                    case 6:
                        iPersonService.sortName();
                        break;
                    case 7:
                        return;
                }
            } while (true);
        }
    }

