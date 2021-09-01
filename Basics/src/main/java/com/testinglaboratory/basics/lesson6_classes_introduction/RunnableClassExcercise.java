package com.testinglaboratory.basics.lesson6_classes_introduction;

public class RunnableClassExcercise {

    public static void main(String[] args) {

        ClassConventions classObjectDeclaration;

        ClassConventions someClass = new ClassConventions();
        ClassConventions classConventionsPreDef = new ClassConventions("preDef");

        System.out.println(someClass);
        System.out.println(someClass.getField());
        System.out.println(someClass.getNumber());

        System.out.println(classConventionsPreDef);
        System.out.println(classConventionsPreDef.getField());
        System.out.println(classConventionsPreDef.getOtherField());
        System.out.println(classConventionsPreDef.getNumber());


        //TODO create Yours Own Class representing a Toy. (max 4 fields name,color etc.) and implements operations on it;
    }
}
