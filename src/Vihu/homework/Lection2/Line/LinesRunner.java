package Vihu.homework.Lection2.Line;

public class LinesRunner {

    public static void main(String[] args) {
        Lines lines = new Lines();
        lines.linesArrayList();
        System.out.println("Max line: " + lines.maxLine());
        System.out.println("Summary line length: " + lines.summaryLength());
    }
}
