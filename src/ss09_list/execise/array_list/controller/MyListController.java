package ss09_list.execise.array_list.controller;

import ss09_list.execise.array_list.model.Student;
import ss09_list.execise.array_list.service.impl.StudentService;

public class MyListController {
    public void displayMenu(){
        StudentService<Student> newMyArrayList = new StudentService<>();
        StudentService<Student> studentStudentService = new StudentService<>();

        Student student1 = new Student(1, "Nguyen Van XeTai");
        Student student2 = new Student(2, "Nguyen Van XeOTo");
        Student student3 = new Student(3, "Nguyen Van C");
        Student student4 = new Student(4, "Nguyen Van D");
        Student student5 = new Student(5, "Nguyen Van E");


        studentStudentService.add(student1);
        studentStudentService.add(student2);
        studentStudentService.add(student3);
        studentStudentService.add(student4);
        studentStudentService.add(student5);

        studentStudentService.add(student1, 5);
        for (int i = 0; i < studentStudentService.size(); i++) {
            System.out.print(studentStudentService.get(i).getId() + " ");
            System.out.println(studentStudentService.get(i).getName());
        }
    }

}
