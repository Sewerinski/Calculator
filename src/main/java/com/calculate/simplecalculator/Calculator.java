package com.calculate.simplecalculator;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Calculator {

    public void add() {
        int x = 2;
        int y = 1;
        System.out.println(x+y);
    }
    public void subtract() {
        int a = 30;
        int b = 12;
        System.out.print(a-b);
    }


    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.subtract();
    }
}
