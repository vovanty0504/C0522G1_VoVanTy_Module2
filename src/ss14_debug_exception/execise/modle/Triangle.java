package ss14_debug_exception.execise.modle;

import ss14_debug_exception.execise.exception.IllegalTriangleException;

public class Triangle {
    private double firstEdge;
    private double secondEdge;
    private double thirdEdge;

    public Triangle() {
    }

    public Triangle(double firstEdge, double secondEdge, double thirdEdge) throws IllegalTriangleException {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            throw new IllegalTriangleException("Cạnh phải lớn hơn 0");
        } else if (firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge || secondEdge + thirdEdge <= firstEdge) {
            throw new IllegalTriangleException("Cạnh của tam giác phải thỏa mãn điều kiện a + b > c");
        } else {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Tam giác:\n" +
                "cạnh thứ nhất = " + getFirstEdge() +
                ", cạnh thứ hai = " + getSecondEdge() +
                ", cạnh thứ ba = " + getThirdEdge();
    }
}
