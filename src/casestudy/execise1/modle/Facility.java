package casestudy.execise1.modle;

public abstract class Facility {
    private String serviceName;
    private double area;
    private double rentalCosts;
    private int numberOfPeopleIn;
    private String rentalType;

    public  Facility(){
    }

    public Facility(String serviceName, double area, double rentalCosts, int numberOfPeopleIn, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.numberOfPeopleIn = numberOfPeopleIn;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberOfPeopleIn() {
        return numberOfPeopleIn;
    }

    public void setNumberOfPeopleIn(int numberOfPeopleIn) {
        this.numberOfPeopleIn = numberOfPeopleIn;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ " + getServiceName() +
                ", Diện tích sử dụng " + getArea() +
                ", Chi phí thuê " + getRentalCosts() +
                ", Số lượng người tối đa " + getNumberOfPeopleIn()+
                ", Kiểu thuê " + getRentalType();
    }
}
