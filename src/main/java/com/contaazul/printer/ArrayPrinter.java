package com.contaazul.printer;

public class ArrayPrinter {

	public <E> void printArray(E[] inputArray)
	{
		for (E element : inputArray) {
			System.out.printf( "%s ", element );
		}
		System.out.println();
	}

}
