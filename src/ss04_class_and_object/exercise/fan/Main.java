package ss04_class_and_object.exercise.fan;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getSLOW());
        fan1.setColor("orange");
        fan1.setRadius(7);
        fan1.setOn(true);
        System.out.println("FAN1:\n" + fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setColor("blue");
        fan2.setRadius(10);
        fan2.setOn(true);
        System.out.println("FAN2:\n" + fan2);

        Fan fan3 = new Fan();
        fan3.setSpeed(fan3.getFAST());
        fan3.setColor("red");
        fan3.setRadius(15);
        fan3.setOn(true);
        System.out.println("FAN3:\n" + fan3);

        Fan fan4=new Fan();
        fan4.setSpeed(fan4.getSLOW());
        fan4.setColor("black");
        fan4.setRadius(13);
        fan4.setOn(false);
        System.out.println("FAN4:\n" + fan4);


    }

}
