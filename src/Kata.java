public class Kata {

    public static void main(String[] args) {

        System.out.println(makeNegative(5));
        System.out.println(makeNegative(0));
        System.out.println(makeNegative(-5));


    }

    public static int makeNegative(final int x) {


        return (x > 0) ? -x : x;

    }
}
