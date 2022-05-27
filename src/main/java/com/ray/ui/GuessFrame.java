package com.ray.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    public GuessFrame(){
        super();
        setSize(650,400);
        setLocation(444,222);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button =new JButton("Start");
        JLabel jLabel = new JLabel("New Game");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Game Start!");
                jLabel.setText("Good Luck!");
            }
        });

        setLayout(new FlowLayout());
        add(jLabel);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setVisible(true);
//        guessFrame.setSize(650,450);
//        guessFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
