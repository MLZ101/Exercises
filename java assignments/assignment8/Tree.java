package assignment8;

import java.util.ArrayList;
import java.util.List;

public class Tree {




    public static void dfsPost(Node root){
        if (root == null) return;
        
        dfsPost(root.getLeft());
        dfsPost(root.getRight());
        System.out.println(root.getData());

    }




    public static void dfsIn(Node root){
        if (root == null) return;
        
        dfsIn(root.getLeft());
        System.out.println(root.getData());
        dfsIn(root.getRight());
        
    }





     public static void bfs(Node root) {

        List<Node> current = new ArrayList<>();
        List<Node> next = new ArrayList<>();

        current.add(root);
        System.out.println(root.getData());

        while (!current.isEmpty()) {
            for (Node element : current) {
                Node [] children = {element.getLeft(), element.getRight()};
                for (Node child : children) {
                    if(child != null){
                        next.add(child);
                        System.out.println(child.getData());
                    }
                }
            }
            current = next;
            next = new ArrayList<>();
        }
    }





    public static void main(String[] args) {
        Node rLL = new Node (null, null, 'd');
        Node rLR = new Node(null, null, 'e');
        Node rL = new Node(rLL, rLR, 'b');
        Node rR = new Node(null, null, 'c');
        Node root = new Node(rL, rR, 'a');


        System.out.println("\nDFS Post Order:");
        dfsPost(root);
        System.out.println("\nDFS In Order:");
        dfsIn(root);
        System.out.println("\nBFS:");
        bfs(root);

        /*  TREE STRUCTURE
        
         *           - a - 
         *    - b -        c
         *    d   e
        
         */
    
}
}
