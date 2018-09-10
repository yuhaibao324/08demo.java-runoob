import java.util.ArrayList;
import java.util.List;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 19:50
 **/
public class ArrayContain {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(0, "a");
        list1.add(1, "b");
        list1.add(2, "c");
        list1.add(3, "f");
        System.out.println(list1.contains("a"));
        System.out.println(list1.contains("d"));
    }
}
