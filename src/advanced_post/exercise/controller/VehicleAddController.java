package advanced_post.exercise.controller;

import advanced_post.exercise.service.ICarService;
import advanced_post.exercise.service.IMotorBikeService;
import advanced_post.exercise.service.ITruckService;
import advanced_post.exercise.service.impl.CarService;
import advanced_post.exercise.service.impl.MotorbikeService;
import advanced_post.exercise.service.impl.TruckService;

import java.util.Scanner;

public class VehicleAddController {
    private final Scanner scanner = new Scanner(System.in);
    ICarService car = new CarService();
    ITruckService truck = new TruckService();
    IMotorBikeService motorbike = new MotorbikeService();


    public void menuAddVehicle() {
        do {
            System.out.println("Mời bạn chọn phương tiện.\n" +
                    "1. Thêm xe tải \n" +
                    "2. Thêm ôtô \n" +
                    "3. Thêm xe máy \n" +
                    "4. Trở về menu");
            System.out.println("Mời bạn nhập lựa chọn");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    truck.add();
                    break;
                case 2:
                    car.add();
                    break;
                case 3:
                    motorbike.add();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

}
