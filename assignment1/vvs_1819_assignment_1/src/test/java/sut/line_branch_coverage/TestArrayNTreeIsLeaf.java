package sut.line_branch_coverage;

import static org.junit.Assert.*;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeIsLeaf {
	
	/**
	 * Teste para ver se uma ArrayNTree soh composta pela raiz eh folha, ou seja, 
	 * nao estah vazia e o numero de filhos eh zero. Testar se eh true.
	 */
	@Test
	public void testIsLeaf_EmptyTrue_ChildrenTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); // noh = 1, capacity = 2
		boolean res = v.isLeaf();
		assertEquals(true, res);
	}

	/**
	 * Teste para ver se uma ArrayNTree vazia eh folha. Testar se eh false.
	 */
	@Test
	public void testIsLeaf_EmptyFalse_ChildrenTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		boolean res = v.isLeaf();
		assertEquals(false, res);
	}
}
