//code implementation for graph rep. using AdjacencyList
//data structure: Arraylist
import java.util.*;
public class Ques1_list 
{
	public static void add_edge(List<List<Integer>> a,int i,int j) 
	{
		a.get(i).add(j);
	    a.get(j).add(i);
	}
	public static void display(List<List<Integer>> adj) 
	{
		for (int i = 0;i<adj.size();i++)
		{
			System.out.print(i+": ");
			for (int j = 0; j < adj.get(i).size(); j++) 
			    System.out.print(adj.get(i).get(j) + " ");
			System.out.println(); 
	    }
	}
	public static void count(List<List<Integer>> adj) 
	{
		for (int i = 0;i<adj.size();i++)
		{
			int count=0;
			for (int j = 0; j < adj.get(i).size(); j++) 
			    count++;

			System.out.println("Degree of "+i+": "+count);
	        }
	    }

	    public static void main(String[] args) 
	    {
	    	int n=5;
	        List<List<Integer>> mat = new ArrayList<>(n); 
	        for (int i=0;i<n;i++) 
	            mat.add(new ArrayList<>());

	        add_edge(mat, 0, 1);
	        add_edge(mat, 0, 2);
	        add_edge(mat, 0, 4);
	        add_edge(mat, 4, 3);
	        add_edge(mat, 3, 1);
	        add_edge(mat, 2, 1);
	        add_edge(mat, 2, 3);

	        System.out.println("Adjacency List Representation:");
	        display(mat);
	        System.out.println();
	        
	        System.out.println("Vertices Degree:");
	        count(mat);
	        }
	}
