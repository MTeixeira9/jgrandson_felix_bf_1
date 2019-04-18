package sut;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestArrayNTreeEquals {

	@Test
	public void test_Equals_this() {

		Object other = this;
		boolean res = other.equals(other);
		assertEquals(true, res);
	}
	
	@Test
	public void test_Equals_other() {
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		
		ArrayNTree<Integer> v1 = new ArrayNTree<>(l1,2); 
		Object other = this;
		
		boolean res = v1.equals(other);
		assertEquals(false,res);

	}
	

	@Test
	public void test_Equals_2() {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(1,2,3,4);
		
		ArrayNTree<Integer> v1 = new ArrayNTree<>(l1,2); 
		ArrayNTree<Integer> v2 = new ArrayNTree<>(l2,2); 
		
		boolean res = v1.equals(v2);
		assertEquals(false,res);
	}
	/*
	@Test
	public void test_Equals_3() {
		//List<Integer> l1 = Arrays.asList(1,2,3);
		
		ArrayNTree<Integer> v1 = new ArrayNTree<>(l1,2); 
		ArrayNTree<Integer> v2 = new ArrayNTree<>(l1,2); 
		
		boolean res = v1.equals(v2);
		
		assertEquals(true,res);
	}
	*/
	
	
	/*
	@Test
	public void test_Equals_Empty() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2);
		
		
		boolean res = v.equals(null);
		assertEquals(false,res);
	}
	*/
}
