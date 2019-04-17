package sut;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestArrayNTreeClone {

	@Test
	public void test_clone() {
		
		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		ArrayNTree<Integer> clone = v.clone();
		assertEquals(v, clone);
		
		
	}
	

}
