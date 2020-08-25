package stack_and_queue;

public class QueueUsingArray {

	int[] array;
	int front;
	int rear;
	int size;

	public QueueUsingArray() {
		this.array = new int[10];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}

	public QueueUsingArray(int sizeOfQueue) {
		this.array = new int[sizeOfQueue];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public int front() throws QueueEmptyException {
		if (size == 0)
			throw new QueueEmptyException();

		return array[front];
	}

	public void enque(int data) throws QueueFullException {

		if (size == array.length)
			throw new QueueFullException();

		if (size == 0) {
			front = 0;
		}
		size++;

		rear = (rear + 1) % array.length;

//		rear++;
//		if (rear == array.length) {
//			rear = 0;
//		}
		array[rear] = data;

	}

	int deque() throws QueueEmptyException {

		if (size == 0)
			throw new QueueEmptyException();

		int temp = array[front];
		front = (front + 1) % array.length;
//		front++;
//		if (front == array.length) {
//			front = 0;
//		}
		size--;

		if (size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;

	}

}
