package com.ray.score;

public class Student {
    String name;
    int programming;
    int math;

    public Student(String name, int programming, int math) {
        this.name = name;
        this.programming = programming;
        this.math = math;
    }

    public Student() {

    }

    public void print() {
        int average = (programming + math) / 2;
        System.out.print(name + "\t" + programming + "\t" + math + "\t" + average);

        if (average < 60) {
            System.out.println("*");
        }else {
            System.out.println();
        }
    }
}