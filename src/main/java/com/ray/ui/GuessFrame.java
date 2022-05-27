package com.ray.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {

    public GuessFrame(){
        super();
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        JLabel jLabel = new JLabel("1~100");
        JButton button =new JButton("GUESS");
        JTextField number = new JTextField(10);

        setSize(650,400);
        setLocation(444,222);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int num = Integer.parseInt(number.getText());
                System.out.println(num);

                if (num>secret){
                        jLabel.setText("Smaller");
                    }else if (num < secret){
                        jLabel.setText("Bigger");
                    }else {
                    System.out.println("You win!!");
                    jLabel.setText("Bingo!!");
                }
                }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(jLabel);


        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setVisible(true);
//        guessFrame.setSize(650,450);
//        guessFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
