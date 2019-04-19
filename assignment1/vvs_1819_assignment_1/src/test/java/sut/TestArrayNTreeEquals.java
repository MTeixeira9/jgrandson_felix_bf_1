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
	
	/*
	@Test
	public void test_Equals_dentro_equalsTrees() {
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(1,2,3);

		ArrayNTree<Integer> one = new ArrayNTree<>(l1,2); 
		ArrayNTree<Integer> other = new ArrayNTree<>(l2,2); 
		
		Iterator it1 = one.iterator();
		Iterator it2 = other.iterator();
		boolean res = true;
		
		while(it1.hasNext() && it2.hasNext()) {
			if(it1.next() != it2.next()) {
				res = false;
			}
			it1.next();
			it2.next();
		}
			assertEquals(false, res);
	}*/

}
