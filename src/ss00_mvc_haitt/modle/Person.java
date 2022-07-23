package ss00_mvc_haitt.modle;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String gender;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender=gender;
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

    @Override
    public String toString() {
        return "Id:" + getId() + ", Tên: " + getName() + ", Ngày sinh: " + getDateOfBirth() + ", Giới tính: " + getGender();
    }

}
