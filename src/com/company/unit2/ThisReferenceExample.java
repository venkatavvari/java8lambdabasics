package com.company.unit2;

public class ThisReferenceExample {
    public static void doProcess(int i, ClosureExample.Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.execute();
    }

    private void execute() {
        doProcess(10, i -> {
            System.out.println("value of is is " + i);
            System.out.println(this);
        });
    }

    @Override
    public String toString() {
        return " this is the ThisReferenceExample class instance";
    }
}
