import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkyTest {

	@Test
	void test() {
		Linky link = new Linky();

		link.addLast(5);
		link.addLast(6);
		link.addLast(8);
		link.addLast(9);
//		link.insert(2, 7);
		System.out.println(link.size);

//		assertThrows(IndexOutOfBoundsException.class, () -> 
//            link.insert(-1,2), "index out of bounds should throw");
//        

	}
}
