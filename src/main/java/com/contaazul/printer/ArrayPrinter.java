package com.contaazul.printer;

public class ArrayPrinter {

	public void printArray(Object[] inputArray)
	{
		for (int i = 0; i < inputArray.length; i++) {
			Object element = inputArray[i];
			System.out.printf( "%s ", new Object[] { element } );
		}
		System.out.println();
	}

}
