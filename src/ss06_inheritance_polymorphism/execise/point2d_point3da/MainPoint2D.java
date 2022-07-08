package ss06_inheritance_polymorphism.execise.point2d_point3da;

import java.util.Arrays;

public class MainPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("Array: {x,y} = " + Arrays.toString(point2D.getXY()));
        System.out.printf("(%s)", point2D);

        Point2D point2D1 = new Point2D();
        point2D1.setXY(4, 5);
        System.out.println("\nArray: {x,y} =" + Arrays.toString(point2D.getXY()));
        System.out.printf("(%s)", point2D1);
    }
}
