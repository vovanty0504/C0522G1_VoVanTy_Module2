package ss06_inheritance_polymorphism.execise.point2d_point3da;

import java.util.Arrays;

public class MainPoint3D {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D();
        System.out.println("Array; {x,y,z} = " + Arrays.toString(point3D1.getXYZ()));
        System.out.println(point3D1);

        point3D1.setXYZ(1, 2, 3);
        System.out.println("\nArray; {x,y,z} = " + Arrays.toString(point3D1.getXYZ()));
        System.out.println(point3D1);

    }
}
