package sut.line_branch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeIsLeaf {
	
	@Test
	public void testIsLeaf_EmptyTrue_ChildrenTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); // noh = 1, capacity = 2
		boolean res = v.isLeaf();
		assertEquals(true, res);
	}

	@Test
	public void testIsLeaf_EmptyFalse_ChildrenTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		boolean res = v.isLeaf();
		assertEquals(false, res);
	}
}
