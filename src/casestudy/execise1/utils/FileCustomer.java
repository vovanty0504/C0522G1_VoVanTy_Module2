package casestudy.execise1.utils;

import casestudy.execise1.modle.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCustomer {
    private static List<String> reaFile(String path) {
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

    public static List<Customer> readCustomerFile(String path) {
        List<String> stringList = reaFile(path);
        List<Customer> customerList = new ArrayList<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 9) {
                customerList.add(new Customer(
                        Integer.parseInt(info[0]),
                        info[1],
                        info[2],
                        info[3],
        Integer.parseInt(info[4]),
        Integer.parseInt(info[5]),
                        info[6],
                        info[7],
                        info[8]));
            }
        }
        return customerList;
    }
    private static void writeFile(String path, String date){
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

    public static void writeCustomerFile(String path, List<Customer> customers){
        StringBuilder data = new StringBuilder();
        for (Customer customer : customers){
            data.append(customer.getInfo());
        }
        writeFile(path,data.toString());
    }
}
