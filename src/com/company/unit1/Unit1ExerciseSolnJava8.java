package com.company.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Unit1ExerciseSolnJava8 {
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
        printConditionally(people, p -> true);
        System.out.println("\n");

        //3. create a method that prints all people that have last name beginning with C
        System.out.println("Printing all people with last name beginning with k ");
        printConditionally(people, p -> p.getLastName().startsWith("k"));
        System.out.println("\n");

        System.out.println("Printing all people with first name beginning with c ");
        printConditionally(people, p -> p.getFirstName().startsWith("c"));
    }

    private static void printConditionally(List<Person> people, Unit1ExerciseSolnJava7.Condition condition) {
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

}
