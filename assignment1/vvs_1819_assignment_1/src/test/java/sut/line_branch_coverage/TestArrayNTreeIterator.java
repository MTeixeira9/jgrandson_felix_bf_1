package sut.line_branch_coverage;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeIterator {
	
	/**
	 * Teste para iterar sobre uma ArrayNTree vazia
	 */
	@Test(expected = NoSuchElementException.class)
	public void test_Iterator_Empty()  {
		ArrayNTree<Integer> v = new ArrayNTree<Integer>(2);
		Iterator<Integer> i = v.iterator();
		i.next();
	}
	
	/**
	 * Teste para iterar sobre uma ArrayNTree com mais elementos , usando os 
	 * metodos next() e hasNext(), para depois testar se o número de nexts eh 
	 * igual ao numero de elemetos da ArrayNTree
	 */
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
