package com.tnsif.daythirteen;

public class NestedTryCatch {

	public static void check() {
		String str = "TNS";
		int slength = str.length();
		System.out.println("String length: " + slength);
		String anotherString = null;
		int y = 6;
		try {
			// Inner try block
			try {

				System.out.println(str.charAt(y)); // Exception occurred.

			} catch (StringIndexOutOfBoundsException ex) {
				System.err.println("index is out of bounds" + ex.getMessage());

			}
			System.out.println("String length: " + anotherString.length());

		} catch (NullPointerException npe) {
			System.err.println("Exception is thrown " + npe.getMessage());
		}
	}
}
