package com.company.partAbstraction.part2;

public class Lion extends Creature implements Runnable,Swimmable {
    @Override
    public void run() {
        System.out.println("Lion run");
    }

    @Override
    public void swim() {
        System.out.println("Lion swim");
    }
}
