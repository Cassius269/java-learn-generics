package com.fahami.cda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> countries = new ArrayList<>();
        countries.add("France");
        countries.add("Ghana");
        // countries.add(23);
        countries.stream()
                        .forEach(IO::println);


        // Création personnalisée de généricité
        ImmutableList<String> studentsNames = new ImmutableList<>("Jean", "Pierre", "Dan");
        Predicate<String> isJean = s -> s.equals("Jean");
        
        studentsNames.stream()
                    .filter(isJean) // trier les résultats sortant Jean
                    .forEach(s -> IO.println(s));

        IO.println(StaticGeneric.staticMethodGeneric("Bonjour"));
    }
}