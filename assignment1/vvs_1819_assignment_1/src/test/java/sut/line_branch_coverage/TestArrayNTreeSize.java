package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeSize {
	
	/**
	 * Teste para ver o tamanho de uma ArrayNTree que não tem elementos, e 
	 * testar se o seu tamanho eh zero
	 */
	@Test
	public void testSizeNoElements() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		int size = v.size();
		assertEquals(0, size);
	}

	/**
	 * Teste para ver o tamanho de uma ArrayNTree com um elemento, e 
	 * testar se o seu tamanho eh 1
	 */
	@Test
	public void testSizeOneElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 1);
		int size = v.size();
		assertEquals(1, size);
	}


	/**
	 * Teste para ver o tamanho de uma ArrayNTree varios (2) elementos, e 
	 * testar se o seu tamanho eh 2
	 */
	@Test
	public void testSizeMoreElements() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,3);
		int size = v.size();
		assertEquals(2, size);
	}

}
