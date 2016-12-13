/**
 * Created by davidgary on 11/29/16.
 */
import java.util.*;

public class UserInterface {
    public static void main(String [] args) {
        int choice;
        String g = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to The Java Café!");
        System.out.println("We're very pleased you decided\nto join us today!");
        menu();
        choice = getInt(g);
        while (choice != 5 && choice > 0) {
            switch (choice) {
                case 1:
                    SystemInterface.getMenu();
                    break;
                case 2:
                    SystemInterface.getOrders();
                    break;
                case 3:
                    SystemInterface.getTab();
                    System.out.println("************PAID************");
                    System.out.println("Thank you for dining in at Java Café!\nHave a good one!");
                    break;
                default:
                    System.out.println("Whoops! Thats not an option!\nPlease re-enter: ");
                    break;
            }
            menu();
            choice = getInt(g);
        }
        input.close();
    }
    public static void menu() {
        System.out.println("What would you like to do?: ");
        System.out.println("1.) Display Menu");
        System.out.println("2.) Submit an Order");
        System.out.println("3.) Receive Tab");
        System.out.println("5.) Exit");
        System.out.print("Choice: ");
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
