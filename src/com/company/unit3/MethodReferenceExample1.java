package com.company.unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceExample1::printMessage); // equals to () -> printMessage()
        thread.start();
    }

    public static void printMessage() {
        System.out.println("hello");
    }
}
