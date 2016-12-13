/**
 * Created by davidgary on 12/13/16.
 */
import java.util.List;
import java.util.ArrayList;

public class CriteriaLunch implements CriteriaInterface {

    public List<MenuItem> meetCriteria(List<MenuItem> items) {
        List<MenuItem> lunchMenuItems = new ArrayList<MenuItem>();

        for (MenuItem item : items) {
            if (item.getClassification().equalsIgnoreCase("Lunch")) {
                lunchMenuItems.add(item);
            }
        }
        return lunchMenuItems;
    }
}
