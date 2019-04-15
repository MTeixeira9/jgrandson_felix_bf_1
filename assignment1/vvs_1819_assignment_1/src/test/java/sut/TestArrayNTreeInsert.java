package sut;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestArrayNTreeInsert {
	
	@Test
	public void test_Insert_1() {
		ArrayNTree<Integer> v = new ArrayNTree<>(2);
		v.insert(2); //isEmpty
		v.insert(2); //contains(elem)
		v.insert(1); //data.compareTo(elem)>0
		v.insert(3); //isLeaf()
	}
	
	@Test
	public void test_Insert_2() {
		List<Integer> list = Arrays.asList(2,3,4,5);
		ArrayNTree<Integer> v = new ArrayNTree<>(4);
		v.insert(1); //position == -1
	}
	
	@Test
	public void test_Insert_3() {
		List<Integer> list = Arrays.asList(4,10,11,13);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 6);
		v.insert(5);
	}
	
	@Test
	public void test_Insert_4() { //nega linha 177
		List<Integer> list = Arrays.asList(2,7,11,15,22,25,16,19);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 5);
		v.delete(22);
		v.delete(25);
		v.insert(18);
		
	}
	
	@Test
	public void test_Insert_5() { 
		List<Integer> list = Arrays.asList(2,7,11,15,25,30,17,18,19);
		ArrayNTree<Integer> v = new ArrayNTree<>(list, 5);
		v.delete(30);
		v.insert(16);
		
	}
	
	
}
