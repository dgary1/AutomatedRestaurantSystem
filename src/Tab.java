/**
 * Created by davidgary on 11/28/16.
 */
public class Tab {
    private Menu menu;
    private Orders order;
    public static boolean paid = false;

    public Tab(Menu m, Orders o) {
        menu = m;
        order = o;
    }
    public void getTab() {
        paid = true;
        int i = 0;
        System.out.println("***********Tab*********");
        double total = 0;
        while (i < order.getOrder().size()) {
            MenuItem m = menu.getMenu().get(order.getOrder().get(i).getMenuNum());
            System.out.println(m.getMenuNum() + " " + m.getDescription() + " $" + m.getPrice());
            total += m.getPrice();
            i++;
        }
        System.out.println();
        System.out.format("Your Total: $%.2f", total);
        System.out.println();
    }
}
