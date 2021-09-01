package com.testinglaboratory.basics.lesson6_classes_introduction;

public class ClassConventions {
    /**
     * fields section
     */
    String field;
    String otherField;
    int numberField = 10;

    /**
     * constructors
     */
    public ClassConventions() {
    }

    private ClassConventions(int numberField) {
        this.numberField = numberField;
    }

    ClassConventions(String argument) {
        otherField = argument;
        numberField = 0;
    }

    /**
     * methods section
     */
    void printSomething() {
        System.out.println("print me");
    }

    String getField() {
        return field;
    }

    void modifyField(String value) {
        field = field + value;
    }

    int getNumber() {
        return numberField;
    }

    void incrementNumber() {
        numberField++;
    }

    String getOtherField() {
        return otherField;
    }

}
