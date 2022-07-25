package casestudy.execise1.controller;

import casestudy.execise1.modle.Employee;
import casestudy.execise1.service.IEmployeeService;
import casestudy.execise1.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagerController {
    private static  Scanner scanner = new Scanner(System.in);
    IEmployeeService employee =  new EmployeeService();

    public void employeeManager() {
        do {
            System.out.println("1. Danh sách hiển thị nhân viên\n" +
                    "2. Thêm nhân viên mới\n" +
                    "3. Chỉnh sửa nhân viên\n" +
                    "4. Quay lại menu chính");
            System.out.println("Mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employee.display();
                    break;
                case 2:
                    employee.add();
                    break;
                case 3:
                    employee.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }
        } while (true);
    }
}
