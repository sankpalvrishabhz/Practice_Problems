import java.util.*;

public class Queue_Using_Stack {
	Stack<Integer> stk1 = new Stack<Integer>();
	Stack<Integer> stk2 = new Stack<Integer>();
	void enQueue(int x)	{ 
		stk1.push(x);
		System.out.println(" inserted " + x );  
	} 
	
	void deQueue() {
		if(stk2.isEmpty()) {
			while (!stk1.isEmpty()) {
				stk2.push(stk1.pop());
			}
		}
        System.out.println(" front " + stk2.peek() );
		System.out.println(" removed " + stk2.pop() );
	}
	   public static void main(String args[]) {
	      Queue_Using_Stack qs = new Queue_Using_Stack();
	      qs.enQueue(10);
	      qs.enQueue(50);
	      qs.enQueue(100);
	      qs.deQueue();
	      qs.deQueue();
	      qs.enQueue(500);
	      qs.deQueue();
	      qs.deQueue();
	   }
}
