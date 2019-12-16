package com.company.unit3;

import com.company.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("enkat", "avvari", 38),
                new Person("souj", "kodi", 34),
                new Person("tanmayi", "vvak", 8),
                new Person("chinnu", "kovak", 7)
        );

        System.out.println("using lambda foreach loop");
        people.forEach(System.out::println);
    }
}
