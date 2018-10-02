package Vihu.homework.Lection2.Menu;


public class Dish {
    private final String name;
    private final String description;
    private final long price;

    public Dish(String name, String description, long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return name + "With description: \n" + description + "\n\tPrice: " + price;
    }
}


