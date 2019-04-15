package sut;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestArrayNTreeMin {
	
	@Test
	public void test_Min_OneElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); 
		int m = v.min();
		assertEquals(1, m);
	}
	
	/*
	@Test
	public void test_Min_MoreElements() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		int m = v.min();
		assertEquals(1, m);
	}

*/
}
