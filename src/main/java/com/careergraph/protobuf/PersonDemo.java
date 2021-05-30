package com.careergraph.protobuf;

import com.careergraph.models.Person;

public class PersonDemo {

    public static void main(String[] args) {
        Person ram = Person.newBuilder()
                .setName("Ram")
                .setAge(40)
                .build();

        Person ram2 = Person.newBuilder()
                .setName("Ram")
                .setAge(40)
                .build();
        System.out.println(ram.toBuilder());
        System.out.println(ram.equals(ram2));

    }
}
