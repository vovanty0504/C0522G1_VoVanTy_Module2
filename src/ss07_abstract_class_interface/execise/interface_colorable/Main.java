package ss07_abstract_class_interface.execise.interface_colorable;

public class Main {



    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(2, 5);
        shapes[2] = new Square(2);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();

            }
        }

    }


}
