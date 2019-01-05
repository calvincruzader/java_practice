import java.util.*;

class StacksQueuesCommonFunctions {
	
	public static void main(String[] args) { 
		// dequesStacks();
		dequeQueues();
	}

	public static void dequesStacks() { 
		Deque<Integer> deq = new ArrayDeque<Integer>();
		deq.addFirst(1); deq.addFirst(2); deq.addFirst(3);

		System.out.println(deq.peekFirst());
		System.out.println(deq.removeFirst());
	}

	public static void dequeQueues() {
		Deque<Integer> deq = new ArrayDeque<Integer>(); 
		deq.addLast(2); deq.addLast(4); deq.addLast(8);
		// offer, remove, poll, get

		System.out.println(deq.getFirst());

		System.out.println(deq.removeFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.peekFirst());
		System.out.println(deq.getFirst());
	}
}