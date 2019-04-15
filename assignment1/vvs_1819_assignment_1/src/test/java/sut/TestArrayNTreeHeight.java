package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeHeight {

	
	
	@Test
	public void test_Height_noElements(){
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		int height = v.height();
		assertEquals(0, height);

	}
	
	/*
	
	@Test
	public void test_Height_OneElement(){
		ArrayNTree<Integer> v = new ArrayNTree<>(1,2); 
		int height = v.height();
		assertEquals(1, height);

	}
	
	*/
	
	@Test
	public void test_Height_MoreElements(){
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		int height = v.height();
		assertEquals(3, height);
	}

}
