public class LoopedLL {

	/**
	 * @param args
	 */
		 
	Node head;
	 
	static class Node {
		int value;
		Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
	public void add(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
	public boolean ifLoopExists() {
		Node twoPtr = head;
		Node onePtr = head;
		while (twoPtr != null && twoPtr.next != null) {
			twoPtr = twoPtr.next.next;
			onePtr = onePtr.next;
			if (onePtr == twoPtr)
				return true;
 
		}
		return false;
	}
 
	public static void main(String[] args) {
		LoopedLL list = new LoopedLL();

		Node loopNode=new Node(7);
		list.add(new Node(5));
		list.add(new Node(6));
		list.add(loopNode);
		list.add(new Node(1));
		list.add(new Node(2));
  
		list.printList();
		
		list.add(loopNode);

		System.out.println("Loop existed-->" + list.ifLoopExists());
 
	}
}