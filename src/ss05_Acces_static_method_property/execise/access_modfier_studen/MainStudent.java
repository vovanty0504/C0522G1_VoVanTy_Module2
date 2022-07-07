package ss05_Acces_static_method_property.execise.access_modfier_studen;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student1: " + student1);

        Student student2 = new Student();
        student2.setName("Văn Tý");
        student2.setClasses("C0522G1");
        System.out.println("Student2: " + student2);
    }

}
