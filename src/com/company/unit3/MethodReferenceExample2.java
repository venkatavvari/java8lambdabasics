package com.company.unit3;

import com.company.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("enkat","avvari",38),
                new Person("souj","kodi",34),
                new Person("tanmayi", "vvak", 8),
                new Person("chinnu", "kovak", 7)
        );

             //2. create a method that prints all the elements in the list
        System.out.println("Printing all persons");
        //printAll(people);
        performConditionally(people, p -> true, System.out::println);

    }

    private static void performConditionally(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        for (Person p:people) {
            if(personPredicate.test(p)) {
                personConsumer.accept(p);
            }
        }
    }
}
