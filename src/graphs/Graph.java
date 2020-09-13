package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

	private static void printDFSHelper(int edges[][], int sv, boolean visited[]) {

		System.out.println(sv);
		visited[sv] = true;
		int n = edges.length;
		for (int i = 0; i < n; i++) {
			if (edges[sv][i] == 1 && !visited[i]) {
				printDFSHelper(edges, i, visited);
			}
		}
	}

	public static void printDFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				printDFSHelper(edges, i, visited);
			}
		}

	}

	private static void printBFSHelper(int edges[][], int sv, boolean visited[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(sv);
		visited[sv] = true;
		int n = edges.length;

		while (!queue.isEmpty()) {
			int front = queue.poll();
			System.out.println(front);

			for (int i = 0; i < n; i++) {
				if (edges[front][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}

		}

	}

	public static void printBFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				printBFSHelper(edges, i, visited);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int e = scan.nextInt();
		int[][] edges = new int[n][n];
		for (int i = 0; i < e; i++) {
			int fv = scan.nextInt();
			int sv = scan.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		scan.close();

		System.out.println("DFS");
		printDFS(edges);
		System.out.println("BFS");
		printBFS(edges);

	}

}
