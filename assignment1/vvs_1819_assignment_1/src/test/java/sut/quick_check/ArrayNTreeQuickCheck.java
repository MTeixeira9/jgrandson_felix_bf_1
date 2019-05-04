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

	/*
	@Property (trials = 1000)
	public void testOfInsertion(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {

		System.out.println("------------------Inicio do teste Insert -------------------");
		List<Integer> list_elem_original = tree.toList();
		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println(tree.info());
		System.out.println("------------------------------------------------------------");

		System.out.println("--------LISTA DE ELEMTOS DA ARVORE ANTES DE INSERT----------");
		System.out.println();
		System.out.println(list_elem_original.toString());

		//para ter a capacidade da arvore
		for(Integer i : elem_clone) {
			elem_clone.delete(i);
		}

		Collections.shuffle(list_elem_original);

		//inserir os elementos com shuffle no clone
		for(Integer i : list_elem_original) {
			elem_clone.insert(i);
		}

		System.out.println("---------------------ARVORE COM INSERTS--------------------------");
		System.out.println(elem_clone.info());

		assertTrue(elem_clone.equals(tree));


	}
*/
	 
/*
	
	@Property (trials=10000)
	public void testOfRemoveAllElements(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {

		List<Integer> list_elem_original = tree.toList();

		System.out.println("------------------Inicio do teste REMOVE -------------------");
		System.out.println(tree.info());
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("--------LISTA DE ELEMTOS DA ARVORE ANTES DE DELETE----------");
		System.out.println();
		System.out.println(list_elem_original.toString());

		for(Integer i : list_elem_original) {
			tree.delete(i);
		}
		System.out.println("---------------------ARVORE VAZIA--------------------------");
		System.out.println(tree.info());

		System.out.println("-----------------------------------------------------------");
		System.out.println();
		assertTrue(tree.isEmpty());

	}

	 */

	
/*
	@Property (trials=10000)
	public void testOfInsertAndRemove(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree, 
										@InRange(min="1" , max= "100") int i) {
		while(tree.contains(i)) {
			i = (i+1) %100;
		}

		System.out.println();
		System.out.println();
		List<Integer> list_elem_original = tree.toList();
		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println("Elemento gerado = " + i);

		System.out.println("------------------Inicio do teste Insert AND Remove -------------------");
		System.out.println(elem_clone.info());
		System.out.println("------------------------------------------------------------");
		System.out.println();


		System.out.println("----------------TREE com insert do elemento gerado---------------");
		elem_clone.insert(i);
		System.out.println(elem_clone.info());
		System.out.println();

		elem_clone.delete(i);

		System.out.println("---------------TREE depois do delete do elemento gerado----------");
		System.out.println(elem_clone.info());
		System.out.println();

		System.out.println("Arvore INICIAL");
		System.out.println(tree.info());
		System.out.println("-----------------------------------------------------------");

		assertTrue(tree.equals(elem_clone));

	}

	 */


	@Property (trials=10000)
	public void testOfInsertAllElements(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree) {

		List<Integer> list_elem_original = tree.toList();
		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println();
		System.out.println();

		System.out.println("------------------Inicio do teste InsertAllElemnts -------------------");
		System.out.println(tree.info());
		System.out.println("------------------------------------------------------------");
		System.out.println();


		for(Integer i : tree) {
			elem_clone.insert(i);
		}
		System.out.println("-----------------ARVORE Depois de inserir TODOS ELEMS----------------------");
		System.out.println(elem_clone.info());

		System.out.println("-----------------ARVORE INICIAL----------------------");
		System.out.println(tree.info());

		System.out.println("-----------------------------------------------------------");
		System.out.println();
		assertTrue(tree.equals(elem_clone));

	}
	
	
	
	
	/*
	
	@Property (trials=10000)
	public void testOfInsertAnElementSeveralTimes(@From(ArrayNTreeGenerator.class) ArrayNTree<Integer> tree,
													@InRange(min="1" , max= "100") int indice,
													@InRange(min="20" , max= "100") int nVezes) {
		
		assumeTrue(!tree.isEmpty());
		

		List<Integer> list_elem_original = tree.toList();
		
		while(indice > list_elem_original.size()-1 ) {
			indice = indice%list_elem_original.size();
		}
		
		ArrayNTree<Integer> elem_clone = tree.clone();

		System.out.println();
		System.out.println();

		System.out.println("------------------Inicio do teste InsertAnElementSeveralTimes -------------------");
		
		System.out.println("Indice gerado = " + indice);
		System.out.println(tree.info());
		System.out.println("------------------------------------------------------------");
		System.out.println();


		for(int y = 0; y<nVezes; y++) {
			elem_clone.insert(list_elem_original.get(indice));
		}
		
		System.out.println("-----------------ARVORE Depois de inserir ELEM varias vezes----------------------");
		System.out.println(elem_clone.info());

		System.out.println("-----------------ARVORE INICIAL----------------------");
		System.out.println(tree.info());

		System.out.println("-----------------------------------------------------------");
		System.out.println();
		assertTrue(tree.equals(elem_clone));

	}
	
*/


}
