package casestudy.execise1.utils;

import casestudy.execise1.exception.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegexUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static boolean isLeapYear(int year) {
        boolean isDivisible4 = year % 4 == 0;
        boolean isDivisible100 = year % 100 == 0;
        boolean isDivisible400 = year % 400 == 0;

        return (isDivisible4 && !isDivisible100) || isDivisible400;
    }

    public static String getDateFormat() {
        String dateOfBirth;
        while (true) {
            try {
                dateOfBirth = SCANNER.nextLine();
                if (!dateOfBirth.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d{2}")) {
                    throw new DateInvalidException("Vui lòng nhập đúng định dạng dd/mm/yyyy!");
                }

                String[] str = dateOfBirth.split("/");
                if (str[1].equals("04") || str[1].equals("06") || str[1].equals("09") || str[1].equals("11")) {
                    if (Integer.parseInt(str[0]) > 30) {
                        throw new DateInvalidException("Vui lòng nhập đúng số ngày trong tháng (tháng này có tối đa 30 ngày)!");
                    }
                } else if (str[1].equals("02")) {
                    if (isLeapYear(Integer.parseInt(str[2]))) {
                        if (Integer.parseInt(str[0]) > 29) {
                            throw new DateInvalidException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 29 ngày vì là năm nhuận)!");
                        }
                    } else {
                        if (Integer.parseInt(str[0]) > 28) {
                            throw new DateInvalidException("Vui lòng nhập đúng số ngày trong tháng (tháng 2 có tối đa 28 ngày)!");
                        }
                    }
                }

                return dateOfBirth;

            } catch (DateInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String getAge() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        double age;
        String dateOfBirth;

        while (true) {
            try {
                dateOfBirth = getDateFormat();
                age = (double) (date.getTime() - dateFormat.parse(dateOfBirth).getTime()) / 315576E5;
                if (age < 18 || age > 100) {
                    throw new DateInvalidException("Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm và người dùng không được quá 100 tuổi!");
                }

                return dateOfBirth;

            } catch (DateInvalidException e) {
                System.out.println(e.getMessage());
            } catch (ParseException e) {
                e.getStackTrace();
            }
        }
    }

    public static String getUpperCase() {
        String name;
        while (true) {
            try {
                name = SCANNER.nextLine();
                if (!name.matches("^[A-Z][a-z]+( [A-Z][a-z]+)+$")) {
                    throw new TextFormatException("Phải viết hoa những chữ cái đầu, vui lòng nhập lại!");
                }

                break;
            } catch (TextFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return name;
    }

    public static String getIdCard() {
        String idCard;
        while (true) {
            try {
                idCard = SCANNER.nextLine();
                if (!idCard.matches("^\\d{9}|\\d{12}$")) {
                    throw new NumberRegexInvalidException("Số CMND/CCCD phải bao gồm 9 hoặc 12 chữ số từ 0-9, vui lòng nhập lại!");
                }

                break;
            } catch (NumberRegexInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        return idCard;
    }

    public static String getPhone() {
        String phone;
        while (true) {
            try {
                phone = SCANNER.nextLine();
                if (!phone.matches("^0\\d{9}$")) {
                    throw new NumberRegexInvalidException("Số điện thoại phải bao gồm 10 chữ số và bắt đầu bằng số 0, vui lòng nhập lại!");
                }

                break;
            } catch (NumberRegexInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        return phone;
    }

    public static String getEmail() {
        String email;
        while (true) {
            try {
                email = SCANNER.nextLine();
//                if (!email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z0-9]+$")) {
                if (!email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]{2,}(\\.[A-Za-z0-9]{2,}){1,2}$")) {
                    throw new TextFormatException("Sai định dạng email, vui lòng nhập lại!");
                }

                break;
            } catch (TextFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        return email;
    }

    public static int getNumberGreaterThan0() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(SCANNER.nextLine());
                if (number <= 0) {
                    throw new NumberValueInvalidException("Giá trị nhập vào phải lớn hơn 0, vui lòng nhập lại!");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (NumberValueInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        return number;
    }


}
