package codewars.kata_7;

import java.util.ArrayList;
import java.util.List;
/*
 * Friend or Foe?
 * */
public class FriendOrFoe {
    public static List<String> friend(List<String> x) {
        List<String> newList = new ArrayList<>();
        for (String friend : x) {
            if (friend.length() == 4) {
                newList.add(friend);
            }
        }
        return newList;
    }
}
