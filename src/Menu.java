/**
 * Created by davidgary on 11/28/16.
 */
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> javaCafeMenu = new ArrayList<MenuItem>();
    public static final int BREAKFAST = 1;
    public static final int LUNCH = 2;
    public static final int DINNER = 3;

    public Menu() {
        // Breakfast Menu Items
        javaCafeMenu.add(new MenuItem(1, "Eggs and Toast", 9.99, 1));
        javaCafeMenu.add(new MenuItem(2, "Breakfast Burrito", 9.99, 1));
        javaCafeMenu.add(new MenuItem(3, "Pancakes", 9.99, 1));
        javaCafeMenu.add(new MenuItem(4, "Hash Browns", 9.99, 1));
        javaCafeMenu.add(new MenuItem(5, "", 9.99, 1));
        // Lunch Menu Items
        javaCafeMenu.add(new MenuItem(6, "Brussels Sprouts", 9.99, 2));
        javaCafeMenu.add(new MenuItem(7, "Brussels Sprouts", 9.99, 2));
        javaCafeMenu.add(new MenuItem(8, "Brussels Sprouts", 9.99, 2));
        javaCafeMenu.add(new MenuItem(9, "Brussels Sprouts", 9.99, 2));
        javaCafeMenu.add(new MenuItem(10, "Brussels Sprouts", 9.99, 2));
        // Dinner Menu Items
        javaCafeMenu.add(new MenuItem(11, "Bruschetta", 12.99, 3));
        javaCafeMenu.add(new MenuItem(12, "Fried Oysters", 16.99, 3));
        javaCafeMenu.add(new MenuItem(13, "Ravioli", 18.99, 3));
        javaCafeMenu.add(new MenuItem(14, "Black Cod", 32.99, 3));
        javaCafeMenu.add(new MenuItem(15, "Wood Grilled Whole Fish", 29.99, 3));
    }
    public ArrayList<MenuItem> getMenu() {
        return javaCafeMenu;
    }
    public void print() {
        int i = 0;
        for(MenuItem m: javaCafeMenu) {
            System.out.println((i + 1) + " " + m.getDescription() + " " + m.getPrice());
            i++;
        }
        System.out.println();
    }
}
