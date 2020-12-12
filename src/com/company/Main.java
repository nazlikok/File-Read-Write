package com.company;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String FILENAME_TXT = "filename.txt";

    public static void main(String[] args) {
        Files n = new Files();
        n.openFile(FILENAME_TXT);
        String[] lines=n.readFile();
        addLineNumbers(FILENAME_TXT,lines);
        n.readFile();
        n.closeFile();

        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("enter something: ");
            String input = in.nextLine();
            if(input.equalsIgnoreCase("end")){
                break;
            }
            writeToFile(FILENAME_TXT,input);
        }
    }

    static void writeToFile(String fileName,String input){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append("\n");
            writer.append(input);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static void addLineNumbers(String fileName, String[] lines){
        for(int i=0; i< lines.length; i++){
            String line= lines[i];
            line = String.format("%03d: ", i)+ line;
            lines[i]= line;
        }

        String text = String.join("\n", lines);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



