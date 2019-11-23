package com.company.partAbstraction.part1;

import com.company.partAbstraction.part1.ChessItem;

public class Queen extends ChessItem {

    public Queen() {
        System.out.println("Queen()");
    }

    public Queen(int x, int y) {
        super(x, y);
        System.out.println("Queen(int x, int y)");
    }

    public Queen(int x, int y, int value) {
        super(x, y, value);
        System.out.println("Queen(int x, int y, int value)");
    }


    @Override
    public void draw() {
        System.out.println("draw queen");
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getX() {
        return this.getX();
    }

    @Override
    public int getY() {
        return this.getY();
    }
}

