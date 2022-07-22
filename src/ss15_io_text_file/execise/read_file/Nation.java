package ss15_io_text_file.execise.read_file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Nation {
    public static List<String> readFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        return list;
    }

    public static List<Country> readCountryFile(String path) throws IOException {
        List<Country> country = new ArrayList<>();
        List<String> strings = readFile(path);
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            country.add(new Country(Integer.parseInt(info[0]), (info[1]), (info[2])));
        }
        return country;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Nation.readCountryFile("src/ss15_io_text_file/execise/read_file/readfile.csv"));
    }
}

