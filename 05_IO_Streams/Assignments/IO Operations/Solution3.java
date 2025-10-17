// Write a program to count the occurrences of each word in an input file and write the word along with 
// its corresponding count in an output file.
//
// [Note: The words should be sorted alphabetically in the output file.]
// (Hint: Consider using Map Collection)
//
// For Example, let’s assume the following are the contents of inputFile.txt
//
// Manoj works at Hpro
// Snehal works at Hpro
// Suresh works at Hpro
// Anita works at Hpro
// Jamil works at Hpro
//
// Command: java FileWordCount inputFile.txt outputFile.txt
//
// After Execution of the program, the contents of outputFile.txt should be:
//
// Anita : 1
// at : 5
// Hpro : 5
// Jamil : 1
// Manoj : 1
// Snehal : 1
// Suresh : 1
// works : 5

import java.io.*;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        // Check if input and output file names are provided
        if (args.length < 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        // Using TreeMap to automatically sort words alphabetically
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Split line into words using regex for spaces and punctuation
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Remove punctuation and convert to lowercase if desired
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (word.isEmpty()) continue;

                    // Update count in map
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }

            // Write results to output file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    bw.write(entry.getKey() + " : " + entry.getValue());
                    bw.newLine();
                }
            }

            System.out.println("Word count written successfully to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

