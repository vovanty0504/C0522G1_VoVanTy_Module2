package casestudy.execise1.service.impl;

import casestudy.execise1.modle.Employee;
import casestudy.execise1.modle.Facility;
import casestudy.execise1.modle.Villa;
import casestudy.execise1.service.IVillaService;
import ss00_mvc_haitt.exception.DuplicateIDException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVillaService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> villaMap = new LinkedHashMap<>();




    @Override
    public void add() {
        System.out.print("vui lòng nhập key:");


        System.out.println("thêm mới thành công: ");


    }

    @Override
    public void display() {


    }

    public static Villa infoVilla() {
        System.out.print("tên dịch vụ: ");
        String serviceName = scanner.nextLine();

        double area;
        while (true) {
            try {
                System.out.print("nhập diện tích: ");
                area = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai vui lòng nhập số!");
            }
        }
        double rentalCosts;
        while (true) {
            try {
                System.out.print("vui lòng nhập chi phí dịch vụ: ");
                rentalCosts = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai vui lòng nhập số!");
            }
        }
        int numberOfPeopleIn;
        while (true) {
            try {
                System.out.print("Nhập số lượng người: ");
                numberOfPeopleIn = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai vui lòng nhập số!");
            }
        }

        System.out.print("kiểu thuê");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập tiêu chuẩn phòng");
        String standardRoom = scanner.nextLine();

        double poolArea;
        while (true) {
            try {
                System.out.print("Nhập diện tích hồ bơi: ");
                poolArea = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai vui lòng nhập số!");
            }
        }

        int numberOfFloors;
        while (true) {
            try {
                System.out.print("Nhập số tầng: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai vui lòng nhập số!");
            }
        }
        return new Villa(serviceName, area, rentalCosts, numberOfPeopleIn, rentalType, standardRoom, poolArea, numberOfFloors);
    }
}
