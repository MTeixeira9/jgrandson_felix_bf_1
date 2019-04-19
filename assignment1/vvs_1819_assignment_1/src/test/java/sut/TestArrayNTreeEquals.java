package sut;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestArrayNTreeEquals {

	@Test
	public void test_Equals_this() {

		List<Integer> l1 = Arrays.asList(1,2,3);

		ArrayNTree<Integer> v1 = new ArrayNTree<>(l1,2); 
		
		boolean res = v1.equals(v1);
		assertEquals(true,res);
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
	public void test_Equals_equalsTrees() {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(1,2,3,4);

		ArrayNTree<Integer> v1 = new ArrayNTree<>(l1,2); 
		ArrayNTree<Integer> v2 = new ArrayNTree<>(l2,2); 

		boolean res = v1.equals(v2);
		assertEquals(false,res);
	}
	
	
	@Test
	public void test_Equals_dentro_equalsTrees() {
		List<Integer> l1 = Arrays.asList(1,2,3);
		//List<Integer> l2 = Arrays.asList(1,2,3);

		ArrayNTree<Integer> one = new ArrayNTree<>(l1,2); 
		ArrayNTree<Integer> other = new ArrayNTree<>(l1,2); 
		
		boolean res = one.equals(other);
		assertEquals(true, res);
	}

}
