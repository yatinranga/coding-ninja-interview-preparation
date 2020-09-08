package priority_queue;

import java.util.ArrayList;

public class PriorityQueue {

	private ArrayList<Integer> heap;

	public PriorityQueue() {
		this.heap = new ArrayList<Integer>();
	}

	public boolean isEmpty() {
		return heap.size() == 0;
	}

	public int size() {
		return heap.size();
	}

}
