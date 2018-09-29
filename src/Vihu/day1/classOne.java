package Vihu.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class classOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int number = scanner.nextInt();

        while (number != 0) {
            number = getAndAddNumber(scanner, arrayList, number);
        }
        inputArrayList(arrayList);
    }

    private static void inputArrayList(ArrayList<Integer> arrayList) {
        for (int elem : arrayList) {
            System.out.print(elem + " ");
        }
    }

    private static int getAndAddNumber(Scanner scanner, ArrayList<Integer> arrayList, int number) {
        arrayList.add(number);
        System.out.print("input number: ");
        number = scanner.nextInt();
        return number;
    }
}
