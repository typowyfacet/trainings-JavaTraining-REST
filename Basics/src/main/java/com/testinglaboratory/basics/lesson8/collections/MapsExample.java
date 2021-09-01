package com.testinglaboratory.basics.lesson8.collections;

import com.testinglaboratory.basics.lesson6_classes_introduction.ClassConventions;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        Map<String, Integer> stringKeyIntValue;
        Map<String, Integer> stringKeyIntValueOf = Map.of("Str", 1);
        Map<String, ClassConventions> myMap = new HashMap<>();

        ClassConventions clasCon = new ClassConventions();
        myMap.put("My convention", clasCon);

        ClassConventions objectClassConventions = myMap.get("My convention");

        myMap.remove("someKey");

        //todo create map with numbers as Keys and YourOwnClass form lesson 6. Discover some useful maps methods

    }


}
