package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Files n = new Files();
        n.openFile();
        n.readFile();
        n.closeFile();
    }

    public static class Files {
        private Scanner myFile;

        public void openFile(){
            try {
                myFile = new Scanner(new File("filename.txt"));
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
}



