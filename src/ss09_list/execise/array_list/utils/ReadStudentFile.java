package ss09_list.execise.array_list.utils;

import ss09_list.execise.array_list.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadStudentFile {
    private static List<String> readFile(String path){
        List<String> stringList  = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }
//
//    public static List<Student> readStudentFile(String path){
//        List<String> stringList = readFile(path);
//        List<Student> studentList = new ArrayList<>();
//        String[] info;
//        for (String line : stringList){
//            info= line.split(",");
//            studentList.add(new Student());
//        }
//    }
}
