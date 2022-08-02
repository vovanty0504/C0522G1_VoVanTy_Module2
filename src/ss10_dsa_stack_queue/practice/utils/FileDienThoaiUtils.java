package ss10_dsa_stack_queue.practice.utils;

import ss10_dsa_stack_queue.practice.modle.DienThoai;
import ss10_dsa_stack_queue.practice.modle.DienThoaiChinhHang;
import ss10_dsa_stack_queue.practice.modle.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDienThoaiUtils {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<DienThoai> readDienThoaiFile(String path) {
        List<String> stringList = readFile(path);
        List<DienThoai> dienThoaiList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 7 && (info[6].equals("Toan Quoc") || info[6].equals("Quoc Te"))) {
                dienThoaiList.add(new DienThoaiChinhHang(
                        Integer.parseInt(info[0]),
                        info[1],
                        Integer.parseInt(info[2]),
                        Integer.parseInt(info[3]),
                        info[4],
                        Integer.parseInt(info[5]),
                        info[6]));
            } else if (info.length == 7 && (info[6].equals("Da Sua Chua") || info[6].equals("Chua Sua Chua"))) {
                dienThoaiList.add(new DienThoaiXachTay(
                        Integer.parseInt(info[0]),
                        info[1],
                        Integer.parseInt(info[2]),
                        Integer.parseInt(info[3]),
                        info[4],
                        info[5],
                        info[6]));
            }
        }
        return dienThoaiList;
    }


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

    public static void writeDienThoaiFile(String path, List<DienThoai> dienThoaiList) {
        StringBuilder data = new StringBuilder();
        for (DienThoai dienThoai : dienThoaiList) {
            data.append(dienThoai.getInfo());
        }

        writeFile(path, data.toString());
    }
}
