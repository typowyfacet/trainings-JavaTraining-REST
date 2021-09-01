package com.testinglaboratory.basics.lesson10_classes;

import com.github.javafaker.Faker;

import java.util.Random;

public class Woman extends Human {

    int bornChildren = new Faker().random().nextInt(10);
    char breastSize = (char) (new Random().nextInt(26) + 'a');
    int collectedShoes = new Faker().random().nextInt(100);
}
