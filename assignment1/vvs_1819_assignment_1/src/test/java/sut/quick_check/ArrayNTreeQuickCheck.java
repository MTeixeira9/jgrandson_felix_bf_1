package sut.quick_check;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import sut.ArrayNTree;


@RunWith(JUnitQuickcheck.class)
public class ArrayNTreeQuickCheck {

	
	@Property (trials = 15)
	public void testOfInsertion(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {

		System.out.println("--- Inicio do teste 1.Insert ---");
		List<Integer> list_elem_original = tree.toList();
		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println("-ArrayNTree antes dos Inserts -");
		System.out.println(elem_clone.info());

		//para ter a capacidade da arvore
		for(Integer i : elem_clone) {
			elem_clone.delete(i);
		}

		Collections.shuffle(list_elem_original);

		//inserir os elementos com shuffle no clone
		for(Integer i : list_elem_original) {
			elem_clone.insert(i);
		}

		System.out.println("--- ArrayNTree depois dos Inserts ---");
		System.out.println(elem_clone.info());
		System.out.println();
		assertTrue(elem_clone.equals(tree));

	}

	
	@Property (trials=15)
	public void testOfRemoveAllElements(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {

		List<Integer> list_elem_original = tree.toList();

		System.out.println("--- Inicio do teste 2.Remove ---");
		
		System.out.println("- ArrayNTree antes dos Deletes -");
		System.out.println(tree.info());

		for(Integer i : list_elem_original) {
			tree.delete(i);
		}
		System.out.println("- ArrayNTree depois dos Deletes -");
		System.out.println(tree.info());

		System.out.println();
		assertTrue(tree.isEmpty());

	}

	 

	@Property (trials=15)
	public void testOfInsertAndRemove(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree, 
										@InRange(min="1" , max= "100") int i) {
		assumeTrue(!tree.contains(i));

		System.out.println();
		System.out.println();
		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println("--- Inicio do teste 3.InsertANDRemove ---");
		
		System.out.println("Elemento gerado = " + i);

		System.out.println("- ArrayNTree antes dos Deletes -");
		System.out.println(elem_clone.info());


		System.out.println("- ArrayNTree com Insert do elem gerado -");
		elem_clone.insert(i);
		System.out.println(elem_clone.info());

		elem_clone.delete(i);

		System.out.println("- ArrayNTree com Delete do elem gerado -");
		System.out.println(elem_clone.info());
		System.out.println();
		assertTrue(tree.equals(elem_clone));

	}

	
	@Property (trials=15)
	public void testOfInsertAllElements(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {

		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println("--- Inicio do teste 4.InsertAllElemnts  ---");
		
		System.out.println("- ArrayNTree antes de inserir todos os elementos novamente -");
		System.out.println(tree.info());
		
		for(Integer i : tree) {
			elem_clone.insert(i);
		}
		System.out.println("- ArrayNTree depois de inserir todos os elementos novamente -");
		System.out.println(elem_clone.info());

		System.out.println();
		assertTrue(tree.equals(elem_clone));

	}
	
	
	
	@Property (trials=15)
	public void testOfInsertAnElementSeveralTimes(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree,
													@InRange(min="1" , max= "100") int indice,
													@InRange(min="20" , max= "100") int nVezes) {
		
		assumeTrue(!tree.isEmpty());
		//assumeTrue(indice < tree.size());
		
		System.out.println("--- Inicio do teste 5.InsertAnElementSeveralTimes --- ");
		System.out.println("Indice gerado = " + indice);
		List<Integer> list_elem_original = tree.toList();
		
		while(indice > list_elem_original.size()-1 ) {
			indice = indice%list_elem_original.size();
		}
		
		ArrayNTree<Integer> elem_clone = tree.clone();
		
		System.out.println("- ArrayNTree antes de inserir o mesmo elem varias vezes -");
		System.out.println(tree.info());

		for(int y = 0; y<nVezes; y++) {
			elem_clone.insert(list_elem_original.get(indice));
		}
		
		System.out.println("- ArrayNTree depois de inserir o mesmo elem varias vezes -");
		System.out.println(elem_clone.info());

		System.out.println();
		assertTrue(tree.equals(elem_clone));

	}
	


}
