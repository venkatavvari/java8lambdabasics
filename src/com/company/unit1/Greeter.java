package com.company.unit1;

public class Greeter {
    public void greet(Greeting greeting) {
        //System.out.println("Hello world!!");
        greeting.perform();
    }
    public static void main(String[] args) {
	    Greeter greeter = new Greeter();

	    Greeting greetingImpl = new GreetingImpl();
	    greeter.greet(greetingImpl);

	    Greeting myLambdaFunction = () -> System.out.println("hello from lambda!!!");
	    greeter.greet(myLambdaFunction);

	    Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello from inner class");
            }
        };
	    greeter.greet(innerClassGreeting);

    }
}
