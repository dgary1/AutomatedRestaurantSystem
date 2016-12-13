import java.util.Scanner;

/**
 * Created by davidgary on 11/29/16.
 */
public class SystemInterface {
    private static Invoker invoker = new Invoker();

    public static String getMenu() {
        int choice = 0;
        String g = "";
        do {
            System.out.println("Which menu would you like to choose from?");
            System.out.println("1.) Breakfast Menu");
            System.out.println("2.) Lunch Menu");
            System.out.println("3.) Dinner Menu");
            choice = getInt(g);
        } while (choice > 3 || choice < 0);
        Menu m = invoker.getMenu();
        m.print();
        return m + " ";
    }
    public static String getOrders() {
        Orders o = invoker.getOrder();
        return o + " ";
    }
    public static String getTab() {
        Tab t = invoker.getTab();
        t.getTab();
        return t + " ";
    }
    public static int getInt(String g) {
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()) {
            System.out.print("Error! Wrong input type. Try again. Enter a key for split: ");
            input.next();
        }
        return input.nextInt();
    }
}
