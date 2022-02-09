package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat01 = new Cat("Murka");
        Dog dog01 = new Dog("Sharik-1");
        Dog dog02 = new Dog("Sharik-2");
        BigDog bDog01 = new BigDog("Muhtar-1");
        BigDog bDog02 = new BigDog("Muhtar-2");
        Lion lion01 = new Lion("Leo");
        Wolf wolf01 = new Wolf("Gerald");

        cat01.greets();
        cat01.feed();
        cat01.walk();
        cat01.play();
        System.out.println();

        dog01.greets();
        dog01.greets(dog02);
        dog01.greets(bDog01);
        dog01.feed();
        dog01.walk();
        dog01.play();
        System.out.println();

        bDog01.greets();
        bDog01.greets(dog01);
        bDog01.greets(bDog02);
        bDog01.feed();
        bDog01.play();
        bDog01.walk();
        System.out.println();

        lion01.greets();
        lion01.hunting();
        System.out.println();

        wolf01.greets();
        wolf01.hunting();
    }
}
