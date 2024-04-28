import java.util.Random;
import java.util.Scanner;

public class Guess {
     public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber = random.nextInt(54) + 1;
        System.out.println("Guess a number between 1 and 54: ");

        int guess = 0;
        while (guess != randomNumber) {
            guess = input.nextInt();
            if (guess > randomNumber) 
                System.out.println("Oops, your guess is bigger :(");
            else if (guess < randomNumber) 
                System.out.println("Oops, your guess is smaller :(");
            else 
                System.out.println("There you go MaryJo! (it rhymes) :)");
        }
        input.close();
    }
}
