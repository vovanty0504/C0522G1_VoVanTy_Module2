package ss04_class_and_object.exercise.fan;

public class Main {

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        System.out.println("FAN1:\n" + fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getSLOW());
        fan2.setColor("black");
        fan2.setRadius(10);
        fan2.setOn(true);
        System.out.println("FAN2:\n" + fan2);

        Fan fan3 = new Fan();
        fan3.setSpeed(fan3.getMEDIUM());
        fan3.setColor("red");
        fan3.setRadius(15);
        fan3.setOn(true);
        System.out.println("FAN3:\n" + fan3);

        Fan fan4 = new Fan();
        fan4.setSpeed(fan4.getFAST());
        fan4.setColor("orange");
        fan4.setRadius(7);
        fan4.setOn(true);
        System.out.println("FAN4:\n" + fan4);


    }

}
