/**
 * Created by davidgary on 11/29/16.
 */
public class DisplayTab implements CommandInterface {
    private Aggregator a;

    public DisplayTab(Aggregator a) {
        this.a = a;
    }
    public Tab execute() {
        return new Tab(a.getMenu(), a.getOrders());
    }
}
