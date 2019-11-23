package com.company.partAbstraction.part2;

public class Duck extends Creature implements Flyable,Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
