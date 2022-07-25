package casestudy.execise1.modle;

public abstract class  Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private int idCard;
    private int phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String gender, int idCard, int phone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mã số: " + getId() +
                ", Tên: " + getName() +
                ", Ngày sinh: " + getDateOfBirth() +
                ", Giới tính: " + getGender() +
                ", Số CMND: " + getIdCard() +
                ", Số điện thoại: " + getPhone() +
                ", Email: " + getEmail();
    }


}
