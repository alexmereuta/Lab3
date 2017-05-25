package com.alex.fac;

/**
 * Created by Alexandru on 5/26/2017.
 */
public class Fish implements Pet {


    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("My name is" + name + ". And I love swimming");
    }
}