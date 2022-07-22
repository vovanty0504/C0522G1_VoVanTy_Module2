package ss15_io_text_file.execise.coppy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        int sum = 0;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Số kí tự có trong file: " + sum);
        return list;
    }

    public static void writeFile(String path, List<String> list) {
        File file = new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String sourcePath = "src/ss15_io_text_file/execise/coppy_file/source.csv";
        String targetPath = "src/ss15_io_text_file/execise/coppy_file/target.csv";
        FileCopy.writeFile(targetPath, FileCopy.readFile(sourcePath));
    }

}
