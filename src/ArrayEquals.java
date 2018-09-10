import java.util.Arrays;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 19:52
 **/
public class ArrayEquals {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 7};
        System.out.println(Arrays.equals(arr, arr1));
        System.out.println(Arrays.equals(arr, arr2));
    }
}
