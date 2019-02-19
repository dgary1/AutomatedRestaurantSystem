/**
 * Created by davidgary on 11/29/16.
 */
import java.util.*;

public class SubmitOrder implements CommandInterface {
    private Aggregator a;
    public static boolean submitted = false;

    public SubmitOrder(Aggregator a) {
        this.a = a;
    }
    public Object execute() {
        int choice;
        String g = "";
        Scanner input = new Scanner(System.in);
        a.getMenu().print();
        System.out.println("Place order now (Enter 9 to exit): ");
        choice = getInt(g);
        Orders order = new Orders();
        a.setOrders(order);
        while(choice != 9 && choice > 0) {
            switch(choice) {
                case 1: a.getOrders().addOrders(new MenuItem(1, "Bruschetta", 12.99, 2));
                    break;
                case 2: a.getOrders().addOrders(new MenuItem(2, "Lobster Dinner", 12.99, 3));
                    break;
                case 3: a.getOrders().addOrders(new MenuItem(3, "Eggs & Bacon", 12.99, 1));
                    break;
                case 4: a.getOrders().addOrders(new MenuItem(4, "Toast", 12.99, 1));
                    break;
                case 5: a.getOrders().addOrders(new MenuItem(5, "Turkey Sandwich", 12.99, 2));
                    break;
                case 6: a.getOrders().addOrders(new MenuItem(6, "Macaroni", 12.99, 3));
                    break;
                case 7: a.getOrders().addOrders(new MenuItem(7, "S'mores", 12.99, 2));
                    break;
                case 8: a.getOrders().addOrders(new MenuItem(8, "Fruit Salad", 12.99, 1));
                    break;
                default: System.out.println("Whoops! Not an option. Please re-enter.");
                    break;
            }
            a.getMenu().print();
            System.out.print("Place order now (Enter 9 to exit): ");
            choice = getInt(g);
        }
        submitted = true;
        System.out.println("Your order has been placed. ");
        return null;
    }
    public static int getInt (String g){
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            input.next();
            System.out.print("Error! Incorrect data type! Enter an integer: ");
        }
        return input.nextInt();
    }
}
