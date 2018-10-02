package Vihu.homework.Lection2.Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangles {
    private final ArrayList<Rectangle> rectangleArrayList = new ArrayList<>();

    private void addRectangle(Rectangle rectangle) {
        rectangleArrayList.add(rectangle);
    }

    public double summary() {
        double temp = 0.0;
        for (Rectangle rectangle : rectangleArrayList) {
            temp += rectangle.s();
        }
        return temp;
    }

    public void rectArrayList(Rectangles rectangles, String n, Scanner scanner) {
        while (n != "n") {
            System.out.println("input rectangle(height  width): ");
            double height = scanner.nextDouble();
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(height, width);
            rectangles.addRectangle(rectangle);
            System.out.println("Wanna add one more(y/n)? ");
            n = scanner.next();
        }
    }
}
