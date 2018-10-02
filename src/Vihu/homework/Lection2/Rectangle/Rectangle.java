package Vihu.homework.Lection2.Rectangle;

public class Rectangle {

    private final double height;
    private final double wigth;

    public Rectangle(double height, double wigth) {
        this.height = height;
        this.wigth = wigth;
    }

    public double s() {
        return height * wigth;
    }

    public double p() {
        return (height + wigth) * 2;
    }

}
