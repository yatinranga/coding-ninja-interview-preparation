package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

	private static ArrayList<Integer> getPathDFSHelper(int[][] edges, int sv, int ev, boolean[] visited) {

		if (sv == ev) {
			ArrayList<Integer> pathList = new ArrayList<Integer>();
			pathList.add(sv);
			return pathList;
		}

		visited[sv] = true;

		for (int i = 0; i < edges.length; i++) {
			if (edges[sv][i] == 1 && !visited[i]) {
				ArrayList<Integer> pathList = getPathDFSHelper(edges, i, ev, visited);

				if (pathList != null) {
					pathList.add(sv);
					return pathList;
				}
			}
		}
		return null;
	}

	private static ArrayList<Integer> getPathDFS(int[][] edges, int sv, int ev) {

		boolean[] visited = new boolean[edges.length];
		return getPathDFSHelper(edges, sv, ev, visited);
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

		int sv = s.nextInt();
		int ev = s.nextInt();

		ArrayList<Integer> ans = getPathDFS(edges, sv, ev);
		for (int n : ans) {
			System.out.println(n);
		}
	}

}
