/**
 * Created by davidgary on 12/13/16.
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaBreakfast implements CriteriaInterface {
    public List<MenuItem> meetCriteria(List<MenuItem> items) {
        List<MenuItem> breakfastMenuItems = new ArrayList<MenuItem>();
        for (MenuItem item : items) {
            if (item.getClassification() == 1)
                breakfastMenuItems.add(item);
        }
        return breakfastMenuItems;
    }
}
