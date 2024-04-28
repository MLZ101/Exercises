// Take as a user input a string. Find out the number of occurrences of all letters in that string. Find out the letter with maximum occurrence.

// I am using a known method where we create anoccurancesay indexed at the 26 characters of the alphabet for occurances which yields a good time complexity

import java.util.Scanner;

public class MostOccurances {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        text = text.toLowerCase();

        int [] occurances = new int[26];  // occurances[0] is for 'a', occurances[25] is for 'z'
        for (int i=0; i< text.length(); i++){
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
                occurances [text.charAt(i) - 'a'] ++;
        }

        int max = 0;
        int indexOfMax = 0;

        for (int i=0; i<26; i++){

            if (occurances[i] > max){
                max = occurances[i];
                indexOfMax = i;
            }

            char letter = (char)('a' + i);
            if (occurances[i] > 0){
                System.out.println(letter+" ".concat(""+occurances[i]));
            }
        }

        System.out.println("And the most occured letter is " + (char)('a' + indexOfMax) + " with " + max + " occurances!");

        input.close();
    }


}
