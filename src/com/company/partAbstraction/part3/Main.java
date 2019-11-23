package com.company.partAbstraction.part3;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        try{
            inputStream = new FileInputStream("C:\\text1.txt");
            buffer = new BufferedInputStream(inputStream);
            while(buffer.available()>0){
                char c = (char)buffer.read();
                System.out.println("Был прочитан символ " + c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            inputStream.close();
            buffer.close();
        }
    }
}
