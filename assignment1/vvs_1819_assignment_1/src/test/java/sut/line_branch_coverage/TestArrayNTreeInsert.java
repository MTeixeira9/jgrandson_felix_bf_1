package sut.line_branch_coverage;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeInsert {
	/**
	 * Testar, um insert numa ArrayNTree vazia. - v.insert(2)
	 * Testar inserir um elemento que jah lah esteja para testar 
	 * o contains(elem) - v.insert(2)
	 * Testar inserir um elemento menor que a raiz - v.insert(1)
	 * Testar inserir um elemento que seja folha - v.insert(3)
	 */
	@Test
	public void test_Insert_1() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2);
		v.insert(2); //isEmpty
		v.insert(2); //contains(elem)
		v.insert(1); //data.compareTo(elem)>0
		v.insert(3); //isLeaf()
		assertEquals(3, v.size());
	} 
	
	
	/**
	 * Testar se numa ArrayNTree hah espaco disponivel nos filhos da raiz 
	 * mas como o elemento a inserir eh maior que todos os filhos da raiz, 
	 * ele vai verificar se o elemento eh maior que os filhos 
	 * da sua proposePosition-1   
	 * Nega a instrucao -> if (elem.compareTo(children[position-1].max())>0)
	 * entra na instrucao -> children[position-1].insert(elem);
	 */
	@Test
	public void test_Insert_2() { //nega linha 177
		List<Integer> list = Arrays.asList(2,7,11,15,22,25,16,19);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 5);
		v.delete(22);
		v.delete(25);
		v.insert(18);
		assertEquals(7, v.size());		
	}
	
	
	/**
	 * Testar se numa ArrayNTree o numero de filhos da raiz eh menor que a 
	 * capacidade e o elemento a inserir eh menor que todos os filhos da 
	 * proposePosition
	 * else if (nChildren<capacity && elem.compareTo(children[position].max())>0)
	 * Na instrucao acima, a primeira clausula eh true e a segunda eh false.
	 */
	@Test
	public void test_Insert_3() { 
		List<Integer> list = Arrays.asList(2,7,11,15,25,30,17,18,19);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 5);
		v.delete(30);
		v.insert(16);
		assertEquals(9, v.size());
	
	}
	
	
}
