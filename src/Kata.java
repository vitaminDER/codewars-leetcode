public class Kata {

    public static void main(String[] args) {

        System.out.println(makeNegative(5));
        System.out.println(makeNegative(0));
        System.out.println(makeNegative(-5));


    }

    public static int makeNegative(final int x) {
        if (x > 0)
         return -x;
        if(x==0)
            return 0;

        return x;
    }
}
