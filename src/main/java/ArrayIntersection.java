import java.util.ArrayList;
import java.util.List;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 19:49
 **/
public class ArrayIntersection {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(0, "a");
        list1.add(1, "b");
        list1.add(2, "c");
        list1.add(3, "f");

        List<String> list2 = new ArrayList<>();
        list2.add(0, "a");
        list2.add(1, "b");
        list2.add(2, "c");
        list2.add(3, "d");

        list1.retainAll(list2);
        System.out.println(list1);

    }
}
