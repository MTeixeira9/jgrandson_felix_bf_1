package sut;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;


@RunWith(JUnitQuickcheck.class)
public class ArrayNTreeQuickCheck {

	@Property
	public void testOfInsertion(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {
		
		List<Integer> list_elem_original = tree.toList();
		ArrayNTree<Integer> elem_clone = tree.clone();
		
		//para ter a capacidade da arvore
		for(Integer i : elem_clone) {
			elem_clone.delete(i);
		}
		
		Collections.shuffle(list_elem_original);
		
		//inserir os elementos com shuffle no clone
		for(Integer i : list_elem_original) {
			elem_clone.insert(i);
		}
		
		assertTrue(elem_clone.equals(tree));
		
		
	}
}
