package com.fahami.cda;

import java.util.List;

import com.fahami.cda.entity.Person;
import com.fahami.cda.entity.Student;

public class Main {
    public static void main(String[] args)  {
       IO.println("Hello world");

       // Il n'est pas recommandé d'utiliser directement la classe Object (mère de toutes les classes) hormis pour la surcharge des méthodes equals(), toString() et hashCode()
       Object object = new Student();
      ((Person) object).setFirstname("Jean");
       IO.println(object.getClass().getName());

       List<Object> objects = List.of(object);

       String name = ((Person) object).getFirstname();

       IO.println(name);

       object = "hello";

       IO.println(object);
    }
}