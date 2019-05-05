package sut.logic_based_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestPC {

	@Test
	public void p1() {
		System.out.println("P1");
		ArrayNTree<Integer> tree = new ArrayNTree<>(2);
		tree.insert(null);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void p2() {
		System.out.println("P2");
		List<Integer> list = Arrays.asList(1);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(1);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void p3() {
		System.out.println("P3");
		List<Integer> list = Arrays.asList(2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(1);
		System.out.println(tree.info());
		System.out.println();
	}
	
	

	@Test
	public void p4 () {
		System.out.println("P4");
		List<Integer> list = Arrays.asList(1);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(2);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void p5() {
		System.out.println("P5");
		List<Integer> list = Arrays.asList(2,4);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(3);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void p6p7() {
		System.out.println("P6 e P7");
		List<Integer> list = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(3);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void P8() {
		System.out.println("P8");
		List<Integer> list = Arrays.asList(2,7,11,15,25,30,18,19);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		tree.delete(30);
		tree.insert(20);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void p9P10() {
		System.out.println("P9 e P10");
		List<Integer> list = Arrays.asList(2,7,11,15,16,19);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		tree.insert(18);
		System.out.println(tree.info());
		System.out.println();
	}


}
