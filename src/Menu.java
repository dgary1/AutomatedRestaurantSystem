/**
 * Created by davidgary on 11/28/16.
 */
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> javaCafeMenu = new ArrayList<MenuItem>();
    public Menu() {
        javaCafeMenu.add(new MenuItem(1, "Bruschetta", 12.99));
        javaCafeMenu.add(new MenuItem(2, "Fried Oysters", 16.99));
        javaCafeMenu.add(new MenuItem(3, "Ravioli", 18.99));
        javaCafeMenu.add(new MenuItem(4, "Black Cod", 32.99));
        javaCafeMenu.add(new MenuItem(5, "Wood Grilled Whole Fish", 29.99));
        javaCafeMenu.add(new MenuItem(6, "Mixed Greens", 8.99));
        javaCafeMenu.add(new MenuItem(7, "Marinated Olives", 5.99));
        javaCafeMenu.add(new MenuItem(8, "Brussels Sprouts", 9.99));
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
