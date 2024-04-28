import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        System.out.println("Enter 10 words: ");
        Scanner input = new Scanner(System.in);
        String[] names = new String[10];
        for (int i = 0; i < 10; i++) {
            names[i] = input.nextLine();
        }
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
        input.close();
    }
}
