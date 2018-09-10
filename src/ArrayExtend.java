/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 19:29
 **/
public class ArrayExtend {
    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C"};
        String[] extendArray = new String[5];
        System.arraycopy(strArray, 0, extendArray, 0, strArray.length);
        for (int i = 0; i < extendArray.length - strArray.length; i++) {
            extendArray[i + strArray.length] = "-";
        }

        for (String str : extendArray) {
            System.out.println(str);
        }
    }
}
