package ss00_thuat_toan.execise.service.impl;

import ss00_thuat_toan.execise.exception.DuplicateIDException;
import ss00_thuat_toan.execise.modle.Student;
import ss00_thuat_toan.execise.service.IPersonService;

import java.util.*;

public class StudentService implements IPersonService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        studentList.add(new Student(1, "Võ Văn Tý", "5/4/2001", "Nam", 10, "Code Gym"));
        studentList.add(new Student(2, "Đặng Thị Thủy Điên", "1/3/2001", "Nam", 9, "Code Gym"));
        studentList.add(new Student(3, "Lê Đại Lợi", "5/4/2001", "Nam", 8, "Code Gym"));
        studentList.add(new Student(4, "Lê Đại Lợi", "5/4/2001", "Nam", 8, "Code Gym"));
        studentList.add(new Student(7, "Lê Đại Lợi", "5/4/2001", "Nam", 8, "Code Gym"));
        studentList.add(new Student(6, "Lê Đại Lợi", "5/4/2001", "Nam", 8, "Code Gym"));
        studentList.add(new Student(5, "Lê Đại Lợi", "5/4/2001", "Nam", 8, "Code Gym"));
    }


    @Override
    public void add() {
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("thêm mới thành công: ");
    }

    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void searchID() {
        int id;
        while (true) {
            try {
                System.out.println("nhập id cần tìm: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai cú pháp Vui lòng nhập lại số!");
            }
        }

        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println(student);
            }
            isFlag = true;
        }
        if (!isFlag) {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void searchName() {
        System.out.println("nhập tên tìm theo tên");
        String searchName = scanner.nextLine();
        boolean isFlag = false;

        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(searchName.toLowerCase())) {
                System.out.println(student);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void sortName() {
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    isSwap = true;
                }
                if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) == 0) {
                    if (studentList.get(j).getId() > studentList.get(j + 1).getId()) {
                        Collections.swap(studentList, j, j + 1);
                    }
                }
            }
        }
        display();
    }


    public void remove() {
        int idRemove;
        while (true) {
            try {
                System.out.print("nhập id cần xóa: ");
                idRemove = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai cú pháp Vui lòng nhập lại số!");
            }
        }
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("bạn có chắc muốn xóa hay không? \n " +
                        "1 có \n" +
                        "2 không \n");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("xóa thành công");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy");
        }
    }


    public static Student infoStudent() {
        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Student student : studentList) {
                    if (student.getId() == id) {
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

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("vui lòng nhập giới tính:");
        String gender = scanner.nextLine();


        System.out.print("Nhập tên lớp: ");
        String nameSchool = scanner.nextLine();

        double point;
        while (true) {
            try {
                System.out.print("Nhập điểm: ");
                point = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Vui lòng nhập số!");
            }
        }
        return new Student(id, name, dateOfBirth, gender, point, nameSchool);
    }
}
