package ss10_dsa_stack_queue.on_tap.modle;

public class SavingsCard extends BankAccount {
    private int saveMoney;
    private String savingsDay;
    private String interestRate;
    private String period;

    public SavingsCard() {
    }

    public SavingsCard(int id, String code, String name, String data, int saveMoney, String savingsDay, String interestRate, String period) {
        super(id, code, name, data);
        this.saveMoney = saveMoney;
        this.savingsDay = savingsDay;
        this.interestRate = interestRate;
        this.period = period;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getSavingsDay() {
        return savingsDay;
    }

    public void setSavingsDay(String savingsDay) {
        this.savingsDay = savingsDay;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String info() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,", getId(), getCode(), getName(),
                getData(), getSaveMoney(), getSavingsDay(), getInterestRate(), getPeriod());
    }

    @Override
    public String toString() {
        return super.toString() +
                "saveMoney=" + saveMoney +
                ", savingsDay='" + savingsDay +
                ", interestRate='" + interestRate +
                ", period='" + period;
    }
}
