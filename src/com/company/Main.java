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
            } catch (FileNotFoundException e) {
                System.out.println("couldn't find the file");
            }
        }

        public void readFile(){
            while(myFile.hasNext()){
                String a= myFile.next();
                String b= myFile.next();
                String c= myFile.next();

                System.out.printf("%s %s %s \n",a,b,c);

            }
        }

        public void closeFile(){
            myFile.close();
        }
    }
}



