package com.company;

public class Wolf extends Animal implements WildAnimal {
    public Wolf(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("The wolf " + this.getName() + " says: Hawoo!");
    }

    @Override
    public void hunting() {
        System.out.println("The wolf " + this.getName() + " goes hunting");
    }
}
