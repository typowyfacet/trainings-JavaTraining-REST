package com.testinglaboratory.basics.lesson4_logic;

public class LogicalOperator {


    public static void main(String[] args) {
        int one = 1;
        int two = 2;

        String four = "four";
        String five = "five";

        System.out.println("Logical Operators < > == !=  <= >=");
        System.out.println("is one is smaller than two? " + (one < two));
        System.out.println("is two is smaller than one? " + (one > two));
        System.out.println("is one is equal than two? " + (one == two));
        System.out.println("is one is different than two? " + (one != two));

        System.out.println(four == five);

        System.out.println(four.equals(five));

        //TODO declare two identical numbers and string and try to compare it
    }
}
