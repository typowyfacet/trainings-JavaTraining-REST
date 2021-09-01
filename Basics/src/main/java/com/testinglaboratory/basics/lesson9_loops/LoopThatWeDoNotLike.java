package com.testinglaboratory.basics.lesson9_loops;

import java.util.ArrayList;
import java.util.List;

public class LoopThatWeDoNotLike {
    public static void main(String[] args) {

        int i = 0;
        do {
            i++;
            System.out.println("iteration of do while" + i);
        }
        while (i < 20);


        List<Integer> sampleList = new ArrayList<>();

        do {
            sampleList.add(1);
            System.out.println("adding to lists");
        } while (sampleList.get(0) < 10);

        //todo find a practical use to do while loop

    }
}
