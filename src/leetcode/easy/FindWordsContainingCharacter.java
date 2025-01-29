package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Find Words Containing Character
 * */
public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();

        String charToString = String.valueOf(x);

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(charToString))
                list.add(i);
        }
        return list;
    }
}
