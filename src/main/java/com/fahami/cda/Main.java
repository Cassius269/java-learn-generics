package com.fahami.cda;

import java.lang.classfile.ClassFile.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world!");

        List<Optional<String>> persons = List.of(Optional.of("Jean"), Optional.ofNullable(null));
        Optional<String> person1 = persons.get(0);
        Optional<String> person2 = persons.get(1);
 
        IO.println(persons.getClass().getName());
        // IO.println(persons.get(0));
        persons.stream()
                .forEach(IO::println);
        
        
        // IO.println(person2.get()); // la méthode non recommande car présence de null retourne une exceptoin
        if(person1.isPresent()) IO.println(person1.get());
        if(person2.isPresent()) IO.println(person2.get());


        String outPutPerson1 = person1.orElse(new String("aucune personne"));
        IO.println(outPutPerson1);

        // Déconseillé d'utiliser get() sur une optional sauf s'il y a une vérification préalable
        if(person1.isPresent()) IO.println(person1.get());

        // Il est possible de traitrer une liste de valeurs optional comme un stream
        List<String> personas = persons.stream()
                .filter(p -> p.isPresent())// récupérer les valeurs non nulles 
                .map(p -> p.get())
                .collect(Collectors.toList());

      
    }
}