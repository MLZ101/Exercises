package assignment9;
import java.util.LinkedList;
import java.util.Iterator;

// I tried to use the same pattern as the one from geeksforgeeks (wrote everything manually again)

public class Graph {
    private int v;
    private LinkedList<Integer>[] adj;

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    

    void DFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFS(n, visited);
        }
    }

    int count() {
        boolean [] visited = new boolean[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                DFS(i, visited);
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS: ");
        g.DFS(2, new boolean[4]);
        System.out.println("\nFor the Count method:");
        System.out.println("\nNumber of connected components: " + g.count());
        
    }


    // The Shape:

    
//     (2)
//     /   \
//    /     \
//  (0)-----(1)
//  | \     |
//  |  \    |
//  |   \   |
//  |    \  |
//  |     \ |
//  |      \|
//  (3)-----(3)

}
