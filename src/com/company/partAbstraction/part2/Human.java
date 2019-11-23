package com.company.partAbstraction.part2;

public class Human extends Creature implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void swim() {
        System.out.println("Human swim");
    }
}
