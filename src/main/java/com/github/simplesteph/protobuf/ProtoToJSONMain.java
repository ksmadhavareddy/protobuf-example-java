package com.github.simplesteph.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple;
import jdk.nashorn.internal.parser.JSONParser;

public class ProtoToJSONMain
{

    public static void main(String[] args) throws InvalidProtocolBufferException {

        Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();
        builder.setId(42);
        builder.setFirstName("Madhava");

        System.out.println(builder.toString());

        String jsonString =
                JsonFormat.printer()
                        .includingDefaultValueFields()
                        .print(builder);

        System.out.println(jsonString);
    }

}
