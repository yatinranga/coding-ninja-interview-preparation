package priority_queue;

import java.util.ArrayList;

public class MinPriorityQueue {

	private ArrayList<Integer> heap;

	public MinPriorityQueue() {
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

	int removeMin() throws PriorityQueueException {

		if (heap.isEmpty())
			throw new PriorityQueueException();

		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);

		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightchildIndex = 2;

		while (leftChildIndex < heap.size()) {

			if (heap.get(leftChildIndex) < heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if (rightchildIndex < heap.size() && heap.get(rightchildIndex) < heap.get(minIndex)) {
				minIndex = rightchildIndex;
			}

			if (minIndex == index) {
				break;
			} else {
				int temp1 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp1);
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightchildIndex = 2 * index + 2;
			}

		}
		return temp;
	}

}
