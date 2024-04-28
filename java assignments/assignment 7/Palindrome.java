
import java.util.Scanner;

class Palindrome{


    public static void main(String[] args) {
        System.out.println("Enter a word to check for palindrome: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
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
        
        System.out.println(isPalindrome ? "Palindrome!" : "Not a palindrome :(");
        input.close();
    }

}
