package assignment9;
import java.util.LinkedList;

public class Rotate {

    public static void rotate(LinkedList<Integer> list, int k) {
        for (int i = 0; i < k; i++) {
            list.addLast(list.removeFirst());
        }
    }

    public static void print(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        //10 -> 20 -> 30 -> 40 -> 50 -> 60 to become 50 -> 60 -> 10 -> 20 -> 30 -> 40
        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("List Before: ");
        print(list);

        System.out.println("List After: ");
        rotate(list, 4);    
        print(list);
        
    }
}
