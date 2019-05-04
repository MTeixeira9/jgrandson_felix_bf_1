package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeMax {
	
	@Test
	public void test_Max_NoElement() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		assertEquals(null, v.max());
	}
	
	@Test
	public void test_Max_MoreElements() {
		List<Integer> list = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		int m = v.max();
		assertEquals(3, m);
	}
}
