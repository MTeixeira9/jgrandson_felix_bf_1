package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeDelete {

	/**
	 * Teste para verificar se numa ArrayNTree vazia, ao apagar um elemento 
	 * qualquer, o seu tamanho eh 0
	 */
	@Test
	public void test_Delete_Capacity_Empty() { 
		ArrayNTree<Integer> v = new ArrayNTree<>(2);
		v.delete(1);
		assertEquals(0,v.size());
	}
	
	/**
	 * Teste para verificar uma ArrayNTree nao vazia, que nao contem o
	 * elemento 1, apagar o elemento 1
	 */	
	@Test
	public void test_Delete_2() {
		List<Integer> list = Arrays.asList(2,3,4);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		v.delete(1);
		assertEquals(3,v.size());
	}
	
	/**
	 * Teste para verificar uma ArrayNTree em que se apaga o seu elemento da 
	 * raiz
	 */
	@Test
	public void test_Delete_3() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 2);
		v.delete(1);
		assertEquals(0,v.size());
	}
	
	/**
	 * Teste para verificar uma ArrayNTree com o elemento 1 na raiz e com 
	 * o elemento 2 como filho do 1, apagar o elemento 2
	 */
	@Test
	public void test_Delete_4() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 2);
		v.delete(2);
		assertEquals(1,v.size());
	} 
	
	/**
	 * Teste para verificar uma ArrayNTree com 3 niveis e apagar um dos 
	 * elementos do nivel do meio
	 */
	@Test
	public void test_Delete_5() { 
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		v.delete(3);
		assertEquals(4,v.size());
	}
	
	/**
	 * Teste para verificar se uma ArrayNTree nao vazia o elemento a apagar eh ´
	 * maior que todos os filhos
	 */
	@Test
	public void test_Delete_6() {
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		v.delete(7);
		assertEquals(5,v.size());
	}
	
	/**
	 * Teste para verificar se uma ArrayNTree nao vazia o elemento a apagar eh ´
	 * menor que todos os filhos, logo nao se encontra na arvore
	 */
	@Test
	public void test_Delete_7() {
		List<Integer> list = Arrays.asList(1,3,4,5,6,7);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 3);
		v.delete(2);
		assertEquals(6,v.size());
	}

}
