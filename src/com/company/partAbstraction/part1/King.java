package com.company.partAbstraction.part1;

import com.company.partAbstraction.part1.ChessItem;

public class King extends ChessItem{

    public  King(){
        System.out.println("King()");
    }

    public King(int x, int y){
        super(x,y);
        System.out.println("King(int x, int y");
    }

    public King(int x, int y, int value){
        super(x,y,value);
        System.out.println("King(int x, int y, int value)");
    }


    @Override
    public void draw() {
        System.out.println("draw king");
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
