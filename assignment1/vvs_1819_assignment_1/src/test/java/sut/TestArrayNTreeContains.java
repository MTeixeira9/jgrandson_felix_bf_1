package sut;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestArrayNTreeContains {

	@Test
	public void test_Contain_Empty() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); //array empty, capacity = 2
		boolean res = v.contains(1);
		assertEquals(false, res);
	}
	
	@Test
	public void test_Contain_data() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); //array empty, capacity = 2
		boolean res = v.contains(1);
		assertEquals(true, res);
	}
	
	@Test
	public void test_Contain_leaf() {
		List<Integer> list = Arrays.asList(1,3,21,4,9,6,12,8,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		boolean res = v.contains(6);
		assertEquals(true, res);
	}

}