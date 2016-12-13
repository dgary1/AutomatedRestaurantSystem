/**
 * Created by davidgary on 11/28/16.
 */
public class MenuItem {
    private int menuNum;
    private String itemDescription;
    private double itemPrice;
    private int classification;

    public MenuItem(int n, String d, double p, int c) {
        menuNum = n;
        itemDescription = d;
        itemPrice = p;
        classification = c;
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
    public int getClassification() {
        return classification;
    }
}
