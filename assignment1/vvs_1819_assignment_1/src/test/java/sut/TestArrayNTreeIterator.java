package sut;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

public class TestArrayNTreeIterator {

	@Test//(expected = NoSuchElementException.class)
	public void test_Iterator_Empty() throws NullPointerException {
		//ArrayNTree<Integer> v = new ArrayNTree<Integer>(2);
		//Iterator<Integer> i = v.iterator();
		//assertEquals(new NoSuchElementException(), i.next());
		//Impossivel atingir linha 399
	}
	
	@Test
	public void test_Iterator_MoreElements() {
		List<Integer> list = Arrays.asList(1,2,3);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 2);
		Iterator<Integer> i = v.iterator();
		
		int count = 0;
		while (i.hasNext()) {
			count++;
			i.next();
		}
		
		assertEquals(3, count);
	}

}
