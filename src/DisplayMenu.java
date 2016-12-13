/**
 * Created by davidgary on 11/28/16.
 */
public class DisplayMenu implements CommandInterface {
    private Aggregator a;

    public DisplayMenu(Aggregator a) {
        this.a = a;
    }
    public Menu execute() {
        System.out.println("Menu: ");
        return a.getMenu();
    }
}
