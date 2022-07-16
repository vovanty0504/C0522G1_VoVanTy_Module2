package advanced_post.exercise.controller;

import advanced_post.exercise.service.ICarService;
import advanced_post.exercise.service.IMotorBikeService;
import advanced_post.exercise.service.ITruckService;
import advanced_post.exercise.service.impl.CarService;
import advanced_post.exercise.service.impl.MotorbikeService;
import advanced_post.exercise.service.impl.TruckService;

import java.util.Scanner;

public class VehicleRemoveController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IMotorBikeService motorbike = new MotorbikeService();
    private static final ICarService car = new CarService();
    private static final ITruckService truck = new TruckService();


    public void menuRemoveVehicle() {
        do {
            System.out.println("Xóa phương tiện: \n" +
                    "1. Xóa xe tải. \n" +
                    "2. Xóa ôtô. \n" +
                    "3. Xóa xe máy. \n" +
                    "4. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    truck.remove();
                    break;
                case 2:
                    car.remove();
                    break;
                case 3:
                    motorbike.remove();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
