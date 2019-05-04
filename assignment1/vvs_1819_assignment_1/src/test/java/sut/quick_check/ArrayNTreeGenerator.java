package sut.quick_check;

import java.util.ArrayList;
import java.util.List;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import sut.ArrayNTree;

public class ArrayNTreeGenerator extends Generator<ArrayNTree<Integer>> {
	
	private static final int MAX_INT = 100;
	private static final int MAX_CAPACITY = 5;
	private static final int NUM_ELEMENTOS = 50; 
	
	public ArrayNTreeGenerator(Class<ArrayNTree<Integer>> type) {
		super(type);
		
	}

	@Override
	public ArrayNTree<Integer> generate(SourceOfRandomness random, GenerationStatus status) {
		
		int capacity = 1 + random.nextInt(MAX_CAPACITY);
		int num_elementos = random.nextInt(NUM_ELEMENTOS);

			
		ArrayNTree<Integer> tree = new ArrayNTree<Integer>(capacity);
		
		while(num_elementos-- > 0) {
			int elemento = 1 + random.nextInt(MAX_INT);
			tree.insert(elemento);
		}
		
		return tree;
	}
}
