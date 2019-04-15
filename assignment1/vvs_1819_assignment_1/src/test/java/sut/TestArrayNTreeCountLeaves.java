package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeCountLeaves {

	/*
	@Test
	public void testCountLeavesNoElements() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		int leaves = v.countLeaves();
		assertEquals(0, leaves);
	}

	@Test
	public void testSizeCountLeavesOneElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 1);
		int leaves = v.countLeaves();
		assertEquals(1, leaves);
	}
*/

	@Test
	public void testSizeCountLeavesMoreElements() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		int leaves = v.countLeaves();
		assertEquals(1, leaves);
	}

}
