package com.company.partAbstraction.part1;

public abstract class ChessItem implements Drawable, Element {
    private int x;
    private int y;
    protected int value;

    public ChessItem(){
        System.out.println("ChessItem()");
    }

    public ChessItem(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("ChessItem(int x, int y)");
    }

    public ChessItem(int x, int y, int value){
        this.x = x;
        this.y = y;
        this.value = value;
        System.out.println("ChessItem(int x, int y, int value)");


    }

}
