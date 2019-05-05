package sut.line_branch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeIsEmpty {

	/**
	 * Testar se uma ArrayNTree vazia estah vazia. Testar se eh verdade.
	 */
	@Test
	public void testIsEmptyTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); //array empty, capacity = 2
		boolean res = v.isEmpty();
		assertEquals(true, res);
	}
}
