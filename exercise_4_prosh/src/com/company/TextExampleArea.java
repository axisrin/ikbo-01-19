package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextExampleArea extends JFrame {
    JTextArea txtArea = new JTextArea(20,20);
    JPanel panel = new JPanel();
    JScrollPane jScroll = new JScrollPane(txtArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JButton jbta1 = new JButton("Add Some Text");
    public TextExampleArea()
    {
        super("Example");
        setSize(300,300);
        setLayout(new BorderLayout());
        add (txtArea);
        add (jbta1);
        add(panel);
        add(jScroll);
        jbta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String txt = JOptionPane.showInputDialog(null,"Insert Some Text");
                txtArea.append(txt);
            }
        });

    }
}
