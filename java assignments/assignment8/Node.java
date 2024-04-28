package assignment8;


public class Node{
    private Node right, left;
    private char data;

    public Node (Node left, Node right, char data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Node getRight(){
        return this.right;
    }

    public Node getLeft(){
        return this.left;
    }

    public char getData(){
        return this.data;
    }

    }

