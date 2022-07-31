package s0_null.exercise.service.impl;

import s0_null.exercise.modle.Student;
import s0_null.exercise.service.IStudentService;
import s0_null.exercise.utils.FileStudent;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/s0_null/exercise/data/student.csv";

    @Override
    public void addStudent() {
        List<Student> studentList = FileStudent.readStudentFile(PATH);
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("Thêm mới thành công!");
        FileStudent.writeStudentFile(PATH, studentList);
    }

    @Override
    public void removeStudent() {
        List<Student> studentList = FileStudent.readStudentFile(PATH);
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExist = false;

        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());

                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!");
                }
                isExist = true;
                FileStudent.writeStudentFile(PATH, studentList);
                break;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }

    @Override
    public void displayAllStudent() {
        List<Student> studentList = FileStudent.readStudentFile(PATH);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập name: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Nhập giới tính (nhập số 1 nếu là Nam): ");
        String gender = scanner.nextLine();

        System.out.print("Nhập tên lớp: ");
        String className = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        double point = Double.parseDouble(scanner.nextLine());

        return new Student(id, name, dateOfBirth, gender, className, point);

    }
}