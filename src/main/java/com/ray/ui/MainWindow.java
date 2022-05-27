package com.ray.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow {
    public static void main(String[] args) {
        // Graphical User Interface(GUI)
        // swing, JavaFX(hard)
        // X ==> extension
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setLocation(465,250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Start");
//        匿名類別 Anonymous class
        button.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Game Start!!!");
            }});
        JButton button1 = new JButton("Easy");
        JButton button2 = new JButton("Hard");
        JButton button3 = new JButton("Nightmare");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Easy mode");
            }});
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hard mode");
            }});
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Nightmare mode");
            }});
//        有名類別
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);







    }
}
