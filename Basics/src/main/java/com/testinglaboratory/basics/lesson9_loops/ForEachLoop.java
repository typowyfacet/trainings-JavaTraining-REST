package com.testinglaboratory.basics.lesson9_loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        List<String> personLists = new ArrayList<>();
        personLists.add("Josh");
        personLists.add("Anna");
        personLists.add("Milfred");


        for (String person : personLists) {
            System.out.println(person);
        }
    }

    //todo try to copy to other list only those person who name have 4 letters.
}
