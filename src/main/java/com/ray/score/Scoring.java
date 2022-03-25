package com.ray.score;

public class Scoring {
    public static void main(String[] args) {

        Student david = new Student("David",37,75);
        Student lomen = new Student("Lomen",73,83);
        Student steve = new Student("Steve",93,88);
        Student kevin = new Student("Kevin",65,54);
        GraduateStudent jane = new GraduateStudent("Jane",76 ,63,70);
        david.print();
        lomen.print();
        steve.print();
        kevin.print();
        jane.print();
    }
}
