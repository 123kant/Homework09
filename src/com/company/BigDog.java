package com.company;

public class BigDog extends Dog implements Pet {

    public BigDog(String name) {
        super(name);
    }

    void greets() {
        System.out.println("The big dog " + this.getName() + " says: WooW");
    }

    void greets(Dog anotherDog) {
        System.out.println("The big dog " + this.getName() + " greets " + anotherDog.getName() + " with WooooW!");
    }

    void greets(BigDog anotherBigDog) {
        System.out.println("The big dog " + this.getName() + " greets " + anotherBigDog.getName() + " with WooooooooW!");
    }
}
