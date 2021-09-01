package com.testinglaboratory.basics.lesson5_access;

public class NextAccesLevelCheck {

    static NextAccessLevels nextAccessLevels = new NextAccessLevels();

    static AccessLevels accessLevels = new AccessLevels();

    public static void main(String[] args) {
        example();
    }

    public static void example() {
        System.out.println(nextAccessLevels.nextNumberOne);

        System.out.println(nextAccessLevels.nextNumberThree);

        System.out.println(nextAccessLevels.nextNumberFour);

        System.out.println(nextAccessLevels.nextNumberSix);

        System.out.println(NextAccessLevels.nextNumberFive);


        System.out.println(accessLevels.numberThree);


    }


}
