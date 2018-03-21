/**
 * @author allenwhm
 * @date 2018/3/21 20:56
 * @description
 */
public class EnumTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size);
    }
}

class FreshJuice {
    enum FreshJuiceSize {SMALL, MIDUME, LARGE}
    FreshJuiceSize size;
}
