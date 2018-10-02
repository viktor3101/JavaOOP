package Vihu.homework.Lection2.Menu;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {
        Menu menuOne = new Menu("Hot dishes");

        Scanner sc = new Scanner(System.in);
        menuMaker(menuOne, sc, 2);
        System.out.println(menuOne.toString() + "\n");
        System.out.println(menuOne.getCheapestDish() + "\n");
        System.out.println(menuOne.getCheapestDish() + "\n");

    }

    private static void menuMaker(Menu menu, Scanner sc, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("input name: ");
            String name = sc.next();
            System.out.println("input description: ");
            String description = sc.next();
            System.out.print("input price: ");
            long price = sc.nextLong();
            Dish dish = new Dish(name, description, price);
            menu.addDish(dish);
        }
    }
}
