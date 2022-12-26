package thi_module_2.utils;

import thi_module_2.modle.XeTai;
import thi_module_2.modle.XeOTo;
import thi_module_2.modle.PhuongTien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocVietFileUtil {
    private static List<String> docFile(String path) {
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

    public static List<PhuongTien> docPhuongTienFile(String path) {
        List<String> stringList = docFile(path);
        List<PhuongTien> phuongTienList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 7) {
                phuongTienList.add(new XeTai(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        Double.parseDouble(info[4]),
                        Double.parseDouble(info[5]),
                        Double.parseDouble(info[6])));
            } else if (info.length == 8) {
                phuongTienList.add(new XeOTo(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
                        Double.parseDouble(info[4]),
                        Double.parseDouble(info[5]),
                        Integer.parseInt(info[6]),
                        info[7]));
            }
        }
        return phuongTienList;
    }


    private static void vietFile(String path, String data) {
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

    public static void vietPhuongTienFile(String path, List<PhuongTien> chaList) {
        StringBuilder data = new StringBuilder();
        for (PhuongTien cha : chaList) {
            data.append(cha.getInfo());
        }

        vietFile(path, data.toString());
    }
}
