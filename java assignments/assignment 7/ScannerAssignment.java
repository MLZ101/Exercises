/*· Write a program that takes your full name as user input and displays the abbreviations of the first and middle names except the last name which is displayed as it is.
 For example, if your name is Robert Brett Roser, then the output should be R.B.Roser */


import java.util.Scanner;

class ScannerAssignment{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Full Name: ");
        String name = input.nextLine();

        String [] subNames = name.split(" ");
        if (subNames.length < 2){
            System.err.println("Name too short, I need the full name!");
        } else{
        for (int i=0; i< subNames.length - 1; i++ ){
            subNames[i] = subNames[i].charAt(0) + ".";
            System.out.print(subNames[i] + ' ');
        }
        System.out.print(subNames[subNames.length - 1]);
    }
        input.close();
    }
}