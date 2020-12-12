package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Files n = new Files();
        n.openFile();
        n.readFile();
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

                System.out.printf("%s %s \n",a,b);

            }
        }
    }
}



