package s0_null.exercise.service.impl;


import s0_null.exercise.modle.Teacher;
import s0_null.exercise.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void removeTeacher() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (Teacher teacher : teacherList) {
            if(teacher.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!");
                }
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    public static Teacher infoTeacher() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập giới tính (nhập số 1 nếu là Nam): ");
        String gender = scanner.nextLine();

        System.out.print("Nhập chuyên môn: ");
        String technique = scanner.nextLine();

        return new Teacher(id, name, dateOfBirth, gender, technique);
    }
}
