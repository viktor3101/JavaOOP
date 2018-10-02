package Vihu.homework.Lection2.Line;

public class Line {
    public final Point point1;
    public final Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double lineLength() {
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
    }
}
