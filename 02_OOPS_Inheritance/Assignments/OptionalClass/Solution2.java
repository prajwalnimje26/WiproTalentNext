/*Given a String address, print the address if it is not null or else print the default address as "India" */

import java.util.Optional;

public class Solution2 {
    public static void main(String[] args) {
        String address = null; // can be null

        // Wrap in Optional
        Optional<String> optAddress = Optional.ofNullable(address);

        // Print the value or default
        System.out.println("Address: " + optAddress.orElse("India"));
    }
}