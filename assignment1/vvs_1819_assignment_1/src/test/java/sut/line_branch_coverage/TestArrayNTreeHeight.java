package sut.line_branch_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestArrayNTreeHeight {	
	
	/**
	 * Teste para verificar a altura de uma ArrayNTree vazia
	 */
	@Test
	public void test_Height_noElements(){
		ArrayNTree<Integer> v = new ArrayNTree<>(2); 
		int height = v.height();
		assertEquals(0, height);

	}
	
	/**
	 * Teste para verificar a altura de uma ArrayNTree nao vazia
	 */
	@Test
	public void test_Height_MoreElements(){
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		ArrayNTree<Integer> v = new ArrayNTree<>(list,2); 
		int height = v.height();
		assertEquals(3, height);
	}

}
