package com.testinglaboratory.basics.lesson9_loops;

public class ForLoop {

    public static void main(String[] args) {
        System.out.println("count from 0 to ??");
        for (int i = 0; i < 10; i++) {
            System.out.println("count " + i);
        }

        System.out.println("count from 10 to ??");
        for (int i = 10; i > 0; i--) {
            System.out.println("count " + i);
        }

        /**
         *  The bomb system.
         */
        System.out.println("count from 10 to ??");
        for (int i = 10; i != 0; i--) {
            if (i % 2 == 0) {
                System.out.println("Tick");
            }
            if (i % 2 == 1) {
                System.out.println("Tock");
            }
            if (i == 3) {
                System.out.println("it gonna to explode!");
            }

            if (i == 0) {
                System.out.println("Boooom!");
            }
        }


        //todo fix the bomb system, to make it blow!

        //todo write loop counting from 20 to 10 and form -10 to 10;
    }
}
