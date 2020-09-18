package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class AllConnectedComponents {

	private static void allConnectedComponent(int[][] edges, boolean[] visited, ArrayList<ArrayList<Integer>> list) {
		
		
		

	}

	public static void allConnectedComponent(int[][] edges) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		boolean[] visited = new boolean[edges.length];

		for (int i = 0; i < visited.length; i++) {
			allConnectedComponent(edges, visited, list);
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		int[][] edges = new int[V][V];
		for (int i = 0; i < E; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}

		allConnectedComponent(edges);

	}

}
