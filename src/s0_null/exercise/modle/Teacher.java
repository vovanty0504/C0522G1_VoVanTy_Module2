package s0_null.exercise.modle;
public class Teacher extends Person {
    private String technique;

    public Teacher() {
    }

    public Teacher(int id, String name, String dayOfBirth, String gender, String technique) {
        super(id, name, dayOfBirth, gender);
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
}
