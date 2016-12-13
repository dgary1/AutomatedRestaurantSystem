/**
 * Created by davidgary on 11/28/16.
 */
import java.util.*;

public class Orders {
    public static ArrayList<MenuItem> ordersList;

    public Orders() {
        ordersList = new ArrayList<MenuItem>();
    }
    public ArrayList<MenuItem> getOrder() {
        return ordersList;
    }
    public void addOrders(MenuItem i) {
        ordersList.add(i);
    }
    public void print() {
        int i = 0;
        for(MenuItem m: ordersList) {
            System.out.println(m.getDescription());
            i++;
        }
    }
}
