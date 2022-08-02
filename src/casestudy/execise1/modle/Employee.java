package casestudy.execise1.modle;

public class Employee extends Person {
    private String level;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String idCard, String phone, String email, String level, String location, double wage) {
        super(id, name, dateOfBirth, gender, idCard, phone, email);
        this.level = level;
        this.position = location;
        this.wage = wage;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getName(),
                this.getDateOfBirth(),
                this.getGender(),
                this.getIdCard(),
                this.getPhone(),
                this.getEmail(),
                this.getLevel(),
                this.getPosition(),
                this.getWage());
    }

    @Override
    public String toString() {
        return "Nhân viên-" +super.toString()+
                ", Trình độ: " + getLevel() +
                ", Vị trí: " + getPosition()+
                ", Lương: " + getWage();
    }
}
