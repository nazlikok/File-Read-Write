package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File temp = new File("filename.txt");
        try {
            Scanner myFile = new Scanner(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
