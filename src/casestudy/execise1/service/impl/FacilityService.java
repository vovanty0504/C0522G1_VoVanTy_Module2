package casestudy.execise1.service.impl;

import casestudy.execise1.exception.*;
import casestudy.execise1.modle.Facility;
import casestudy.execise1.modle.House;
import casestudy.execise1.modle.Room;
import casestudy.execise1.modle.Villa;
import casestudy.execise1.service.IFacilityService;
import casestudy.execise1.utils.FileFacility;
import casestudy.execise1.utils.MenuUtils;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH_ROOM = "src/casestudy/execise1/data/room.csv";
    private static final String PATH_VILLA = "src/casestudy/execise1/data/villa.csv";
    private static final String PATH_HOUSE = "src/casestudy/execise1/data/house.csv";

    private void inputFacility(Facility facility) {
        Map<Facility, Integer> houseList = FileFacility.readFacilityFile(PATH_HOUSE);
        Map<Facility, Integer> roomList = FileFacility.readFacilityFile(PATH_ROOM);
        Map<Facility, Integer> villaList = FileFacility.readFacilityFile(PATH_VILLA);
        String serviceId;
        while (true) {
            try {
                System.out.print("Nhập mã dịch vụ: ");
                serviceId = SCANNER.nextLine();
                if (facility instanceof Villa) {
                    if (!serviceId.matches("^SVVL-\\d{4}$")) {
                        throw new IdServiceFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng SVVL-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility villa : villaList.keySet()) {
                        if (serviceId.equals(villa.getIdService())) {
                            throw new DuplicateIDException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }
                } else if (facility instanceof House) {
                    if (!serviceId.matches("^SVHO-\\d{4}$")) {
                        throw new IdServiceFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng SVHO-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility house : houseList.keySet()) {
                        if (serviceId.equals(house.getIdService())) {
                            throw new DuplicateIDException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }
                } else {
                    if (!serviceId.matches("^SVRO-\\d{4}$")) {
                        throw new IdServiceFormatException("Mã dịch vụ không hợp lệ, vui lòng nhập theo định dạng SVRO-YYYY (với Y là số từ 0-9)!");
                    }

                    for (Facility room : roomList.keySet()) {
                        if (serviceId.equals(room.getIdService())) {
                            throw new DuplicateIDException("Mã dịch vụ đã tồn tại, vui lòng nhập lại!");
                        }
                    }
                }
                break;
            } catch (IdServiceFormatException | DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }

        String serviceName;
        while (true) {
            try {
                System.out.print("nhập tên dịch vụ: ");
                serviceName = SCANNER.nextLine();
                if (serviceId.matches("^[A-Z][a-z]+( [a-z]+)*$")) {
                    throw new TextFormatException("Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                }
                break;
            } catch (TextFormatException e) {
                System.out.println(e.getMessage());
            }
        }


        double areaUse;
        while (true) {
            try {
                System.out.print("Nhập diện tích sử dụng (m2): ");
                areaUse = Double.parseDouble(SCANNER.nextLine());
                if (areaUse <= 30) {
                    throw new AreaInvalidException("Diện tích phải lớn hơn 30m!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (AreaInvalidException e) {
                System.out.println(e.getMessage());
            }
        }


        int rentalCosts;
        while (true) {
            try {
                System.out.print("Nhập chi phí thuê (VNĐ): ");
                rentalCosts = Integer.parseInt(SCANNER.nextLine());
                if (rentalCosts <= 0) {
                    throw new RentalCostsInvalidException("Chi phí cho thuê phải >0!");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (RentalCostsInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        int maxNumberOfPeople;
        while (true) {
            try {
                System.out.print("Nhập số người tối đa: ");
                maxNumberOfPeople = Integer.parseInt(SCANNER.nextLine());
                if (maxNumberOfPeople <= 0 | maxNumberOfPeople >= 20) {
                    throw new MaxNumberOfPeopleInvalidException("Số người phải >0 và <20");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            } catch (MaxNumberOfPeopleInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

        String rentalType = MenuUtils.rentalType();
        facility.setRentalType(rentalType);
        facility.setIdService(serviceId);
        facility.setServiceName(serviceName);
        facility.setArea(areaUse);
        facility.setRentalCosts(rentalCosts);
        facility.setMaxNumberOfPeople(maxNumberOfPeople);


    }

    @Override
    public void add() {
        int choose = 0;
        while (true) {
            System.out.println("Thêm mới cơ sở:\n" +
                    "1. Thêm mới biệt thự.\n" +
                    "2. Thêm mới nhà.\n" +
                    "3. Thêm mới phòng.\n" +
                    "4. Trở về MENU quản lý cơ sở.");
            try {
                System.out.print("Nhập lựa chọn: ");
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("vui lòng nhập số!");
            }
            switch (choose) {
                case 1:
                    Map<Facility, Integer> villaList = FileFacility.readFacilityFile(PATH_VILLA);
                    Villa villa = new Villa();
                    inputFacility(villa);


                    String roomStandardVilla;
                    while (true) {
                        try {
                            System.out.print("Nhập tiêu chuẩn phòng: ");
                            roomStandardVilla = SCANNER.nextLine();
                            if (roomStandardVilla.matches("^[A-Z][a-z]+( [a-z]+)*$")) {
                                throw new TextFormatException("Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                            }
                            break;
                        } catch (TextFormatException e) {
                            System.out.println(e.getMessage());
                        }
                    }


                    double poolArea;
                    while (true) {
                        try {
                            System.out.print("Nhập diện tích hồ bơi (m2): ");
                            poolArea = Double.parseDouble(SCANNER.nextLine());
                            if (poolArea <= 30) {
                                throw new AreaInvalidException("Diện tích phải > 30m2!");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (AreaInvalidException e) {
                            System.out.println(e.getMessage());
                        }
                    }


                    int numberOfFloorsVilla;
                    while (true) {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numberOfFloorsVilla = Integer.parseInt(SCANNER.nextLine());
                            if (numberOfFloorsVilla <= 0) {
                                throw new NumberOfFloorsInvalidException("Số tầng phải lớn hơn 0!");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (NumberOfFloorsInvalidException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    villa.setRoomStandardVilla(roomStandardVilla);
                    villa.setPoolArea(poolArea);
                    villa.setNumberOfFloors(numberOfFloorsVilla);
                    villaList.put(villa, 0);
                    FileFacility.writeFacilityFile(PATH_VILLA, villaList);
                    System.out.println("Thêm mới Biệt thự thành công!");
                    break;
                case 2:
                    Map<Facility, Integer> houseList = FileFacility.readFacilityFile(PATH_HOUSE);
                    House house = new House();
                    inputFacility(house);

                    String roomStandardHouse;
                    while (true) {
                        try {
                            System.out.print("Nhập tiêu chuẩn phòng: ");
                            roomStandardHouse = SCANNER.nextLine();
                            if (roomStandardHouse.matches("^[A-Z][a-z]+( [a-z]+)*$")) {
                                throw new TextFormatException("Tiêu chuẩn phòng phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường!");
                            }
                            break;
                        } catch (TextFormatException e) {
                            System.out.println(e.getMessage());
                        }
                    }


                    int numberOfFloorsHouse;
                    while (true) {
                        try {
                            System.out.print("Nhập số tầng: ");
                            numberOfFloorsHouse = Integer.parseInt(SCANNER.nextLine());
                            if (numberOfFloorsHouse <= 0) {
                                throw new NumberOfFloorsInvalidException("Số tầng phải lớn hơn 0!");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số!");
                        } catch (NumberOfFloorsInvalidException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    house.setRoomStandard(roomStandardHouse);
                    house.setNumberOfFloors(numberOfFloorsHouse);

                    houseList.put(house, 0);
                    FileFacility.writeFacilityFile(PATH_HOUSE, houseList);
                    System.out.println("Thêm mới Nhà thành công!");
                    break;
                case 3:
                    Map<Facility, Integer> roomList = FileFacility.readFacilityFile(PATH_ROOM);
                    Room room = new Room();
                    inputFacility(room);

                    System.out.print("Nhập dịch vụ miễn phí đi kèm: ");
                    String freeService = SCANNER.nextLine();

                    room.setFreeService(freeService);
                    roomList.put(room, 0);
                    FileFacility.writeFacilityFile(PATH_ROOM, roomList);
                    System.out.println("Thêm mới Phòng thành công!");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
            }
        }
    }

    @Override
    public void display() {
        System.out.println("\nDanh sách cơ sở: ");

        System.out.println("1. Danh sách biệt thự: ");
        Map<Facility, Integer> villaList = FileFacility.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + ",\tSố lần sử dụng: " + villaList.get(villa));
        }

        System.out.println("2. Danh sách nhà: ");
        Map<Facility, Integer> houseList = FileFacility.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            System.out.println(house + ",\tSố lần sử dụng: " + houseList.get(house));
        }

        System.out.println("3. Danh sách phòng: ");
        Map<Facility, Integer> roomList = FileFacility.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            System.out.println(room + ",\tSố lần sử dụng: " + roomList.get(room));
        }
    }

    @Override
    public void displayMaintain() {
        System.out.println("Danh sách bảo trì cơ sở: ");

        System.out.println("1. Danh sách bảo trì biệt thự: ");
        Map<Facility, Integer> villaList = FileFacility.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            if (villaList.get(villa) > 4) {
                System.out.println(villa + "\tSố lần sử dụng: " + villaList.get(villa));
            }
        }

        System.out.println("2. Danh sách bảo trì nhà: ");
        Map<Facility, Integer> houseList = FileFacility.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            if (houseList.get(house) > 4) {
                System.out.println(house + ",\tSố lần sử dụng: " + houseList.get(house));
            }
        }

        System.out.println("3. Danh sách bảo trì phòng: ");
        Map<Facility, Integer> roomList = FileFacility.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            if (roomList.get(room) > 4) {
                System.out.println(room + ",\tSố lần sử dụng: " + roomList.get(room));
            }
        }
    }
}
