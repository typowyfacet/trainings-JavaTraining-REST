package com.testinglaboratory.basics.lesson6_classes_introduction;

public class ClassWithClassInIt {

    public static void main(String[] args) {
        System.out.println("outer class");

        InnerClass inClass = new InnerClass();

        inClass.doSomething();

        InnerClass.innerSyso();

    }

    private static class InnerClass {

        InnerClass() {
            System.out.println("innerClassConstructor ");
        }

        static void innerSyso() {
            System.out.println("inner syso");
        }

        void doSomething() {
            System.out.println("do something");
        }
    }
}
