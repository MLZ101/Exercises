

import java.util.Scanner;

public class PalindromeStarred {
    public static void main(String [] args){
        System.out.println("Enter your text to star the palindromes: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (Palindrome(words[i]))
                words[i] = "*".repeat(words[i].length());
        }
        System.out.println(String.join(" ", words));

        input.close();
    }






    public static boolean Palindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        return isPalindrome ? true : false;
        
    }
}

