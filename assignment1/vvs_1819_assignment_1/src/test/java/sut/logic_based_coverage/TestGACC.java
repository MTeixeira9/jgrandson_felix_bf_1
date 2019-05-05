package sut.logic_based_coverage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sut.ArrayNTree;

public class TestGACC {

	@Test
	public void t1() {
		System.out.println("T1");
		ArrayNTree<Integer> tree = new ArrayNTree<>(2);
		tree.insert(1);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t2() {
		System.out.println("T2");
		List<Integer> list = Arrays.asList(1);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(1);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t3() {
		System.out.println("T3");
		List<Integer> list = Arrays.asList(1);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(2);
		System.out.println(tree.info());
		System.out.println();
	}
	
	

	@Test
	public void t4 () {
		System.out.println("T4");
		List<Integer> list = Arrays.asList(1,2);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(3);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t5() {
		System.out.println("T5");
		List<Integer> list = Arrays.asList(2,3);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 2);
		tree.insert(1);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t6() {
		System.out.println("T6");
		List<Integer> list = Arrays.asList(2,7,11,15,20,21,16,19);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		tree.delete(20);
		tree.delete(21);
		tree.insert(18);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t7() {
		System.out.println("T7");
		List<Integer> list = Arrays.asList(2,7,11,15,25,30,18,19);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 5);
		tree.delete(30);
		tree.insert(20);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t8() {
		System.out.println("T8");
		List<Integer> list = Arrays.asList(2,7,11,15,16,19);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		tree.insert(18);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t9() {
		System.out.println("T9");
		List<Integer> list = Arrays.asList(2,7,11,16,19,20);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		tree.insert(18);
		System.out.println(tree.info());
		System.out.println();
	}
	
	@Test
	public void t10() {
		System.out.println("T10");
		List<Integer> list = Arrays.asList(2,7,11,16,19,20);  
		ArrayNTree<Integer> tree = new ArrayNTree<>(list, 3);
		tree.insert(21);
		System.out.println(tree.info());
		System.out.println();
	}

}
