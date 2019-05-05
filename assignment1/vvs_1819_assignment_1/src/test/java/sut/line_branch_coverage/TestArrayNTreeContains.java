package sut.line_branch_coverage;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeContains {

	/**
	 * Teste para verificar se uma ArrayNTree vazia contem o elemento 1
	 */
	@Test
	public void test_Contain_Empty() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		boolean res = v.contains(1);
		assertEquals(false, res);
	}

	/**
	 * Teste para verificar se numa ArrayNTree se encontra o elemento 1 
	 * sendo que esse elemento eh a raiz da própria arvore
	 */
	@Test
	public void test_Contain_data() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); //array empty, capacity=2
		boolean res = v.contains(1);
		assertEquals(true, res);
	}

	/**
	 * Teste para verificar se numa ArrayNTree se encontra o elemento 6 
	 * sendo que esse elemento nao eh a raiz da própria arvore
	 */
	@Test
	public void test_Contain_leaf() {
		List<Integer> list = Arrays.asList(1,3,21,4,9,6,12,8,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		boolean res = v.contains(6);
		assertEquals(true, res);
	}

}
