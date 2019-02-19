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
        System.out.println("Place order now (Enter 16 to exit): ");
        choice = getInt(g);
        Orders order = new Orders();
        a.setOrders(order);
        while(choice != 16 && choice > 0) {
            switch(choice) {
                case 1: a.getOrders().addOrders(new MenuItem(1, "Eggs and Toast", 9.99, 1));
                    break;
                case 2: a.getOrders().addOrders(new MenuItem(2, "Breakfast Burrito", 9.99, 1));
                    break;
                case 3: a.getOrders().addOrders(new MenuItem(3, "Pancakes", 9.99, 1));
                    break;
                case 4: a.getOrders().addOrders(new MenuItem(4, "Hash Browns", 9.99, 1));
                    break;
                case 5: a.getOrders().addOrders(new MenuItem(5, "Breakfast Casserole", 9.99, 1));
                    break;
                case 6: a.getOrders().addOrders(new MenuItem(6, "BLT", 9.99, 2));
                    break;
                case 7: a.getOrders().addOrders(new MenuItem(7, "Turkey Ceasar Warp", 9.99, 2));
                    break;
                case 8: a.getOrders().addOrders(new MenuItem(8, "Chicken Ceasar Wrap", 9.99, 2));
                    break;
                case 9: a.getOrders().addOrders(new MenuItem(9, "Macaroni and Cheese", 9.99, 2));
                    break;
                case 10: a.getOrders().addOrders(new MenuItem(10, "Side Salad", 9.99, 2));
                    break;
                case 11: a.getOrders().addOrders(new MenuItem(11, "Bruschetta", 12.99, 3));
                    break;
                case 12: a.getOrders().addOrders(new MenuItem(12, "Fried Oysters", 16.99, 3));
                    break;
                case 13: a.getOrders().addOrders(new MenuItem(13, "Ravioli", 18.99, 3));
                    break;
                case 14: a.getOrders().addOrders(new MenuItem(14, "Black Cod", 32.99, 3));
                    break;
                case 15: a.getOrders().addOrders(new MenuItem(15, "Wood Grilled Whole Fish", 29.99, 3));
                    break;
                default: System.out.println("Whoops! Not an option. Please re-enter.");
                    break;
            }
            a.getMenu().print();
            System.out.print("Place order now (Enter 16 to exit): ");
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
