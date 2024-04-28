import java.util.*;

public class main {
    public static void main(String[] args) {
        boolean[] arr = {true, false, false, true, false};
        System.out.println(countTrue(arr));

        int[] lucky =  {1, 2, 3, 4, 5, 6, 7};
        int[] lucky2 = {77};
        int[] unlucky = {1, 2, 3, 4, 5};
        System.out.println(luckyNumber(lucky));
        System.out.println(luckyNumber(lucky2));
        System.out.println(luckyNumber(unlucky));

        System.out.println(oddishOrEvenish(121));
        System.out.println(oddishOrEvenish(41));

        System.out.println(reverseOdd("One Two Three Four"));

        System.out.println(getHashTags("How the Avocado Became the Fruit of the Global Trade"));
    }

    // COUNTTRUE FUNCTION

    public static int countTrue(boolean[] arr){
        int count = 0;
        for (boolean value : arr) {
            if(value){
                count++;
            }
        }
        return count;
    }


    // LUCKYNUMBERS FUNCTION

    public static String luckyNumber(int[] arr){
        for (int number : arr){
            while (number > 0){
                if(number % 10 == 7)
                    return "LUCKY";
                number /= 10;
            }
        }
        return "there is no 7 in the array :(";
    }


    // ODDISH OR EVENISH 

    public static String oddishOrEvenish(int number){
        int digitSum = 0;
        while (number > 0){
            digitSum += number % 10;
            number /= 10;
        }
        return (digitSum % 2 == 0) ? "Evenish" : "Oddish";
    }


    // REVERSE ODD

    public static String reverseOdd(String text){
        String [] words = text.split(" ");

        for (int i=0; i < words.length; i++){

            if (words[i].length() %2 !=0){
                String currentWord = words[i];
                String newWord = "";
                int j = currentWord.length() - 1; 
                while (j >= 0){
                    newWord += currentWord.charAt(j);
                    j--;
                }
                words[i] = newWord;
            }
        }
        return String.join(" ", words);
    }


    // GET HASHTAGS

    public static List<String> getHashTags(String headline){
        String [] hashedWords = headline.split("\\W+");
        List <String> words = Arrays.asList(hashedWords);
        List <String> finalWords = new ArrayList<>();
        
        Collections.sort(words, (w1, w2) -> w2.length() - w1.length());

        for (int i=0; i<3 && i<words.size(); i++){
            finalWords.add("#" + words.get(i).toLowerCase());
        }
        return finalWords;
    }


}
