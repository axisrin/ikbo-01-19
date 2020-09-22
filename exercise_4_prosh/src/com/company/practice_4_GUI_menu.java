package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice_4_GUI_menu extends JFrame {
    private int scA = 0;
    private int scB = 0;
    JLabel jl1 = new JLabel("Result: 0 X 0");
    JLabel jl2 = new JLabel("Last Scorer: N/A");
    Label l3 = new Label("Winner: DRAW");
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JButton but3 = new JButton("Who win ?");
    JPanel pnl = new JPanel();
    public practice_4_GUI_menu()
    {
        super("Soccer league");
        setSize(1000,1000);
        setLayout(new BorderLayout());
        add(jl1, BorderLayout.CENTER);
        add(jl2, BorderLayout.NORTH);
        add(l3 , BorderLayout.SOUTH);
        add(but1,BorderLayout.WEST);
        add(but2,BorderLayout.EAST);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jl2.setText("Last Scorer: AC Milan");
                jl1.setText("Result: " + (scA = scA + 1) + " X " + scB);
                if (scA>scB)
                {
                    l3.setText("Winner: AC Milan");
                }
                if (scA==scB)
                {
                    l3.setText("Winner: DRAW");
                }

            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jl2.setText("Last Scorer: Real Madrid");
                jl1.setText("Result: " + scA + " X " + (scB=scB+1));
                if (scA<scB)
                {
                    l3.setText("Winner: Real Madrid");
                }
                if (scA==scB)
                {
                    l3.setText("Winner: DRAW");
                }

            }
        });
    }
}
