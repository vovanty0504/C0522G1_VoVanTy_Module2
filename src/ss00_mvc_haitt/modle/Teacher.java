package ss00_mvc_haitt.modle;

public class Teacher extends Person {
    private String technique;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String technique) {
        super(id, name, dateOfBirth, gender);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chuyên môn: " + getTechnique();
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,\n", this.getId(), this.getName()
                , this.getDateOfBirth(), this.getGender(), this.getTechnique());
    }

}
