package Vihu.homework.Lection2.Line;

import java.util.ArrayList;
import java.util.Scanner;

public class Lines {
    private final ArrayList<Line> lineArrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    private void addLine(Line line) {
        lineArrayList.add(line);
    }

    public double summaryLength() {
        double linesLength = 0.0;
        for (Line line : lineArrayList) {
            linesLength += line.lineLength();
        }
        return linesLength;
    }

    public double maxLine() {
        double max = lineArrayList.get(0).lineLength();
        for (Line line : lineArrayList) {
            if (line.lineLength() > max) {
                max = line.lineLength();
            }
        }
        return max;
    }


    public void linesArrayList() {
        String n = "yes";
        while (n.equals("yes") || n.equals("Yes")) {
            System.out.println("input first point x y");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            Point point1 = new Point(x, y);

            System.out.println("input first point x y");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            Point point2 = new Point(x, y);

            Line line = new Line(point1, point2);
            System.out.println(line.lineLength());
            addLine(line);
            System.out.println("Wanna add new line? (yes/no)");
            n = scanner.next();
        }
    }
}
