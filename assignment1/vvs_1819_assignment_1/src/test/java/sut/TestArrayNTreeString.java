package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeString {

	@Test
	public void test_ToString() {
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		String s = v.toString();
		assertEquals(s, v.toString());
	}
	
	@Test
	public void test_ToStringEmpty() {
		List<Integer> list = Arrays.asList();
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		String s = v.toString();
		assertEquals(s, v.toString());
	}
	
	@Test
	public void test_StringInfo() {
		List<Integer> list = Arrays.asList();
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		String s = v.info();
		assertEquals(s, v.info());
	}
	
	

}
