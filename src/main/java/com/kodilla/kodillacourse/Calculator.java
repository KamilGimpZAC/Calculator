package com.kodilla.kodillacourse;

public class Calculator {
    private int numA;
    private int numB;

    public Calculator(int numA, int numB){
        this.numA = numA;
        this.numB = numB;
    }

    public int addition(){
        return numA + numB;
    }

    public int subtractionAB(){
        return numA - numB;
    }

    public int subtractionBA() {
        return numB - numA;
    }
}

class MyClass {
    public static void main(String[] args) {
        Calculator test1 = new Calculator(5,6);
        System.out.println(test1.addition());
        System.out.println(test1.subtractionAB());
        System.out.println(test1.subtractionBA());
    }
}