/*Given two StringJoiners s1 and s2 which contains n city names separated by - (hyphen), display the output for the given cases:
    i) s1 merged to s2.
   ii) s2 merged to s1. */

import java.util.StringJoiner;

public class Solution2 {
    public static void main(String[] args) {
        // Create first StringJoiner with hyphen (-)
        StringJoiner S1 = new StringJoiner("-", "[", "]");
        S1.add("Delhi").add("Mumbai").add("Kolkata");

        // Create second StringJoiner with hyphen (-)
        StringJoiner S2 = new StringJoiner("-", "[", "]");
        S2.add("London").add("Paris").add("NewYork");

        // Case 1: S1 merged to S2 (S2 absorbs S1)
        StringJoiner merged1 = new StringJoiner("-", "[", "]");
        merged1.merge(S1);
        merged1.merge(S2);
        System.out.println("S1 merged to S2: " + merged1);

        // Case 2: S2 merged to S1 (S1 absorbs S2)
        StringJoiner merged2 = new StringJoiner("-", "[", "]");
        merged2.merge(S2);
        merged2.merge(S1);
        System.out.println("S2 merged to S1: " + merged2);
    }
}
