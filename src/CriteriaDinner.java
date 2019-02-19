/**
 * Created by davidgary on 12/13/16.
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaDinner implements CriteriaInterface {
    public List<MenuItem> meetCriteria(List<MenuItem> items) {
        List<MenuItem> dinnerLunchMenu = new ArrayList<MenuItem>();
        for (MenuItem item : items) {
            if (item.getClassification() == 3) {
                dinnerLunchMenu.add(item);
            }
        }
        return dinnerLunchMenu;
    }
}
