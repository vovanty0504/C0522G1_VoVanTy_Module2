package ss00_thuat_toan.execise.controller;

import ss00_thuat_toan.execise.service.IPersonService;
import ss00_thuat_toan.execise.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IPersonService iPersonService = new StudentService();

    public void menuStudent() {
        do {
            System.out.println("1. Thêm mới học sinh \n" +
                    "2. Xóa học sinh \n" +
                    "3. Xem danh sách học sinh \n" +
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
