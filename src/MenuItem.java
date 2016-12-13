/**
 * Created by davidgary on 11/28/16.
 */
public class MenuItem {
    private int menuNum;
    private String itemDescription;
    private double itemPrice;

    public MenuItem(int n, String d, double p) {
        menuNum = n;
        itemDescription = d;
        itemPrice = p;
    }
    public int getMenuNum() {
        return menuNum;
    }
    public String getDescription() {
        return itemDescription;
    }
    public double getPrice() {
        return itemPrice;
    }
}
