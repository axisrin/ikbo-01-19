package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExampleMouse extends JFrame {

    JLabel lbl = new JLabel("");
    public ExampleMouse()
    {
        super("Dude Where is your house?!");
        setSize(1000,1000);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent a) {
            lbl.setText("X="+a.getX()+" Y="+a.getY());
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }
}
