package ss04_class_and_object.exercise.fan;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getSlow());
        fan1.setColor("orange");
        fan1.setRadius(7);
        fan1.setOn(true);
        System.out.println("FAN1:\n" + fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMEDIUM());
        fan2.setColor("blue");
        fan2.setRadius(10);
        fan2.setOn(false);
        System.out.println("FAN2:\n" + fan2);

    }

}
