package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath {

	private static boolean hasPath(int[][] edges, int sv, int ev, boolean[] visited) {

		if (edges[sv][ev] == 1) {
			return true;
		}

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(sv);
		visited[sv] = true;

		while (!q.isEmpty()) {
			int front = q.poll();

			for (int i = 0; i < edges.length; i++) {

				if (edges[front][i] == 1 && !visited[i]) {
					if (i == ev) {
						return true;
					} else {
						visited[i] = true;
						q.add(i);
					}
				}
			}
		}

		return false;
	}

	private static boolean hasPath(int[][] edges, int sv, int ev) {
		boolean visited[] = new boolean[edges.length];

		return hasPath(edges, sv, ev, visited);
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

		System.out.println(hasPath(edges, sv, ev));

	}

}
