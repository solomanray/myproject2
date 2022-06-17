package com.ray.score;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                String[] token = line.split(",");
                String name = token[0];
                int programming = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name,programming,math);
                stu.print();
                line = reader.readLine();

            }
//            int data = fileReader.read();
//            while(data != -1){
//                System.out.print((char) data);
//                data=fileReader.read();
          } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Data Not Found");
        }
    }
    }

