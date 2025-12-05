package com.fahami.cda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fahami.cda.entity.Person;

// Classe générique
public class ImmutableList<T> {
   private List<Person> innerList;

   // Constructeur plein
   public ImmutableList(Person...elements){ // usage des varargs pour arguments multiiples à l'instanciation
    this.innerList = Arrays.stream(elements)
                        .collect(Collectors.toList()); // transformer les élements renseignés en liste mutable
   }

   // Méthode générique
   public Stream<Person> stream(){
        return innerList.stream();
   }
}
