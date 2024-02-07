package com.tnsif.daythirteen;

public class FinallyBlockExOne {
    public static void divide(int a, int b) {
        try {
            System.out.println("-------Within Try Block-----------");
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException caught: " + ae.getMessage());
        } finally {
            System.out.println("Finally block....");
        }
        System.out.println("Statement after finally block");
    }
}

