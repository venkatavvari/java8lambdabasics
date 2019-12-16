package com.company.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Unit1ExerciseSolnJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("enkat","avvari",38),
                new Person("souj","kodi",34),
                new Person("tanmayi", "vvak", 8),
                new Person("chinnu", "kovak", 7)
        );

        //1. sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //2. create a method that prints all the elements in the list
        System.out.println("Printing all persons");
        printAll(people);
        System.out.println("\n");

        //3. create a method that prints all people that have last name beginning with C
        System.out.println("Printing all people with last name beginning with k ");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("k");
            }
        });
        System.out.println("\n");

        System.out.println("Printing all people with first name beginning with c ");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("c");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p:people) {
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }


    private static void printAll(List<Person> people) {
        for (Person p:people) {
            System.out.println(p);
        }
    }

    public interface Condition {

        boolean test(Person p);
    }
}
