package codewars.kata_7;

import java.util.ArrayList;

/*
 * Complementary DNA
 * */
public class DnaStrand {
    public static String makeComplement(String dna) {
        String[] array = dna.split("");
        ArrayList<String> list = new ArrayList<>();
        String result = null;
        for (String value : array) {
            if (value.equals("T")) {
                result = value.replaceAll("T", "A");
            } else if (value.equals("A")) {
                result = value.replaceAll("A", "T");
            } else if (value.equals("C")) {
                result = value.replaceAll("C", "G");
            } else if (value.equals("G")) {
                result = value.replaceAll("G", "C");
            }
            list.add(result);
        }
        String replaced = String.join("", list);
        return replaced;
    }
}
