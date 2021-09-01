package com.testinglaboratory.basics.lesson8.collections;

import java.util.ArrayList;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {
        List<String> listsOfTexts = new ArrayList<String>();

        listsOfTexts.add("xxx");
        System.out.println(listsOfTexts.size());
        System.out.println(listsOfTexts.get(0));

        List<Double> doubles = List.of(1.0, 2.0);

        doubles.remove(1);
        doubles.remove(2.0);

        System.out.println(doubles.get(0));

        doubles.add(5.0);

        //todo create your own list and fill it wit sample data
        //todo OPTIONAL create lists with other list in in it. And Fill it;
    }
}
