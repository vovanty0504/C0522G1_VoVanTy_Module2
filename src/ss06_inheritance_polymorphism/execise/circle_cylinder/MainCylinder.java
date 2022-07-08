package ss06_inheritance_polymorphism.execise.circle_cylinder;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(2, "blue", 10);
        System.out.println(cylinder2);

    }
}
