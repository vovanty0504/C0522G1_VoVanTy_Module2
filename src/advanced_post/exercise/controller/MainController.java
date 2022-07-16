package advanced_post.exercise.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        VehicleAddController mediaDisplay = new VehicleAddController();
        VehicleDisplayController vehicleDisplayController = new VehicleDisplayController();
        VehicleRemoveController vehicleRemoveController = new VehicleRemoveController();
        VehicleFindController vehicleFindController = new VehicleFindController();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Quản lý các phương tiện giao thông.\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát \n" +
                    "5. Thoát");
            System.out.print("mời bạn nhập lựa chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    mediaDisplay.menuAddVehicle();
                    break;
                case 2:
                    vehicleDisplayController.menuDisplayVehicle();
                    break;
                case 3:
                    vehicleRemoveController.menuRemoveVehicle();
                    break;
                case 4:
                    vehicleFindController.menuFindVehicle();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
