package com.ray.score;

public class ScoringNG {
    public static void main(String[] args) {
        // Students' score
        int programming[] = {37, 73 , 93, 65};
        int math[] = {75, 83 , 88, 54};
        String name[] = {"David", "Lomen", "Steve", "Kevin"};
        for (int i = 0; i <4; i++) {
            System.out.println(name[i] + "\t" + programming[i] + "\t" + math[i] + "\t" + (programming[i]+math[i])/2);
        }
    }
}
