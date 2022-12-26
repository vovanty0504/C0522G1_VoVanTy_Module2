package ss07_abstract_class_interface.execise.interface_colorable;


public abstract class Shape  {
    private String color = "green";
    public boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public boolean isFilled(){
        return filled;
    }



    @Override
    public String toString() {
        return "XeTai shape width color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled " : "not filled");
    }

}
