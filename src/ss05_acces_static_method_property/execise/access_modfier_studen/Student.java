package ss05_acces_static_method_property.execise.access_modfier_studen;

public class Student {
    private String name = "John";
    private String classes = "C05";
    public static String MySchool = "CodeGym";

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return String.format("Name: %s, Class: %s MySchool: %s ", getName(), getClasses(), MySchool);
    }
}
