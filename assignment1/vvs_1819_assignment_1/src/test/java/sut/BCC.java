package sut;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BCC {

	// Tree 1 is empty
	// Tree 2 is empty
	// Tree 2 is null
	// Tree 1 intersection of Tree 2 is empty/full/partial
	
	//TESTE 1. Tree 1 is empty
		//Caso1: Estah empty
		//Caso2: NotEmpty
	
	/**
	 * Tree 1 is empty
	 */
	@Test
	public void test1_caso1() {
		
		ArrayNTree<Integer> v1 = new ArrayNTree<>(2); 
		boolean res = v1.isEmpty();
		
		assertEquals(true, res);
	}
	
	/**
	 * Tree 1 is not empty
	 */
	@Test
	public void test1_caso2() {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v1 = new ArrayNTree<>(l1,2); 
		boolean res = v1.isEmpty();
		
		assertEquals(false, res);
	}

	//TESTE 2. Tree 2 is empty
			//Caso1: Estah empty
			//Caso2: NotEmpty
		
	
	/**
	 * Tree 2 is empty
	 */
	@Test
	public void test2_caso1() {
		
		ArrayNTree<Integer> v2 = new ArrayNTree<>(2); 
		boolean res = v2.isEmpty();
		
		assertEquals(true, res);
	}
	
	/**
	 * Tree 2 is not empty
	 */
	@Test
	public void test2_caso2() {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v2 = new ArrayNTree<>(l1,2); 
		boolean res = v2.isEmpty();
		
		assertEquals(false, res);
	}
	
	//TESTE 3. Tree 2 is null
		//Caso1: Estah null
		//Caso2: Not null
	
	
	/**
	 * Tree 2 is null
	 */
	@Test
	public void test3_caso1() {
		
		List<Integer> l1 = null;
		ArrayNTree<Integer> v2 = new ArrayNTree<>(l1,2); 
		boolean res = v2.contains(1);
		
		assertEquals(false, res);
	}
	
	/**
	 * Tree 2 is not null
	 */
	@Test
	public void test3_caso2() {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v2 = new ArrayNTree<>(l1,2); 
		boolean res = v2.contains(1);
		
		assertEquals(true, res);
	}
	
	//TESTE 4. Tree 1 intersection of Tree 2 is empty/full/partial
			//Caso1: Tree 1 intersection of Tree 2 is empty
			//Caso2: Tree 1 intersection of Tree 2 is full
			//Caso3: Tree 1 intersection of Tree 2 is partial
	
	/**
	 * Tree 1 intersection of Tree 2 is empty
	 */
	@Test
	public void test4_caso1() {

		ArrayNTree<Integer> one = new ArrayNTree<>(2); 
		
		List<Integer> l2 = Arrays.asList(1,2,3);
		ArrayNTree<Integer> two = new ArrayNTree<>(l2,2); 
		
	}
	
	/**
	 * Tree 1 intersection of Tree 2 is full
	 */
	@Test
	public void test4_caso2() {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		ArrayNTree<Integer> one = new ArrayNTree<>(2); 
		
		List<Integer> l2 = Arrays.asList(1,2,3);
		ArrayNTree<Integer> two = new ArrayNTree<>(l2,2); 
	}
	
	/**
	 * Tree 1 intersection of Tree 2 is partial
	 */
	@Test
	public void test4_caso3() {
		
	}
	
}
