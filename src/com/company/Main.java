package com.company;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String FILENAME_TXT = "filename.txt";

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        Files n = new Files();

        while(true){
            System.out.println("Selected File: "+ FILENAME_TXT);

            System.out.println("to open a new file press 1");
            System.out.println("to display the file press 2");
            System.out.println("to add line numbers press 3");
            System.out.println("to remove line numbers press 4");
            System.out.println("to exit press 5");

            String selection = inn.nextLine();
            if(selection.equals("5")){
                break;
            }
            if(selection.equals("1")){
                System.out.println("write a full File path to create: ");
                String filePath = inn.nextLine();
                createFile(filePath);

            }else if(selection.equals("2")){
                n.openFile(FILENAME_TXT);
                String[] lines = n.readFile();
                System.out.println(String.join("\n", lines));
            }else if(selection.equals("3")){
                n.openFile(FILENAME_TXT);
                String[] lines = n.readFile();
                addLineNumbers(FILENAME_TXT,lines);
                System.out.println(String.join("\n", lines));
                n.closeFile();
            }else if(selection.equals("4")){
                n.openFile(FILENAME_TXT);
                String[] lines = n.readFile();
                removeLineNumbers(FILENAME_TXT,lines);
                System.out.println(String.join("\n", lines));
            }
        }


        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("enter something to add to file (or to exit write 'end'): ");
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

    static void removeLineNumbers(String fileName, String[] lines){
        for(int i=0; i< lines.length; i++){
            String line= lines[i];
            if (line.contains(String.format("%03d: ", i))) {
                line = line.replace(String.format("%03d: ", i), "");
                lines[i]= line;
            }
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

    static void createFile(String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("new File created");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



