package ss00_mvc_haitt.service.impl;

import ss00_mvc_haitt.exception.DuplicateIDException;
import ss00_mvc_haitt.service.IPersonService;
import ss00_mvc_haitt.modle.Teacher;

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
        teacherList.add(new Teacher(7, "Lê Đại Lợi", "5/4/2001", "Nam", "Văn"));
        teacherList.add(new Teacher(6, "Lê Đại Lợi", "5/4/2001", "Nam", "Văn"));
        teacherList.add(new Teacher(4, "Lê Đại Lợi", "5/4/2001", "Nam", "Văn"));
        teacherList.add(new Teacher(5, "Lê Đại Lợi", "5/4/2001", "Nam", "Văn"));
    }


    public void add() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm mới thành công!");
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
        int id;
        while (true) {
            try {
                System.out.print("nhập id cần xóa: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai cú pháp Vui lòng nhập lại số!");
            }
        }

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

                } else if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) == 0) {
                    if (teacherList.get(j).getId() > teacherList.get(j + 1).getId()) {
                        Collections.swap(teacherList, j, j + 1);
                    }
                }
            }
        }
        display();

    }

    public static Teacher infoTeacher() {
        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());

                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == id) {
                        throw new DuplicateIDException("Trùng id, vui lòng nhập lại!");
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


        System.out.print("nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập chuyên môn: ");
        String technique = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, gender, technique);
        return teacher;

    }
}
