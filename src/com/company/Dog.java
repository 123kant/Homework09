package com.company;

public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("The dog " + getName() + " says: WooF!");
    }

    void greets(Dog anotherDog) {
        System.out.println("The dog " + this.getName() + " greets " + anotherDog.getName() + " with WooooF!");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog " + getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking with the dog " + getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with the dog " + getName());
    }
}
