package ss00_thuat_toan.execise.service.impl;

import ss00_thuat_toan.execise.modle.Student;
import ss00_thuat_toan.execise.modle.Teacher;
import ss00_thuat_toan.execise.service.IPersonService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        teacherList.add(new Teacher(1, "Võ Văn Tý", "5/4/2001", "Nam", "Toán"));
        teacherList.add(new Teacher(2, "Đặng Thị Thủy Điên", "1/3/2001", "Nam", "toán"));
        teacherList.add(new Teacher(3, "Lê Đại Lợi", "5/4/2001", "Nam", "Văn"));
    }


    public void add() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm mới thành công!");
    }


    public void remove() {
        System.out.print("nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println("bạn có chắc muốn xóa hay không? \n " +
                        "1 có \n" +
                        "2 không \n");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("xóa thành công");
        }
    }


    public void display() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void searchID() {
        System.out.println("nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Teacher teacher : teacherList) {
            if (teacher.getId() == id) {
                System.out.println(teacher);
            }
            isFlag = true;
            break;
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }

    }

    @Override
    public void searchName() {
        System.out.println("nhập tên tìm kiếm");
        String name = scanner.nextLine();
        boolean isFlag = false;

        for (Teacher teacher : teacherList) {
            if (teacher.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(teacher);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void sortName() {
        boolean isSwap = true;
        for (int i = 0; i < teacherList.size() && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    isSwap = true;
                }
            }
        }
        display();

    }

    public static Teacher infoTeacher() {
        System.out.print("nhập id ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();


        System.out.print("nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập chuyên môn: ");
        String technique = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, technique);
        return teacher;

    }
}
