package ss00_thuat_toan.execise.service.impl;

import ss00_thuat_toan.execise.modle.Student;
import ss00_thuat_toan.execise.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPersonService {
    private List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);


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



    public void remove() {
        System.out.print("nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
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
        if(!isFlag){
            System.out.println("không tìm thấy");
        }
    }


    public static Student infoStudent() {
        System.out.print("nhập id ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();


        System.out.print("nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        double point = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên trường: ");
        String nameSchool = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, gender, point, nameSchool);
        return student;

    }
}
