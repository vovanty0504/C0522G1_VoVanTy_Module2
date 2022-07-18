package casestudy.execise1.modle;

public class Villa extends  Facility{
    private String standardRoom;
    private double poolArea;
    private int numberOfFloors;

    public Villa(){
    }

    public Villa(String standardRoom, double poolArea, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, double area, double rentalCosts, int numberOfPeopleIn, String rentalType, String standardRoom, double poolArea, int numberOfFloors) {
        super(serviceName, area, rentalCosts, numberOfPeopleIn, rentalType);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
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

    @Override
    public String toString() {
        return "Tiêu chuẩn phòng " +getStandardRoom() +
                ", Diện tích hồ bơi " +getPoolArea() +
                ", Số tầng " + getNumberOfFloors() +
                super.toString();
    }
}
