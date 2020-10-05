package com.company;

import javax.swing.*;
import java.awt.*;

public class Image extends JFrame {
    ImageIcon img = new ImageIcon("C:\\Users\\Asus\\IdeaProjects\\lab_5\\wp2132620-pepe-the-frog-wallpapers.png");
    JLabel jtl1 = new JLabel(img);
    public Image()
    {
        super("Pepe Image");
        setSize(786,1366);
        setLayout(new FlowLayout());
        add(jtl1);
        setVisible(true);
        setResizable(true);
    }

}
