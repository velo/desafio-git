package com.contaazul.printer;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayPrinterTest {

	private static Integer[] intArray;
	private static Double[] doubleArray;
	private static Character[] charArray;

	@BeforeClass
	public static void constraints() throws Exception {
		intArray = new Integer[] { 1, 2, 3, 4, 5 };
		doubleArray = new Double[] { 1.1, 2.2, 3.3, 4.4 };
		charArray = new Character[] { 'H', 'E', 'L', 'L', 'O' };
	}

	private ArrayPrinter printer;

	@Before
	public void setup() {
		this.printer = new ArrayPrinter();
	}

	@Test
	public void intArray() {
		printer.printArray( intArray );
	}

	@Test
	public void doubleArray() {
		printer.printArray( doubleArray );
	}

	@Test
	public void charArray() {
		printer.printArray( charArray );
	}

}
