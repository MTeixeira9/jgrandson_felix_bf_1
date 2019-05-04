package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeDelete {

	@Test
	public void test_Delete_Capacity_Empty() { //if(isEmpty() || data.compareTo(elem)>0)
		ArrayNTree<Integer> v = new ArrayNTree<>(2);
		v.delete(1);
		assertEquals(0,v.size());
	}
	
	@Test
	public void test_Delete_Capacity_OneElement_IsLeaf2() { //if(isEmpty() || data.compareTo(elem)>0)
		List<Integer> list = Arrays.asList(2,3,4);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		v.delete(1);
		assertEquals(3,v.size());
	}
	
	@Test
	public void test_Delete_Capacity_OneElement_IsLeaf3() { //isLeaf && delete->raiz
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 2);
		v.delete(1);
		assertEquals(0,v.size());
	}
	
	@Test
	public void test_Delete_Capacity_OneElement_IsLeaf4() { //isLeaf && delete->!raiz
		ArrayNTree<Integer> v = new ArrayNTree<>(1, 2);
		v.delete(2);
		assertEquals(1,v.size());
	} 
	
	@Test
	public void test_Delete_Capacity_OneElement_IsLeaf5() { //!isLeaf && !raiz
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		v.delete(3);
		assertEquals(4,v.size());
	}
	
	@Test
	public void test_Delete_Capacity_OneElement_6() {
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		v.delete(7);
		assertEquals(5,v.size());
	}
	
	@Test
	public void test_Delete_Capacity_OneElement_7() {
		List<Integer> list = Arrays.asList(1,3,4,5,6,7);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 3);
		v.delete(2);
		assertEquals(6,v.size());
	}

}
