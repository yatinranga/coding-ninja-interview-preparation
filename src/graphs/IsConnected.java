package graphs;

import java.util.Scanner;

public class IsConnected {

	private static void DFS(int edges[][], int sv, boolean visited[]) {

		visited[sv] = true;
		for (int i = 0; i < edges.length; i++) {
			if (edges[sv][i] == 1 && !visited[i]) {
				DFS(edges, i, visited);
				visited[i] = true;
			}
		}

	}

	public static boolean isConnected(int edges[][]) {
		boolean visited[] = new boolean[edges.length];

		DFS(edges, 0, visited);

		for (boolean flag : visited) {
			if (!flag)
				return false;

		}
		return true;

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

		System.out.println(isConnected(edges));

	}

}
