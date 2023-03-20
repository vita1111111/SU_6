package org.example;

public class Main {
    public static void main(String[] args) {

        ArrSimple test = new ArrSimple();
        test.createArr();
        test.summPositive();
        test.summNegative();
        System.out.println(test.summNegative + "\n" + test.summPositive );

        ArrExtended test1 = new ArrExtended();
        test1.createArr();
        test1.sort();
    }
}