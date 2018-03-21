/**
 * @Author: allenwhm
 * @Date: 2018/3/21 20:02
 * @Description: compareTo(), return the subtraction value of first character
 */
public class StringCompare {
    public static void main(String[] args) {
        String str = "Hello world";
        String str_1 = "hello world";
        Object strObject = str;

        System.out.println(str.compareTo(str_1));   // -32
        System.out.println(str.compareToIgnoreCase(str_1));    //0
        System.out.println(str.compareTo(strObject.toString()));    //0
    }
}
