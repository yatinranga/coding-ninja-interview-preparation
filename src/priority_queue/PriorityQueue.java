package priority_queue;

import java.util.ArrayList;

public class PriorityQueue {

	private ArrayList<Integer> heap;

	public PriorityQueue() {
		this.heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {

		if (heap.isEmpty()) {
			throw new PriorityQueueException();
		}

		return heap.get(0);
	}

	void insert(int element) {

		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {

			if (heap.get(parentIndex) > heap.get(childIndex)) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}

	}

}
