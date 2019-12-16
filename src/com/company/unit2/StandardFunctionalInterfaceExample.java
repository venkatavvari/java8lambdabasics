package com.company.unit2;

import com.company.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("enkat","avvari",38),
                new Person("souj","kodi",34),
                new Person("tanmayi", "vvak", 8),
                new Person("chinnu", "kovak", 7)
        );

        //1. sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //2. create a method that prints all the elements in the list
        System.out.println("Printing all persons");
        //printAll(people);
        performConditionally(people, p -> true,p -> System.out.println(p));
        System.out.println("\n");

        //3. create a method that prints all people that have last name beginning with C
        System.out.println("Printing all people with last name beginning with k ");
        performConditionally(people, p -> p.getLastName().startsWith("k"), p -> System.out.println(p));
        System.out.println("\n");

        System.out.println("Printing all people with first name beginning with c ");
        performConditionally(people, p -> p.getFirstName().startsWith("c"), p -> System.out.println(p.getFirstName()) );
    }

    private static void performConditionally(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        for (Person p:people) {
            if(personPredicate.test(p)) {
                personConsumer.accept(p);
            }
        }
    }
}
