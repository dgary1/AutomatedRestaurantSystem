/**
 * Created by davidgary on 11/29/16.
 */
public class Invoker {
    Aggregator a = new Aggregator();

    public Menu getMenu() {
        return (Menu) new DisplayMenu(a).execute();
    }
    public Orders getOrder() {
        return (Orders) new SubmitOrder(a).execute();
    }
    public Tab getTab() {
        return (Tab) new DisplayTab(a).execute();
    }
}
