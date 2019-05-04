package sut;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrayNTreeClone {

	@Test
	public void test_clone() {

		List<Integer> list = Arrays.asList(1,2);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2);
		ArrayNTree<Integer> clone = v.clone();
		assertEquals(v, clone);


	}


}
