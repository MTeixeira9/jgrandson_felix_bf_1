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
	
	
	//Base - [~T1 empty, ~T2 empty, ~T2 null, T1 & T2 empty] - escrever no relatorio 


	@Test
	public void teste_base() {
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(5,6,7,8);
		ArrayNTree<Integer> t1 = new ArrayNTree<>(l1,4);
		ArrayNTree<Integer> t2 = new ArrayNTree<>(l2,4);
		
		assertFalse(t1.equals(t2), "Teste_base");
	}
	 
	/*
	 * [t1,~t2,~t2,empty]
	 */
	@Test
	public void teste_t1() {
		//List<Integer> l1 = Arrays.asList(1); 
		ArrayNTree<Integer> t1 = new ArrayNTree<>(1);
		
		List<Integer> l2 = Arrays.asList(3,4);
		ArrayNTree<Integer> t2 = new ArrayNTree<>(l2,4);
		
		//t1.delete(1);
		
		assertFalse(t1.equals(t2), "Teste_1");
		
	}
	
	/*
	 * [~t1,t2,~t2,empty]
	 */
	@Test
	public void teste_t2() {
		
		List<Integer> l1 = Arrays.asList(1,2);
		
		ArrayNTree<Integer> t1 = new ArrayNTree<>(l1,4);
		ArrayNTree<Integer> t2 = new ArrayNTree<>(0);
		
		assertFalse(t1.equals(t2), "Teste_2");
	}
	
	/*
	 * [~t1,~t2,t2,empty]
	 */
	@Test
	public void teste_t3() {
		
		List<Integer> l1 = Arrays.asList(1,2);
		
		ArrayNTree<Integer> t1 = new ArrayNTree<>(l1,4);
		ArrayNTree<Integer> t2 = null;
		
		assertFalse(t1.equals(t2), "Teste_3");
	}
	
	/*
	 * [~t1,~t2,~t2,full]
	 */
	@Test
	public void teste_t4() {
		
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(1,2,3,4);
		
		ArrayNTree<Integer> t1 = new ArrayNTree<>(l1,4);
		ArrayNTree<Integer> t2 = new ArrayNTree<>(l2,4);
		
		assertTrue(t1.equals(t2), "Teste_4");
	}
	
	/*
	 * [~t1,~t2,~t2,partial]
	 */
	@Test
	public void teste_t5() {
		List<Integer> l1 = Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(2,3);
		
		ArrayNTree<Integer> t1 = new ArrayNTree<>(l1,4);
		ArrayNTree<Integer> t2 = new ArrayNTree<>(l2,4);
		
		assertFalse(t1.equals(t2), "Teste_5");
	}
}
