package ss06_inheritance_polymorphism.execise.point_moveablepoint;

public class MainMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint(1,2);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint1.move());

        MoveablePoint moveablePoint2=new MoveablePoint(1,2,6,7);
        System.out.println(moveablePoint2);
        System.out.println(moveablePoint2.move());
        System.out.println(moveablePoint2.move());
        System.out.println(moveablePoint2.move());
    }
}
