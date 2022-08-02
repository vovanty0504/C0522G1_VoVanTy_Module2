package casestudy.execise1.service.impl;

import casestudy.execise1.exception.IdFormatException;
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
    public void find() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        boolean isExit = false;
        System.out.println("nhập mã khách hàng");
        String find = SCANNER.nextLine();
        for (Customer customer : customerList) {
            if (customer.getId().contains(find)) {
                System.out.println(customer);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm tháy");
        }
    }

    @Override
    public void remove() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        boolean isExit = false;
        System.out.println("Mời bạn nhập mã khách hàng cần xóa");
        String id = SCANNER.nextLine();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                System.out.println("Khách hàng bạn muốn xóa");
                System.out.println(customer);
                System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                        "1. Nhấn phím '1' nếu chọn CÓ. \n" +
                        "2. Nhấn phím khác nếu chọn KHÔNG.");
                String choose = SCANNER.nextLine();
                if (choose.equals("1")) {
                    customerList.remove(customer);
                    FileCustomer.writeCustomerFile(PATH, customerList);
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

    @Override
    public void edit() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        System.out.print("\nNhập mã số khách hàng cần chỉnh sửa: ");
        String idEdit = SCANNER.nextLine();
        boolean isExist = false;

        for (Customer customer : customerList) {
            if (idEdit.equals(customer.getId())) {
                System.out.println("Khách hàng muốn chỉnh sửa: ");
                System.out.println(customer);
                System.out.println("Bạn có chắc muốn chỉnh sửa hay không?\n" +
                        " 1. Nhấn phím '1' nếu là CÓ.\n" +
                        " 2. Nhấn phím khác nếu là KHÔNG.");
                String chooseYesNo = SCANNER.nextLine();

                if (chooseYesNo.equals("1")) {
                    do {
                        System.out.println("Chỉnh sửa thông tin khách hàng:\n" +
                                "1. Chỉnh sửa tên.\n" +
                                "2. Chỉnh sửa ngày sinh.\n" +
                                "3. Chỉnh sửa giới tính.\n" +
                                "4. Chỉnh sửa số CMND.\n" +
                                "5. Chỉnh sửa số điện thoại.\n" +
                                "6. Chỉnh sửa email.\n" +
                                "7. Chỉnh sửa loại khách hàng.\n" +
                                "8. Chỉnh sửa địa chỉ.\n" +
                                "9. Kết thúc chỉnh sửa.");
                        int choose = 0;
                        try {
                            System.out.print("Mời bạn nhập lựa chọn: ");
                            choose = Integer.parseInt(SCANNER.nextLine());
                        } catch (NumberFormatException e) {
                            e.getStackTrace();
                        }

                        switch (choose) {
                            case 1:
                                System.out.print("Nhập tên khách hàng: ");
                                customer.setId(RegexUtil.getUpperCase());
                                break;
                            case 2:
                                System.out.print("Nhập ngày sinh khách hàng: ");
                                customer.setDateOfBirth(RegexUtil.getDateFormat());
                                break;
                            case 3:
                                customer.setGender(SCANNER.nextLine());
                                break;
                            case 4:
                                System.out.print("Nhập số CMND/CCCD khách hàng: ");
                                customer.setIdCard(RegexUtil.getIdCard());
                                break;
                            case 5:
                                System.out.print("Nhập số điện thoại khách hàng: ");
                                customer.setPhone(RegexUtil.getPhone());
                                break;
                            case 6:
                                System.out.print("Nhập email khách hàng: ");
                                customer.setEmail(RegexUtil.getEmail());
                                break;
                            case 7:
                                customer.setCustomerType(MenuUtils.customer());
                                break;
                            case 8:
                                System.out.print("Nhập địa chỉ khách hàng: ");
                                customer.setAddress(RegexUtil.getUpperCase());
                                break;
                            case 9:
                                FileCustomer.writeCustomerFile(PATH, customerList);
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
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);
        Customer customer = infoCustomer();
        customerList.add(customer);
        FileCustomer.writeCustomerFile(PATH, customerList);
        System.out.println("thêm mới thành công: ");
    }

    public static Customer infoCustomer() {
        LinkedList<Customer> customerList = FileCustomer.readCustomerFile(PATH);

        System.out.print("\nNhập mã số khách hàng: ");
        String id;
        while (true) {
            try {
                id = SCANNER.nextLine();
                if (!id.matches("^C\\d{4}$")) {
                    throw new IdFormatException("Mã khách hàng phải đúng định dạng: CXXXX, với XXXX là các số từ 0-9, vui lòng nhập lại!");
                }

                for (Customer customer : customerList) {
                    if (id.equals(customer.getId())) {
                        throw new DuplicateIDException("Mã khách hàng đã tồn tại, vui lòng nhập lại!");
                    }
                }

                break;
            } catch (IdFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Nhập tên khách hàng: ");
        String name = RegexUtil.getUpperCase();

        System.out.print("nhập ngày sinh");
        String dateOfBirth = RegexUtil.getDateFormat();

        System.out.print("nhập giới tính ");
        String gender = SCANNER.nextLine();

        System.out.print("Nhập số CMND/CCCD khách hàng: ");
        String idCard = RegexUtil.getIdCard();


        System.out.print("Nhập số điện thoại khách hàng: ");
        String phone = RegexUtil.getPhone();


        System.out.print("Nhập email khách hàng: ");
        String email = RegexUtil.getEmail();

        String customerType = MenuUtils.customer();


        System.out.print("địa chỉ:");
        String address = SCANNER.nextLine();
        return new Customer(id, name, dateOfBirth, gender, idCard, phone, email, customerType, address);
    }
}
