package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTextChanger extends JFrame
{

    //Sozdayem novuyu area s textom (@Text,@rows,@columns)
    //Создём главный каталок возможностей на панельке меню
    JMenu colorChange = new JMenu("Change Color");
    JMenu fontChange = new JMenu("Change Font");
    //Создаём полосочку для Menu
    JMenuBar mainMenuBar = new JMenuBar();

    //Sozdayem knopochki dlya menu
    JMenuItem redColor = new JMenuItem("Red");
    JMenuItem blueColor = new JMenuItem("Blue");
    JMenuItem blackColor = new JMenuItem("Black");

    JMenuItem timesNR = new JMenuItem("Times New Roman");
    JMenuItem mSSansS = new JMenuItem("MS Sans Serif");
    JMenuItem courierNew = new JMenuItem("Courier New");


    public JTextChanger()
    {
        super("Java Text Changer");
        JTextArea jta = new JTextArea("The lots of words",20,10);
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);

        jta.setLineWrap(true);

        mainMenuBar.add(colorChange);
        mainMenuBar.add(fontChange);

        colorChange.add(redColor);
        colorChange.add(blueColor);
        colorChange.add(blackColor);

        fontChange.add(timesNR);
        fontChange.add(mSSansS);
        fontChange.add(courierNew);

        redColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jta.setForeground(Color.red);
            }
        });

        blueColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jta.setForeground(Color.blue);
            }
        });

        blackColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jta.setForeground(Color.black);
            }
        });

        timesNR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jta.setFont(new Font("Times New Roman",Font.BOLD,14));
            }
        });

        mSSansS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jta.setFont(new Font("MS Sans Serif",Font.BOLD,14));
            }
        });

        courierNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jta.setFont(new Font("Courier New",Font.BOLD,14));
            }
        });

        setJMenuBar(mainMenuBar);
        add(jta);



    }



}
