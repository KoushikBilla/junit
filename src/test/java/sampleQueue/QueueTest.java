package sampleQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class QueueTest {

	private static final String FIRST_ITEM = "first-string";
	private static final String SECOND_ITEM = "second-string";
	private Queue<String> queue;


	@BeforeEach
	void init() {
		this.queue = new Queue<String>();
	}

	@Test
	@DisplayName("This test case is to verify that Queue isEmpty when queue is initialized")
	void isEmptyMethodShouldGiveTrueOnQueueInit() {
		assertTrue(queue.isEmpty());
	}


	@Test
	@DisplayName("This test case is to verify that Queue isEmpty when queue is initialized (second constructor), check size")
	void isEmptyMethodShouldGiveTrueOnQueueInit2() {

		this.queue = new Queue<String>(9);
		assertTrue(queue.isEmpty());
		assertEquals(queue.size(),0);
		queue.enqueue(FIRST_ITEM);
		assertEquals(queue.size(),1);
	}
	
	
	@Test
	@DisplayName("This test case is to verify that the enqueue, dequeue and peek works for single object")
	void singleObjectOfEnqueueTest() {

		queue.enqueue(FIRST_ITEM);
		assertFalse(queue.isEmpty());
		assertEquals(queue.peek(),FIRST_ITEM);
		assertEquals(queue.dequeue(),FIRST_ITEM);
		assertThrows(NoSuchElementException.class, () -> {queue.peek();});
		assertThrows(NoSuchElementException.class, () -> {queue.dequeue();});
		}
	
	@Test
	@DisplayName("This test case is to verify that enqueue, dequeue and peek works for two objects")
	void twoObjectOfQueueTest() {

		queue.enqueue(FIRST_ITEM);
		queue.enqueue(SECOND_ITEM);
		assertEquals(queue.peek(),FIRST_ITEM);
		assertEquals(queue.dequeue(),FIRST_ITEM);
		assertEquals(queue.peek(),SECOND_ITEM);
		assertEquals(queue.dequeue(),SECOND_ITEM);
		//assertThrows(NoSuchElementException.class, () -> {queue.peek();});
		assertThrows(NoSuchElementException.class, () -> {queue.dequeue();});
	}
	
	@Test
	@DisplayName("This test case is to verify that the enqueue, dequeue and peek works for three objects")
	void threeObjectOfQueueTest() {

		queue.enqueue(FIRST_ITEM);
		queue.enqueue(SECOND_ITEM);
		queue.enqueue(FIRST_ITEM);
		assertEquals(queue.peek(),FIRST_ITEM);
		assertEquals(queue.dequeue(),FIRST_ITEM);
		assertEquals(queue.peek(),SECOND_ITEM);
		assertEquals(queue.dequeue(),SECOND_ITEM);
		assertEquals(queue.peek(),FIRST_ITEM);
		assertEquals(queue.dequeue(),FIRST_ITEM);
		assertThrows(NoSuchElementException.class, () -> {queue.peek();});
		//assertThrows(NoSuchElementException.class, () -> {queue.dequeue();});
	}
	

	@Test
	@DisplayName("This test case is to verify that enqueue does not add objects past maximum")
	void maximumTest() {

		this.queue = new Queue<String>(3);

		queue.enqueue(FIRST_ITEM);
		queue.enqueue(FIRST_ITEM);
		queue.enqueue(FIRST_ITEM);
		assertThrows(Exception.class, () -> {queue.enqueue(FIRST_ITEM);});
		}
	
	@Test
	@DisplayName("This test case is to verify that toString works")
	void toStringMethodTest() {

		queue.enqueue(FIRST_ITEM);
		assertEquals(queue.toString(),FIRST_ITEM+" ");
		queue.enqueue(SECOND_ITEM);
		assertEquals(queue.toString(),FIRST_ITEM+" "+SECOND_ITEM+" ");
	}
	
	

	
	@Test
	@DisplayName("This test case is to verify that removeAll works")
	void removeAllMethodTest() {

		queue.enqueue(FIRST_ITEM);
		queue.enqueue(SECOND_ITEM);
		queue.enqueue(SECOND_ITEM);
		queue.enqueue(SECOND_ITEM);
		queue.removeAll();
		assertTrue(queue.isEmpty());
	}
	
	
	@Test
	@DisplayName("This test case is to print the size of the queue")
	void printTheSizeOfQueue() {
		this.queue = new Queue<String>(3);

		queue.enqueue(FIRST_ITEM);
		queue.enqueue(FIRST_ITEM);
		queue.enqueue(FIRST_ITEM);
		System.out.println("(" + queue.size() + " left on queue)");
		//assertEquals("(3 left on queue)", "(" + queue.size() + " left on queue)");
		//assertEquals(System.out.println("(" + queue.size() + " left on queue)"), queue.main(null));
	}
	


	
}