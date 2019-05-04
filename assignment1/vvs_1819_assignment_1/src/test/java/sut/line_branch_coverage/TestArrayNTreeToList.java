package sut.line_branch_coverage;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeToList {
	
	@Test
	public void test_toList_NoElements() {		
		//List<Integer> list = Arrays.asList(1);
		ArrayNTree<Integer> v = new ArrayNTree<>(2);
		List<Integer> test = v.toList();
		assertEquals(0, test.size());
	}
	
	@Test
	public void test_toList_MoreElements() {		
		List<Integer> list = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		List<Integer> test = v.toList();
		List<Integer> expect = new LinkedList<Integer>();
		expect.add(1);
		expect.add(2);
		expect.add(3);
		assertEquals(expect, test);
	}
}
