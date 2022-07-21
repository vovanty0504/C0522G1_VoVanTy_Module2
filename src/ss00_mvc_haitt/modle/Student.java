package ss00_mvc_haitt.modle;

public class Student extends Person {
    private double point;
    private String nameSchool;

    public Student() {
    }

    public Student(int id, String name, String dateOfBirth,String gender, double point, String nameSchool ) {
        super(id, name, dateOfBirth,gender);
        this.point = point;
        this.nameSchool = nameSchool;
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lớp: " + getNameSchool() + ", Điểm: " + getPoint();
    }
}
