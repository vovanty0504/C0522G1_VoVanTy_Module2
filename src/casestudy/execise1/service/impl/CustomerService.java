package casestudy.execise1.service.impl;

import casestudy.execise1.modle.Customer;
import casestudy.execise1.service.ICustomerService;
import casestudy.execise1.utils.FileCustomer;
import ss00_mvc_haitt.exception.DuplicateIDException;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH="src/casestudy/execise1/data/customer.csv";

    public void display() {
       List<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        int id;
        boolean isExit = false;
        while (true) {
            try {
                System.out.print("Nhập mã số:");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                System.out.println("vui lòng nhập lại thông tin!");

                System.out.print("Nhập họ và tên: ");
                customer.setName(scanner.nextLine());

                System.out.print("nhập ngày sinh");
                customer.setDateOfBirth(scanner.nextLine());

                System.out.print("nhập giới tính ");
                customer.setGender(scanner.nextLine());

                int idCard;
                while (true) {
                    try {
                        System.out.print("nhập chứng minh nhân dân");
                        idCard = Integer.parseInt(scanner.nextLine());
                        for (Customer customer1 : customerList) {
                            if (customer1.getIdCard() == idCard) {
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
                customer.setIdCard(idCard);

                int phone;
                while (true) {
                    try {

                        System.out.print("nhập số điện thoại");
                        phone = Integer.parseInt(scanner.nextLine());
                        for (Customer customer1 : customerList) {
                            if (customer1.getPhone() == phone) {
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
                customer.setPhone(phone);

                String email;
                while (true) {
                    try {
                        System.out.print("vui lòng nhập email: ");
                        email = scanner.nextLine();
                        for (Customer customer1 : customerList) {
                            if (customer1.getEmail().equals(email)) {
                                throw new DuplicateIDException("Trùng email, vui lòng nhập ID lại!");
                            }
                        }
                        break;
                    } catch (DuplicateIDException e) {
                        System.out.println(e.getMessage());
                    }
                }
                customer.setEmail(email);

                System.out.print("Loại khách hàng:");
                customer.setCustomerType(scanner.nextLine());

                System.out.print("địa chỉ:");
                customer.setAddress(scanner.nextLine());

                isExit = true;
                FileCustomer.writeCustomerFile(PATH,customerList);
                System.out.println("cập nhập thành công!");
                break;
            }
        }
        if (!isExit) {
            System.out.println("không tìm thấy số chứng minh nhân dân:");
        }
    }

    @Override
    public void add() {
        List<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        Customer customer = infoCustomer();
        customerList.add(customer);
        FileCustomer.writeCustomerFile(PATH,customerList);
        System.out.println("thêm mới thành công: ");
    }

    public static Customer infoCustomer() {
        List<Customer> customerList = FileCustomer.readCustomerFile(PATH);

        int id;
        while (true) {
            try {
                System.out.print("nhập mã số:");
                id = Integer.parseInt(scanner.nextLine());
                for (Customer customer : customerList) {
                    if (customer.getId() == id) {
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
                for (Customer customer : customerList) {
                    if (customer.getIdCard() == idCard) {
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
                for (Customer customer : customerList) {
                    if (customer.getPhone() == phone) {
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
        System.out.print("vui lòng nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Loại khách hàng:");
        String customerType = scanner.nextLine();

        System.out.print("địa chỉ:");
        String address = scanner.nextLine();
        return new Customer(id, name, dateOfBirth, gender, idCard, phone, email, customerType, address);
    }
}
