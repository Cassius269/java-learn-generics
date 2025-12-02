package com.fahami.cda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Classe générique
public class ImmutableList<T> {
   private List<T> innerList;

   // Constructeur plein
   public ImmutableList(T...elements){ // usage des varargs pour arguments multiiples à l'instanciation
    this.innerList = Arrays.stream(elements)
                        .collect(Collectors.toList()); // transformer les élements renseignés en liste mutable
   }

   // Méthode générique
   public Stream<T> stream(){
        return innerList.stream();
   }
}
