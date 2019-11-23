package com.company.partAbstraction.lesson6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestConccurent {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<Cat>();

        cats.add(new Cat("Tom1"));
        cats.add(new Cat("Tom2"));
        cats.add(new Cat("Tom3"));

//        for (Cat cat : cats) {
//            System.out.println(cat.getName());
//        }
//        for (Cat cat : cats) {
//            if (cat.getName().equals("Tom2")) {
//                System.out.println("remove");
//                cats.remove(cat);
//                cats.add(new Cat("123"));
//            }
//        }
        System.out.println("_____________");
        Iterator<Cat> iterator = cats.iterator();
        boolean isCatFound = false;
        while (iterator.hasNext()) {
            Cat nextCat = iterator.next();
            if (nextCat.getName().equals("Tom2")) {
                isCatFound = true;
                iterator.remove();
            }
        }
        if (isCatFound) {
            cats.add(new Cat("Tom222"));
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }
}
