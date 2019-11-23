package com.company.partAbstraction.lesson6;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<User> someList = new ArrayList<User>();

        someList.add(new User("Timur", 16));
        someList.add(new User("George", 15));
        someList.add(new User("George1", 15));
        someList.add(new User("George2", 15));
        someList.add(new User("George3", 15));
        someList.add(new User("George4", 15));
        someList.add(new User("George5", 15));
        someList.add(new User("George6", 15));
        someList.add(new User("George7", 15));
        someList.add(new User("George8", 15));

        User[] array = new User[15];

        for (int i = 0; i < someList.size(); i++) {
            array[i] = someList.get(i);
        }

        System.out.println("Print list");
        for (User user : someList) {
            System.out.print(user + " ");
        }
        System.out.println();
        System.out.println("Print Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        someList.add(4, new User("Vasya", 12));
        System.out.println();
        System.out.println("Print list after add by index");
        for (User user : someList) {
            System.out.print(user + " ");
        }

        array[4] = someList.get(4);

        System.out.println();
        System.out.println("Print list after add by index");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}