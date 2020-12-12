package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    private Scanner myFile;

    public void openFile(String fileName){
        try {
            myFile = new Scanner(new File(fileName));
            //satır satır oku
            myFile.useDelimiter("\n");
        } catch (FileNotFoundException e) {
            System.out.println("couldn't find the file");
        }
    }

    public void readFile(){
        while(myFile.hasNext()){
            String a= myFile.next();
            System.out.println(a);

        }
    }

    public void closeFile(){
        myFile.close();
    }
}