package casestudy.execise1.service.impl;

import casestudy.execise1.modle.Customer;
import casestudy.execise1.service.ICustomerService;
import casestudy.execise1.utils.FileCustomer;
import casestudy.execise1.utils.MenuUtils;
import casestudy.execise1.utils.RegexUtil;
import ss00_mvc_haitt.exception.DuplicateIDException;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src/casestudy/execise1/data/customer.csv";


    public void display() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        int id;
        boolean isExit = false;
        while (true) {
            try {
                System.out.print("Nhập mã số:");
                id = Integer.parseInt(SCANNER.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                System.out.println("vui lòng nhập lại thông tin!");

                System.out.print("Nhập họ và tên: ");
                customer.setName(SCANNER.nextLine());

                System.out.print("nhập ngày sinh");
                customer.setDateOfBirth(SCANNER.nextLine());

                System.out.print("nhập giới tính ");
                customer.setGender(SCANNER.nextLine());

                int idCard;
                while (true) {
                    try {
                        System.out.print("nhập chứng minh nhân dân");
                        idCard = Integer.parseInt(SCANNER.nextLine());
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


                System.out.print("nhập số điện thoại");
                customer.setPhone(SCANNER.nextLine());


                String email;
                while (true) {
                    try {
                        System.out.print("vui lòng nhập email: ");
                        email = SCANNER.nextLine();
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
                customer.setCustomerType(MenuUtils.customer());

                System.out.print("địa chỉ:");
                customer.setAddress(SCANNER.nextLine());

                isExit = true;
                FileCustomer.writeCustomerFile(PATH, customerList);
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
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        Customer customer = infoCustomer();
        customerList.add(customer);
        FileCustomer.writeCustomerFile(PATH, customerList);
        System.out.println("thêm mới thành công: ");
    }

    public static Customer infoCustomer() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);

        int id;
        while (true) {
            try {
                System.out.print("nhập mã số:");
                id = Integer.parseInt(SCANNER.nextLine());
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

        String name = MenuUtils.getName();

        System.out.print("nhập ngày sinh");
        String dateOfBirth = RegexUtil.getDateOfBirth();

        System.out.print("nhập giới tính ");
        String gender = SCANNER.nextLine();

        int idCard;
        while (true) {
            try {
                System.out.print("nhập chứng minh nhân dân");
                idCard = Integer.parseInt(SCANNER.nextLine());
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


        System.out.print("nhập số điện thoại");
        String phone = SCANNER.nextLine();

        String email;
        while (true) {
            try {
                System.out.print("vui lòng nhập email: ");
                email = SCANNER.nextLine();
                for (Customer customer : customerList) {
                    if (customer.getEmail().equals(email)) {
                        throw new DuplicateIDException("Trùng email, vui lòng nhập email lại!");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String customerType = MenuUtils.customer();


        System.out.print("địa chỉ:");
        String address = SCANNER.nextLine();
        return new Customer(id, name, dateOfBirth, gender, idCard, phone, email, customerType, address);
    }
}
