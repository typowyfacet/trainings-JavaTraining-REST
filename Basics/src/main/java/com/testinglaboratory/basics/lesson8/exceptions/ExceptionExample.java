package com.testinglaboratory.basics.lesson8.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int number = 10/0;
        } catch (Exception exception){
            System.out.println(exception.getCause());
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }
    }
}
