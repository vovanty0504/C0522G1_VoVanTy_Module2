package casestudy.execise1.modle;

public class Contract {
    private int contractNumber;
    private int reservationCode;
    private double reservationAmount;
    private double totalPaymentAmount;
    private int lineCode;

    public Contract() {
    }

    public Contract(int contractNumber, int reservationCode, double reservationAmount, double totalPaymentAmount, int lineCode) {
        this.contractNumber = contractNumber;
        this.reservationCode = reservationCode;
        this.reservationAmount = reservationAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.lineCode = lineCode;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(int reservationCode) {
        this.reservationCode = reservationCode;
    }

    public double getReservationAmount() {
        return reservationAmount;
    }

    public void setReservationAmount(double reservationAmount) {
        this.reservationAmount = reservationAmount;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getLineCode() {
        return lineCode;
    }

    public void setLineCode(int lineCode) {
        this.lineCode = lineCode;
    }

    @Override
    public String toString() {
        return "Hợp đồng{" +
                ", Số hợp đồng=" + contractNumber +
                ", Mã đặt chỗ=" + reservationCode +
                ", Số tiền đặt trước=" + reservationAmount +
                ", Tổng số tiền thanh toán=" + totalPaymentAmount +
                ", Mã hàng=" + lineCode +
                '}';
    }
}
