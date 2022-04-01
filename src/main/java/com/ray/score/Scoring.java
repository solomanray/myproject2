package com.ray.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("David",37,75));
        students.add(new Student("Lomen",73,83));
        students.add(new Student("Steve",93,88));
        students.add(new Student("Kevin",65,54));
        students.add(new GraduateStudent("Jane",76 ,63,70));

        for (Student stu : students){
            stu.print();

        }

    }
}
