import java.util.Calendar;

/**
 * @author allenwhm
 * @date 2018/3/21 23:41
 * @description
 */
public class CharacterMethod {
    public static void main(String[] args) {
        System.out.println(Character.toString('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('5'));

        //can also use codePoint
        char a = 68;
        System.out.println(a); //D, 65 is A, 97 is a
        System.out.println(Character.isUpperCase(68));
        System.out.println((char)65); //A
    }
}
