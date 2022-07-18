package casestudy.execise1.modle;

public class Room extends Facility {
    private String freeService;

    public Room(){
    }
    public Room(String serviceName, double area, double rentalCosts, int numberOfPeopleIn, String rentalType, String freeService) {
        super(serviceName, area, rentalCosts, numberOfPeopleIn, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Dịch vụ miễn phí " + getFreeService() +
                super.toString();
    }
}
