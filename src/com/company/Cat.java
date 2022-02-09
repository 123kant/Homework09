package com.company;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("The cat " + getName() + " says: MEOW");
    }

    @Override
    public void play() {
        System.out.println("Playing with the cat " + getName());
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking with the cat " + getName());
    }
}
