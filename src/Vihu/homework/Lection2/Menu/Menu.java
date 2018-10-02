package Vihu.homework.Lection2.Menu;

import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dish.getName();
        dish.getDescription();
        dish.getPrice();
        dishes.add(dish);
    }

    public String getCheapestDish() {
        long min = dishes.get(0).getPrice();
        int temp = 0;
        for (int i = 1; i < dishes.size(); i++) {
            if (dishes.get(i).getPrice() < min) {
                min = dishes.get(i).getPrice();
                temp = i;
            }
        }
        return dishes.get(temp).toString();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String tempStr = "\t" + getName();
        int counter = 1;
        for (Dish dish : dishes) {
            tempStr += "\n " + counter + ". " + dish.getName() + "\n " + dish.getDescription() + ";  " + dish.getPrice();
            counter++;
        }
        return tempStr;
    }
}
