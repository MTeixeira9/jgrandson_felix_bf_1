package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeIsLeaf {
	
	//!B1 -> !empty
	//B2 -> nChildren == 0
	//B1 -> empty
	//!B2 -> nChildren != 0
	
	@Test
	/**
	 * B1 && B2
	 */
	public void testIsLeaf_EmptyTrue_ChildrenTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); // noh = 1, capacity = 2
		boolean res = v.isLeaf();
		assertEquals(true, res);
		
	}
	/*
	@Test
	public void testIsLeaf_EmptyTrue_ChildrenFalse() {
		List<Integer> list = Arrays.asList(1,2);
		
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); //arvore nao vazia com 1 filho
		boolean res = v.isLeaf();
		assertEquals(false, res);
	}
*/
	@Test
	public void testIsLeaf_EmptyFalse_ChildrenTrue() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		boolean res = v.isLeaf();
		assertEquals(false, res);
	}
	
	/*
	
	@Test
	public void testIsLeaf_EmptyFalse_ChildrenFalse() {
		//Impossível de cobrir, porque não é posível ter um ArrayNTree empty com filhos.
	}
	*/
}
