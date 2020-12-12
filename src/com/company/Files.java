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

    public String[] readFile(){
        String allText = "";
        while(myFile.hasNext()){
            String a= myFile.next();
            allText= allText+a+"\n";
        }
        return allText.split("\n"); // split returns array
    }

    public void closeFile(){
        myFile.close();
    }
}