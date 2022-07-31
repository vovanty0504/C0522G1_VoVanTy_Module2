package casestudy.execise1.modle;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String idService, String serviceName, double area, double rentalCosts, int numberOfPeopleIn, String rentalType, String roomStandard, int numberOfFloors) {
        super(idService, serviceName, area, rentalCosts, numberOfPeopleIn, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                this.getIdService(),
                this.getServiceName(),
                this.getArea(),
                this.getRentalCosts(),
                this.getMaxNumberOfPeople(),
                this.getRentalType(),
                this.getRoomStandard(),
                this.getNumberOfFloors());


    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tiêu chuẩn phòng " + getRoomStandard() +
                ", Số tầng " + getNumberOfFloors() ;
    }
}
