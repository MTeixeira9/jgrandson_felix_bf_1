package sut;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayNTreeIsEmpty {

	@Test
	public void testIsEmptyTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); //array empty, capacity = 2
		boolean res = v.isEmpty();
		assertEquals(true, res);
	}
	/*
	@Test
	public void testIsEmptyFalse() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 2); //data = 1, capacity = 2
		boolean res = v.isEmpty();
		assertEquals(false, res);
	}	
*/
}
