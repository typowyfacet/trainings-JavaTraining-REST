package com.testinglaboratory.basics.lesson3_types_conversion;

public class ConversionsAndCasting {


    public static void main(String[] args) {
        int otherNumber = -10;
        double floatingPointNumber = 12.21;
        // conversion

        double castedFromInt = otherNumber;
        System.out.println(castedFromInt);
        //casting

        int fromDouble = (int)floatingPointNumber;
        System.out.println("before casting " +floatingPointNumber + " after casting " +fromDouble);

        int value = 1/4;
        System.out.println(value);

        double preciseValue = 1/4.0;

        System.out.println(preciseValue);

        char someLetter = 'a';
        System.out.println("some letter " +  someLetter );
        System.out.println("some letter converted to asci code " + (int)someLetter );
        System.out.println("some number to letter " + (char)666);

        //TODO try to cast two ints into double and two floats into int
    }
}
