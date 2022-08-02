package casestudy.execise1.utils;

import java.util.Scanner;

public class MenuUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String lever() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Trình độ học vấn\n" +
                            "1. Đại học\n" +
                            "2. Cao đẳng\n" +
                            "3. Trung cấp");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Đại học";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Trung cấp";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }

    public static String position() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Vị trí\n" +
                            "1. Lễ tân\n" +
                            "2. Phục vụ\n" +
                            "3. Chuyên viên\n" +
                            "4. Giám sát\n" +
                            "5. Quản lí\n" +
                            "6. Giám đốc\n");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lí";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }

    public static String customer() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("xếp hạng khách hàng\n" +
                            "1. Thành viên\n" +
                            "2. Bạc\n" +
                            "3. Vàng\n" +
                            "4. Bạch kim\n" +
                            "5.Kim cương");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Thành viên";
                case 2:
                    return "Bạc";
                case 3:
                    return "Vàng";
                case 4:
                    return " Bạch kim";
                case 5:
                    return "Kim cương";

                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }

    public static String rentalType() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Loại cho thuê\n" +
                            "1. Thuê theo giờ\n" +
                            "2. Thuê theo ngày\n" +
                            "3. Thuê theo tháng\n");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Thuê theo giờ";
                case 2:
                    return "Thuê theo ngày";
                case 3:
                    return "Thuê theo tháng";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }

    public static String getName() {
        System.out.print("Nhập name: ");
        String name = SCANNER.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }

}
