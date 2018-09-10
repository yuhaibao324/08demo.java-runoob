import java.util.HashSet;
import java.util.Set;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 19:54
 **/
public class ArrayUnion {
    public static void main(String[] args) {
        String[] str1 = {"a", "b", "c"};
        String[] str2 = {"d", "e", "c"};
        String[] unionResult = union(str1, str2);
        for (String item : unionResult) {
            System.out.println(item);
        }
    }

    // use Set to keep the value unique
    public static String[] union(String[] str1, String[] str2) {
        Set<String> set = new HashSet();
        for (String item : str1) {
            set.add(item);
        }
        for (String item : str2) {
            set.add(item);
        }
        String[] result = {};
        return set.toArray(result);
    }
}
