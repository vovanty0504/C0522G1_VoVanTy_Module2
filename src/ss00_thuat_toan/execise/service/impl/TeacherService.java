package ss00_thuat_toan.execise.service.impl;

import ss00_thuat_toan.execise.modle.Teacher;
import ss00_thuat_toan.execise.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    private static Scanner scanner = new Scanner(System.in);
    private List<Teacher> teacherList = new ArrayList<>();


    public void add() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm mới thành công!");
    }


    public void remove() {
        System.out.print("nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag=false;
        for (Teacher teacher : teacherList){
            if(teacher.getId()==idRemove){
                System.out.println("bạn có chắc muốn xóa hay không? \n " +
                        "1 có \n" +
                        "2 không \n");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if(chooseYesNo==1){
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công");
                }
                isFlag=true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("xóa thành công");
        }
    }


    public void display() {
        for (Teacher teacher : teacherList){
            System.out.println(teacher);
        }
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
