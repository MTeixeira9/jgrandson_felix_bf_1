package sut.line_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeMin {
	
	@Test
	public void test_Min_OneElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); 
		int m = v.min();
		assertEquals(1, m);
	}
}
