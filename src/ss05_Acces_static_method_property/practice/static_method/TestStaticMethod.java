package ss05_Acces_static_method_property.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"Hoàng");
        Student s2 = new Student(222,"khánh");
        Student s3 = new Student(333,"nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
