package ss07_abstract_class_interface.execise.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new circle("red", true , 5);
        shapes[1] = new Rectangle(4,6,"black",false);
        shapes[2] = new Square(8,"blue",true);

        double percent = Math.floor(Math.random() * 100) + 1;
        System.out.println("Pre-resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }
        System.out.println("\npercent: " + percent + "%\n");

        System.out.println("After-resize: ");
        for (Shape shape : shapes) {
            shape.resize(percent);
            System.out.println(shape + "\n AREA: " + shape.getArea());
        }
    }
}
