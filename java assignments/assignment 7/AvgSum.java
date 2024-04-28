import java.util.ArrayList;
import java.util.Scanner;

public class AvgSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, average = 0;
        int i = 0;
        
        System.out.println("Enter a stream of integers (press any letter to stop) :");

        while(input.hasNextInt()){
            int number = input.nextInt();
            sum += number;
            i++;
        } 

        average = sum / i;

        System.out.println("Sum = " + sum + ", Average = " + average);

        input.close();
    }

}
