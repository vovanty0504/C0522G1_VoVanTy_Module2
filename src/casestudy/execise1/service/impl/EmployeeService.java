package casestudy.execise1.service.impl;

import casestudy.execise1.exception.IdFormatException;
import casestudy.execise1.modle.Employee;
import casestudy.execise1.service.IEmployeeService;
import casestudy.execise1.utils.FileEmployee;
import casestudy.execise1.utils.MenuUtils;
import casestudy.execise1.utils.RegexUtil;
import ss00_mvc_haitt.exception.DuplicateIDException;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/casestudy/execise1/data/employee.csv";

    @Override
    public void edit() {
        List<Employee> employeeList = FileEmployee.readEmployeeFile(PATH);
        System.out.print("\nNhập mã số nhân viên cần chỉnh sửa: ");
        String idEdit = SCANNER.nextLine();
        boolean isExist = false;

        for (Employee employee : employeeList) {
            if (idEdit.equals(employee.getId())) {
                System.out.println("Nhân viên muốn chỉnh sửa: ");
                System.out.println(employee);
                System.out.println("Bạn có chắc muốn chỉnh sửa hay không?\n" +
                        " 1. Nhấn phím '1' nếu là CÓ.\n" +
                        " 2. Nhấn phím khác nếu là KHÔNG.");
                String chooseYesNo = SCANNER.nextLine();

                if (chooseYesNo.equals("1")) {
                    do {
                        System.out.println("Chỉnh sửa thông tin nhân viên:\n" +
                                "1. Chỉnh sửa tên.\n" +
                                "2. Chỉnh sửa ngày sinh.\n" +
                                "3. Chỉnh sửa giới tính.\n" +
                                "4. Chỉnh sửa số CMND.\n" +
                                "5. Chỉnh sửa số điện thoại.\n" +
                                "6. Chỉnh sửa email.\n" +
                                "7. Chỉnh sửa trình độ.\n" +
                                "8. Chỉnh sửa vị trí.\n" +
                                "9. Chỉnh sửa lương.\n" +
                                "10. Kết thúc chỉnh sửa.");
                        int choose = 0;
                        try {
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choose = Integer.parseInt(SCANNER.nextLine());
                        } catch (NumberFormatException e) {
                            e.getStackTrace();
                        }

                        switch (choose) {
                            case 1:
                                System.out.print("Nhập tên nhân viên: ");
                                employee.setId(RegexUtil.getUpperCase());
                                break;
                            case 2:
                                System.out.print("Nhập ngày sinh nhân viên: ");
                                employee.setDateOfBirth(RegexUtil.getDateFormat());
                                break;
                            case 3:
                                employee.setGender(SCANNER.nextLine());
                                break;
                            case 4:
                                System.out.print("Nhập số CMND/CCCD nhân viên: ");
                                employee.setIdCard(RegexUtil.getIdCard());
                                break;
                            case 5:
                                System.out.print("Nhập số điện thoại nhân viên: ");
                                employee.setPhone(RegexUtil.getPhone());
                                break;
                            case 6:
                                System.out.print("Nhập email nhân viên: ");
                                employee.setEmail(RegexUtil.getEmail());
                                break;
                            case 7:
                                employee.setLevel(MenuUtils.lever());
                                break;
                            case 8:
                                employee.setPosition(MenuUtils.position());
                                break;
                            case 9:
                                System.out.print("Nhập lương nhân viên (VNĐ): ");
                                employee.setWage(RegexUtil.getNumberGreaterThan0());
                                break;
                            case 10:
                                FileEmployee.writeEmployeeFile(PATH, employeeList);
                                System.out.println("Chỉnh sửa thành công!");
                                return;
                            default:
                                System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
                        }
                    } while (true);
                }
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }


    @Override
    public void add() {
        List<Employee> employeeList = FileEmployee.readEmployeeFile(PATH);
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("thêm mới thành công! ");
        FileEmployee.writeEmployeeFile(PATH, employeeList);
    }

    public void display() {
        List<Employee> employeeList = FileEmployee.readEmployeeFile(PATH);
        for (Employee employee1 : employeeList)
            System.out.println(employee1);
    }

    @Override
    public void find() {
        List<Employee> employeeList = FileEmployee.readEmployeeFile(PATH);
        boolean isExit = false;
        System.out.println("nhập mã nhân viên cần tìm");
        String find = SCANNER.nextLine();

        for (Employee employee : employeeList) {
            if (employee.getId().contains(find)) {
                System.out.println(employee);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void remove() {
        List<Employee> employeeList = FileEmployee.readEmployeeFile(PATH);
        boolean isExit = false;
        System.out.println("Mời bạn nhập mã nhân viêncần xóa");
        String id = SCANNER.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                System.out.println("Nhân viên bạn muốn xóa");
                System.out.println(employee);
                System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                        "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                        "2. Nhấn phím khác nếu chọn KHÔNG.");
                String choose = SCANNER.nextLine();
                if (choose.equals("1")) {
                    employeeList.remove(employee);
                    FileEmployee.writeEmployeeFile(PATH, employeeList);
                    System.out.println("xóa thành công");
                }
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy");
        }
    }

    public static Employee infoEmployee() {
        List<Employee> employeeList = FileEmployee.readEmployeeFile(PATH);
        System.out.print("\nNhập mã số nhân viên: ");
        String id;
        while (true) {
            try {
                id = SCANNER.nextLine();
                if (!id.matches("^E\\d{4}$")) {
                    throw new IdFormatException("Mã nhân viên phải đúng định dạng: EXXXX, với XXXX là các số từ 0-9!");
                }

                for (Employee employee : employeeList) {
                    if (id.equals(employee.getId())) {
                        throw new DuplicateIDException("Mã nhân viên đã tồn tại, vui lòng nhập lại!");
                    }
                }
                break;
            } catch (IdFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Nhập tên nhân viên");
        String name = RegexUtil.getUpperCase();


        System.out.print("Nhập ngày sinh nhân viên: ");
        String dateOfBirth = RegexUtil.getAge();

        System.out.print("nhập giới tính ");
        String gender = SCANNER.nextLine();

        System.out.print("Nhập số CMND/CCCD nhân viên: ");
        String idCard = RegexUtil.getIdCard();

        System.out.print("Nhập số điện thoại nhân viên: ");
        String phone = RegexUtil.getPhone();

        System.out.print("Nhập email nhân viên: ");
        String email = RegexUtil.getEmail();


        String level = MenuUtils.lever();

        System.out.print("Nhập lương nhân viên (VNĐ/tháng): ");
        String position = MenuUtils.position();

        double wage;
        while (true) {
            try {
                System.out.print("nhập lương: ");
                wage = Double.parseDouble(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai! Vui lòng nhập số! ");
            }
        }
        return new Employee(id, name, dateOfBirth, gender, idCard, phone, email, level, position, wage);
    }
}

