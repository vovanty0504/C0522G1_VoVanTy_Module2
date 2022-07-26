package casestudy.execise1.utils;

import casestudy.execise1.modle.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEmployee {
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

    public static List<Employee> readEmployeeFile(String path) {
        List<String> stringList = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 10) {
                employeeList.add(new Employee(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), Integer.parseInt(info[5]),
                        info[6], info[7], info[8], Double.parseDouble(info[9])));
            }
        }
        return employeeList;
    }

    private static void writeFile(String path, String date) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(date);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployeeFile(String path, List<Employee> employees) {
        StringBuilder data = new StringBuilder();
        for (Employee employee : employees) {
            data.append(employee.getInfo());
        }
        writeFile(path, data.toString());
    }
}
