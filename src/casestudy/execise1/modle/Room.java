package casestudy.execise1.modle;

public class Room extends Facility {
    private String freeService;

    public Room(){
    }

    public Room(String idService, String serviceName, double area, double rentalCosts, int numberOfPeopleIn, String rentalType, String freeService) {
        super(idService, serviceName, area, rentalCosts, numberOfPeopleIn, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                this.getIdService(),
                this.getServiceName(),
                this.getArea(),
                this.getRentalCosts(),
                this.getMaxNumberOfPeople(),
                this.getRentalType(),
                this.getFreeService());


    }


    @Override
    public String toString() {
        return  super.toString()+
                ", Dịch vụ miễn phí " + getFreeService();
    }
}
