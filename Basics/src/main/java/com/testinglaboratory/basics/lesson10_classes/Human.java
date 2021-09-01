package com.testinglaboratory.basics.lesson10_classes;

import com.github.javafaker.Faker;

public class Human {

    String Race =  new Faker().demographic().race();
    String Name = new Faker().name().name();
    int height = new Faker().random().nextInt(100, 200);
    double health = (double) new Faker().random().nextInt(0, 100);
    String sex = new Faker().demographic().sex();

    public String getRace() {
        return Race;
    }

    public String getName() {
        return Name;
    }

    public int getHeight() {
        return height;
    }

    public double getHealth() {
        return health;
    }

    public String getSex() {
        return sex;
    }
}
