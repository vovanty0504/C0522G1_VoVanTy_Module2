package advanced_post.exercise.controller;

import advanced_post.exercise.service.ICarService;
import advanced_post.exercise.service.IMotorBikeService;
import advanced_post.exercise.service.ITruckService;
import advanced_post.exercise.service.impl.CarService;
import advanced_post.exercise.service.impl.MotorbikeService;
import advanced_post.exercise.service.impl.TruckService;

import java.util.Scanner;

public class VehicleFindController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ICarService car = new CarService();
    private static final IMotorBikeService motorbike = new MotorbikeService();
    private static final ITruckService truck = new TruckService();

    public void menuFindVehicle() {
        do {
            System.out.println("Tìm kiếm phương tiện theo biển kiểm soát: \n" +
                    "1. Tìm kiếm xe tải. \n" +
                    "2. Tìm kiếm ôtô. \n" +
                    "3. Tìm kiếm xe máy. \n" +
                    "4. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    truck.find();
                    break;
                case 2:
                    car.find();
                    break;
                case 3:
                    motorbike.find();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
