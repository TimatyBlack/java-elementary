package com.company.partAbstraction.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    Human human = new Human();
    Duck duck = new Duck();
    Lion lion = new Lion();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (!(s = reader.readLine()).equals("")) {
            final int type = Integer.parseInt(s);
            Creature creature = createCreature(type);
            makeActions(creature);
        }
    }

    private static Creature createCreature(final int type) {
        switch (type) {
            case 1:
                return new Human();
            case 2:
                return new Duck();
            case 3:
                return new Lion();
            default:
                throw new IllegalArgumentException("Unknown creature type");

        }
    }

    private static void callRun(Runnable runnable) {
        runnable.run();
    }

    private static void callSwim(Swimmable swimmable) {
        swimmable.swim();
    }

    private static void callFly(Flyable flyable) {
        flyable.fly();
    }

    private static void makeActions(Creature creature) {
        if (creature instanceof Swimmable) {
            callSwim((Swimmable) creature);
        }
        if (creature instanceof Runnable) {
            callRun((Runnable) creature);
        }
        if (creature instanceof Flyable) {
            callFly((Flyable) creature);
        }
    }
}
