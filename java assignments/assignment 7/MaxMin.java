import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt(); 

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) { 
            numbers[i] = input.nextInt(); 
        }

        

        int max = numbers[0], min = numbers[0];
        for (int number : numbers){
            if(number > max) max = number;
            if(number < min) min = number;
        }

        System.out.println("Maximum is " + max + " and Minimum is "+ min);
    }


}
