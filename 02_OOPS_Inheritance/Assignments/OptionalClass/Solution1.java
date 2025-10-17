/*use optional class and avoid the NullPointerException from below code:
 String names[]=new String[5];
 System.out.print(names[0].length());
 
 */

import java.util.Optional;

public class Solution1 {
    public static void main(String[] args) {
        String[] names = new String[5];  // all elements are null by default

        // Wrap the possibly null element in an Optional
        Optional<String> optName = Optional.ofNullable(names[2]);

        // Use orElse to provide a fallback value
        int length = optName.orElse("").length();

        System.out.println("Length: " + length);
    }
}
