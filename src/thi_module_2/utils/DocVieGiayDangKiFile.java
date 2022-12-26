package thi_module_2.utils;

import thi_module_2.modle.GiayDangKiPhuongTien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocVieGiayDangKiFile {
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

    public static List<GiayDangKiPhuongTien> docDangKiFile(String path) {
        List<String> stringList = docFile(path);
        List<GiayDangKiPhuongTien> giayDangKiPhuongTiens = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 4) {
                giayDangKiPhuongTiens.add(new GiayDangKiPhuongTien(
                        Integer.parseInt(info[0]),
                        info[1],
                        Integer.parseInt(info[2]),
                        info[3]));
            }
        }
        return giayDangKiPhuongTiens;
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

    public static void vietGiayDangKiFile(String path, List<GiayDangKiPhuongTien> giayDangKiPhuongTiens) {
        StringBuilder data = new StringBuilder();
        for (GiayDangKiPhuongTien giayDangKiPhuongTien : giayDangKiPhuongTiens) {
            data.append(giayDangKiPhuongTien.getInfo());
        }

        vietFile(path, data.toString());
    }
}
