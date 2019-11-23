package com.company.partAbstraction.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main  (String[] args) throws IOException {
        ChessItem item1 = new Queen(7, 7);
        ChessItem item2 = new King(8, 8, 20);
//    item1.draw();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<ChessItem> chessItemList = new ArrayList<ChessItem>();

        String s;
        while (!(s = reader.readLine()).equals("")) {
            final int chessItemType = Integer.parseInt(s);
            chessItemList.add(createChessItem(chessItemType));
        }
        for (Drawable item : chessItemList) {
            item.draw();
        }

        for (HasValue item : chessItemList) {
            System.out.println(item.getValue());
        }
    }




    public static ChessItem createChessItem(int chessItemType){
        switch(chessItemType){
            case 1:
                return new Queen(1,1,10);
            case 2:
                return new King(1,1,10);
            default:
                throw new IllegalArgumentException("Unlnown chess item type");

        }
    }
}
