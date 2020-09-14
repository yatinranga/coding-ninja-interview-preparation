package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {

	private static ArrayList<Integer> getPathBFSHelper(int[][] edges, int sv, int ev, boolean[] visited) {

		if (edges[sv][ev] == 1 && sv == ev) {
			ArrayList<Integer> pathList = new ArrayList<Integer>();
			pathList.add(sv);
			return pathList;
		}

		Queue<Integer> q = new LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		q.add(sv);
		visited[sv] = true;

		while (!q.isEmpty()) {
			int front = q.poll();

			for (int i = 0; i < edges.length; i++) {
				if (edges[front][i] == 1 && !visited[i]) {
					map.put(i, front);
					q.add(i);
					visited[i] = true;

					if (i == ev) {
						ArrayList<Integer> pathList = new ArrayList<Integer>();
						pathList.add(ev);
						int value = map.get(ev);

						while (value != sv) {
							pathList.add(value);
							value = map.get(value);
						}
						pathList.add(value);
						return pathList;
					}
				}
			}
		}

		return null;
	}

	private static ArrayList<Integer> getPathBFS(int[][] edges, int sv, int ev) {

		boolean[] visited = new boolean[edges.length];
		return getPathBFSHelper(edges, sv, ev, visited);
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

		ArrayList<Integer> ans = getPathBFS(edges, sv, ev);
		for (int n : ans) {
			System.out.print(n+" ");
		}

	}

}
