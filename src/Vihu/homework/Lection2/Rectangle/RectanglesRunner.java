package Vihu.homework.Lection2.Rectangle;

import java.util.Scanner;

public class RectanglesRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangles rectangles = new Rectangles();
        String n = "y";
        rectangles.rectArrayList(rectangles, n, scanner);

        System.out.println("Summary square: " + rectangles.summary());
    }


}
