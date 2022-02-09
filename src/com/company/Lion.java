package com.company;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("The lion " + this.getName() + " says: Roar!");
    }

    @Override
    public void hunting() {
        System.out.println("The lion " + this.getName() + " goes hunting");
    }
}
