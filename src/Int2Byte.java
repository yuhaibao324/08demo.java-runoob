/**
 * @author allenwhm
 * @date 2018/3/21 21:17
 * @description
 */
public class Int2Byte {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;
        System.out.println(b); //-128

        // int 128 => 00000000 00000000 00000000 10000000
        // (byte)128 => 10000000 第一个为符号位, 取反加1 => -128
    }
}
