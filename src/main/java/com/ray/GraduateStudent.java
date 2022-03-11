package com.ray;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name , int programing , int math,int thesis){
        super(name,programing,math);
        this.thesis= thesis;
    }


    public void print() {
        int average = (programming + math+thesis) /3;
        System.out.print(name + "\t" + programming + "\t" + math + "\t" +thesis+"\t"+ average);

        if (average < 70) {
            System.out.println("*");
        }else {
            System.out.println();
        }
    }
}
