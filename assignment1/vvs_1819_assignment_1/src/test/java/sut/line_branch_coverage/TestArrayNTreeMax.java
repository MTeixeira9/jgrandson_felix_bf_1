package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeMax {
	
	/**
	 * Teste para ver o maximo de uma ArrayNTree com zero elementos, e testar 
	 * se eh igual a null
	 */
	@Test
	public void test_Max_NoElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		assertEquals(null, v.max());
	}
	
	/**
	 * Teste para ver o maximo de uma ArrayNTree com mais elementos, e testar 
	 * se eh ao maior filho da arvore
	 */
	@Test
	public void test_Max_MoreElements() {
		List<Integer> list = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		int m = v.max();
		assertEquals(3, m);
	}
}
