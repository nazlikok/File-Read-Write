package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        File temp = new File("filename.txt");

        Scanner myFile = new Scanner(temp);
        System.out.println(myFile.nextLine());
        System.out.println(myFile.nextLine());

    }
}
