package com.company.unit3;

import com.company.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("enkat", "avvari", 38),
                new Person("souj", "kodi", 34),
                new Person("tanmayi", "vvak", 8),
                new Person("chinnu", "kovak", 7)
        );

        people.stream()
                .filter(person -> person.getLastName().startsWith("v"))
                .forEach(person -> System.out.println(person.getFirstName()));

        long count = people.parallelStream()
                .filter(person -> person.getLastName().startsWith("v"))
                .count();
        System.out.println(count);

    }
}
