package casestudy.execise1.modle;

public abstract class Facility {
    private String idService;
    private String serviceName;
    private double area;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String rentalType;


    public Facility() {
    }

    public Facility(String idService, String serviceName, double area, double rentalCosts, int maxNumberOfPeople, String rentalType) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
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

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }




    @Override
    public String toString() {
        return "Mã dịch vụ " + getServiceName() +
                ", Tên dịch vụ " + getServiceName() +
                ", Diện tích sử dụng " + getArea() +
                ", Chi phí thuê " + getRentalCosts() +
                ", Số lượng người tối đa " + getMaxNumberOfPeople() +
                ", Kiểu thuê " + getRentalType();
    }
}
