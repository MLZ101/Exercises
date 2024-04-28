/*· Write a program to reverse individual words in a string, where 
each word may be delimited by a dot, comma, space or tab, 
like www.google.com should become www.elgoog.moc */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = text.split("[\\., \t]");       
        char[] delimiters = new char[words.length - 1];

        int j=0;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == '.' || text.charAt(i) == ',' || text.charAt(i) == '\t' || text.charAt(i) == ' '){
                delimiters[j] = text.charAt(i);
                j++;
            }
        }


        // Props to geeksforgeeks for letting me know about StringBuilder :)

        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i< words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i < delimiters.length) result.append(delimiters[i]);
        }
        
        System.out.println(result.toString());
        input.close();
    }
    
}
