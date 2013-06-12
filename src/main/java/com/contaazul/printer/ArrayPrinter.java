package com.contaazul.printer;

public class ArrayPrinter {

	public <E> void printArray(E[] input)
	{
		for (E element : input) {
			System.out.printf( "%s ", element );
		}
		System.out.println();
	}

}
