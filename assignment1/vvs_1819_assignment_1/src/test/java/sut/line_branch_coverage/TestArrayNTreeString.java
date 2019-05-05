package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeString {

	/**
	 * Teste para ver o toString de uma ArrayNTree com elementos
	 */
	@Test
	public void test_ToString() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		String s = v.toString();
		assertEquals(s, v.toString());
	}
	
	/**
	 * Teste para ver o toString de uma ArrayNTree vazia
	 */
	@Test
	public void test_ToStringEmpty() {
		List<Integer> list = Arrays.asList();
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		String s = v.toString();
		assertEquals(s, v.toString());
	}
	
	/**
	 * Teste para imprimir uma ArrayNTree sem elemtos com o método info() 
	 */
	@Test
	public void test_StringInfo() {
		List<Integer> list = Arrays.asList();
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		String s = v.info();
		assertEquals(s, v.info());
	}
}
