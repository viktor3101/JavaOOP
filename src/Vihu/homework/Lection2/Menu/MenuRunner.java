package Vihu.homework.Lection2.Menu;

import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {
        Menu menuOne = new Menu("Hot dishes");
        menuMaker(menuOne, 2);
        System.out.println(menuOne.toString() + "\n");
        System.out.println(menuOne.getCheapestDish() + "\n");
    }

    private static void menuMaker(Menu menu, int count) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.print("input name: ");
            String name = sc.next();
            System.out.print("input description: ");
            String description = sc.next();
            System.out.print("input price: ");
            long price = sc.nextLong();
            Dish dish = new Dish(name, description, price);
            menu.addDish(dish);
        }
    }
}
