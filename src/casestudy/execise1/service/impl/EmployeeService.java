package casestudy.execise1.service.impl;

import casestudy.execise1.modle.Employee;
import casestudy.execise1.service.IEmployeeService;
import ss00_mvc_haitt.exception.DuplicateIDException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1, "Vo Van Ty", "05/04/2001", "nam", 12345, 9999, "VanTy", "Đại học", "sếp", 100));
        employeeList.add(new Employee(2, "Le Dai Loi", "1/1/1997", "nam", 123456, 8888, "DaiLoi", "Đại học", "Quản lí", 50));
        employeeList.add(new Employee(3, "Huynh Trung Thuyen", "20/04/1993", "nam", 1234567, 7777, "TrungThuyen", "Đại học", "Quản lí", 50));
        employeeList.add(new Employee(4, "Thuy Tien", "05/04/2001", "nu", 12345678, 6666, "ThuyTien", "Đại học", "Nhân viên", 20));
    }


    @Override
    public void edit() {

        int idCard;

        boolean isExit = false;
        while (true) {
            try {
                System.out.print("Số chứng minh nhân dân: ");
                idCard = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
        for (Employee employee : employeeList) {
            if (employee.getIdCard() == idCard) {
                System.out.println("vui lòng nhập lại để cập nhập thông tin!");


                System.out.print("Nhập họ và tên: ");
                employee.setName(scanner.nextLine());

                System.out.print("nhập ngày sinh: ");
                employee.setDateOfBirth(scanner.nextLine());

                System.out.print("nhập giới tính: ");
                employee.setGender(scanner.nextLine());

                int idCard1;
                while (true) {
                    try {
                        System.out.print("nhập chứng minh nhân dân: ");
                        idCard1 = Integer.parseInt(scanner.nextLine());

                        for (Employee employee1 : employeeList) {
                            if (employee1.getIdCard() == idCard1) {
                                throw new DuplicateIDException("Trùng CMND, vui lòng nhập ID lại!");
                            }
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số!");
                    } catch (DuplicateIDException e) {
                        System.out.println(e.getMessage());
                    }

                }
                employee.setIdCard(idCard1);

                int phone;
                while (true) {
                    try {
                        System.out.print("nhập số điện thoại: ");
                        phone = Integer.parseInt(scanner.nextLine());
                        for (Employee employee1 : employeeList) {
                            if (employee1.getPhone() == phone) {
                                throw new DuplicateIDException("Trùng số điện thoại, vui lòng nhập ID lại!");
                            }
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập số!");
                    } catch (DuplicateIDException e) {
                        System.out.println(e.getMessage());
                    }
                }

                String email;
                while (true) {
                    try {
                        System.out.print("vui lòng nhập email: ");
                        email = scanner.nextLine();
                        for (Employee employee1 : employeeList) {
                            if (employee1.getEmail().equals(email)) {
                                throw new DuplicateIDException("Trùng email, vui lòng nhập ID lại!");
                            }
                        }
                        break;
                    } catch (DuplicateIDException e) {
                        System.out.println(e.getMessage());
                    }
                }
                employee.setEmail(email);

                System.out.print("trình độ học vấn: ");
                employee.setLevel(scanner.nextLine());

                System.out.print("vị trí: ");
                employee.setPosition(scanner.nextLine());

                while (true) {
                    try {
                        System.out.print("nhập lương: ");
                        employee.setWage(Double.parseDouble(scanner.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("bạn đã nhập sai! Vui lòng nhập số! ");
                    }
                }
                isExit = true;
                System.out.println("cập nhập thành công!");
                break;
            }
        }
        if (!isExit) {
            System.out.println("không tìm thấy id: ");
        }
    }

    @Override
    public void add() {
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("thêm mới thành công! ");
    }

    public void display() {

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static Employee infoEmployee() {
        int id;
        while (true) {
            try {


                System.out.print("nhập mã số:");
                id = Integer.parseInt(scanner.nextLine());

                for (Employee employee : employeeList) {
                    if (employee.getId() == id) {
                        throw new DuplicateIDException("Trùng ID, vui lòng nhập ID lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");

            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();

        System.out.print("nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();

        System.out.print("nhập giới tính ");
        String gender = scanner.nextLine();

        int idCard;
        while (true) {
            try {
                System.out.print("nhập chứng minh nhân dân");
                idCard = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getIdCard() == idCard) {
                        throw new DuplicateIDException("Trùng CMND, vui lòng nhập ID lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        int phone;
        while (true) {
            try {
                System.out.print("nhập số điện thoại");
                phone = Integer.parseInt(scanner.nextLine());
                for (Employee employee : employeeList) {
                    if (employee.getPhone() == phone) {
                        throw new DuplicateIDException("Trùng Số điện thoại, vui lòng nhập ID lại!");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }
        String email;

        while (true) {
            try {
                System.out.print("vui lòng nhập email: ");
                email = scanner.nextLine();
                for (Employee employee : employeeList) {
                    if (employee.getEmail().equals(email)) {
                        throw new DuplicateIDException("Trùng email, vui lòng nhập ID lại!");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("trình độ học vấn");
        String level = scanner.nextLine();

        System.out.print("vị trí");
        String position = scanner.nextLine();

        double wage;
        while (true) {
            try {
                System.out.print("nhập lương: ");
                wage = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai! Vui lòng nhập số! ");
            }
        }
        return new Employee(id, name, dateOfBirth, gender, idCard, phone, email, level, position, wage);
    }
}

