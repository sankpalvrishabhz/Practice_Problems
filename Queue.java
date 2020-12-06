class Queue<T> {
	int size=0; 
	Node front=null, rear=null; 

	class Node {
	int data;
	Node next;
	}
	
	<T> enQueue (<T> x)
	{
		Node currentRear = rear;
		rear = new Node();
		rear.data = x;
 		rear.next = null;
		if (front = rear) {
			return false;
 		}
 		else {
 			currentRear.next = rear;
 		}
		size++;
	}
	<T> dequeue () {
		int currentData = front.data;
		front = front.next;
		if (rear=null) {
			return false;
 		}
		size--;
		return currentData;
	}
}