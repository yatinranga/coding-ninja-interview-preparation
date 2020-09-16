package graphs;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
	int source;
	int destination;
	int weight;

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
}

public class KruskalsAlgorithm {

	public static int findParent(int source, int[] parent) {

		if (parent[source] == source)
			return source;

		return findParent(parent[source], parent);

	}

	public static void kruskals(Edge[] input, int v) {

		Arrays.sort(input);

		Edge[] output = new Edge[v - 1];
		int count = 0;
		int i = 0; // reresent current edge o which we're working

		int parent[] = new int[v];
		for (int j = 0; j < parent.length; j++) {
			parent[j] = j;
		}

		while (count != v - 1) {
			Edge currentEdge = input[i];

			// checking cycle using union-find method
			int sourceParent = findParent(currentEdge.source, parent);
			int destinationParent = findParent(currentEdge.destination, parent);

			if (sourceParent != destinationParent) {
				output[count] = currentEdge;
				count++;
				parent[sourceParent] = destinationParent; // changing parent of source/ same logic for destination
			}
			i++;
		}

		for (int j = 0; j < v - 1; j++) {
			if (output[j].source < output[j].destination)
				System.out.println(output[j].source + " " + output[j].destination + " " + output[j].weight);
			else
				System.out.println(output[j].destination + " " + output[j].source + " " + output[j].weight);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		Edge input[] = new Edge[E];

		for (int i = 0; i < input.length; i++) {
			input[i] = new Edge();
			input[i].source = s.nextInt();
			input[i].destination = s.nextInt();
			input[i].weight = s.nextInt();
		}

		kruskals(input, V);

	}

}
