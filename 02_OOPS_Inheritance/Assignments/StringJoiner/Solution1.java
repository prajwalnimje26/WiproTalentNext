/*Given an ArrayList containing n names, use StringJoiner to construct a new sequence of names separated by , (comma) and enclosed in { } brackets.*/

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        // Example list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Create StringJoiner with comma as delimiter and [] as prefix/suffix
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Add each name
        for (String name : names) {
            joiner.add(name);
        }

        // Print final result
        System.out.println("Joined names: " + joiner);
    }
}