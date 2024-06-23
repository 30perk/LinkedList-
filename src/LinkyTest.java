import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkyTest {

	@Test
	void addPhirst() {
		Linky link = new Linky();
		
		link.addLast("last");
		link.addFirst(1);
		link.addFirst(2);
		link.addFirst(false);
		link.removeLast();
		link.removeLast();

		link.removeLast();

		link.removeLast();
		System.out.println(link.contains(1));

//		System.out.println(link.contains(false));

		
		
//		link.addFirst(1);
//		assertEquals(1, link.size());
//		link.addFirst(2);
//		assertEquals(2, link.size());
//		assertEquals(2,link.get(0));
//		link.addFirst("hi");
//		assertEquals("hi", link.get(0));
//		assertEquals(1,link.get(2));
//		assertEquals(3, link.size());
//		assertThrows(IndexOutOfBoundsException.class, () -> {
//			link.get(-1);
//		});
//		
//		assertThrows(IndexOutOfBoundsException.class, () -> {
//			link.get(8);
//		});
//		
//		assertEquals(3, link.size());
	}
	
	void toLast() {
		Linky link = new Linky();
		
		link.addLast(1);
		link.addLast(2);
		assertEquals(1, link.get(1));
		assertEquals(8, link.size());
		

		
	}
	
	
	void removeUno() {
//		Linky link = new Linky();
//		
//		link.addLast(1);
//		link.addLast(2);
//		assertEquals(3, link.size());
	}
	
	void removeLast() {
		Linky link = new Linky();
		
		link.addFirst(1);
		link.addLast(2);
		assertEquals(3, link.get(0));
		
	}
	
	
	void contains() {
		
	}
	
	void get() {
		
	}
//	void test() {
//		Linky link = new Linky();
//
//		link.addLast(5);
//		link.addLast(6);
//		link.addLast(8);
//		link.addLast(9);
////		link.insert(2, 7);
//		System.out.println(link.size);
//
////		assertThrows(IndexOutOfBoundsException.class, () -> 
////            link.insert(-1,2), "index out of bounds should throw");
////        
//
//	}
}
