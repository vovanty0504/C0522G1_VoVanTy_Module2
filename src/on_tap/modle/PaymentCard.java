package on_tap.modle;

public class PaymentCard extends BankAccount {
    private int cardNumber;
    private int money;


    public PaymentCard() {
    }

    public PaymentCard(int id, String code, String name, String data, int cardNumber, int money) {
        super(id, code, name, data);
        this.cardNumber = cardNumber;
        this.money = money;
    }

    @Override
    public String info() {
        return String.format("%s,%s,%s,%s,%s,%s\n", getId(), getCode(), getName(),
                getData(), getCardNumber(), getMoney());
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cardNumber=" + cardNumber +
                ", money=" + money;
    }
}
