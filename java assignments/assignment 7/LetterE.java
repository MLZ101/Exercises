//· Write a program to check if the letter 'e' is present in the word entered as user input.

import java.util.Scanner;

public class LetterE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.contains("e") || word.contains("E")) 
            System.out.println("E is Present!");
        else
            System.out.println("E is NOT Present :(");

        input.close();
    }

    
}
