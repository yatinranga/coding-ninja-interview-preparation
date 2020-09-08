package priority_queue;

public class PriorityQueueUse {

	public static void main(String[] args) throws PriorityQueueException {

		MinPriorityQueue pq = new MinPriorityQueue();
		int arr[] = { 5, 1, 9, 2, 0 };

		for (int a : arr) {
			pq.insert(a);
		}

		while (!pq.isEmpty()) {
			System.out.print(pq.removeMin() + " ");
		}
		
		

	}

}
