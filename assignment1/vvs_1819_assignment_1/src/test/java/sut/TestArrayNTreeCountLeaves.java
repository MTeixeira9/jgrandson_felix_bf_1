package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeCountLeaves {

	@Test
	public void testSizeCountLeavesMoreElements() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		int leaves = v.countLeaves();
		assertEquals(1, leaves);
	}

}
