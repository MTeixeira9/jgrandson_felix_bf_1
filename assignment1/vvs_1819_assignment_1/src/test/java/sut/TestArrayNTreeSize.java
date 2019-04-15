package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeSize {
	
	/*
	@Test
	public void testSizeNoElements() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		int size = v.size();
		assertEquals(1, size);
	}

	@Test
	public void testSizeOneElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 1);
		int size = v.size();
		assertEquals(1, size);
	}

*/
	@Test
	public void testSizeMoreElements() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,3);
		int size = v.size();
		assertEquals(2, size);
	}

}
