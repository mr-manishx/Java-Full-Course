package ai.indxo;

import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("========Serial Stream==========");
		Stream<Integer> of = Stream.of(1, 2, 3, 4);
		of.forEach(i -> System.out.println(i+" :: "+Thread.currentThread()));
		
		System.out.println();
		
		System.out.println("========Parallel Stream========");
		Stream<Integer> of2 = Stream.of(1, 2, 3, 4);
		of2.parallel().forEach(i -> System.out.println(i+" :: "+Thread.currentThread()));

	}

}