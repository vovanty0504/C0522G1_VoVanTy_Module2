package ss00_thuat_toan.execise.controller;

import ss00_thuat_toan.execise.service.IPersonService;
import ss00_thuat_toan.execise.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService iPersonService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
                    "4. Tìm kiếm học sinh theo ID\n" +
                    "5. Tìm kiếm học sinh theo tên\n" +
                    "6. Sắp xếp học sinh theo tên\n" +
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
