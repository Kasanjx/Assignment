//code implementation for graph rep. using AdjacencyMatrix
//data structure: Array
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        int n = 5;
        int mat[][] = new int[n][n];

        add_edge(mat, 0, 1);
        add_edge(mat, 0, 2);
        add_edge(mat, 0, 4);
        add_edge(mat, 4, 3);
        add_edge(mat, 3, 1);
        add_edge(mat, 2, 1);
        add_edge(mat, 2, 3);

        System.out.println("Adjacency Matrix: ");
        display(mat);

        System.out.println("Degree of vertices:");
        Deg(mat);
    }
    public static void add_edge(int[][] mat, int a, int b) {
        mat[a][b] = 1;
        mat[b][a] = 1;
    }
    public static void display(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Deg(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) 
        {
            int degree = 0;
            for (int j=0;j<n; j++) 
                degree += mat[i][j];
            System.out.println(i+": "+degree);
        }
    }
}
