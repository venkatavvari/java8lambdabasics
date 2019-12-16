package com.company.unit2;

import javax.annotation.processing.ProcessingEnvironment;

public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;

        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }


    interface Process {
        void process(int i);
    }
}
