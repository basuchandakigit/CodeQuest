package Mavric;
public class Permutations {
    // Function to print all permutations of a given string
    private static void permute(String str, String ans) {
        // If the string is empty, print the answer
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            // Extract the ith character
            char ch = str.charAt(i);
            // Rest of the string after excluding the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);
            // Recur with the rest of the string and the current character added to the answer
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s, "");
    }
}
