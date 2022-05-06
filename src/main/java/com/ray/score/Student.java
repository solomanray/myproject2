package com.ray.score;

public class Student implements Printable{
    public String name;
    int programming;
    int math;

    public Student(String name, int programming, int math) {
        this.name = name;
        this.programming = programming;
        this.math = math;
    }

    public Student() {}

    @Override
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