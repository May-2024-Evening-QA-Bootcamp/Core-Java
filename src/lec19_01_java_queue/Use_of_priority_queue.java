package lec19_01_java_queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Use_of_priority_queue {
	// This is not important at all
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		// The sequence of element you added doesn't matter rather Priority come from ASCII table
		queue.add("NY");
		queue.add("NJ");
		queue.add("MA");
		queue.add("CA");
		queue.add("MD");
		queue.add("TX");
		queue.add("NV");
		queue.add("GA");
		queue.add("AL");
		queue.add("WA");
		queue.add("HI");
		queue.add("FL");
		queue.add("LO");

		System.out.println(queue);

		// follow ASCII VALUE FOR PRIORITY
		// Retrieves and removes the head of this queue. This method differs from poll()
		// only in that it throws an exception if this queue is empty.
		System.out.println("Who is removed? " + queue.remove());
		System.out.println(queue);
		System.out.println("Who is removed? " + queue.remove());
		System.out.println(queue);

		// Removes and Returns true if this collection contained the specified element
		System.out.println("----------------------------");
		System.out.println(queue.remove("TX"));
		System.out.println(queue);
		System.out.println("----------------------------");
		System.out.println(queue.remove("AB"));
		System.out.println(queue);

		System.out.println("----------------------------");
		// Retrieve but not remove
		System.out.println("head:" + queue.element());
		System.out.println(queue);
		System.out.println("head:" + queue.peek());
		System.out.println(queue);
		// Retrieve and Remove
		System.out.println("poll:" + queue.poll()); 
		System.out.println(queue);

		System.out.println("----------------------------");
		// iterating the queue elements:
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of PriorityQueue (1) ^^^^^^^^^^^^^^^^ ");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
