package com.company;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Files n = new Files();
        n.openFile("filename.txt");
        n.readFile();
        n.closeFile();

        Scanner in = new Scanner(System.in);

       askAndWriteToFile(in,"filename.txt");
    }

    //recursion
    static void askAndWriteToFile(Scanner in, String fileName) {
        System.out.println("enter something: ");
        String input = in.nextLine();
        if(input.equalsIgnoreCase("end")){
            return;
        }
        writeToFile(fileName,input);
        askAndWriteToFile(in, fileName);
    }

    static void writeToFile(String fileName, String input){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append("\n");
            writer.append(input);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



