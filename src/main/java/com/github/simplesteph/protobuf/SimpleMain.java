package com.github.simplesteph.protobuf;

import example.simple.Simple;
import jdk.nashorn.internal.parser.JSONParser;

public class SimpleMain {
    public static void main(String[] args) {

        System.out.println(" Hello World!");

        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();
        builder.setId(42);
        builder.setFirstName("Madhava");

        System.out.println(builder.toString());

    }
}
