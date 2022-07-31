package casestudy.execise1.modle;

public class Villa extends Facility {
    private String roomStandardVilla;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String idService, String serviceName, double area, double rentalCosts, int numberOfPeopleIn,
                 String rentalType, String standardRoom, double poolArea, int numberOfFloors) {
        super(idService, serviceName, area, rentalCosts, numberOfPeopleIn, rentalType);
        this.roomStandardVilla = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandardVilla() {
        return roomStandardVilla;
    }

    public void setRoomStandardVilla(String roomStandardVilla) {
        this.roomStandardVilla = roomStandardVilla;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getIdService(),
                this.getServiceName(),
                this.getArea(),
                this.getRentalCosts(),
                this.getMaxNumberOfPeople(),
                this.getRentalType(),
                this.getRoomStandardVilla(),
                this.getPoolArea(),
                this.getNumberOfFloors());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tiêu chuẩn phòng " + getRoomStandardVilla() +
                ", Diện tích hồ bơi " + getPoolArea() +
                ", Số tầng " + getNumberOfFloors()
                ;
    }
}
