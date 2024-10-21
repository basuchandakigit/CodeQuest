package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
        // Example sentence
        String sentence = "this is the world this is my world";

        // Call the method to count word occurrences
        Map<String, Integer> wordCounts = countWordOccurrences(sentence);

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordOccurrences(String sentence) {
        // Convert the sentence to lower case to make the count case-insensitive
        sentence = sentence.toLowerCase();

        // Remove punctuation
        sentence = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Use a HashMap to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        return wordCounts;
    }
}

