package casestudy.execise1.controller;

import casestudy.execise1.service.IHouseService;
import casestudy.execise1.service.IRoomService;
import casestudy.execise1.service.IVillaService;
import casestudy.execise1.service.impl.HouseService;
import casestudy.execise1.service.impl.RoomService;
import casestudy.execise1.service.impl.VillaService;

import java.util.Scanner;

public class FacilityManagementController {
    private static final Scanner scanner = new Scanner(System.in);
    IHouseService house = new HouseService();
    IRoomService room = new RoomService();
    IVillaService villa = new VillaService();

    public void FacilityManagement() {
        do {
            System.out.println("1. Cơ sở danh sách hiển thị\n" +
                    "2. Thêm cơ sở mới\n" +
                    "3. Hiển thị danh sách bảo trì cơ sở\n" +
                    "4. Quay lại menu chính");
            System.out.println("mời bạn nhập lựa chon:");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    villa.display();
                    break;
                case 2:
                    System.out.print("1. Thêm Villa\n" +
                                      "2. Thêm Room\n" +
                                      "3. Thêm House\n"+
                                       "4. Quay lại");

                    int select = Integer.parseInt(scanner.nextLine());
                    switch (select){
                        case 1:
                            villa.add();
                            break;
                        case 2:
                            room.add();
                            break;
                        case 3:
                            house.add();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                    }

                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }

        } while (true);
    }
}
