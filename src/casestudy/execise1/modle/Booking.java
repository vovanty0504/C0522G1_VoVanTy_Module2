package casestudy.execise1.modle;

public class Booking {
    private int bookingCode;
    private int startDay;
    private int endDate;
    private int customerCode;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(int bookingCode, int startDay, int endDate, int customerCode, String serviceName, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "Mã đặt=" + bookingCode +
                ", Ngày bắt đầu=" + startDay +
                ", Ngày kết thúc=" + endDate +
                ", Mã khách hàng=" + customerCode +
                ", Tên dịch vụ='" + serviceName + '\'' +
                ", Loại dịch vụ='" + serviceType + '\'' +
                '}';
    }
}
