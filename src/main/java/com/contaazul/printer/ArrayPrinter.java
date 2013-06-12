package com.contaazul.printer;

public class ArrayPrinter {

	public void printArray(Object[] input)
	{
		for (int i = 0; i < input.length; i++) {
			Object element = input[i];

			System.out.printf( "%s ", new Object[] { element } );
		}
		System.out.println();
	}

}
