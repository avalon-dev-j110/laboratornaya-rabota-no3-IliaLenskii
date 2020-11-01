package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;

import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {

    public static void main(String[] args) {
    	int len1 = 20;
    	int len2 = 100;
		int lenFib = 10;

		int[] array = new int[len1];
		int[] array2 = new int[len2];
		int[] arrayFib = new int[lenFib];

		System.out.format("------- Array is %d -------\n", array.length);
		RandomInitializer ri = new RandomInitializer(len1);
		ri.initialize(array);

		for(int i = 0; i < array.length; ++i)
			System.out.format("%d, ", array[i]);

		System.out.println("\nThe sum is "+ ri.getSum());
		System.out.println("\n");

		System.out.format("---- Fibonacci is %d ----\n", arrayFib.length);
		FibonacciInitializer fib = new FibonacciInitializer(lenFib);
		fib.initialize(arrayFib);

		for(int i = 0; i < arrayFib.length; ++i)
			System.out.format("%d, ", arrayFib[i]);

		System.out.println("\n");

		System.out.println("---- The BubbleSort ----");
		RandomInitializer ri2 = new RandomInitializer(-50, len2);
		ri2.initialize(array2);

		BubbleSort b1 = new BubbleSort();
		b1.sort(array2);

		for(int i = 0; i < array2.length; ++i)
			System.out.format("%d, %s", array2[i], (i % 30 == 0 && i > 0 ? '\n' : ""));

		System.out.println("\n");

		System.out.println("---- The SelectionSort ----");
		RandomInitializer ri3 = new RandomInitializer(-50, len2);
		ri3.initialize(array2);

		SelectionSort s1 = new SelectionSort();
		s1.sort(array2);

		for(int i = 0; i < array2.length; ++i)
			System.out.format("%d, %s", array2[i], (i % 30 == 0 && i > 0 ? '\n' : ""));

		System.out.println("\n");

		System.out.println("---- The ShellSort ----");
		RandomInitializer ri4 = new RandomInitializer(-50, len2);
		ri4.initialize(array2);

		ShellSort shellS = new ShellSort();
		shellS.sort(array2);

		for(int i = 0; i < array2.length; ++i)
			System.out.format("%d, %s", array2[i], (i % 30 == 0 && i > 0 ? '\n' : ""));

		System.out.println("\n");
    }
}
