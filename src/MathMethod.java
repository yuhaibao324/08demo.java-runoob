import java.util.SortedMap;

/**
 * @author allenwhm
 * @date 2018/3/21 22:26
 * @description
 */
public class MathMethod {
    public static void main(String[] args) {

        // xxxValue(), return the value of a Number object with xxx type
        Integer x = 5;
        System.out.println(x.byteValue());
        System.out.println(x.shortValue());
        System.out.println(x.intValue());
        System.out.println(x.longValue());
        System.out.println(x.floatValue()); //5.0
        System.out.println(x.doubleValue()); //5.0
        System.out.println("-----");

        // a.compareTo(b), if a>b, return 1; if equal, return 0; if a<b, return -1
        System.out.println(x.compareTo(3)); //1
        System.out.println(x.compareTo(5)); //0
        System.out.println(x.compareTo(7)); //-1
        System.out.println("-----");

        // a.equals(b), if a and b value and type is same, return true, else false
        Integer y = 10;
        Integer z = 5;
        Short a = 5;
        System.out.println(x.equals(y)); //false
        System.out.println(x.equals(z)); //true
        System.out.println(x.equals(a)); //false, the type is not same
        System.out.println("-----");

        //Integer valueOf(int i)：返回一个表示指定的 int 值的 Integer 实例。
        //Integer valueOf(String s):返回保存指定的 String 的值的 Integer 对象。
        //Integer valueOf(String s, int radix): 返回一个 Integer 对象，该对象中保存了用第二个参数提供的基数进行解析时从指定的 String 中提取的值。
        Integer a1 = Integer.valueOf(5);
        Integer a2 = Integer.valueOf('5');
        Integer a3 = Integer.valueOf("555", 8);
        Float b1 = Float.valueOf(5);
        System.out.println(a1 + " - " + a2 + " - " + a3 + " - " + b1);
        System.out.println("-----");

        //toString(int i): 返回表示指定 int 的 String 对象。
        //toString(): 返回表示 Integer 值的 String 对象。
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
        System.out.println("-----");

        //parseInt(String s): 返回用十进制参数表示的整数值。
        //parseInt(int i): 使用指定基数的字符串参数表示的整数 (基数可以是 10, 2, 8, 或 16 等进制数) 。
        int i1 = Integer.parseInt("9");
        // the string must be 9, if 9.0 will cause exception
        int i2 = Integer.parseInt("333", 16);
        float f1 = Float.parseFloat("4");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(f1);
        System.out.println("-----");

        //Math.abs(a)
        int j1 = -10;
        float j2 = 100;
        System.out.println(Math.abs(j1)); //10
        System.out.println(Math.abs(j2)); //100.0
        System.out.println("-----");

        //Math.ceil(), return double type value, more than
        float k1 = 1.67f;
        double k2 = -1.2;
        System.out.println(Math.ceil(k1)); //2.0
        System.out.println(Math.ceil(k2)); //-1.0
        System.out.println("-----");

        //Math.floor(), return double type value, less than
        System.out.println(Math.floor(k1)); //1.0
        System.out.println(Math.floor(k2)); //-2.0
        System.out.println("-----");

        //Math.round() => Math.floor(x+0.5), return int/long type value
        Double d1 = 10.5;
        float d2 = 10.1f;
        double d3 = 10.7;
        System.out.println(Math.round(d1)); //11 <-
        System.out.println(Math.round(d2)); //10
        System.out.println(Math.round(d3)); //11
        System.out.println("-----");

        //Math.rint(), return the int nearest
        System.out.println(Math.rint(d1)); //10.0 <-
        System.out.println(Math.rint(d2)); //10.0
        System.out.println(Math.rint(d3)); //11.0
        System.out.println("-----");

        //Math.min(a,b) Math.max(a,b) a and b need to be same type, else will cast the type
        System.out.println(Math.min(1.1,1)); //1.0
        System.out.println(Math.max(12,15)); //15
        System.out.println("-----");

        //Math.exp(a)
        System.out.printf("e value is %.4f%n", Math.E); //e value is 2.7183
        System.out.printf("exp(%.3f) is %.3f%n", 11.6325, Math.exp(11.6325)); //exp(11.633) is 112701.724
        System.out.println("-----");

        //Math.log(a)
        System.out.printf("log(%.3f) is %.3f%n", 11.635, Math.log(11.635)); //log(11.635) is 2.454
        System.out.println("-----");

        //Math.pow(a,b) a的b次方
        System.out.println("Math.pow(2,3) is " + Math.pow(2, 3)); //Math.pow(2,3) is 8.0
        System.out.println("-----");

        //Math.random(),  1 =< a < 1
        System.out.println(Math.random());
        System.out.println("-----");

        //Math.sqrt()
        System.out.println("Math.sqrt(4) is " + Math.sqrt(4)); //Math.sqrt(4) is 2.0
        System.out.println("-----");

        // in/out of box
        Integer i_1 = 12; //in box, value in -128~127 will reuse in memory
        int i_2 = i_1; // out box
        Integer i_3 = 100;
        Integer i_4 = 100;
        System.out.println(i_3 == i_4); //true, == compare the address
        System.out.println(i_3.equals(i_4)); //true, equals compare the content
        Integer i_5 = 1000;
        Integer i_6 = 1000;
        System.out.println(i_5 == i_6); // false
        System.out.println(i_5.equals(i_6)); //true
        System.out.println("-----");
    }
}
