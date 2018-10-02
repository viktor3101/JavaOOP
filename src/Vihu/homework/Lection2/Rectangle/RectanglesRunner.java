package Vihu.homework.Lection2.Rectangle;

import java.util.Scanner;

public class RectanglesRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangles rectangles = new Rectangles();
        rectangles.rectArrayList(rectangles, scanner);

        System.out.println("Summary square: " + rectangles.summarySquare());



    }
}
