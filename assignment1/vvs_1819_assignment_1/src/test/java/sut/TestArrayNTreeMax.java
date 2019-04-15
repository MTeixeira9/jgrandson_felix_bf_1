package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeMax {

	/*
	@Test
	public void test_Max_OneElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); 
		int m = v.max();
		assertEquals(1, m);
	}
	
	*/
	
	@Test
	public void test_Max_MoreElements() {
		List<Integer> list = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		int m = v.max();
		assertEquals(3, m);
	}
}
