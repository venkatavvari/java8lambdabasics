package com.company.unit1;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("hello world!!"));

        printLamdba(s -> s.hashCode());
    }

    public static void printLamdba(StringLengthLambda stringLengthLambda) {
        System.out.println(stringLengthLambda.getLength("hello world!!!!!!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
