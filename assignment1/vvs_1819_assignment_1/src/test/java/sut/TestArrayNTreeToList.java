package sut;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeToList {

	
	@Test
	public void test_toList() {
		
		List<Integer> list = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		List<Integer> test = v.toList();
		List<Integer> expect = new LinkedList();
		expect.add(1);
		expect.add(2);
		expect.add(3);
		assertEquals(expect, test);
		
		
	}
	

}
