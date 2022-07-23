package ss00_mvc_haitt.utils;

import ss00_mvc_haitt.modle.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteTeacherFile {
    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTeacherFile(String path, List<Teacher> students) {
        StringBuilder data = new StringBuilder();
        for (Teacher Teacher : students) {
            data.append(Teacher.getInfo());
        }

        writeFile(path, data.toString());
    }
}
