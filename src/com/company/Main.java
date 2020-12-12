package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File temp = new File("filename.txt");
        try {
            Scanner myFile = new Scanner(temp);
            System.out.println(myFile.nextLine());
            System.out.println(myFile.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
