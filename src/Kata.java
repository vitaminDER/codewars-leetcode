public class Kata {


    public static String boolToWord(boolean b)
    {

        return (!b) ? "No" : "Yes";
    }
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }
}
