package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeCountLeaves {

	/**
	 * Teste para verificar se uma ArrayNTree, constituida pela raiz e por mais um elemento,
	 * o numero de folhas eh 1
	 */
	@Test
	public void testSizeCountLeavesMoreElements() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		int leaves = v.countLeaves();
		assertEquals(1, leaves);
	}

}
